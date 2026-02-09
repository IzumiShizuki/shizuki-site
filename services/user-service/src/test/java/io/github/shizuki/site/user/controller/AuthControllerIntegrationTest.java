package io.github.shizuki.site.user.controller;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.site.user.dto.auth.AuthIntrospectResponse;
import io.github.shizuki.site.user.dto.auth.AuthLoginResponse;
import io.github.shizuki.site.user.service.UserService;
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
    private UserService userService;

    @Test
    void shouldLoginSuccessfully() throws Exception {
        Mockito.when(userService.login(ArgumentMatchers.eq("admin"), ArgumentMatchers.eq("admin123")))
            .thenReturn(new AuthLoginResponse("token-123", "Bearer", 1L));

        mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/auth/login")
                .contentType(MediaType.APPLICATION_JSON)
                .content("""
                    {
                      "username": "admin",
                      "password": "admin123"
                    }
                    """))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.token").value("token-123"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.token_type").value("Bearer"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.user_id").value(1));
    }

    @Test
    void shouldIntrospectSuccessfully() throws Exception {
        Mockito.when(userService.introspect())
            .thenReturn(new AuthIntrospectResponse(1L, Set.of("ADMIN"), Set.of("blog.post.create")));

        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/auth/introspect"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.user_id").value(1))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.groups[0]").value("ADMIN"));
    }

    @Test
    void shouldLogoutSuccessfully() throws Exception {
        Mockito.doNothing().when(userService).logout();

        mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/auth/logout"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.status").value("OK"));
    }

    @Test
    void shouldReturnBadRequestWhenLoginUsernameBlank() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/auth/login")
                .contentType(MediaType.APPLICATION_JSON)
                .content("""
                    {
                      "username": "",
                      "password": "admin123"
                    }
                    """))
            .andExpect(MockMvcResultMatchers.status().isBadRequest());
    }

    @Test
    void shouldReturnUnauthorizedWhenLoginCredentialInvalid() throws Exception {
        Mockito.when(userService.login(ArgumentMatchers.eq("admin"), ArgumentMatchers.eq("wrong")))
            .thenThrow(new BusinessException(ErrorCode.UNAUTHORIZED, "Invalid username or password"));

        mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/auth/login")
                .contentType(MediaType.APPLICATION_JSON)
                .content("""
                    {
                      "username": "admin",
                      "password": "wrong"
                    }
                    """))
            .andExpect(ApiErrorAssertions.hasProblem(401, "UNAUTHORIZED"));
    }

    @Test
    void shouldReturnUnauthorizedWhenIntrospectTokenInvalid() throws Exception {
        Mockito.when(userService.introspect())
            .thenThrow(new BusinessException(ErrorCode.UNAUTHORIZED, "Token invalid"));

        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/auth/introspect"))
            .andExpect(ApiErrorAssertions.hasProblem(401, "UNAUTHORIZED"));
    }
}
