package io.github.shizuki.site.content.controller;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.site.content.dto.LightAppBalanceAnalyticsRange;
import io.github.shizuki.site.content.dto.LightAppBalanceAnalyticsResponse;
import io.github.shizuki.site.content.dto.LightAppBalanceAnalyticsSummary;
import io.github.shizuki.site.content.dto.LightAppBalanceAssetSnapshot;
import io.github.shizuki.site.content.dto.LightAppBalanceCategoryBreakdownItem;
import io.github.shizuki.site.content.dto.LightAppBalanceChannelBreakdownItem;
import io.github.shizuki.site.content.dto.LightAppBalanceDailyTrendItem;
import io.github.shizuki.site.content.dto.LightAppBalanceTransactionResponse;
import io.github.shizuki.site.content.dto.LightAppProjectResponse;
import io.github.shizuki.site.content.dto.LightAppPomodoroResponse;
import io.github.shizuki.site.content.dto.LightAppScheduleResponse;
import io.github.shizuki.site.content.dto.LightAppTaskColumnResponse;
import io.github.shizuki.site.content.dto.LightAppTaskResponse;
import io.github.shizuki.site.content.dto.LightAppTodoResponse;
import io.github.shizuki.site.content.dto.LightAppUrlLinkResolveResponse;
import io.github.shizuki.site.content.dto.LightAppUrlLinkResponse;
import io.github.shizuki.site.content.dto.LightAppWhiteboardResponse;
import io.github.shizuki.site.content.dto.LightAppWhiteboardSummaryResponse;
import io.github.shizuki.site.content.service.LightAppService;
import io.github.shizuki.site.content.support.ApiErrorAssertions;
import java.math.BigDecimal;
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

