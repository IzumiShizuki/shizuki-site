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

/**
 * {@link ImageCaptchaService} 单元测试。
 *
 * <p>覆盖图形验证码创建、过期校验、一次性消费与失败次数上限失效逻辑。
 */
class ImageCaptchaServiceTest {

    /**
     * 目标：验证创建图形验证码时会生成 captchaId、SVG 片段并写入 Redis。
     */
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

    /**
     * 目标：验证码缓存不存在时（过期场景）应抛出业务异常。
     */
    @Test
    void shouldThrowWhenCaptchaExpired() {
        StringRedisTemplate redisTemplate = Mockito.mock(StringRedisTemplate.class);
        ValueOperations<String, String> valueOperations = Mockito.mock(ValueOperations.class);
        Mockito.when(redisTemplate.opsForValue()).thenReturn(valueOperations);
        Mockito.when(valueOperations.get("auth:captcha:image:captcha-1")).thenReturn(null);
        ImageCaptchaService service = new ImageCaptchaService(redisTemplate, new AuthProperties());

        Assertions.assertThrows(BusinessException.class, () -> service.validateAndConsume("captcha-1", "1"));
    }

    /**
     * 目标：答案匹配时应消费验证码，并清理失败计数键。
     */
    @Test
    void shouldConsumeCaptchaWhenAnswerMatched() {
        StringRedisTemplate redisTemplate = Mockito.mock(StringRedisTemplate.class);
        ValueOperations<String, String> valueOperations = Mockito.mock(ValueOperations.class);
        Mockito.when(redisTemplate.opsForValue()).thenReturn(valueOperations);
        Mockito.when(valueOperations.get("auth:captcha:image:captcha-1")).thenReturn(sha256("12"));
        ImageCaptchaService service = new ImageCaptchaService(redisTemplate, new AuthProperties());

        service.validateAndConsume("captcha-1", "12");

        Mockito.verify(redisTemplate).delete("auth:captcha:image:captcha-1");
        Mockito.verify(redisTemplate).delete("auth:captcha:image:attempt:captcha-1");
    }

    /**
     * 目标：连续输错达到上限时验证码应立即失效，避免被暴力尝试。
     */
    @Test
    void shouldInvalidateCaptchaWhenWrongAnswerReachedMaxAttempts() {
        StringRedisTemplate redisTemplate = Mockito.mock(StringRedisTemplate.class);
        ValueOperations<String, String> valueOperations = Mockito.mock(ValueOperations.class);
        Mockito.when(redisTemplate.opsForValue()).thenReturn(valueOperations);
        Mockito.when(valueOperations.get("auth:captcha:image:captcha-1")).thenReturn(sha256("12"));
        Mockito.when(valueOperations.increment("auth:captcha:image:attempt:captcha-1"))
            .thenReturn(1L)
            .thenReturn(2L);
        AuthProperties properties = new AuthProperties();
        properties.getCaptcha().setImageMaxAttempts(2);
        ImageCaptchaService service = new ImageCaptchaService(redisTemplate, properties);

        BusinessException first = Assertions.assertThrows(BusinessException.class,
            () -> service.validateAndConsume("captcha-1", "0"));
        Assertions.assertTrue(first.getMessage().contains("Captcha answer invalid"));

        BusinessException second = Assertions.assertThrows(BusinessException.class,
            () -> service.validateAndConsume("captcha-1", "1"));
        Assertions.assertTrue(second.getMessage().contains("Captcha expired"));
        Mockito.verify(redisTemplate).delete("auth:captcha:image:captcha-1");
        Mockito.verify(redisTemplate).delete("auth:captcha:image:attempt:captcha-1");
    }

    /**
     * 测试辅助方法：生成与生产逻辑一致的 SHA-256 哈希值。
     *
     * @param value 原始答案
     * @return Base64URL 编码后的摘要
     */
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
