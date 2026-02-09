package io.github.shizuki.site.user.controller;

import io.github.shizuki.site.user.service.UserService;
import java.util.Set;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@WebMvcTest(InternalQuotaController.class)
class InternalQuotaControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private UserService userService;

    @Test
    void shouldResolveQuotaByGroupSuccessfully() throws Exception {
        Mockito.when(userService.resolveQuota(
                ArgumentMatchers.eq("ai_round_total"),
                ArgumentMatchers.eq(Set.of("USER", "INTERVIEWER")),
                ArgumentMatchers.eq(5L)
            ))
            .thenReturn(20L);

        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/internal/quotas/resolve")
                .param("quota_code", "ai_round_total")
                .param("group_codes", "USER,INTERVIEWER")
                .param("default_value", "5"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.quota_code").value("ai_round_total"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.value").value(20));
    }

    @Test
    void shouldUseDefaultValueWhenGroupCodesEmpty() throws Exception {
        Mockito.when(userService.resolveQuota(
                ArgumentMatchers.eq("ai_round_total"),
                ArgumentMatchers.eq(Set.of()),
                ArgumentMatchers.eq(9L)
            ))
            .thenReturn(9L);

        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/internal/quotas/resolve")
                .param("quota_code", "ai_round_total")
                .param("default_value", "9"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.quota_code").value("ai_round_total"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.value").value(9));
    }

    @Test
    void shouldReturnBadRequestWhenQuotaCodeMissing() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/internal/quotas/resolve")
                .param("group_codes", "USER")
                .param("default_value", "5"))
            .andExpect(MockMvcResultMatchers.status().isBadRequest());
    }
}
