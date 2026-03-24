package io.github.shizuki.site.content.controller;

import io.github.shizuki.common.core.response.PageResponse;
import io.github.shizuki.site.content.dto.AuthorPostItemResponse;
import io.github.shizuki.site.content.dto.PostContentRelayResponse;
import io.github.shizuki.site.content.dto.PostEditorPolicyResponse;
import io.github.shizuki.site.content.dto.PostPresentationDownloadResponse;
import io.github.shizuki.site.content.dto.PostPresentationResponse;
import io.github.shizuki.site.content.service.ContentService;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;
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

@WebMvcTest(MyPostController.class)
class MyPostControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ContentService contentService;

    @Test
    void shouldListMineSuccessfully() throws Exception {
        Mockito.when(contentService.listMyPosts(ArgumentMatchers.eq(1L), ArgumentMatchers.eq(10L), ArgumentMatchers.isNull(), ArgumentMatchers.isNull()))
            .thenReturn(PageResponse.of(
                List.of(new AuthorPostItemResponse(
                    10L,
                    "draft title",
                    "draft summary",
                    "game",
                    "draft-title",
                    "https://example.com/draft-cover.png",
                    "PRIVATE",
                    "DRAFT",
                    List.of("tag1"),
                    120L,
                    20L,
                    1,
                    0L,
                    null,
                    LocalDateTime.now()
                )),
                1,
                1,
                10
            ));

        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/me/posts")
                .param("page_no", "1")
                .param("page_size", "10"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.items[0].post_id").value(10));
    }

    @Test
    void shouldRelayMarkdownSuccessfully() throws Exception {
        Mockito.when(contentService.relayPostMarkdown(ArgumentMatchers.any()))
            .thenReturn(new PostContentRelayResponse("blog-private", "blog-posts/user-1/test.md", "text/markdown", 12L));

        MockMultipartFile file = new MockMultipartFile(
            "file",
            "test.md",
            "text/markdown",
            "# hello".getBytes()
        );

        mockMvc.perform(MockMvcRequestBuilders.multipart("/api/v1/me/posts/content-relay")
                .file(file)
                .contentType(MediaType.MULTIPART_FORM_DATA))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.bucket").value("blog-private"));
    }

    @Test
    void shouldReturnCategoryPoliciesSuccessfully() throws Exception {
        Mockito.when(contentService.getMyPostCategoryPolicies())
            .thenReturn(new PostEditorPolicyResponse(
                List.of("ADMIN", "FRIEND", "USER"),
                List.of(
                    new PostEditorPolicyResponse.CategoryDefaultItem(
                        "game",
                        true,
                        Set.of("USER", "FRIEND")
                    )
                )
            ));

        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/me/posts/category-policies"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.group_options[0]").value("ADMIN"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.category_defaults[0].category_code").value("game"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.category_defaults[0].enabled").value(true));
    }

    @Test
    void shouldGeneratePresentationSuccessfully() throws Exception {
        Mockito.when(contentService.generateMyPostPresentation(ArgumentMatchers.eq(12L)))
            .thenReturn(new PostPresentationResponse(
                12L,
                "GENERATING",
                0,
                null,
                "v1",
                "",
                false,
                ""
            ));

        mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/me/posts/12/presentation/generate"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.post_id").value(12))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.status").value("GENERATING"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.ppt_ready").value(false));
    }

    @Test
    void shouldReturnMyPresentationSuccessfully() throws Exception {
        Mockito.when(contentService.getMyPostPresentation(ArgumentMatchers.eq(12L)))
            .thenReturn(new PostPresentationResponse(
                12L,
                "READY",
                5,
                LocalDateTime.of(2026, 3, 24, 9, 30),
                "v1",
                "# Deck",
                true,
                ""
            ));

        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/me/posts/12/presentation"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.post_id").value(12))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.status").value("READY"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.slide_count").value(5))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.ppt_ready").value(true));
    }

    @Test
    void shouldReturnMyPresentationDownloadSuccessfully() throws Exception {
        Mockito.when(contentService.getMyPostPresentationDownload(ArgumentMatchers.eq(12L)))
            .thenReturn(new PostPresentationDownloadResponse(
                "https://example.com/presentation.pptx",
                "presentation.pptx"
            ));

        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/me/posts/12/presentation/ppt-download-url"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.download_url").value("https://example.com/presentation.pptx"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.file_name").value("presentation.pptx"));
    }
}
