package io.github.shizuki.site.user.controller;

import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import io.github.shizuki.site.user.dto.auth.AuthIntrospectResponse;
import io.github.shizuki.site.user.dto.auth.AuthLoginResponse;
import io.github.shizuki.site.user.service.UserService;
import java.util.Set;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(AuthController.class)
class AuthControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private UserService userService;

    @Test
    void shouldLoginSuccessfully() throws Exception {
        when(userService.login(eq("admin"), eq("admin123")))
            .thenReturn(new AuthLoginResponse("token-123", "Bearer", 1L));

        mockMvc.perform(post("/api/v1/auth/login")
                .contentType(MediaType.APPLICATION_JSON)
                .content("""
                    {
                      "username": "admin",
                      "password": "admin123"
                    }
                    """))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.code").value("OK"))
            .andExpect(jsonPath("$.data.token").value("token-123"))
            .andExpect(jsonPath("$.data.token_type").value("Bearer"))
            .andExpect(jsonPath("$.data.user_id").value(1));
    }

    @Test
    void shouldIntrospectSuccessfully() throws Exception {
        when(userService.introspect())
            .thenReturn(new AuthIntrospectResponse(1L, Set.of("ADMIN"), Set.of("blog.post.create")));

        mockMvc.perform(get("/api/v1/auth/introspect"))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.code").value("OK"))
            .andExpect(jsonPath("$.data.user_id").value(1))
            .andExpect(jsonPath("$.data.groups[0]").value("ADMIN"));
    }

    @Test
    void shouldLogoutSuccessfully() throws Exception {
        doNothing().when(userService).logout();

        mockMvc.perform(post("/api/v1/auth/logout"))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.code").value("OK"))
            .andExpect(jsonPath("$.data.status").value("OK"));
    }
}
