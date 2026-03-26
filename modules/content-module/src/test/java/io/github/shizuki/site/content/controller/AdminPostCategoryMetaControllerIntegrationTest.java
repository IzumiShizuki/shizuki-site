package io.github.shizuki.site.content.controller;

import io.github.shizuki.site.content.dto.PostCategoryMetaResponse;
import io.github.shizuki.site.content.service.ContentService;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@WebMvcTest(AdminPostCategoryMetaController.class)
class AdminPostCategoryMetaControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ContentService contentService;

    @Test
    void shouldListCategoryMetasSuccessfully() throws Exception {
        Mockito.when(contentService.listPostCategoryMetas())
            .thenReturn(List.of(new PostCategoryMetaResponse("game", "游戏", "https://example.com/game.png", 10, true)));

        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/admin/posts/categories"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data[0].category_code").value("game"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data[0].display_name").value("游戏"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data[0].cover_image_url").value("https://example.com/game.png"));
    }

    @Test
    void shouldUpdateCategoryMetaSuccessfully() throws Exception {
        Mockito.when(contentService.upsertPostCategoryMeta(Mockito.eq("game"), Mockito.any()))
            .thenReturn(new PostCategoryMetaResponse("game", "游戏", "https://example.com/game.png", 10, true));

        mockMvc.perform(MockMvcRequestBuilders.put("/api/v1/admin/posts/categories/game")
                .contentType(MediaType.APPLICATION_JSON)
                .content("""
                    {
                      "display_name": "游戏",
                      "cover_image_url": "https://example.com/game.png",
                      "sort_num": 10,
                      "enabled": true
                    }
                    """))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.category_code").value("game"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.display_name").value("游戏"));
    }

    @Test
    void shouldDeleteCategoryMetaSuccessfully() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.delete("/api/v1/admin/posts/categories/game"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.deleted").value(true))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.category_code").value("game"));

        Mockito.verify(contentService).deletePostCategoryMeta("game");
    }
}
