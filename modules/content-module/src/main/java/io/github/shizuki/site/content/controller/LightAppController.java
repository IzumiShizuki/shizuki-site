package io.github.shizuki.site.content.controller;

import io.github.shizuki.common.core.response.ApiResponse;
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
import io.github.shizuki.site.content.dto.LightAppFxRefreshRequest;
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
import io.github.shizuki.site.content.service.LightAppService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/light-apps")
@Tag(name = "LightApp", description = "轻应用一期接口")
public class LightAppController {

    private final LightAppService lightAppService;

    public LightAppController(LightAppService lightAppService) {
        this.lightAppService = lightAppService;
    }

    @GetMapping("/projects")
    @Operation(summary = "查询项目列表")
    public ApiResponse<List<LightAppProjectResponse>> listProjects() {
        return ApiResponse.success(lightAppService.listProjects());
    }

    @PostMapping("/projects")
    @Operation(summary = "创建项目")
    public ApiResponse<LightAppProjectResponse> createProject(@Valid @RequestBody LightAppProjectUpsertRequest request) {
        return ApiResponse.success(lightAppService.createProject(request));
    }

    @PutMapping("/projects/{project_id}")
    @Operation(summary = "更新项目")
    public ApiResponse<LightAppProjectResponse> updateProject(@PathVariable("project_id") Long projectId,
                                                              @Valid @RequestBody LightAppProjectUpsertRequest request) {
        return ApiResponse.success(lightAppService.updateProject(projectId, request));
    }

    @DeleteMapping("/projects/{project_id}")
    @Operation(summary = "删除项目")
    public ApiResponse<Void> deleteProject(@PathVariable("project_id") Long projectId) {
        lightAppService.deleteProject(projectId);
        return ApiResponse.success(null);
    }

    @GetMapping("/balance/accounts")
    @Operation(summary = "查询余额账户列表")
    public ApiResponse<List<LightAppBalanceAccountResponse>> listBalanceAccounts() {
        return ApiResponse.success(lightAppService.listBalanceAccounts());
    }

    @PostMapping("/balance/accounts")
    @Operation(summary = "创建余额账户")
    public ApiResponse<LightAppBalanceAccountResponse> createBalanceAccount(@Valid @RequestBody LightAppBalanceAccountUpsertRequest request) {
        return ApiResponse.success(lightAppService.createBalanceAccount(request));
    }

    @PutMapping("/balance/accounts/{account_id}")
    @Operation(summary = "更新余额账户")
    public ApiResponse<LightAppBalanceAccountResponse> updateBalanceAccount(@PathVariable("account_id") Long accountId,
                                                                            @Valid @RequestBody LightAppBalanceAccountUpsertRequest request) {
        return ApiResponse.success(lightAppService.updateBalanceAccount(accountId, request));
    }

    @DeleteMapping("/balance/accounts/{account_id}")
    @Operation(summary = "删除余额账户")
    public ApiResponse<Void> deleteBalanceAccount(@PathVariable("account_id") Long accountId) {
        lightAppService.deleteBalanceAccount(accountId);
        return ApiResponse.success(null);
    }

    @GetMapping("/balance/transactions")
    @Operation(summary = "查询收支流水")
    public ApiResponse<List<LightAppBalanceTransactionResponse>> listBalanceTransactions() {
        return ApiResponse.success(lightAppService.listBalanceTransactions());
    }

    @PostMapping("/balance/transactions")
    @Operation(summary = "创建收支流水")
    public ApiResponse<LightAppBalanceTransactionResponse> createBalanceTransaction(@Valid @RequestBody LightAppBalanceTransactionUpsertRequest request) {
        return ApiResponse.success(lightAppService.createBalanceTransaction(request));
    }

