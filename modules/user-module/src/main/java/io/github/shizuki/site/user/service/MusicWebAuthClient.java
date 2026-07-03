package io.github.shizuki.site.user.service;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.site.user.config.MusicWebAuthProperties;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.LinkedHashMap;
import java.util.Map;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.client.RestClient;

@Component
public class MusicWebAuthClient {

    private final MusicWebAuthProperties properties;
    private final RestClient restClient;

    public MusicWebAuthClient(MusicWebAuthProperties properties,
                              RestClient.Builder restClientBuilder) {
        this.properties = properties;
        SimpleClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory();
        requestFactory.setConnectTimeout(properties.getConnectTimeoutMs());
        requestFactory.setReadTimeout(properties.getReadTimeoutMs());
        this.restClient = restClientBuilder
            .baseUrl(properties.getBaseUrl())
            .requestFactory(requestFactory)
            .build();
    }

    public BindSessionResult createBindSession(String provider, String sessionId, LocalDateTime expiresAt) {
        Map<String, Object> body = new LinkedHashMap<>();
        body.put("sessionId", sessionId);
        body.put("expiresAt", toOffsetString(expiresAt));
        Map<?, ?> payload = request("POST", provider, sessionId, body);
        return toBindSessionResult(provider, sessionId, payload);
    }

    public BindSessionResult getBindSessionStatus(String provider, String sessionId) {
        Map<?, ?> payload = request("GET", provider, sessionId, null);
        return toBindSessionResult(provider, sessionId, payload);
    }

    private Map<?, ?> request(String method, String provider, String sessionId, Map<String, Object> body) {
        try {
            if ("POST".equalsIgnoreCase(method)) {
                return restClient.post()
                    .uri("/internal/music-auth/providers/{provider}/bind-sessions", provider)
                    .headers(headers -> applyHeaders(headers))
                    .body(body == null ? Map.of() : body)
                    .retrieve()
                    .body(Map.class);
            }
            return restClient.get()
                .uri("/internal/music-auth/providers/{provider}/bind-sessions/{sessionId}", provider, sessionId)
                .headers(headers -> applyHeaders(headers))
                .retrieve()
                .body(Map.class);
        } catch (BusinessException exception) {
            throw exception;
        } catch (Exception exception) {
            throw unavailable();
        }
    }

    private void applyHeaders(org.springframework.http.HttpHeaders headers) {
        if (StringUtils.hasText(properties.getApiToken())) {
            headers.setBearerAuth(properties.getApiToken());
        }
    }

    private BindSessionResult toBindSessionResult(String provider, String sessionId, Map<?, ?> payload) {
        return new BindSessionResult(
            String.valueOf(provider == null ? "" : provider).trim().toLowerCase(),
            readText(payload, "sessionId", sessionId),
            readText(payload, "status", "PENDING"),
            readText(payload, "loginUrl", ""),
            readText(payload, "qrUrl", ""),
            readText(payload, "qrImage", ""),
            readText(payload, "qrStatus", ""),
            readText(payload, "qrMessage", ""),
            readInt(payload, "pollIntervalMs", properties.getPollIntervalMs()),
            readDateTime(payload, "expiresAt"),
            readDateTime(payload, "completedAt"),
            readText(payload, "failureReason", ""),
            readText(payload, "cookieBundle", "")
        );
    }

    private String readText(Map<?, ?> payload, String key, String fallback) {
        if (payload == null || !payload.containsKey(key)) {
            return fallback;
        }
        String normalized = String.valueOf(payload.get(key) == null ? fallback : payload.get(key)).trim();
        return StringUtils.hasText(normalized) ? normalized : fallback;
    }

    private int readInt(Map<?, ?> payload, String key, int fallback) {
        if (payload == null || !payload.containsKey(key) || payload.get(key) == null) {
            return fallback;
        }
        Object raw = payload.get(key);
        if (raw instanceof Number number) {
            return number.intValue();
        }
        try {
            return Integer.parseInt(String.valueOf(raw).trim());
        } catch (Exception exception) {
            return fallback;
        }
    }

    private LocalDateTime readDateTime(Map<?, ?> payload, String key) {
        String raw = readText(payload, key, "");
        if (!StringUtils.hasText(raw)) {
            return null;
        }
        try {
            return OffsetDateTime.parse(raw).toLocalDateTime();
        } catch (Exception ignore) {
            try {
                return LocalDateTime.parse(raw);
            } catch (Exception exception) {
                return null;
            }
        }
    }

    private String toOffsetString(LocalDateTime value) {
        if (value == null) {
            return "";
        }
        return value.atOffset(ZoneOffset.ofHours(8)).toString();
    }

    private BusinessException unavailable() {
        return new BusinessException(
            ErrorCode.INTERNAL_ERROR,
            "Music web auth service is unavailable",
            Map.of("reason_code", "MUSIC_WEB_AUTH_SERVICE_UNAVAILABLE")
        );
    }

    public record BindSessionResult(
        String provider,
        String sessionId,
        String status,
        String loginUrl,
        String qrUrl,
        String qrImage,
        String qrStatus,
        String qrMessage,
        Integer pollIntervalMs,
        LocalDateTime expiresAt,
        LocalDateTime completedAt,
        String failureReason,
        String cookieBundle
    ) {
    }
}
