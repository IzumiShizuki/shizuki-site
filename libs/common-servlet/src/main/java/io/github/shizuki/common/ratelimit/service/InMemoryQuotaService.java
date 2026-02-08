package io.github.shizuki.common.ratelimit.service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.springframework.stereotype.Component;

@Component
public class InMemoryQuotaService implements QuotaService {

    /**
     * 本地进程内额度存储，仅用于单机或兜底场景。
     */
    private final Map<String, Long> quota = new ConcurrentHashMap<>();

    @Override
    public boolean consume(Long userId, String quotaCode, long amount) {
        String key = key(userId, quotaCode);
        // 这里先读后写，适合低并发兜底；严格分布式场景应走 DB/Redis 原子扣减。
        long current = quota.getOrDefault(key, 0L);
        if (current < amount) {
            return false;
        }
        quota.put(key, current - amount);
        return true;
    }

    @Override
    public long remaining(Long userId, String quotaCode) {
        return quota.getOrDefault(key(userId, quotaCode), 0L);
    }

    /**
     * 直接授予额度，常用于初始化或测试。
     */
    public void grant(Long userId, String quotaCode, long amount) {
        quota.put(key(userId, quotaCode), amount);
    }

    private String key(Long userId, String quotaCode) {
        return userId + ":" + quotaCode;
    }
}