    @PutMapping("/balance/transactions/{transaction_id}")
    @Operation(summary = "更新收支流水")
    public ApiResponse<LightAppBalanceTransactionResponse> updateBalanceTransaction(@PathVariable("transaction_id") Long transactionId,
                                                                                    @Valid @RequestBody LightAppBalanceTransactionUpsertRequest request) {
        return ApiResponse.success(lightAppService.updateBalanceTransaction(transactionId, request));
    }

    @DeleteMapping("/balance/transactions/{transaction_id}")
    @Operation(summary = "删除收支流水")
    public ApiResponse<Void> deleteBalanceTransaction(@PathVariable("transaction_id") Long transactionId) {
        lightAppService.deleteBalanceTransaction(transactionId);
        return ApiResponse.success(null);
    }

    @GetMapping("/balance/debts")
    @Operation(summary = "查询负债列表")
    public ApiResponse<List<LightAppBalanceDebtResponse>> listBalanceDebts() {
        return ApiResponse.success(lightAppService.listBalanceDebts());
    }

    @PostMapping("/balance/debts")
    @Operation(summary = "创建负债")
    public ApiResponse<LightAppBalanceDebtResponse> createBalanceDebt(@Valid @RequestBody LightAppBalanceDebtUpsertRequest request) {
        return ApiResponse.success(lightAppService.createBalanceDebt(request));
    }

    @PutMapping("/balance/debts/{debt_id}")
    @Operation(summary = "更新负债")
    public ApiResponse<LightAppBalanceDebtResponse> updateBalanceDebt(@PathVariable("debt_id") Long debtId,
                                                                      @Valid @RequestBody LightAppBalanceDebtUpsertRequest request) {
        return ApiResponse.success(lightAppService.updateBalanceDebt(debtId, request));
    }

    @DeleteMapping("/balance/debts/{debt_id}")
    @Operation(summary = "删除负债")
    public ApiResponse<Void> deleteBalanceDebt(@PathVariable("debt_id") Long debtId) {
        lightAppService.deleteBalanceDebt(debtId);
        return ApiResponse.success(null);
    }

    @GetMapping("/balance/recurring-charges")
    @Operation(summary = "查询定期扣费规则")
    public ApiResponse<List<LightAppBalanceRecurringChargeResponse>> listBalanceRecurringCharges() {
        return ApiResponse.success(lightAppService.listBalanceRecurringCharges());
    }

    @PostMapping("/balance/recurring-charges")
    @Operation(summary = "创建定期扣费规则")
    public ApiResponse<LightAppBalanceRecurringChargeResponse> createBalanceRecurringCharge(
        @Valid @RequestBody LightAppBalanceRecurringChargeUpsertRequest request
    ) {
        return ApiResponse.success(lightAppService.createBalanceRecurringCharge(request));
    }

    @PutMapping("/balance/recurring-charges/{recurring_charge_id}")
    @Operation(summary = "更新定期扣费规则")
    public ApiResponse<LightAppBalanceRecurringChargeResponse> updateBalanceRecurringCharge(
        @PathVariable("recurring_charge_id") Long recurringChargeId,
        @Valid @RequestBody LightAppBalanceRecurringChargeUpsertRequest request
    ) {
        return ApiResponse.success(lightAppService.updateBalanceRecurringCharge(recurringChargeId, request));
    }

    @DeleteMapping("/balance/recurring-charges/{recurring_charge_id}")
    @Operation(summary = "删除定期扣费规则")
    public ApiResponse<Void> deleteBalanceRecurringCharge(@PathVariable("recurring_charge_id") Long recurringChargeId) {
        lightAppService.deleteBalanceRecurringCharge(recurringChargeId);
        return ApiResponse.success(null);
    }

    @GetMapping("/balance/overview")
    @Operation(summary = "查询余额总览")
    public ApiResponse<LightAppBalanceOverviewResponse> getBalanceOverview(
        @RequestParam(name = "base_currency", required = false) String baseCurrency
    ) {
        return ApiResponse.success(lightAppService.getBalanceOverview(baseCurrency));
    }

