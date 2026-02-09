package io.github.shizuki.site.ai.controller;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.site.ai.dto.AiSessionSummary;
import io.github.shizuki.site.ai.dto.CreateSessionRequest;
import io.github.shizuki.site.ai.dto.SendMessageRequest;
import io.github.shizuki.site.ai.service.AiService;
import io.github.shizuki.site.ai.support.ApiErrorAssertions;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@WebMvcTest(AiController.class)
class AiControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private AiService aiService;

    @Test
    void shouldCreateSessionSuccessfully() throws Exception {
        Mockito.when(aiService.createSession(ArgumentMatchers.any(CreateSessionRequest.class)))
            .thenReturn(new AiSessionSummary("session-001", "算法训练"));

        mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/ai-sessions")
                .contentType(MediaType.APPLICATION_JSON)
                .content("""
                    {
                      "title": "算法训练"
                    }
                    """))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.session_id").value("session-001"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.title").value("算法训练"));
    }

    @Test
    void shouldListSessionsSuccessfully() throws Exception {
        Mockito.when(aiService.listSessions())
            .thenReturn(List.of(new AiSessionSummary("session-001", "算法训练")));

        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/ai-sessions"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data[0].session_id").value("session-001"));
    }

    @Test
    void shouldSendMessageSuccessfully() throws Exception {
        Mockito.when(aiService.sendMessage(
                ArgumentMatchers.eq("session-001"),
                ArgumentMatchers.any(SendMessageRequest.class)
            ))
            .thenReturn(Map.of("assistant_message", "你好", "remaining_rounds", 4));

        mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/ai-sessions/session-001/messages")
                .contentType(MediaType.APPLICATION_JSON)
                .content("""
                    {
                      "message": "你好"
                    }
                    """))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.assistant_message").value("你好"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.remaining_rounds").value(4));
    }

    @Test
    void shouldGetQuotaSuccessfully() throws Exception {
        Mockito.when(aiService.myQuota())
            .thenReturn(Map.of("quota_code", "ai_round_total", "total", 20, "used", 3, "remaining", 17));

        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/ai-quotas/me"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.quota_code").value("ai_round_total"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.remaining").value(17));
    }

    @Test
    void shouldReturnBadRequestWhenCreateSessionTitleBlank() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/ai-sessions")
                .contentType(MediaType.APPLICATION_JSON)
                .content("""
                    {
                      "title": ""
                    }
                    """))
            .andExpect(ApiErrorAssertions.hasProblem(400, "BAD_REQUEST"));
    }

    @Test
    void shouldReturnBadRequestWhenSendMessageBlank() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/ai-sessions/session-001/messages")
                .contentType(MediaType.APPLICATION_JSON)
                .content("""
                    {
                      "message": ""
                    }
                    """))
            .andExpect(ApiErrorAssertions.hasProblem(400, "BAD_REQUEST"));
    }

    @Test
    void shouldReturnNotFoundWhenSessionMissing() throws Exception {
        Mockito.when(aiService.sendMessage(
                ArgumentMatchers.eq("session-404"),
                ArgumentMatchers.any(SendMessageRequest.class)
            ))
            .thenThrow(new BusinessException(ErrorCode.NOT_FOUND, "Session not found"));

        mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/ai-sessions/session-404/messages")
                .contentType(MediaType.APPLICATION_JSON)
                .content("""
                    {
                      "message": "你好"
                    }
                    """))
            .andExpect(ApiErrorAssertions.hasProblem(404, "NOT_FOUND"));
    }

    @Test
    void shouldReturnForbiddenWhenQuotaExhausted() throws Exception {
        // Given: 业务层在扣减配额时发现额度已耗尽
        Mockito.when(aiService.sendMessage(
                ArgumentMatchers.eq("session-001"),
                ArgumentMatchers.any(SendMessageRequest.class)
            ))
            .thenThrow(new BusinessException(ErrorCode.FORBIDDEN, "AI quota exhausted"));

        // When / Then: 控制器返回 403 + FORBIDDEN，前端据此提示用户升级配额
        mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/ai-sessions/session-001/messages")
                .contentType(MediaType.APPLICATION_JSON)
                .content("""
                    {
                      "message": "继续训练"
                    }
                    """))
            .andExpect(ApiErrorAssertions.hasProblem(403, "FORBIDDEN"));
    }
}
