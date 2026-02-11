package io.github.shizuki.site.gateway.filter;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.shizuki.site.gateway.config.GatewayAuthProperties;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeoutException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.Ordered;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.util.AntPathMatcher;
import org.springframework.util.StringUtils;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClientRequestException;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;
import reactor.util.retry.Retry;

@Component
public class AuthGatewayFilter implements org.springframework.cloud.gateway.filter.GlobalFilter, Ordered {

    private static final Logger LOGGER = LoggerFactory.getLogger(AuthGatewayFilter.class);

    private static final String AUTHORIZATION = "Authorization";
    private static final String USER_ID = "X-User-Id";
    private static final String USER_GROUPS = "X-User-Groups";
    private static final String USER_PERMISSIONS = "X-User-Permissions";

    private final GatewayAuthProperties properties;
    private final WebClient webClient;
    private final AntPathMatcher antPathMatcher = new AntPathMatcher();
    private final ObjectMapper objectMapper;
    private final Map<String, CachedAuthContext> tokenCache = new ConcurrentHashMap<>();

    @Autowired
    public AuthGatewayFilter(GatewayAuthProperties properties,
                             ObjectMapper objectMapper,
                             WebClient.Builder webClientBuilder) {
        this(properties, objectMapper, webClientBuilder.build());
    }

    AuthGatewayFilter(GatewayAuthProperties properties, ObjectMapper objectMapper, WebClient webClient) {
        this.properties = properties;
        this.webClient = webClient;
        this.objectMapper = objectMapper;
    }

    /**
     * 网关统一鉴权流程：
     * 1. 所有请求先清理外部传入的 X-User-* 头，避免伪造身份透传；
     * 2. 公共路径放行；
     * 3. guest 路径注入 GUEST 上下文；
     * 4. 其余路径只根据 Authorization 调用 introspect，成功后覆盖注入可信用户头。
     */
    @Override
    public Mono<Void> filter(ServerWebExchange exchange,
                             org.springframework.cloud.gateway.filter.GatewayFilterChain chain) {
        if (!properties.isEnabled()) {
            return chain.filter(exchange);
        }

        ServerWebExchange sanitizedExchange = stripUntrustedUserHeaders(exchange);
        String path = sanitizedExchange.getRequest().getPath().value();
        boolean guestPath = isGuestPath(path);

        if ("OPTIONS".equalsIgnoreCase(sanitizedExchange.getRequest().getMethod().name()) || isPublicPath(path)) {
            return chain.filter(sanitizedExchange);
        }

        String authorization = sanitizedExchange.getRequest().getHeaders().getFirst(AUTHORIZATION);
        if (!StringUtils.hasText(authorization)) {
            if (guestPath) {
                return chain.filter(withGuestHeaders(sanitizedExchange));
            }
            return unauthorized(sanitizedExchange, "Login required");
        }

        AuthContext cached = getCachedContext(authorization);
        if (cached != null) {
            return chain.filter(withUserHeaders(sanitizedExchange, cached.userId(), cached.groups(), cached.permissions()));
        }

        return introspect(authorization)
            .flatMap(context -> {
                cacheContext(authorization, context);
                return chain.filter(withUserHeaders(sanitizedExchange, context.userId(), context.groups(), context.permissions()));
            })
            .onErrorResume(TokenRejectedException.class,
                ex -> onTokenRejected(ex, sanitizedExchange, chain, authorization, path, guestPath))
            .onErrorResume(TransientIntrospectException.class,
                ex -> onTransientError(ex, sanitizedExchange, path, guestPath))
            .onErrorResume(ex -> {
                LOGGER.warn("Auth introspect unexpected failure. reason={} upstream_status={} path={} guest_path={} policy={}",
                    "unexpected", -1, path, guestPath, currentGuestPolicy(), ex);
                return serviceUnavailable(sanitizedExchange, "Auth service temporarily unavailable");
            });
    }

    @Override
    public int getOrder() {
        return -90;
    }

