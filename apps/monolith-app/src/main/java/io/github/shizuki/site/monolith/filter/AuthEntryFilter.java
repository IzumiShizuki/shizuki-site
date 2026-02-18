package io.github.shizuki.site.monolith.filter;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.site.monolith.config.GatewayAuthProperties;
import io.github.shizuki.site.user.dto.auth.AuthIntrospectResponse;
import io.github.shizuki.site.user.service.AuthService;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletRequestWrapper;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.util.AntPathMatcher;
import org.springframework.util.StringUtils;
import org.springframework.web.filter.OncePerRequestFilter;

@Component
@Order(Ordered.HIGHEST_PRECEDENCE + 20)
public class AuthEntryFilter extends OncePerRequestFilter {

    private static final Logger LOGGER = LoggerFactory.getLogger(AuthEntryFilter.class);

    private static final String AUTHORIZATION = "Authorization";
    private static final String USER_ID = "X-User-Id";
    private static final String USER_GROUPS = "X-User-Groups";
    private static final String USER_PERMISSIONS = "X-User-Permissions";

    private final GatewayAuthProperties properties;
    private final AuthService authService;
    private final ObjectMapper objectMapper;
    private final AntPathMatcher antPathMatcher = new AntPathMatcher();
    private final Map<String, CachedAuthContext> tokenCache = new ConcurrentHashMap<>();

    public AuthEntryFilter(GatewayAuthProperties properties,
                           AuthService authService,
                           ObjectMapper objectMapper) {
        this.properties = properties;
        this.authService = authService;
        this.objectMapper = objectMapper;
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request,
                                    HttpServletResponse response,
                                    FilterChain filterChain) throws ServletException, IOException {
        if (!properties.isEnabled()) {
            filterChain.doFilter(request, response);
            return;
        }

        HttpServletRequest sanitizedRequest = stripUntrustedUserHeaders(request);
        String path = sanitizedRequest.getRequestURI();
        boolean guestPath = isGuestPath(path);

        if ("OPTIONS".equalsIgnoreCase(sanitizedRequest.getMethod()) || isPublicPath(path)) {
            filterChain.doFilter(sanitizedRequest, response);
            return;
        }

        String authorization = sanitizedRequest.getHeader(AUTHORIZATION);
        if (!StringUtils.hasText(authorization)) {
            if (guestPath) {
                filterChain.doFilter(withGuestHeaders(sanitizedRequest), response);
                return;
            }
            unauthorized(response, "Login required");
            return;
        }

        AuthContext cached = getCachedContext(authorization);
        if (cached != null) {
            filterChain.doFilter(withUserHeaders(sanitizedRequest, cached.userId(), cached.groups(), cached.permissions()), response);
            return;
        }

        try {
            AuthIntrospectResponse introspectResponse = authService.introspect();
            AuthContext context = parseAuthContext(introspectResponse);
            cacheContext(authorization, context);
            filterChain.doFilter(withUserHeaders(sanitizedRequest, context.userId(), context.groups(), context.permissions()), response);
        } catch (BusinessException ex) {
            tokenCache.remove(authorization);
            if (isTokenRejected(ex) && guestPath && shouldDowngradeGuestInvalidToken()) {
                LOGGER.warn("游客路径 token 被拒绝，降级为游客身份。reason={} path={} guest_path={} policy={}",
                    ex.getErrorCode().code(), path, true, currentGuestPolicy());
                filterChain.doFilter(withGuestHeaders(sanitizedRequest), response);
                return;
            }
            if (isTokenRejected(ex)) {
                LOGGER.warn("token 鉴权失败。reason={} path={} guest_path={} policy={}",
                    ex.getErrorCode().code(), path, guestPath, currentGuestPolicy());
                unauthorized(response, "Invalid token");
                return;
            }
            LOGGER.warn("网关鉴权发生业务异常。reason={} path={} guest_path={}",
                ex.getErrorCode().code(), path, guestPath);
            serviceUnavailable(response, "Auth service temporarily unavailable");
        } catch (Exception ex) {
            LOGGER.warn("网关鉴权发生未知异常。reason={} path={} guest_path={} policy={}",
                "unexpected", path, guestPath, currentGuestPolicy(), ex);
            serviceUnavailable(response, "Auth service temporarily unavailable");
        }
    }

    private AuthContext parseAuthContext(AuthIntrospectResponse response) {
        if (response == null || response.userId() == null || response.userId() <= 0) {
            throw new BusinessException(ErrorCode.UNAUTHORIZED, "Invalid token payload");
        }

        Set<String> groups = response.groups() == null ? Set.of() : response.groups();
        Set<String> permissions = response.permissions() == null ? Set.of() : response.permissions();
        return new AuthContext(response.userId(), groups, permissions);
    }

    private boolean isTokenRejected(BusinessException ex) {
        return ex.getErrorCode() == ErrorCode.UNAUTHORIZED || ex.getErrorCode() == ErrorCode.FORBIDDEN;
    }

    private boolean shouldDowngradeGuestInvalidToken() {
        return properties.getGuestInvalidTokenPolicy() == GatewayAuthProperties.GuestInvalidTokenPolicy.DOWNGRADE;
    }

    private String currentGuestPolicy() {
        return properties.getGuestInvalidTokenPolicy().name().toLowerCase();
    }

