package io.github.shizuki.site.content.controller;

import io.github.shizuki.common.core.response.PageResponse;
import io.github.shizuki.site.content.dto.AuthorWhisperItemResponse;
import io.github.shizuki.site.content.service.ContentService;
import java.time.LocalDateTime;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@WebMvcTest(AdminPostWhisperController.class)
class AdminPostWhisperControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ContentService contentService;

    @Test
    void shouldListAuthorWhispersSuccessfully() throws Exception {
        Mockito.when(contentService.listAuthorWhispers(ArgumentMatchers.eq(1L), ArgumentMatchers.eq(20L)))
            .thenReturn(PageResponse.of(
                List.of(new AuthorWhisperItemResponse(
                    9001L,
                    "CREATED",
                    1L,
                    "总体设计文档（初始）",
                    "hello author",
                    "访客A",
                    "qq:123",
                    LocalDateTime.of(2026, 3, 13, 10, 30)
                )),
                1,
                1,
                20
            ));

        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/admin/posts/whispers"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.total").value(1))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.items[0].whisper_id").value(9001))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.items[0].post_title").value("总体设计文档（初始）"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.items[0].content").value("hello author"));
    }
}