    private Mono<AuthContext> introspect(String authorization) {
        Mono<AuthContext> introspectMono = webClient.get()
            .uri(properties.getUserServiceIntrospectUrl())
            .header(AUTHORIZATION, authorization)
            .retrieve()
            .onStatus(HttpStatusCode::is4xxClientError,
                response -> response.bodyToMono(String.class)
                    .defaultIfEmpty("token rejected")
                    .flatMap(message ->
                        Mono.error(new TokenRejectedException("upstream_4xx", response.statusCode().value(), message))))
            .onStatus(HttpStatusCode::is5xxServerError,
                response -> Mono.error(new TransientIntrospectException(
                    "upstream_5xx", response.statusCode().value(), "introspect server error")))
            .bodyToMono(new ParameterizedTypeReference<ApiResponse<AuthIntrospectResponse>>() {
            })
            .timeout(Duration.ofMillis(properties.getIntrospectTimeoutMs()))
            .onErrorMap(TimeoutException.class,
                ex -> new TransientIntrospectException("timeout", -1, "introspect timeout", ex))
            .onErrorMap(WebClientRequestException.class,
                ex -> new TransientIntrospectException("network", -1, "introspect network error", ex))
            .map(this::parseAuthContext);

        if (properties.getIntrospectRetryCount() <= 0) {
            return introspectMono;
        }

        return introspectMono.retryWhen(
            Retry.fixedDelay(properties.getIntrospectRetryCount(),
                    Duration.ofMillis(properties.getIntrospectRetryBackoffMs()))
                .filter(this::isRetriableIntrospectError)
                .onRetryExhaustedThrow((spec, signal) -> signal.failure())
        );
    }

    private boolean isRetriableIntrospectError(Throwable throwable) {
        return throwable instanceof TransientIntrospectException;
    }

    private AuthContext parseAuthContext(ApiResponse<AuthIntrospectResponse> response) {
        if (response == null || response.data == null || response.data.userId == null || response.data.userId <= 0) {
            throw new TransientIntrospectException("invalid_payload", -1, "invalid introspect payload");
        }

        Set<String> groups = response.data.groups == null || response.data.groups.isEmpty()
            ? Set.of("USER")
            : response.data.groups;
        Set<String> permissions = response.data.permissions == null ? Set.of() : response.data.permissions;
        return new AuthContext(response.data.userId, groups, permissions);
    }

    private Mono<Void> onTokenRejected(TokenRejectedException exception,
                                       ServerWebExchange exchange,
                                       org.springframework.cloud.gateway.filter.GatewayFilterChain chain,
                                       String authorization,
                                       String path,
                                       boolean guestPath) {
        tokenCache.remove(authorization);
        if (guestPath && shouldDowngradeGuestInvalidToken()) {
            LOGGER.warn("Guest token rejected, downgrade to guest. reason={} upstream_status={} path={} guest_path={} policy={}",
                exception.reason(), exception.upstreamStatus(), path, true, currentGuestPolicy());
            return chain.filter(withGuestHeaders(exchange));
        }

        LOGGER.warn("Token rejected. reason={} upstream_status={} path={} guest_path={} policy={}",
            exception.reason(), exception.upstreamStatus(), path, guestPath, currentGuestPolicy());
        return unauthorized(exchange, "Invalid token");
    }

    private Mono<Void> onTransientError(TransientIntrospectException exception,
                                        ServerWebExchange exchange,
                                        String path,
                                        boolean guestPath) {
        LOGGER.warn("Auth introspect transient failure. reason={} upstream_status={} path={} guest_path={} policy={}",
            exception.reason(), exception.upstreamStatus(), path, guestPath, currentGuestPolicy());
        return serviceUnavailable(exchange, "Auth service temporarily unavailable");
    }

    private boolean shouldDowngradeGuestInvalidToken() {
        return properties.getGuestInvalidTokenPolicy() == GatewayAuthProperties.GuestInvalidTokenPolicy.DOWNGRADE;
    }

