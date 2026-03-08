package io.github.shizuki.site.media.controller;

import io.github.shizuki.site.media.dto.WallpaperImportJobResponse;
import io.github.shizuki.site.media.dto.WallpaperProfileResponse;
import io.github.shizuki.site.media.service.WallpaperService;
import io.github.shizuki.site.media.support.ApiErrorAssertions;
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
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@WebMvcTest(HomeWallpaperController.class)
class HomeWallpaperControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private WallpaperService wallpaperService;

    @Test
    void shouldImportPackageSuccessfully() throws Exception {
        Mockito.when(wallpaperService.importPackage(ArgumentMatchers.any(), ArgumentMatchers.eq("PRIVATE"), ArgumentMatchers.eq("天空")))
            .thenReturn(new WallpaperImportJobResponse(
                9001L,
                "PACKAGE",
                "SUCCEEDED",
                "PRIVATE",
                3001L,
                "",
                ""
            ));

        MockMultipartFile file = new MockMultipartFile("file", "sky.png", "image/png", new byte[] {1, 2, 3});

        mockMvc.perform(MockMvcRequestBuilders.multipart("/api/v1/home-wallpapers/imports/package")
                .file(file)
                .param("visibility", "PRIVATE")
                .param("title", "天空")
                .contentType(MediaType.MULTIPART_FORM_DATA))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.job_id").value(9001))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.status").value("SUCCEEDED"));
    }

    @Test
    void shouldCreateWorkshopImportJobSuccessfully() throws Exception {
        Mockito.when(wallpaperService.importWorkshop(ArgumentMatchers.any()))
            .thenReturn(new WallpaperImportJobResponse(
                9002L,
                "WORKSHOP",
                "PENDING",
                "PRIVATE",
                null,
                "",
                ""
            ));

        mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/home-wallpapers/imports/workshop")
                .contentType(MediaType.APPLICATION_JSON)
                .content("""
                    {
                      "workshop_url": "https://steamcommunity.com/sharedfiles/filedetails/?id=2141505896",
                      "visibility": "PRIVATE",
                      "title": "雪景"
                    }
                    """))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.source_type").value("WORKSHOP"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.status").value("PENDING"));
    }

    @Test
    void shouldReturnBadRequestWhenWorkshopUrlMissing() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/home-wallpapers/imports/workshop")
                .contentType(MediaType.APPLICATION_JSON)
                .content("""
                    {
                      "visibility": "PRIVATE"
                    }
                    """))
            .andExpect(ApiErrorAssertions.hasProblem(400, "BAD_REQUEST"));
    }

    @Test
    void shouldListPublicWallpapersSuccessfully() throws Exception {
        Mockito.when(wallpaperService.listPublicWallpapers()).thenReturn(List.of(
            new WallpaperProfileResponse(
                3002L,
                "春日",
                "STATIC",
                "PUBLIC",
                "APPROVED",
                88L,
                6001L,
                "https://cdn.example.com/bg/spring.png",
                "https://cdn.example.com/bg/spring.png",
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
                "PACKAGE",
                "",
                false
            )
        ));

        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/home-wallpapers/public"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data[0].wallpaper_id").value(3002))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data[0].scene_type").value("STATIC"));
    }
}
