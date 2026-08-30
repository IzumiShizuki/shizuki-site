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
import java.util.concurrent.atomic.AtomicReference;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.web.client.RestClient;

class AsmrMusicProviderFailoverTest {

    @Test
    void shouldRouteMetadataAndStreamRequestsThroughConfiguredProxy() throws Exception {
        AtomicInteger metadataCalls = new AtomicInteger(0);
        AtomicInteger streamCalls = new AtomicInteger(0);
        HttpServer proxyServer = createServer("/", exchange -> {
            String path = exchange.getRequestURI().getPath();
            if ("/api/work/42".equals(path)) {
                metadataCalls.incrementAndGet();
                writeJson(exchange, 200, "{\"id\":42,\"title\":\"work-42\",\"name\":\"asmr\"}");
                return;
            }
            if ("/api/media/stream/42/7".equals(path)) {
                streamCalls.incrementAndGet();
                exchange.getResponseHeaders().add("Location", "https://media.example/audio.mp3");
                exchange.sendResponseHeaders(302, -1);
                exchange.close();
                return;
            }
            writeJson(exchange, 404, "{\"code\":404}");
        });
        try {
            AsmrMusicProperties properties = unreachableProperties();
            properties.setProxyHost("127.0.0.1");
            properties.setProxyPort(proxyServer.getAddress().getPort());
            AsmrMusicProvider provider = new AsmrMusicProvider(properties, RestClient.builder(), new ObjectMapper());

            AsmrMusicProvider.WorkSummary work = provider.getWork(42);
            String streamUrl = provider.resolveStreamUrlByHash("42/7");

            Assertions.assertEquals(42L, work.id());
            Assertions.assertEquals(1, metadataCalls.get());
            Assertions.assertEquals(1, streamCalls.get());
            Assertions.assertEquals("https://media.example/audio.mp3", streamUrl);
        } finally {
            proxyServer.stop(0);
        }
    }

    @Test
    void shouldAuthenticateToConfiguredProxyWithoutLeakingCredentialsInRequestUri() throws Exception {
        AtomicInteger challengeCalls = new AtomicInteger(0);
        AtomicReference<String> authenticatedHeader = new AtomicReference<>("");
        AtomicReference<String> requestUri = new AtomicReference<>("");
        HttpServer proxyServer = createServer("/", exchange -> {
            requestUri.set(exchange.getRequestURI().toString());
            String proxyAuthorization = exchange.getRequestHeaders().getFirst("Proxy-Authorization");
            if (proxyAuthorization == null || proxyAuthorization.isBlank()) {
                challengeCalls.incrementAndGet();
                exchange.getResponseHeaders().add("Proxy-Authenticate", "Basic realm=\"asmr-test\"");
                exchange.sendResponseHeaders(407, -1);
                exchange.close();
                return;
            }
            authenticatedHeader.set(proxyAuthorization);
            writeJson(exchange, 200, "{\"id\":7,\"title\":\"work-7\",\"name\":\"asmr\"}");
        });
        try {
            AsmrMusicProperties properties = unreachableProperties();
            properties.setProxyHost("127.0.0.1");
            properties.setProxyPort(proxyServer.getAddress().getPort());
            properties.setProxyUsername("voice-user");
            properties.setProxyPassword("voice-password");
            AsmrMusicProvider provider = new AsmrMusicProvider(properties, RestClient.builder(), new ObjectMapper());

            AsmrMusicProvider.WorkSummary work = provider.getWork(7);

            Assertions.assertEquals(7L, work.id());
            Assertions.assertEquals(1, challengeCalls.get());
            Assertions.assertTrue(authenticatedHeader.get().startsWith("Basic "));
            Assertions.assertFalse(requestUri.get().contains("voice-user"));
            Assertions.assertFalse(requestUri.get().contains("voice-password"));
        } finally {
            proxyServer.stop(0);
        }
    }

    @Test
    void shouldEncodeUnicodeSearchKeywordExactlyOnce() throws Exception {
        AtomicReference<String> rawPath = new AtomicReference<>("");
        HttpServer server = createServer("/", exchange -> {
            rawPath.set(exchange.getRequestURI().getRawPath());
            writeJson(
                exchange,
                200,
                """
                    {
                      "works": [{"id": 101, "title": "学校"}],
                      "pagination": {"currentPage": 1, "pageSize": 20, "totalCount": 1}
                    }
                    """
            );
        });
        try {
            AsmrMusicProperties properties = new AsmrMusicProperties();
            String source = baseUrl(server);
            properties.setServer(source);
            properties.setBaseUrl(source);
            properties.setBaseUrls(List.of(source));
            AsmrMusicProvider provider = new AsmrMusicProvider(properties, RestClient.builder(), new ObjectMapper());

            AsmrMusicProvider.SearchResult result = provider.searchWorks("学校", 1, 24, "release", "desc");

            Assertions.assertEquals(1, result.works().size());
            Assertions.assertEquals("/api/search/%E5%AD%A6%E6%A0%A1", rawPath.get());
        } finally {
            server.stop(0);
        }
    }

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

    private AsmrMusicProperties unreachableProperties() {
        AsmrMusicProperties properties = new AsmrMusicProperties();
        String unreachableSource = "http://voice-upstream.invalid";
        properties.setServer(unreachableSource);
        properties.setBaseUrl(unreachableSource);
        properties.setBaseUrls(List.of(unreachableSource));
        properties.setConnectTimeoutMs(200L);
        properties.setReadTimeoutMs(500L);
        return properties;
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
