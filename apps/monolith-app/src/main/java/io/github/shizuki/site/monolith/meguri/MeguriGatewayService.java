package io.github.shizuki.site.monolith.meguri;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.site.monolith.config.MeguriGatewayProperties;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Duration;
import java.util.regex.Pattern;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * Server-side bridge between the shizuki-site monolith and the remote
 * {@code meguri-core} runtime.
 *
 * <p>Per the Meguri multi-client contract the website is a text + static
 * sprite client: this service forwards {@code POST /v1/turns}, replays the
 * session SSE stream, relays cancellation and serves reviewed sprite PNG
 * files. The shared bearer token and the {@code X-Meguri-*} identity headers
 * are attached here so they never reach the browser.</p>
 */
@Service
public class MeguriGatewayService {

    private static final Logger LOGGER = LoggerFactory.getLogger(MeguriGatewayService.class);

    static final Pattern SESSION_ID_PATTERN = Pattern.compile("^[A-Za-z0-9_-]{8,64}$");
    static final Pattern TURN_ID_PATTERN = Pattern.compile("^[A-Za-z0-9_-]{1,128}$");
    static final Pattern SPRITE_FILE_PATTERN = Pattern.compile("^[a-z0-9_]{1,64}\\.png$");

    private static final String CLIENT_ID = "website";

    private final MeguriGatewayProperties properties;
    private final ObjectMapper objectMapper;
    private final HttpClient httpClient;
    private volatile String cachedToken;

    public MeguriGatewayService(MeguriGatewayProperties properties, ObjectMapper objectMapper) {
        this.properties = properties;
        this.objectMapper = objectMapper;
        this.httpClient = HttpClient.newBuilder()
                .connectTimeout(Duration.ofMillis(properties.getConnectTimeoutMs()))
                .followRedirects(HttpClient.Redirect.NEVER)
                .build();
    }

    public boolean isEnabled() {
        return properties.isEnabled();
    }

    public MeguriBootstrapResponse bootstrap() {
        if (!properties.isEnabled()) {
            return new MeguriBootstrapResponse(false, false, "", 0, "", false);
        }
        boolean coreOnline = false;
        String buildId = "";
        int ragChunks = 0;
        try {
            JsonNode health = requestJson(newCoreRequest("/health", "website")
                    .timeout(Duration.ofMillis(properties.getHealthReadTimeoutMs()))
                    .GET()
                    .build());
            coreOnline = true;
            buildId = health.path("build_id").asText("");
            ragChunks = health.path("rag_chunks").asInt(0);
        } catch (RuntimeException exception) {
            LOGGER.warn("Meguri core health check failed: {}", exception.getMessage());
        }
        return new MeguriBootstrapResponse(
                true,
                coreOnline,
                buildId,
                ragChunks,
                properties.getDefaultSprite(),
                spriteAvailable());
    }

    public JsonNode createTurn(String message, String sessionId, String idempotencyKey) {
        ensureEnabled();
        String normalizedMessage = message == null ? "" : message.trim();
        if (!StringUtils.hasText(normalizedMessage)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "message is required");
        }
        if (normalizedMessage.length() > properties.getMaxMessageLength()) {
            throw new BusinessException(ErrorCode.BAD_REQUEST,
                    "message is longer than " + properties.getMaxMessageLength() + " characters");
        }
        String normalizedSession = requireSessionId(sessionId);

        ObjectNode body = objectMapper.createObjectNode();
        body.put("user_id", requireOwnerUserId());
        body.put("client_id", CLIENT_ID);
        body.put("session_id", normalizedSession);
        body.put("message", normalizedMessage);
        ObjectNode capabilities = body.putObject("client_capabilities");
        capabilities.put("text", true);
        capabilities.put("sprite", true);
        capabilities.put("voice", false);
        capabilities.put("screen_context", false);
        body.put("formal_memory_allowed", properties.isFormalMemoryAllowed());

