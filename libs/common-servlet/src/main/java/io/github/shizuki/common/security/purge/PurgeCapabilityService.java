package io.github.shizuki.common.security.purge;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.common.security.context.LoginUserContext;
import io.github.shizuki.common.security.model.LoginUser;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.util.Base64;
import java.util.Locale;
import java.util.regex.Pattern;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

/**
 * Issues opaque purge capabilities and atomically consumes them through Redis.
 * Redis failure is fail-closed because permanent cleanup must never degrade to a stateless bypass.
 */
@Service
public class PurgeCapabilityService {

    private static final String KEY_PREFIX = "site:admin:purge-capability:";
    private static final Duration DEFAULT_TTL = Duration.ofMinutes(5);
    private static final Pattern TARGET_TYPE = Pattern.compile("[A-Z_]{1,32}");
    private static final int TOKEN_BYTES = 32;

    private final StringRedisTemplate redisTemplate;
    private final SecureRandom secureRandom;
    private final Clock clock;
    private final Duration ttl;

    @Autowired
    public PurgeCapabilityService(StringRedisTemplate redisTemplate) {
        this(redisTemplate, new SecureRandom(), Clock.systemUTC(), DEFAULT_TTL);
    }

    PurgeCapabilityService(
        StringRedisTemplate redisTemplate,
        SecureRandom secureRandom,
        Clock clock,
        Duration ttl
    ) {
        this.redisTemplate = redisTemplate;
        this.secureRandom = secureRandom;
        this.clock = clock;
        this.ttl = ttl;
    }

    public PurgeCapabilityGrant issue(String targetType, long targetId, int version) {
        LoginUser administrator = requireAdministrator();
        String normalizedType = normalizeTarget(targetType, targetId, version);
        Instant expiresAt = clock.instant().plus(ttl);
        for (int attempt = 0; attempt < 3; attempt++) {
            String capability = randomCapability();
            String value = encode(administrator.getUserId(), normalizedType, targetId, version, expiresAt);
            try {
                Boolean stored = redisTemplate.opsForValue().setIfAbsent(key(capability), value, ttl);
                if (Boolean.TRUE.equals(stored)) {
                    return new PurgeCapabilityGrant(capability, expiresAt);
                }
            } catch (RuntimeException exception) {
                throw invalidCapability("Purge confirmation storage is unavailable");
            }
        }
        throw invalidCapability("Purge confirmation could not be issued");
    }

    public void consume(String capability, String targetType, long targetId, int version) {
        LoginUser administrator = requireAdministrator();
        String normalizedType = normalizeTarget(targetType, targetId, version);
        if (capability == null || capability.isBlank() || capability.length() > 256) {
            throw invalidCapability("Purge confirmation capability is invalid");
        }
        String encoded;
        try {
            encoded = redisTemplate.opsForValue().getAndDelete(key(capability));
        } catch (RuntimeException exception) {
            throw invalidCapability("Purge confirmation storage is unavailable");
        }
        Claims claims = decode(encoded);
        if (claims == null
            || claims.administratorId() != administrator.getUserId()
            || !claims.targetType().equals(normalizedType)
            || claims.targetId() != targetId
            || claims.version() != version
            || !claims.expiresAt().isAfter(clock.instant())) {
            throw invalidCapability("Purge confirmation capability is expired, replayed, or scoped to another target");
        }
    }

    private LoginUser requireAdministrator() {
        LoginUser user = LoginUserContext.get().orElse(null);
        boolean admin = user != null
            && user.getUserId() != null
            && user.getUserId() > 0
            && user.getGroups().stream().anyMatch("ADMIN"::equalsIgnoreCase);
        if (!admin) {
            throw new BusinessException(ErrorCode.FORBIDDEN, "Administrator identity is required for permanent cleanup");
        }
        return user;
    }

    private String normalizeTarget(String targetType, long targetId, int version) {
        String normalized = String.valueOf(targetType).trim().toUpperCase(Locale.ROOT);
        if (!TARGET_TYPE.matcher(normalized).matches() || targetId <= 0 || version < 0) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Purge confirmation target is invalid");
        }
        return normalized;
    }

    private String randomCapability() {
        byte[] bytes = new byte[TOKEN_BYTES];
        secureRandom.nextBytes(bytes);
        return Base64.getUrlEncoder().withoutPadding().encodeToString(bytes);
    }

    private String encode(long administratorId, String targetType, long targetId, int version, Instant expiresAt) {
        return administratorId + "|" + targetType + "|" + targetId + "|" + version + "|" + expiresAt.toEpochMilli();
    }

    private Claims decode(String value) {
        if (value == null || value.isBlank()) return null;
        String[] parts = value.split("\\|", -1);
        if (parts.length != 5) return null;
        try {
            return new Claims(
                Long.parseLong(parts[0]),
                parts[1],
                Long.parseLong(parts[2]),
                Integer.parseInt(parts[3]),
                Instant.ofEpochMilli(Long.parseLong(parts[4]))
            );
        } catch (RuntimeException exception) {
            return null;
        }
    }

    private String key(String capability) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA-256")
                .digest(capability.getBytes(StandardCharsets.UTF_8));
            return KEY_PREFIX + java.util.HexFormat.of().formatHex(digest);
        } catch (NoSuchAlgorithmException exception) {
            throw new IllegalStateException("SHA-256 is unavailable", exception);
        }
    }

    private BusinessException invalidCapability(String message) {
        return new BusinessException(ErrorCode.CONFLICT, message);
    }

    private record Claims(
        long administratorId,
        String targetType,
        long targetId,
        int version,
        Instant expiresAt
    ) {
    }
}
