package io.github.shizuki.site.content.controller;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.common.core.response.PageResponse;
import io.github.shizuki.site.content.dto.AppSummary;
import io.github.shizuki.site.content.service.ContentService;
import io.github.shizuki.site.content.support.ApiErrorAssertions;
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

/**
 * {@link AppController} 控制器层集成测试。
 *
 * <p>覆盖应用分页查询成功、业务异常映射和边界分页参数透传行为。
 */
@WebMvcTest(AppController.class)
class AppControllerIntegrationTest {

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
     * 接口：GET /api/v1/apps
     * 目标：验证应用分页查询成功响应。
     */
    @Test
    void shouldListAppsSuccessfully() throws Exception {
        Mockito.when(contentService.listApps(ArgumentMatchers.eq(1L), ArgumentMatchers.eq(10L)))
            .thenReturn(PageResponse.of(
                List.of(new AppSummary(1L, "Focus Timer", "study", true)),
                1,
                1,
                10
            ));

        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/apps")
                .param("page_no", "1")
                .param("page_size", "10"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.items[0].app_id").value(1))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.items[0].name").value("Focus Timer"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.items[0].pin_able").value(true));
    }

    /**
     * 接口：GET /api/v1/apps
     * 目标：验证 service 抛出 NOT_FOUND 时映射为 problem+json 的 404 响应。
     */
    @Test
    void shouldReturnNotFoundWhenAppListQueryFailed() throws Exception {
        Mockito.when(contentService.listApps(ArgumentMatchers.eq(1L), ArgumentMatchers.eq(10L)))
            .thenThrow(new BusinessException(ErrorCode.NOT_FOUND, "App not found"));

        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/apps")
                .param("page_no", "1")
                .param("page_size", "10"))
            .andExpect(ApiErrorAssertions.hasProblem(404, "NOT_FOUND"));
    }

    /**
     * 接口：GET /api/v1/apps
     * 目标：验证边界分页参数会原样透传给 service 并返回对应分页元信息。
     */
    @Test
    void shouldSupportBoundaryPagingWhenListingApps() throws Exception {
        Mockito.when(contentService.listApps(ArgumentMatchers.eq(0L), ArgumentMatchers.eq(100L)))
            .thenReturn(PageResponse.of(List.of(), 0, 0, 100));

        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/apps")
                .param("page_no", "0")
                .param("page_size", "100"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.page_no").value(0))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.page_size").value(100));
    }
}
