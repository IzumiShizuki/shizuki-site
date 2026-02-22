package io.github.shizuki.common.web.aspect;

import io.github.shizuki.common.security.context.LoginUserContext;
import io.github.shizuki.common.security.model.LoginUser;
import jakarta.servlet.http.HttpServletRequest;
import java.util.Comparator;
import java.util.Set;
import java.util.stream.Collectors;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

/**
 * 通用业务日志切面。
 *
 * <p>统一记录 controller 与 service.impl 方法执行耗时，不记录参数与返回值，避免泄露敏感数据。
 */
@Aspect
@Component
public class BusinessOperationLogAspect {

    private static final Logger LOGGER = LoggerFactory.getLogger(BusinessOperationLogAspect.class);

    @Around("execution(public * io.github.shizuki.site..controller..*(..))"
        + " || execution(public * io.github.shizuki.site..service.impl..*(..))")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        long startNano = System.nanoTime();
        ActorInfo actor = resolveActor();
        String target = resolveTarget(joinPoint);
        RequestInfo requestInfo = resolveRequestInfo();
        if (shouldEmitStartLog(requestInfo.path())) {
            LOGGER.info(
                "BIZ_START role={} user_id={} target={} request_method={} request_path={}",
                actor.roleLabel(),
                actor.userId(),
                target,
                requestInfo.method(),
                requestInfo.path()
            );
        }

        try {
            Object result = joinPoint.proceed();
            long costMs = Math.max((System.nanoTime() - startNano) / 1_000_000L, 0L);
            LOGGER.info(
                "BIZ_OK role={} user_id={} target={} cost_ms={} request_method={} request_path={}",
                actor.roleLabel(),
                actor.userId(),
                target,
                costMs,
                requestInfo.method(),
                requestInfo.path()
            );
            return result;
        } catch (Throwable throwable) {
            long costMs = Math.max((System.nanoTime() - startNano) / 1_000_000L, 0L);
            LOGGER.warn(
                "BIZ_FAIL role={} user_id={} target={} cost_ms={} request_method={} request_path={} error_type={} error_msg={}",
                actor.roleLabel(),
                actor.userId(),
                target,
                costMs,
                requestInfo.method(),
                requestInfo.path(),
                throwable.getClass().getSimpleName(),
                valueOrDash(throwable.getMessage())
            );
            throw throwable;
        }
    }

    private String resolveTarget(ProceedingJoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        return signature.getDeclaringType().getSimpleName() + "." + signature.getName();
    }

    private RequestInfo resolveRequestInfo() {
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        if (attributes == null) {
            return new RequestInfo("-", "-");
        }
        HttpServletRequest request = attributes.getRequest();
        if (request == null) {
            return new RequestInfo("-", "-");
        }
        return new RequestInfo(valueOrDash(request.getMethod()), valueOrDash(request.getRequestURI()));
    }

    private ActorInfo resolveActor() {
        LoginUser loginUser = LoginUserContext.get().orElse(null);
        if (loginUser == null || loginUser.getUserId() == null || loginUser.getUserId() <= 0) {
            return new ActorInfo(0L, "GUEST");
        }

        Set<String> groups = loginUser.getGroups();
        String roleLabel;
        if (groups == null || groups.isEmpty()) {
            roleLabel = "AUTHENTICATED";
        } else {
            roleLabel = groups.stream()
                .filter(group -> group != null && !group.isBlank())
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.joining(","));
            if (roleLabel.isBlank()) {
                roleLabel = "AUTHENTICATED";
            }
        }
        return new ActorInfo(loginUser.getUserId(), roleLabel);
    }

    private String valueOrDash(String raw) {
        return raw == null || raw.isBlank() ? "-" : raw;
    }

    private boolean shouldEmitStartLog(String requestPath) {
        return requestPath != null
            && (requestPath.startsWith("/api/v1/auth") || requestPath.startsWith("/api/v1/me"));
    }

    private record ActorInfo(Long userId, String roleLabel) {
    }

    private record RequestInfo(String method, String path) {
    }
}
