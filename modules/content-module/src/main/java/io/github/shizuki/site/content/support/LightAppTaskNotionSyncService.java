package io.github.shizuki.site.content.support;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.site.content.entity.LightAppProjectEntity;
import io.github.shizuki.site.content.entity.LightAppTaskColumnEntity;
import io.github.shizuki.site.content.entity.LightAppTaskEntity;
import io.github.shizuki.site.content.entity.LightAppTaskNotionSyncCursorEntity;
import io.github.shizuki.site.content.entity.LightAppTaskNotionSyncJobEntity;
import io.github.shizuki.site.content.mapper.LightAppProjectMapper;
import io.github.shizuki.site.content.mapper.LightAppTaskColumnMapper;
import io.github.shizuki.site.content.mapper.LightAppTaskMapper;
import io.github.shizuki.site.content.mapper.LightAppTaskNotionSyncCursorMapper;
import io.github.shizuki.site.content.mapper.LightAppTaskNotionSyncJobMapper;
import io.github.shizuki.site.content.support.LightAppTaskNotionClient.PageData;
import io.github.shizuki.site.content.support.LightAppTaskNotionClient.StatusOptionData;
import io.github.shizuki.site.content.support.LightAppTaskNotionClient.TaskDataSourceSchema;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

@Component
public class LightAppTaskNotionSyncService {

    private static final String TIME_PRECISION_MINUTE = "MINUTE";
    private static final String TIME_PRECISION_DAY = "DAY";
    private static final String TIMING_MODE_DEADLINE = "DEADLINE";
    private static final String TIMING_MODE_RANGE = "RANGE";
    public static final String DIRECTION_PULL = "PULL";
    public static final String DIRECTION_PUSH = "PUSH";
    public static final String DIRECTION_BOTH = "BOTH";
    public static final String TARGET_TASK = "TASK";
    public static final String TARGET_ALL = "ALL";
    public static final String JOB_TRIGGER_MANUAL = "MANUAL";
    public static final String JOB_TRIGGER_NIGHTLY = "NIGHTLY";
    public static final String JOB_TRIGGER_SAVE = "SAVE";
    public static final String JOB_STATUS_PENDING = "PENDING";
    public static final String JOB_STATUS_RUNNING = "RUNNING";
    public static final String JOB_STATUS_SUCCEEDED = "SUCCEEDED";
    public static final String JOB_STATUS_FAILED = "FAILED";
    public static final String JOB_STATUS_PARTIAL = "PARTIAL";
    public static final String SYNC_STATUS_LOCAL_ONLY = "LOCAL_ONLY";
    public static final String SYNC_STATUS_SYNCED = "SYNCED";
    public static final String SYNC_STATUS_SYNC_ERROR = "SYNC_ERROR";
    public static final String SYNC_STATUS_CONFLICT = "CONFLICT";
    public static final String MANAGED_BY_LOCAL = "LOCAL";
    public static final String MANAGED_BY_NOTION = "NOTION";

    private final LightAppTaskMapper taskMapper;
    private final LightAppTaskColumnMapper taskColumnMapper;
    private final LightAppProjectMapper projectMapper;
    private final LightAppTaskNotionSyncCursorMapper cursorMapper;
    private final LightAppTaskNotionSyncJobMapper jobMapper;
    private final LightAppTaskNotionProperties notionProperties;
    private final LightAppTaskNotionClient notionClient;

    public LightAppTaskNotionSyncService(LightAppTaskMapper taskMapper,
                                         LightAppTaskColumnMapper taskColumnMapper,
                                         LightAppProjectMapper projectMapper,
                                         LightAppTaskNotionSyncCursorMapper cursorMapper,
                                         LightAppTaskNotionSyncJobMapper jobMapper,
                                         LightAppTaskNotionProperties notionProperties,
                                         LightAppTaskNotionClient notionClient) {
        this.taskMapper = taskMapper;
        this.taskColumnMapper = taskColumnMapper;
        this.projectMapper = projectMapper;
        this.cursorMapper = cursorMapper;
        this.jobMapper = jobMapper;
        this.notionProperties = notionProperties;
        this.notionClient = notionClient;
    }

    @Transactional
    public LightAppTaskNotionSyncJobEntity createJob(String triggerType,
                                                     String directionCode,
                                                     String targetTypeCode,
                                                     Long taskId,
                                                     Long ownerUserId) {
        ensureNotionConfigured();
        LightAppTaskNotionSyncJobEntity job = new LightAppTaskNotionSyncJobEntity();
        LocalDateTime now = LocalDateTime.now();
        job.setTriggerType(normalizeCode(triggerType));
        job.setDirectionCode(normalizeDirection(directionCode));
        job.setTargetTypeCode(normalizeTargetType(targetTypeCode));
        job.setTaskId(TARGET_TASK.equals(job.getTargetTypeCode()) ? taskId : null);
        job.setOwnerUserId(ownerUserId == null || ownerUserId <= 0 ? notionProperties.getOwnerUserId() : ownerUserId);
        job.setStatusCode(JOB_STATUS_PENDING);
        job.setResultCount(0);
        job.setErrorCount(0);
        job.setSkippedCount(0);
        job.setConflictCount(0);
        job.setErrorText("");
        job.setCreatedAt(now);
        job.setUpdatedAt(now);
        jobMapper.insert(job);
        return job;
    }

    public LightAppTaskNotionSyncJobEntity getJob(Long jobId) {
        return jobMapper.selectById(jobId);
    }

