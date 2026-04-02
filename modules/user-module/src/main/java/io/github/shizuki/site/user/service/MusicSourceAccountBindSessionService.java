package io.github.shizuki.site.user.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.site.user.request.MusicSourceAccountBindSessionCompleteRequest;
import io.github.shizuki.site.user.response.MusicSourceAccountBindSessionCreateResponse;
import io.github.shizuki.site.user.response.MusicSourceAccountBindSessionStatusResponse;
import io.github.shizuki.site.user.response.MusicSourceAccountStatusResponse;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Locale;
import java.util.UUID;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

/**
 * 音乐源账号一键绑定会话服务。
 */
@Component
public class MusicSourceAccountBindSessionService {

    private static final Duration DEFAULT_SESSION_TTL = Duration.ofMinutes(5);
    private static final String STATUS_PENDING = "PENDING";
    private static final String STATUS_COMPLETED = "COMPLETED";
    private static final String STATUS_EXPIRED = "EXPIRED";

    private final StringRedisTemplate redisTemplate;
    private final ObjectMapper objectMapper;
    private final MusicSourceAccountCookieVerifier cookieVerifier;
    private final UserService userService;

    public MusicSourceAccountBindSessionService(StringRedisTemplate redisTemplate,
                                                ObjectMapper objectMapper,
                                                MusicSourceAccountCookieVerifier cookieVerifier,
                                                UserService userService) {
        this.redisTemplate = redisTemplate;
        this.objectMapper = objectMapper;
        this.cookieVerifier = cookieVerifier;
        this.userService = userService;
    }

    public MusicSourceAccountBindSessionCreateResponse createSession(Long userId, String provider) {
        Long checkedUserId = requireValidUserId(userId);
        String normalizedProvider = cookieVerifier.normalizeProvider(provider);
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime expiresAt = now.plus(DEFAULT_SESSION_TTL);
        String sessionId = UUID.randomUUID().toString();
        String bindToken = UUID.randomUUID().toString();
        BindSessionPayload payload = new BindSessionPayload(
            sessionId,
            checkedUserId,
            normalizedProvider,
            bindToken,
            STATUS_PENDING,
            buildProviderLoginUrl(normalizedProvider),
            now,
            expiresAt,
            null,
            "",
            ""
        );
        writeSession(payload, DEFAULT_SESSION_TTL);
        return new MusicSourceAccountBindSessionCreateResponse(
            normalizedProvider,
            sessionId,
            bindToken,
            STATUS_PENDING,
            payload.loginUrl(),
            expiresAt
        );
    }

    public MusicSourceAccountBindSessionStatusResponse getSessionStatus(Long userId, String provider, String sessionId) {
        Long checkedUserId = requireValidUserId(userId);
        String normalizedProvider = cookieVerifier.normalizeProvider(provider);
        String normalizedSessionId = requireSessionId(sessionId);
        BindSessionPayload payload = readSession(normalizedSessionId);
        if (payload == null || !isOwnedBy(payload, checkedUserId, normalizedProvider)) {
            return new MusicSourceAccountBindSessionStatusResponse(
                normalizedProvider,
                normalizedSessionId,
                STATUS_EXPIRED,
                null,
                null,
                "绑定会话不存在或已过期"
            );
        }
        return new MusicSourceAccountBindSessionStatusResponse(
            normalizedProvider,
            normalizedSessionId,
            payload.status(),
            payload.expiresAt(),
            payload.completedAt(),
            payload.failureReason()
        );
    }

