package io.github.shizuki.site.user.service.auth;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.site.user.config.AuthProperties;
import io.github.shizuki.site.user.dto.auth.ImageCaptchaResponse;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.Duration;
import java.util.Base64;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
public class ImageCaptchaService {

    private final StringRedisTemplate redisTemplate;
    private final AuthProperties authProperties;

    public ImageCaptchaService(StringRedisTemplate redisTemplate, AuthProperties authProperties) {
        this.redisTemplate = redisTemplate;
        this.authProperties = authProperties;
    }

    public ImageCaptchaResponse createImageCaptcha() {
        int left = ThreadLocalRandom.current().nextInt(1, 10);
        int right = ThreadLocalRandom.current().nextInt(1, 10);
        String operator = ThreadLocalRandom.current().nextBoolean() ? "+" : "-";
        int result = "+".equals(operator) ? left + right : left - right;
        String expression = left + " " + operator + " " + right + " = ?";

        String captchaId = UUID.randomUUID().toString();
        String answerHash = sha256(String.valueOf(result));
        redisTemplate.opsForValue().set(
            buildCaptchaKey(captchaId),
            answerHash,
            Duration.ofSeconds(authProperties.getCaptcha().getImageTtlSeconds())
        );

        String svg = buildSvg(expression);
        return new ImageCaptchaResponse(captchaId, svg, authProperties.getCaptcha().getImageTtlSeconds());
    }

    public void validateAndConsume(String captchaId, String answer) {
        if (!StringUtils.hasText(captchaId) || !StringUtils.hasText(answer)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Captcha id and answer are required");
        }

        String captchaKey = buildCaptchaKey(captchaId);
        String attemptKey = buildCaptchaAttemptKey(captchaId);
        String expectedHash = redisTemplate.opsForValue().get(captchaKey);
        if (!StringUtils.hasText(expectedHash)) {
            redisTemplate.delete(attemptKey);
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Captcha expired");
        }

        long maxAttempts = authProperties.getCaptcha().getImageMaxAttempts();
        String actualHash = sha256(answer.trim());
        if (!expectedHash.equals(actualHash)) {
            Long attempts = redisTemplate.opsForValue().increment(attemptKey);
            redisTemplate.expire(
                attemptKey,
                Duration.ofSeconds(authProperties.getCaptcha().getImageTtlSeconds())
            );
            if (attempts != null && attempts >= maxAttempts) {
                redisTemplate.delete(captchaKey);
                redisTemplate.delete(attemptKey);
                throw new BusinessException(ErrorCode.BAD_REQUEST, "Captcha expired");
            }
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Captcha answer invalid");
        }
        redisTemplate.delete(captchaKey);
        redisTemplate.delete(attemptKey);
    }

    private String buildCaptchaKey(String captchaId) {
        return "auth:captcha:image:" + captchaId;
    }

    private String buildCaptchaAttemptKey(String captchaId) {
        return "auth:captcha:image:attempt:" + captchaId;
    }

    private String buildSvg(String expression) {
        return "<svg xmlns=\"http://www.w3.org/2000/svg\" width=\"220\" height=\"64\" viewBox=\"0 0 220 64\">"
            + "<rect width=\"220\" height=\"64\" fill=\"#F8F9FB\"/>"
            + "<circle cx=\"28\" cy=\"24\" r=\"18\" fill=\"#EAF2FF\"/>"
            + "<circle cx=\"192\" cy=\"42\" r=\"16\" fill=\"#FFEFE8\"/>"
            + "<text x=\"20\" y=\"41\" font-family=\"monospace\" font-size=\"28\" fill=\"#1F2937\">"
            + expression
            + "</text></svg>";
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
