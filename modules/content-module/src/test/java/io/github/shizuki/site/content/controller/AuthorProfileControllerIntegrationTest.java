package io.github.shizuki.site.content.controller;

import io.github.shizuki.site.content.dto.AuthorProfileResponse;
import io.github.shizuki.site.content.service.ContentService;
import io.github.shizuki.site.content.support.AuthorProfileHttpCacheSupport;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.http.HttpHeaders;
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

    private AuthorProfileResponse buildSampleResponse() {
        return new AuthorProfileResponse(
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
        );
    }

    @Test
    void shouldReturnAuthorProfileSuccessfully() throws Exception {
        AuthorProfileResponse sample = buildSampleResponse();
        Mockito.when(contentService.getAuthorProfile()).thenReturn(sample);

        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/author/profile"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.header().string(HttpHeaders.CACHE_CONTROL, "max-age=60, public, stale-while-revalidate=300"))
            .andExpect(MockMvcResultMatchers.header().exists(HttpHeaders.ETAG))
            .andExpect(MockMvcResultMatchers.header().exists(HttpHeaders.LAST_MODIFIED))
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.author_code").value("shizuki"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.enabled").value(true))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.profile_json.hero.name").value("Shizuki"));
    }

    @Test
    void shouldReturnNotModifiedWhenIfNoneMatchMatched() throws Exception {
        AuthorProfileResponse sample = buildSampleResponse();
        String etag = AuthorProfileHttpCacheSupport.buildWeakEtag(sample);
        Mockito.when(contentService.getAuthorProfile()).thenReturn(sample);

        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/author/profile").header(HttpHeaders.IF_NONE_MATCH, etag))
            .andExpect(MockMvcResultMatchers.status().isNotModified())
            .andExpect(MockMvcResultMatchers.header().string(HttpHeaders.ETAG, etag))
            .andExpect(MockMvcResultMatchers.content().string(""));
    }
}
