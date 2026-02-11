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

@WebMvcTest(AuthController.class)
class AuthControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private AuthService authService;

    @Test
    void shouldIssueTokenSuccessfully() throws Exception {
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

    @Test
    void shouldIntrospectSuccessfully() throws Exception {
        Mockito.when(authService.introspect())
            .thenReturn(new AuthIntrospectResponse(1L, Set.of("ADMIN"), Set.of("blog.post.create")));

        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/auth/introspect"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.user_id").value(1))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.groups[0]").value("ADMIN"));
    }

    @Test
    void shouldLogoutSuccessfully() throws Exception {
        Mockito.doNothing().when(authService).logout(ArgumentMatchers.any());

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

    @Test
    void shouldReturnUnauthorizedWhenGrantCredentialInvalid() throws Exception {
        Mockito.when(authService.issueToken(ArgumentMatchers.any()))
            .thenThrow(new BusinessException(ErrorCode.UNAUTHORIZED, "Invalid username or password"));

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

    @Test
    void shouldReturnUnauthorizedWhenIntrospectTokenInvalid() throws Exception {
        Mockito.when(authService.introspect())
            .thenThrow(new BusinessException(ErrorCode.UNAUTHORIZED, "Token invalid"));

        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/auth/introspect"))
            .andExpect(ApiErrorAssertions.hasProblem(401, "UNAUTHORIZED"));
    }
}
