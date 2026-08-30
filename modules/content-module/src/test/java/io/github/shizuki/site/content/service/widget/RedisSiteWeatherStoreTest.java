package io.github.shizuki.site.content.service.widget;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.time.Duration;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.data.redis.core.script.RedisScript;

class RedisSiteWeatherStoreTest {

    private StringRedisTemplate redisTemplate;
    private ValueOperations<String, String> values;
    private RedisSiteWeatherStore store;

    @BeforeEach
    @SuppressWarnings("unchecked")
    void setUp() {
        redisTemplate = org.mockito.Mockito.mock(StringRedisTemplate.class);
        values = org.mockito.Mockito.mock(ValueOperations.class);
        when(redisTemplate.opsForValue()).thenReturn(values);
        store = new RedisSiteWeatherStore(redisTemplate);
    }

    @Test
    void usesExactLocationKeysAndBoundedValueTtl() {
        Duration ttl = Duration.ofMinutes(20);
        when(values.get(SiteWidgetCacheKeys.siteWeatherLocation(31L))).thenReturn("payload");

        assertThat(store.get(31L)).isEqualTo("payload");
        store.put(31L, "new-payload", ttl);
        store.evict(31L);

        verify(values).set(SiteWidgetCacheKeys.siteWeatherLocation(31L), "new-payload", ttl);
        verify(redisTemplate).delete(SiteWidgetCacheKeys.siteWeatherLocation(31L));
    }

    @Test
    @SuppressWarnings({"rawtypes", "unchecked"})
    void leaseUsesSetIfAbsentAndOwnershipSafeReleaseScript() {
        Duration ttl = Duration.ofSeconds(30);
        String key = SiteWidgetCacheKeys.siteWeatherRefreshLock(31L);
        when(values.setIfAbsent(key, "owner-token", ttl)).thenReturn(true);

        assertThat(store.tryAcquireRefresh(31L, "owner-token", ttl)).isTrue();
        store.releaseRefresh(31L, "owner-token");

        verify(values).setIfAbsent(key, "owner-token", ttl);
        verify(redisTemplate).execute(
            any(RedisScript.class),
            eq(List.of(key)),
            eq("owner-token")
        );
    }
}
