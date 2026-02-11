package io.github.shizuki.common.core.resilience;

/**
 * Retry policy descriptor for transient downstream calls.
 */
public record RetrySpec(int maxAttempts, long initialBackoffMs, long maxBackoffMs, double multiplier) {

    public static final double DEFAULT_MULTIPLIER = 2.0d;

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

    public static RetrySpec exponentialJitter(int maxAttempts, long initialBackoffMs, long maxBackoffMs) {
        return new RetrySpec(maxAttempts, initialBackoffMs, maxBackoffMs, DEFAULT_MULTIPLIER);
    }
}
