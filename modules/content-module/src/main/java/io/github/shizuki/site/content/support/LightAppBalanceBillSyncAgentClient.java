package io.github.shizuki.site.content.support;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.StreamUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.RestClientResponseException;

@Component
public class LightAppBalanceBillSyncAgentClient {

    private final LightAppBalanceBillSyncProperties properties;
    private final RestClient restClient;
    private final ObjectMapper objectMapper;

    public LightAppBalanceBillSyncAgentClient(LightAppBalanceBillSyncProperties properties,
                                              RestClient.Builder restClientBuilder,
                                              ObjectMapper objectMapper) {
        this.properties = properties;
        this.objectMapper = objectMapper;
        SimpleClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory();
        requestFactory.setConnectTimeout((int) properties.getConnectTimeoutMs());
        requestFactory.setReadTimeout((int) properties.getReadTimeoutMs());
        this.restClient = restClientBuilder
            .baseUrl(trimTrailingSlash(properties.getApiBaseUrl()))
            .requestFactory(requestFactory)
            .build();
    }

    public BindSessionResult createBindSession(String provider, String sessionId, LocalDateTime expiresAt) {
        ensureConfigured();
        Map<String, Object> body = new LinkedHashMap<>();
        body.put("sessionId", sessionId);
        body.put("expiresAt", toOffsetString(expiresAt));
        Map<?, ?> payload = readJsonResponse(restClient.post()
            .uri("/internal/balance-sync/providers/{provider}/bind-sessions", provider)
            .headers(headers -> applyHeaders(headers))
            .body(body));
        return toBindSessionResult(provider, sessionId, payload);
    }

    public BindSessionResult getBindSessionStatus(String provider, String sessionId) {
        ensureConfigured();
        Map<?, ?> payload = readJsonResponse(restClient.get()
            .uri("/internal/balance-sync/providers/{provider}/bind-sessions/{sessionId}", provider, sessionId)
            .headers(headers -> applyHeaders(headers)));
        return toBindSessionResult(provider, sessionId, payload);
    }

    public SyncResult sync(String provider,
                           String storageState,
                           LocalDateTime fromAt,
                           LocalDateTime toAt,
                           String timezone,
                           String rawArchiveRoot) {
        ensureConfigured();
        Map<String, Object> body = new LinkedHashMap<>();
        body.put("storageState", storageState);
        body.put("fromAt", toOffsetString(fromAt));
        body.put("toAt", toOffsetString(toAt));
        body.put("timezone", timezone);
        body.put("rawArchiveRoot", rawArchiveRoot);
        Map<?, ?> payload = readJsonResponse(restClient.post()
            .uri("/internal/balance-sync/providers/{provider}/sync-jobs", provider)
            .headers(headers -> applyHeaders(headers))
            .body(body));
        return toSyncResult(payload);
    }

    private void applyHeaders(org.springframework.http.HttpHeaders headers) {
        if (StringUtils.hasText(properties.getApiToken())) {
            headers.setBearerAuth(properties.getApiToken().trim());
        }
    }

    private void ensureConfigured() {
        if (properties.isConfigured()) {
            return;
        }
        throw new BusinessException(ErrorCode.BAD_REQUEST, "Bill sync agent is not configured");
    }