    @Transactional
    public SyncExecutionResult executeJob(Long jobId) {
        LightAppTaskNotionSyncJobEntity job = jobMapper.selectById(jobId);
        if (job == null) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "Task notion sync job not found");
        }
        job.setStatusCode(JOB_STATUS_RUNNING);
        job.setStartedTime(LocalDateTime.now());
        job.setErrorText("");
        job.setUpdatedAt(LocalDateTime.now());
        jobMapper.updateById(job);
        try {
            SyncExecutionResult result = switch (normalizeCode(job.getDirectionCode())) {
                case DIRECTION_PULL -> runPull(job);
                case DIRECTION_PUSH -> runPush(job);
                case DIRECTION_BOTH -> runBoth(job);
                default -> throw new BusinessException(ErrorCode.BAD_REQUEST, "Unsupported sync direction");
            };
            applyJobResult(job, result);
            return result;
        } catch (Exception exception) {
            SyncExecutionResult result = new SyncExecutionResult(0, 1, 0, 0, readError(exception));
            applyJobResult(job, result);
            return result;
        }
    }

    @Transactional
    public void ensureColumnMirrorInitialized() {
        if (!notionClient.isConfigured()) {
            return;
        }
        Long ownerUserId = notionProperties.getOwnerUserId();
        boolean hasManagedColumns = taskColumnMapper.selectCount(
            new LambdaQueryWrapper<LightAppTaskColumnEntity>()
                .eq(LightAppTaskColumnEntity::getDeleted, 0)
                .eq(LightAppTaskColumnEntity::getUserId, ownerUserId)
                .eq(LightAppTaskColumnEntity::getNotionManaged, true)
        ) > 0;
        if (!hasManagedColumns) {
            syncColumnsFromNotionStatus();
        }
    }

    @Transactional
    public SyncExecutionResult runNightlyReconcile() {
        SyncExecutionResult columnSync = syncColumnsFromNotionStatus();
        SyncExecutionResult pull = pullAllOwnerTasks();
        SyncExecutionResult push = pushAllOwnerTasks();
        SyncExecutionResult deleted = reconcileRemoteTrashDeletes();
        upsertCursor();
        return columnSync.merge(pull).merge(push).merge(deleted);
    }

    @Transactional
    public SyncExecutionResult syncColumnsFromNotionStatus() {
        ensureNotionConfigured();
        TaskDataSourceSchema schema = notionClient.retrieveDataSourceSchema();
        validateSchema(schema);
        List<StatusOptionData> options = schema.statusOptions();
        if (options.isEmpty()) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Notion status property has no options");
        }

        Long ownerUserId = notionProperties.getOwnerUserId();
        LocalDateTime now = LocalDateTime.now();
        List<LightAppTaskColumnEntity> existingColumns = listTaskColumns(ownerUserId);
        Map<String, LightAppTaskColumnEntity> byOptionId = new LinkedHashMap<>();
        List<LightAppTaskColumnEntity> unmatchedColumns = new ArrayList<>();
        for (LightAppTaskColumnEntity column : existingColumns) {
            if (StringUtils.hasText(column.getNotionStatusOptionId())) {
                byOptionId.put(column.getNotionStatusOptionId(), column);
            } else {
                unmatchedColumns.add(column);
            }
        }

        List<LightAppTaskColumnEntity> syncedColumns = new ArrayList<>();
        Set<Long> keepIds = new LinkedHashSet<>();
        for (int index = 0; index < options.size(); index++) {
            StatusOptionData option = options.get(index);
            LightAppTaskColumnEntity column = byOptionId.get(option.optionId());
            if (column == null) {
                column = findMatchingLocalColumn(unmatchedColumns, option.name());
            }
            if (column == null) {
                column = new LightAppTaskColumnEntity();
                column.setUserId(ownerUserId);
                column.setColumnCode(generateUniqueColumnCode(option.name(), existingColumns, syncedColumns));
                column.setCreatedAt(now);
            }
            column.setTitle(option.name());
            column.setSortNum((index + 1) * 10);
            column.setEnabled(true);
            column.setNotionManaged(true);
            column.setNotionStatusOptionId(option.optionId());
            column.setUpdatedAt(now);
            if (column.getId() == null || column.getId() <= 0) {
                taskColumnMapper.insert(column);
            } else {
                taskColumnMapper.updateById(column);
            }
            if (column.getId() != null) {
                keepIds.add(column.getId());
            }
            syncedColumns.add(column);
        }

        String fallbackColumnCode = syncedColumns.get(0).getColumnCode();
        for (LightAppTaskColumnEntity existingColumn : existingColumns) {
            if (existingColumn.getId() != null && keepIds.contains(existingColumn.getId())) {
                continue;
            }
            if (!Objects.equals(existingColumn.getColumnCode(), fallbackColumnCode)) {
                LightAppTaskEntity patch = new LightAppTaskEntity();
                patch.setColumnCode(fallbackColumnCode);
                patch.setUpdatedAt(now);
                taskMapper.update(
                    patch,
                    new LambdaUpdateWrapper<LightAppTaskEntity>()
                        .eq(LightAppTaskEntity::getDeleted, 0)
                        .eq(LightAppTaskEntity::getUserId, ownerUserId)
                        .eq(LightAppTaskEntity::getColumnCode, existingColumn.getColumnCode())
                );
            }
            taskColumnMapper.deleteById(existingColumn.getId());
        }
        return new SyncExecutionResult(Math.max(1, syncedColumns.size()), 0, 0, 0, "");
    }

    @Transactional
    public SyncExecutionResult pullTask(Long taskId) {
        LightAppTaskEntity task = requireOwnerTask(taskId);
        syncColumnsFromNotionStatus();
        if (!StringUtils.hasText(task.getNotionPageId())) {
            return SyncExecutionResult.skipped("Task is not linked to notion");
        }
        PageData remote = notionClient.retrievePage(task.getNotionPageId());
        if (remote.inTrash()) {
            taskMapper.deleteById(task.getId());
            return new SyncExecutionResult(1, 0, 0, 0, "");
        }
        syncLocalFromRemote(task, remote);
        return new SyncExecutionResult(1, 0, 0, 0, "");
    }

    @Transactional
    public SyncExecutionResult pushTask(Long taskId) {
        LightAppTaskEntity task = requireOwnerTask(taskId);
        TaskDataSourceSchema schema = notionClient.retrieveDataSourceSchema();
        validateSchema(schema);

        LightAppTaskColumnEntity column = requireMappedColumn(task.getColumnCode(), schema.statusOptions());
        if (StringUtils.hasText(task.getNotionPageId())) {
            PageData remote = notionClient.retrievePage(task.getNotionPageId());
            if (remote.inTrash()) {
                markSyncStatus(task, SYNC_STATUS_SYNC_ERROR, "Remote notion page is in trash");
                return new SyncExecutionResult(0, 1, 0, 0, "Remote notion page is in trash");
            }
            if (remote.lastEditedTime() != null
                && task.getUpdatedAt() != null
                && remote.lastEditedTime().isAfter(task.getUpdatedAt())) {
                markSyncStatus(task, SYNC_STATUS_CONFLICT, "Notion page is newer than local task");
                return new SyncExecutionResult(0, 0, 0, 1, "Notion page is newer than local task");
            }
        }

        persistRemoteStateFromLocal(task, column);
        return new SyncExecutionResult(1, 0, 0, 0, "");
    }

    @Transactional
    public SyncExecutionResult pullAllOwnerTasks() {
        ensureNotionConfigured();
        syncColumnsFromNotionStatus();
        List<PageData> remotePages = notionClient.queryPages().stream()
            .sorted(Comparator.comparing(PageData::lastEditedTime, Comparator.nullsLast(Comparator.naturalOrder())))
            .toList();
        int success = 0;
        int errors = 0;
        for (PageData pageData : remotePages) {
            try {
                syncLocalFromRemote(resolveLocalTask(pageData), pageData);
                success++;
            } catch (Exception exception) {
                errors++;
            }
        }
        upsertCursor();
        return new SyncExecutionResult(success, errors, 0, 0, "");
    }

    @Transactional
    public SyncExecutionResult pushAllOwnerTasks() {
        ensureNotionConfigured();
        List<LightAppTaskEntity> ownerTasks = taskMapper.selectList(
            new LambdaQueryWrapper<LightAppTaskEntity>()
                .eq(LightAppTaskEntity::getDeleted, 0)
                .eq(LightAppTaskEntity::getUserId, notionProperties.getOwnerUserId())
        );
        int success = 0;
        int errors = 0;
        int skipped = 0;
        int conflicts = 0;
        String lastMessage = "";
        for (LightAppTaskEntity task : ownerTasks) {
            SyncExecutionResult result = pushTask(task.getId());
            success += result.successCount();
            errors += result.errorCount();
            skipped += result.skippedCount();
            conflicts += result.conflictCount();
            if (StringUtils.hasText(result.message())) {
                lastMessage = result.message();
            }
        }
        return new SyncExecutionResult(success, errors, skipped, conflicts, lastMessage);
    }

    @Transactional
    public SyncExecutionResult reconcileRemoteTrashDeletes() {
        if (!notionClient.isConfigured()) {
            return SyncExecutionResult.skipped("Task notion integration disabled");
        }
        List<LightAppTaskEntity> localTasks = taskMapper.selectList(
            new LambdaQueryWrapper<LightAppTaskEntity>()
                .eq(LightAppTaskEntity::getDeleted, 0)
                .eq(LightAppTaskEntity::getUserId, notionProperties.getOwnerUserId())
                .isNotNull(LightAppTaskEntity::getNotionPageId)
        );
        int success = 0;
        int errors = 0;
        for (LightAppTaskEntity localTask : localTasks) {
            try {
                PageData pageData = notionClient.retrievePage(localTask.getNotionPageId());
                if (pageData.inTrash()) {
                    taskMapper.deleteById(localTask.getId());
                    success++;
                }
            } catch (BusinessException exception) {
                errors++;
            }
        }
        return new SyncExecutionResult(success, errors, 0, 0, "");
    }

    @Transactional
    public void trashRemotePage(LightAppTaskEntity task) {
        if (task == null || !StringUtils.hasText(task.getNotionPageId()) || !isOwnerScoped(task) || !notionClient.isConfigured()) {
            return;
        }
        notionClient.trashPage(task.getNotionPageId());
    }

    private SyncExecutionResult runPull(LightAppTaskNotionSyncJobEntity job) {
        return TARGET_ALL.equals(normalizeCode(job.getTargetTypeCode()))
            ? pullAllOwnerTasks().merge(reconcileRemoteTrashDeletes())
            : pullTask(job.getTaskId());
    }

    private SyncExecutionResult runPush(LightAppTaskNotionSyncJobEntity job) {
        return TARGET_ALL.equals(normalizeCode(job.getTargetTypeCode()))
            ? pushAllOwnerTasks()
            : pushTask(job.getTaskId());
    }

    private SyncExecutionResult runBoth(LightAppTaskNotionSyncJobEntity job) {
        if (TARGET_ALL.equals(normalizeCode(job.getTargetTypeCode()))) {
            return runNightlyReconcile();
        }
        LightAppTaskEntity task = requireOwnerTask(job.getTaskId());
        if (!StringUtils.hasText(task.getNotionPageId())) {
            return pushTask(task.getId());
        }
        return pullTask(task.getId());
    }

    private void syncLocalFromRemote(LightAppTaskEntity task, PageData pageData) {
        TaskDataSourceSchema schema = notionClient.retrieveDataSourceSchema();
        validateSchema(schema);
        LocalDateTime now = LocalDateTime.now();
        Map<String, Object> properties = pageData.properties();
        LightAppTaskColumnEntity mappedColumn = resolveColumnFromRemoteStatus(properties, schema.statusOptions());
        TaskSchedule schedule = readSchedule(properties);
        String detail = decodeDetail(notionClient.listBlockChildrenRecursively(pageData.pageId()));

        boolean createMode = task.getId() == null || task.getId() <= 0;
        task.setUserId(notionProperties.getOwnerUserId());
        task.setProjectId(resolveProjectIdByCode(readRichText(properties, notionProperties.getProperties().getProjectCode())));
        task.setColumnCode(mappedColumn.getColumnCode());
        task.setTitle(limit(readTitle(properties, notionProperties.getProperties().getTitle()), 200));
        task.setDetail(limit(detail, 2000));
        task.setDueAt(schedule.dueAt());
        task.setShowOnCalendar(schedule.showOnCalendar());
        task.setTimePrecisionCode(schedule.timePrecisionCode());
        task.setTimingModeCode(schedule.timingModeCode());
        task.setRangeStartAt(schedule.rangeStartAt());
        if (createMode) {
            task.setReminderEnabled(false);
            task.setStartRemindValue(null);
            task.setStartRemindUnitCode(null);
            task.setDeadlineRemindValue(null);
            task.setDeadlineRemindUnitCode(null);
            task.setSortNum(nextSortForColumn(task.getUserId(), mappedColumn.getColumnCode()));
            task.setCreatedAt(now);
        } else if (task.getSortNum() == null) {
            task.setSortNum(nextSortForColumn(task.getUserId(), mappedColumn.getColumnCode()));
        }
        task.setNotionPageId(pageData.pageId());
        task.setNotionLastEditedTime(pageData.lastEditedTime());
        task.setSyncStatusCode(SYNC_STATUS_SYNCED);
        task.setSyncErrorText("");
        task.setLastRemotePullTime(now);
        task.setSyncHash(hashTaskSnapshot(task, mappedColumn.getNotionStatusOptionId()));
        task.setUpdatedAt(now);
        if (createMode) {
            taskMapper.insert(task);
        } else {
            taskMapper.updateById(task);
        }
    }

    private void persistRemoteStateFromLocal(LightAppTaskEntity task, LightAppTaskColumnEntity column) {
        LocalDateTime now = LocalDateTime.now();
        Map<String, Object> propertyPayload = buildPropertyPayload(task, column);
        PageData pageData;
        if (StringUtils.hasText(task.getNotionPageId())) {
            notionClient.updatePage(task.getNotionPageId(), propertyPayload, false);
            notionClient.replaceBlockChildren(task.getNotionPageId(), encodeDetail(task.getDetail()));
            pageData = notionClient.retrievePage(task.getNotionPageId());
        } else {
            pageData = notionClient.createPage(propertyPayload);
            notionClient.replaceBlockChildren(pageData.pageId(), encodeDetail(task.getDetail()));
            pageData = notionClient.retrievePage(pageData.pageId());
        }
        task.setNotionPageId(pageData.pageId());
        task.setNotionLastEditedTime(pageData.lastEditedTime());
        task.setSyncStatusCode(SYNC_STATUS_SYNCED);
        task.setSyncErrorText("");
        task.setLastRemotePushTime(now);
        task.setSyncHash(hashTaskSnapshot(task, column.getNotionStatusOptionId()));
        task.setUpdatedAt(now);
        taskMapper.updateById(task);
    }

    private Map<String, Object> buildPropertyPayload(LightAppTaskEntity task, LightAppTaskColumnEntity column) {
        LightAppTaskNotionProperties.PropertyMapping mapping = notionProperties.getProperties();
        Map<String, Object> payload = new LinkedHashMap<>();
        payload.put(mapping.getTitle(), Map.of("title", richTextArray(readString(task.getTitle(), ""))));
        payload.put(mapping.getStatus(), Map.of("status", Map.of("name", readString(column.getTitle(), ""))));
        payload.put(mapping.getProjectCode(), Map.of("rich_text", richTextArray(loadProjectCode(task.getProjectId()))));

        Map<String, Object> dateWrapper = new LinkedHashMap<>();
        dateWrapper.put("date", buildScheduleDate(task));
        payload.put(mapping.getSchedule(), dateWrapper);
        payload.put(mapping.getShowOnCalendar(), Map.of("checkbox", task.getShowOnCalendar() == null || Boolean.TRUE.equals(task.getShowOnCalendar())));
        return payload;
    }

    private Map<String, Object> buildScheduleDate(LightAppTaskEntity task) {
        if (task.getDueAt() == null) {
            return null;
        }
        Map<String, Object> date = new LinkedHashMap<>();
        if (TIME_PRECISION_DAY.equals(normalizeCode(task.getTimePrecisionCode()))) {
            date.put("start", task.getTimingModeCode() != null && TIMING_MODE_RANGE.equals(normalizeCode(task.getTimingModeCode()))
                && task.getRangeStartAt() != null
                    ? task.getRangeStartAt().toLocalDate().toString()
                    : task.getDueAt().toLocalDate().toString());
            if (TIMING_MODE_RANGE.equals(normalizeCode(task.getTimingModeCode())) && task.getDueAt() != null) {
                date.put("end", task.getDueAt().toLocalDate().toString());
            }
            return date;
        }
        date.put("start", task.getTimingModeCode() != null && TIMING_MODE_RANGE.equals(normalizeCode(task.getTimingModeCode()))
            && task.getRangeStartAt() != null
                ? task.getRangeStartAt().toString()
                : task.getDueAt().toString());
        if (TIMING_MODE_RANGE.equals(normalizeCode(task.getTimingModeCode())) && task.getDueAt() != null) {
            date.put("end", task.getDueAt().toString());
        }
        return date;
    }

    private List<Map<String, Object>> encodeDetail(String detail) {
        String safeDetail = normalizeDetail(detail);
        if (!StringUtils.hasText(safeDetail)) {
            return List.of();
        }
        List<Map<String, Object>> blocks = new ArrayList<>();
        String[] lines = safeDetail.split("\\R", -1);
        for (String line : lines) {
            Map<String, Object> payload = new LinkedHashMap<>();
            payload.put("rich_text", richTextArray(line));
            Map<String, Object> block = new LinkedHashMap<>();
            block.put("object", "block");
            block.put("type", "paragraph");
            block.put("paragraph", payload);
            blocks.add(block);
        }
        return blocks;
    }

    private String decodeDetail(List<Map<String, Object>> blocks) {
        if (blocks == null || blocks.isEmpty()) {
            return "";
        }
        List<String> lines = new ArrayList<>();
        for (Map<String, Object> block : blocks) {
            String type = asString(block.get("type"));
            Map<String, Object> payload = castMap(block.get(type));
            if (payload.isEmpty()) {
                continue;
            }
            if ("divider".equals(type)) {
                lines.add("");
                continue;
            }
            String text = joinPlainText(payload.get("rich_text"));
            lines.add(text);
        }
        return normalizeDetail(String.join("\n", lines));
    }

    private List<Map<String, Object>> richTextArray(String value) {
        if (!StringUtils.hasText(value)) {
            return List.of();
        }
        return List.of(Map.of("type", "text", "text", Map.of("content", value)));
    }

    private LightAppTaskEntity resolveLocalTask(PageData pageData) {
        LightAppTaskEntity task = taskMapper.selectOne(
            new LambdaQueryWrapper<LightAppTaskEntity>()
                .eq(LightAppTaskEntity::getDeleted, 0)
                .eq(LightAppTaskEntity::getNotionPageId, pageData.pageId())
                .last("LIMIT 1")
        );
        if (task != null) {
            return task;
        }
        LightAppTaskEntity created = new LightAppTaskEntity();
        created.setUserId(notionProperties.getOwnerUserId());
        created.setCreatedAt(LocalDateTime.now());
        created.setUpdatedAt(LocalDateTime.now());
        return created;
    }

    private void validateSchema(TaskDataSourceSchema schema) {
        validatePropertyType(schema.titleProperty(), notionProperties.getProperties().getTitle(), "title");
        validatePropertyType(schema.statusProperty(), notionProperties.getProperties().getStatus(), "status");
        validatePropertyType(schema.projectCodeProperty(), notionProperties.getProperties().getProjectCode(), "rich_text");
        validatePropertyType(schema.scheduleProperty(), notionProperties.getProperties().getSchedule(), "date");
        validatePropertyType(schema.showOnCalendarProperty(), notionProperties.getProperties().getShowOnCalendar(), "checkbox");
    }

    private void validatePropertyType(Map<String, Object> property, String propertyName, String expectedType) {
        String actualType = asString(property.get("type")).trim().toLowerCase(Locale.ROOT);
        if (!expectedType.trim().toLowerCase(Locale.ROOT).equals(actualType)) {
            throw new BusinessException(
                ErrorCode.BAD_REQUEST,
                "Notion property " + propertyName + " must be type " + expectedType
            );
        }
    }

    private LightAppTaskColumnEntity resolveColumnFromRemoteStatus(Map<String, Object> properties, List<StatusOptionData> options) {
        Map<String, Object> property = readProperty(properties, notionProperties.getProperties().getStatus());
        Map<String, Object> statusPayload = castMap(property.get("status"));
        String optionId = asString(statusPayload.get("id"));
        if (!StringUtils.hasText(optionId)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Notion task status is required");
        }
        LightAppTaskColumnEntity column = taskColumnMapper.selectOne(
            new LambdaQueryWrapper<LightAppTaskColumnEntity>()
                .eq(LightAppTaskColumnEntity::getDeleted, 0)
                .eq(LightAppTaskColumnEntity::getUserId, notionProperties.getOwnerUserId())
                .eq(LightAppTaskColumnEntity::getNotionStatusOptionId, optionId)
                .last("LIMIT 1")
        );
        if (column != null) {
            return column;
        }
        syncColumnsFromNotionStatus();
        column = taskColumnMapper.selectOne(
            new LambdaQueryWrapper<LightAppTaskColumnEntity>()
                .eq(LightAppTaskColumnEntity::getDeleted, 0)
                .eq(LightAppTaskColumnEntity::getUserId, notionProperties.getOwnerUserId())
                .eq(LightAppTaskColumnEntity::getNotionStatusOptionId, optionId)
                .last("LIMIT 1")
        );
        if (column != null) {
            return column;
        }
        throw new BusinessException(ErrorCode.BAD_REQUEST, "No local task column mapped for notion status");
    }

    private LightAppTaskColumnEntity requireMappedColumn(String columnCode, List<StatusOptionData> options) {
        LightAppTaskColumnEntity column = taskColumnMapper.selectOne(
            new LambdaQueryWrapper<LightAppTaskColumnEntity>()
                .eq(LightAppTaskColumnEntity::getDeleted, 0)
                .eq(LightAppTaskColumnEntity::getUserId, notionProperties.getOwnerUserId())
                .eq(LightAppTaskColumnEntity::getColumnCode, normalizeColumnCode(columnCode))
                .last("LIMIT 1")
        );
        if (column == null || !StringUtils.hasText(column.getNotionStatusOptionId())) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Task column is not mapped to notion status. Pull first.");
        }
        boolean optionExists = options.stream().anyMatch(option -> Objects.equals(option.optionId(), column.getNotionStatusOptionId()));
        if (!optionExists) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Task column mapping is stale. Pull first.");
        }
        return column;
    }

    private Map<String, Object> readProperty(Map<String, Object> properties, String propertyName) {
        Map<String, Object> property = castMap(properties.get(propertyName));
        if (!property.isEmpty()) {
            return property;
        }
        for (Object value : properties.values()) {
            Map<String, Object> candidate = castMap(value);
            if (propertyName.equals(asString(candidate.get("name")))) {
                return candidate;
            }
        }
        return Map.of();
    }

    private String readTitle(Map<String, Object> properties, String propertyName) {
        Map<String, Object> property = readProperty(properties, propertyName);
        return joinPlainText(property.get("title"));
    }

    private String readRichText(Map<String, Object> properties, String propertyName) {
        Map<String, Object> property = readProperty(properties, propertyName);
        return joinPlainText(property.get("rich_text"));
    }

    private TaskSchedule readSchedule(Map<String, Object> properties) {
        Map<String, Object> property = readProperty(properties, notionProperties.getProperties().getSchedule());
        Map<String, Object> datePayload = castMap(property.get("date"));
        String startRaw = asString(datePayload.get("start"));
        String endRaw = asString(datePayload.get("end"));
        if (!StringUtils.hasText(startRaw) && !StringUtils.hasText(endRaw)) {
            boolean showOnCalendar = readCheckbox(properties, notionProperties.getProperties().getShowOnCalendar());
            return new TaskSchedule(null, null, TIME_PRECISION_MINUTE, TIMING_MODE_DEADLINE, showOnCalendar);
        }

        boolean isRange = StringUtils.hasText(endRaw);
        boolean dayPrecision = !startRaw.contains("T") && (!StringUtils.hasText(endRaw) || !endRaw.contains("T"));
        LocalDateTime start = parseNotionDateValue(startRaw, false);
        LocalDateTime end = parseNotionDateValue(StringUtils.hasText(endRaw) ? endRaw : startRaw, true);
        String timePrecision = dayPrecision ? TIME_PRECISION_DAY : TIME_PRECISION_MINUTE;
        String timingMode = isRange ? TIMING_MODE_RANGE : TIMING_MODE_DEADLINE;
        boolean showOnCalendar = readCheckbox(properties, notionProperties.getProperties().getShowOnCalendar());
        return new TaskSchedule(
            end,
            isRange ? start : null,
            timePrecision,
            timingMode,
            showOnCalendar
        );
    }

    private boolean readCheckbox(Map<String, Object> properties, String propertyName) {
        Map<String, Object> property = readProperty(properties, propertyName);
        return property.isEmpty() || Boolean.TRUE.equals(property.get("checkbox"));
    }

    private LocalDateTime parseNotionDateValue(String raw, boolean endBoundary) {
        if (!StringUtils.hasText(raw)) {
            return null;
        }
        try {
            return OffsetDateTime.parse(raw).toLocalDateTime();
        } catch (RuntimeException ignored) {
            LocalDate date = LocalDate.parse(raw);
            return endBoundary ? date.atTime(LocalTime.MAX.withNano(0)) : date.atStartOfDay();
        }
    }

    private void upsertCursor() {
        if (!notionClient.isConfigured()) {
            return;
        }
        String scopeCode = "OWNER_" + notionProperties.getOwnerUserId();
        LightAppTaskNotionSyncCursorEntity cursor = cursorMapper.selectOne(
            new LambdaQueryWrapper<LightAppTaskNotionSyncCursorEntity>()
                .eq(LightAppTaskNotionSyncCursorEntity::getDeleted, 0)
                .eq(LightAppTaskNotionSyncCursorEntity::getSyncScopeCode, scopeCode)
                .last("LIMIT 1")
        );
        if (cursor == null) {
            cursor = new LightAppTaskNotionSyncCursorEntity();
            cursor.setSyncScopeCode(scopeCode);
            cursor.setDataSourceId(notionProperties.getDataSourceId());
            cursor.setCreatedAt(LocalDateTime.now());
        }
        LocalDateTime maxEdited = taskMapper.selectList(
            new LambdaQueryWrapper<LightAppTaskEntity>()
                .eq(LightAppTaskEntity::getDeleted, 0)
                .eq(LightAppTaskEntity::getUserId, notionProperties.getOwnerUserId())
                .isNotNull(LightAppTaskEntity::getNotionLastEditedTime)
        ).stream()
            .map(LightAppTaskEntity::getNotionLastEditedTime)
            .filter(Objects::nonNull)
            .max(LocalDateTime::compareTo)
            .orElse(null);
        cursor.setCursorValue(maxEdited == null ? "" : maxEdited.toString());
        cursor.setStatusCode("IDLE");
        cursor.setErrorText("");
        cursor.setLastSyncedTime(LocalDateTime.now());
        cursor.setUpdatedAt(LocalDateTime.now());
        if (cursor.getId() == null || cursor.getId() <= 0) {
            cursorMapper.insert(cursor);
        } else {
            cursorMapper.updateById(cursor);
        }
    }

    private void applyJobResult(LightAppTaskNotionSyncJobEntity job, SyncExecutionResult result) {
        job.setResultCount(result.successCount());
        job.setErrorCount(result.errorCount());
        job.setSkippedCount(result.skippedCount());
        job.setConflictCount(result.conflictCount());
        job.setErrorText(result.message());
        job.setFinishedTime(LocalDateTime.now());
        job.setUpdatedAt(LocalDateTime.now());
        if (result.errorCount() > 0 && result.successCount() == 0) {
            job.setStatusCode(JOB_STATUS_FAILED);
        } else if (result.errorCount() > 0 || result.conflictCount() > 0) {
            job.setStatusCode(JOB_STATUS_PARTIAL);
        } else {
            job.setStatusCode(JOB_STATUS_SUCCEEDED);
        }
        jobMapper.updateById(job);
    }

    private LightAppTaskEntity requireOwnerTask(Long taskId) {
        LightAppTaskEntity task = taskMapper.selectOne(
            new LambdaQueryWrapper<LightAppTaskEntity>()
                .eq(LightAppTaskEntity::getDeleted, 0)
                .eq(LightAppTaskEntity::getId, taskId)
                .eq(LightAppTaskEntity::getUserId, notionProperties.getOwnerUserId())
                .last("LIMIT 1")
        );
        if (task == null) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "Owner task not found");
        }
        return task;
    }

    private List<LightAppTaskColumnEntity> listTaskColumns(Long userId) {
        return taskColumnMapper.selectList(
            new LambdaQueryWrapper<LightAppTaskColumnEntity>()
                .eq(LightAppTaskColumnEntity::getDeleted, 0)
                .eq(LightAppTaskColumnEntity::getUserId, userId)
                .orderByAsc(LightAppTaskColumnEntity::getSortNum)
                .orderByAsc(LightAppTaskColumnEntity::getId)
        );
    }

    private LightAppTaskColumnEntity findMatchingLocalColumn(List<LightAppTaskColumnEntity> unmatchedColumns, String optionName) {
        String normalizedOptionCode = normalizeColumnCode(optionName);
        String normalizedTitle = normalizeTitle(optionName);
        for (int index = 0; index < unmatchedColumns.size(); index++) {
            LightAppTaskColumnEntity column = unmatchedColumns.get(index);
            if (Objects.equals(normalizeColumnCode(column.getColumnCode()), normalizedOptionCode)
                || Objects.equals(normalizeTitle(column.getTitle()), normalizedTitle)) {
                unmatchedColumns.remove(index);
                return column;
            }
        }
        return null;
    }

    private String generateUniqueColumnCode(String optionName,
                                            List<LightAppTaskColumnEntity> existingColumns,
                                            List<LightAppTaskColumnEntity> syncedColumns) {
        Set<String> used = new LinkedHashSet<>();
        for (LightAppTaskColumnEntity column : existingColumns) {
            used.add(normalizeColumnCode(column.getColumnCode()));
        }
        for (LightAppTaskColumnEntity column : syncedColumns) {
            used.add(normalizeColumnCode(column.getColumnCode()));
        }
        String base = normalizeColumnCode(optionName);
        if (!StringUtils.hasText(base)) {
            base = "status";
        }
        String candidate = base;
        int suffix = 2;
        while (used.contains(candidate)) {
            candidate = base + "_" + suffix;
            suffix++;
        }
        return candidate;
    }

    private Long resolveProjectIdByCode(String projectCode) {
        String normalizedCode = readString(projectCode, "");
        if (!StringUtils.hasText(normalizedCode)) {
            return null;
        }
        LightAppProjectEntity project = projectMapper.selectOne(
            new LambdaQueryWrapper<LightAppProjectEntity>()
                .eq(LightAppProjectEntity::getDeleted, 0)
                .eq(LightAppProjectEntity::getUserId, notionProperties.getOwnerUserId())
                .eq(LightAppProjectEntity::getProjectCode, normalizedCode)
                .last("LIMIT 1")
        );
        return project == null ? null : project.getId();
    }

    private String loadProjectCode(Long projectId) {
        if (projectId == null || projectId <= 0) {
            return "";
        }
        LightAppProjectEntity project = projectMapper.selectOne(
            new LambdaQueryWrapper<LightAppProjectEntity>()
                .eq(LightAppProjectEntity::getDeleted, 0)
                .eq(LightAppProjectEntity::getUserId, notionProperties.getOwnerUserId())
                .eq(LightAppProjectEntity::getId, projectId)
                .last("LIMIT 1")
        );
        return project == null ? "" : readString(project.getProjectCode(), "");
    }

    private int nextSortForColumn(Long userId, String columnCode) {
        return taskMapper.selectList(
            new LambdaQueryWrapper<LightAppTaskEntity>()
                .eq(LightAppTaskEntity::getDeleted, 0)
                .eq(LightAppTaskEntity::getUserId, userId)
                .eq(LightAppTaskEntity::getColumnCode, normalizeColumnCode(columnCode))
        ).stream()
            .map(LightAppTaskEntity::getSortNum)
            .filter(Objects::nonNull)
            .max(Integer::compareTo)
            .orElse(0) + 10;
    }

    private void markSyncStatus(LightAppTaskEntity task, String syncStatusCode, String syncErrorText) {
        task.setSyncStatusCode(syncStatusCode);
        task.setSyncErrorText(limit(syncErrorText, 2000));
        task.setUpdatedAt(LocalDateTime.now());
        taskMapper.updateById(task);
    }

    private boolean isOwnerScoped(LightAppTaskEntity task) {
        return task != null && Objects.equals(task.getUserId(), notionProperties.getOwnerUserId());
    }

    private void ensureNotionConfigured() {
        if (!notionClient.isConfigured()) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Task notion integration is not configured");
        }
    }

    private String normalizeDirection(String direction) {
        String normalized = normalizeCode(direction);
        return switch (normalized) {
            case DIRECTION_PULL, DIRECTION_PUSH, DIRECTION_BOTH -> normalized;
            default -> throw new BusinessException(ErrorCode.BAD_REQUEST, "direction must be PULL/PUSH/BOTH");
        };
    }

    private String normalizeTargetType(String targetType) {
        String normalized = normalizeCode(targetType);
        return switch (normalized) {
            case TARGET_TASK, TARGET_ALL -> normalized;
            default -> throw new BusinessException(ErrorCode.BAD_REQUEST, "target_type must be TASK/ALL");
        };
    }

    private String normalizeColumnCode(String rawColumnCode) {
        String normalized = String.valueOf(rawColumnCode == null ? "" : rawColumnCode).trim().toLowerCase(Locale.ROOT);
        if (!StringUtils.hasText(normalized)) {
            return "";
        }
        normalized = normalized.replaceAll("[^a-z0-9]+", "_");
        normalized = normalized.replaceAll("^_+|_+$", "");
        return normalized;
    }

    private String normalizeTitle(String rawTitle) {
        return String.valueOf(rawTitle == null ? "" : rawTitle).trim().toLowerCase(Locale.ROOT);
    }

    private String normalizeCode(String raw) {
        return String.valueOf(raw == null ? "" : raw).trim().toUpperCase(Locale.ROOT);
    }

    private String readString(String value, String fallback) {
        String normalized = String.valueOf(value == null ? fallback : value).trim();
        return StringUtils.hasText(normalized) ? normalized : fallback;
    }

    private String readError(Exception exception) {
        String message = exception == null ? "" : exception.getMessage();
        return limit(readString(message, "Task notion sync failed"), 2000);
    }

    private String limit(String value, int maxLength) {
        if (value == null || value.length() <= maxLength) {
            return value;
        }
        return value.substring(0, maxLength);
    }

    private String normalizeDetail(String detail) {
        return detail == null ? "" : detail.replace("\r\n", "\n").replace('\r', '\n').stripTrailing();
    }

    private String hashTaskSnapshot(LightAppTaskEntity task, String notionStatusOptionId) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            String scheduleStart = task.getRangeStartAt() == null ? "" : task.getRangeStartAt().toString();
            String scheduleEnd = task.getDueAt() == null ? "" : task.getDueAt().toString();
            String payload = String.join(
                "\n",
                readString(task.getTitle(), ""),
                normalizeDetail(task.getDetail()),
                readString(task.getColumnCode(), ""),
                readString(notionStatusOptionId, ""),
                loadProjectCode(task.getProjectId()),
                scheduleStart,
                scheduleEnd,
                readString(task.getTimePrecisionCode(), ""),
                readString(task.getTimingModeCode(), ""),
                String.valueOf(task.getShowOnCalendar() == null || Boolean.TRUE.equals(task.getShowOnCalendar()))
            );
            byte[] hash = digest.digest(payload.getBytes(StandardCharsets.UTF_8));
            return Base64.getUrlEncoder().withoutPadding().encodeToString(hash);
        } catch (NoSuchAlgorithmException exception) {
            throw new BusinessException(ErrorCode.INTERNAL_ERROR, "Hash algorithm missing");
        }
    }

    @SuppressWarnings("unchecked")
    private Map<String, Object> castMap(Object value) {
        if (value instanceof Map<?, ?> map) {
            return (Map<String, Object>) map;
        }
        return Map.of();
    }

    @SuppressWarnings("unchecked")
    private String joinPlainText(Object richTextObject) {
        if (!(richTextObject instanceof List<?> list)) {
            return "";
        }
        StringBuilder builder = new StringBuilder();
        for (Object item : list) {
            if (!(item instanceof Map<?, ?> map)) {
                continue;
            }
            Object plainText = ((Map<String, Object>) map).get("plain_text");
            if (plainText != null) {
                builder.append(plainText);
                continue;
            }
            Object text = ((Map<String, Object>) map).get("text");
            if (text instanceof Map<?, ?> textMap) {
                Object content = ((Map<String, Object>) textMap).get("content");
                if (content != null) {
                    builder.append(content);
                }
            }
        }
        return builder.toString();
    }

    private String asString(Object value) {
        return value == null ? "" : String.valueOf(value).trim();
    }

    private record TaskSchedule(LocalDateTime dueAt,
                                LocalDateTime rangeStartAt,
                                String timePrecisionCode,
                                String timingModeCode,
                                boolean showOnCalendar) {
    }

    public record SyncExecutionResult(int successCount,
                                      int errorCount,
                                      int skippedCount,
                                      int conflictCount,
                                      String message) {

        public static SyncExecutionResult skipped(String message) {
            return new SyncExecutionResult(0, 0, 1, 0, message);
        }

        public SyncExecutionResult merge(SyncExecutionResult other) {
            if (other == null) {
                return this;
            }
            String mergedMessage = StringUtils.hasText(other.message()) ? other.message() : message();
            return new SyncExecutionResult(
                successCount + other.successCount,
                errorCount + other.errorCount,
                skippedCount + other.skippedCount,
                conflictCount + other.conflictCount,
                mergedMessage
            );
        }
    }
}
