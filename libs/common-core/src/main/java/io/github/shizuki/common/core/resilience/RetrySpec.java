package io.github.shizuki.common.core.resilience;

/**
 * 重试策略描述对象。
 */
public record RetrySpec(int maxAttempts, long initialBackoffMs, long maxBackoffMs, double multiplier) {

    /**
     * 默认指数倍率。
     */
    public static final double DEFAULT_MULTIPLIER = 2.0d;

    /**
     * 参数校验。
     */
    public RetrySpec {
        if (maxAttempts < 1) {
            throw new IllegalArgumentException("maxAttempts must be >= 1");
        }
        if (initialBackoffMs < 1) {
            throw new IllegalArgumentException("initialBackoffMs must be >= 1");
        }
        if (maxBackoffMs < initialBackoffMs) {
            throw new IllegalArgumentException("maxBackoffMs must be >= initialBackoffMs");
        }
        if (multiplier < 1.0d) {
            throw new IllegalArgumentException("multiplier must be >= 1.0");
        }
    }

    /**
     * 创建指数退避 + 抖动策略（默认倍率）。
     *
     * @param maxAttempts 最大尝试次数
     * @param initialBackoffMs 初始退避毫秒
     * @param maxBackoffMs 最大退避毫秒
     * @return 重试策略
     */
    public static RetrySpec exponentialJitter(int maxAttempts, long initialBackoffMs, long maxBackoffMs) {
        return new RetrySpec(maxAttempts, initialBackoffMs, maxBackoffMs, DEFAULT_MULTIPLIER);
    }
}
