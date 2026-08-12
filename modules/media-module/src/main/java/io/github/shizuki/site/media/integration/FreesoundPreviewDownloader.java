package io.github.shizuki.site.media.integration;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.site.media.config.FreesoundProperties;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 下载 Freesound 的 MP3 预览。下载目标、响应类型和体积都在服务端校验，避免 SSRF 和无界下载。
 */
@Component
public class FreesoundPreviewDownloader {

    private static final Set<String> DEFAULT_ALLOWED_HOSTS = Set.of("freesound.org", "cdn.freesound.org");
    private static final Set<String> ALLOWED_CONTENT_TYPES = Set.of("audio/mpeg", "audio/mp3");

    private final FreesoundProperties freesoundProperties;
    private final HttpClient httpClient;

    @Autowired
    public FreesoundPreviewDownloader(FreesoundProperties freesoundProperties) {
        this(
            freesoundProperties,
            HttpClient.newBuilder()
                .connectTimeout(Duration.ofMillis(freesoundProperties.getConnectTimeoutMs()))
                .followRedirects(HttpClient.Redirect.NEVER)
                .build()
        );
    }

    FreesoundPreviewDownloader(FreesoundProperties freesoundProperties, HttpClient httpClient) {
        this.freesoundProperties = freesoundProperties;
        this.httpClient = httpClient;
    }

    /**
     * 下载一个受信任的 MP3 预览。
     *
     * @param previewUrl Freesound API 返回的预览地址
     * @param maxBytes 最大允许字节数
     * @return 已校验的音频内容
     */
    public DownloadedPreview download(String previewUrl, long maxBytes) {
        URI uri = requireAllowedPreviewUri(previewUrl, freesoundProperties.getPreviewHosts());
        long safeMaxBytes = Math.max(1L, maxBytes);
        HttpRequest request = HttpRequest.newBuilder(uri)
            .timeout(Duration.ofMillis(freesoundProperties.getImportReadTimeoutMs()))
            .header("Accept", "audio/mpeg,audio/mp3;q=0.9")
            .GET()
            .build();
        try {
            HttpResponse<InputStream> response = httpClient.send(request, HttpResponse.BodyHandlers.ofInputStream());
            if (response.statusCode() != 200) {
                closeQuietly(response.body());
                throw new BusinessException(ErrorCode.INTERNAL_ERROR, "Freesound preview download failed",
                    Map.of("ambient_error_code", "AMBIENT_PREVIEW_DOWNLOAD_FAILED",
                        "status", response.statusCode()));
            }
            String contentType = normalizeContentType(response.headers().firstValue("Content-Type").orElse(""));
            if (!ALLOWED_CONTENT_TYPES.contains(contentType)) {
                closeQuietly(response.body());
                throw new BusinessException(ErrorCode.BAD_REQUEST, "Freesound preview is not MP3 audio",
                    Map.of("ambient_error_code", "AMBIENT_PREVIEW_TYPE_UNSUPPORTED"));
            }
            long contentLength = response.headers().firstValueAsLong("Content-Length").orElse(-1L);
            try (InputStream inputStream = response.body()) {
                byte[] bytes = readBounded(inputStream, contentLength, safeMaxBytes);
                if (!looksLikeMp3(bytes)) {
                    throw new BusinessException(ErrorCode.BAD_REQUEST, "Freesound preview payload is not MP3 audio",
                        Map.of("ambient_error_code", "AMBIENT_PREVIEW_CONTENT_INVALID"));
                }
                return new DownloadedPreview(bytes, "audio/mpeg");
            }
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
            throw new BusinessException(ErrorCode.INTERNAL_ERROR, "Freesound preview download interrupted",
                Map.of("ambient_error_code", "AMBIENT_PREVIEW_DOWNLOAD_FAILED"));
        } catch (IOException ex) {
            throw new BusinessException(ErrorCode.INTERNAL_ERROR, "Freesound preview download failed",
                Map.of("ambient_error_code", "AMBIENT_PREVIEW_DOWNLOAD_FAILED"));
        }
    }

    static URI requireAllowedPreviewUri(String previewUrl) {
        return requireAllowedPreviewUri(previewUrl, DEFAULT_ALLOWED_HOSTS);
    }

    static URI requireAllowedPreviewUri(String previewUrl, Set<String> allowedHosts) {
        try {
            URI uri = URI.create(previewUrl == null ? "" : previewUrl.trim());
            String host = uri.getHost() == null ? "" : uri.getHost().toLowerCase(Locale.ROOT);
            if (!"https".equalsIgnoreCase(uri.getScheme()) || allowedHosts == null || !allowedHosts.contains(host)
                || uri.getUserInfo() != null || uri.getPort() != -1) {
                throw new BusinessException(ErrorCode.BAD_REQUEST, "Untrusted Freesound preview URL",
                    Map.of("ambient_error_code", "AMBIENT_PREVIEW_URL_UNTRUSTED"));
            }
            return uri;
        } catch (IllegalArgumentException ex) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Invalid Freesound preview URL",
                Map.of("ambient_error_code", "AMBIENT_PREVIEW_URL_UNTRUSTED"));
        }
    }

    static byte[] readBounded(InputStream inputStream, long announcedLength, long maxBytes) throws IOException {
        if (announcedLength > maxBytes) {
            throw tooLarge(maxBytes);
        }
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        byte[] buffer = new byte[8192];
        long total = 0L;
        int read;
        while ((read = inputStream.read(buffer)) != -1) {
            total += read;
            if (total > maxBytes) {
                throw tooLarge(maxBytes);
            }
            output.write(buffer, 0, read);
        }
        return output.toByteArray();
    }

    static boolean looksLikeMp3(byte[] bytes) {
        if (bytes == null || bytes.length < 3) {
            return false;
        }
        if (bytes[0] == 'I' && bytes[1] == 'D' && bytes[2] == '3') {
            return true;
        }
        return (bytes[0] & 0xff) == 0xff && ((bytes[1] & 0xe0) == 0xe0);
    }

    private static BusinessException tooLarge(long maxBytes) {
        return new BusinessException(ErrorCode.BAD_REQUEST, "Freesound preview exceeds import size limit",
            Map.of("ambient_error_code", "AMBIENT_PREVIEW_TOO_LARGE", "max_bytes", maxBytes));
    }

    private static String normalizeContentType(String value) {
        int delimiter = value.indexOf(';');
        return (delimiter >= 0 ? value.substring(0, delimiter) : value).trim().toLowerCase(Locale.ROOT);
    }

    private static void closeQuietly(InputStream inputStream) {
        if (inputStream == null) {
            return;
        }
        try {
            inputStream.close();
        } catch (IOException ignored) {
            // 响应已失败，关闭异常不覆盖主错误。
        }
    }

    public record DownloadedPreview(byte[] bytes, String contentType) {
    }
}
