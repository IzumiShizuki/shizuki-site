package io.github.shizuki.site.content.service.widget;

import java.time.Duration;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

@Component
public class RedisDailyQuoteStore implements DailyQuoteRedisStore {

    private final StringRedisTemplate redisTemplate;

    public RedisDailyQuoteStore(StringRedisTemplate redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    @Override
    public String get() {
        return redisTemplate.opsForValue().get(SiteWidgetCacheKeys.DAILY_QUOTE_TODAY);
    }

    @Override
    public void put(String payload, Duration ttl) {
        redisTemplate.opsForValue().set(SiteWidgetCacheKeys.DAILY_QUOTE_TODAY, payload, ttl);
    }

    @Override
    public void evict() {
        redisTemplate.delete(SiteWidgetCacheKeys.DAILY_QUOTE_TODAY);
    }
}
