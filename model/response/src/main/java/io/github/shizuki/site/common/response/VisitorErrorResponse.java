package io.github.shizuki.site.common.response;

import io.github.shizuki.common.core.error.ErrorCode;
import java.time.Instant;

/**
 * 访客 API 的最小错误响应，不包含受保护资源标识或内部诊断信息。
 */
public record VisitorErrorResponse(
    ErrorCode code,
    String message,
    String requestId,
    Instant timestamp
) {

    public VisitorErrorResponse {
        if (code == null || timestamp == null) {
            throw new IllegalArgumentException("code and timestamp are required");
        }
        message = normalize(message, code.defaultMessage(), 240);
        requestId = normalize(requestId, null, 128);
    }

    public static VisitorErrorResponse of(ErrorCode code, String requestId, Instant timestamp) {
        return new VisitorErrorResponse(code, code.defaultMessage(), requestId, timestamp);
    }

    private static String normalize(String raw, String fallback, int maxLength) {
        if (raw == null || raw.isBlank()) {
            return fallback;
        }
        String normalized = raw.replace('\r', ' ').replace('\n', ' ').trim();
        return normalized.length() <= maxLength ? normalized : normalized.substring(0, maxLength);
    }
}
