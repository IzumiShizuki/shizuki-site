package io.github.shizuki.site.monolith.ops;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.site.monolith.config.AdminOpsProperties;
import jakarta.annotation.PreDestroy;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.StandardProtocolFamily;
import java.net.UnixDomainSocketAddress;
import java.nio.channels.Channels;
import java.nio.channels.SocketChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
public class DockerEngineTransport {

    private static final byte[] HTTP_HEADER_DELIMITER = "\r\n\r\n".getBytes(StandardCharsets.ISO_8859_1);

    private final AdminOpsProperties properties;
    private final ExecutorService executor = Executors.newCachedThreadPool(runnable -> {
        Thread thread = new Thread(runnable, "docker-engine-transport");
        thread.setDaemon(true);
        return thread;
    });

    public DockerEngineTransport(AdminOpsProperties properties) {
        this.properties = properties;
    }

    public Response get(String pathWithQuery) {
        return execute("GET", pathWithQuery);
    }

    public Response post(String pathWithQuery) {
        return execute("POST", pathWithQuery);
    }

    @PreDestroy
    void destroy() {
        executor.shutdownNow();
    }

    private Response execute(String method, String pathWithQuery) {
        String normalizedMethod = StringUtils.hasText(method) ? method.trim().toUpperCase(Locale.ROOT) : "GET";
        String normalizedPath = normalizePath(pathWithQuery);
        long timeoutMs = Math.max(500L, (long) properties.getConnectTimeoutMs() + properties.getReadTimeoutMs());
        Future<Response> future = executor.submit(() -> executeBlocking(normalizedMethod, normalizedPath));
        try {
            return future.get(timeoutMs, TimeUnit.MILLISECONDS);
        } catch (TimeoutException ex) {
            future.cancel(true);
            throw new BusinessException(
                ErrorCode.INTERNAL_ERROR,
                "Docker socket request timeout",
                Map.of("reason", "Timed out while talking to Docker socket")
            );
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
            throw new BusinessException(ErrorCode.INTERNAL_ERROR, "Docker socket request interrupted");
        } catch (ExecutionException ex) {
            Throwable cause = ex.getCause() == null ? ex : ex.getCause();
            if (cause instanceof BusinessException businessException) {
                throw businessException;
            }
            throw new BusinessException(
                ErrorCode.INTERNAL_ERROR,
                "Docker socket request failed",
                Map.of("reason", sanitizeMessage(cause.getMessage()))
            );
        }
    }

    private Response executeBlocking(String method, String pathWithQuery) throws Exception {
        Path socketPath = Path.of(properties.getDocker().getSocketPath());
        UnixDomainSocketAddress address = UnixDomainSocketAddress.of(socketPath);
        try (SocketChannel channel = SocketChannel.open(StandardProtocolFamily.UNIX)) {
            channel.connect(address);

            try (InputStream inputStream = Channels.newInputStream(channel);
                 OutputStream outputStream = Channels.newOutputStream(channel)) {
                byte[] requestBytes = buildRequest(method, pathWithQuery);
                outputStream.write(requestBytes);
                outputStream.flush();
                channel.shutdownOutput();
                byte[] responseBytes = readAllBytes(inputStream);
                return parseResponse(responseBytes);
            }
        }
    }

    private byte[] buildRequest(String method, String pathWithQuery) {
        String request = method + " " + pathWithQuery + " HTTP/1.1\r\n"
            + "Host: localhost\r\n"
            + "Accept: application/json\r\n"
            + "Connection: close\r\n"
            + "\r\n";
        return request.getBytes(StandardCharsets.ISO_8859_1);
    }

    private byte[] readAllBytes(InputStream inputStream) throws Exception {
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        byte[] chunk = new byte[8192];
        while (true) {
            int read = inputStream.read(chunk);
            if (read < 0) {
                break;
            }
            if (read == 0) {
                continue;
            }
            buffer.write(chunk, 0, read);
        }
        return buffer.toByteArray();
    }

