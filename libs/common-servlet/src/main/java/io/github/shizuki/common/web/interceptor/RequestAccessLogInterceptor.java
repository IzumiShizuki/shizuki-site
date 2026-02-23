package io.github.shizuki.common.web.interceptor;

import io.github.shizuki.common.security.context.LoginUserContext;
import io.github.shizuki.common.security.model.LoginUser;
import jakarta.servlet.DispatcherType;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.Comparator;
import java.util.Set;
import java.util.stream.Collectors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

/**
 * 统一请求入口访问日志。
 *
 * <p>在 controller 执行前输出身份与访问方式，在请求结束后输出响应状态和耗时。
 */
@Component
public class RequestAccessLogInterceptor implements HandlerInterceptor {

    private static final Logger LOGGER = LoggerFactory.getLogger(RequestAccessLogInterceptor.class);

    private static final String ATTR_START_NANO = RequestAccessLogInterceptor.class.getName() + ".start_nano";

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        if (request.getDispatcherType() != DispatcherType.REQUEST) {
            return true;
        }

        ActorInfo actor = resolveActor();
        request.setAttribute(ATTR_START_NANO, System.nanoTime());
        LOGGER.info(
            "REQUEST_IN role={} user_id={} method={} path={} query={} ip={} request_id={} trace_id={}",
            actor.roleLabel(),
            actor.userId(),
            request.getMethod(),
            request.getRequestURI(),
            normalizeQuery(request.getQueryString()),
            resolveClientIp(request),
            resolveCorrelationId(request, response, "X-Request-Id"),
            resolveCorrelationId(request, response, "X-Trace-Id")
        );
        return true;
    }

    @Override
    public void afterCompletion(HttpServletRequest request,
                                HttpServletResponse response,
                                Object handler,
                                @Nullable Exception ex) {
        if (request.getDispatcherType() != DispatcherType.REQUEST) {
            return;
        }

        long costMs = calculateCostMs(request);
        ActorInfo actor = resolveActor();
        if (ex == null) {
            LOGGER.info(
                "REQUEST_OUT role={} user_id={} method={} path={} status={} cost_ms={} request_id={} trace_id={}",
                actor.roleLabel(),
                actor.userId(),
                request.getMethod(),
                request.getRequestURI(),
                response.getStatus(),
                costMs,
                resolveCorrelationId(request, response, "X-Request-Id"),
                resolveCorrelationId(request, response, "X-Trace-Id")
            );
            return;
        }

        LOGGER.warn(
            "REQUEST_FAIL role={} user_id={} method={} path={} status={} cost_ms={} request_id={} trace_id={} error_type={} error_msg={}",
            actor.roleLabel(),
            actor.userId(),
            request.getMethod(),
            request.getRequestURI(),
            response.getStatus(),
            costMs,
            resolveCorrelationId(request, response, "X-Request-Id"),
            resolveCorrelationId(request, response, "X-Trace-Id"),
            ex.getClass().getSimpleName(),
            valueOrDash(ex.getMessage())
        );
    }

    private long calculateCostMs(HttpServletRequest request) {
        Object raw = request.getAttribute(ATTR_START_NANO);
        if (!(raw instanceof Long startNano)) {
            return -1L;
        }
        long durationNano = System.nanoTime() - startNano;
        return Math.max(durationNano / 1_000_000L, 0L);
    }

    private String normalizeQuery(String query) {
        if (query == null || query.isBlank()) {
            return "-";
        }
        return query;
    }

    private String resolveClientIp(HttpServletRequest request) {
        String forwarded = request.getHeader("X-Forwarded-For");
        if (forwarded != null && !forwarded.isBlank()) {
            int commaIndex = forwarded.indexOf(',');
            return commaIndex > 0 ? forwarded.substring(0, commaIndex).trim() : forwarded.trim();
        }
        return valueOrDash(request.getRemoteAddr());
    }

    private String resolveCorrelationId(HttpServletRequest request, HttpServletResponse response, String headerName) {
        String fromRequest = request.getHeader(headerName);
        if (fromRequest != null && !fromRequest.isBlank()) {
            return fromRequest;
        }
        return valueOrDash(response.getHeader(headerName));
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

    private record ActorInfo(Long userId, String roleLabel) {
    }
}
