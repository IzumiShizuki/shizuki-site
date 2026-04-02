package io.github.shizuki.site.content.service;

import io.github.shizuki.site.content.response.LightAppProjectResponse;
import io.github.shizuki.site.content.request.LightAppProjectUpsertRequest;
import io.github.shizuki.site.content.response.LightAppPomodoroResponse;
import io.github.shizuki.site.content.request.LightAppPomodoroUpsertRequest;
import io.github.shizuki.site.content.response.LightAppBalanceAccountResponse;
import io.github.shizuki.site.content.request.LightAppBalanceAccountUpsertRequest;
import io.github.shizuki.site.content.response.LightAppBalanceDebtResponse;
import io.github.shizuki.site.content.request.LightAppBalanceDebtUpsertRequest;
import io.github.shizuki.site.content.response.LightAppBalanceAnalyticsResponse;
import io.github.shizuki.site.content.response.LightAppBalanceOverviewResponse;
import io.github.shizuki.site.content.response.LightAppBalanceRecurringChargeResponse;
import io.github.shizuki.site.content.request.LightAppBalanceRecurringChargeUpsertRequest;
import io.github.shizuki.site.content.response.LightAppBalanceTransactionResponse;
import io.github.shizuki.site.content.request.LightAppBalanceTransactionUpsertRequest;
import io.github.shizuki.site.content.response.LightAppFxRateResponse;
import io.github.shizuki.site.content.response.LightAppScheduleRecurringRuleResponse;
import io.github.shizuki.site.content.request.LightAppScheduleRecurringRuleUpsertRequest;
import io.github.shizuki.site.content.response.LightAppScheduleResponse;
import io.github.shizuki.site.content.request.LightAppScheduleUpsertRequest;
import io.github.shizuki.site.content.response.LightAppTaskRecurringRuleResponse;
import io.github.shizuki.site.content.request.LightAppTaskRecurringRuleUpsertRequest;
import io.github.shizuki.site.content.response.LightAppTaskColumnResponse;
import io.github.shizuki.site.content.request.LightAppTaskColumnsUpdateRequest;
import io.github.shizuki.site.content.request.LightAppTaskMoveRequest;
import io.github.shizuki.site.content.response.LightAppTaskResponse;
import io.github.shizuki.site.content.request.LightAppTaskUpsertRequest;
import io.github.shizuki.site.content.response.LightAppTodoRecurringRuleResponse;
import io.github.shizuki.site.content.request.LightAppTodoRecurringRuleUpsertRequest;
import io.github.shizuki.site.content.request.LightAppTodoReorderRequest;
import io.github.shizuki.site.content.response.LightAppTodoResponse;
import io.github.shizuki.site.content.request.LightAppTodoUpsertRequest;
import io.github.shizuki.site.content.response.LightAppUrlLinkResolveResponse;
import io.github.shizuki.site.content.response.LightAppUrlLinkResponse;
import io.github.shizuki.site.content.request.LightAppUrlLinkUpsertRequest;
import io.github.shizuki.site.content.response.LightAppWhiteboardResponse;
import io.github.shizuki.site.content.response.LightAppWhiteboardSummaryResponse;
import io.github.shizuki.site.content.request.LightAppWhiteboardUpsertRequest;
import java.time.LocalDateTime;
import java.util.List;

public interface LightAppService {

    List<LightAppProjectResponse> listProjects();

    LightAppProjectResponse createProject(LightAppProjectUpsertRequest request);

    LightAppProjectResponse updateProject(Long projectId, LightAppProjectUpsertRequest request);

    void deleteProject(Long projectId);

    List<LightAppBalanceAccountResponse> listBalanceAccounts();

    LightAppBalanceAccountResponse createBalanceAccount(LightAppBalanceAccountUpsertRequest request);

    LightAppBalanceAccountResponse updateBalanceAccount(Long accountId, LightAppBalanceAccountUpsertRequest request);

    void deleteBalanceAccount(Long accountId);

    List<LightAppBalanceTransactionResponse> listBalanceTransactions(
        LocalDateTime fromDatetime,
        LocalDateTime toDatetime,
        String timeZone,
        String channelCode,
        Long accountId,
        String direction
    );

    LightAppBalanceTransactionResponse createBalanceTransaction(LightAppBalanceTransactionUpsertRequest request);

    LightAppBalanceTransactionResponse updateBalanceTransaction(Long transactionId, LightAppBalanceTransactionUpsertRequest request);

    void deleteBalanceTransaction(Long transactionId);

    List<LightAppBalanceDebtResponse> listBalanceDebts();

    LightAppBalanceDebtResponse createBalanceDebt(LightAppBalanceDebtUpsertRequest request);

    LightAppBalanceDebtResponse updateBalanceDebt(Long debtId, LightAppBalanceDebtUpsertRequest request);

