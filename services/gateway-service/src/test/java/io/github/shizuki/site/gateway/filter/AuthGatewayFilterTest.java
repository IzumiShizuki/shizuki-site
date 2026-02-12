package io.github.shizuki.site.gateway.filter;

import static org.assertj.core.api.Assertions.assertThat;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.shizuki.site.gateway.config.GatewayAuthProperties;
import java.time.Duration;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.system.CapturedOutput;
import org.springframework.boot.test.system.OutputCaptureExtension;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.mock.http.server.reactive.MockServerHttpRequest;
import org.springframework.mock.web.server.MockServerWebExchange;
import org.springframework.web.reactive.function.client.ClientResponse;
import org.springframework.web.reactive.function.client.ExchangeFunction;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * {@link AuthGatewayFilter} 鉴权过滤器测试。
 *
 * <p>覆盖 guest 降级策略、401/503 分层和结构化日志字段输出。
 */
@ExtendWith(OutputCaptureExtension.class)
class AuthGatewayFilterTest {

    /**
     * 场景：guest 路径 + 坏 token + downgrade 策略。
     * 期望：降级为游客并注入 GUEST 头信息。
     */
    @Test
    void shouldDowngradeGuestWhenTokenRejectedAndPolicyDowngrade(CapturedOutput output) {
        GatewayAuthProperties properties = baseProperties();
        properties.setGuestInvalidTokenPolicy("downgrade");
        AuthGatewayFilter filter = new AuthGatewayFilter(
            properties,
            new ObjectMapper(),
            webClientWithStatus(401, "token rejected", MediaType.TEXT_PLAIN_VALUE)
        );
        RecordingChain chain = new RecordingChain();
        ServerWebExchange exchange = MockServerWebExchange.from(
            MockServerHttpRequest.get("/api/v1/ai-sessions/session-1/messages")
                .header("Authorization", "Bearer bad-token")
                .build()
        );

        filter.filter(exchange, chain).block(Duration.ofSeconds(3));

        assertThat(chain.called).isTrue();
        assertThat(chain.exchange.getRequest().getHeaders().getFirst("X-User-Id")).isEqualTo("0");
        assertThat(chain.exchange.getRequest().getHeaders().getFirst("X-User-Groups")).contains("GUEST");
        assertThat(output.getOut()).contains("reason=upstream_4xx").contains("upstream_status=401");
    }

    /**
     * 场景：guest 路径 + 坏 token + reject 策略。
     * 期望：直接返回 401，不做降级放行。
     */
    @Test
    void shouldRejectGuestWhenTokenRejectedAndPolicyReject() {
        GatewayAuthProperties properties = baseProperties();
        properties.setGuestInvalidTokenPolicy("reject");
        AuthGatewayFilter filter = new AuthGatewayFilter(
            properties,
            new ObjectMapper(),
            webClientWithStatus(401, "token rejected", MediaType.TEXT_PLAIN_VALUE)
        );
        RecordingChain chain = new RecordingChain();
        ServerWebExchange exchange = MockServerWebExchange.from(
            MockServerHttpRequest.get("/api/v1/ai-sessions/session-1/messages")
                .header("Authorization", "Bearer bad-token")
                .build()
        );

        filter.filter(exchange, chain).block(Duration.ofSeconds(3));

        assertThat(chain.called).isFalse();
        assertThat(exchange.getResponse().getStatusCode()).isEqualTo(HttpStatus.UNAUTHORIZED);
    }

    /**
     * 场景：非 guest 路径 + 坏 token。
     * 期望：返回 401。
     */
    @Test
    void shouldRejectNonGuestWhenTokenRejected() {
        GatewayAuthProperties properties = baseProperties();
        properties.setGuestInvalidTokenPolicy("downgrade");
        AuthGatewayFilter filter = new AuthGatewayFilter(
            properties,
            new ObjectMapper(),
            webClientWithStatus(401, "token rejected", MediaType.TEXT_PLAIN_VALUE)
        );
        RecordingChain chain = new RecordingChain();
        ServerWebExchange exchange = MockServerWebExchange.from(
            MockServerHttpRequest.get("/api/v1/ai-quotas/me")
                .header("Authorization", "Bearer bad-token")
                .build()
        );

        filter.filter(exchange, chain).block(Duration.ofSeconds(3));

        assertThat(chain.called).isFalse();
        assertThat(exchange.getResponse().getStatusCode()).isEqualTo(HttpStatus.UNAUTHORIZED);
    }

