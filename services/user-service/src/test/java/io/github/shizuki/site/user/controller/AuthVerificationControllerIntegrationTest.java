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

@WebMvcTest(AuthVerificationController.class)
class AuthVerificationControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private AuthService authService;

    @Test
    void shouldCreateImageCaptchaSuccessfully() throws Exception {
        Mockito.when(authService.createImageCaptcha())
            .thenReturn(new ImageCaptchaResponse("captcha-001", "<svg/>", 120L));

        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/auth/captchas/image"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.captcha_id").value("captcha-001"));
    }

    @Test
    void shouldSendEmailVerificationSuccessfully() throws Exception {
        Mockito.when(authService.sendEmailVerification(ArgumentMatchers.any()))
            .thenReturn(new EmailVerificationSendResponse("SENT", 60L));

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

    @Test
    void shouldCreateOauthAuthorizationSuccessfully() throws Exception {
        Mockito.when(authService.createOAuthAuthorization(ArgumentMatchers.any()))
            .thenReturn(new OAuthAuthorizeResponse("oauth-login-001", "https://oauth.example/authorize", "state-001"));

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

    @Test
    void shouldReturnBadRequestWhenCaptchaInvalid() throws Exception {
        Mockito.when(authService.sendEmailVerification(ArgumentMatchers.any()))
            .thenThrow(new BusinessException(ErrorCode.BAD_REQUEST, "Captcha answer invalid"));

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

