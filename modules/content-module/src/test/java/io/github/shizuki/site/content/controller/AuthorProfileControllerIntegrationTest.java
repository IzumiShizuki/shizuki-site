package io.github.shizuki.site.content.controller;

import io.github.shizuki.site.content.dto.AuthorProfileResponse;
import io.github.shizuki.site.content.service.ContentService;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@WebMvcTest(AuthorProfileController.class)
class AuthorProfileControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ContentService contentService;

    @Test
    void shouldReturnAuthorProfileSuccessfully() throws Exception {
        Mockito.when(contentService.getAuthorProfile())
            .thenReturn(new AuthorProfileResponse(
                "shizuki",
                true,
                Map.of(
                    "hero", Map.of(
                        "name", "Shizuki",
                        "quote", "愿你终将与热爱相逢"
                    ),
                    "skills", List.of("Java", "Vue3")
                ),
                LocalDateTime.of(2026, 3, 4, 21, 0, 0)
            ));

        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/author/profile"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.author_code").value("shizuki"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.enabled").value(true))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.profile_json.hero.name").value("Shizuki"));
    }
}