        HttpRequest.Builder request = newCoreRequest("/v1/turns", normalizedSession)
                .timeout(Duration.ofMillis(properties.getTurnReadTimeoutMs()))
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(body.toString(), StandardCharsets.UTF_8));
        if (StringUtils.hasText(idempotencyKey)) {
            request.header("Idempotency-Key", idempotencyKey.trim());
        }
        return requestJson(request.build());
    }

    public JsonNode cancelTurn(String turnId) {
        ensureEnabled();
        String normalizedTurn = requireTurnId(turnId);
        return requestJson(newCoreRequest("/v1/turns/" + normalizedTurn + "/cancel", "website")
                .timeout(Duration.ofMillis(properties.getTurnReadTimeoutMs()))
                .POST(HttpRequest.BodyPublishers.noBody())
                .build());
    }

    public JsonNode turnStatus(String turnId) {
        ensureEnabled();
        String normalizedTurn = requireTurnId(turnId);
        return requestJson(newCoreRequest("/v1/turns/" + normalizedTurn, "website")
                .timeout(Duration.ofMillis(properties.getTurnReadTimeoutMs()))
                .GET()
                .build());
    }

    /**
     * Validates the request and opens the upstream core SSE feed. Every
     * failure is raised here, before the servlet response is committed.
     */
    public InputStream openSessionEvents(String sessionId, long afterSequence, String lastEventId) {
        ensureEnabled();
        String normalizedSession = requireSessionId(sessionId);
        long normalizedSequence = Math.max(0, afterSequence);

        HttpRequest.Builder request = newCoreRequest(
                "/v1/sessions/" + normalizedSession + "/events?after_sequence=" + normalizedSequence,
                normalizedSession)
                .header("Accept", "text/event-stream")
                .GET();
        if (StringUtils.hasText(lastEventId)) {
            request.header("Last-Event-ID", lastEventId.trim());
        }

        HttpResponse<InputStream> upstream;
        try {
            upstream = httpClient.send(request.build(), HttpResponse.BodyHandlers.ofInputStream());
        } catch (IOException | InterruptedException exception) {
            if (exception instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            throw coreUnavailable(exception);
        }
        if (upstream.statusCode() < 200 || upstream.statusCode() >= 300) {
            try (InputStream body = upstream.body()) {
                drainQuietly(body);
            } catch (IOException ignored) {
                // closing the rejected upstream body is best effort
            }
            throw upstreamError(upstream.statusCode());
        }
        return upstream.body();
    }

    /**
     * Copies the already-open upstream SSE body into {@code target} until one
     * side closes. A broken pipe is expected when the browser tab closes; the
     * client reconnects with {@code after_sequence}.
     */
    public void relaySessionEvents(InputStream upstreamBody, OutputStream target) {
        byte[] buffer = new byte[8192];
        try (InputStream body = upstreamBody) {
            int read;
            while ((read = body.read(buffer)) >= 0) {
                if (read > 0) {
                    target.write(buffer, 0, read);
                    target.flush();
                }
            }
        } catch (IOException exception) {
            LOGGER.debug("Meguri SSE relay ended: {}", exception.getMessage());
        }
    }

    public byte[] loadSprite(String fileName) {
        ensureEnabled();
        String normalized = fileName == null ? "" : fileName.trim();
        if (!SPRITE_FILE_PATTERN.matcher(normalized).matches()) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "sprite file name is invalid");
        }
        Path directory = spriteDirectory();
        if (directory == null) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "sprite directory is not configured");
        }
        Path resolved = directory.resolve(normalized).normalize();
        if (!resolved.startsWith(directory)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "sprite path is not allowed");
        }
        if (!Files.isRegularFile(resolved)) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "sprite file not found");
        }
        try {
            return Files.readAllBytes(resolved);
        } catch (IOException exception) {
            throw new BusinessException(ErrorCode.INTERNAL_ERROR, "sprite file could not be read");
        }
    }

    static boolean isValidSessionId(String sessionId) {
        return sessionId != null && SESSION_ID_PATTERN.matcher(sessionId).matches();
    }

    private boolean spriteAvailable() {
        Path directory = spriteDirectory();
        if (directory == null) {
            return false;
        }
        String defaultSprite = properties.getDefaultSprite();
        if (!StringUtils.hasText(defaultSprite)) {
            return Files.isDirectory(directory);
        }
        return Files.isRegularFile(directory.resolve(defaultSprite).normalize());
    }

    private Path spriteDirectory() {
        String configured = properties.getSpriteDir();
        if (!StringUtils.hasText(configured)) {
            return null;
        }
        return Path.of(configured).toAbsolutePath().normalize();
    }

    private void ensureEnabled() {
        if (!properties.isEnabled()) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "Meguri gateway is disabled");
        }
    }

    private String requireSessionId(String sessionId) {
        String normalized = sessionId == null ? "" : sessionId.trim();
        if (!SESSION_ID_PATTERN.matcher(normalized).matches()) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "sessionId is invalid");
        }
        return normalized;
    }

    private String requireTurnId(String turnId) {
        String normalized = turnId == null ? "" : turnId.trim();
        if (!TURN_ID_PATTERN.matcher(normalized).matches()) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "turnId is invalid");
        }
        return normalized;
    }

    private String requireOwnerUserId() {
        String ownerUserId = properties.getOwnerUserId();
        if (!StringUtils.hasText(ownerUserId)) {
            throw new BusinessException(ErrorCode.INTERNAL_ERROR, "Meguri owner user id is not configured");
        }
        return ownerUserId;
    }

    private HttpRequest.Builder newCoreRequest(String pathAndQuery, String sessionHeader) {
        String baseUrl = properties.getBaseUrl();
        if (!StringUtils.hasText(baseUrl)) {
            throw new BusinessException(ErrorCode.INTERNAL_ERROR, "Meguri core base url is not configured");
        }
        return HttpRequest.newBuilder(URI.create(baseUrl + pathAndQuery))
                .header("Authorization", "Bearer " + requireToken())
                .header("X-Meguri-Tenant-ID", properties.getTenantId())
                .header("X-Meguri-User-ID", requireOwnerUserId())
                .header("X-Meguri-Client-ID", CLIENT_ID)
                .header("X-Meguri-Session-ID", sessionHeader);
    }

    private String requireToken() {
        String resolved = resolveToken();
        if (!StringUtils.hasText(resolved)) {
            throw new BusinessException(ErrorCode.INTERNAL_ERROR, "Meguri core token is not configured");
        }
        return resolved;
    }

    private String resolveToken() {
        String cached = cachedToken;
        if (cached != null) {
            return cached;
        }
        String resolved = "";
        String tokenFile = properties.getTokenFile();
        if (StringUtils.hasText(tokenFile)) {
            try {
                resolved = Files.readString(Path.of(tokenFile), StandardCharsets.UTF_8).trim();
            } catch (IOException exception) {
                LOGGER.warn("Meguri core token file is not readable: {}", tokenFile);
            }
        }
        if (!StringUtils.hasText(resolved)) {
            resolved = properties.getToken();
        }
        cachedToken = resolved;
        return resolved;
    }

    private JsonNode requestJson(HttpRequest request) {
        HttpResponse<String> response;
        try {
            response = httpClient.send(request, HttpResponse.BodyHandlers.ofString(StandardCharsets.UTF_8));
        } catch (IOException | InterruptedException exception) {
            if (exception instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            throw coreUnavailable(exception);
        }
        if (response.statusCode() < 200 || response.statusCode() >= 300) {
            throw upstreamError(response.statusCode());
        }
        String body = response.body();
        if (!StringUtils.hasText(body)) {
            return objectMapper.createObjectNode();
        }
        try {
            return objectMapper.readTree(body);
        } catch (IOException exception) {
            throw new BusinessException(ErrorCode.INTERNAL_ERROR, "Meguri core returned malformed JSON");
        }
    }

    private BusinessException coreUnavailable(Exception exception) {
        LOGGER.warn("Meguri core request failed: {}", exception.getMessage());
        return new BusinessException(ErrorCode.INTERNAL_ERROR, "Meguri Core 暂不可用，请稍后再试");
    }

    private BusinessException upstreamError(int status) {
        if (status == 400) {
            return new BusinessException(ErrorCode.BAD_REQUEST, "Meguri Core 拒绝了本次请求");
        }
        if (status == 401 || status == 403) {
            return new BusinessException(ErrorCode.INTERNAL_ERROR, "Meguri Core 鉴权失败，请检查网关 Token 配置");
        }
        if (status == 404) {
            return new BusinessException(ErrorCode.NOT_FOUND, "Meguri Core 找不到该资源");
        }
        if (status == 409) {
            return new BusinessException(ErrorCode.CONFLICT, "重复的 Idempotency-Key");
        }
        if (status == 429) {
            return new BusinessException(ErrorCode.TOO_MANY_REQUESTS, "Meguri Core 正忙，请稍后再试");
        }
        return new BusinessException(ErrorCode.INTERNAL_ERROR, "Meguri Core 暂不可用（HTTP " + status + "）");
    }

    private void drainQuietly(InputStream stream) {
        try {
            stream.readAllBytes();
        } catch (IOException ignored) {
            // best effort drain before closing the error stream
        }
    }
}
