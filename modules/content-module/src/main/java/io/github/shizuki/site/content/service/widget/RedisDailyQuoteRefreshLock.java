package io.github.shizuki.site.content.service.widget;

import java.time.Duration;
import java.time.LocalDate;
import java.util.List;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.script.DefaultRedisScript;
import org.springframework.stereotype.Component;

/** Redis daily lease whose release cannot delete a newer owner's lock. */
@Component
public class RedisDailyQuoteRefreshLock implements DailyQuoteRefreshLock {

    private static final DefaultRedisScript<Long> RELEASE_SCRIPT = new DefaultRedisScript<>(
        "if redis.call('get', KEYS[1]) == ARGV[1] then "
            + "return redis.call('del', KEYS[1]) else return 0 end",
        Long.class
    );

    private final StringRedisTemplate redisTemplate;

    public RedisDailyQuoteRefreshLock(StringRedisTemplate redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    @Override
    public boolean tryAcquire(LocalDate quoteDate, String token, Duration ttl) {
        return Boolean.TRUE.equals(redisTemplate.opsForValue().setIfAbsent(key(quoteDate), token, ttl));
    }

    @Override
    public void release(LocalDate quoteDate, String token) {
        redisTemplate.execute(RELEASE_SCRIPT, List.of(key(quoteDate)), token);
    }

    static String key(LocalDate quoteDate) {
        if (quoteDate == null) {
            throw new IllegalArgumentException("quoteDate is required");
        }
        return "site:widgets:quote:refresh-lock:" + quoteDate;
    }
}
