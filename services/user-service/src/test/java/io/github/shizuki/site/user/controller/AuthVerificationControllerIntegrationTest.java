package io.github.shizuki.site.user.controller;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.site.user.dto.auth.EmailVerificationSendResponse;
import io.github.shizuki.site.user.dto.auth.ImageCaptchaResponse;
import io.github.shizuki.site.user.dto.auth.OAuthAuthorizeResponse;
import io.github.shizuki.site.user.service.AuthService;
import io.github.shizuki.site.user.support.ApiErrorAssertions;
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
 * {@link AuthVerificationController} 控制器层集成测试。
 *
 * <p>覆盖图形验证码、邮箱验证码发送、OAuth 授权事务创建及参数/业务异常路径。
 *
 * <p>注释刻度统一为：场景、前置条件、执行动作、断言结果。
 */
@WebMvcTest(AuthVerificationController.class)
class AuthVerificationControllerIntegrationTest {

    /**
     * MockMvc 请求入口，用于执行 controller 层 HTTP 断言。
     */
    @Autowired
    private MockMvc mockMvc;

    /**
     * 认证服务 mock，用于验证验证码与授权事务接口的响应语义。
     */
    @MockBean
    private AuthService authService;

    /**
     * 场景：获取图形验证码成功。
     * 前置条件：AuthService.createImageCaptcha 返回有效验证码对象。
     * 执行动作：GET /api/v1/auth/captchas/image。
     * 断言结果：HTTP 200，返回 captcha_id 字段。
     */
    @Test
    void shouldCreateImageCaptchaSuccessfully() throws Exception {
        // 构造最小有效验证码响应。
        Mockito.when(authService.createImageCaptcha())
            .thenReturn(new ImageCaptchaResponse("captcha-001", "<svg/>", 120L));

        // 校验返回结构中的业务关键字段。
        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/auth/captchas/image"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.captcha_id").value("captcha-001"));
    }

    /**
     * 场景：邮箱验证码发送成功。
     * 前置条件：AuthService.sendEmailVerification 返回 SENT。
     * 执行动作：POST /api/v1/auth/verifications/email/send。
     * 断言结果：HTTP 200，status=SENT。
     */
    @Test
    void shouldSendEmailVerificationSuccessfully() throws Exception {
        Mockito.when(authService.sendEmailVerification(ArgumentMatchers.any()))
            .thenReturn(new EmailVerificationSendResponse("SENT", 60L));

        // 校验发送接口返回状态字段，防止响应协议漂移。
        mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/auth/verifications/email/send")
                .contentType(MediaType.APPLICATION_JSON)
                .content("""
                    {
                      "email": "user@example.com",
                      "purpose": "register",
                      "captcha_id": "captcha-001",
                      "captcha_answer": "10"
                    }
                    """))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.status").value("SENT"));
    }

    /**
     * 场景：创建 OAuth 授权事务成功。
     * 前置条件：AuthService.createOAuthAuthorization 返回 oauth_login_id。
     * 执行动作：POST /api/v1/auth/oauth/authorizations。
     * 断言结果：HTTP 200，返回 oauth_login_id。
     */
    @Test
    void shouldCreateOauthAuthorizationSuccessfully() throws Exception {
        Mockito.when(authService.createOAuthAuthorization(ArgumentMatchers.any()))
            .thenReturn(new OAuthAuthorizeResponse("oauth-login-001", "https://oauth.example/authorize", "state-001"));

        // 核心断言：授权事务编号需回传给前端用于后续 code 交换。
        mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/auth/oauth/authorizations")
                .contentType(MediaType.APPLICATION_JSON)
                .content("""
                    {
                      "provider": "github",
                      "redirect_uri": "https://example.com/oauth/callback",
                      "scene": "login"
                    }
                    """))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.oauth_login_id").value("oauth-login-001"));
    }

    /**
     * 场景：创建 OAuth 授权事务时 provider 为空。
     * 前置条件：无。
     * 执行动作：POST /api/v1/auth/oauth/authorizations，provider=""。
     * 断言结果：HTTP 400。
     */
    @Test
    void shouldReturnBadRequestWhenCreateOauthAuthorizationRequestInvalid() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/auth/oauth/authorizations")
                .contentType(MediaType.APPLICATION_JSON)
                .content("""
                    {
                      "provider": "",
                      "redirect_uri": "https://example.com/oauth/callback",
                      "scene": "login"
                    }
                    """))
            .andExpect(MockMvcResultMatchers.status().isBadRequest());
    }

    /**
     * 场景：邮箱验证码发送前的图形验证码校验失败。
     * 前置条件：AuthService.sendEmailVerification 抛 BAD_REQUEST。
     * 执行动作：POST /api/v1/auth/verifications/email/send。
     * 断言结果：HTTP 400，problem code=BAD_REQUEST。
     */
    @Test
    void shouldReturnBadRequestWhenCaptchaInvalid() throws Exception {
        Mockito.when(authService.sendEmailVerification(ArgumentMatchers.any()))
            .thenThrow(new BusinessException(ErrorCode.BAD_REQUEST, "Captcha answer invalid"));

        // 使用统一 problem 断言，锁定错误语义。
        mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/auth/verifications/email/send")
                .contentType(MediaType.APPLICATION_JSON)
                .content("""
                    {
                      "email": "user@example.com",
                      "purpose": "register",
                      "captcha_id": "captcha-001",
                      "captcha_answer": "wrong"
                    }
                    """))
            .andExpect(ApiErrorAssertions.hasProblem(400, "BAD_REQUEST"));
    }
}