    @GetMapping("/balance/fx-rates")
    @Operation(summary = "查询汇率")
    public ApiResponse<List<LightAppFxRateResponse>> listFxRates(
        @RequestParam(name = "base_currency", required = false) String baseCurrency
    ) {
        return ApiResponse.success(lightAppService.listFxRates(baseCurrency));
    }

    @PostMapping("/balance/fx-rates/refresh")
    @Operation(summary = "刷新汇率")
    public ApiResponse<List<LightAppFxRateResponse>> refreshFxRates(@Valid @RequestBody LightAppFxRefreshRequest request) {
        return ApiResponse.success(lightAppService.refreshFxRates(request.getBaseCurrency()));
    }

    @GetMapping("/pomodoros")
    @Operation(summary = "查询番茄钟模板列表")
    public ApiResponse<List<LightAppPomodoroResponse>> listPomodoros() {
        return ApiResponse.success(lightAppService.listPomodoros());
    }

    @PostMapping("/pomodoros")
    @Operation(summary = "创建番茄钟模板")
    public ApiResponse<LightAppPomodoroResponse> createPomodoro(@Valid @RequestBody LightAppPomodoroUpsertRequest request) {
        return ApiResponse.success(lightAppService.createPomodoro(request));
    }

    @PutMapping("/pomodoros/{pomodoro_id}")
    @Operation(summary = "更新番茄钟模板")
    public ApiResponse<LightAppPomodoroResponse> updatePomodoro(@PathVariable("pomodoro_id") Long pomodoroId,
                                                                @Valid @RequestBody LightAppPomodoroUpsertRequest request) {
        return ApiResponse.success(lightAppService.updatePomodoro(pomodoroId, request));
    }

    @DeleteMapping("/pomodoros/{pomodoro_id}")
    @Operation(summary = "删除番茄钟模板")
    public ApiResponse<Void> deletePomodoro(@PathVariable("pomodoro_id") Long pomodoroId) {
        lightAppService.deletePomodoro(pomodoroId);
        return ApiResponse.success(null);
    }

    @GetMapping("/todos")
    @Operation(summary = "查询待办列表")
    public ApiResponse<List<LightAppTodoResponse>> listTodos() {
        return ApiResponse.success(lightAppService.listTodos());
    }

    @PostMapping("/todos")
    @Operation(summary = "创建待办")
    public ApiResponse<LightAppTodoResponse> createTodo(@Valid @RequestBody LightAppTodoUpsertRequest request) {
        return ApiResponse.success(lightAppService.createTodo(request));
    }

    @PutMapping("/todos/{todo_id}")
    @Operation(summary = "更新待办")
    public ApiResponse<LightAppTodoResponse> updateTodo(@PathVariable("todo_id") Long todoId,
                                                        @Valid @RequestBody LightAppTodoUpsertRequest request) {
        return ApiResponse.success(lightAppService.updateTodo(todoId, request));
    }

    @DeleteMapping("/todos/{todo_id}")
    @Operation(summary = "删除待办")
    public ApiResponse<Void> deleteTodo(@PathVariable("todo_id") Long todoId) {
        lightAppService.deleteTodo(todoId);
        return ApiResponse.success(null);
    }

    @PostMapping("/todos/reorder")
    @Operation(summary = "重排待办")
    public ApiResponse<List<LightAppTodoResponse>> reorderTodos(@Valid @RequestBody LightAppTodoReorderRequest request) {
        return ApiResponse.success(lightAppService.reorderTodos(request));
    }

    @GetMapping("/todo-recurring-rules")
    @Operation(summary = "查询Todo周期规则")
    public ApiResponse<List<LightAppTodoRecurringRuleResponse>> listTodoRecurringRules() {
        return ApiResponse.success(lightAppService.listTodoRecurringRules());
    }

