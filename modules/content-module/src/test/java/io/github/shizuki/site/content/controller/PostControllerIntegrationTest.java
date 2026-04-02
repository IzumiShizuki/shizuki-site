package io.github.shizuki.site.content.controller;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.common.core.response.PageResponse;
import io.github.shizuki.site.content.request.AuthorWhisperRequest;
import io.github.shizuki.site.content.response.AuthorWhisperSubmitResponse;
import io.github.shizuki.site.content.response.PostPresentationDownloadResponse;
import io.github.shizuki.site.content.response.PostPresentationResponse;
import io.github.shizuki.site.content.response.PostSidebarResponse;
import io.github.shizuki.site.content.response.PostSummary;
import io.github.shizuki.site.content.service.ContentService;
import io.github.shizuki.site.content.support.ApiErrorAssertions;
import java.time.LocalDateTime;
import java.util.List;
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

/**
 * {@link PostController} 控制器层集成测试。
 *
 * <p>覆盖帖子分页查询成功、业务异常映射和边界分页参数透传行为。
 */
@WebMvcTest(PostController.class)
class PostControllerIntegrationTest {

    /**
     * MockMvc 请求入口，用于执行 controller 层 HTTP 断言。
     */
    @Autowired
    private MockMvc mockMvc;

    /**
     * 内容服务 mock，用于隔离 controller 参数绑定与响应映射行为。
     */
    @MockBean
    private ContentService contentService;

    /**
     * 接口：GET /api/v1/posts
     * 目标：验证分页查询成功时返回标准分页结构和帖子摘要字段。
     */
    @Test
    void shouldListPostsSuccessfully() throws Exception {
        Mockito.when(contentService.listPosts(
                ArgumentMatchers.eq(1L),
                ArgumentMatchers.eq(10L),
                ArgumentMatchers.isNull(),
                ArgumentMatchers.isNull(),
                ArgumentMatchers.isNull(),
                ArgumentMatchers.isNull(),
                ArgumentMatchers.isNull()
            ))
            .thenReturn(PageResponse.of(
                List.of(new PostSummary(
                    1L,
                    "Shizuki v0.1",
                    "Project kickoff post",
                    "https://example.com/cover.png",
                    "PUBLIC",
                    "dev",
                    List.of("spring", "java"),
                    860L,
                    3,
                    12L,
                    LocalDateTime.now()
                )),
                1,
                1,
                10
            ));

        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/posts")
                .param("page_no", "1")
                .param("page_size", "10"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.total").value(1))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.items[0].post_id").value(1))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.items[0].title").value("Shizuki v0.1"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.items[0].word_count").value(860));
    }

    /**
     * 接口：GET /api/v1/posts
     * 目标：验证 service 抛出 NOT_FOUND 时映射为 problem+json 的 404 响应。
     */
    @Test
    void shouldReturnBusinessErrorWhenListPostsThrowsNotFound() throws Exception {
        Mockito.when(contentService.listPosts(
                ArgumentMatchers.eq(1L),
                ArgumentMatchers.eq(10L),
                ArgumentMatchers.isNull(),
                ArgumentMatchers.isNull(),
                ArgumentMatchers.isNull(),
                ArgumentMatchers.isNull(),
                ArgumentMatchers.isNull()
            ))
            .thenThrow(new BusinessException(ErrorCode.NOT_FOUND, "Post not found"));

        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/posts")
                .param("page_no", "1")
                .param("page_size", "10"))
            .andExpect(ApiErrorAssertions.hasProblem(404, "NOT_FOUND"));
    }

    /**
     * 接口：GET /api/v1/posts
     * 目标：验证边界分页参数会原样透传给 service 并返回对应分页元信息。
     */
    @Test
    void shouldPassBoundaryPagingParamsToService() throws Exception {
        Mockito.when(contentService.listPosts(
                ArgumentMatchers.eq(0L),
                ArgumentMatchers.eq(200L),
                ArgumentMatchers.isNull(),
                ArgumentMatchers.isNull(),
                ArgumentMatchers.isNull(),
                ArgumentMatchers.isNull(),
                ArgumentMatchers.isNull()
            ))
            .thenReturn(PageResponse.of(List.of(), 0, 0, 200));

        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/posts")
                .param("page_no", "0")
                .param("page_size", "200"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.page_no").value(0))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.page_size").value(200));
    }

    @Test
    void shouldReturnSidebarAggregationSuccessfully() throws Exception {
        Mockito.when(contentService.getPostSidebar())
            .thenReturn(new PostSidebarResponse(
                List.of(new PostSidebarResponse.LatestPostItem(1L, "latest", LocalDateTime.now(), "https://example.com/cover.png")),
                List.of(new PostSidebarResponse.CategoryStatItem("game", 2L, "游戏", "https://example.com/game.png")),
                List.of(new PostSidebarResponse.TagStatItem("ai", 3L)),
                List.of(new PostSidebarResponse.ArchiveStatItem("2026-03", 4L))
            ));

        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/posts/sidebar"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.latest_posts[0].post_id").value(1))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.categories[0].category_code").value("game"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.categories[0].display_name").value("游戏"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.categories[0].cover_image_url").value("https://example.com/game.png"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.tags[0].tag_code").value("ai"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.archives[0].month").value("2026-03"));
    }

    @Test
    void shouldSubmitWhisperSuccessfully() throws Exception {
        Mockito.when(contentService.submitAuthorWhisper(ArgumentMatchers.any(AuthorWhisperRequest.class)))
            .thenReturn(new AuthorWhisperSubmitResponse(9001L, "CREATED", 1L, true));

        mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/posts/whispers")
                .contentType(MediaType.APPLICATION_JSON)
                .content("""
                    {
                      "content": "hello author",
                      "remark": "anonymous",
                      "post_id": 1
                    }
                    """))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.whisper_id").value(9001))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.status").value("CREATED"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.target_post_id").value(1))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.accepted").value(true));
    }

    @Test
    void shouldReturnPublishedPresentationSuccessfully() throws Exception {
        Mockito.when(contentService.getPublishedPostPresentation(ArgumentMatchers.eq(18L)))
            .thenReturn(new PostPresentationResponse(
                18L,
                "READY",
                4,
                LocalDateTime.of(2026, 3, 24, 10, 0),
                "v1",
                "# Intro",
                true,
                ""
            ));

        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/posts/18/presentation"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.post_id").value(18))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.status").value("READY"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.slide_count").value(4))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.ppt_ready").value(true));
    }

    @Test
    void shouldReturnPublishedPresentationDownloadSuccessfully() throws Exception {
        Mockito.when(contentService.getPublishedPostPresentationDownload(ArgumentMatchers.eq(18L)))
            .thenReturn(new PostPresentationDownloadResponse(
                "https://example.com/public-presentation.pptx",
                "public-presentation.pptx"
            ));

        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/posts/18/presentation/ppt-download-url"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.download_url").value("https://example.com/public-presentation.pptx"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.file_name").value("public-presentation.pptx"));
    }
}
