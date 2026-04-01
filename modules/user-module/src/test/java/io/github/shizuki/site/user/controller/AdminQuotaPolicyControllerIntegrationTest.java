package io.github.shizuki.site.user.controller;

import io.github.shizuki.site.user.request.QuotaPolicyRequest;
import io.github.shizuki.site.user.dto.QuotaPolicyResponse;
import io.github.shizuki.site.user.service.UserService;
import java.util.List;
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

@WebMvcTest(AdminQuotaPolicyController.class)
class AdminQuotaPolicyControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private UserService userService;

    @Test
    void shouldListQuotaPoliciesSuccessfully() throws Exception {
        QuotaPolicyResponse dto = new QuotaPolicyResponse("user-ai-rounds-user", "USER", "ai_round_total", 5L);
        Mockito.when(userService.listQuotaPolicies()).thenReturn(List.of(dto));

        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/admin/group-quota-policies"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data[0].policy_id").value("user-ai-rounds-user"));
    }

    @Test
    void shouldUpdateQuotaPolicySuccessfully() throws Exception {
        QuotaPolicyResponse dto = new QuotaPolicyResponse("user-ai-rounds-user", "USER", "ai_round_total", 8L);
        Mockito.when(userService.updateQuotaPolicy(ArgumentMatchers.eq("user-ai-rounds-user"), ArgumentMatchers.any(QuotaPolicyRequest.class)))
            .thenReturn(dto);

        mockMvc.perform(MockMvcRequestBuilders.put("/api/v1/admin/group-quota-policies/user-ai-rounds-user")
                .contentType(MediaType.APPLICATION_JSON)
                .content("""
                    {
                      "policy_id": "user-ai-rounds-user",
                      "group_code": "USER",
                      "quota_code": "ai_round_total",
                      "value": 8
                    }
                    """))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.value").value(8));
    }

    @Test
    void shouldBatchUpsertQuotaPoliciesSuccessfully() throws Exception {
        QuotaPolicyResponse dto = new QuotaPolicyResponse("user-ai-rounds-user", "USER", "ai_round_total", 9L);
        Mockito.when(userService.batchUpsertQuotaPolicies(ArgumentMatchers.any())).thenReturn(List.of(dto));

        mockMvc.perform(MockMvcRequestBuilders.put("/api/v1/admin/group-quota-policies/batch-upsert")
                .contentType(MediaType.APPLICATION_JSON)
                .content("""
                    {
                      "items": [
                        {
                          "policy_id": "user-ai-rounds-user",
                          "group_code": "USER",
                          "quota_code": "ai_round_total",
                          "value": 9
                        }
                      ]
                    }
                    """))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data[0].value").value(9));
    }
}
