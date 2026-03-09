package io.github.shizuki.site.content.service;

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
import java.util.List;

public interface LightAppService {

    List<LightAppProjectResponse> listProjects();

    LightAppProjectResponse createProject(LightAppProjectUpsertRequest request);

    LightAppProjectResponse updateProject(Long projectId, LightAppProjectUpsertRequest request);

    void deleteProject(Long projectId);

    List<LightAppTodoResponse> listTodos();

    LightAppTodoResponse createTodo(LightAppTodoUpsertRequest request);

    LightAppTodoResponse updateTodo(Long todoId, LightAppTodoUpsertRequest request);

    void deleteTodo(Long todoId);

    List<LightAppTodoResponse> reorderTodos(LightAppTodoReorderRequest request);

    List<LightAppTaskResponse> listTasks();

    LightAppTaskResponse createTask(LightAppTaskUpsertRequest request);

    LightAppTaskResponse updateTask(Long taskId, LightAppTaskUpsertRequest request);

    void deleteTask(Long taskId);

    LightAppTaskResponse moveTask(LightAppTaskMoveRequest request);

    List<LightAppTaskColumnResponse> listTaskColumns();

    List<LightAppTaskColumnResponse> updateTaskColumns(LightAppTaskColumnsUpdateRequest request);

    List<LightAppScheduleResponse> listSchedules();

    LightAppScheduleResponse createSchedule(LightAppScheduleUpsertRequest request);

    LightAppScheduleResponse updateSchedule(Long scheduleId, LightAppScheduleUpsertRequest request);

    void deleteSchedule(Long scheduleId);

    List<LightAppScheduleResponse> listUpcomingSchedules(Integer days);
}
