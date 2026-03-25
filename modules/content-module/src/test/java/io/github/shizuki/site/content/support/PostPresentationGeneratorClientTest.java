package io.github.shizuki.site.content.support;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.sun.net.httpserver.HttpServer;
import io.github.shizuki.common.core.error.BusinessException;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.concurrent.Executors;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.web.client.RestClient;

class PostPresentationGeneratorClientTest {

    private HttpServer server;

    @AfterEach
    void tearDown() {
        if (server != null) {
            server.stop(0);
            server = null;
        }
    }

    @Test
    void shouldRenderPptxSuccessfully() throws Exception {
        byte[] payload = "ppt-bytes".getBytes(StandardCharsets.UTF_8);
        startServer((exchange) -> {
            String body = """
                {"pptBase64":"%s","slideCount":6}
                """.formatted(Base64.getEncoder().encodeToString(payload));
            writeJson(exchange, 200, body);
        });

        PostPresentationGeneratorClient client =
            new PostPresentationGeneratorClient(RestClient.builder(), baseUrl(), 2000L, 2000L);

        PostPresentationGeneratorClient.PresentationRenderResult result = client.renderPptx("# deck", "deck");

        assertArrayEquals(payload, result.pptBytes());
        assertEquals(6, result.slideCount());
    }

    @Test
    void shouldExposeGeneratorFailureMessage() throws Exception {
        startServer((exchange) -> writeJson(exchange, 500, "{\"message\":\"slidev export failed\"}"));

        PostPresentationGeneratorClient client =
            new PostPresentationGeneratorClient(RestClient.builder(), baseUrl(), 2000L, 2000L);

        BusinessException exception =
            assertThrows(BusinessException.class, () -> client.renderPptx("# deck", "deck"));

        assertEquals("slidev export failed", exception.getMessage());
    }

    @Test
    void shouldReturnUnavailableWhenGeneratorTimesOut() throws Exception {
        startServer((exchange) -> {
            try {
                Thread.sleep(250L);
            } catch (InterruptedException ignored) {
                Thread.currentThread().interrupt();
            }
            writeJson(exchange, 200, "{\"pptBase64\":\"\",\"slideCount\":0}");
        });

        PostPresentationGeneratorClient client =
            new PostPresentationGeneratorClient(RestClient.builder(), baseUrl(), 2000L, 50L);

        BusinessException exception =
            assertThrows(BusinessException.class, () -> client.renderPptx("# deck", "deck"));

        assertTrue(exception.getMessage().contains("unavailable"));
    }

    @Test
    void shouldRejectMissingConfiguration() {
        PostPresentationGeneratorClient client =
            new PostPresentationGeneratorClient(RestClient.builder(), "", 2000L, 2000L);

        BusinessException exception =
            assertThrows(BusinessException.class, () -> client.renderPptx("# deck", "deck"));

        assertEquals("Presentation generator is not configured", exception.getMessage());
    }

    private void startServer(ExchangeHandler handler) throws IOException {
        server = HttpServer.create(new InetSocketAddress(0), 0);
        server.createContext("/render/pptx", exchange -> {
            try {
                handler.handle(exchange);
            } finally {
                exchange.close();
            }
        });
        server.setExecutor(Executors.newCachedThreadPool());
        server.start();
    }

    private String baseUrl() {
        return "http://127.0.0.1:" + server.getAddress().getPort();
    }

    private void writeJson(com.sun.net.httpserver.HttpExchange exchange, int statusCode, String body) throws IOException {
        byte[] bytes = body.getBytes(StandardCharsets.UTF_8);
        exchange.getResponseHeaders().add("Content-Type", "application/json; charset=utf-8");
        exchange.sendResponseHeaders(statusCode, bytes.length);
        try (OutputStream outputStream = exchange.getResponseBody()) {
            outputStream.write(bytes);
        }
    }

    @FunctionalInterface
    private interface ExchangeHandler {
        void handle(com.sun.net.httpserver.HttpExchange exchange) throws IOException;
    }
}
