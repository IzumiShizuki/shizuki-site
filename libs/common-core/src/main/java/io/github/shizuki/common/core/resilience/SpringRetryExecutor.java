package io.github.shizuki.common.core.resilience;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Supplier;
import org.springframework.retry.backoff.ExponentialRandomBackOffPolicy;
import org.springframework.retry.policy.SimpleRetryPolicy;
import org.springframework.retry.support.RetryTemplate;
import org.springframework.stereotype.Component;

@Component
public class SpringRetryExecutor {

    /**
     * Execute action with exponential jitter retry policy.
     */
    public <T> T execute(RetrySpec spec,
                         Collection<Class<? extends Throwable>> retryOn,
                         Supplier<T> action) {
        Objects.requireNonNull(spec, "spec");
        Objects.requireNonNull(action, "action");
        RetryTemplate retryTemplate = buildTemplate(spec, retryOn == null ? Set.of() : Set.copyOf(retryOn));
        return retryTemplate.execute(context -> action.get());
    }

    private RetryTemplate buildTemplate(RetrySpec spec, Set<Class<? extends Throwable>> retryOn) {
        RetryTemplate template = new RetryTemplate();
        template.setRetryPolicy(buildRetryPolicy(spec, retryOn));
        template.setBackOffPolicy(buildBackOffPolicy(spec));
        return template;
    }

    private SimpleRetryPolicy buildRetryPolicy(RetrySpec spec, Set<Class<? extends Throwable>> retryOn) {
        if (retryOn.isEmpty()) {
            return new SimpleRetryPolicy(1);
        }
        Map<Class<? extends Throwable>, Boolean> retryableExceptions = new LinkedHashMap<>();
        for (Class<? extends Throwable> exceptionType : retryOn) {
            retryableExceptions.put(exceptionType, true);
        }
        return new SimpleRetryPolicy(spec.maxAttempts(), retryableExceptions, true, false);
    }

    private ExponentialRandomBackOffPolicy buildBackOffPolicy(RetrySpec spec) {
        ExponentialRandomBackOffPolicy backOffPolicy = new ExponentialRandomBackOffPolicy();
        backOffPolicy.setInitialInterval(spec.initialBackoffMs());
        backOffPolicy.setMultiplier(spec.multiplier());
        backOffPolicy.setMaxInterval(spec.maxBackoffMs());
        return backOffPolicy;
    }
}
