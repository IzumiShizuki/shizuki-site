package io.github.shizuki.site.content.controller;

import io.github.shizuki.common.core.response.PageResponse;
import io.github.shizuki.site.content.dto.AuthorPostItemResponse;
import io.github.shizuki.site.content.dto.PostContentRelayResponse;
import io.github.shizuki.site.content.service.ContentService;
import java.time.LocalDateTime;
import java.util.List;
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
}
