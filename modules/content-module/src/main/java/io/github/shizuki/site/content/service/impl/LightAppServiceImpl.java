package io.github.shizuki.site.content.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.common.security.context.LoginUserContext;
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
import io.github.shizuki.site.content.entity.LightAppProjectEntity;
import io.github.shizuki.site.content.entity.LightAppScheduleEventEntity;
import io.github.shizuki.site.content.entity.LightAppTaskColumnEntity;
import io.github.shizuki.site.content.entity.LightAppTaskEntity;
import io.github.shizuki.site.content.entity.LightAppTodoEntity;
import io.github.shizuki.site.content.mapper.LightAppProjectMapper;
import io.github.shizuki.site.content.mapper.LightAppScheduleEventMapper;
import io.github.shizuki.site.content.mapper.LightAppTaskColumnMapper;
import io.github.shizuki.site.content.mapper.LightAppTaskMapper;
import io.github.shizuki.site.content.mapper.LightAppTodoMapper;
import io.github.shizuki.site.content.service.LightAppService;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

@Service
public class LightAppServiceImpl implements LightAppService {

    private static final int SORT_STEP = 10;
    private static final int MAX_UPCOMING_DAYS = 30;
    private static final int DEFAULT_UPCOMING_DAYS = 7;
    private static final int MAX_UPCOMING_SIZE = 50;

    private static final List<DefaultTaskColumn> DEFAULT_TASK_COLUMNS = List.of(
        new DefaultTaskColumn("todo", "待处理", 10),
        new DefaultTaskColumn("doing", "进行中", 20),
        new DefaultTaskColumn("done", "已完成", 30)
    );

    private final LightAppProjectMapper projectMapper;
    private final LightAppTodoMapper todoMapper;
    private final LightAppTaskMapper taskMapper;
    private final LightAppTaskColumnMapper taskColumnMapper;
    private final LightAppScheduleEventMapper scheduleEventMapper;

    public LightAppServiceImpl(
        LightAppProjectMapper projectMapper,
        LightAppTodoMapper todoMapper,
        LightAppTaskMapper taskMapper,
        LightAppTaskColumnMapper taskColumnMapper,
        LightAppScheduleEventMapper scheduleEventMapper
    ) {
        this.projectMapper = projectMapper;
        this.todoMapper = todoMapper;
        this.taskMapper = taskMapper;
        this.taskColumnMapper = taskColumnMapper;
        this.scheduleEventMapper = scheduleEventMapper;
    }

    @Override
    public List<LightAppProjectResponse> listProjects() {
        Long userId = requireLoginUserId();
        return listProjectEntities(userId).stream().map(this::toProjectResponse).toList();
    }

    @Override
    @Transactional
    public LightAppProjectResponse createProject(LightAppProjectUpsertRequest request) {
        Long userId = requireLoginUserId();
        LightAppProjectEntity entity = new LightAppProjectEntity();
        entity.setUserId(userId);
        entity.setProjectCode("p_" + UUID.randomUUID().toString().replace("-", "").substring(0, 12));
        entity.setName(normalizeRequiredText(request.getName(), "name"));
        entity.setDescription(normalizeOptionalText(request.getDescription()));
        entity.setColor(normalizeColor(request.getColor()));
        entity.setArchived(Boolean.TRUE.equals(request.getArchived()));
        entity.setSortNum(resolveSortNum(request.getSortNum(), projectMapper.selectMaxSortNumByUserId(userId)));
        projectMapper.insert(entity);
        return toProjectResponse(requireProject(userId, entity.getId()));
    }

    @Override
    @Transactional
    public LightAppProjectResponse updateProject(Long projectId, LightAppProjectUpsertRequest request) {
        Long userId = requireLoginUserId();
        LightAppProjectEntity entity = requireProject(userId, projectId);
        entity.setName(normalizeRequiredText(request.getName(), "name"));
        entity.setDescription(normalizeOptionalText(request.getDescription()));
        entity.setColor(normalizeColor(request.getColor()));
        entity.setArchived(Boolean.TRUE.equals(request.getArchived()));
        if (request.getSortNum() != null) {
            entity.setSortNum(request.getSortNum());
        }
        projectMapper.updateById(entity);
        return toProjectResponse(requireProject(userId, projectId));
    }