    void deleteBalanceDebt(Long debtId);

    List<LightAppBalanceRecurringChargeResponse> listBalanceRecurringCharges();

    LightAppBalanceRecurringChargeResponse createBalanceRecurringCharge(LightAppBalanceRecurringChargeUpsertRequest request);

    LightAppBalanceRecurringChargeResponse updateBalanceRecurringCharge(Long recurringChargeId, LightAppBalanceRecurringChargeUpsertRequest request);

    void deleteBalanceRecurringCharge(Long recurringChargeId);

    LightAppBalanceOverviewResponse getBalanceOverview(String baseCurrency);

    LightAppBalanceAnalyticsResponse getBalanceAnalytics(
        String baseCurrency,
        LocalDateTime fromDatetime,
        LocalDateTime toDatetime,
        String timeZone,
        String channelCode,
        Long accountId
    );

    List<LightAppFxRateResponse> listFxRates(String baseCurrency);

    List<LightAppFxRateResponse> refreshFxRates(String baseCurrency);

    List<LightAppPomodoroResponse> listPomodoros();

    LightAppPomodoroResponse createPomodoro(LightAppPomodoroUpsertRequest request);

    LightAppPomodoroResponse updatePomodoro(Long pomodoroId, LightAppPomodoroUpsertRequest request);

    void deletePomodoro(Long pomodoroId);

    List<LightAppUrlLinkResponse> listUrlLinks();

    LightAppUrlLinkResponse createUrlLink(LightAppUrlLinkUpsertRequest request);

    LightAppUrlLinkResponse updateUrlLink(Long urlLinkId, LightAppUrlLinkUpsertRequest request);

    void deleteUrlLink(Long urlLinkId);

    LightAppUrlLinkResolveResponse resolveUrlLinkMetadata(String url);

    List<LightAppWhiteboardSummaryResponse> listWhiteboards();

    LightAppWhiteboardResponse createWhiteboard(LightAppWhiteboardUpsertRequest request);

    LightAppWhiteboardResponse getWhiteboard(Long whiteboardId);

    LightAppWhiteboardResponse updateWhiteboard(Long whiteboardId, LightAppWhiteboardUpsertRequest request);

    void deleteWhiteboard(Long whiteboardId);

    List<LightAppTodoResponse> listTodos();

    LightAppTodoResponse createTodo(LightAppTodoUpsertRequest request);

    LightAppTodoResponse updateTodo(Long todoId, LightAppTodoUpsertRequest request);

    void deleteTodo(Long todoId);

    List<LightAppTodoResponse> reorderTodos(LightAppTodoReorderRequest request);

    List<LightAppTodoRecurringRuleResponse> listTodoRecurringRules();

    LightAppTodoRecurringRuleResponse createTodoRecurringRule(LightAppTodoRecurringRuleUpsertRequest request);

    LightAppTodoRecurringRuleResponse updateTodoRecurringRule(Long ruleId, LightAppTodoRecurringRuleUpsertRequest request);

    void deleteTodoRecurringRule(Long ruleId);

    List<LightAppTaskResponse> listTasks();

    LightAppTaskResponse createTask(LightAppTaskUpsertRequest request);

    LightAppTaskResponse updateTask(Long taskId, LightAppTaskUpsertRequest request);

    void deleteTask(Long taskId);

    LightAppTaskResponse moveTask(LightAppTaskMoveRequest request);

    List<LightAppTaskRecurringRuleResponse> listTaskRecurringRules();

    LightAppTaskRecurringRuleResponse createTaskRecurringRule(LightAppTaskRecurringRuleUpsertRequest request);

    LightAppTaskRecurringRuleResponse updateTaskRecurringRule(Long ruleId, LightAppTaskRecurringRuleUpsertRequest request);

    void deleteTaskRecurringRule(Long ruleId);

    List<LightAppTaskColumnResponse> listTaskColumns();

    List<LightAppTaskColumnResponse> updateTaskColumns(LightAppTaskColumnsUpdateRequest request);

    List<LightAppScheduleResponse> listSchedules();

    LightAppScheduleResponse createSchedule(LightAppScheduleUpsertRequest request);

    LightAppScheduleResponse updateSchedule(Long scheduleId, LightAppScheduleUpsertRequest request);

    void deleteSchedule(Long scheduleId);

    List<LightAppScheduleResponse> listUpcomingSchedules(Integer days);

    List<LightAppScheduleRecurringRuleResponse> listScheduleRecurringRules();

    LightAppScheduleRecurringRuleResponse createScheduleRecurringRule(LightAppScheduleRecurringRuleUpsertRequest request);

    LightAppScheduleRecurringRuleResponse updateScheduleRecurringRule(Long ruleId, LightAppScheduleRecurringRuleUpsertRequest request);

    void deleteScheduleRecurringRule(Long ruleId);
}
