package io.github.shizuki.site.monolith.controller;

import io.github.shizuki.common.security.context.LoginUserContext;
import io.github.shizuki.common.security.model.LoginUser;
import io.github.shizuki.site.admin.response.AdminPromptCacheMetricsResponse;
import io.github.shizuki.site.admin.response.MeguriPromptCacheIngestResponse;
import io.github.shizuki.site.monolith.config.GatewayAuthProperties;
import io.github.shizuki.site.monolith.ops.MeguriPromptCacheMetricsService;
import io.github.shizuki.site.user.service.AuthService;
import java.util.Map;
import java.util.Set;
import org.junit.jupiter.api.AfterEach;
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

@WebMvcTest(MeguriPromptCacheMetricsController.class)
class MeguriPromptCacheMetricsControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private MeguriPromptCacheMetricsService metricsService;
    @MockBean
    private GatewayAuthProperties gatewayAuthProperties;
    @MockBean
    private AuthService authService;

    @AfterEach
    void tearDown() {
        LoginUserContext.clear();
    }

    @Test
    void ingestsSnapshotWithInternalTokenHeader() throws Exception {
        Mockito.when(metricsService.ingest(ArgumentMatchers.any(), ArgumentMatchers.eq("metrics-secret")))
            .thenReturn(new MeguriPromptCacheIngestResponse("meguri-desktop", "2026-07-22T09:00:00Z"));

        mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/internal/meguri/prompt-cache")
                .header("X-Meguri-Metrics-Token", "metrics-secret")
                .contentType(MediaType.APPLICATION_JSON)
                .content("""
                    {
                      "source_id": "meguri-desktop",
                      "observed_at": "2026-07-22T08:59:00Z",
                      "collecting_since": "2026-07-22T08:00:00Z",
                      "provider": "openai-compatible/langchain4j",
                      "model": "deepseek-chat",
                      "cache_mode": "provider_managed_prefix_cache",
                      "prompt_sha256": "0123456789abcdef0123456789abcdef0123456789abcdef0123456789abcdef",
                      "daily": [],
                      "recent": []
                    }
                    """))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.source_id").value("meguri-desktop"));
    }

    @Test
    void returnsLatestSnapshotOnlyForAdmin() throws Exception {
        LoginUserContext.set(new LoginUser(1L, Set.of("ADMIN"), Set.of()));
        Mockito.when(metricsService.latest()).thenReturn(new AdminPromptCacheMetricsResponse(
            true, "2026-07-22T09:00:00Z", 5L, false, Map.of("cache_hit_tokens", 80L)));

        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/admin/ops/meguri/prompt-cache"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.available").value(true))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.metrics.cache_hit_tokens").value(80));
    }
}
