package io.github.shizuki.site.media.controller;

import io.github.shizuki.site.media.service.WallpaperDiscoveryService;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.header;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@WebMvcTest(WallpaperDiscoveryController.class)
class WallpaperDiscoveryControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private WallpaperDiscoveryService wallpaperDiscoveryService;

    @Test
    void servesProgressiveNamesWithRetryMetadata() throws Exception {
        Mockito.when(wallpaperDiscoveryService.getWallhavenItem("pomle9"))
                .thenReturn(new io.github.shizuki.site.media.response.WallhavenItemDetailResponse("pomle9", "Tokyo", 0));
        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/home-wallpapers/discovery/wallhaven/items/pomle9"))
                .andExpect(status().isOk())
                .andExpect(org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath("$.data.title").value("Tokyo"));
    }

    @Test
    void servesCacheableImagePreviewBytes() throws Exception {
        Mockito.when(wallpaperDiscoveryService.fetchPreview(
                ArgumentMatchers.eq("wallhaven"), ArgumentMatchers.eq("x8gxgz")))
            .thenReturn(new WallpaperDiscoveryService.WallpaperPreview(
                    new byte[] {(byte) 0xff, (byte) 0xd8, (byte) 0xff}, "image/jpeg"));

        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/home-wallpapers/discovery/preview/wallhaven/x8gxgz"))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.IMAGE_JPEG))
            .andExpect(header().string("Cache-Control", "max-age=1800, public"))
            .andExpect(content().bytes(new byte[] {(byte) 0xff, (byte) 0xd8, (byte) 0xff}));
    }
}
