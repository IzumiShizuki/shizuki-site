package io.github.shizuki.site.content.controller;

import io.github.shizuki.common.core.response.ApiResponse;
import io.github.shizuki.site.content.dto.LightAppProjectResponse;
import io.github.shizuki.site.content.dto.LightAppProjectUpsertRequest;
import io.github.shizuki.site.content.dto.LightAppScheduleResponse;
import io.github.shizuki.site.content.dto.LightAppScheduleUpsertRequest;
import io.github.shizuki.site.content.dto.LightAppTaskColumnResponse;
import io.github.shizuki.site.content.dto.LightAppTaskColumnsUpdateRequest;
import io.github.shizuki.site.content.dto.LightAppTaskMoveRequest;
import io.github.shizuki.site.content.dto.LightAppTaskResponse;
import io.github.shizuki.site.content.dto.LightAppTaskUpsertRequest;
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
}
