package io.github.shizuki.site.content.service;

import io.github.shizuki.site.content.dto.LightAppProjectResponse;
import io.github.shizuki.site.content.dto.LightAppProjectUpsertRequest;
import io.github.shizuki.site.content.dto.LightAppPomodoroResponse;
import io.github.shizuki.site.content.dto.LightAppPomodoroUpsertRequest;
import io.github.shizuki.site.content.dto.LightAppBalanceAccountResponse;
import io.github.shizuki.site.content.dto.LightAppBalanceAccountUpsertRequest;
import io.github.shizuki.site.content.dto.LightAppBalanceDebtResponse;
import io.github.shizuki.site.content.dto.LightAppBalanceDebtUpsertRequest;
import io.github.shizuki.site.content.dto.LightAppBalanceOverviewResponse;
import io.github.shizuki.site.content.dto.LightAppBalanceRecurringChargeResponse;
import io.github.shizuki.site.content.dto.LightAppBalanceRecurringChargeUpsertRequest;
import io.github.shizuki.site.content.dto.LightAppBalanceTransactionResponse;
import io.github.shizuki.site.content.dto.LightAppBalanceTransactionUpsertRequest;
import io.github.shizuki.site.content.dto.LightAppFxRateResponse;
import io.github.shizuki.site.content.dto.LightAppScheduleRecurringRuleResponse;
import io.github.shizuki.site.content.dto.LightAppScheduleRecurringRuleUpsertRequest;
import io.github.shizuki.site.content.dto.LightAppScheduleResponse;
import io.github.shizuki.site.content.dto.LightAppScheduleUpsertRequest;
import io.github.shizuki.site.content.dto.LightAppTaskRecurringRuleResponse;
import io.github.shizuki.site.content.dto.LightAppTaskRecurringRuleUpsertRequest;
import io.github.shizuki.site.content.dto.LightAppTaskColumnResponse;
import io.github.shizuki.site.content.dto.LightAppTaskColumnsUpdateRequest;
import io.github.shizuki.site.content.dto.LightAppTaskMoveRequest;
import io.github.shizuki.site.content.dto.LightAppTaskResponse;
import io.github.shizuki.site.content.dto.LightAppTaskUpsertRequest;
import io.github.shizuki.site.content.dto.LightAppTodoRecurringRuleResponse;
import io.github.shizuki.site.content.dto.LightAppTodoRecurringRuleUpsertRequest;
import io.github.shizuki.site.content.dto.LightAppTodoReorderRequest;
import io.github.shizuki.site.content.dto.LightAppTodoResponse;
import io.github.shizuki.site.content.dto.LightAppTodoUpsertRequest;
import io.github.shizuki.site.content.dto.LightAppUrlLinkResolveResponse;
import io.github.shizuki.site.content.dto.LightAppUrlLinkResponse;
import io.github.shizuki.site.content.dto.LightAppUrlLinkUpsertRequest;
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

    List<LightAppBalanceTransactionResponse> listBalanceTransactions();

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
