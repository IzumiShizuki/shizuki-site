package io.github.shizuki.site.user.controller;

import io.github.shizuki.site.user.service.AuthService;
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
 * {@link AuthBindingController} 控制器层集成测试。
 *
 * <p>重点验证未登录上下文下绑定接口的访问控制。
 *
 * <p>注释刻度统一为：场景、前置条件、执行动作、断言结果。
 */
@WebMvcTest(AuthBindingController.class)
class AuthBindingControllerIntegrationTest {

    /**
     * MockMvc 请求入口，用于执行 controller 层 HTTP 断言。
     */
    @Autowired
    private MockMvc mockMvc;

    /**
     * 认证服务 mock，用于验证未登录路径不会调用真实绑定逻辑。
     */
    @MockBean
    private AuthService authService;

    /**
     * 场景：未登录用户请求绑定邮箱。
     * 前置条件：无登录上下文。
     * 执行动作：POST /api/v1/me/bindings/email。
     * 断言结果：HTTP 401。
     */
    @Test
    void shouldReturnUnauthorizedWhenBindEmailWithoutLoginContext() throws Exception {
        // 绑定邮箱属于登录态能力，未登录必须被拦截。
        mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/me/bindings/email")
                .contentType(MediaType.APPLICATION_JSON)
                .content("""
                    {
                      "email": "user@example.com",
                      "password": "P@ssw0rd",
                      "email_code": "123456"
                    }
                    """))
            .andExpect(MockMvcResultMatchers.status().isUnauthorized());
    }

    /**
     * 场景：未登录用户请求绑定 OAuth。
     * 前置条件：无登录上下文。
     * 执行动作：POST /api/v1/me/bindings/oauth。
     * 断言结果：HTTP 401，且不触发 AuthService.bindOAuth。
     */
    @Test
    void shouldReturnUnauthorizedWhenBindOauthWithoutLoginContext() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/me/bindings/oauth")
                .contentType(MediaType.APPLICATION_JSON)
                .content("""
                    {
                      "provider": "github",
                      "oauth_login_id": "oauth-login-001",
                      "code": "code-001",
                      "state": "state-001"
                    }
                    """))
            .andExpect(MockMvcResultMatchers.status().isUnauthorized());
        // 访问控制必须在 controller 层提前返回，不能落到业务服务。
        Mockito.verify(authService, Mockito.never()).bindOAuth(ArgumentMatchers.any(), ArgumentMatchers.any());
    }
}
