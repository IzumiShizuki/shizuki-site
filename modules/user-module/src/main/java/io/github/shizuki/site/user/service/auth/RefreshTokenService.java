package io.github.shizuki.site.user.service.auth;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.site.user.config.AuthProperties;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.Duration;
import java.util.Base64;
import java.security.SecureRandom;
import java.util.Set;
import java.util.UUID;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
public class RefreshTokenService {

    private static final SecureRandom SECURE_RANDOM = new SecureRandom();

    private final StringRedisTemplate redisTemplate;
    private final ObjectMapper objectMapper;
    private final AuthProperties authProperties;

    public RefreshTokenService(StringRedisTemplate redisTemplate,
                               ObjectMapper objectMapper,
                               AuthProperties authProperties) {
        this.redisTemplate = redisTemplate;
        this.objectMapper = objectMapper;
        this.authProperties = authProperties;
    }

    public IssueResult issue(Long userId) {
        if (userId == null || userId <= 0) {
            throw new BusinessException(ErrorCode.UNAUTHORIZED, "Invalid user for refresh token issue");
        }
        String jti = UUID.randomUUID().toString().replace("-", "");
        String randomPart = randomTokenPart();
        String rawToken = jti + "." + randomPart;
        RefreshTokenPayload payload = new RefreshTokenPayload(userId, sha256(rawToken));
        Duration ttl = refreshTtl();
        redisTemplate.opsForValue().set(refreshKey(jti), toJson(payload), ttl);
        redisTemplate.opsForSet().add(userRefreshSetKey(userId), jti);
        redisTemplate.expire(userRefreshSetKey(userId), ttl);
        return new IssueResult(rawToken, authProperties.getJwt().getRefreshTtlSeconds(), jti, userId);
    }

    public Long resolveUserId(String rawToken) {
        StoredToken stored = parseAndValidate(rawToken);
        return stored.payload.userId();
    }

    public IssueResult rotate(String rawToken) {
        StoredToken stored = parseAndValidate(rawToken);
        revokeByJti(stored.payload.userId(), stored.jti);
        return issue(stored.payload.userId());
    }

    public void revoke(String rawToken) {
        if (!StringUtils.hasText(rawToken)) {
            return;
        }
        StoredToken stored = parseAndValidate(rawToken);
        revokeByJti(stored.payload.userId(), stored.jti);
    }

    public void revokeAll(Long userId) {
        if (userId == null || userId <= 0) {
            return;
        }
        Set<String> jtIs = redisTemplate.opsForSet().members(userRefreshSetKey(userId));
        if (jtIs != null) {
            for (String jti : jtIs) {
                redisTemplate.delete(refreshKey(jti));
            }
        }
        redisTemplate.delete(userRefreshSetKey(userId));
    }

    private StoredToken parseAndValidate(String rawToken) {
        String jti = parseJti(rawToken);
        RefreshTokenPayload payload = fromJson(redisTemplate.opsForValue().get(refreshKey(jti)));
        if (payload == null) {
            throw new BusinessException(ErrorCode.UNAUTHORIZED, "Refresh token expired");
        }
        if (!payload.tokenHash().equals(sha256(rawToken))) {
            throw new BusinessException(ErrorCode.UNAUTHORIZED, "Refresh token invalid");
        }
        return new StoredToken(jti, payload);
    }

    private void revokeByJti(Long userId, String jti) {
        redisTemplate.delete(refreshKey(jti));
        redisTemplate.opsForSet().remove(userRefreshSetKey(userId), jti);
    }

    private String parseJti(String rawToken) {
        if (!StringUtils.hasText(rawToken) || !rawToken.contains(".")) {
            throw new BusinessException(ErrorCode.UNAUTHORIZED, "Refresh token invalid");
        }
        String jti = rawToken.substring(0, rawToken.indexOf('.'));
        if (!StringUtils.hasText(jti)) {
            throw new BusinessException(ErrorCode.UNAUTHORIZED, "Refresh token invalid");
        }
        return jti;
    }

    private String refreshKey(String jti) {
        return "auth:refresh:" + jti;
    }

    private String userRefreshSetKey(Long userId) {
        return "auth:refresh:user:" + userId;
    }

    private Duration refreshTtl() {
        return Duration.ofSeconds(authProperties.getJwt().getRefreshTtlSeconds());
    }

    private String randomTokenPart() {
        byte[] bytes = new byte[48];
        SECURE_RANDOM.nextBytes(bytes);
        return Base64.getUrlEncoder().withoutPadding().encodeToString(bytes);
    }

    private String sha256(String value) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] bytes = digest.digest(value.getBytes(StandardCharsets.UTF_8));
            return Base64.getUrlEncoder().withoutPadding().encodeToString(bytes);
        } catch (NoSuchAlgorithmException ex) {
            throw new IllegalStateException("SHA-256 not supported", ex);
        }
    }

    private String toJson(Object value) {
        try {
            return objectMapper.writeValueAsString(value);
        } catch (JsonProcessingException ex) {
            throw new IllegalStateException("Refresh token serialization failed", ex);
        }
    }

    private RefreshTokenPayload fromJson(String value) {
        if (!StringUtils.hasText(value)) {
            return null;
        }
        try {
            return objectMapper.readValue(value, RefreshTokenPayload.class);
        } catch (JsonProcessingException ex) {
            return null;
        }
    }

    public record IssueResult(String token, Long expiresInSec, String jti, Long userId) {
    }

    private record StoredToken(String jti, RefreshTokenPayload payload) {
    }

    private record RefreshTokenPayload(Long userId, String tokenHash) {
    }
}
