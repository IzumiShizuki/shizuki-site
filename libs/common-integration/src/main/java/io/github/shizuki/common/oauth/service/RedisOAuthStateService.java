package io.github.shizuki.common.oauth.service;

import java.time.Duration;
import java.util.UUID;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

/**
 * 基于 Redis 的 OAuth state 服务实现。
 */
@Component
public class RedisOAuthStateService implements OAuthStateService {

    /**
     * state 默认 TTL。
     */
    private static final Duration DEFAULT_EXPIRE = Duration.ofMinutes(10);

    /**
     * Redis 客户端。
     */
    private final StringRedisTemplate redisTemplate;

    /**
     * 构造 Redis OAuth state 服务。
     *
     * @param redisTemplate Redis 客户端
     */
    public RedisOAuthStateService(StringRedisTemplate redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String createState(String scopeKey) {
        String state = UUID.randomUUID().toString();
        redisTemplate.opsForValue().set(buildKey(scopeKey, state), "1", DEFAULT_EXPIRE);
        return state;
    }

    /**
     * {@inheritDoc}
     */
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

    /**
     * 构建 OAuth state 的 Redis key。
     *
     * @param scopeKey 作用域键
     * @param state state 值
     * @return Redis key
     */
    private String buildKey(String scopeKey, String state) {
        return "oauth:state:" + scopeKey + ":" + state;
    }
}
