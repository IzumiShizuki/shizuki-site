package io.github.shizuki.site.ai.controller;

import io.github.shizuki.common.audit.annotation.AuditLog;
import io.github.shizuki.common.core.response.ApiResponse;
import io.github.shizuki.common.ratelimit.annotation.RateLimit;
import io.github.shizuki.site.ai.dto.AiSessionSummary;
import io.github.shizuki.site.ai.dto.CreateSessionRequest;
import io.github.shizuki.site.ai.dto.SendMessageRequest;
import io.github.shizuki.site.ai.service.AiService;
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
public class AiController {

    private final AiService aiFacade;

    public AiController(AiService aiFacade) {
        this.aiFacade = aiFacade;
    }

    @PostMapping("/ai-sessions")
    public ApiResponse<AiSessionSummary> createSession(@Valid @RequestBody CreateSessionRequest request) {
        return ApiResponse.success(aiFacade.createSession(request));
    }

    @GetMapping("/ai-sessions")
    public ApiResponse<List<AiSessionSummary>> listSessions() {
        return ApiResponse.success(aiFacade.listSessions());
    }

    @PostMapping("/ai-sessions/{session_id}/messages")
    @RateLimit(key = "ai.messages", limit = 30, windowSeconds = 60)
    @AuditLog(action = "ai.message.send", resource = "ai_session")
    public ApiResponse<Map<String, Object>> sendMessage(@PathVariable("session_id") String sessionId,
                                                        @Valid @RequestBody SendMessageRequest request) {
        return ApiResponse.success(aiFacade.sendMessage(sessionId, request));
    }

    @GetMapping("/ai-quotas/me")
    public ApiResponse<Map<String, Object>> myQuota() {
        return ApiResponse.success(aiFacade.myQuota());
    }

    @PostMapping("/ai-characters")
    public ApiResponse<Map<String, Object>> createCharacter(@RequestBody Map<String, Object> request) {
        return ApiResponse.success(aiFacade.createCharacter(request));
    }

    @PostMapping("/ai-character-cards/import")
    public ApiResponse<Map<String, Object>> importCharacterCard(@RequestBody Map<String, Object> request) {
        return ApiResponse.success(aiFacade.importCharacterCard(request));
    }
}