    /**
     * 场景：introspect 上游返回 5xx。
     * 期望：网关返回 503。
     */
    @Test
    void shouldReturn503WhenIntrospectServerError() {
        GatewayAuthProperties properties = baseProperties();
        AuthGatewayFilter filter = new AuthGatewayFilter(
            properties,
            new ObjectMapper(),
            webClientWithStatus(503, "upstream unavailable", MediaType.TEXT_PLAIN_VALUE)
        );
        RecordingChain chain = new RecordingChain();
        ServerWebExchange exchange = MockServerWebExchange.from(
            MockServerHttpRequest.get("/api/v1/ai-quotas/me")
                .header("Authorization", "Bearer any-token")
                .build()
        );

        filter.filter(exchange, chain).block(Duration.ofSeconds(3));

        assertThat(chain.called).isFalse();
        assertThat(exchange.getResponse().getStatusCode()).isEqualTo(HttpStatus.SERVICE_UNAVAILABLE);
    }

    /**
     * 场景：introspect 超时。
     * 期望：返回 503，日志包含 reason/upstream_status 结构化字段。
     */
    @Test
    void shouldLogStructuredFieldsWhenIntrospectTimeout(CapturedOutput output) {
        GatewayAuthProperties properties = baseProperties();
        properties.setIntrospectTimeoutMs(200L);
        properties.setIntrospectRetryCount(0);
        AuthGatewayFilter filter = new AuthGatewayFilter(
            properties,
            new ObjectMapper(),
            webClientNeverRespond()
        );
        RecordingChain chain = new RecordingChain();
        ServerWebExchange exchange = MockServerWebExchange.from(
            MockServerHttpRequest.get("/api/v1/ai-quotas/me")
                .header("Authorization", "Bearer any-token")
                .build()
        );

        filter.filter(exchange, chain).block(Duration.ofSeconds(3));

        assertThat(chain.called).isFalse();
        assertThat(exchange.getResponse().getStatusCode()).isEqualTo(HttpStatus.SERVICE_UNAVAILABLE);
        assertThat(output.getOut()).contains("reason=timeout").contains("upstream_status=-1");
    }

    /**
     * 场景：introspect 返回空 groups。
     * 期望：不再兜底 USER，保持空分组语义。
     */
    @Test
    void shouldKeepGroupsEmptyWhenIntrospectResponseGroupsEmpty() {
        GatewayAuthProperties properties = baseProperties();
        String body = """
            {"code":"OK","message":"ok","data":{"user_id":7,"groups":[],"permissions":[]}}
            """;
        AuthGatewayFilter filter = new AuthGatewayFilter(
            properties,
            new ObjectMapper(),
            webClientWithStatus(200, body, MediaType.APPLICATION_JSON_VALUE)
        );
        RecordingChain chain = new RecordingChain();
        ServerWebExchange exchange = MockServerWebExchange.from(
            MockServerHttpRequest.get("/api/v1/ai-quotas/me")
                .header("Authorization", "Bearer token-1")
                .build()
        );

        filter.filter(exchange, chain).block(Duration.ofSeconds(3));

        assertThat(chain.called).isTrue();
        assertThat(chain.exchange.getRequest().getHeaders().getFirst("X-User-Groups")).isBlank();
    }

    /**
     * 测试辅助：构造一组默认网关鉴权配置。
     */
    private GatewayAuthProperties baseProperties() {
        GatewayAuthProperties properties = new GatewayAuthProperties();
        properties.setEnabled(true);
        properties.setUserServiceIntrospectUrl("http://localhost:8081/api/v1/auth/introspect");
        properties.setIntrospectTimeoutMs(2000L);
        properties.setIntrospectRetryCount(0);
        properties.setIntrospectRetryBackoffMs(50L);
        properties.setGuestPaths(List.of("/api/v1/ai-sessions/**"));
        properties.setPublicPaths(List.of("/api/v1/auth/login"));
        properties.setGuestInvalidTokenPolicy("downgrade");
        return properties;
    }

    /**
     * 测试辅助：构造固定状态码的 mock WebClient。
     */
    private WebClient webClientWithStatus(int status, String body, String contentType) {
        ExchangeFunction exchangeFunction = request -> Mono.just(
            ClientResponse.create(HttpStatus.valueOf(status))
                .header(HttpHeaders.CONTENT_TYPE, contentType)
                .body(body)
                .build()
        );
        return WebClient.builder().exchangeFunction(exchangeFunction).build();
    }

    /**
     * 测试辅助：构造永不返回结果的 WebClient（用于超时分支）。
     */
    private WebClient webClientNeverRespond() {
        ExchangeFunction exchangeFunction = request -> Mono.never();
        return WebClient.builder().exchangeFunction(exchangeFunction).build();
    }

    /**
     * 记录下游 filter 是否被调用及最终请求头。
     */
    private static class RecordingChain implements GatewayFilterChain {

        private boolean called;
        private ServerWebExchange exchange;

        @Override
        public Mono<Void> filter(ServerWebExchange exchange) {
            this.called = true;
            this.exchange = exchange;
            return Mono.empty();
        }
    }
}
