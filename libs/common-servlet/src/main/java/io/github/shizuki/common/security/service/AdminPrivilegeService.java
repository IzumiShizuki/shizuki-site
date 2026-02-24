package io.github.shizuki.common.security.service;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.common.security.config.AdminPrivilegeProperties;
import io.github.shizuki.common.security.model.LoginUser;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.Duration;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

/**
 * 管理员二次验证状态服务。
 */
@Component
public class AdminPrivilegeService {

    private static final String REDIS_PREFIX = "admin:privilege:unlock:";

    private final StringRedisTemplate redisTemplate;
    private final AdminPrivilegeProperties properties;

    public AdminPrivilegeService(StringRedisTemplate redisTemplate,
                                 AdminPrivilegeProperties properties) {
        this.redisTemplate = redisTemplate;
        this.properties = properties;
    }

    /**
     * 校验权限码并写入解锁状态。
     */
    public void verifyAndUnlock(LoginUser loginUser, String authorizationHeader, String rawCode) {
        requireAdmin(loginUser);
        verifyCode(rawCode);

        redisTemplate.opsForValue().set(
            unlockKey(loginUser, authorizationHeader),
            "1",
            Duration.ofSeconds(properties.getUnlockTtlSeconds())
        );
    }

    /**
     * 仅校验管理员权限码，不写入解锁态。
     */
    public void verifyCode(String rawCode) {
        if (!StringUtils.hasText(rawCode)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Privilege code is required");
        }
        String input = rawCode.trim();
        if (!matchesConfiguredCode(input)) {
            throw new BusinessException(ErrorCode.FORBIDDEN, "Invalid admin privilege code");
        }
    }

    /**
     * 判断当前登录态是否已解锁管理员敏感操作。
     */
    public boolean isUnlocked(LoginUser loginUser, String authorizationHeader) {
        if (loginUser == null || loginUser.getUserId() == null || !hasAdminGroup(loginUser)) {
            return false;
        }
        return Boolean.TRUE.equals(redisTemplate.hasKey(unlockKey(loginUser, authorizationHeader)));
    }

    /**
     * 返回解锁有效期（秒）。
     */
    public long getUnlockTtlSeconds() {
        return properties.getUnlockTtlSeconds();
    }

    private boolean matchesConfiguredCode(String input) {
        if (StringUtils.hasText(properties.getCodeHash())) {
            try {
                return BCrypt.checkpw(input, properties.getCodeHash());
            } catch (IllegalArgumentException ex) {
                throw new BusinessException(ErrorCode.BAD_REQUEST, "Invalid admin privilege code hash configuration");
            }
        }
        if (StringUtils.hasText(properties.getCodePlain())) {
            return properties.getCodePlain().equals(input);
        }
        throw new BusinessException(ErrorCode.BAD_REQUEST, "Admin privilege code is not configured");
    }

    private void requireAdmin(LoginUser loginUser) {
        if (loginUser == null || loginUser.getUserId() == null) {
            throw new BusinessException(ErrorCode.UNAUTHORIZED, "Login required");
        }
        if (!hasAdminGroup(loginUser)) {
            throw new BusinessException(ErrorCode.FORBIDDEN, "Group required: ADMIN");
        }
    }

    private boolean hasAdminGroup(LoginUser loginUser) {
        return loginUser.getGroups().stream().anyMatch(group -> "ADMIN".equalsIgnoreCase(group));
    }

    private String unlockKey(LoginUser loginUser, String authorizationHeader) {
        String fingerprint = buildFingerprint(loginUser.getUserId(), authorizationHeader);
        return REDIS_PREFIX + loginUser.getUserId() + ":" + fingerprint;
    }

    private String buildFingerprint(Long userId, String authorizationHeader) {
        String bearerToken = extractBearerToken(authorizationHeader);
        if (StringUtils.hasText(bearerToken)) {
            return "tk:" + sha256Hex(bearerToken);
        }
        return "uid:" + userId;
    }

    private String extractBearerToken(String authorizationHeader) {
        if (!StringUtils.hasText(authorizationHeader)) {
            return "";
        }
        String raw = authorizationHeader.trim();
        if (raw.length() <= 7) {
            return "";
        }
        if (!raw.regionMatches(true, 0, "Bearer ", 0, 7)) {
            return "";
        }
        return raw.substring(7).trim();
    }

    private String sha256Hex(String value) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] bytes = digest.digest(value.getBytes(StandardCharsets.UTF_8));
            StringBuilder builder = new StringBuilder(bytes.length * 2);
            for (byte b : bytes) {
                builder.append(Character.forDigit((b >> 4) & 0xF, 16));
                builder.append(Character.forDigit(b & 0xF, 16));
            }
            return builder.toString();
        } catch (NoSuchAlgorithmException ex) {
            throw new IllegalStateException("SHA-256 not supported", ex);
        }
    }
}
