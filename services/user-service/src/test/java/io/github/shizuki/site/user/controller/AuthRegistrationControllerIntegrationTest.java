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

@WebMvcTest(AuthRegistrationController.class)
class AuthRegistrationControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private AuthService authService;

    @Test
    void shouldRegisterByEmailSuccessfully() throws Exception {
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