@WebMvcTest(LightAppController.class)
class LightAppControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private LightAppService lightAppService;

    @Test
    void shouldListProjectsSuccessfully() throws Exception {
        Mockito.when(lightAppService.listProjects())
            .thenReturn(List.of(new LightAppProjectResponse(1L, "p_abc", "学习计划", "desc", "#6aa9ff", false, 10, null)));

        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/light-apps/projects"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data[0].project_id").value(1))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data[0].project_code").value("p_abc"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data[0].name").value("学习计划"));
    }

    @Test
    void shouldListPomodorosSuccessfully() throws Exception {
        Mockito.when(lightAppService.listPomodoros())
            .thenReturn(List.of(
                new LightAppPomodoroResponse(
                    1L,
                    "高强度学习",
                    25,
                    5,
                    15,
                    4,
                    false,
                    "BUILTIN",
                    "Soft Bell",
                    "soft-bell",
                    null,
                    10,
                    null
                )
            ));

        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/light-apps/pomodoros"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data[0].pomodoro_id").value(1))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data[0].title").value("高强度学习"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data[0].ringtone_type").value("BUILTIN"));
    }

    @Test
    void shouldCreatePomodoroSuccessfully() throws Exception {
        Mockito.when(lightAppService.createPomodoro(ArgumentMatchers.any()))
            .thenReturn(new LightAppPomodoroResponse(5L, "考试冲刺", 30, 5, 20, 4, true, "BUILTIN", "Soft Bell", "soft-bell", null, 20, null));

        mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/light-apps/pomodoros")
                .contentType(MediaType.APPLICATION_JSON)
                .content("""
                    {
                      "title": "考试冲刺",
                      "focus_minutes": 30,
                      "short_break_minutes": 5,
                      "long_break_minutes": 20,
                      "long_break_every": 4,
                      "auto_start_next": true,
                      "ringtone_type": "BUILTIN",
                      "ringtone_code": "soft-bell"
                    }
                    """))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.pomodoro_id").value(5))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.focus_minutes").value(30));
    }

    @Test
    void shouldListUrlLinksSuccessfully() throws Exception {
        Mockito.when(lightAppService.listUrlLinks())
            .thenReturn(List.of(new LightAppUrlLinkResponse(8L, "LeetCode", "https://leetcode.cn", "AUTO", null, "https://leetcode.cn/favicon.ico", 10, null)));

        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/light-apps/url-links"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data[0].url_link_id").value(8))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data[0].title").value("LeetCode"));
    }

    @Test
    void shouldResolveUrlMetadataSuccessfully() throws Exception {
        Mockito.when(lightAppService.resolveUrlLinkMetadata(ArgumentMatchers.eq("https://leetcode.cn")))
            .thenReturn(new LightAppUrlLinkResolveResponse("LeetCode", "https://leetcode.cn/favicon.ico", "leetcode.cn"));

        mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/light-apps/url-links/resolve-metadata")
                .contentType(MediaType.APPLICATION_JSON)
                .content("""
                    {
                      "url": "https://leetcode.cn"
                    }
                    """))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.title").value("LeetCode"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.host").value("leetcode.cn"));
    }

    @Test
    void shouldListWhiteboardsSuccessfully() throws Exception {
        Mockito.when(lightAppService.listWhiteboards())
            .thenReturn(List.of(
                new LightAppWhiteboardSummaryResponse(3L, "系统设计图", "FLOWCHART", null, 20, null)
            ));

        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/light-apps/whiteboards"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data[0].whiteboard_id").value(3))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data[0].board_kind").value("FLOWCHART"));
    }

    @Test
    void shouldCreateWhiteboardSuccessfully() throws Exception {
        Mockito.when(lightAppService.createWhiteboard(ArgumentMatchers.any()))
            .thenReturn(new LightAppWhiteboardResponse(
                5L,
                "每日复盘",
                "MINDMAP",
                "{\"k\":\"v\"}",
                null,
                10,
                null
            ));

        mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/light-apps/whiteboards")
                .contentType(MediaType.APPLICATION_JSON)
                .content("""
                    {
                      "title": "每日复盘",
                      "board_kind": "MINDMAP",
                      "document_json": "{\\\"k\\\":\\\"v\\\"}"
                    }
                    """))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.whiteboard_id").value(5))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.title").value("每日复盘"));
    }

    @Test
    void shouldGetWhiteboardSuccessfully() throws Exception {
        Mockito.when(lightAppService.getWhiteboard(ArgumentMatchers.eq(9L)))
            .thenReturn(new LightAppWhiteboardResponse(
                9L,
                "流程梳理",
                "FLOWCHART",
                "{\"name\":\"demo\"}",
                88L,
                30,
                null
            ));

        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/light-apps/whiteboards/9"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.whiteboard_id").value(9))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.thumbnail_asset_id").value(88));
    }

    @Test
    void shouldCreateTodoSuccessfully() throws Exception {
        Mockito.when(lightAppService.createTodo(ArgumentMatchers.any()))
            .thenReturn(new LightAppTodoResponse(
                2L,
                1L,
                "打卡",
                "desc",
                "MEDIUM",
                false,
                null,
                true,
                "MINUTE",
                "DEADLINE",
                null,
                false,
                null,
                null,
                null,
                null,
                20,
                null
            ));

        mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/light-apps/todos")
                .contentType(MediaType.APPLICATION_JSON)
                .content("""
                    {
                      "project_id": 1,
                      "title": "打卡",
                      "priority": "MEDIUM"
                    }
                    """))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.todo_id").value(2))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.project_id").value(1))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.title").value("打卡"));
    }

    @Test
    void shouldReorderTodosSuccessfully() throws Exception {
        Mockito.when(lightAppService.reorderTodos(ArgumentMatchers.any()))
            .thenReturn(List.of(
                new LightAppTodoResponse(
                    2L,
                    null,
                    "A",
                    null,
                    "LOW",
                    false,
                    null,
                    true,
                    "MINUTE",
                    "DEADLINE",
                    null,
                    false,
                    null,
                    null,
                    null,
                    null,
                    10,
                    null
                ),
                new LightAppTodoResponse(
                    3L,
                    null,
                    "B",
                    null,
                    "MEDIUM",
                    false,
                    null,
                    true,
                    "MINUTE",
                    "DEADLINE",
                    null,
                    false,
                    null,
                    null,
                    null,
                    null,
                    20,
                    null
                )
            ));

        mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/light-apps/todos/reorder")
                .contentType(MediaType.APPLICATION_JSON)
                .content("""
                    {
                      "items": [
                        { "todo_id": 2, "sort_num": 10 },
                        { "todo_id": 3, "sort_num": 20 }
                      ]
                    }
                    """))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data[0].todo_id").value(2));
    }

    @Test
    void shouldMoveTaskSuccessfully() throws Exception {
        Mockito.when(lightAppService.moveTask(ArgumentMatchers.any()))
            .thenReturn(new LightAppTaskResponse(
                9L,
                1L,
                "doing",
                "接口联调",
                "",
                null,
                true,
                "MINUTE",
                "DEADLINE",
                null,
                false,
                null,
                null,
                null,
                null,
                30,
                null
            ));

        mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/light-apps/tasks/move")
                .contentType(MediaType.APPLICATION_JSON)
                .content("""
                    {
                      "task_id": 9,
                      "column_code": "doing",
                      "sort_num": 30
                    }
                    """))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.task_id").value(9))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.column_code").value("doing"));
    }

    @Test
    void shouldListTaskColumnsSuccessfully() throws Exception {
        Mockito.when(lightAppService.listTaskColumns())
            .thenReturn(List.of(
                new LightAppTaskColumnResponse("todo", "待处理", 10, true),
                new LightAppTaskColumnResponse("doing", "进行中", 20, true)
            ));

        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/light-apps/task-columns"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data[0].column_code").value("todo"));
    }

    @Test
    void shouldListUpcomingSchedulesSuccessfully() throws Exception {
        Mockito.when(lightAppService.listUpcomingSchedules(ArgumentMatchers.eq(5)))
            .thenReturn(List.of(
                new LightAppScheduleResponse(
                    7L,
                    1L,
                    "周会",
                    "",
                    LocalDateTime.of(2026, 3, 10, 10, 0),
                    LocalDateTime.of(2026, 3, 10, 11, 0),
                    false,
                    "线上",
                    "ACTIVE",
                    true,
                    "MINUTE",
                    "RANGE",
                    LocalDateTime.of(2026, 3, 10, 10, 0),
                    false,
                    null,
                    null,
                    null,
                    null,
                    10,
                    null
                )
            ));

        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/light-apps/schedules/upcoming").param("days", "5"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data[0].schedule_id").value(7));
    }

    @Test
    void shouldListBalanceTransactionsWithFiltersSuccessfully() throws Exception {
        Mockito.when(lightAppService.listBalanceTransactions(
                ArgumentMatchers.any(LocalDateTime.class),
                ArgumentMatchers.any(LocalDateTime.class),
                ArgumentMatchers.eq("Asia/Shanghai"),
                ArgumentMatchers.eq("alipay"),
                ArgumentMatchers.eq(3L),
                ArgumentMatchers.eq("EXPENSE")
            ))
            .thenReturn(List.of(
                new LightAppBalanceTransactionResponse(
                    11L,
                    3L,
                    "EXPENSE",
                    new BigDecimal("88.80"),
                    "CNY",
                    "餐饮",
                    "午饭",
                    LocalDateTime.of(2026, 2, 10, 12, 0),
                    10,
                    null
                )
            ));

        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/light-apps/balance/transactions")
                .param("from_datetime", "2026-01-10T00:00:00")
                .param("to_datetime", "2026-02-20T23:59:59")
                .param("time_zone", "Asia/Shanghai")
                .param("channel_code", "alipay")
                .param("account_id", "3")
                .param("direction", "EXPENSE"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data[0].transaction_id").value(11))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data[0].direction").value("EXPENSE"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data[0].amount").value(88.8))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data[0].category").value("餐饮"));
    }

    @Test
    void shouldGetBalanceAnalyticsSuccessfully() throws Exception {
        Mockito.when(lightAppService.getBalanceAnalytics(
                ArgumentMatchers.eq("CNY"),
                ArgumentMatchers.any(LocalDateTime.class),
                ArgumentMatchers.any(LocalDateTime.class),
                ArgumentMatchers.eq("Asia/Shanghai"),
                ArgumentMatchers.eq("alipay"),
                ArgumentMatchers.eq(3L)
            ))
            .thenReturn(new LightAppBalanceAnalyticsResponse(
                "CNY",
                new LightAppBalanceAnalyticsRange(
                    LocalDateTime.of(2026, 1, 10, 0, 0),
                    LocalDateTime.of(2026, 2, 20, 23, 59, 59),
                    "Asia/Shanghai"
                ),
                new LightAppBalanceAnalyticsSummary(
                    new BigDecimal("1200.0000"),
                    new BigDecimal("540.5000"),
                    new BigDecimal("659.5000"),
                    7,
                    12,
                    19
                ),
                new LightAppBalanceAssetSnapshot(
                    new BigDecimal("5200.0000"),
                    new BigDecimal("1300.0000"),
                    new BigDecimal("3900.0000")
                ),
                List.of(
                    new LightAppBalanceDailyTrendItem(
                        "2026-02-19",
                        new BigDecimal("300.0000"),
                        new BigDecimal("80.0000"),
                        new BigDecimal("220.0000")
                    )
                ),
                List.of(
                    new LightAppBalanceChannelBreakdownItem(
                        "alipay",
                        "支付宝",
                        new BigDecimal("600.0000"),
                        new BigDecimal("340.5000"),
                        9
                    )
                ),
                List.of(
                    new LightAppBalanceCategoryBreakdownItem(
                        "餐饮",
                        new BigDecimal("240.5000"),
                        new BigDecimal("44.4958"),
                        4
                    )
                ),
                List.of(
                    new LightAppBalanceCategoryBreakdownItem(
                        "工资",
                        new BigDecimal("900.0000"),
                        new BigDecimal("75.0000"),
                        3
                    )
                )
            ));

        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/light-apps/balance/analytics")
                .param("base_currency", "CNY")
                .param("from_datetime", "2026-01-10T00:00:00")
                .param("to_datetime", "2026-02-20T23:59:59")
                .param("time_zone", "Asia/Shanghai")
                .param("channel_code", "alipay")
                .param("account_id", "3"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.base_currency").value("CNY"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.summary.income_total").value(1200))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.summary.expense_total").value(540.5))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.summary.tx_count").value(19))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.channel_breakdown[0].channel_code").value("alipay"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.expense_category_breakdown[0].category_name").value("餐饮"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.income_category_breakdown[0].category_name").value("工资"));
    }

    @Test
    void shouldReturnProblemWhenServiceThrowsNotFound() throws Exception {
        Mockito.doThrow(new BusinessException(ErrorCode.NOT_FOUND, "Task not found"))
            .when(lightAppService)
            .deleteTask(ArgumentMatchers.eq(404L));

        mockMvc.perform(MockMvcRequestBuilders.delete("/api/v1/light-apps/tasks/404"))
            .andExpect(ApiErrorAssertions.hasProblem(404, "NOT_FOUND"));
    }

    @Test
    void shouldReturnBadRequestWhenCreateScheduleMissingStartAt() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/light-apps/schedules")
                .contentType(MediaType.APPLICATION_JSON)
                .content("""
                    {
                      "title": "周会"
                    }
                    """))
            .andExpect(ApiErrorAssertions.hasProblem(400, "BAD_REQUEST"));
    }

    @Test
    void shouldReturnBadRequestWhenCreatePomodoroMissingTitle() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/light-apps/pomodoros")
                .contentType(MediaType.APPLICATION_JSON)
                .content("""
                    {
                      "focus_minutes": 25,
                      "short_break_minutes": 5,
                      "long_break_minutes": 15,
                      "long_break_every": 4
                    }
                    """))
            .andExpect(ApiErrorAssertions.hasProblem(400, "BAD_REQUEST"));
    }
}
