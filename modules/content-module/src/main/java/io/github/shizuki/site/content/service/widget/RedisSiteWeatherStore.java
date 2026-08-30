package io.github.shizuki.site.content.service.widget;

import java.time.Duration;
import java.util.List;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.script.DefaultRedisScript;
import org.springframework.stereotype.Component;

/** Redis implementation with ownership-safe refresh-lock release. */
@Component
public class RedisSiteWeatherStore implements SiteWeatherRedisStore {

    private static final DefaultRedisScript<Long> RELEASE_SCRIPT = new DefaultRedisScript<>(
        "if redis.call('get', KEYS[1]) == ARGV[1] then "
            + "return redis.call('del', KEYS[1]) else return 0 end",
        Long.class
    );

    private final StringRedisTemplate redisTemplate;

    public RedisSiteWeatherStore(StringRedisTemplate redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    @Override
    public String get(long locationId) {
        return redisTemplate.opsForValue().get(SiteWidgetCacheKeys.siteWeatherLocation(locationId));
    }

    @Override
    public void put(long locationId, String payload, Duration ttl) {
        redisTemplate.opsForValue().set(SiteWidgetCacheKeys.siteWeatherLocation(locationId), payload, ttl);
    }

    @Override
    public void evict(long locationId) {
        redisTemplate.delete(SiteWidgetCacheKeys.siteWeatherLocation(locationId));
    }

    @Override
    public boolean tryAcquireRefresh(long locationId, String token, Duration ttl) {
        return Boolean.TRUE.equals(redisTemplate.opsForValue().setIfAbsent(
            SiteWidgetCacheKeys.siteWeatherRefreshLock(locationId),
            token,
            ttl
        ));
    }

    @Override
    public void releaseRefresh(long locationId, String token) {
        redisTemplate.execute(
            RELEASE_SCRIPT,
            List.of(SiteWidgetCacheKeys.siteWeatherRefreshLock(locationId)),
            token
        );
    }
}