    @Override
    @Transactional
    public void deleteProject(Long projectId) {
        Long userId = requireLoginUserId();
        LightAppProjectEntity entity = requireProject(userId, projectId);
        projectMapper.deleteById(entity.getId());

        LightAppTodoEntity todoPatch = new LightAppTodoEntity();
        todoPatch.setProjectId(null);
        todoMapper.update(todoPatch, new LambdaUpdateWrapper<LightAppTodoEntity>()
            .eq(LightAppTodoEntity::getUserId, userId)
            .eq(LightAppTodoEntity::getProjectId, projectId));

        LightAppTaskEntity taskPatch = new LightAppTaskEntity();
        taskPatch.setProjectId(null);
        taskMapper.update(taskPatch, new LambdaUpdateWrapper<LightAppTaskEntity>()
            .eq(LightAppTaskEntity::getUserId, userId)
            .eq(LightAppTaskEntity::getProjectId, projectId));

        LightAppScheduleEventEntity schedulePatch = new LightAppScheduleEventEntity();
        schedulePatch.setProjectId(null);
        scheduleEventMapper.update(schedulePatch, new LambdaUpdateWrapper<LightAppScheduleEventEntity>()
            .eq(LightAppScheduleEventEntity::getUserId, userId)
            .eq(LightAppScheduleEventEntity::getProjectId, projectId));
    }

    @Override
    public List<LightAppTodoResponse> listTodos() {
        Long userId = requireLoginUserId();
        return todoMapper.selectList(new LambdaQueryWrapper<LightAppTodoEntity>()
                .eq(LightAppTodoEntity::getUserId, userId)
                .orderByAsc(LightAppTodoEntity::getSortNum)
                .orderByDesc(LightAppTodoEntity::getUpdatedAt)
                .orderByDesc(LightAppTodoEntity::getId))
            .stream()
            .map(this::toTodoResponse)
            .toList();
    }

    @Override
    @Transactional
    public LightAppTodoResponse createTodo(LightAppTodoUpsertRequest request) {
        Long userId = requireLoginUserId();
        LightAppTodoEntity entity = new LightAppTodoEntity();
        entity.setUserId(userId);
        entity.setProjectId(normalizeProjectId(userId, request.getProjectId()));
        entity.setTitle(normalizeRequiredText(request.getTitle(), "title"));
        entity.setDetail(normalizeOptionalText(request.getDetail()));
        entity.setPriorityCode(normalizePriority(request.getPriority()));
        entity.setDone(Boolean.TRUE.equals(request.getDone()));
        entity.setDueAt(request.getDueAt());
        entity.setSortNum(resolveSortNum(request.getSortNum(), todoMapper.selectMaxSortNumByUserId(userId)));
        todoMapper.insert(entity);
        return toTodoResponse(requireTodo(userId, entity.getId()));
    }

    @Override
    @Transactional
    public LightAppTodoResponse updateTodo(Long todoId, LightAppTodoUpsertRequest request) {
        Long userId = requireLoginUserId();
        LightAppTodoEntity entity = requireTodo(userId, todoId);
        entity.setProjectId(normalizeProjectId(userId, request.getProjectId()));
        entity.setTitle(normalizeRequiredText(request.getTitle(), "title"));
        entity.setDetail(normalizeOptionalText(request.getDetail()));
        entity.setPriorityCode(normalizePriority(request.getPriority()));
        entity.setDone(Boolean.TRUE.equals(request.getDone()));
        entity.setDueAt(request.getDueAt());
        if (request.getSortNum() != null) {
            entity.setSortNum(request.getSortNum());
        }
        todoMapper.updateById(entity);
        return toTodoResponse(requireTodo(userId, todoId));
    }

    @Override
    @Transactional
    public void deleteTodo(Long todoId) {
        Long userId = requireLoginUserId();
        LightAppTodoEntity entity = requireTodo(userId, todoId);
        todoMapper.deleteById(entity.getId());
    }

