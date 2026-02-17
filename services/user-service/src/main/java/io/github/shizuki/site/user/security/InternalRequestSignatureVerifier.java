package io.github.shizuki.site.user.security;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.site.user.config.InternalAuthProperties;
import jakarta.servlet.http.HttpServletRequest;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.Instant;
import java.util.HexFormat;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

/**
 * 内部请求签名验证器。
 */
@Component
public class InternalRequestSignatureVerifier {

    private final InternalAuthProperties internalAuthProperties;
    private final StringRedisTemplate stringRedisTemplate;

    public InternalRequestSignatureVerifier(InternalAuthProperties internalAuthProperties,
                                            StringRedisTemplate stringRedisTemplate) {
        this.internalAuthProperties = internalAuthProperties;
        this.stringRedisTemplate = stringRedisTemplate;
    }

    /**
     * 校验内部请求签名和重放。
     */
    public void verify(HttpServletRequest request) {
        String service = header(request, "X-Internal-Service");
        String timestamp = header(request, "X-Internal-Timestamp");
        String nonce = header(request, "X-Internal-Nonce");
        String signature = header(request, "X-Internal-Signature");

        long ts = parseTimestamp(timestamp);
        long now = Instant.now().getEpochSecond();
        if (Math.abs(now - ts) > internalAuthProperties.getClockSkewSeconds()) {
            throw new BusinessException(ErrorCode.FORBIDDEN, "Internal signature timestamp expired");
        }

        String path = request.getRequestURI();
        String query = request.getQueryString() == null ? "" : request.getQueryString();
        String expected = sign(request.getMethod(), path, query, timestamp, nonce);
        if (!secureEquals(expected, signature)) {
            throw new BusinessException(ErrorCode.FORBIDDEN, "Internal signature mismatch");
        }

        String replayKey = "internal:nonce:" + service + ":" + nonce;
        Boolean accepted = stringRedisTemplate.opsForValue().setIfAbsent(
            replayKey,
            String.valueOf(ts),
            java.time.Duration.ofSeconds(internalAuthProperties.getNonceTtlSeconds())
        );
        if (!Boolean.TRUE.equals(accepted)) {
            throw new BusinessException(ErrorCode.FORBIDDEN, "Internal signature replay detected");
        }
    }

    private String header(HttpServletRequest request, String name) {
        String value = request.getHeader(name);
        if (!StringUtils.hasText(value)) {
            throw new BusinessException(ErrorCode.FORBIDDEN, "Missing internal auth header: " + name);
        }
        return value.trim();
    }

    private long parseTimestamp(String timestamp) {
        try {
            return Long.parseLong(timestamp);
        } catch (Exception ex) {
            throw new BusinessException(ErrorCode.FORBIDDEN, "Invalid internal timestamp");
        }
    }

    private String sign(String method, String path, String query, String timestamp, String nonce) {
        String canonical = (method == null ? "" : method.trim().toUpperCase())
            + "\n" + (path == null ? "" : path)
            + "\n" + (query == null ? "" : query)
            + "\n" + (timestamp == null ? "" : timestamp)
            + "\n" + (nonce == null ? "" : nonce);
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(new SecretKeySpec(internalAuthProperties.getSharedSecret().getBytes(StandardCharsets.UTF_8), "HmacSHA256"));
            return HexFormat.of().formatHex(mac.doFinal(canonical.getBytes(StandardCharsets.UTF_8)));
        } catch (Exception ex) {
            throw new BusinessException(ErrorCode.FORBIDDEN, "Internal signature verification failed");
        }
    }

    private boolean secureEquals(String left, String right) {
        if (left == null || right == null) {
            return false;
        }
        return MessageDigest.isEqual(left.getBytes(StandardCharsets.UTF_8), right.getBytes(StandardCharsets.UTF_8));
    }
}
