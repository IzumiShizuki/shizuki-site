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

/**
 * {@link InternalQuotaController} 控制器层集成测试。
 *
 * <p>验证配额解析接口在分组解析、默认值兜底和参数校验方面的行为。
 *
 * <p>注释刻度统一为：场景、前置条件、执行动作、断言结果。
 */
@WebMvcTest(InternalQuotaController.class)
class InternalQuotaControllerIntegrationTest {

    /**
     * MockMvc 请求入口，用于执行 controller 层 HTTP 断言。
     */
    @Autowired
    private MockMvc mockMvc;

    /**
     * 用户服务 mock，用于隔离 quota controller 参数解析与响应映射断言。
     */
    @MockBean
    private UserService userService;

    /**
     * 场景：按多个分组解析配额。
     * 前置条件：UserService.resolveQuota 返回匹配后的配额值。
     * 执行动作：GET /api/v1/internal/quotas/resolve，group_codes=USER,INTERVIEWER。
     * 断言结果：HTTP 200，value=20。
     */
    @Test
    void shouldResolveQuotaByGroupSuccessfully() throws Exception {
        Mockito.when(userService.resolveQuota(
                ArgumentMatchers.eq("ai_round_total"),
                ArgumentMatchers.eq(Set.of("USER", "INTERVIEWER")),
                ArgumentMatchers.eq(5L)
            ))
            .thenReturn(20L);

        // 断言分组字符串被解析并映射为标准响应结构。
        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/internal/quotas/resolve")
                .param("quota_code", "ai_round_total")
                .param("group_codes", "USER,INTERVIEWER")
                .param("default_value", "5"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.quota_code").value("ai_round_total"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.value").value(20));
    }

    /**
     * 场景：请求未携带 group_codes。
     * 前置条件：UserService.resolveQuota 接收到空分组后返回 default_value。
     * 执行动作：GET /api/v1/internal/quotas/resolve，仅传 quota_code/default_value。
     * 断言结果：HTTP 200，value=9。
     */
    @Test
    void shouldUseDefaultValueWhenGroupCodesEmpty() throws Exception {
        Mockito.when(userService.resolveQuota(
                ArgumentMatchers.eq("ai_round_total"),
                ArgumentMatchers.eq(Set.of()),
                ArgumentMatchers.eq(9L)
            ))
            .thenReturn(9L);

        // 核心断言：group_codes 缺失时接口仍能稳定返回默认值。
        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/internal/quotas/resolve")
                .param("quota_code", "ai_round_total")
                .param("default_value", "9"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.quota_code").value("ai_round_total"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.value").value(9));
    }

    /**
     * 场景：请求缺少 quota_code。
     * 前置条件：无。
     * 执行动作：GET /api/v1/internal/quotas/resolve，不传 quota_code。
     * 断言结果：HTTP 400。
     */
    @Test
    void shouldReturnBadRequestWhenQuotaCodeMissing() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/internal/quotas/resolve")
                .param("group_codes", "USER")
                .param("default_value", "5"))
            .andExpect(MockMvcResultMatchers.status().isBadRequest());
    }
}
