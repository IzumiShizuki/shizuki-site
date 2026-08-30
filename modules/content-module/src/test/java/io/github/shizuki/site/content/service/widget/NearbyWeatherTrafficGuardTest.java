package io.github.shizuki.site.content.service.widget;

import static org.assertj.core.api.Assertions.assertThatCode;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyList;
import static org.mockito.Mockito.when;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import java.time.Clock;
import java.time.Instant;
import java.time.ZoneOffset;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.script.RedisScript;

class NearbyWeatherTrafficGuardTest {

    private StringRedisTemplate redisTemplate;
    private NearbyWeatherProperties properties;

    @BeforeEach
    void setUp() {
        redisTemplate = org.mockito.Mockito.mock(StringRedisTemplate.class);
        properties = new NearbyWeatherProperties();
        properties.setCallerCapacity(2);
        properties.setGlobalCapacity(3);
        properties.afterPropertiesSet();
    }

    @Test
    @SuppressWarnings({"rawtypes", "unchecked"})
    void enforcesPerCallerAndGlobalTokenBuckets() {
        when(redisTemplate.execute(
            any(RedisScript.class), anyList(), any(), any(), any(), any(), any(), any()
        )).thenReturn(1L);
        NearbyWeatherTrafficGuard guard = guard();

        guard.acquire("caller-a");
        guard.acquire("caller-a");
        assertThatThrownBy(() -> guard.acquire("caller-a"))
            .isInstanceOfSatisfying(BusinessException.class, exception ->
                org.assertj.core.api.Assertions.assertThat(exception.getErrorCode())
                    .isEqualTo(ErrorCode.TOO_MANY_REQUESTS));

        guard.acquire("caller-b");
        assertThatThrownBy(() -> guard.acquire("caller-c"))
            .isInstanceOf(BusinessException.class);
    }

    @Test
    @SuppressWarnings({"rawtypes", "unchecked"})
    void redisFailureFallsBackToAlreadyConsumedLocalTokens() {
        when(redisTemplate.execute(
            any(RedisScript.class), anyList(), any(), any(), any(), any(), any(), any()
        )).thenThrow(new IllegalStateException("redis unavailable"));
        NearbyWeatherTrafficGuard guard = guard();

        assertThatCode(() -> guard.acquire("caller-a")).doesNotThrowAnyException();
        assertThatCode(() -> guard.acquire("caller-a")).doesNotThrowAnyException();
        assertThatThrownBy(() -> guard.acquire("caller-a"))
            .isInstanceOf(BusinessException.class);
    }

    @Test
    @SuppressWarnings({"rawtypes", "unchecked"})
    void distributedBucketRejectionIsNotBypassed() {
        when(redisTemplate.execute(
            any(RedisScript.class), anyList(), any(), any(), any(), any(), any(), any()
        )).thenReturn(0L);

        assertThatThrownBy(() -> guard().acquire("caller-a"))
            .isInstanceOfSatisfying(BusinessException.class, exception ->
                org.assertj.core.api.Assertions.assertThat(exception.getDetails())
                    .containsEntry("limit_reason", "distributed-token-bucket"));
    }

    private NearbyWeatherTrafficGuard guard() {
        return new NearbyWeatherTrafficGuard(
            redisTemplate,
            properties,
            Clock.fixed(Instant.parse("2026-08-28T12:00:00Z"), ZoneOffset.UTC)
        );
    }
}