    @Transactional(rollbackFor = Exception.class)
    public MusicSourceAccountStatusResponse completeSession(Long userId,
                                                           String provider,
                                                           String sessionId,
                                                           MusicSourceAccountBindSessionCompleteRequest request) {
        Long checkedUserId = requireValidUserId(userId);
        String normalizedProvider = cookieVerifier.normalizeProvider(provider);
        String normalizedSessionId = requireSessionId(sessionId);
        BindSessionPayload payload = readSession(normalizedSessionId);
        if (payload == null || !isOwnedBy(payload, checkedUserId, normalizedProvider)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "绑定会话不存在或已过期");
        }
        if (!STATUS_PENDING.equals(payload.status())) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "绑定会话已完成，请重新发起绑定");
        }
        String bindToken = request == null ? "" : String.valueOf(request.getBindToken()).trim();
        if (!StringUtils.hasText(bindToken) || !bindToken.equals(payload.bindToken())) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "绑定令牌无效");
        }

        String helperVersion = request.getHelperVersion() == null ? "" : request.getHelperVersion().trim();
        String cookieBundle = request.getCookieBundle() == null ? "" : request.getCookieBundle().trim();
        MusicSourceAccountCookieVerifier.VerificationResult verificationResult = cookieVerifier.verify(normalizedProvider, cookieBundle);
        if (!verificationResult.valid()) {
            BindSessionPayload failedPayload = payload.withFailureReason(
                verificationResult.reason(),
                helperVersion
            );
            writeSession(failedPayload, ttlForPayload(failedPayload));
            throw new BusinessException(ErrorCode.BAD_REQUEST, verificationResult.reason());
        }

        MusicSourceAccountStatusResponse savedStatus = userService.upsertMusicSourceAccountCookie(
            checkedUserId,
            normalizedProvider,
            cookieBundle
        );
        BindSessionPayload completedPayload = payload.complete(helperVersion);
        writeSession(completedPayload, ttlForPayload(completedPayload));
        return savedStatus;
    }

    private Long requireValidUserId(Long userId) {
        if (userId == null || userId <= 0) {
            throw new BusinessException(ErrorCode.UNAUTHORIZED, "Login required");
        }
        return userId;
    }

    private String requireSessionId(String sessionId) {
        if (!StringUtils.hasText(sessionId)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "session_id is required");
        }
        return sessionId.trim();
    }

    private boolean isOwnedBy(BindSessionPayload payload, Long userId, String provider) {
        return payload != null
            && userId.equals(payload.userId())
            && provider.equals(payload.provider());
    }

    private String buildProviderLoginUrl(String provider) {
        return switch (provider.toLowerCase(Locale.ROOT)) {
            case "netease" -> "https://music.163.com/";
            case "qqmusic" -> "https://y.qq.com/";
            case "kugou" -> "https://www.kugou.com/";
            default -> throw new BusinessException(ErrorCode.BAD_REQUEST, "Unsupported source provider: " + provider);
        };
    }

    private Duration ttlForPayload(BindSessionPayload payload) {
        LocalDateTime now = LocalDateTime.now();
        if (payload == null || payload.expiresAt() == null || !payload.expiresAt().isAfter(now)) {
            return Duration.ofSeconds(5);
        }
        return Duration.between(now, payload.expiresAt());
    }

    private void writeSession(BindSessionPayload payload, Duration ttl) {
        try {
            redisTemplate.opsForValue().set(buildRedisKey(payload.sessionId()), objectMapper.writeValueAsString(payload), ttl);
        } catch (JsonProcessingException exception) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "绑定会话序列化失败");
        }
    }

    private BindSessionPayload readSession(String sessionId) {
        String raw = redisTemplate.opsForValue().get(buildRedisKey(sessionId));
        if (!StringUtils.hasText(raw)) {
            return null;
        }
        try {
            return objectMapper.readValue(raw, BindSessionPayload.class);
        } catch (JsonProcessingException exception) {
            return null;
        }
    }

    private String buildRedisKey(String sessionId) {
        return "music:source-bind:" + sessionId;
    }

    private record BindSessionPayload(String sessionId,
                                      Long userId,
                                      String provider,
                                      String bindToken,
                                      String status,
                                      String loginUrl,
                                      LocalDateTime createdAt,
                                      LocalDateTime expiresAt,
                                      LocalDateTime completedAt,
                                      String failureReason,
                                      String helperVersion) {

        private BindSessionPayload withFailureReason(String reason, String nextHelperVersion) {
            return new BindSessionPayload(
                sessionId,
                userId,
                provider,
                bindToken,
                STATUS_PENDING,
                loginUrl,
                createdAt,
                expiresAt,
                null,
                StringUtils.hasText(reason) ? reason.trim() : "",
                StringUtils.hasText(nextHelperVersion) ? nextHelperVersion.trim() : ""
            );
        }

        private BindSessionPayload complete(String nextHelperVersion) {
            return new BindSessionPayload(
                sessionId,
                userId,
                provider,
                bindToken,
                STATUS_COMPLETED,
                loginUrl,
                createdAt,
                expiresAt,
                LocalDateTime.now(),
                "",
                StringUtils.hasText(nextHelperVersion) ? nextHelperVersion.trim() : ""
            );
        }
    }
}