    private HttpServletRequest withGuestHeaders(HttpServletRequest request) {
        return withUserHeaders(request, 0L, Set.of("GUEST"), Set.of());
    }

    private HttpServletRequest withUserHeaders(HttpServletRequest request,
                                               Long userId,
                                               Set<String> groups,
                                               Set<String> permissions) {
        MutableHeaderRequest wrapper = new MutableHeaderRequest(request);
        wrapper.removeHeader(USER_ID);
        wrapper.removeHeader(USER_GROUPS);
        wrapper.removeHeader(USER_PERMISSIONS);
        wrapper.setHeader(USER_ID, String.valueOf(userId));
        wrapper.setHeader(USER_GROUPS, String.join(",", groups));
        wrapper.setHeader(USER_PERMISSIONS, String.join(",", permissions));
        return wrapper;
    }

    private HttpServletRequest stripUntrustedUserHeaders(HttpServletRequest request) {
        MutableHeaderRequest wrapper = new MutableHeaderRequest(request);
        wrapper.removeHeader(USER_ID);
        wrapper.removeHeader(USER_GROUPS);
        wrapper.removeHeader(USER_PERMISSIONS);
        return wrapper;
    }

    private boolean isPublicPath(String path) {
        return matchAny(path, properties.getPublicPaths());
    }

    private boolean isGuestPath(String path) {
        return matchAny(path, properties.getGuestPaths());
    }

    private boolean matchAny(String path, List<String> patterns) {
        if (patterns == null || patterns.isEmpty()) {
            return false;
        }
        return patterns.stream().anyMatch(pattern -> antPathMatcher.match(pattern, path));
    }

    private void cacheContext(String authorization, AuthContext context) {
        if (tokenCache.size() >= properties.getCacheMaxEntries()) {
            long now = System.currentTimeMillis();
            tokenCache.entrySet().removeIf(entry -> entry.getValue().expireAtMs() <= now);
            if (tokenCache.size() >= properties.getCacheMaxEntries()) {
                tokenCache.clear();
            }
        }
        long expireAtMs = System.currentTimeMillis() + properties.getCacheTtlSeconds() * 1000L;
        tokenCache.put(authorization, new CachedAuthContext(context, expireAtMs));
    }

    private AuthContext getCachedContext(String authorization) {
        CachedAuthContext cached = tokenCache.get(authorization);
        if (cached == null) {
            return null;
        }
        if (cached.expireAtMs() < System.currentTimeMillis()) {
            tokenCache.remove(authorization);
            return null;
        }
        return cached.context();
    }

    private void unauthorized(HttpServletResponse response, String message) throws IOException {
        writeProblem(response, HttpStatus.UNAUTHORIZED, "UNAUTHORIZED", message, "UNAUTHORIZED");
    }

    private void serviceUnavailable(HttpServletResponse response, String message) throws IOException {
        writeProblem(response, HttpStatus.SERVICE_UNAVAILABLE, "SERVICE_UNAVAILABLE", message, "SERVICE_UNAVAILABLE");
    }

    private void writeProblem(HttpServletResponse response,
                              HttpStatus status,
                              String title,
                              String detail,
                              String code) throws IOException {
        response.setStatus(status.value());
        response.setCharacterEncoding(StandardCharsets.UTF_8.name());
        response.setContentType(MediaType.APPLICATION_PROBLEM_JSON_VALUE);
        ProblemBody body = new ProblemBody(title, detail, code, status.value());
        response.getWriter().write(objectMapper.writeValueAsString(body));
    }

    private record ProblemBody(String title, String detail, String code, Integer status) {
    }

    private record AuthContext(Long userId, Set<String> groups, Set<String> permissions) {
    }

    private record CachedAuthContext(AuthContext context, long expireAtMs) {
    }

    private static final class MutableHeaderRequest extends HttpServletRequestWrapper {

        private final Map<String, List<String>> customHeaders = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);

        private MutableHeaderRequest(HttpServletRequest request) {
            super(request);
        }

        private void setHeader(String name, String value) {
            customHeaders.put(name, new ArrayList<>(List.of(value)));
        }

        private void removeHeader(String name) {
            customHeaders.put(name, List.of());
        }

        @Override
        public String getHeader(String name) {
            if (customHeaders.containsKey(name)) {
                List<String> values = customHeaders.get(name);
                return values == null || values.isEmpty() ? null : values.get(0);
            }
            return super.getHeader(name);
        }

        @Override
        public Enumeration<String> getHeaders(String name) {
            if (customHeaders.containsKey(name)) {
                List<String> values = customHeaders.get(name);
                if (values == null || values.isEmpty()) {
                    return Collections.emptyEnumeration();
                }
                return Collections.enumeration(values);
            }
            return super.getHeaders(name);
        }

        @Override
        public Enumeration<String> getHeaderNames() {
            Set<String> names = new LinkedHashSet<>();
            Enumeration<String> source = super.getHeaderNames();
            while (source.hasMoreElements()) {
                names.add(source.nextElement());
            }
            for (Map.Entry<String, List<String>> entry : customHeaders.entrySet()) {
                if (entry.getValue() != null && !entry.getValue().isEmpty()) {
                    names.add(entry.getKey());
                } else {
                    names.remove(entry.getKey());
                }
            }
            return Collections.enumeration(names);
        }
    }
}
