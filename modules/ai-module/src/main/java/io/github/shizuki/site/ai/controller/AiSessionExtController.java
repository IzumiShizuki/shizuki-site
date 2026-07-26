package io.github.shizuki.site.ai.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.response.ApiResponse;
import io.github.shizuki.site.ai.request.SendMessageRequest;
import io.github.shizuki.site.ai.request.UpdateAiSessionRequest;
import io.github.shizuki.site.ai.response.AiMessageSendResponse;
import io.github.shizuki.site.ai.response.AiSessionListItemResponse;
import io.github.shizuki.site.ai.response.AiSessionMessagesResponse;
import io.github.shizuki.site.ai.response.AiSessionSummary;
import java.util.List;
import io.github.shizuki.site.ai.service.AiSessionMaintenanceService;
import io.github.shizuki.site.ai.service.AiStreamChatService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.LinkedHashMap;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Phase-2 session endpoints: history readback, rename, soft delete and SSE streaming send.
 * Kept in a dedicated controller so the frozen phase-1 {@code AiController} stays untouched.
 */
@RestController
@RequestMapping("/api/v1")
@Tag(name = "AI Session Ext", description = "AI 会话历史 / 维护 / 流式发送")
public class AiSessionExtController {

    private static final Logger LOGGER = LoggerFactory.getLogger(AiSessionExtController.class);

    private final AiSessionMaintenanceService aiSessionMaintenanceService;
    private final AiStreamChatService aiStreamChatService;
    private final ObjectMapper objectMapper;

    public AiSessionExtController(AiSessionMaintenanceService aiSessionMaintenanceService,
                                  AiStreamChatService aiStreamChatService,
                                  ObjectMapper objectMapper) {
        this.aiSessionMaintenanceService = aiSessionMaintenanceService;
        this.aiStreamChatService = aiStreamChatService;
        this.objectMapper = objectMapper;
    }

    @GetMapping("/ai-sessions/summaries")
    @Operation(summary = "会话列表（带 updatedAt 时间戳）")
    public ApiResponse<List<AiSessionListItemResponse>> listSessionSummaries() {
        return ApiResponse.success(aiSessionMaintenanceService.listSessionSummaries());
    }

    @GetMapping("/ai-sessions/{sessionId}/messages")
    @Operation(summary = "拉取会话历史消息")
    public ApiResponse<AiSessionMessagesResponse> listSessionMessages(@PathVariable("sessionId") String sessionId,
                                                                      @RequestParam(value = "limit", required = false) Integer limit) {
        return ApiResponse.success(aiSessionMaintenanceService.listSessionMessages(sessionId, limit));
    }

    @PutMapping("/ai-sessions/{sessionId}")
    @Operation(summary = "重命名会话")
    public ApiResponse<AiSessionSummary> updateSession(@PathVariable("sessionId") String sessionId,
                                                       @RequestBody UpdateAiSessionRequest request) {
        return ApiResponse.success(aiSessionMaintenanceService.updateSession(sessionId, request));
    }

    @DeleteMapping("/ai-sessions/{sessionId}")
    @Operation(summary = "删除会话（软删除）")
    public ApiResponse<Map<String, Object>> deleteSession(@PathVariable("sessionId") String sessionId) {
        aiSessionMaintenanceService.deleteSession(sessionId);
        return ApiResponse.success(Map.of("sessionId", sessionId, "deleted", true));
    }

    /**
     * SSE streaming send. Events are written on the request thread:
     * {@code {"type":"delta","content":"..."}} per chunk, one final
     * {@code {"type":"done", ...}} carrying the full {@link AiMessageSendResponse},
     * or {@code {"type":"error","code":"...","message":"..."}} on failure.
     */
    @PostMapping(value = "/ai-sessions/{sessionId}/messages/stream", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    @Operation(summary = "流式发送消息（SSE）")
    public void streamMessage(@PathVariable("sessionId") String sessionId,
                              @RequestBody SendMessageRequest request,
                              HttpServletResponse response) throws IOException {
        response.setContentType(MediaType.TEXT_EVENT_STREAM_VALUE);
        response.setCharacterEncoding(StandardCharsets.UTF_8.name());
        response.setHeader("Cache-Control", "no-cache");
        response.setHeader("Connection", "keep-alive");
        // Ask nginx-style reverse proxies not to buffer this response.
        response.setHeader("X-Accel-Buffering", "no");

        PrintWriter writer = response.getWriter();
        try {
            AiMessageSendResponse result = aiStreamChatService.streamMessage(
                sessionId,
                request,
                delta -> writeEvent(writer, deltaEvent(delta))
            );
            writeEvent(writer, doneEvent(result));
        } catch (BusinessException exception) {
            writeEvent(writer, errorEvent(exception.getErrorCode().name(), exception.getMessage(), exception.getDetails()));
        } catch (Exception exception) {
            LOGGER.warn("AI stream send failed. sessionId={} reason={}", sessionId, exception.getMessage());
            writeEvent(writer, errorEvent("INTERNAL_ERROR", "AI chat request failed", null));
        } finally {
            writer.flush();
        }
    }

    private Map<String, Object> deltaEvent(String delta) {
        Map<String, Object> event = new LinkedHashMap<>();
        event.put("type", "delta");
        event.put("content", delta == null ? "" : delta);
        return event;
    }

    private Map<String, Object> doneEvent(AiMessageSendResponse result) {
        Map<String, Object> event = new LinkedHashMap<>();
        event.put("type", "done");
        event.put("payload", result);
        return event;
    }

    private Map<String, Object> errorEvent(String code, String message, Map<String, Object> details) {
        Map<String, Object> event = new LinkedHashMap<>();
        event.put("type", "error");
        event.put("code", code);
        event.put("message", message == null ? "" : message);
        if (details != null && !details.isEmpty()) {
            event.put("details", details);
        }
        return event;
    }

    private void writeEvent(PrintWriter writer, Map<String, Object> event) {
        try {
            writer.write("data: " + objectMapper.writeValueAsString(event) + "\n\n");
            writer.flush();
        } catch (IOException exception) {
            throw new IllegalStateException("Failed to serialize SSE event", exception);
        }
    }
}
