package io.github.shizuki.common.oauth.service;

import java.time.Duration;
import java.util.UUID;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

@Component
public class RedisOAuthStateService implements OAuthStateService {

    private static final Duration DEFAULT_EXPIRE = Duration.ofMinutes(10);

    private final StringRedisTemplate redisTemplate;

    public RedisOAuthStateService(StringRedisTemplate redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    @Override
    public String createState(String scopeKey) {
        String state = UUID.randomUUID().toString();
        redisTemplate.opsForValue().set(buildKey(scopeKey, state), "1", DEFAULT_EXPIRE);
        return state;
    }

    @Override
    public boolean validateAndConsume(String scopeKey, String state) {
        String key = buildKey(scopeKey, state);
        Boolean exists = redisTemplate.hasKey(key);
        if (Boolean.TRUE.equals(exists)) {
            redisTemplate.delete(key);
            return true;
        }
        return false;
    }

    private String buildKey(String scopeKey, String state) {
        return "oauth:state:" + scopeKey + ":" + state;
    }
}
