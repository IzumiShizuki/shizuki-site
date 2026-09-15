package io.github.shizuki.site.media.service.playback;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.site.media.config.MusicPlaybackGatewayProperties;
import io.github.shizuki.site.media.response.MusicTrackResponse;
import java.io.IOException;
import java.io.InputStream;
import java.net.IDN;
import java.net.InetAddress;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * 把第三方音频地址转换为站内短时 URL，并按需流式代理上游媒体。
 */
@Service
public class MusicPlaybackGatewayService {

    private static final String STREAM_PATH_PREFIX = "/api/v1/music/tracks/stream/";
    private static final Pattern SINGLE_RANGE = Pattern.compile(
        "bytes=(?:(\\d+)-(\\d*)|-(\\d+))",
        Pattern.CASE_INSENSITIVE
    );
    private static final Set<Integer> REDIRECT_STATUS = Set.of(301, 302, 303, 307, 308);
    private static final Set<String> BLOCKED_HOSTS = Set.of(
        "localhost",
        "localhost.localdomain",
        "metadata.google.internal"
    );

    private final MusicPlaybackCapabilityCodec capabilityCodec;
    private final MusicPlaybackGatewayProperties properties;
    private final HttpClient httpClient;
    private final HostAddressResolver hostAddressResolver;

    @Autowired
    public MusicPlaybackGatewayService(MusicPlaybackCapabilityCodec capabilityCodec,
                                       MusicPlaybackGatewayProperties properties) {
        this(
            capabilityCodec,
            properties,
            HttpClient.newBuilder()
                .connectTimeout(Duration.ofMillis(properties.getConnectTimeoutMs()))
                .followRedirects(HttpClient.Redirect.NEVER)
                .build(),
            InetAddress::getAllByName
        );
    }

    MusicPlaybackGatewayService(MusicPlaybackCapabilityCodec capabilityCodec,
                                 MusicPlaybackGatewayProperties properties,
                                 HttpClient httpClient,
                                 HostAddressResolver hostAddressResolver) {
        this.capabilityCodec = capabilityCodec;
        this.properties = properties;
        this.httpClient = httpClient;
        this.hostAddressResolver = hostAddressResolver;
    }

    public MusicTrackResponse rewriteDeliveryUrl(MusicTrackResponse track) {
        if (!properties.isEnabled() || track == null || !StringUtils.hasText(track.audio())
            || track.audio().startsWith(STREAM_PATH_PREFIX)) {
            return track;
        }
        URI source = validateSourceUri(track.audio());
        String deliveryUrl = STREAM_PATH_PREFIX + capabilityCodec.issue(source.toASCIIString());
        Map<String, Object> metadata = new LinkedHashMap<>();
        if (track.metadata() != null) {
            metadata.putAll(track.metadata());
        }
        metadata.put("audio_delivery", "site_gateway");
        metadata.put("audio_range_supported", true);
        return new MusicTrackResponse(
            track.trackId(),
            track.provider(),
            track.title(),
            track.artist(),
            track.cover(),
            deliveryUrl,
            track.lyric(),
            track.sort(),
            track.enabled(),
            track.lyricText(),
            Collections.unmodifiableMap(metadata)
        );
    }

    public MusicPlaybackStream open(String capability, String rangeHeader) {
        MusicPlaybackCapabilityCodec.Claims claims = capabilityCodec.verify(capability)
            .orElseThrow(() -> new BusinessException(ErrorCode.NOT_FOUND, "Music stream is unavailable"));
        String range = normalizeRange(rangeHeader);
        URI source = validateSourceUri(claims.sourceUrl());
        int redirectCount = 0;

        while (true) {
            HttpResponse<InputStream> response = send(source, range);
            int statusCode = response.statusCode();
            if (REDIRECT_STATUS.contains(statusCode)) {
                closeQuietly(response.body());
                if (redirectCount >= properties.getMaxRedirects()) {
                    throw upstreamUnavailable();
                }
                String location = response.headers().firstValue(HttpHeaders.LOCATION).orElse("");
                if (!StringUtils.hasText(location)) {
                    throw upstreamUnavailable();
                }
                source = validateSourceUri(source.resolve(location).toString());
                redirectCount += 1;
                continue;
            }
            if (statusCode != 200 && statusCode != 206) {
                closeQuietly(response.body());
                throw upstreamUnavailable();
            }
            String contentType = normalizeContentType(
                response.headers().firstValue(HttpHeaders.CONTENT_TYPE).orElse("")
            );
            return new MusicPlaybackStream(
                response.body(),
                statusCode,
                contentType,
                parseContentLength(response.headers().firstValue(HttpHeaders.CONTENT_LENGTH).orElse("")),
                normalizeResponseHeader(response.headers().firstValue(HttpHeaders.CONTENT_RANGE).orElse("")),
                normalizeAcceptRanges(response.headers().firstValue(HttpHeaders.ACCEPT_RANGES).orElse(""))
            );
        }
    }

    private HttpResponse<InputStream> send(URI source, String range) {
        HttpRequest.Builder request = HttpRequest.newBuilder(source)
            .GET()
            .header(HttpHeaders.ACCEPT, "audio/*,application/octet-stream;q=0.9,*/*;q=0.1")
            .header(HttpHeaders.ACCEPT_ENCODING, "identity")
            .header(HttpHeaders.USER_AGENT, "ShizukiMusicGateway/1.0");
        if (StringUtils.hasText(range)) {
            request.header(HttpHeaders.RANGE, range);
        }
        try {
            return httpClient.send(request.build(), HttpResponse.BodyHandlers.ofInputStream());
        } catch (InterruptedException exception) {
            Thread.currentThread().interrupt();
            throw upstreamUnavailable();
        } catch (IOException | RuntimeException exception) {
            throw upstreamUnavailable();
        }
    }

