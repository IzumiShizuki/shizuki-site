package io.github.shizuki.common.ratelimit.service;

public interface QuotaService {

    boolean consume(Long userId, String quotaCode, long amount);

    long remaining(Long userId, String quotaCode);
}
