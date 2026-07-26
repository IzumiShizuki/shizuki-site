package io.github.shizuki.site.monolith.controller;

import com.fasterxml.jackson.databind.JsonNode;
import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.common.core.response.ApiResponse;
import io.github.shizuki.common.security.annotation.RequireGroup;
import io.github.shizuki.common.security.context.LoginUserContext;
import io.github.shizuki.common.security.model.LoginUser;
import io.github.shizuki.site.monolith.meguri.MeguriBootstrapResponse;
import io.github.shizuki.site.monolith.meguri.MeguriGatewayService;
import io.github.shizuki.site.monolith.meguri.MeguriTurnCreateRequest;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;
import org.springframework.http.CacheControl;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Owner-only website gateway for the remote Meguri (爱莉) character runtime.
 *
 * <p>Every endpoint requires an authenticated site account in the ADMIN
 * group. The gateway forwards turns to {@code meguri-core}, relays the
 * session SSE stream and serves sprite PNG files; the shared core token stays
 * on the server (see the Notion contract “07｜AstrBot／桌宠／网站多端接入实施提示词”).</p>
 */
@RestController
@RequestMapping("/api/v1/meguri")
@RequireGroup("ADMIN")
@Tag(name = "Meguri Website Gateway", description = "Owner-only bridge to the shared meguri-core runtime")
public class MeguriGatewayController {

    private final MeguriGatewayService gatewayService;

    public MeguriGatewayController(MeguriGatewayService gatewayService) {
        this.gatewayService = gatewayService;
    }

    @GetMapping("/bootstrap")
    @Operation(summary = "Read gateway state, core health and sprite availability")
    public ApiResponse<MeguriBootstrapResponse> bootstrap() {
        requireAdminContext();
        return ApiResponse.success(gatewayService.bootstrap());
    }

    @PostMapping("/turns")
    @Operation(summary = "Create one website turn on the shared meguri-core")
    public ApiResponse<JsonNode> createTurn(@RequestBody MeguriTurnCreateRequest request) {
        requireAdminContext();
        if (request == null) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "request body is required");
        }
        return ApiResponse.success(
                gatewayService.createTurn(request.message(), request.sessionId(), request.idempotencyKey()));
    }

    @PostMapping("/turns/{turnId}/cancel")
    @Operation(summary = "Cancel one running turn")
    public ApiResponse<JsonNode> cancelTurn(@PathVariable("turnId") String turnId) {
        requireAdminContext();
        return ApiResponse.success(gatewayService.cancelTurn(turnId));
    }

    @GetMapping("/turns/{turnId}")
    @Operation(summary = "Read one turn status")
    public ApiResponse<JsonNode> turnStatus(@PathVariable("turnId") String turnId) {
        requireAdminContext();
        return ApiResponse.success(gatewayService.turnStatus(turnId));
    }

    /**
     * Relays the core SSE feed. This handler intentionally streams on the
     * request thread: the page is owner-only, so concurrency stays at one or
     * two connections and no async timeout can cut the stream.
     */
    @GetMapping("/sessions/{sessionId}/events")
    @Operation(summary = "Relay the session turn event stream (SSE)")
    public void streamSessionEvents(
            @PathVariable("sessionId") String sessionId,
            @RequestParam(name = "after_sequence", required = false, defaultValue = "0") long afterSequence,
            @RequestHeader(name = "Last-Event-ID", required = false) String lastEventId,
            HttpServletResponse response) throws IOException {
        requireAdminContext();
        var upstreamBody = gatewayService.openSessionEvents(sessionId, afterSequence, lastEventId);
        response.setContentType("text/event-stream;charset=UTF-8");
        response.setHeader("Cache-Control", "no-store");
        response.setHeader("X-Accel-Buffering", "no");
        response.flushBuffer();
        gatewayService.relaySessionEvents(upstreamBody, response.getOutputStream());
    }

    @GetMapping("/assets/sprites/{fileName}")
    @Operation(summary = "Serve one reviewed sprite PNG to the owner")
    public ResponseEntity<byte[]> sprite(@PathVariable("fileName") String fileName) {
        requireAdminContext();
        byte[] bytes = gatewayService.loadSprite(fileName);
        return ResponseEntity.ok()
                .contentType(MediaType.IMAGE_PNG)
                .cacheControl(CacheControl.maxAge(Duration.ofDays(1)).cachePrivate())
                .body(bytes);
    }

    private void requireAdminContext() {
        LoginUser loginUser = LoginUserContext.get()
                .orElseThrow(() -> new BusinessException(ErrorCode.UNAUTHORIZED, "Login required"));
        Set<String> groups = loginUser.getGroups();
        boolean admin = groups != null && groups.stream().anyMatch(group -> "ADMIN".equalsIgnoreCase(group));
        if (!admin) {
            throw new BusinessException(ErrorCode.FORBIDDEN, "Group required: ADMIN");
        }
    }
}