    private Map<?, ?> readJsonResponse(RestClient.RequestHeadersSpec<?> requestSpec) {
        RawResponse rawResponse = requestSpec.exchange((request, response) -> {
            try (InputStream inputStream = response.getBody()) {
                byte[] bodyBytes = inputStream == null ? new byte[0] : StreamUtils.copyToByteArray(inputStream);
                return new RawResponse(
                    response.getStatusCode().value(),
                    org.springframework.http.HttpHeaders.readOnlyHttpHeaders(response.getHeaders()),
                    bodyBytes
                );
            } catch (IOException exception) {
                throw new BusinessException(
                    ErrorCode.BAD_REQUEST,
                    "Failed to read bill sync agent response: " + normalizeErrorMessage(exception)
                );
            }
        });
        byte[] responseBytes = rawResponse.body();
        if (responseBytes == null || responseBytes.length == 0) {
            if (rawResponse.statusCode() >= 400) {
                throw toRemoteResponseException(rawResponse, "Bill sync agent returned an empty error response");
            }
            return Map.of();
        }
        String responseText = new String(responseBytes, StandardCharsets.UTF_8).trim();
        if (!StringUtils.hasText(responseText)) {
            if (rawResponse.statusCode() >= 400) {
                throw toRemoteResponseException(rawResponse, "Bill sync agent returned a blank error response");
            }
            return Map.of();
        }
        Map<String, Object> payload;
        try {
            payload = objectMapper.readValue(responseText, new TypeReference<Map<String, Object>>() {
            });
        } catch (Exception exception) {
            throw new BusinessException(
                ErrorCode.BAD_REQUEST,
                "Bill sync agent returned invalid JSON"
                    + formatContentTypeHint(rawResponse)
                    + ": "
                    + abbreviateResponse(responseText)
            );
        }
        if (rawResponse.statusCode() >= 400) {
            String message = readText(payload, "message", "");
            throw toRemoteResponseException(
                rawResponse,
                StringUtils.hasText(message)
                    ? message
                    : "Bill sync agent request failed with status " + rawResponse.statusCode()
            );
        }
        return payload;
    }

    private BindSessionResult toBindSessionResult(String provider, String sessionId, Map<?, ?> payload) {
        return new BindSessionResult(
            normalizeProvider(provider),
            readText(payload, "sessionId", sessionId),
            readText(payload, "status", "PENDING"),
            readText(payload, "loginUrl", ""),
            readText(payload, "qrCodePayload", ""),
            readText(payload, "qrCodeImageDataUrl", ""),
            readDateTime(payload, "expiresAt"),
            readDateTime(payload, "completedAt"),
            readText(payload, "failureReason", ""),
            readText(payload, "storageState", ""),
            readBoolean(payload, "reauthRequired")
        );
    }

    @SuppressWarnings("unchecked")
    private SyncResult toSyncResult(Map<?, ?> payload) {
        List<ImportedTransaction> transactions = new ArrayList<>();
        Object records = payload == null ? null : payload.get("transactions");
        if (records instanceof List<?> list) {
            for (Object item : list) {
                if (!(item instanceof Map<?, ?> map)) {
                    continue;
                }
                transactions.add(new ImportedTransaction(
                    readText(map, "externalId", ""),
                    readDateTime(map, "occurredAt"),
                    readText(map, "direction", "EXPENSE"),
                    readAmount(map, "amount"),
                    readText(map, "currencyCode", "CNY"),
                    readText(map, "counterparty", ""),
                    readText(map, "categoryHint", ""),
                    readText(map, "note", ""),
                    readText(map, "rawPayload", ""),
                    readText(map, "digest", "")
                ));
            }
        }
        return new SyncResult(
            readText(payload, "status", "SUCCESS"),
            readText(payload, "rawFilePath", ""),
            transactions,
            readBoolean(payload, "reauthRequired"),
            readText(payload, "failureReason", "")
        );
    }

    private String readText(Map<?, ?> payload, String key, String fallback) {
        if (payload == null || !payload.containsKey(key)) {
            return fallback;
        }
        String normalized = String.valueOf(payload.get(key) == null ? fallback : payload.get(key)).trim();
        return StringUtils.hasText(normalized) ? normalized : fallback;
    }

    private LocalDateTime readDateTime(Map<?, ?> payload, String key) {
        String raw = readText(payload, key, "");
        if (!StringUtils.hasText(raw)) {
            return null;
        }
        try {
            return OffsetDateTime.parse(raw)
                .atZoneSameInstant(resolveZoneId())
                .toLocalDateTime();
        } catch (Exception ignore) {
            try {
                return LocalDateTime.parse(raw);
            } catch (Exception exception) {
                return null;
            }
        }
    }

