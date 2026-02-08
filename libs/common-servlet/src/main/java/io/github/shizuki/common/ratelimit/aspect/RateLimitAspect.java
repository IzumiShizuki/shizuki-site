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
            MethodSignature signature = (MethodSignature) joinPoint.getSignature();
            baseKey = signature.getDeclaringTypeName() + ":" + signature.getMethod().getName();
        }

        LoginUser loginUser = LoginUserContext.get().orElse(null);
        String userPart = loginUser == null ? "guest" : String.valueOf(loginUser.getUserId());
        String groupPart = loginUser == null || loginUser.getGroups().isEmpty()
            ? "GUEST"
            : loginUser.getGroups().stream().sorted(Comparator.naturalOrder()).collect(Collectors.joining(","));

        return "rate-limit:" + baseKey + ":u:" + userPart + ":g:" + groupPart;
    }

    private boolean tryAcquire(String key, int limit, int windowSeconds) {
        try {
            Long count = redisTemplate.opsForValue().increment(key);
            if (count != null && count == 1L) {
                redisTemplate.expire(key, Duration.ofSeconds(windowSeconds));
            }
            return count != null && count <= limit;
        } catch (Exception ignored) {
            return localRateLimiter.tryAcquire(key, limit, windowSeconds);
        }
    }
}
