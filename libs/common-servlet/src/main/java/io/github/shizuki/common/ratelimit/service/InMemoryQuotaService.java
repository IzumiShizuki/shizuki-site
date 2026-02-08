package io.github.shizuki.common.ratelimit.service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.springframework.stereotype.Component;

@Component
public class InMemoryQuotaService implements QuotaService {

    private final Map<String, Long> quota = new ConcurrentHashMap<>();

    @Override
    public boolean consume(Long userId, String quotaCode, long amount) {
        String key = key(userId, quotaCode);
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

    public void grant(Long userId, String quotaCode, long amount) {
        quota.put(key(userId, quotaCode), amount);
    }

    private String key(Long userId, String quotaCode) {
        return userId + ":" + quotaCode;
    }
}
