package io.github.shizuki.site.user.controller;

import io.github.shizuki.site.user.response.MusicSourceAccountBindSessionCreateResponse;
import io.github.shizuki.site.user.response.MusicSourceAccountBindSessionStatusResponse;
import io.github.shizuki.site.user.service.MusicSourceAccountBindSessionService;
import io.github.shizuki.site.user.service.MusicSourceAccountCookieVerifier;
import io.github.shizuki.site.user.service.UserService;
import java.time.LocalDateTime;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@WebMvcTest(MeMusicSourceAccountController.class)
class MeMusicSourceAccountControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private UserService userService;

    @MockBean
    private MusicSourceAccountCookieVerifier cookieVerifier;

    @MockBean
    private MusicSourceAccountBindSessionService bindSessionService;

    @Test
    void shouldCreateNeteaseQrBindSessionSuccessfully() throws Exception {
        Mockito.when(bindSessionService.createSession(ArgumentMatchers.anyLong(), ArgumentMatchers.eq("netease")))
            .thenReturn(
                new MusicSourceAccountBindSessionCreateResponse(
                    "netease",
                    "session-1",
                    "bind-token-1",
                    "PENDING",
                    "https://music.163.com/login?codekey=demo",
                    "qr",
                    "https://music.163.com/login?codekey=demo",
                    "data:image/png;base64,abc",
                    "WAIT_SCAN",
                    "请使用手机网易云扫码登录",
                    900,
                    LocalDateTime.of(2026, 6, 28, 12, 0)
                )
            );

        mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/me/music/source-accounts/netease/bind-sessions"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.login_mode").value("qr"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.qr_status").value("WAIT_SCAN"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.qr_image").value("data:image/png;base64,abc"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.poll_interval_ms").value(900));
    }

    @Test
    void shouldGetNeteaseQrBindSessionStatusSuccessfully() throws Exception {
        Mockito.when(bindSessionService.getSessionStatus(ArgumentMatchers.anyLong(), ArgumentMatchers.eq("netease"), ArgumentMatchers.eq("session-1")))
            .thenReturn(
                new MusicSourceAccountBindSessionStatusResponse(
                    "netease",
                    "session-1",
                    "PENDING",
                    "qr",
                    "WAIT_CONFIRM",
                    "扫码成功，请在手机上确认登录",
                    900,
                    LocalDateTime.of(2026, 6, 28, 12, 0),
                    null,
                    ""
                )
            );

        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/me/music/source-accounts/netease/bind-sessions/session-1"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.login_mode").value("qr"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.qr_status").value("WAIT_CONFIRM"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.qr_message").value("扫码成功，请在手机上确认登录"));
    }
}