    @PostMapping("/todo-recurring-rules")
    @Operation(summary = "创建Todo周期规则")
    public ApiResponse<LightAppTodoRecurringRuleResponse> createTodoRecurringRule(
        @Valid @RequestBody LightAppTodoRecurringRuleUpsertRequest request
    ) {
        return ApiResponse.success(lightAppService.createTodoRecurringRule(request));
    }

    @PutMapping("/todo-recurring-rules/{rule_id}")
    @Operation(summary = "更新Todo周期规则")
    public ApiResponse<LightAppTodoRecurringRuleResponse> updateTodoRecurringRule(
        @PathVariable("rule_id") Long ruleId,
        @Valid @RequestBody LightAppTodoRecurringRuleUpsertRequest request
    ) {
        return ApiResponse.success(lightAppService.updateTodoRecurringRule(ruleId, request));
    }

    @DeleteMapping("/todo-recurring-rules/{rule_id}")
    @Operation(summary = "删除Todo周期规则")
    public ApiResponse<Void> deleteTodoRecurringRule(@PathVariable("rule_id") Long ruleId) {
        lightAppService.deleteTodoRecurringRule(ruleId);
        return ApiResponse.success(null);
    }

    @GetMapping("/tasks")
    @Operation(summary = "查询任务列表")
    public ApiResponse<List<LightAppTaskResponse>> listTasks() {
        return ApiResponse.success(lightAppService.listTasks());
    }

    @PostMapping("/tasks")
    @Operation(summary = "创建任务")
    public ApiResponse<LightAppTaskResponse> createTask(@Valid @RequestBody LightAppTaskUpsertRequest request) {
        return ApiResponse.success(lightAppService.createTask(request));
    }

    @PutMapping("/tasks/{task_id}")
    @Operation(summary = "更新任务")
    public ApiResponse<LightAppTaskResponse> updateTask(@PathVariable("task_id") Long taskId,
                                                        @Valid @RequestBody LightAppTaskUpsertRequest request) {
        return ApiResponse.success(lightAppService.updateTask(taskId, request));
    }

    @DeleteMapping("/tasks/{task_id}")
    @Operation(summary = "删除任务")
    public ApiResponse<Void> deleteTask(@PathVariable("task_id") Long taskId) {
        lightAppService.deleteTask(taskId);
        return ApiResponse.success(null);
    }

    @PostMapping("/tasks/move")
    @Operation(summary = "移动任务")
    public ApiResponse<LightAppTaskResponse> moveTask(@Valid @RequestBody LightAppTaskMoveRequest request) {
        return ApiResponse.success(lightAppService.moveTask(request));
    }

    @GetMapping("/task-recurring-rules")
    @Operation(summary = "查询Task周期规则")
    public ApiResponse<List<LightAppTaskRecurringRuleResponse>> listTaskRecurringRules() {
        return ApiResponse.success(lightAppService.listTaskRecurringRules());
    }

    @PostMapping("/task-recurring-rules")
    @Operation(summary = "创建Task周期规则")
    public ApiResponse<LightAppTaskRecurringRuleResponse> createTaskRecurringRule(
        @Valid @RequestBody LightAppTaskRecurringRuleUpsertRequest request
    ) {
        return ApiResponse.success(lightAppService.createTaskRecurringRule(request));
    }

    @PutMapping("/task-recurring-rules/{rule_id}")
    @Operation(summary = "更新Task周期规则")
    public ApiResponse<LightAppTaskRecurringRuleResponse> updateTaskRecurringRule(
        @PathVariable("rule_id") Long ruleId,
        @Valid @RequestBody LightAppTaskRecurringRuleUpsertRequest request
    ) {
        return ApiResponse.success(lightAppService.updateTaskRecurringRule(ruleId, request));
    }

