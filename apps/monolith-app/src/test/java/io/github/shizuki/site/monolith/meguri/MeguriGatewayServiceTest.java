package io.github.shizuki.site.monolith.meguri;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.net.httpserver.HttpServer;
import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.site.monolith.config.MeguriGatewayProperties;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

class MeguriGatewayServiceTest {

    private final ObjectMapper objectMapper = new ObjectMapper();
    private final Map<String, String> seenHeaders = new ConcurrentHashMap<>();
    private final Map<String, String> seenBodies = new ConcurrentHashMap<>();
    private HttpServer server;
    private MeguriGatewayProperties properties;
    private MeguriGatewayService service;

    @TempDir
    Path tempDir;

    @BeforeEach
    void setUp() throws IOException {
        server = HttpServer.create(new InetSocketAddress("127.0.0.1", 0), 0);
        server.createContext("/v1/turns", exchange -> {
            recordExchange("turns", exchange.getRequestHeaders().entrySet().stream()
                    .collect(ConcurrentHashMap::new,
                            (map, entry) -> map.put(entry.getKey(), String.join(",", entry.getValue())),
                            Map::putAll),
                    new String(exchange.getRequestBody().readAllBytes(), StandardCharsets.UTF_8));
            byte[] payload = "{\"turn_id\":\"t1\",\"session_id\":\"web_sessionabc\",\"build_id\":\"b\",\"status\":\"accepted\"}"
                    .getBytes(StandardCharsets.UTF_8);
            exchange.getResponseHeaders().set("Content-Type", "application/json");
            exchange.sendResponseHeaders(200, payload.length);
            exchange.getResponseBody().write(payload);
            exchange.close();
        });
        server.createContext("/v1/sessions/web_sessionabc/events", exchange -> {
            byte[] payload = "event: turn.completed\ndata: {\"sequence\":1}\n\n".getBytes(StandardCharsets.UTF_8);
            exchange.getResponseHeaders().set("Content-Type", "text/event-stream");
            exchange.sendResponseHeaders(200, payload.length);
            exchange.getResponseBody().write(payload);
            exchange.close();
        });
        server.createContext("/busy/v1/turns", exchange -> {
            exchange.sendResponseHeaders(429, -1);
            exchange.close();
        });
        server.start();

        properties = new MeguriGatewayProperties();
        properties.setEnabled(true);
        properties.setBaseUrl("http://127.0.0.1:" + server.getAddress().getPort());
        properties.setToken("test-token");
        properties.setTenantId("meguri-staging");
        properties.setOwnerUserId("local-airi-user");
        service = new MeguriGatewayService(properties, objectMapper);
    }

    @AfterEach
    void tearDown() {
        if (server != null) {
            server.stop(0);
        }
    }

    private void recordExchange(String key, Map<String, String> headers, String body) {
        headers.forEach((name, value) -> seenHeaders.put(key + ":" + name.toLowerCase(), value));
        seenBodies.put(key, body);
    }

    @Test
    void createTurnForwardsIdentityHeadersAndCapabilities() throws Exception {
        JsonNode created = service.createTurn("你好，爱莉", "web_sessionabc", "idem-1");

        assertThat(created.path("turn_id").asText()).isEqualTo("t1");
        assertThat(seenHeaders.get("turns:authorization")).isEqualTo("Bearer test-token");
        assertThat(seenHeaders.get("turns:x-meguri-tenant-id")).isEqualTo("meguri-staging");
        assertThat(seenHeaders.get("turns:x-meguri-user-id")).isEqualTo("local-airi-user");
        assertThat(seenHeaders.get("turns:x-meguri-client-id")).isEqualTo("website");
        assertThat(seenHeaders.get("turns:x-meguri-session-id")).isEqualTo("web_sessionabc");
        assertThat(seenHeaders.get("turns:idempotency-key")).isEqualTo("idem-1");

        JsonNode body = objectMapper.readTree(seenBodies.get("turns"));
        assertThat(body.path("user_id").asText()).isEqualTo("local-airi-user");
        assertThat(body.path("client_id").asText()).isEqualTo("website");
        assertThat(body.path("session_id").asText()).isEqualTo("web_sessionabc");
        assertThat(body.path("message").asText()).isEqualTo("你好，爱莉");
        assertThat(body.path("client_capabilities").path("text").asBoolean()).isTrue();
        assertThat(body.path("client_capabilities").path("sprite").asBoolean()).isTrue();
        assertThat(body.path("client_capabilities").path("voice").asBoolean()).isFalse();
        assertThat(body.path("client_capabilities").path("screen_context").asBoolean()).isFalse();
        assertThat(body.path("formal_memory_allowed").asBoolean()).isFalse();
    }