    private Response parseResponse(byte[] rawBytes) {
        int headerEnd = indexOf(rawBytes, HTTP_HEADER_DELIMITER, 0);
        if (headerEnd < 0) {
            throw new BusinessException(ErrorCode.INTERNAL_ERROR, "Docker socket response was malformed");
        }

        String headerText = new String(rawBytes, 0, headerEnd, StandardCharsets.ISO_8859_1);
        String[] headerLines = headerText.split("\r\n");
        if (headerLines.length == 0) {
            throw new BusinessException(ErrorCode.INTERNAL_ERROR, "Docker socket response was empty");
        }

        String statusLine = headerLines[0];
        String[] statusParts = statusLine.split(" ", 3);
        if (statusParts.length < 2) {
            throw new BusinessException(ErrorCode.INTERNAL_ERROR, "Docker socket status line was malformed");
        }

        int statusCode;
        try {
            statusCode = Integer.parseInt(statusParts[1]);
        } catch (NumberFormatException ex) {
            throw new BusinessException(ErrorCode.INTERNAL_ERROR, "Docker socket status code was malformed");
        }

        String reasonPhrase = statusParts.length >= 3 ? statusParts[2].trim() : "";
        Map<String, String> headers = new LinkedHashMap<>();
        for (int index = 1; index < headerLines.length; index++) {
            String line = headerLines[index];
            int separator = line.indexOf(':');
            if (separator <= 0) {
                continue;
            }
            String name = line.substring(0, separator).trim().toLowerCase(Locale.ROOT);
            String value = line.substring(separator + 1).trim();
            if (StringUtils.hasText(name)) {
                headers.put(name, value);
            }
        }

        byte[] bodyBytes = new byte[Math.max(0, rawBytes.length - headerEnd - HTTP_HEADER_DELIMITER.length)];
        if (bodyBytes.length > 0) {
            System.arraycopy(rawBytes, headerEnd + HTTP_HEADER_DELIMITER.length, bodyBytes, 0, bodyBytes.length);
        }

        String transferEncoding = headers.getOrDefault("transfer-encoding", "");
        if (transferEncoding.toLowerCase(Locale.ROOT).contains("chunked")) {
            bodyBytes = decodeChunkedBody(bodyBytes);
        } else {
            int contentLength = parsePositiveInt(headers.get("content-length"));
            if (contentLength >= 0 && bodyBytes.length > contentLength) {
                byte[] truncated = new byte[contentLength];
                System.arraycopy(bodyBytes, 0, truncated, 0, contentLength);
                bodyBytes = truncated;
            }
        }

        String body = new String(bodyBytes, StandardCharsets.UTF_8);
        return new Response(statusCode, reasonPhrase, body, headers);
    }

    private byte[] decodeChunkedBody(byte[] chunkedBytes) {
        ByteArrayOutputStream decoded = new ByteArrayOutputStream();
        int offset = 0;
        while (offset < chunkedBytes.length) {
            int lineEnd = indexOfCrlf(chunkedBytes, offset);
            if (lineEnd < 0) {
                break;
            }
            String sizeLine = new String(chunkedBytes, offset, lineEnd - offset, StandardCharsets.ISO_8859_1).trim();
            int extensionSeparator = sizeLine.indexOf(';');
            if (extensionSeparator >= 0) {
                sizeLine = sizeLine.substring(0, extensionSeparator).trim();
            }
            int chunkSize;
            try {
                chunkSize = Integer.parseInt(sizeLine, 16);
            } catch (NumberFormatException ex) {
                throw new BusinessException(ErrorCode.INTERNAL_ERROR, "Docker socket chunked response was malformed");
            }
            offset = lineEnd + 2;
            if (chunkSize == 0) {
                break;
            }
            if (offset + chunkSize > chunkedBytes.length) {
                throw new BusinessException(ErrorCode.INTERNAL_ERROR, "Docker socket chunk body was truncated");
            }
            decoded.write(chunkedBytes, offset, chunkSize);
            offset += chunkSize;
            if (offset + 1 < chunkedBytes.length && chunkedBytes[offset] == '\r' && chunkedBytes[offset + 1] == '\n') {
                offset += 2;
            }
        }
        return decoded.toByteArray();
    }

    private int indexOf(byte[] source, byte[] target, int startIndex) {
        if (target.length == 0) {
            return startIndex;
        }
        for (int index = Math.max(0, startIndex); index <= source.length - target.length; index++) {
            boolean matched = true;
            for (int offset = 0; offset < target.length; offset++) {
                if (source[index + offset] != target[offset]) {
                    matched = false;
                    break;
                }
            }
            if (matched) {
                return index;
            }
        }
        return -1;
    }

    private int indexOfCrlf(byte[] source, int startIndex) {
        for (int index = Math.max(0, startIndex); index + 1 < source.length; index++) {
            if (source[index] == '\r' && source[index + 1] == '\n') {
                return index;
            }
        }
        return -1;
    }

    private int parsePositiveInt(String raw) {
        if (!StringUtils.hasText(raw)) {
            return -1;
        }
        try {
            return Math.max(-1, Integer.parseInt(raw.trim()));
        } catch (NumberFormatException ex) {
            return -1;
        }
    }

    private String normalizePath(String raw) {
        String value = StringUtils.hasText(raw) ? raw.trim() : "/";
        return value.startsWith("/") ? value : "/" + value;
    }

    private String sanitizeMessage(String raw) {
        String text = StringUtils.hasText(raw) ? raw.trim() : "unknown_error";
        text = text.replace('\n', ' ').replace('\r', ' ');
        if (text.length() > 240) {
            return text.substring(0, 240) + "...";
        }
        return text;
    }

    public record Response(int statusCode, String reasonPhrase, String body, Map<String, String> headers) {
    }
}
