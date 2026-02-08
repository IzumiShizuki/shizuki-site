package io.github.shizuki.common.ratelimit.service;

public interface QuotaService {

    /**
     * 消耗指定额度。
     *
     * @return true 表示扣减成功，false 表示余额不足
     */
    boolean consume(Long userId, String quotaCode, long amount);

    /**
     * 查询剩余额度。
     */
    long remaining(Long userId, String quotaCode);
}