    @Test
    void createTurnValidatesInputBeforeCallingTheCore() {
        assertThatThrownBy(() -> service.createTurn("  ", "web_sessionabc", null))
                .isInstanceOf(BusinessException.class)
                .extracting(exception -> ((BusinessException) exception).getErrorCode())
                .isEqualTo(ErrorCode.BAD_REQUEST);
        assertThatThrownBy(() -> service.createTurn("hi", "bad id", null))
                .isInstanceOf(BusinessException.class)
                .extracting(exception -> ((BusinessException) exception).getErrorCode())
                .isEqualTo(ErrorCode.BAD_REQUEST);
    }

    @Test
    void upstreamBusyMapsToTooManyRequests() {
        properties.setBaseUrl("http://127.0.0.1:" + server.getAddress().getPort() + "/busy");
        MeguriGatewayService busyService = new MeguriGatewayService(properties, objectMapper);

        assertThatThrownBy(() -> busyService.createTurn("hi", "web_sessionabc", null))
                .isInstanceOf(BusinessException.class)
                .extracting(exception -> ((BusinessException) exception).getErrorCode())
                .isEqualTo(ErrorCode.TOO_MANY_REQUESTS);
    }

    @Test
    void disabledGatewayFailsClosed() {
        properties.setEnabled(false);
        MeguriGatewayService disabled = new MeguriGatewayService(properties, objectMapper);

        assertThatThrownBy(() -> disabled.createTurn("hi", "web_sessionabc", null))
                .isInstanceOf(BusinessException.class)
                .extracting(exception -> ((BusinessException) exception).getErrorCode())
                .isEqualTo(ErrorCode.NOT_FOUND);
        assertThat(disabled.bootstrap().enabled()).isFalse();
    }

    @Test
    void sessionEventsRelayVerbatim() throws Exception {
        InputStream upstream = service.openSessionEvents("web_sessionabc", 0, null);
        ByteArrayOutputStream target = new ByteArrayOutputStream();
        service.relaySessionEvents(upstream, target);

        assertThat(target.toString(StandardCharsets.UTF_8))
                .contains("event: turn.completed")
                .contains("data: {\"sequence\":1}");
    }

    @Test
    void spriteLoadingIsRestrictedToTheConfiguredDirectory() throws IOException {
        Path spriteDir = tempDir.resolve("sprites");
        Files.createDirectories(spriteDir);
        Files.write(spriteDir.resolve("ce04001l.png"), new byte[] {(byte) 137, 80, 78, 71});
        Files.writeString(tempDir.resolve("secret.txt"), "secret");
        properties.setSpriteDir(spriteDir.toString());

        assertThat(service.loadSprite("ce04001l.png")).hasSize(4);
        assertThatThrownBy(() -> service.loadSprite("../secret.txt"))
                .isInstanceOf(BusinessException.class);
        assertThatThrownBy(() -> service.loadSprite("missing.png"))
                .isInstanceOf(BusinessException.class)
                .extracting(exception -> ((BusinessException) exception).getErrorCode())
                .isEqualTo(ErrorCode.NOT_FOUND);
    }

    @Test
    void tokenFileWinsOverInlineToken() throws Exception {
        Path tokenFile = tempDir.resolve("core-token.txt");
        Files.writeString(tokenFile, "file-token\n");
        properties.setToken("inline-token");
        properties.setTokenFile(tokenFile.toString());
        MeguriGatewayService fileTokenService = new MeguriGatewayService(properties, objectMapper);

        fileTokenService.createTurn("hi", "web_sessionabc", null);

        assertThat(seenHeaders.get("turns:authorization")).isEqualTo("Bearer file-token");
    }
}
