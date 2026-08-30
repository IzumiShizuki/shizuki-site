package io.github.shizuki.site.content.service.widget;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import java.time.Clock;
import java.time.Instant;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.script.DefaultRedisScript;
import org.springframework.stereotype.Component;

/** Shared Redis token buckets backed by an always-on bounded local safety limiter. */
@Component
public class NearbyWeatherTrafficGuard {

    private static final String GLOBAL_KEY = "site:widgets:weather:nearby:rate:global";
    private static final DefaultRedisScript<Long> TOKEN_BUCKET_SCRIPT = new DefaultRedisScript<>("""
        local now = tonumber(ARGV[1])
        local global_capacity = tonumber(ARGV[2])
        local global_rate = tonumber(ARGV[3]) / 60000.0
        local caller_capacity = tonumber(ARGV[4])
        local caller_rate = tonumber(ARGV[5]) / 60000.0
        local ttl = tonumber(ARGV[6])

        local function state(key, capacity, rate)
          local values = redis.call('HMGET', key, 'tokens', 'updated')
          local tokens = tonumber(values[1]) or capacity
          local updated = tonumber(values[2]) or now
          tokens = math.min(capacity, tokens + math.max(0, now - updated) * rate)
          return tokens
        end

        local global_tokens = state(KEYS[1], global_capacity, global_rate)
        local caller_tokens = state(KEYS[2], caller_capacity, caller_rate)
        if global_tokens < 1 or caller_tokens < 1 then
          return 0
        end
        redis.call('HSET', KEYS[1], 'tokens', global_tokens - 1, 'updated', now)
        redis.call('HSET', KEYS[2], 'tokens', caller_tokens - 1, 'updated', now)
        redis.call('PEXPIRE', KEYS[1], ttl)
        redis.call('PEXPIRE', KEYS[2], ttl)
        return 1
        """, Long.class);

    private final StringRedisTemplate redisTemplate;
    private final NearbyWeatherProperties properties;
    private final Clock clock;
    private final LocalBucket globalBucket;
    private final LinkedHashMap<String, LocalBucket> callerBuckets = new LinkedHashMap<>(16, 0.75F, true);

    @Autowired
    public NearbyWeatherTrafficGuard(
        StringRedisTemplate redisTemplate,
        NearbyWeatherProperties properties
    ) {
        this(redisTemplate, properties, Clock.systemUTC());
    }

    NearbyWeatherTrafficGuard(
        StringRedisTemplate redisTemplate,
        NearbyWeatherProperties properties,
        Clock clock
    ) {
        this.redisTemplate = redisTemplate;
        this.properties = properties;
        this.clock = clock;
        this.globalBucket = new LocalBucket(properties.getGlobalCapacity(), clock.instant());
    }

    public void acquire(String callerKey) {
        if (callerKey == null || callerKey.isBlank() || callerKey.length() > 128) {
            throw rateLimited("invalid-caller-key");
        }
        Instant now = clock.instant();
        synchronized (this) {
            cleanup(now);
            LocalBucket caller = callerBuckets.get(callerKey);
            if (caller == null) {
                if (callerBuckets.size() >= properties.getMaxLocalCallerBuckets()) {
                    throw rateLimited("caller-key-capacity");
                }
                caller = new LocalBucket(properties.getCallerCapacity(), now);
                callerBuckets.put(callerKey, caller);
            }
            globalBucket.refill(now, properties.getGlobalCapacity(), properties.getGlobalRefillPerMinute());
            caller.refill(now, properties.getCallerCapacity(), properties.getCallerRefillPerMinute());
            if (!globalBucket.hasToken() || !caller.hasToken()) {
                throw rateLimited("local-token-bucket");
            }
            globalBucket.consume(now);
            caller.consume(now);
        }

        try {
            Long allowed = redisTemplate.execute(
                TOKEN_BUCKET_SCRIPT,
                List.of(GLOBAL_KEY, "site:widgets:weather:nearby:rate:caller:" + callerKey),
                String.valueOf(now.toEpochMilli()),
                String.valueOf(properties.getGlobalCapacity()),
                String.valueOf(properties.getGlobalRefillPerMinute()),
                String.valueOf(properties.getCallerCapacity()),
                String.valueOf(properties.getCallerRefillPerMinute()),
                String.valueOf(properties.getBucketTtl().toMillis())
            );
            if (!Long.valueOf(1L).equals(allowed)) {
                throw rateLimited("distributed-token-bucket");
            }
        } catch (BusinessException exception) {
            throw exception;
        } catch (RuntimeException ignored) {
            // The local buckets have already consumed tokens, so Redis failure cannot bypass limits.
        }
    }

    private void cleanup(Instant now) {
        Instant cutoff = now.minus(properties.getBucketTtl());
        Iterator<Map.Entry<String, LocalBucket>> iterator = callerBuckets.entrySet().iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getValue().lastSeen().isBefore(cutoff)) {
                iterator.remove();
            }
        }
    }

    private BusinessException rateLimited(String reason) {
        return new BusinessException(
            ErrorCode.TOO_MANY_REQUESTS,
            "Nearby weather request limit reached",
            Map.of("limit_reason", reason)
        );
    }

    private static final class LocalBucket {
        private double tokens;
        private Instant updatedAt;
        private Instant lastSeen;

        private LocalBucket(int capacity, Instant now) {
            this.tokens = capacity;
            this.updatedAt = now;
            this.lastSeen = now;
        }

        private void refill(Instant now, int capacity, int refillPerMinute) {
            long elapsedMillis = Math.max(0L, now.toEpochMilli() - updatedAt.toEpochMilli());
            tokens = Math.min(capacity, tokens + elapsedMillis * (refillPerMinute / 60_000D));
            updatedAt = now;
            lastSeen = now;
        }

        private boolean hasToken() {
            return tokens >= 1D;
        }

        private void consume(Instant now) {
            tokens -= 1D;
            lastSeen = now;
        }

        private Instant lastSeen() {
            return lastSeen;
        }
    }
}
