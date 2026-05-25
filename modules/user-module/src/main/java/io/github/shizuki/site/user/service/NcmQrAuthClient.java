package io.github.shizuki.site.user.service;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.site.user.config.MusicNcmProperties;
import java.util.LinkedHashMap;
import java.util.Map;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.client.RestClient;

@Component
public class NcmQrAuthClient {

    private final RestClient restClient;

    public NcmQrAuthClient(RestClient.Builder restClientBuilder, MusicNcmProperties musicNcmProperties) {
        SimpleClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory();
        requestFactory.setConnectTimeout(musicNcmProperties.getConnectTimeoutMs());
        requestFactory.setReadTimeout(musicNcmProperties.getReadTimeoutMs());
        this.restClient = restClientBuilder
            .baseUrl(musicNcmProperties.getBaseUrl())
            .requestFactory(requestFactory)
            .build();
    }

    public QrCreateResult createQrSession() {
        Map<String, Object> keyPayload = requestMap("/login/qr/key");
        int keyCode = readInt(keyPayload.get("code"), 0);
        Map<String, Object> keyData = asMap(keyPayload.get("data"));
        String qrKey = readString(keyData.get("unikey"), "");
        if (!StringUtils.hasText(qrKey)) {
            qrKey = readString(keyData.get("key"), "");
        }
        if (keyCode != 200 || !StringUtils.hasText(qrKey)) {
            throw unavailable();
        }

        Map<String, Object> qrPayload = requestMap("/login/qr/create?qrimg=true&key=" + qrKey);
        int qrCode = readInt(qrPayload.get("code"), 0);
        Map<String, Object> qrData = asMap(qrPayload.get("data"));
        String qrImage = readString(qrData.get("qrimg"), "");
        String qrUrl = readString(qrData.get("qrurl"), "");
        if (qrCode != 200 || !StringUtils.hasText(qrImage)) {
            throw unavailable();
        }
        return new QrCreateResult(qrKey, qrUrl, qrImage);
    }

    public QrCheckResult checkQrStatus(String qrKey) {
        if (!StringUtils.hasText(qrKey)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "qr_key is required");
        }
        String path = "/login/qr/check?key=" + qrKey + "&timestamp=" + System.currentTimeMillis();
        Map<String, Object> payload = requestMap(path);
        int code = readInt(payload.get("code"), 0);
        String message = readString(payload.get("message"), readString(payload.get("msg"), ""));
        String cookie = readString(payload.get("cookie"), "");
        if (!StringUtils.hasText(cookie)) {
            cookie = readString(asMap(payload.get("data")).get("cookie"), "");
        }
        return new QrCheckResult(code, message, cookie);
    }

    @SuppressWarnings("unchecked")
    private Map<String, Object> requestMap(String path) {
        try {
            Map<?, ?> response = restClient.get()
                .uri(path)
                .retrieve()
                .body(Map.class);
            if (response == null || response.isEmpty()) {
                return Map.of();
            }
            Map<String, Object> result = new LinkedHashMap<>();
            for (Map.Entry<?, ?> entry : response.entrySet()) {
                result.put(String.valueOf(entry.getKey()), entry.getValue());
            }
            return result;
        } catch (BusinessException exception) {
            throw exception;
        } catch (Exception exception) {
            throw unavailable();
        }
    }

    private BusinessException unavailable() {
        return new BusinessException(
            ErrorCode.INTERNAL_ERROR,
            "NCM QR service is unavailable",
            Map.of("reason_code", "MUSIC_NCM_SERVICE_UNAVAILABLE")
        );
    }

    private Map<String, Object> asMap(Object raw) {
        if (!(raw instanceof Map<?, ?> source)) {
            return Map.of();
        }
        Map<String, Object> result = new LinkedHashMap<>();
        for (Map.Entry<?, ?> entry : source.entrySet()) {
            result.put(String.valueOf(entry.getKey()), entry.getValue());
        }
        return result;
    }

    private String readString(Object value, String fallback) {
        if (value == null) {
            return fallback;
        }
        String normalized = String.valueOf(value).trim();
        return StringUtils.hasText(normalized) ? normalized : fallback;
    }

    private int readInt(Object value, int fallback) {
        if (value == null) {
            return fallback;
        }
        if (value instanceof Number number) {
            return number.intValue();
        }
        try {
            return Integer.parseInt(String.valueOf(value).trim());
        } catch (Exception exception) {
            return fallback;
        }
    }

    public record QrCreateResult(String qrKey, String qrUrl, String qrImage) {
    }

    public record QrCheckResult(int code, String message, String cookie) {
    }
}
