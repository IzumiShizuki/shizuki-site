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

/**
 * Spring Retry 执行器。
 */
@Component
public class SpringRetryExecutor {

    /**
     * 使用指定重试策略执行动作。
     *
     * @param spec 重试策略
     * @param retryOn 可重试异常类型集合
     * @param action 待执行动作
     * @param <T> 返回值类型
     * @return 执行结果
     */
    public <T> T execute(RetrySpec spec,
                         Collection<Class<? extends Throwable>> retryOn,
                         Supplier<T> action) {
        Objects.requireNonNull(spec, "spec");
        Objects.requireNonNull(action, "action");
        RetryTemplate retryTemplate = buildTemplate(spec, retryOn == null ? Set.of() : Set.copyOf(retryOn));
        return retryTemplate.execute(context -> action.get());
    }

    /**
     * 构建 RetryTemplate。
     */
    private RetryTemplate buildTemplate(RetrySpec spec, Set<Class<? extends Throwable>> retryOn) {
        RetryTemplate template = new RetryTemplate();
        template.setRetryPolicy(buildRetryPolicy(spec, retryOn));
        template.setBackOffPolicy(buildBackOffPolicy(spec));
        return template;
    }

    /**
     * 构建重试策略。
     */
    private SimpleRetryPolicy buildRetryPolicy(RetrySpec spec, Set<Class<? extends Throwable>> retryOn) {
        if (retryOn.isEmpty()) {
            // 未指定可重试异常时仅执行一次（不重试）。
            return new SimpleRetryPolicy(1);
        }
        Map<Class<? extends Throwable>, Boolean> retryableExceptions = new LinkedHashMap<>();
        for (Class<? extends Throwable> exceptionType : retryOn) {
            retryableExceptions.put(exceptionType, true);
        }
        return new SimpleRetryPolicy(spec.maxAttempts(), retryableExceptions, true, false);
    }

    /**
     * 构建指数随机退避策略。
     */
    private ExponentialRandomBackOffPolicy buildBackOffPolicy(RetrySpec spec) {
        ExponentialRandomBackOffPolicy backOffPolicy = new ExponentialRandomBackOffPolicy();
        backOffPolicy.setInitialInterval(spec.initialBackoffMs());
        backOffPolicy.setMultiplier(spec.multiplier());
        backOffPolicy.setMaxInterval(spec.maxBackoffMs());
        return backOffPolicy;
    }
}
