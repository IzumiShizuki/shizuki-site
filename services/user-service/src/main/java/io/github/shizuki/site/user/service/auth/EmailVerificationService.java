package io.github.shizuki.site.user.service.auth;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.site.user.auth.EmailVerificationPurpose;
import io.github.shizuki.site.user.config.AuthProperties;
import io.github.shizuki.site.user.dto.auth.EmailVerificationSendResponse;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.Duration;
import java.util.Base64;
import java.util.Locale;
import java.util.concurrent.ThreadLocalRandom;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
public class EmailVerificationService {

    private final StringRedisTemplate redisTemplate;
    private final AuthProperties authProperties;
    private final MailSenderService mailSenderService;

    public EmailVerificationService(StringRedisTemplate redisTemplate,
                                    AuthProperties authProperties,
                                    MailSenderService mailSenderService) {
        this.redisTemplate = redisTemplate;
        this.authProperties = authProperties;
        this.mailSenderService = mailSenderService;
    }

    public EmailVerificationSendResponse sendCode(String email, EmailVerificationPurpose purpose) {
        String normalizedEmail = normalizeEmail(email);
        String cooldownKey = cooldownKey(purpose, normalizedEmail);
        if (Boolean.TRUE.equals(redisTemplate.hasKey(cooldownKey))) {
            throw new BusinessException(ErrorCode.TOO_MANY_REQUESTS, "Email verification send cooldown active");
        }

        String code = String.format("%06d", ThreadLocalRandom.current().nextInt(0, 1_000_000));
        String valueKey = valueKey(purpose, normalizedEmail);
        Duration emailTtl = Duration.ofSeconds(authProperties.getVerify().getEmailTtlSeconds());
        Duration cooldownTtl = Duration.ofSeconds(authProperties.getVerify().getEmailCooldownSeconds());
        redisTemplate.opsForValue().set(valueKey, sha256(code), emailTtl);
        redisTemplate.delete(attemptKey(purpose, normalizedEmail));
        redisTemplate.opsForValue().set(cooldownKey, "1", cooldownTtl);

        try {
            mailSenderService.sendVerificationCode(normalizedEmail, purpose, code);
        } catch (RuntimeException ex) {
            redisTemplate.delete(valueKey);
            redisTemplate.delete(cooldownKey);
            throw ex;
        }

        return new EmailVerificationSendResponse("SENT", authProperties.getVerify().getEmailCooldownSeconds());
    }

    public void validateAndConsume(String email, EmailVerificationPurpose purpose, String code) {
        String normalizedEmail = normalizeEmail(email);
        if (!StringUtils.hasText(code)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Email verification code is required");
        }
        String valueKey = valueKey(purpose, normalizedEmail);
        String hash = redisTemplate.opsForValue().get(valueKey);
        if (!StringUtils.hasText(hash)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Email verification code expired");
        }

        String actualHash = sha256(code.trim());
        if (!hash.equals(actualHash)) {
            long failedAttempts = incrementFailedAttempts(purpose, normalizedEmail);
            if (failedAttempts >= authProperties.getVerify().getEmailMaxAttempts()) {
                redisTemplate.delete(valueKey);
                redisTemplate.delete(attemptKey(purpose, normalizedEmail));
            }
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Email verification code invalid");
        }

        redisTemplate.delete(valueKey);
        redisTemplate.delete(attemptKey(purpose, normalizedEmail));
    }

    private long incrementFailedAttempts(EmailVerificationPurpose purpose, String email) {
        String key = attemptKey(purpose, email);
        Long count = redisTemplate.opsForValue().increment(key);
        if (count != null && count == 1L) {
            redisTemplate.expire(key, Duration.ofSeconds(authProperties.getVerify().getEmailTtlSeconds()));
        }
        return count == null ? 0L : count;
    }

    private String normalizeEmail(String email) {
        if (!StringUtils.hasText(email)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Email is required");
        }
        return email.trim().toLowerCase(Locale.ROOT);
    }

    private String valueKey(EmailVerificationPurpose purpose, String email) {
        return "auth:verify:email:" + purpose.name().toLowerCase(Locale.ROOT) + ":" + email;
    }

    private String cooldownKey(EmailVerificationPurpose purpose, String email) {
        return "auth:verify:cooldown:" + purpose.name().toLowerCase(Locale.ROOT) + ":" + email;
    }

    private String attemptKey(EmailVerificationPurpose purpose, String email) {
        return "auth:verify:attempt:" + purpose.name().toLowerCase(Locale.ROOT) + ":" + email;
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
}

