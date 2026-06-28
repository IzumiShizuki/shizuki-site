package io.github.shizuki.site.user.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.site.user.config.MusicNcmProperties;
import io.github.shizuki.site.user.config.MusicSourceAccountNeteaseProperties;
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

@Component
public class MusicSourceAccountBindSessionService {

    private static final Duration DEFAULT_SESSION_TTL = Duration.ofMinutes(5);
    private static final int DEFAULT_POLL_INTERVAL_MS = 1800;
    private static final String STATUS_PENDING = "PENDING";
    private static final String STATUS_COMPLETED = "COMPLETED";
    private static final String STATUS_EXPIRED = "EXPIRED";
    private static final String STATUS_FAILED = "FAILED";
    private static final String LOGIN_MODE_HELPER = "browser_cookie";
    private static final String LOGIN_MODE_QR = "qr";
    private static final String QR_STATUS_WAIT_SCAN = "WAIT_SCAN";
    private static final String QR_STATUS_WAIT_CONFIRM = "WAIT_CONFIRM";
    private static final String QR_STATUS_AUTHORIZED = "AUTHORIZED";
    private static final String QR_STATUS_EXPIRED = "EXPIRED";
    private static final String QR_STATUS_FAILED = "FAILED";
    private static final int NCM_QR_CODE_EXPIRED = 800;
    private static final int NCM_QR_CODE_WAIT_SCAN = 801;
    private static final int NCM_QR_CODE_WAIT_CONFIRM = 802;
    private static final int NCM_QR_CODE_AUTHORIZED = 803;

    private final StringRedisTemplate redisTemplate;
    private final ObjectMapper objectMapper;
    private final MusicSourceAccountCookieVerifier cookieVerifier;
    private final UserService userService;
    private final NcmQrAuthClient ncmQrAuthClient;
    private final MusicNcmProperties musicNcmProperties;
    private final MusicSourceAccountNeteaseProperties neteaseProperties;

    public MusicSourceAccountBindSessionService(StringRedisTemplate redisTemplate,
                                                ObjectMapper objectMapper,
                                                MusicSourceAccountCookieVerifier cookieVerifier,
                                                UserService userService,
                                                NcmQrAuthClient ncmQrAuthClient,
                                                MusicNcmProperties musicNcmProperties,
                                                MusicSourceAccountNeteaseProperties neteaseProperties) {
        this.redisTemplate = redisTemplate;
        this.objectMapper = objectMapper;
        this.cookieVerifier = cookieVerifier;
        this.userService = userService;
        this.ncmQrAuthClient = ncmQrAuthClient;
        this.musicNcmProperties = musicNcmProperties;
        this.neteaseProperties = neteaseProperties;
    }

    public MusicSourceAccountBindSessionCreateResponse createSession(Long userId, String provider) {
        Long checkedUserId = requireValidUserId(userId);
        String normalizedProvider = cookieVerifier.normalizeProvider(provider);
        LocalDateTime now = LocalDateTime.now();
        Duration sessionTtl = resolveSessionTtl(normalizedProvider);
        LocalDateTime expiresAt = now.plus(sessionTtl);
        String sessionId = UUID.randomUUID().toString();
        String bindToken = UUID.randomUUID().toString();

        String loginMode = resolveLoginMode(normalizedProvider);
        String loginUrl = buildProviderLoginUrl(normalizedProvider);
        String qrKey = "";
        String qrUrl = "";
        String qrImage = "";
        String qrStatus = "";
        String qrMessage = "";
        Integer pollIntervalMs = resolvePollIntervalMs(normalizedProvider);

        if (isNeteaseProvider(normalizedProvider)) {
            NcmQrAuthClient.QrCreateResult qrCreateResult = ncmQrAuthClient.createQrSession();
            qrKey = qrCreateResult.qrKey();
            qrUrl = qrCreateResult.qrUrl();
            qrImage = qrCreateResult.qrImage();
            qrStatus = QR_STATUS_WAIT_SCAN;
            qrMessage = "请使用手机网易云扫码登录";
            if (StringUtils.hasText(qrUrl)) {
                loginUrl = qrUrl;
            }
        }

        BindSessionPayload payload = new BindSessionPayload(
            sessionId,
            checkedUserId,
            normalizedProvider,
            bindToken,
            STATUS_PENDING,
            loginUrl,
            loginMode,
            qrKey,
            qrUrl,
            qrImage,
            qrStatus,
            qrMessage,
            pollIntervalMs,
            now,
            expiresAt,
            null,
            "",
            ""
        );
        writeSession(payload, sessionTtl);
        return toCreateResponse(payload);
    }