    @DeleteMapping("/task-recurring-rules/{rule_id}")
    @Operation(summary = "删除Task周期规则")
    public ApiResponse<Void> deleteTaskRecurringRule(@PathVariable("rule_id") Long ruleId) {
        lightAppService.deleteTaskRecurringRule(ruleId);
        return ApiResponse.success(null);
    }

    @GetMapping("/task-columns")
    @Operation(summary = "查询任务列配置")
    public ApiResponse<List<LightAppTaskColumnResponse>> listTaskColumns() {
        return ApiResponse.success(lightAppService.listTaskColumns());
    }

    @PutMapping("/task-columns")
    @Operation(summary = "更新任务列配置")
    public ApiResponse<List<LightAppTaskColumnResponse>> updateTaskColumns(@Valid @RequestBody LightAppTaskColumnsUpdateRequest request) {
        return ApiResponse.success(lightAppService.updateTaskColumns(request));
    }

    @GetMapping("/schedules")
    @Operation(summary = "查询日程列表")
    public ApiResponse<List<LightAppScheduleResponse>> listSchedules() {
        return ApiResponse.success(lightAppService.listSchedules());
    }

    @PostMapping("/schedules")
    @Operation(summary = "创建日程")
    public ApiResponse<LightAppScheduleResponse> createSchedule(@Valid @RequestBody LightAppScheduleUpsertRequest request) {
        return ApiResponse.success(lightAppService.createSchedule(request));
    }

    @PutMapping("/schedules/{schedule_id}")
    @Operation(summary = "更新日程")
    public ApiResponse<LightAppScheduleResponse> updateSchedule(@PathVariable("schedule_id") Long scheduleId,
                                                                @Valid @RequestBody LightAppScheduleUpsertRequest request) {
        return ApiResponse.success(lightAppService.updateSchedule(scheduleId, request));
    }

    @DeleteMapping("/schedules/{schedule_id}")
    @Operation(summary = "删除日程")
    public ApiResponse<Void> deleteSchedule(@PathVariable("schedule_id") Long scheduleId) {
        lightAppService.deleteSchedule(scheduleId);
        return ApiResponse.success(null);
    }

    @GetMapping("/schedules/upcoming")
    @Operation(summary = "查询近期日程")
    public ApiResponse<List<LightAppScheduleResponse>> listUpcomingSchedules(
        @RequestParam(name = "days", required = false) Integer days
    ) {
        return ApiResponse.success(lightAppService.listUpcomingSchedules(days));
    }

    @GetMapping("/schedule-recurring-rules")
    @Operation(summary = "查询Schedule周期规则")
    public ApiResponse<List<LightAppScheduleRecurringRuleResponse>> listScheduleRecurringRules() {
        return ApiResponse.success(lightAppService.listScheduleRecurringRules());
    }

    @PostMapping("/schedule-recurring-rules")
    @Operation(summary = "创建Schedule周期规则")
    public ApiResponse<LightAppScheduleRecurringRuleResponse> createScheduleRecurringRule(
        @Valid @RequestBody LightAppScheduleRecurringRuleUpsertRequest request
    ) {
        return ApiResponse.success(lightAppService.createScheduleRecurringRule(request));
    }

    @PutMapping("/schedule-recurring-rules/{rule_id}")
    @Operation(summary = "更新Schedule周期规则")
    public ApiResponse<LightAppScheduleRecurringRuleResponse> updateScheduleRecurringRule(
        @PathVariable("rule_id") Long ruleId,
        @Valid @RequestBody LightAppScheduleRecurringRuleUpsertRequest request
    ) {
        return ApiResponse.success(lightAppService.updateScheduleRecurringRule(ruleId, request));
    }

    @DeleteMapping("/schedule-recurring-rules/{rule_id}")
    @Operation(summary = "删除Schedule周期规则")
    public ApiResponse<Void> deleteScheduleRecurringRule(@PathVariable("rule_id") Long ruleId) {
        lightAppService.deleteScheduleRecurringRule(ruleId);
        return ApiResponse.success(null);
    }
}
