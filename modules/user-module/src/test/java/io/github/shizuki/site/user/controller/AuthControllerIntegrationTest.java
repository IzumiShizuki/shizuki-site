package io.github.shizuki.site.user.controller;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.site.user.dto.auth.AuthIntrospectResponse;
import io.github.shizuki.site.user.dto.auth.AuthTokenResponse;
import io.github.shizuki.site.user.service.AuthService;
import io.github.shizuki.site.user.support.ApiErrorAssertions;
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
 * {@link AuthController} 控制器层集成测试。
 *
 * <p>覆盖统一发 token、冲突绑定确认、登出、introspect 及典型异常返回语义。
 *
 * <p>注释刻度统一为：场景、前置条件、执行动作、断言结果。
 */
@WebMvcTest(AuthController.class)
class AuthControllerIntegrationTest {

    /**
     * MockMvc 请求入口，用于执行 controller 层 HTTP 断言。
     */
    @Autowired
    private MockMvc mockMvc;

    /**
     * 认证服务 mock，用于隔离 controller 入参与响应映射行为。
     */
    @MockBean
    private AuthService authService;

    /**
     * 场景：邮箱密码授权成功。
     * 前置条件：AuthService.issueToken 返回 TOKEN_ISSUED 响应。
     * 执行动作：POST /api/v1/auth/tokens，grant_type=email_password。
     * 断言结果：HTTP 200，返回 access_token、refresh_token、user_id。
     */
    @Test
    void shouldIssueTokenSuccessfully() throws Exception {
        // 约束 service 返回成功签发结果，便于验证 controller 的响应映射。
        Mockito.when(authService.issueToken(ArgumentMatchers.any()))
            .thenReturn(new AuthTokenResponse(
                "TOKEN_ISSUED",
                "token-123",
                "Bearer",
                7200L,
                "refresh-123",
                2592000L,
                1L,
                Set.of("USER"),
                null
            ));

        // 校验响应中的关键认证字段是否透传完整。
        mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/auth/tokens")
                .contentType(MediaType.APPLICATION_JSON)
                .content("""
                    {
                      "grant_type": "email_password",
                      "email": "admin@shizuki.dev",
                      "password": "admin123"
                    }
                    """))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.access_token").value("token-123"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.token_type").value("Bearer"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.refresh_token").value("refresh-123"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.user_id").value(1));
    }

    /**
     * 场景：冲突绑定确认成功。
     * 前置条件：AuthService.confirmConflictBinding 返回 TOKEN_ISSUED。
     * 执行动作：POST /api/v1/auth/bindings/confirm。
     * 断言结果：HTTP 200，返回新的 access/refresh token。
     */
    @Test
    void shouldConfirmConflictBindingSuccessfully() throws Exception {
        // 模拟绑定确认后立即签发 token 的业务结果。
        Mockito.when(authService.confirmConflictBinding(ArgumentMatchers.any()))
            .thenReturn(new AuthTokenResponse(
                "TOKEN_ISSUED",
                "token-bind-123",
                "Bearer",
                7200L,
                "refresh-bind-123",
                2592000L,
                9L,
                Set.of("USER"),
                null
            ));

        // 断言绑定确认接口响应体携带新的 token 对。
        mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/auth/bindings/confirm")
                .contentType(MediaType.APPLICATION_JSON)
                .content("""
                    {
                      "bind_ticket": "ticket-001",
                      "email": "user@example.com",
                      "password": "P@ssw0rd"
                    }
                    """))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.access_token").value("token-bind-123"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.refresh_token").value("refresh-bind-123"));
    }

    /**
     * 场景：冲突绑定确认请求缺少 bind_ticket。
     * 前置条件：无。
     * 执行动作：POST /api/v1/auth/bindings/confirm，bind_ticket 为空字符串。
     * 断言结果：HTTP 400，命中参数校验。
     */
    @Test
    void shouldReturnBadRequestWhenConfirmConflictBindingTicketBlank() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/auth/bindings/confirm")
                .contentType(MediaType.APPLICATION_JSON)
                .content("""
                    {
                      "bind_ticket": "",
                      "email": "user@example.com",
                      "password": "P@ssw0rd"
                    }
                    """))
            .andExpect(MockMvcResultMatchers.status().isBadRequest());
    }

    /**
     * 场景：introspect 成功返回用户上下文。
     * 前置条件：AuthService.introspect 返回 user_id/groups/permissions。
     * 执行动作：GET /api/v1/auth/introspect。
     * 断言结果：HTTP 200，返回 user_id 与 groups。
     */
    @Test
    void shouldIntrospectSuccessfully() throws Exception {
        // 构造典型鉴权上下文，覆盖 groups/permissions 字段映射。
        Mockito.when(authService.introspect())
            .thenReturn(new AuthIntrospectResponse(1L, Set.of("ADMIN"), Set.of("blog.post.create")));

        // 验证 controller 层输出字段格式。
        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/auth/introspect"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.user_id").value(1))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.groups[0]").value("ADMIN"));
    }

    /**
     * 场景：登出成功。
     * 前置条件：AuthService.logout 正常执行。
     * 执行动作：POST /api/v1/auth/logout。
     * 断言结果：HTTP 200，返回标准 OK 响应体。
     */
    @Test
    void shouldLogoutSuccessfully() throws Exception {
        Mockito.doNothing().when(authService).logout(ArgumentMatchers.any());

        // 登出接口只需要验证协议层返回是否稳定。
        mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/auth/logout")
                .contentType(MediaType.APPLICATION_JSON)
                .content("""
                    {
                      "logout_all": false
                    }
                    """))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.status").value("OK"));
    }

    /**
     * 场景：token 签发请求缺少 grant_type。
     * 前置条件：无。
     * 执行动作：POST /api/v1/auth/tokens，grant_type 为空字符串。
     * 断言结果：HTTP 400。
     */
    @Test
    void shouldReturnBadRequestWhenGrantTypeBlank() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/auth/tokens")
                .contentType(MediaType.APPLICATION_JSON)
                .content("""
                    {
                      "grant_type": "",
                      "email": "admin@shizuki.dev",
                      "password": "admin123"
                    }
                    """))
            .andExpect(MockMvcResultMatchers.status().isBadRequest());
    }

    /**
     * 场景：账号凭据错误。
     * 前置条件：AuthService.issueToken 抛出 UNAUTHORIZED。
     * 执行动作：POST /api/v1/auth/tokens。
     * 断言结果：HTTP 401，problem code=UNAUTHORIZED。
     */
    @Test
    void shouldReturnUnauthorizedWhenGrantCredentialInvalid() throws Exception {
        Mockito.when(authService.issueToken(ArgumentMatchers.any()))
            .thenThrow(new BusinessException(ErrorCode.UNAUTHORIZED, "Invalid username or password"));

        // 使用统一 problem 断言，锁住错误语义。
        mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/auth/tokens")
                .contentType(MediaType.APPLICATION_JSON)
                .content("""
                    {
                      "grant_type": "email_password",
                      "email": "admin@shizuki.dev",
                      "password": "wrong"
                    }
                    """))
            .andExpect(ApiErrorAssertions.hasProblem(401, "UNAUTHORIZED"));
    }

    /**
     * 场景：introspect 时 token 非法。
     * 前置条件：AuthService.introspect 抛出 UNAUTHORIZED。
     * 执行动作：GET /api/v1/auth/introspect。
     * 断言结果：HTTP 401，problem code=UNAUTHORIZED。
     */
    @Test
    void shouldReturnUnauthorizedWhenIntrospectTokenInvalid() throws Exception {
        Mockito.when(authService.introspect())
            .thenThrow(new BusinessException(ErrorCode.UNAUTHORIZED, "Token invalid"));

        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/auth/introspect"))
            .andExpect(ApiErrorAssertions.hasProblem(401, "UNAUTHORIZED"));
    }
}
