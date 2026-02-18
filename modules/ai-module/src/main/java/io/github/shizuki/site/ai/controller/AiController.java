package io.github.shizuki.site.ai.controller;

import io.github.shizuki.common.audit.annotation.AuditLog;
import io.github.shizuki.common.core.response.ApiResponse;
import io.github.shizuki.common.ratelimit.annotation.RateLimit;
import io.github.shizuki.site.ai.dto.AiSessionSummary;
import io.github.shizuki.site.ai.dto.CreateSessionRequest;
import io.github.shizuki.site.ai.dto.SendMessageRequest;
import io.github.shizuki.site.ai.service.AiService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import java.util.List;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@Tag(name = "AI", description = "AI 会话、消息与角色配置接口")
public class AiController {

    private final AiService aiService;

    public AiController(AiService aiService) {
        this.aiService = aiService;
    }

    @PostMapping("/ai-sessions")
    @Operation(summary = "创建 AI 会话")
    public ApiResponse<AiSessionSummary> createSession(@Valid @RequestBody CreateSessionRequest request) {
        return ApiResponse.success(aiService.createSession(request));
    }

    @GetMapping("/ai-sessions")
    @Operation(summary = "查询我的会话列表")
    public ApiResponse<List<AiSessionSummary>> listSessions() {
        return ApiResponse.success(aiService.listSessions());
    }

    @PostMapping("/ai-sessions/{session_id}/messages")
    @RateLimit(key = "ai.messages", limit = 30, windowSeconds = 60)
    @AuditLog(action = "ai.message.send", resource = "ai_session")
    @Operation(summary = "发送消息", description = "发送用户消息并返回助手回复，同时扣减配额")
    public ApiResponse<Map<String, Object>> sendMessage(@PathVariable("session_id") String sessionId,
                                                        @Valid @RequestBody SendMessageRequest request) {
        return ApiResponse.success(aiService.sendMessage(sessionId, request));
    }

    @GetMapping("/ai-quotas/me")
    @Operation(summary = "查询我的 AI 配额")
    public ApiResponse<Map<String, Object>> myQuota() {
        return ApiResponse.success(aiService.myQuota());
    }

    @PostMapping("/ai-characters")
    @Operation(summary = "创建角色配置", description = "保存结构化角色配置 JSON")
    public ApiResponse<Map<String, Object>> createCharacter(@RequestBody Map<String, Object> request) {
        return ApiResponse.success(aiService.createCharacter(request));
    }

    @PostMapping("/ai-character-cards/import")
    @Operation(summary = "导入角色卡", description = "导入角色卡内容并落库")
    public ApiResponse<Map<String, Object>> importCharacterCard(@RequestBody Map<String, Object> request) {
        return ApiResponse.success(aiService.importCharacterCard(request));
    }
}
