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

@WebMvcTest(AuthBindingController.class)
class AuthBindingControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private AuthService authService;

    @Test
    void shouldReturnUnauthorizedWhenBindEmailWithoutLoginContext() throws Exception {
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
        Mockito.verify(authService, Mockito.never()).bindOAuth(ArgumentMatchers.any(), ArgumentMatchers.any());
    }
}

