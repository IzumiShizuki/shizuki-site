package io.github.shizuki.site.user.controller;

import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import io.github.shizuki.site.user.service.UserService;
import java.util.Set;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(InternalQuotaController.class)
class InternalQuotaControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private UserService userService;

    @Test
    void shouldResolveQuotaByGroupSuccessfully() throws Exception {
        when(userService.resolveQuota(eq("ai_round_total"), eq(Set.of("USER", "INTERVIEWER")), eq(5L)))
            .thenReturn(20L);

        mockMvc.perform(get("/api/v1/internal/quotas/resolve")
                .param("quota_code", "ai_round_total")
                .param("group_codes", "USER,INTERVIEWER")
                .param("default_value", "5"))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.code").value("OK"))
            .andExpect(jsonPath("$.data.quotaCode").value("ai_round_total"))
            .andExpect(jsonPath("$.data.value").value(20));
    }
}
