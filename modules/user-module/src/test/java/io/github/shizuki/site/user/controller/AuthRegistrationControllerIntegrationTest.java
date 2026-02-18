package io.github.shizuki.site.user.controller;

import io.github.shizuki.site.user.dto.auth.AuthTokenResponse;
import io.github.shizuki.site.user.service.AuthService;
import java.util.Set;
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

/**
 * {@link AuthRegistrationController} 控制器层集成测试。
 *
 * <p>验证邮箱注册接口的基本成功路径。
 *
 * <p>注释刻度统一为：场景、前置条件、执行动作、断言结果。
 */
@WebMvcTest(AuthRegistrationController.class)
class AuthRegistrationControllerIntegrationTest {

    /**
     * MockMvc 请求入口，用于执行 controller 层 HTTP 断言。
     */
    @Autowired
    private MockMvc mockMvc;

    /**
     * 认证服务 mock，用于隔离注册接口的请求映射与响应结构断言。
     */
    @MockBean
    private AuthService authService;

    /**
     * 场景：邮箱注册成功。
     * 前置条件：AuthService.registerByEmail 返回 TOKEN_ISSUED。
     * 执行动作：POST /api/v1/auth/register/email。
     * 断言结果：HTTP 200，响应包含 access_token。
     */
    @Test
    void shouldRegisterByEmailSuccessfully() throws Exception {
        // 模拟注册成功后的 token 返回结构。
        Mockito.when(authService.registerByEmail(ArgumentMatchers.any()))
            .thenReturn(new AuthTokenResponse(
                "TOKEN_ISSUED",
                "token-123",
                "Bearer",
                7200L,
                "refresh-123",
                2592000L,
                2L,
                Set.of("USER"),
                null
            ));

        // 核心断言：controller 应返回标准成功包裹与 access_token 字段。
        mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/auth/register/email")
                .contentType(MediaType.APPLICATION_JSON)
                .content("""
                    {
                      "email": "new-user@example.com",
                      "password": "P@ssw0rd",
                      "nickname": "New User",
                      "email_code": "123456"
                    }
                    """))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.access_token").value("token-123"));
    }
}
