package io.github.shizuki.site.media.integration;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import io.github.shizuki.site.media.config.AsmrMusicProperties;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.web.client.RestClient;

class AsmrMusicProviderFailoverTest {

    @Test
    void shouldFailoverAndPromoteHealthySourceWhenPrimaryReturns503() throws Exception {
        AtomicInteger primaryCalls = new AtomicInteger(0);
        AtomicInteger secondaryCalls = new AtomicInteger(0);
        HttpServer primaryServer = createServer("/api/work/42", exchange -> {
            primaryCalls.incrementAndGet();
            writeJson(exchange, 503, "{\"code\":503,\"msg\":\"upstream down\"}");
        });
        HttpServer secondaryServer = createServer("/api/work/42", exchange -> {
            secondaryCalls.incrementAndGet();
            writeJson(exchange, 200, "{\"id\":42,\"title\":\"work-42\",\"name\":\"asmr\"}");
        });
        try {
            AsmrMusicProperties properties = new AsmrMusicProperties();
            String primaryBase = baseUrl(primaryServer);
            String secondaryBase = baseUrl(secondaryServer);
            properties.setServer(primaryBase);
            properties.setBaseUrl(primaryBase);
            properties.setBaseUrls(List.of(primaryBase, secondaryBase));
            AsmrMusicProvider provider = new AsmrMusicProvider(properties, RestClient.builder(), new ObjectMapper());

            AsmrMusicProvider.WorkSummary first = provider.getWork(42);
            AsmrMusicProvider.WorkSummary second = provider.getWork(42);

            Assertions.assertEquals(42L, first.id());
            Assertions.assertEquals(42L, second.id());
            Assertions.assertEquals(1, primaryCalls.get());
            Assertions.assertEquals(2, secondaryCalls.get());
        } finally {
            primaryServer.stop(0);
            secondaryServer.stop(0);
        }
    }

    @Test
    void shouldIgnoreUnknownServerConfigWhenNotInSourcePool() throws Exception {
        AtomicInteger calls = new AtomicInteger(0);
        HttpServer server = createServer("/api/work/7", exchange -> {
            calls.incrementAndGet();
            writeJson(exchange, 200, "{\"id\":7,\"title\":\"work-7\",\"name\":\"asmr\"}");
        });
        try {
            AsmrMusicProperties properties = new AsmrMusicProperties();
            properties.setServer("https://not-in-pool.example");
            properties.setBaseUrl("");
            properties.setBaseUrls(List.of(baseUrl(server)));
            AsmrMusicProvider provider = new AsmrMusicProvider(properties, RestClient.builder(), new ObjectMapper());

            AsmrMusicProvider.WorkSummary work = provider.getWork(7);

            Assertions.assertEquals(7L, work.id());
            Assertions.assertEquals(1, calls.get());
        } finally {
            server.stop(0);
        }
    }

    private HttpServer createServer(String path, HttpHandler handler) throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress("127.0.0.1", 0), 0);
        server.createContext(path, handler);
        server.start();
        return server;
    }

    private String baseUrl(HttpServer server) {
        return "http://127.0.0.1:" + server.getAddress().getPort();
    }

    private void writeJson(HttpExchange exchange, int status, String body) throws IOException {
        byte[] bytes = body.getBytes(StandardCharsets.UTF_8);
        exchange.getResponseHeaders().add("Content-Type", "application/json; charset=utf-8");
        exchange.sendResponseHeaders(status, bytes.length);
        try (OutputStream outputStream = exchange.getResponseBody()) {
            outputStream.write(bytes);
        }
    }
}
