package io.github.shizuki.site.gateway.filter;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.shizuki.site.gateway.config.GatewayAuthProperties;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Set;
import org.springframework.core.Ordered;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.util.AntPathMatcher;
import org.springframework.util.StringUtils;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

@Component
public class AuthGatewayFilter implements org.springframework.cloud.gateway.filter.GlobalFilter, Ordered {

    private static final String AUTHORIZATION = "Authorization";
    private static final String USER_ID = "X-User-Id";
    private static final String USER_GROUPS = "X-User-Groups";
    private static final String USER_PERMISSIONS = "X-User-Permissions";

    private final GatewayAuthProperties properties;
    private final WebClient webClient;
    private final AntPathMatcher antPathMatcher = new AntPathMatcher();
    private final ObjectMapper objectMapper;

    public AuthGatewayFilter(GatewayAuthProperties properties, ObjectMapper objectMapper) {
        this.properties = properties;
        this.webClient = WebClient.builder().build();
        this.objectMapper = objectMapper;
    }

    @Override
    public Mono<Void> filter(ServerWebExchange exchange,
                             org.springframework.cloud.gateway.filter.GatewayFilterChain chain) {
        if (!properties.isEnabled()) {
            return chain.filter(exchange);
        }

        String path = exchange.getRequest().getPath().value();
        if ("OPTIONS".equalsIgnoreCase(exchange.getRequest().getMethod().name()) || isPublicPath(path)) {
            return chain.filter(exchange);
        }

        String authorization = exchange.getRequest().getHeaders().getFirst(AUTHORIZATION);
        if (!StringUtils.hasText(authorization)) {
            if (isGuestPath(path)) {
                return chain.filter(withUserHeaders(exchange, 0L, Set.of("GUEST"), Set.of()));
            }
            return unauthorized(exchange, "Login required");
        }

        return webClient.get()
            .uri(properties.getUserServiceIntrospectUrl())
            .header(AUTHORIZATION, authorization)
            .retrieve()
            .bodyToMono(new ParameterizedTypeReference<ApiResponse<AuthIntrospectResponse>>() {
            })
            .flatMap(response -> {
                if (response == null || response.data == null || response.data.userId == null) {
                    return unauthorized(exchange, "Invalid token");
                }
                return chain.filter(withUserHeaders(
                    exchange,
                    response.data.userId,
                    response.data.groups == null ? Set.of("USER") : response.data.groups,
                    response.data.permissions == null ? Set.of() : response.data.permissions
                ));
            })
            .onErrorResume(ex -> unauthorized(exchange, "Token introspection failed"));
    }

    @Override
    public int getOrder() {
        return -90;
    }

    private ServerWebExchange withUserHeaders(ServerWebExchange exchange,
                                              Long userId,
                                              Set<String> groups,
                                              Set<String> permissions) {
        return exchange.mutate().request(exchange.getRequest().mutate()
            .header(USER_ID, String.valueOf(userId))
            .header(USER_GROUPS, String.join(",", groups))
            .header(USER_PERMISSIONS, String.join(",", permissions))
            .build()).build();
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

    private Mono<Void> unauthorized(ServerWebExchange exchange, String message) {
        ServerHttpResponse response = exchange.getResponse();
        response.setStatusCode(HttpStatus.UNAUTHORIZED);
        response.getHeaders().setContentType(MediaType.APPLICATION_PROBLEM_JSON);
        ProblemBody body = new ProblemBody("UNAUTHORIZED", message, "UNAUTHORIZED");
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

        public Long userId;
        public Set<String> groups;
        public Set<String> permissions;
    }

    private record ProblemBody(String title, String detail, String code) {
    }
}
