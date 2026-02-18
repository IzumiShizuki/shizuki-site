package io.github.shizuki.site.content.controller;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.site.content.dto.ReportRequest;
import io.github.shizuki.site.content.service.ContentService;
import io.github.shizuki.site.content.support.ApiErrorAssertions;
import java.util.Map;
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
 * {@link InteractionController} 控制器层集成测试。
 *
 * <p>覆盖点赞与举报接口在成功路径、业务异常和参数校验上的行为。
 */
@WebMvcTest(InteractionController.class)
class InteractionControllerIntegrationTest {

    /**
     * MockMvc 请求入口，用于执行 controller 层 HTTP 断言。
     */
    @Autowired
    private MockMvc mockMvc;

    /**
     * 内容服务 mock，用于隔离 controller 参数映射与响应断言。
     */
    @MockBean
    private ContentService contentService;

    /**
     * 接口：POST /api/v1/posts/{post_id}/likes
     * 目标：验证帖子点赞成功响应。
     */
    @Test
    void shouldLikePostSuccessfully() throws Exception {
        Mockito.when(contentService.likePost(ArgumentMatchers.eq(1L)))
            .thenReturn(Map.of("post_id", 1, "liked", true));

        mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/posts/1/likes"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.post_id").value(1))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.liked").value(true));
    }

    /**
     * 接口：POST /api/v1/apps/{app_id}/likes
     * 目标：验证应用点赞成功响应。
     */
    @Test
    void shouldLikeAppSuccessfully() throws Exception {
        Mockito.when(contentService.likeApp(ArgumentMatchers.eq(2L)))
            .thenReturn(Map.of("app_id", 2, "liked", true));

        mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/apps/2/likes"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.app_id").value(2))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.liked").value(true));
    }

    /**
     * 接口：POST /api/v1/reports
     * 目标：验证举报提交成功响应。
     */
    @Test
    void shouldReportSuccessfully() throws Exception {
        Mockito.when(contentService.report(ArgumentMatchers.any(ReportRequest.class)))
            .thenReturn(Map.of("status", "CREATED"));

        mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/reports")
                .contentType(MediaType.APPLICATION_JSON)
                .content("""
                    {
                      "target_type": "POST",
                      "target_id": 1,
                      "reason": "spam"
                    }
                    """))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.status").value("CREATED"));
    }

    /**
     * 接口：POST /api/v1/posts/{post_id}/likes
     * 目标：验证目标不存在时返回 404。
     */
    @Test
    void shouldReturnNotFoundWhenLikePostTargetMissing() throws Exception {
        Mockito.when(contentService.likePost(ArgumentMatchers.eq(404L)))
            .thenThrow(new BusinessException(ErrorCode.NOT_FOUND, "Post not found"));

        mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/posts/404/likes"))
            .andExpect(ApiErrorAssertions.hasProblem(404, "NOT_FOUND"));
    }

    /**
     * 接口：POST /api/v1/reports
     * 目标：验证 reason 为空触发参数校验失败（400）。
     */
    @Test
    void shouldReturnBadRequestWhenReportReasonBlank() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/reports")
                .contentType(MediaType.APPLICATION_JSON)
                .content("""
                    {
                      "target_type": "POST",
                      "target_id": 1,
                      "reason": ""
                    }
                    """))
            .andExpect(ApiErrorAssertions.hasProblem(400, "BAD_REQUEST"));
    }

    /**
     * 接口：POST /api/v1/reports
     * 目标：验证 target_id 缺失触发参数校验失败（400）。
     */
    @Test
    void shouldReturnBadRequestWhenReportTargetIdMissing() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/reports")
                .contentType(MediaType.APPLICATION_JSON)
                .content("""
                    {
                      "target_type": "POST",
                      "reason": "spam"
                    }
                    """))
            .andExpect(ApiErrorAssertions.hasProblem(400, "BAD_REQUEST"));
    }
}
