package io.github.shizuki.site.ai.client;

import static org.assertj.core.api.Assertions.assertThat;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import io.github.shizuki.common.core.resilience.SpringRetryExecutor;
import io.github.shizuki.site.ai.config.AiUserServiceProperties;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import org.junit.jupiter.api.Test;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestClient;

class UserQuotaClientTest {

    private static final String RESOLVE_PATH = "/api/v1/internal/quotas/resolve";

    @Test
    void shouldFallbackWithoutRetryOn4xx() throws Exception {
        AtomicInteger attempts = new AtomicInteger(0);
        HttpServer server = startServer(exchange -> {
            attempts.incrementAndGet();
            respond(exchange, 400, "bad request", MediaType.TEXT_PLAIN_VALUE);
        });
        try {
            AiUserServiceProperties properties = baseProperties(serverBaseUrl(server));
            properties.setQuotaResolveRetryCount(2);
            UserQuotaClient client = new UserQuotaClient(properties, RestClient.builder(), new SpringRetryExecutor());

            Long value = client.resolveQuota("ai_round_total", Set.of("USER"), 5L);

            assertThat(value).isEqualTo(5L);
            assertThat(attempts.get()).isEqualTo(1);
        } finally {
            server.stop(0);
        }
    }

    @Test
    void shouldRetryAndSucceedWhenUpstreamRecoversFrom5xx() throws Exception {
        AtomicInteger attempts = new AtomicInteger(0);
        HttpServer server = startServer(exchange -> {
            int current = attempts.incrementAndGet();
            if (current == 1) {
                respond(exchange, 503, "upstream unavailable", MediaType.TEXT_PLAIN_VALUE);
                return;
            }
            respond(exchange, 200, "{\"code\":\"OK\",\"message\":\"OK\",\"data\":{\"value\":9}}", MediaType.APPLICATION_JSON_VALUE);
        });
        try {
            AiUserServiceProperties properties = baseProperties(serverBaseUrl(server));
            properties.setQuotaResolveRetryCount(2);
            UserQuotaClient client = new UserQuotaClient(properties, RestClient.builder(), new SpringRetryExecutor());

            Long value = client.resolveQuota("ai_round_total", Set.of("USER"), 5L);

            assertThat(value).isEqualTo(9L);
            assertThat(attempts.get()).isEqualTo(2);
        } finally {
            server.stop(0);
        }
    }

    @Test
    void shouldFallbackAfterRetryExhaustedOn5xx() throws Exception {
        AtomicInteger attempts = new AtomicInteger(0);
        HttpServer server = startServer(exchange -> {
            attempts.incrementAndGet();
            respond(exchange, 503, "upstream unavailable", MediaType.TEXT_PLAIN_VALUE);
        });
        try {
            AiUserServiceProperties properties = baseProperties(serverBaseUrl(server));
            properties.setQuotaResolveRetryCount(2);
            UserQuotaClient client = new UserQuotaClient(properties, RestClient.builder(), new SpringRetryExecutor());

            Long value = client.resolveQuota("ai_round_total", Set.of("USER"), 5L);

            assertThat(value).isEqualTo(5L);
            assertThat(attempts.get()).isEqualTo(3);
        } finally {
            server.stop(0);
        }
    }

    private AiUserServiceProperties baseProperties(String serviceUri) {
        AiUserServiceProperties properties = new AiUserServiceProperties();
        properties.setServiceUri(serviceUri);
        properties.setQuotaResolveConnectTimeoutMs(300L);
        properties.setQuotaResolveTimeoutMs(500L);
        properties.setQuotaResolveRetryBackoffMs(20L);
        properties.setQuotaResolveRetryMaxBackoffMs(80L);
        return properties;
    }

    private HttpServer startServer(HttpHandler handler) throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(0), 0);
        server.createContext(RESOLVE_PATH, handler);
        server.start();
        return server;
    }

    private String serverBaseUrl(HttpServer server) {
        return "http://127.0.0.1:" + server.getAddress().getPort();
    }

    private void respond(HttpExchange exchange, int status, String body, String contentType) throws IOException {
        byte[] bytes = body.getBytes(StandardCharsets.UTF_8);
        exchange.getResponseHeaders().set("Content-Type", contentType);
        exchange.sendResponseHeaders(status, bytes.length);
        exchange.getResponseBody().write(bytes);
        exchange.close();
    }
}
