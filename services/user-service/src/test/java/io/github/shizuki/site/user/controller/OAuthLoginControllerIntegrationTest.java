package io.github.shizuki.site.user.controller;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.site.user.dto.OAuthLoginCreateRequest;
import io.github.shizuki.site.user.dto.OAuthLoginCreateResponse;
import io.github.shizuki.site.user.service.UserService;
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

@WebMvcTest(OAuthLoginController.class)
class OAuthLoginControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private UserService userService;

    @Test
    void shouldCreateOauthLoginSuccessfully() throws Exception {
        OAuthLoginCreateResponse response = new OAuthLoginCreateResponse(
            "oauth-login-001",
            "https://github.com/login/oauth/authorize?...",
            "state-001"
        );
        Mockito.when(userService.createOAuthLogin(ArgumentMatchers.any(OAuthLoginCreateRequest.class)))
            .thenReturn(response);

        mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/oauth-logins")
                .contentType(MediaType.APPLICATION_JSON)
                .content("""
                    {
                      "provider": "github",
                      "redirect_uri": "https://example.com/oauth/callback"
                    }
                    """))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.oauth_login_id").value("oauth-login-001"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.state").value("state-001"));
    }

    @Test
    void shouldExchangeTokenSuccessfully() throws Exception {
        Mockito.when(userService.exchangeOAuthToken(
                ArgumentMatchers.eq("oauth-login-001"),
                ArgumentMatchers.eq("code-001"),
                ArgumentMatchers.eq("state-001")
            ))
            .thenReturn("token-001");

        mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/oauth-logins/oauth-login-001/tokens")
                .contentType(MediaType.APPLICATION_JSON)
                .content("""
                    {
                      "code": "code-001",
                      "state": "state-001"
                    }
                    """))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.token").value("token-001"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.authorization").value("Bearer token-001"));
    }

    @Test
    void shouldReturnBadRequestWhenCreateRequestProviderBlank() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/oauth-logins")
                .contentType(MediaType.APPLICATION_JSON)
                .content("""
                    {
                      "provider": "",
                      "redirect_uri": "https://example.com/oauth/callback"
                    }
                    """))
            .andExpect(MockMvcResultMatchers.status().isBadRequest());
    }

    @Test
    void shouldReturnBadRequestWhenCreateRequestRedirectBlank() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/oauth-logins")
                .contentType(MediaType.APPLICATION_JSON)
                .content("""
                    {
                      "provider": "github",
                      "redirect_uri": ""
                    }
                    """))
            .andExpect(MockMvcResultMatchers.status().isBadRequest());
    }

    @Test
    void shouldReturnBadRequestWhenExchangeRequestCodeBlank() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/oauth-logins/oauth-login-001/tokens")
                .contentType(MediaType.APPLICATION_JSON)
                .content("""
                    {
                      "code": "",
                      "state": "state-001"
                    }
                    """))
            .andExpect(MockMvcResultMatchers.status().isBadRequest());
    }

    @Test
    void shouldReturnBusinessErrorWhenOAuthStateInvalid() throws Exception {
        // Given: oauth_login_id 存在但 state 已过期/被消费
        Mockito.when(userService.exchangeOAuthToken(
                ArgumentMatchers.eq("oauth-login-001"),
                ArgumentMatchers.eq("code-001"),
                ArgumentMatchers.eq("state-expired")
            ))
            .thenThrow(new BusinessException(ErrorCode.BAD_REQUEST, "Invalid oauth state"));

        // When / Then: 控制器应透传业务错误码，供前端正确提示用户重试登录
        mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/oauth-logins/oauth-login-001/tokens")
                .contentType(MediaType.APPLICATION_JSON)
                .content("""
                    {
                      "code": "code-001",
                      "state": "state-expired"
                    }
                    """))
            .andExpect(ApiErrorAssertions.hasProblem(400, "BAD_REQUEST"));
    }
}