    private boolean readBoolean(Map<?, ?> payload, String key) {
        if (payload == null || !payload.containsKey(key)) {
            return false;
        }
        Object raw = payload.get(key);
        if (raw instanceof Boolean value) {
            return value;
        }
        return "true".equalsIgnoreCase(String.valueOf(raw).trim());
    }

    private BigDecimal readAmount(Map<?, ?> payload, String key) {
        if (payload == null || !payload.containsKey(key) || payload.get(key) == null) {
            return BigDecimal.ZERO;
        }
        try {
            return new BigDecimal(String.valueOf(payload.get(key)).trim());
        } catch (Exception exception) {
            return BigDecimal.ZERO;
        }
    }

    private String toOffsetString(LocalDateTime value) {
        if (value == null) {
            return "";
        }
        return value.atZone(resolveZoneId()).toOffsetDateTime().toString();
    }

    private ZoneId resolveZoneId() {
        String timezone = String.valueOf(properties.getTimezone() == null ? "" : properties.getTimezone()).trim();
        if (!StringUtils.hasText(timezone)) {
            return ZoneId.systemDefault();
        }
        try {
            return ZoneId.of(timezone);
        } catch (Exception exception) {
            return ZoneId.systemDefault();
        }
    }

    private String normalizeProvider(String provider) {
        return String.valueOf(provider == null ? "" : provider).trim().toLowerCase(Locale.ROOT);
    }

    private String trimTrailingSlash(String raw) {
        String normalized = String.valueOf(raw == null ? "" : raw).trim();
        while (normalized.endsWith("/")) {
            normalized = normalized.substring(0, normalized.length() - 1);
        }
        return normalized;
    }

    private String abbreviateResponse(String raw) {
        String normalized = String.valueOf(raw == null ? "" : raw).replaceAll("\\s+", " ").trim();
        if (normalized.length() <= 160) {
            return normalized;
        }
        return normalized.substring(0, 157) + "...";
    }

    private String formatContentTypeHint(RawResponse rawResponse) {
        if (rawResponse == null || rawResponse.headers() == null || rawResponse.headers().getContentType() == null) {
            return "";
        }
        return " (content-type=" + rawResponse.headers().getContentType() + ")";
    }

    private RestClientResponseException toRemoteResponseException(RawResponse rawResponse, String message) {
        return new RestClientResponseException(
            StringUtils.hasText(message) ? message : "Bill sync agent request failed",
            rawResponse == null ? 500 : rawResponse.statusCode(),
            "",
            rawResponse == null ? null : rawResponse.headers(),
            rawResponse == null ? new byte[0] : rawResponse.body(),
            StandardCharsets.UTF_8
        );
    }

    private String normalizeErrorMessage(Exception exception) {
        String message = exception == null ? "" : String.valueOf(exception.getMessage()).trim();
        return StringUtils.hasText(message) ? message : "Unexpected bill sync agent IO error";
    }

    private record RawResponse(
        int statusCode,
        org.springframework.http.HttpHeaders headers,
        byte[] body
    ) {
    }

    public record BindSessionResult(
        String provider,
        String sessionId,
        String status,
        String loginUrl,
        String qrCodePayload,
        String qrCodeImageDataUrl,
        LocalDateTime expiresAt,
        LocalDateTime completedAt,
        String failureReason,
        String storageState,
        boolean reauthRequired
    ) {
    }

    public record ImportedTransaction(
        String externalId,
        LocalDateTime occurredAt,
        String direction,
        BigDecimal amount,
        String currencyCode,
        String counterparty,
        String categoryHint,
        String note,
        String rawPayload,
        String digest
    ) {
    }

    public record SyncResult(
        String status,
        String rawFilePath,
        List<ImportedTransaction> transactions,
        boolean reauthRequired,
        String failureReason
    ) {
    }
}
