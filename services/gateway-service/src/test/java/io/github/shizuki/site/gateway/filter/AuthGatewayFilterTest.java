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

@ExtendWith(OutputCaptureExtension.class)
class AuthGatewayFilterTest {

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

    private WebClient webClientWithStatus(int status, String body, String contentType) {
        ExchangeFunction exchangeFunction = request -> Mono.just(
            ClientResponse.create(HttpStatus.valueOf(status))
                .header(HttpHeaders.CONTENT_TYPE, contentType)
                .body(body)
                .build()
        );
        return WebClient.builder().exchangeFunction(exchangeFunction).build();
    }

    private WebClient webClientNeverRespond() {
        ExchangeFunction exchangeFunction = request -> Mono.never();
        return WebClient.builder().exchangeFunction(exchangeFunction).build();
    }

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
