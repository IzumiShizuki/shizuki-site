package io.github.shizuki.site.content.support;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.util.concurrent.Executors;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.RestClientResponseException;

class LightAppBalanceBillSyncAgentClientTest {

    private HttpServer server;

    @AfterEach
    void tearDown() {
        if (server != null) {
            server.stop(0);
            server = null;
        }
    }

    @Test
    void shouldParseJsonFromOctetStreamResponse() throws Exception {
        startServer((exchange) -> writeResponse(
            exchange,
            200,
            "application/octet-stream",
            """
                {
                  "status": "FAILED",
                  "rawFilePath": "",
                  "transactions": [],
                  "reauthRequired": false,
                  "failureReason": "download timeout"
                }
                """
        ));
        LightAppBalanceBillSyncAgentClient client = client();

        LightAppBalanceBillSyncAgentClient.SyncResult result = client.sync(
            "alipay",
            "{}",
            LocalDateTime.of(2026, 7, 1, 0, 0),
            LocalDateTime.of(2026, 7, 1, 23, 59),
            "Asia/Shanghai",
            "/tmp/archive"
        );

        assertEquals("FAILED", result.status());
        assertEquals("download timeout", result.failureReason());
        assertEquals(0, result.transactions().size());
    }

    @Test
    void shouldExposeRemoteMessageOnNotFound() throws Exception {
        startServer((exchange) -> writeResponse(
            exchange,
            404,
            "application/json; charset=utf-8",
            """
                {
                  "message": "Bind session not found"
                }
                """
        ));
        LightAppBalanceBillSyncAgentClient client = client();

        RestClientResponseException exception = assertThrows(
            RestClientResponseException.class,
            () -> client.getBindSessionStatus("alipay", "missing-session")
        );

        assertEquals(404, exception.getStatusCode().value());
        assertEquals("Bind session not found", exception.getMessage());
    }

    private LightAppBalanceBillSyncAgentClient client() {
        LightAppBalanceBillSyncProperties properties = new LightAppBalanceBillSyncProperties();
        properties.setEnabled(true);
        properties.setApiBaseUrl("http://127.0.0.1:" + server.getAddress().getPort());
        properties.setTimezone("Asia/Shanghai");
        properties.setConnectTimeoutMs(2000L);
        properties.setReadTimeoutMs(2000L);
        return new LightAppBalanceBillSyncAgentClient(properties, RestClient.builder(), new ObjectMapper());
    }

    private void startServer(ExchangeHandler handler) throws IOException {
        server = HttpServer.create(new InetSocketAddress(0), 0);
        server.createContext("/", exchange -> {
            try {
                handler.handle(exchange);
            } finally {
                exchange.close();
            }
        });
        server.setExecutor(Executors.newCachedThreadPool());
        server.start();
    }

    private void writeResponse(com.sun.net.httpserver.HttpExchange exchange,
                               int statusCode,
                               String contentType,
                               String body) throws IOException {
        byte[] bytes = body.getBytes(StandardCharsets.UTF_8);
        exchange.getResponseHeaders().add("Content-Type", contentType);
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