    public MusicSourceAccountBindSessionStatusResponse getSessionStatus(Long userId, String provider, String sessionId) {
        Long checkedUserId = requireValidUserId(userId);
        String normalizedProvider = cookieVerifier.normalizeProvider(provider);
        String normalizedSessionId = requireSessionId(sessionId);
        BindSessionPayload payload = readSession(normalizedSessionId);
        if (payload == null || !isOwnedBy(payload, checkedUserId, normalizedProvider)) {
            return buildMissingSessionResponse(normalizedProvider, normalizedSessionId);
        }

        BindSessionPayload refreshedPayload = refreshSessionStatus(payload);
        if (!refreshedPayload.equals(payload)) {
            writeSession(refreshedPayload, ttlForPayload(refreshedPayload));
        }
        return toStatusResponse(refreshedPayload);
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
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Binding session does not exist or has expired");
        }
        if (!STATUS_PENDING.equals(payload.status())) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Binding session is no longer pending");
        }

        String bindToken = request == null ? "" : String.valueOf(request.getBindToken()).trim();
        if (!StringUtils.hasText(bindToken) || !bindToken.equals(payload.bindToken())) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Binding token is invalid");
        }

        String helperVersion = request.getHelperVersion() == null ? "" : request.getHelperVersion().trim();
        String cookieBundle = request.getCookieBundle() == null ? "" : request.getCookieBundle().trim();
        MusicSourceAccountCookieVerifier.VerificationResult verificationResult =
            cookieVerifier.verify(normalizedProvider, cookieBundle);
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
        BindSessionPayload completedPayload = payload.complete(
            helperVersion,
            isNeteaseProvider(normalizedProvider) ? QR_STATUS_AUTHORIZED : payload.qrStatus(),
            isNeteaseProvider(normalizedProvider) ? "已导入登录态" : payload.qrMessage()
        );
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

    private BindSessionPayload refreshSessionStatus(BindSessionPayload payload) {
        if (payload == null || !STATUS_PENDING.equals(payload.status())) {
            return payload;
        }
        if (!isNeteaseProvider(payload.provider()) || !LOGIN_MODE_QR.equals(payload.loginMode())) {
            return payload;
        }
        try {
            NcmQrAuthClient.QrCheckResult qrCheckResult = ncmQrAuthClient.checkQrStatus(payload.qrKey());
            return mapNeteaseQrCheckResult(payload, qrCheckResult);
        } catch (BusinessException exception) {
            return payload.withQrState(payload.qrStatus(), exception.getMessage());
        }
    }

    private BindSessionPayload mapNeteaseQrCheckResult(BindSessionPayload payload,
                                                       NcmQrAuthClient.QrCheckResult qrCheckResult) {
        int code = qrCheckResult == null ? 0 : qrCheckResult.code();
        String message = readQrMessage(qrCheckResult == null ? "" : qrCheckResult.message(), code);
        return switch (code) {
            case NCM_QR_CODE_WAIT_SCAN -> payload.withQrState(QR_STATUS_WAIT_SCAN, message);
            case NCM_QR_CODE_WAIT_CONFIRM -> payload.withQrState(QR_STATUS_WAIT_CONFIRM, message);
            case NCM_QR_CODE_EXPIRED -> payload.expire(message);
            case NCM_QR_CODE_AUTHORIZED -> completeNeteaseQrSession(payload, qrCheckResult.cookie(), message);
            default -> payload.withQrState(payload.qrStatus(), message);
        };
    }

    private BindSessionPayload completeNeteaseQrSession(BindSessionPayload payload,
                                                        String cookieBundle,
                                                        String qrMessage) {
        if (!StringUtils.hasText(cookieBundle)) {
            return payload.fail("网易云扫码成功，但未获取到登录态，请重新发起扫码");
        }

        MusicSourceAccountCookieVerifier.VerificationResult verificationResult =
            cookieVerifier.verify(payload.provider(), cookieBundle);
        if (!verificationResult.valid()) {
            return payload.fail(verificationResult.reason());
        }

        userService.upsertMusicSourceAccountCookie(payload.userId(), payload.provider(), cookieBundle);
        return payload.complete("ncm-qr", QR_STATUS_AUTHORIZED, qrMessage);
    }

    private String buildProviderLoginUrl(String provider) {
        return switch (provider.toLowerCase(Locale.ROOT)) {
            case "netease" -> "https://music.163.com/";
            case "qqmusic" -> "https://y.qq.com/";
            case "kugou" -> "https://www.kugou.com/";
            default -> throw new BusinessException(ErrorCode.BAD_REQUEST, "Unsupported source provider: " + provider);
        };
    }

    private Duration resolveSessionTtl(String provider) {
        if (isNeteaseProvider(provider)) {
            return Duration.ofSeconds(musicNcmProperties.getSessionTtlSeconds());
        }
        return DEFAULT_SESSION_TTL;
    }

    private Integer resolvePollIntervalMs(String provider) {
        if (isNeteaseProvider(provider)) {
            return musicNcmProperties.getPollIntervalMs();
        }
        return DEFAULT_POLL_INTERVAL_MS;
    }

    private String resolveLoginMode(String provider) {
        return isNeteaseProvider(provider) ? LOGIN_MODE_QR : LOGIN_MODE_HELPER;
    }

    private boolean isNeteaseProvider(String provider) {
        return "netease".equalsIgnoreCase(String.valueOf(provider));
    }

    private String readQrMessage(String rawMessage, int qrCode) {
        if (StringUtils.hasText(rawMessage)) {
            return rawMessage.trim();
        }
        return switch (qrCode) {
            case NCM_QR_CODE_WAIT_SCAN -> "等待使用手机网易云扫码";
            case NCM_QR_CODE_WAIT_CONFIRM -> "扫码成功，请在手机上确认登录";
            case NCM_QR_CODE_AUTHORIZED -> "网易云登录确认成功";
            case NCM_QR_CODE_EXPIRED -> "网易云二维码已过期，请重新发起扫码";
            default -> "等待网易云扫码状态更新";
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
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Binding session serialization failed");
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

    private MusicSourceAccountBindSessionCreateResponse toCreateResponse(BindSessionPayload payload) {
        return new MusicSourceAccountBindSessionCreateResponse(
            payload.provider(),
            payload.sessionId(),
            payload.bindToken(),
            payload.status(),
            payload.loginUrl(),
            payload.loginMode(),
            payload.qrUrl(),
            payload.qrImage(),
            payload.qrStatus(),
            payload.qrMessage(),
            payload.pollIntervalMs(),
            payload.expiresAt()
        );
    }

    private MusicSourceAccountBindSessionStatusResponse toStatusResponse(BindSessionPayload payload) {
        return new MusicSourceAccountBindSessionStatusResponse(
            payload.provider(),
            payload.sessionId(),
            payload.status(),
            payload.loginMode(),
            payload.qrStatus(),
            payload.qrMessage(),
            payload.pollIntervalMs(),
            payload.expiresAt(),
            payload.completedAt(),
            payload.failureReason()
        );
    }

    private MusicSourceAccountBindSessionStatusResponse buildMissingSessionResponse(String provider, String sessionId) {
        String normalizedProvider = StringUtils.hasText(provider) ? provider.trim().toLowerCase(Locale.ROOT) : "";
        return new MusicSourceAccountBindSessionStatusResponse(
            normalizedProvider,
            sessionId,
            STATUS_EXPIRED,
            resolveLoginMode(normalizedProvider),
            isNeteaseProvider(normalizedProvider) ? QR_STATUS_EXPIRED : "",
            isNeteaseProvider(normalizedProvider) ? "二维码已失效，请重新发起扫码" : "",
            resolvePollIntervalMs(normalizedProvider),
            null,
            null,
            "Binding session does not exist or has expired"
        );
    }

    private record BindSessionPayload(String sessionId,
                                      Long userId,
                                      String provider,
                                      String bindToken,
                                      String status,
                                      String loginUrl,
                                      String loginMode,
                                      String qrKey,
                                      String qrUrl,
                                      String qrImage,
                                      String qrStatus,
                                      String qrMessage,
                                      Integer pollIntervalMs,
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
                loginMode,
                qrKey,
                qrUrl,
                qrImage,
                qrStatus,
                qrMessage,
                pollIntervalMs,
                createdAt,
                expiresAt,
                null,
                StringUtils.hasText(reason) ? reason.trim() : "",
                StringUtils.hasText(nextHelperVersion) ? nextHelperVersion.trim() : ""
            );
        }

        private BindSessionPayload withQrState(String nextQrStatus, String nextQrMessage) {
            return new BindSessionPayload(
                sessionId,
                userId,
                provider,
                bindToken,
                STATUS_PENDING,
                loginUrl,
                loginMode,
                qrKey,
                qrUrl,
                qrImage,
                StringUtils.hasText(nextQrStatus) ? nextQrStatus.trim() : qrStatus,
                StringUtils.hasText(nextQrMessage) ? nextQrMessage.trim() : qrMessage,
                pollIntervalMs,
                createdAt,
                expiresAt,
                null,
                failureReason,
                helperVersion
            );
        }

        private BindSessionPayload complete(String nextHelperVersion, String nextQrStatus, String nextQrMessage) {
            return new BindSessionPayload(
                sessionId,
                userId,
                provider,
                bindToken,
                STATUS_COMPLETED,
                loginUrl,
                loginMode,
                qrKey,
                qrUrl,
                qrImage,
                StringUtils.hasText(nextQrStatus) ? nextQrStatus.trim() : qrStatus,
                StringUtils.hasText(nextQrMessage) ? nextQrMessage.trim() : qrMessage,
                pollIntervalMs,
                createdAt,
                expiresAt,
                LocalDateTime.now(),
                "",
                StringUtils.hasText(nextHelperVersion) ? nextHelperVersion.trim() : ""
            );
        }

        private BindSessionPayload expire(String reason) {
            return new BindSessionPayload(
                sessionId,
                userId,
                provider,
                bindToken,
                STATUS_EXPIRED,
                loginUrl,
                loginMode,
                qrKey,
                qrUrl,
                qrImage,
                QR_STATUS_EXPIRED,
                StringUtils.hasText(reason) ? reason.trim() : qrMessage,
                pollIntervalMs,
                createdAt,
                expiresAt,
                null,
                StringUtils.hasText(reason) ? reason.trim() : failureReason,
                helperVersion
            );
        }

        private BindSessionPayload fail(String reason) {
            return new BindSessionPayload(
                sessionId,
                userId,
                provider,
                bindToken,
                STATUS_FAILED,
                loginUrl,
                loginMode,
                qrKey,
                qrUrl,
                qrImage,
                QR_STATUS_FAILED,
                StringUtils.hasText(reason) ? reason.trim() : qrMessage,
                pollIntervalMs,
                createdAt,
                expiresAt,
                null,
                StringUtils.hasText(reason) ? reason.trim() : failureReason,
                helperVersion
            );
        }
    }
}