    private String normalizeRange(String rawRange) {
        if (!StringUtils.hasText(rawRange)) {
            return "";
        }
        String range = rawRange.trim();
        Matcher matcher = SINGLE_RANGE.matcher(range);
        if (range.length() > 128 || !matcher.matches()) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Unsupported music stream range");
        }
        try {
            if (matcher.group(3) != null) {
                long suffixLength = Long.parseLong(matcher.group(3));
                if (suffixLength <= 0L) {
                    throw unsupportedRange();
                }
                return "bytes=-" + suffixLength;
            }
            long start = Long.parseLong(matcher.group(1));
            String rawEnd = matcher.group(2);
            if (!StringUtils.hasText(rawEnd)) {
                return "bytes=" + start + "-";
            }
            long end = Long.parseLong(rawEnd);
            if (end < start) {
                throw unsupportedRange();
            }
            return "bytes=" + start + "-" + end;
        } catch (NumberFormatException exception) {
            throw unsupportedRange();
        }
    }

    private URI validateSourceUri(String rawUrl) {
        if (!StringUtils.hasText(rawUrl) || rawUrl.length() > 4_096
            || rawUrl.indexOf('\r') >= 0 || rawUrl.indexOf('\n') >= 0) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "Music stream is unavailable");
        }
        final URI uri;
        try {
            uri = URI.create(rawUrl);
        } catch (RuntimeException exception) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "Music stream is unavailable");
        }
        String scheme = uri.getScheme() == null ? "" : uri.getScheme().toLowerCase(Locale.ROOT);
        String host = uri.getHost();
        int port = uri.getPort();
        if (!("http".equals(scheme) || "https".equals(scheme)) || !StringUtils.hasText(host)
            || uri.getUserInfo() != null || uri.getFragment() != null
            || (port != -1 && port != 80 && port != 443)) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "Music stream is unavailable");
        }
        String normalizedHost = normalizeHost(host);
        if (BLOCKED_HOSTS.contains(normalizedHost) || normalizedHost.endsWith(".localhost")
            || normalizedHost.endsWith(".local") || normalizedHost.endsWith(".internal")
            || normalizedHost.endsWith(".home.arpa") || resolvesToBlockedAddress(normalizedHost)) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "Music stream is unavailable");
        }
        return uri;
    }

    private String normalizeHost(String host) {
        String normalized = host.trim().toLowerCase(Locale.ROOT);
        if (normalized.startsWith("[") && normalized.endsWith("]")) {
            normalized = normalized.substring(1, normalized.length() - 1);
        }
        if (normalized.indexOf(':') >= 0) {
            return normalized;
        }
        try {
            return IDN.toASCII(normalized);
        } catch (RuntimeException exception) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "Music stream is unavailable");
        }
    }

    private boolean resolvesToBlockedAddress(String host) {
        try {
            InetAddress[] addresses = isIpLiteral(host)
                ? new InetAddress[]{InetAddress.getByName(host)}
                : hostAddressResolver.resolve(host);
            if (addresses == null || addresses.length == 0) {
                return true;
            }
            for (InetAddress address : addresses) {
                if (isBlockedAddress(address)) {
                    return true;
                }
            }
            return false;
        } catch (IOException exception) {
            return true;
        }
    }

    private boolean isIpLiteral(String host) {
        return host.indexOf(':') >= 0 || host.matches("[0-9.]+");
    }

    private boolean isBlockedAddress(InetAddress address) {
        if (address == null || address.isAnyLocalAddress() || address.isLoopbackAddress()
            || address.isLinkLocalAddress() || address.isSiteLocalAddress()
            || address.isMulticastAddress()) {
            return true;
        }
        byte[] bytes = address.getAddress();
        return bytes.length == 16 && (bytes[0] & 0xfe) == 0xfc;
    }

    private String normalizeContentType(String rawContentType) {
        String value = normalizeResponseHeader(rawContentType);
        if (!StringUtils.hasText(value)) {
            return MediaType.APPLICATION_OCTET_STREAM_VALUE;
        }
        try {
            return MediaType.parseMediaType(value).toString();
        } catch (RuntimeException exception) {
            return MediaType.APPLICATION_OCTET_STREAM_VALUE;
        }
    }

    private String normalizeAcceptRanges(String rawAcceptRanges) {
        String value = normalizeResponseHeader(rawAcceptRanges).toLowerCase(Locale.ROOT);
        return "none".equals(value) ? "none" : "bytes";
    }

    private String normalizeResponseHeader(String value) {
        if (!StringUtils.hasText(value) || value.indexOf('\r') >= 0 || value.indexOf('\n') >= 0) {
            return "";
        }
        return value.trim();
    }

    private long parseContentLength(String rawLength) {
        try {
            return StringUtils.hasText(rawLength) ? Long.parseLong(rawLength) : -1L;
        } catch (NumberFormatException exception) {
            return -1L;
        }
    }

    private void closeQuietly(InputStream inputStream) {
        if (inputStream == null) {
            return;
        }
        try {
            inputStream.close();
        } catch (IOException ignored) {
            // The upstream response is being discarded.
        }
    }

    private BusinessException upstreamUnavailable() {
        return new BusinessException(ErrorCode.UPSTREAM_UNAVAILABLE, "Music stream upstream is unavailable");
    }

    private BusinessException unsupportedRange() {
        return new BusinessException(ErrorCode.BAD_REQUEST, "Unsupported music stream range");
    }

    @FunctionalInterface
    interface HostAddressResolver {
        InetAddress[] resolve(String host) throws IOException;
    }
}