    private String currentGuestPolicy() {
        return properties.getGuestInvalidTokenPolicy().name().toLowerCase();
    }

    private ServerWebExchange withGuestHeaders(ServerWebExchange exchange) {
        return withUserHeaders(exchange, 0L, Set.of("GUEST"), Set.of());
    }

    private ServerWebExchange withUserHeaders(ServerWebExchange exchange,
                                              Long userId,
                                              Set<String> groups,
                                              Set<String> permissions) {
        return exchange.mutate().request(exchange.getRequest().mutate().headers(headers -> {
            headers.remove(USER_ID);
            headers.remove(USER_GROUPS);
            headers.remove(USER_PERMISSIONS);
            headers.set(USER_ID, String.valueOf(userId));
            headers.set(USER_GROUPS, String.join(",", groups));
            headers.set(USER_PERMISSIONS, String.join(",", permissions));
        }).build()).build();
    }

    private ServerWebExchange stripUntrustedUserHeaders(ServerWebExchange exchange) {
        return exchange.mutate().request(exchange.getRequest().mutate().headers(headers -> {
            headers.remove(USER_ID);
            headers.remove(USER_GROUPS);
            headers.remove(USER_PERMISSIONS);
        }).build()).build();
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
            // 上限保护：按过期时间清理，避免 token 缓存无限膨胀。
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

    private Mono<Void> unauthorized(ServerWebExchange exchange, String message) {
        return writeProblem(exchange, HttpStatus.UNAUTHORIZED, "UNAUTHORIZED", message, "UNAUTHORIZED");
    }

    private Mono<Void> serviceUnavailable(ServerWebExchange exchange, String message) {
        return writeProblem(exchange, HttpStatus.SERVICE_UNAVAILABLE, "SERVICE_UNAVAILABLE", message, "SERVICE_UNAVAILABLE");
    }

    private Mono<Void> writeProblem(ServerWebExchange exchange,
                                    HttpStatus status,
                                    String title,
                                    String detail,
                                    String code) {
        ServerHttpResponse response = exchange.getResponse();
        response.setStatusCode(status);
        response.getHeaders().setContentType(MediaType.APPLICATION_PROBLEM_JSON);
        ProblemBody body = new ProblemBody(title, detail, code, status.value());
        try {
            byte[] bytes = objectMapper.writeValueAsString(body).getBytes(StandardCharsets.UTF_8);
            return response.writeWith(Mono.just(response.bufferFactory().wrap(bytes)));
        } catch (Exception ex) {
            return response.setComplete();
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    private static class ApiResponse<T> {

        public String code;
        public String message;
        public T data;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    private static class AuthIntrospectResponse {

        @JsonProperty("user_id")
        public Long userId;
        public Set<String> groups;
        public Set<String> permissions;
    }

    private record ProblemBody(String title, String detail, String code, Integer status) {
    }

    private record AuthContext(Long userId, Set<String> groups, Set<String> permissions) {
    }

    private record CachedAuthContext(AuthContext context, long expireAtMs) {
    }

    private static class TokenRejectedException extends RuntimeException {

        private final String reason;
        private final int upstreamStatus;

        TokenRejectedException(String reason, int upstreamStatus, String message) {
            super(message);
            this.reason = reason;
            this.upstreamStatus = upstreamStatus;
        }

        String reason() {
            return reason;
        }

        int upstreamStatus() {
            return upstreamStatus;
        }
    }

    private static class TransientIntrospectException extends RuntimeException {

        private final String reason;
        private final int upstreamStatus;

        TransientIntrospectException(String reason, int upstreamStatus, String message) {
            super(message);
            this.reason = reason;
            this.upstreamStatus = upstreamStatus;
        }

        TransientIntrospectException(String reason, int upstreamStatus, String message, Throwable cause) {
            super(message, cause);
            this.reason = reason;
            this.upstreamStatus = upstreamStatus;
        }

        String reason() {
            return reason;
        }

        int upstreamStatus() {
            return upstreamStatus;
        }
    }
}
