package io.github.shizuki.site.content.controller;

import io.github.shizuki.site.content.response.AuthorProfileResponse;
import io.github.shizuki.site.content.service.ContentService;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@WebMvcTest(AdminAuthorProfileController.class)
class AdminAuthorProfileControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ContentService contentService;

    @Test
    void shouldGetAdminAuthorProfileSuccessfully() throws Exception {
        Mockito.when(contentService.getAdminAuthorProfile())
            .thenReturn(new AuthorProfileResponse(
                "shizuki",
                true,
                Map.of(
                    "hero", Map.of("name", "Shizuki"),
                    "skills", List.of("Java", "Vue3")
                ),
                LocalDateTime.of(2026, 3, 4, 21, 0, 0)
            ));

        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/admin/author/profile"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.header().string(HttpHeaders.CACHE_CONTROL, "no-store"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.author_code").value("shizuki"));
    }

    @Test
    void shouldUpdateAdminAuthorProfileSuccessfully() throws Exception {
        Mockito.when(contentService.upsertAdminAuthorProfile(ArgumentMatchers.any()))
            .thenReturn(new AuthorProfileResponse(
                "shizuki",
                true,
                Map.of(
                    "hero", Map.of("name", "Shizuki Updated"),
                    "skills", List.of("Java", "Spring Boot")
                ),
                LocalDateTime.of(2026, 3, 4, 22, 0, 0)
            ));

        mockMvc.perform(MockMvcRequestBuilders.put("/api/v1/admin/author/profile")
                .contentType(MediaType.APPLICATION_JSON)
                .content("""
                    {
                      "enabled": true,
                      "profile_json": {
                        "hero": {
                          "name": "Shizuki Updated"
                        },
                        "skills": ["Java", "Spring Boot"]
                      }
                    }
                    """))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.header().string(HttpHeaders.CACHE_CONTROL, "no-store"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.profile_json.hero.name").value("Shizuki Updated"));
    }

    @Test
    void shouldReturnBadRequestWhenProfilePayloadEmpty() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.put("/api/v1/admin/author/profile")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{}"))
            .andExpect(MockMvcResultMatchers.status().isBadRequest());
    }
}