    @Override
    @Transactional
    public List<LightAppTodoResponse> reorderTodos(LightAppTodoReorderRequest request) {
        Long userId = requireLoginUserId();
        List<LightAppTodoReorderRequest.Item> items = request == null ? List.of() : request.getItems();
        if (items == null || items.isEmpty()) {
            return listTodos();
        }

        Set<Long> ids = items.stream().map(LightAppTodoReorderRequest.Item::getTodoId).filter(Objects::nonNull).collect(LinkedHashSet::new, Set::add, Set::addAll);
        if (ids.isEmpty()) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "todo ids are required");
        }

        List<LightAppTodoEntity> found = todoMapper.selectList(new LambdaQueryWrapper<LightAppTodoEntity>()
            .eq(LightAppTodoEntity::getUserId, userId)
            .in(LightAppTodoEntity::getId, ids));
        if (found.size() != ids.size()) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "Todo not found");
        }
        Map<Long, LightAppTodoEntity> todoMap = new LinkedHashMap<>();
        found.forEach(todo -> todoMap.put(todo.getId(), todo));

        for (LightAppTodoReorderRequest.Item item : items) {
            LightAppTodoEntity entity = todoMap.get(item.getTodoId());
            if (entity == null) {
                throw new BusinessException(ErrorCode.NOT_FOUND, "Todo not found");
            }
            entity.setSortNum(item.getSortNum());
            todoMapper.updateById(entity);
        }
        return listTodos();
    }

    @Override
    public List<LightAppTaskResponse> listTasks() {
        Long userId = requireLoginUserId();
        ensureDefaultTaskColumns(userId);
        return taskMapper.selectList(new LambdaQueryWrapper<LightAppTaskEntity>()
                .eq(LightAppTaskEntity::getUserId, userId)
                .orderByAsc(LightAppTaskEntity::getColumnCode)
                .orderByAsc(LightAppTaskEntity::getSortNum)
                .orderByDesc(LightAppTaskEntity::getUpdatedAt)
                .orderByDesc(LightAppTaskEntity::getId))
            .stream()
            .map(this::toTaskResponse)
            .toList();
    }

    @Override
    @Transactional
    public LightAppTaskResponse createTask(LightAppTaskUpsertRequest request) {
        Long userId = requireLoginUserId();
        ensureDefaultTaskColumns(userId);
        LightAppTaskEntity entity = new LightAppTaskEntity();
        entity.setUserId(userId);
        entity.setProjectId(normalizeProjectId(userId, request.getProjectId()));
        entity.setTitle(normalizeRequiredText(request.getTitle(), "title"));
        entity.setDetail(normalizeOptionalText(request.getDetail()));
        entity.setColumnCode(resolveColumnCode(userId, request.getColumnCode(), false));
        entity.setDueAt(request.getDueAt());
        entity.setSortNum(resolveSortNum(request.getSortNum(), taskMapper.selectMaxSortNumByUserId(userId)));
        taskMapper.insert(entity);
        return toTaskResponse(requireTask(userId, entity.getId()));
    }

    @Override
    @Transactional
    public LightAppTaskResponse updateTask(Long taskId, LightAppTaskUpsertRequest request) {
        Long userId = requireLoginUserId();
        ensureDefaultTaskColumns(userId);
        LightAppTaskEntity entity = requireTask(userId, taskId);
        entity.setProjectId(normalizeProjectId(userId, request.getProjectId()));
        entity.setTitle(normalizeRequiredText(request.getTitle(), "title"));
        entity.setDetail(normalizeOptionalText(request.getDetail()));
        entity.setColumnCode(resolveColumnCode(userId, request.getColumnCode(), false));
        entity.setDueAt(request.getDueAt());
        if (request.getSortNum() != null) {
            entity.setSortNum(request.getSortNum());
        }
        taskMapper.updateById(entity);
        return toTaskResponse(requireTask(userId, taskId));
    }

    @Override
    @Transactional
    public void deleteTask(Long taskId) {
        Long userId = requireLoginUserId();
        LightAppTaskEntity entity = requireTask(userId, taskId);
        taskMapper.deleteById(entity.getId());
    }

    @Override
    @Transactional
    public LightAppTaskResponse moveTask(LightAppTaskMoveRequest request) {
        Long userId = requireLoginUserId();
        ensureDefaultTaskColumns(userId);
        LightAppTaskEntity entity = requireTask(userId, request.getTaskId());
        entity.setColumnCode(resolveColumnCode(userId, request.getColumnCode(), true));
        if (request.getSortNum() != null) {
            entity.setSortNum(request.getSortNum());
        }
        taskMapper.updateById(entity);
        return toTaskResponse(requireTask(userId, entity.getId()));
    }

    @Override
    public List<LightAppTaskColumnResponse> listTaskColumns() {
        Long userId = requireLoginUserId();
        ensureDefaultTaskColumns(userId);
        return taskColumnMapper.selectList(new LambdaQueryWrapper<LightAppTaskColumnEntity>()
                .eq(LightAppTaskColumnEntity::getUserId, userId)
                .orderByAsc(LightAppTaskColumnEntity::getSortNum)
                .orderByAsc(LightAppTaskColumnEntity::getId))
            .stream()
            .map(this::toTaskColumnResponse)
            .toList();
    }

    @Override
    @Transactional
    public List<LightAppTaskColumnResponse> updateTaskColumns(LightAppTaskColumnsUpdateRequest request) {
        Long userId = requireLoginUserId();
        ensureDefaultTaskColumns(userId);
        List<LightAppTaskColumnsUpdateRequest.Item> items = request == null ? List.of() : request.getColumns();
        if (items == null || items.isEmpty()) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "columns are required");
        }

        List<ColumnInput> normalizedItems = normalizeColumnInputs(items);
        if (normalizedItems.stream().noneMatch(ColumnInput::enabled)) {
            ColumnInput first = normalizedItems.get(0);
            normalizedItems.set(0, new ColumnInput(first.code(), first.title(), first.sortNum(), true));
        }

        Map<String, LightAppTaskColumnEntity> existingByCode = taskColumnMapper.selectList(new LambdaQueryWrapper<LightAppTaskColumnEntity>()
                .eq(LightAppTaskColumnEntity::getUserId, userId))
            .stream()
            .collect(LinkedHashMap::new, (acc, entity) -> acc.put(entity.getColumnCode(), entity), Map::putAll);

        String fallbackCode = normalizedItems.stream().filter(ColumnInput::enabled).findFirst().map(ColumnInput::code)
            .orElse(normalizedItems.get(0).code());

        Set<String> keepCodes = new LinkedHashSet<>();
        for (ColumnInput input : normalizedItems) {
            keepCodes.add(input.code());
            LightAppTaskColumnEntity existing = existingByCode.get(input.code());
            if (existing == null) {
                LightAppTaskColumnEntity created = new LightAppTaskColumnEntity();
                created.setUserId(userId);
                created.setColumnCode(input.code());
                created.setTitle(input.title());
                created.setSortNum(input.sortNum());
                created.setEnabled(input.enabled());
                taskColumnMapper.insert(created);
                continue;
            }
            existing.setTitle(input.title());
            existing.setSortNum(input.sortNum());
            existing.setEnabled(input.enabled());
            taskColumnMapper.updateById(existing);
        }

        for (Map.Entry<String, LightAppTaskColumnEntity> entry : existingByCode.entrySet()) {
            String columnCode = entry.getKey();
            if (keepCodes.contains(columnCode)) {
                continue;
            }
            if (!Objects.equals(columnCode, fallbackCode)) {
                LightAppTaskEntity patch = new LightAppTaskEntity();
                patch.setColumnCode(fallbackCode);
                taskMapper.update(patch, new LambdaUpdateWrapper<LightAppTaskEntity>()
                    .eq(LightAppTaskEntity::getUserId, userId)
                    .eq(LightAppTaskEntity::getColumnCode, columnCode));
            }
            taskColumnMapper.deleteById(entry.getValue().getId());
        }

        return listTaskColumns();
    }

    @Override
    public List<LightAppScheduleResponse> listSchedules() {
        Long userId = requireLoginUserId();
        return scheduleEventMapper.selectList(new LambdaQueryWrapper<LightAppScheduleEventEntity>()
                .eq(LightAppScheduleEventEntity::getUserId, userId)
                .orderByAsc(LightAppScheduleEventEntity::getStartAt)
                .orderByAsc(LightAppScheduleEventEntity::getSortNum)
                .orderByDesc(LightAppScheduleEventEntity::getUpdatedAt)
                .orderByDesc(LightAppScheduleEventEntity::getId))
            .stream()
            .map(this::toScheduleResponse)
            .toList();
    }

    @Override
    @Transactional
    public LightAppScheduleResponse createSchedule(LightAppScheduleUpsertRequest request) {
        Long userId = requireLoginUserId();
        LightAppScheduleEventEntity entity = new LightAppScheduleEventEntity();
        entity.setUserId(userId);
        entity.setProjectId(normalizeProjectId(userId, request.getProjectId()));
        entity.setTitle(normalizeRequiredText(request.getTitle(), "title"));
        entity.setDetail(normalizeOptionalText(request.getDetail()));
        entity.setStartAt(request.getStartAt());
        entity.setEndAt(normalizeEndAt(request.getStartAt(), request.getEndAt()));
        entity.setAllDay(Boolean.TRUE.equals(request.getAllDay()));
        entity.setLocation(normalizeOptionalText(request.getLocation()));
        entity.setStatusCode(normalizeScheduleStatus(request.getStatus()));
        entity.setSortNum(resolveSortNum(request.getSortNum(), scheduleEventMapper.selectMaxSortNumByUserId(userId)));
        scheduleEventMapper.insert(entity);
        return toScheduleResponse(requireSchedule(userId, entity.getId()));
    }

    @Override
    @Transactional
    public LightAppScheduleResponse updateSchedule(Long scheduleId, LightAppScheduleUpsertRequest request) {
        Long userId = requireLoginUserId();
        LightAppScheduleEventEntity entity = requireSchedule(userId, scheduleId);
        entity.setProjectId(normalizeProjectId(userId, request.getProjectId()));
        entity.setTitle(normalizeRequiredText(request.getTitle(), "title"));
        entity.setDetail(normalizeOptionalText(request.getDetail()));
        entity.setStartAt(request.getStartAt());
        entity.setEndAt(normalizeEndAt(request.getStartAt(), request.getEndAt()));
        entity.setAllDay(Boolean.TRUE.equals(request.getAllDay()));
        entity.setLocation(normalizeOptionalText(request.getLocation()));
        entity.setStatusCode(normalizeScheduleStatus(request.getStatus()));
        if (request.getSortNum() != null) {
            entity.setSortNum(request.getSortNum());
        }
        scheduleEventMapper.updateById(entity);
        return toScheduleResponse(requireSchedule(userId, scheduleId));
    }

    @Override
    @Transactional
    public void deleteSchedule(Long scheduleId) {
        Long userId = requireLoginUserId();
        LightAppScheduleEventEntity entity = requireSchedule(userId, scheduleId);
        scheduleEventMapper.deleteById(entity.getId());
    }

    @Override
    public List<LightAppScheduleResponse> listUpcomingSchedules(Integer days) {
        Long userId = requireLoginUserId();
        int windowDays = resolveUpcomingDays(days);
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime windowEnd = now.plusDays(windowDays);
        return scheduleEventMapper.selectList(new LambdaQueryWrapper<LightAppScheduleEventEntity>()
                .eq(LightAppScheduleEventEntity::getUserId, userId)
                .eq(LightAppScheduleEventEntity::getStatusCode, "ACTIVE")
                .ge(LightAppScheduleEventEntity::getStartAt, now)
                .lt(LightAppScheduleEventEntity::getStartAt, windowEnd)
                .orderByAsc(LightAppScheduleEventEntity::getStartAt)
                .orderByAsc(LightAppScheduleEventEntity::getSortNum)
                .orderByDesc(LightAppScheduleEventEntity::getId)
                .last("LIMIT " + MAX_UPCOMING_SIZE))
            .stream()
            .map(this::toScheduleResponse)
            .toList();
    }

    private Long requireLoginUserId() {
        return LoginUserContext.get()
            .map(loginUser -> loginUser.getUserId())
            .filter(userId -> userId != null && userId > 0)
            .orElseThrow(() -> new BusinessException(ErrorCode.UNAUTHORIZED, "Login required"));
    }

    private List<LightAppProjectEntity> listProjectEntities(Long userId) {
        return projectMapper.selectList(new LambdaQueryWrapper<LightAppProjectEntity>()
            .eq(LightAppProjectEntity::getUserId, userId)
            .orderByAsc(LightAppProjectEntity::getSortNum)
            .orderByDesc(LightAppProjectEntity::getUpdatedAt)
            .orderByDesc(LightAppProjectEntity::getId));
    }

    private LightAppProjectEntity requireProject(Long userId, Long projectId) {
        LightAppProjectEntity entity = projectMapper.selectOne(new LambdaQueryWrapper<LightAppProjectEntity>()
            .eq(LightAppProjectEntity::getId, projectId)
            .eq(LightAppProjectEntity::getUserId, userId)
            .last("LIMIT 1"));
        if (entity == null) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "Project not found");
        }
        return entity;
    }

    private LightAppTodoEntity requireTodo(Long userId, Long todoId) {
        LightAppTodoEntity entity = todoMapper.selectOne(new LambdaQueryWrapper<LightAppTodoEntity>()
            .eq(LightAppTodoEntity::getId, todoId)
            .eq(LightAppTodoEntity::getUserId, userId)
            .last("LIMIT 1"));
        if (entity == null) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "Todo not found");
        }
        return entity;
    }

    private LightAppTaskEntity requireTask(Long userId, Long taskId) {
        LightAppTaskEntity entity = taskMapper.selectOne(new LambdaQueryWrapper<LightAppTaskEntity>()
            .eq(LightAppTaskEntity::getId, taskId)
            .eq(LightAppTaskEntity::getUserId, userId)
            .last("LIMIT 1"));
        if (entity == null) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "Task not found");
        }
        return entity;
    }

    private LightAppScheduleEventEntity requireSchedule(Long userId, Long scheduleId) {
        LightAppScheduleEventEntity entity = scheduleEventMapper.selectOne(new LambdaQueryWrapper<LightAppScheduleEventEntity>()
            .eq(LightAppScheduleEventEntity::getId, scheduleId)
            .eq(LightAppScheduleEventEntity::getUserId, userId)
            .last("LIMIT 1"));
        if (entity == null) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "Schedule not found");
        }
        return entity;
    }

    private Long normalizeProjectId(Long userId, Long projectId) {
        if (projectId == null || projectId <= 0) {
            return null;
        }
        return requireProject(userId, projectId).getId();
    }

    private Integer resolveSortNum(Integer requestedSortNum, Integer maxSortNum) {
        if (requestedSortNum != null) {
            return requestedSortNum;
        }
        if (maxSortNum == null) {
            return SORT_STEP;
        }
        return maxSortNum + SORT_STEP;
    }

    private String normalizeRequiredText(String raw, String fieldName) {
        String normalized = String.valueOf(raw == null ? "" : raw).trim();
        if (!StringUtils.hasText(normalized)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, fieldName + " is required");
        }
        return normalized;
    }

    private String normalizeOptionalText(String raw) {
        if (raw == null) {
            return null;
        }
        String normalized = raw.trim();
        return normalized.isEmpty() ? null : normalized;
    }

    private String normalizeColor(String rawColor) {
        String normalized = String.valueOf(rawColor == null ? "" : rawColor).trim();
        if (normalized.isEmpty()) {
            return "#6aa9ff";
        }
        return normalized;
    }

    private String normalizePriority(String rawPriority) {
        String normalized = String.valueOf(rawPriority == null ? "" : rawPriority).trim().toUpperCase(Locale.ROOT);
        if ("LOW".equals(normalized) || "HIGH".equals(normalized)) {
            return normalized;
        }
        return "MEDIUM";
    }

    private String normalizeScheduleStatus(String rawStatus) {
        String normalized = String.valueOf(rawStatus == null ? "" : rawStatus).trim().toUpperCase(Locale.ROOT);
        if ("CANCELLED".equals(normalized)) {
            return "CANCELLED";
        }
        return "ACTIVE";
    }

    private LocalDateTime normalizeEndAt(LocalDateTime startAt, LocalDateTime endAt) {
        if (endAt == null) {
            return null;
        }
        if (startAt != null && endAt.isBefore(startAt)) {
            return null;
        }
        return endAt;
    }

    private int resolveUpcomingDays(Integer days) {
        if (days == null || days <= 0) {
            return DEFAULT_UPCOMING_DAYS;
        }
        return Math.min(days, MAX_UPCOMING_DAYS);
    }

    private void ensureDefaultTaskColumns(Long userId) {
        List<LightAppTaskColumnEntity> existing = taskColumnMapper.selectList(new LambdaQueryWrapper<LightAppTaskColumnEntity>()
            .eq(LightAppTaskColumnEntity::getUserId, userId));
        Set<String> existingCodes = existing.stream().map(LightAppTaskColumnEntity::getColumnCode).collect(LinkedHashSet::new, Set::add, Set::addAll);

        for (DefaultTaskColumn seed : DEFAULT_TASK_COLUMNS) {
            if (existingCodes.contains(seed.code())) {
                continue;
            }
            LightAppTaskColumnEntity entity = new LightAppTaskColumnEntity();
            entity.setUserId(userId);
            entity.setColumnCode(seed.code());
            entity.setTitle(seed.title());
            entity.setSortNum(seed.sortNum());
            entity.setEnabled(true);
            taskColumnMapper.insert(entity);
        }
    }

    private String resolveColumnCode(Long userId, String rawColumnCode, boolean strict) {
        List<LightAppTaskColumnEntity> columns = taskColumnMapper.selectList(new LambdaQueryWrapper<LightAppTaskColumnEntity>()
            .eq(LightAppTaskColumnEntity::getUserId, userId)
            .eq(LightAppTaskColumnEntity::getEnabled, true)
            .orderByAsc(LightAppTaskColumnEntity::getSortNum)
            .orderByAsc(LightAppTaskColumnEntity::getId));
        if (columns.isEmpty()) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "No enabled task columns");
        }

        String normalized = String.valueOf(rawColumnCode == null ? "" : rawColumnCode).trim().toLowerCase(Locale.ROOT);
        if (!StringUtils.hasText(normalized)) {
            return columns.get(0).getColumnCode();
        }

        for (LightAppTaskColumnEntity column : columns) {
            if (Objects.equals(column.getColumnCode(), normalized)) {
                return normalized;
            }
        }

        if (strict) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Target column not found");
        }
        return columns.get(0).getColumnCode();
    }

    private List<ColumnInput> normalizeColumnInputs(List<LightAppTaskColumnsUpdateRequest.Item> items) {
        Map<String, ColumnInput> unique = new LinkedHashMap<>();
        for (LightAppTaskColumnsUpdateRequest.Item item : items) {
            String code = String.valueOf(item.getColumnCode() == null ? "" : item.getColumnCode())
                .trim()
                .toLowerCase(Locale.ROOT);
            if (!StringUtils.hasText(code)) {
                throw new BusinessException(ErrorCode.BAD_REQUEST, "column_code is required");
            }
            if (unique.containsKey(code)) {
                throw new BusinessException(ErrorCode.BAD_REQUEST, "Duplicated column_code: " + code);
            }
            String title = normalizeRequiredText(item.getTitle(), "title");
            int sortNum = item.getSortNum() == null ? SORT_STEP : item.getSortNum();
            unique.put(code, new ColumnInput(code, title, sortNum, Boolean.TRUE.equals(item.getEnabled())));
        }
        return new ArrayList<>(unique.values());
    }

    private LightAppProjectResponse toProjectResponse(LightAppProjectEntity entity) {
        return new LightAppProjectResponse(
            entity.getId(),
            entity.getProjectCode(),
            entity.getName(),
            entity.getDescription(),
            entity.getColor(),
            Boolean.TRUE.equals(entity.getArchived()),
            entity.getSortNum() == null ? 0 : entity.getSortNum(),
            entity.getUpdatedAt()
        );
    }

    private LightAppTodoResponse toTodoResponse(LightAppTodoEntity entity) {
        return new LightAppTodoResponse(
            entity.getId(),
            entity.getProjectId(),
            entity.getTitle(),
            entity.getDetail(),
            normalizePriority(entity.getPriorityCode()),
            Boolean.TRUE.equals(entity.getDone()),
            entity.getDueAt(),
            entity.getSortNum() == null ? 0 : entity.getSortNum(),
            entity.getUpdatedAt()
        );
    }

    private LightAppTaskResponse toTaskResponse(LightAppTaskEntity entity) {
        return new LightAppTaskResponse(
            entity.getId(),
            entity.getProjectId(),
            entity.getColumnCode(),
            entity.getTitle(),
            entity.getDetail(),
            entity.getDueAt(),
            entity.getSortNum() == null ? 0 : entity.getSortNum(),
            entity.getUpdatedAt()
        );
    }

    private LightAppTaskColumnResponse toTaskColumnResponse(LightAppTaskColumnEntity entity) {
        return new LightAppTaskColumnResponse(
            entity.getColumnCode(),
            entity.getTitle(),
            entity.getSortNum() == null ? 0 : entity.getSortNum(),
            Boolean.TRUE.equals(entity.getEnabled())
        );
    }

    private LightAppScheduleResponse toScheduleResponse(LightAppScheduleEventEntity entity) {
        return new LightAppScheduleResponse(
            entity.getId(),
            entity.getProjectId(),
            entity.getTitle(),
            entity.getDetail(),
            entity.getStartAt(),
            entity.getEndAt(),
            Boolean.TRUE.equals(entity.getAllDay()),
            entity.getLocation(),
            normalizeScheduleStatus(entity.getStatusCode()),
            entity.getSortNum() == null ? 0 : entity.getSortNum(),
            entity.getUpdatedAt()
        );
    }

    private record DefaultTaskColumn(String code, String title, int sortNum) {
    }

    private record ColumnInput(String code, String title, int sortNum, boolean enabled) {
    }
}
