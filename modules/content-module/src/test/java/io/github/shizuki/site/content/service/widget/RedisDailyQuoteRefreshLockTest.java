package io.github.shizuki.site.content.service.widget;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.time.Duration;
import java.time.LocalDate;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.data.redis.core.script.RedisScript;

class RedisDailyQuoteRefreshLockTest {

    private StringRedisTemplate redisTemplate;
    private ValueOperations<String, String> values;
    private RedisDailyQuoteRefreshLock refreshLock;

    @BeforeEach
    @SuppressWarnings("unchecked")
    void setUp() {
        redisTemplate = org.mockito.Mockito.mock(StringRedisTemplate.class);
        values = org.mockito.Mockito.mock(ValueOperations.class);
        when(redisTemplate.opsForValue()).thenReturn(values);
        refreshLock = new RedisDailyQuoteRefreshLock(redisTemplate);
    }

    @Test
    @SuppressWarnings({"rawtypes", "unchecked"})
    void usesDateScopedLeaseAndOwnershipSafeRelease() {
        LocalDate date = LocalDate.of(2026, 8, 29);
        Duration ttl = Duration.ofSeconds(45);
        String key = RedisDailyQuoteRefreshLock.key(date);
        when(values.setIfAbsent(key, "owner", ttl)).thenReturn(true);

        assertThat(refreshLock.tryAcquire(date, "owner", ttl)).isTrue();
        refreshLock.release(date, "owner");

        verify(values).setIfAbsent(key, "owner", ttl);
        verify(redisTemplate).execute(any(RedisScript.class), eq(List.of(key)), eq("owner"));
    }
}
