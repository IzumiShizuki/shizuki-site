package io.github.shizuki.common.ratelimit.aspect;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.common.ratelimit.annotation.RateLimit;
import io.github.shizuki.common.ratelimit.support.LocalRateLimiter;
import io.github.shizuki.common.security.context.LoginUserContext;
import io.github.shizuki.common.security.model.LoginUser;
import java.time.Duration;
import java.util.Map;
import java.util.Comparator;
import java.util.stream.Collectors;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Aspect
@Component
public class RateLimitAspect {

    private final StringRedisTemplate redisTemplate;
    private final LocalRateLimiter localRateLimiter = new LocalRateLimiter();

    public RateLimitAspect(StringRedisTemplate redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    /**
     * 注解切面入口：先抢占令牌，再执行业务方法。
     */
    @Around("@annotation(rateLimit)")
    public Object around(ProceedingJoinPoint joinPoint, RateLimit rateLimit) throws Throwable {
        String key = buildKey(joinPoint, rateLimit);
        if (!tryAcquire(key, rateLimit.limit(), rateLimit.windowSeconds())) {
            throw new BusinessException(
                ErrorCode.TOO_MANY_REQUESTS,
                "Rate limit exceeded",
                Map.of("remaining", 0, "limit_key", key, "window_seconds", rateLimit.windowSeconds())
            );
        }
        return joinPoint.proceed();
    }

    private String buildKey(ProceedingJoinPoint joinPoint, RateLimit rateLimit) {
        String baseKey;
        if (StringUtils.hasText(rateLimit.key())) {
            baseKey = rateLimit.key();
        } else {
            // 未显式指定 key 时，按“类名:方法名”构造默认限流维度。
            MethodSignature signature = (MethodSignature) joinPoint.getSignature();
            baseKey = signature.getDeclaringTypeName() + ":" + signature.getMethod().getName();
        }

        LoginUser loginUser = LoginUserContext.get().orElse(null);
        String userPart = loginUser == null ? "guest" : String.valueOf(loginUser.getUserId());
        String groupPart = loginUser == null || loginUser.getGroups().isEmpty()
            ? "GUEST"
            : loginUser.getGroups().stream().sorted(Comparator.naturalOrder()).collect(Collectors.joining(","));

        // 最终维度包含接口、用户、分组，便于按角色差异化限流。
        return "rate-limit:" + baseKey + ":u:" + userPart + ":g:" + groupPart;
    }

    private boolean tryAcquire(String key, int limit, int windowSeconds) {
        try {
            // Redis 可用时优先使用 Redis，支持多实例共享限流状态。
            Long count = redisTemplate.opsForValue().increment(key);
            if (count != null && count == 1L) {
                redisTemplate.expire(key, Duration.ofSeconds(windowSeconds));
            }
            return count != null && count <= limit;
        } catch (Exception ignored) {
            // Redis 异常时降级到进程内限流，保证核心接口仍可运行。
            return localRateLimiter.tryAcquire(key, limit, windowSeconds);
        }
    }
}
