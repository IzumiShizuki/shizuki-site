package io.github.shizuki.site.user.service.auth;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.site.user.config.AuthProperties;
import io.github.shizuki.site.user.dto.auth.ImageCaptchaResponse;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

class ImageCaptchaServiceTest {

    @Test
    void shouldCreateImageCaptchaSuccessfully() {
        StringRedisTemplate redisTemplate = Mockito.mock(StringRedisTemplate.class);
        ValueOperations<String, String> valueOperations = Mockito.mock(ValueOperations.class);
        Mockito.when(redisTemplate.opsForValue()).thenReturn(valueOperations);
        AuthProperties properties = new AuthProperties();
        ImageCaptchaService service = new ImageCaptchaService(redisTemplate, properties);

        ImageCaptchaResponse response = service.createImageCaptcha();

        Assertions.assertNotNull(response.captchaId());
        Assertions.assertTrue(response.svgContent().contains("<svg"));
        Mockito.verify(valueOperations).set(
            ArgumentMatchers.startsWith("auth:captcha:image:"),
            ArgumentMatchers.anyString(),
            ArgumentMatchers.any()
        );
    }

    @Test
    void shouldThrowWhenCaptchaExpired() {
        StringRedisTemplate redisTemplate = Mockito.mock(StringRedisTemplate.class);
        ValueOperations<String, String> valueOperations = Mockito.mock(ValueOperations.class);
        Mockito.when(redisTemplate.opsForValue()).thenReturn(valueOperations);
        Mockito.when(valueOperations.get("auth:captcha:image:captcha-1")).thenReturn(null);
        ImageCaptchaService service = new ImageCaptchaService(redisTemplate, new AuthProperties());

        Assertions.assertThrows(BusinessException.class, () -> service.validateAndConsume("captcha-1", "1"));
    }

    @Test
    void shouldConsumeCaptchaWhenAnswerMatched() {
        StringRedisTemplate redisTemplate = Mockito.mock(StringRedisTemplate.class);
        ValueOperations<String, String> valueOperations = Mockito.mock(ValueOperations.class);
        Mockito.when(redisTemplate.opsForValue()).thenReturn(valueOperations);
        Mockito.when(valueOperations.get("auth:captcha:image:captcha-1")).thenReturn(sha256("12"));
        ImageCaptchaService service = new ImageCaptchaService(redisTemplate, new AuthProperties());

        service.validateAndConsume("captcha-1", "12");

        Mockito.verify(redisTemplate).delete("auth:captcha:image:captcha-1");
    }

    private String sha256(String value) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] bytes = digest.digest(value.getBytes(StandardCharsets.UTF_8));
            return Base64.getUrlEncoder().withoutPadding().encodeToString(bytes);
        } catch (NoSuchAlgorithmException ex) {
            throw new IllegalStateException(ex);
        }
    }
}

