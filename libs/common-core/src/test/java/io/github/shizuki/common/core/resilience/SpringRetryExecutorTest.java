package io.github.shizuki.common.core.resilience;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import org.junit.jupiter.api.Test;

class SpringRetryExecutorTest {

    private final SpringRetryExecutor executor = new SpringRetryExecutor();

    @Test
    void shouldRetryAndSucceedWithinMaxAttempts() {
        RetrySpec retrySpec = RetrySpec.exponentialJitter(3, 5L, 20L);
        AtomicInteger attempts = new AtomicInteger(0);

        String value = executor.execute(retrySpec, Set.of(IllegalStateException.class), () -> {
            int current = attempts.incrementAndGet();
            if (current < 3) {
                throw new IllegalStateException("transient");
            }
            return "ok";
        });

        assertThat(value).isEqualTo("ok");
        assertThat(attempts.get()).isEqualTo(3);
    }

    @Test
    void shouldThrowWhenRetryExhausted() {
        RetrySpec retrySpec = RetrySpec.exponentialJitter(3, 5L, 20L);
        AtomicInteger attempts = new AtomicInteger(0);

        assertThatThrownBy(() -> executor.execute(retrySpec, Set.of(IllegalStateException.class), () -> {
            attempts.incrementAndGet();
            throw new IllegalStateException("always fail");
        })).isInstanceOf(IllegalStateException.class)
            .hasMessage("always fail");

        assertThat(attempts.get()).isEqualTo(3);
    }

    @Test
    void shouldNotRetryWhenExceptionNotRetryable() {
        RetrySpec retrySpec = RetrySpec.exponentialJitter(3, 5L, 20L);
        AtomicInteger attempts = new AtomicInteger(0);

        assertThatThrownBy(() -> executor.execute(retrySpec, Set.of(IllegalStateException.class), () -> {
            attempts.incrementAndGet();
            throw new IllegalArgumentException("non retryable");
        })).isInstanceOf(IllegalArgumentException.class)
            .hasMessage("non retryable");

        assertThat(attempts.get()).isEqualTo(1);
    }
}
