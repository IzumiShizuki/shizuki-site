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

@WebMvcTest(InteractionController.class)
class InteractionControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ContentService contentService;

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

    @Test
    void shouldReturnNotFoundWhenLikePostTargetMissing() throws Exception {
        Mockito.when(contentService.likePost(ArgumentMatchers.eq(404L)))
            .thenThrow(new BusinessException(ErrorCode.NOT_FOUND, "Post not found"));

        mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/posts/404/likes"))
            .andExpect(ApiErrorAssertions.hasProblem(404, "NOT_FOUND"));
    }

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
