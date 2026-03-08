package io.github.shizuki.site.media.controller;

import io.github.shizuki.site.media.dto.AdminWallpaperAuditResponse;
import io.github.shizuki.site.media.dto.WallpaperProfileResponse;
import io.github.shizuki.site.media.service.WallpaperService;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
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

@WebMvcTest(AdminHomeWallpaperController.class)
class AdminHomeWallpaperControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private WallpaperService wallpaperService;

    @Test
    void shouldListPendingWallpapersSuccessfully() throws Exception {
        Mockito.when(wallpaperService.listPendingWallpapers()).thenReturn(List.of(
            new WallpaperProfileResponse(
                4001L,
                "待审壁纸",
                "DYNAMIC",
                "PUBLIC",
                "PENDING_AUDIT",
                99L,
                7001L,
                "https://cdn.example.com/bg/pending.mp4",
                "https://cdn.example.com/bg/pending.jpg",
                null,
                "",
                null,
                "",
                "",
                BigDecimal.ONE,
                BigDecimal.ONE,
                BigDecimal.ONE,
                Map.of(),
                Map.of(),
                "WORKSHOP",
                "2141505896",
                false
            )
        ));

        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/admin/home-wallpapers/pending"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data[0].wallpaper_id").value(4001))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data[0].audit_status").value("PENDING_AUDIT"));
    }

    @Test
    void shouldAuditWallpaperSuccessfully() throws Exception {
        Mockito.when(wallpaperService.auditWallpaper(ArgumentMatchers.eq(4001L), ArgumentMatchers.any()))
            .thenReturn(new AdminWallpaperAuditResponse(
                4001L,
                "APPROVED",
                "PUBLIC",
                "DYNAMIC",
                true
            ));

        mockMvc.perform(MockMvcRequestBuilders.put("/api/v1/admin/home-wallpapers/4001/audit-status")
                .contentType(MediaType.APPLICATION_JSON)
                .content("""
                    {
                      "audit_status": "APPROVED",
                      "visibility": "PUBLIC"
                    }
                    """))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.wallpaper_id").value(4001))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.audit_status").value("APPROVED"));
    }
}
