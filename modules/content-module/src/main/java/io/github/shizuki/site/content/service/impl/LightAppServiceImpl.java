package io.github.shizuki.site.content.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.common.security.context.LoginUserContext;
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
import io.github.shizuki.site.content.dto.LightAppProjectResponse;
import io.github.shizuki.site.content.dto.LightAppProjectUpsertRequest;
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
import io.github.shizuki.site.content.entity.LightAppBalanceAccountEntity;
import io.github.shizuki.site.content.entity.LightAppBalanceDebtEntity;
import io.github.shizuki.site.content.entity.LightAppBalanceRecurringChargeEntity;
import io.github.shizuki.site.content.entity.LightAppBalanceTransactionEntity;
import io.github.shizuki.site.content.entity.LightAppFxRateEntity;
import io.github.shizuki.site.content.entity.LightAppPomodoroTemplateEntity;
import io.github.shizuki.site.content.entity.LightAppProjectEntity;
import io.github.shizuki.site.content.entity.LightAppScheduleRecurringRuleEntity;
import io.github.shizuki.site.content.entity.LightAppScheduleEventEntity;
import io.github.shizuki.site.content.entity.LightAppTaskRecurringRuleEntity;
import io.github.shizuki.site.content.entity.LightAppTaskColumnEntity;
import io.github.shizuki.site.content.entity.LightAppTaskEntity;
import io.github.shizuki.site.content.entity.LightAppTodoRecurringRuleEntity;
import io.github.shizuki.site.content.entity.LightAppTodoEntity;
import io.github.shizuki.site.content.mapper.LightAppBalanceAccountMapper;
import io.github.shizuki.site.content.mapper.LightAppBalanceDebtMapper;
import io.github.shizuki.site.content.mapper.LightAppBalanceRecurringChargeMapper;
import io.github.shizuki.site.content.mapper.LightAppBalanceTransactionMapper;
import io.github.shizuki.site.content.mapper.LightAppFxRateMapper;
import io.github.shizuki.site.content.mapper.LightAppPomodoroTemplateMapper;
import io.github.shizuki.site.content.mapper.LightAppProjectMapper;
import io.github.shizuki.site.content.mapper.LightAppScheduleRecurringRuleMapper;
import io.github.shizuki.site.content.mapper.LightAppScheduleEventMapper;
import io.github.shizuki.site.content.mapper.LightAppTaskRecurringRuleMapper;
import io.github.shizuki.site.content.mapper.LightAppTaskColumnMapper;
import io.github.shizuki.site.content.mapper.LightAppTaskMapper;
import io.github.shizuki.site.content.mapper.LightAppTodoRecurringRuleMapper;
import io.github.shizuki.site.content.mapper.LightAppTodoMapper;
import io.github.shizuki.site.content.service.LightAppService;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import org.springframework.scheduling.support.CronExpression;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;
import org.springframework.web.client.RestClient;

@Service
public class LightAppServiceImpl implements LightAppService {

    private static final int SORT_STEP = 10;
    private static final int MAX_UPCOMING_DAYS = 30;
    private static final int DEFAULT_UPCOMING_DAYS = 7;
    private static final int MAX_UPCOMING_SIZE = 50;
    private static final int FUTURE_MATERIALIZE_DAYS = 14;
    private static final int BALANCE_CATCHUP_DAYS = 30;
    private static final int MAX_RECURRING_OCCURRENCES_PER_PASS = 1000;
    private static final int FX_STALE_HOURS = 6;
    private static final String RINGTONE_TYPE_BUILTIN = "BUILTIN";
    private static final String RINGTONE_TYPE_UPLOAD = "UPLOAD";
    private static final String BASE_CURRENCY_CNY = "CNY";
    private static final String DIRECTION_INCOME = "INCOME";
    private static final String DIRECTION_EXPENSE = "EXPENSE";
    private static final String DEBT_STATUS_OPEN = "OPEN";
    private static final String DEBT_STATUS_CLOSED = "CLOSED";
    private static final String DEFAULT_TIME_ZONE = "Asia/Shanghai";
    private static final String FX_PROVIDER_CODE = "OPEN_ER_API";
    private static final String FX_PROVIDER_URL_TEMPLATE = "https://open.er-api.com/v6/latest/{base}";
    private static final int FX_SCALE = 8;

    private static final List<DefaultTaskColumn> DEFAULT_TASK_COLUMNS = List.of(
        new DefaultTaskColumn("todo", "待处理", 10),
        new DefaultTaskColumn("doing", "进行中", 20),
        new DefaultTaskColumn("done", "已完成", 30)
    );

    private final LightAppBalanceAccountMapper balanceAccountMapper;
    private final LightAppBalanceTransactionMapper balanceTransactionMapper;
    private final LightAppBalanceDebtMapper balanceDebtMapper;
    private final LightAppBalanceRecurringChargeMapper balanceRecurringChargeMapper;
    private final LightAppFxRateMapper fxRateMapper;
    private final LightAppPomodoroTemplateMapper pomodoroTemplateMapper;
    private final LightAppProjectMapper projectMapper;
    private final LightAppTodoMapper todoMapper;
    private final LightAppTodoRecurringRuleMapper todoRecurringRuleMapper;
    private final LightAppTaskMapper taskMapper;
    private final LightAppTaskRecurringRuleMapper taskRecurringRuleMapper;
    private final LightAppTaskColumnMapper taskColumnMapper;
    private final LightAppScheduleEventMapper scheduleEventMapper;
    private final LightAppScheduleRecurringRuleMapper scheduleRecurringRuleMapper;
    private final RestClient restClient;

    public LightAppServiceImpl(
        LightAppBalanceAccountMapper balanceAccountMapper,
        LightAppBalanceTransactionMapper balanceTransactionMapper,
        LightAppBalanceDebtMapper balanceDebtMapper,
        LightAppBalanceRecurringChargeMapper balanceRecurringChargeMapper,
        LightAppFxRateMapper fxRateMapper,
        LightAppPomodoroTemplateMapper pomodoroTemplateMapper,
        LightAppProjectMapper projectMapper,
        LightAppTodoMapper todoMapper,
        LightAppTodoRecurringRuleMapper todoRecurringRuleMapper,
        LightAppTaskMapper taskMapper,
        LightAppTaskRecurringRuleMapper taskRecurringRuleMapper,
        LightAppTaskColumnMapper taskColumnMapper,
        LightAppScheduleEventMapper scheduleEventMapper,
        LightAppScheduleRecurringRuleMapper scheduleRecurringRuleMapper,
        RestClient.Builder restClientBuilder
    ) {
        this.balanceAccountMapper = balanceAccountMapper;
        this.balanceTransactionMapper = balanceTransactionMapper;
        this.balanceDebtMapper = balanceDebtMapper;
        this.balanceRecurringChargeMapper = balanceRecurringChargeMapper;
        this.fxRateMapper = fxRateMapper;
        this.pomodoroTemplateMapper = pomodoroTemplateMapper;
        this.projectMapper = projectMapper;
        this.todoMapper = todoMapper;
        this.todoRecurringRuleMapper = todoRecurringRuleMapper;
        this.taskMapper = taskMapper;
        this.taskRecurringRuleMapper = taskRecurringRuleMapper;
        this.taskColumnMapper = taskColumnMapper;
        this.scheduleEventMapper = scheduleEventMapper;
        this.scheduleRecurringRuleMapper = scheduleRecurringRuleMapper;
        this.restClient = restClientBuilder.build();
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
    public List<LightAppBalanceAccountResponse> listBalanceAccounts() {
        Long userId = requireLoginUserId();
        return balanceAccountMapper.selectList(new LambdaQueryWrapper<LightAppBalanceAccountEntity>()
                .eq(LightAppBalanceAccountEntity::getUserId, userId)
                .orderByAsc(LightAppBalanceAccountEntity::getSortNum)
                .orderByDesc(LightAppBalanceAccountEntity::getUpdatedAt)
                .orderByDesc(LightAppBalanceAccountEntity::getId))
            .stream()
            .map(this::toBalanceAccountResponse)
            .toList();
    }

    @Override
    @Transactional
    public LightAppBalanceAccountResponse createBalanceAccount(LightAppBalanceAccountUpsertRequest request) {
        Long userId = requireLoginUserId();
        LightAppBalanceAccountEntity entity = new LightAppBalanceAccountEntity();
        entity.setUserId(userId);
        applyBalanceAccountUpsert(entity, request);
        entity.setSortNum(resolveSortNum(request.getSortNum(), balanceAccountMapper.selectMaxSortNumByUserId(userId)));
        balanceAccountMapper.insert(entity);
        return toBalanceAccountResponse(requireBalanceAccount(userId, entity.getId()));
    }

    @Override
    @Transactional
    public LightAppBalanceAccountResponse updateBalanceAccount(Long accountId, LightAppBalanceAccountUpsertRequest request) {
        Long userId = requireLoginUserId();
        LightAppBalanceAccountEntity entity = requireBalanceAccount(userId, accountId);
        applyBalanceAccountUpsert(entity, request);
        if (request.getSortNum() != null) {
            entity.setSortNum(request.getSortNum());
        }
        balanceAccountMapper.updateById(entity);
        return toBalanceAccountResponse(requireBalanceAccount(userId, accountId));
    }

    @Override
    @Transactional
    public void deleteBalanceAccount(Long accountId) {
        Long userId = requireLoginUserId();
        LightAppBalanceAccountEntity entity = requireBalanceAccount(userId, accountId);
        balanceAccountMapper.deleteById(entity.getId());

        LightAppBalanceTransactionEntity txnPatch = new LightAppBalanceTransactionEntity();
        txnPatch.setAccountId(null);
        balanceTransactionMapper.update(txnPatch, new LambdaUpdateWrapper<LightAppBalanceTransactionEntity>()
            .eq(LightAppBalanceTransactionEntity::getUserId, userId)
            .eq(LightAppBalanceTransactionEntity::getAccountId, accountId));

        LightAppBalanceRecurringChargeEntity chargePatch = new LightAppBalanceRecurringChargeEntity();
        chargePatch.setAccountId(null);
        balanceRecurringChargeMapper.update(chargePatch, new LambdaUpdateWrapper<LightAppBalanceRecurringChargeEntity>()
            .eq(LightAppBalanceRecurringChargeEntity::getUserId, userId)
            .eq(LightAppBalanceRecurringChargeEntity::getAccountId, accountId));
    }

    @Override
    @Transactional
    public List<LightAppBalanceTransactionResponse> listBalanceTransactions() {
        Long userId = requireLoginUserId();
        applyRecurringChargesForUser(userId);
        return balanceTransactionMapper.selectList(new LambdaQueryWrapper<LightAppBalanceTransactionEntity>()
                .eq(LightAppBalanceTransactionEntity::getUserId, userId)
                .orderByDesc(LightAppBalanceTransactionEntity::getOccurredAt)
                .orderByDesc(LightAppBalanceTransactionEntity::getSortNum)
                .orderByDesc(LightAppBalanceTransactionEntity::getId))
            .stream()
            .map(this::toBalanceTransactionResponse)
            .toList();
    }

    @Override
    @Transactional
    public LightAppBalanceTransactionResponse createBalanceTransaction(LightAppBalanceTransactionUpsertRequest request) {
        Long userId = requireLoginUserId();
        LightAppBalanceTransactionEntity entity = new LightAppBalanceTransactionEntity();
        entity.setUserId(userId);
        applyBalanceTransactionUpsert(entity, request, userId, true);
        entity.setSortNum(resolveSortNum(request.getSortNum(), balanceTransactionMapper.selectMaxSortNumByUserId(userId)));
        balanceTransactionMapper.insert(entity);
        return toBalanceTransactionResponse(requireBalanceTransaction(userId, entity.getId()));
    }

    @Override
    @Transactional
    public LightAppBalanceTransactionResponse updateBalanceTransaction(Long transactionId, LightAppBalanceTransactionUpsertRequest request) {
        Long userId = requireLoginUserId();
        LightAppBalanceTransactionEntity entity = requireBalanceTransaction(userId, transactionId);
        if (entity.getRecurringChargeId() != null) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Recurring generated transaction can not be edited");
        }
        rollbackManualTransactionEffect(userId, entity);
        applyBalanceTransactionUpsert(entity, request, userId, true);
        if (request.getSortNum() != null) {
            entity.setSortNum(request.getSortNum());
        }
        balanceTransactionMapper.updateById(entity);
        return toBalanceTransactionResponse(requireBalanceTransaction(userId, transactionId));
    }

    @Override
    @Transactional
    public void deleteBalanceTransaction(Long transactionId) {
        Long userId = requireLoginUserId();
        LightAppBalanceTransactionEntity entity = requireBalanceTransaction(userId, transactionId);
        if (entity.getRecurringChargeId() != null) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Recurring generated transaction can not be deleted");
        }
        rollbackManualTransactionEffect(userId, entity);
        balanceTransactionMapper.deleteById(entity.getId());
    }

    @Override
    public List<LightAppBalanceDebtResponse> listBalanceDebts() {
        Long userId = requireLoginUserId();
        return balanceDebtMapper.selectList(new LambdaQueryWrapper<LightAppBalanceDebtEntity>()
                .eq(LightAppBalanceDebtEntity::getUserId, userId)
                .orderByAsc(LightAppBalanceDebtEntity::getStatusCode)
                .orderByDesc(LightAppBalanceDebtEntity::getOccurredAt)
                .orderByDesc(LightAppBalanceDebtEntity::getSortNum)
                .orderByDesc(LightAppBalanceDebtEntity::getId))
            .stream()
            .map(this::toBalanceDebtResponse)
            .toList();
    }

    @Override
    @Transactional
    public LightAppBalanceDebtResponse createBalanceDebt(LightAppBalanceDebtUpsertRequest request) {
        Long userId = requireLoginUserId();
        LightAppBalanceDebtEntity entity = new LightAppBalanceDebtEntity();
        entity.setUserId(userId);
        applyBalanceDebtUpsert(entity, request);
        entity.setSortNum(resolveSortNum(request.getSortNum(), balanceDebtMapper.selectMaxSortNumByUserId(userId)));
        balanceDebtMapper.insert(entity);
        return toBalanceDebtResponse(requireBalanceDebt(userId, entity.getId()));
    }

    @Override
    @Transactional
    public LightAppBalanceDebtResponse updateBalanceDebt(Long debtId, LightAppBalanceDebtUpsertRequest request) {
        Long userId = requireLoginUserId();
        LightAppBalanceDebtEntity entity = requireBalanceDebt(userId, debtId);
        applyBalanceDebtUpsert(entity, request);
        if (request.getSortNum() != null) {
            entity.setSortNum(request.getSortNum());
        }
        balanceDebtMapper.updateById(entity);
        return toBalanceDebtResponse(requireBalanceDebt(userId, debtId));
    }

    @Override
    @Transactional
    public void deleteBalanceDebt(Long debtId) {
        Long userId = requireLoginUserId();
        LightAppBalanceDebtEntity entity = requireBalanceDebt(userId, debtId);
        balanceDebtMapper.deleteById(entity.getId());
    }

    @Override
    @Transactional
    public List<LightAppBalanceRecurringChargeResponse> listBalanceRecurringCharges() {
        Long userId = requireLoginUserId();
        applyRecurringChargesForUser(userId);
        return listRecurringCharges(userId).stream().map(this::toBalanceRecurringChargeResponse).toList();
    }

    @Override
    @Transactional
    public LightAppBalanceRecurringChargeResponse createBalanceRecurringCharge(LightAppBalanceRecurringChargeUpsertRequest request) {
        Long userId = requireLoginUserId();
        LightAppBalanceRecurringChargeEntity entity = new LightAppBalanceRecurringChargeEntity();
        entity.setUserId(userId);
        applyBalanceRecurringChargeUpsert(entity, request, userId);
        entity.setSortNum(resolveSortNum(request.getSortNum(), balanceRecurringChargeMapper.selectMaxSortNumByUserId(userId)));
        balanceRecurringChargeMapper.insert(entity);
        return toBalanceRecurringChargeResponse(requireRecurringCharge(userId, entity.getId()));
    }

    @Override
    @Transactional
    public LightAppBalanceRecurringChargeResponse updateBalanceRecurringCharge(Long recurringChargeId, LightAppBalanceRecurringChargeUpsertRequest request) {
        Long userId = requireLoginUserId();
        LightAppBalanceRecurringChargeEntity entity = requireRecurringCharge(userId, recurringChargeId);
        applyBalanceRecurringChargeUpsert(entity, request, userId);
        if (request.getSortNum() != null) {
            entity.setSortNum(request.getSortNum());
        }
        balanceRecurringChargeMapper.updateById(entity);
        return toBalanceRecurringChargeResponse(requireRecurringCharge(userId, recurringChargeId));
    }

    @Override
    @Transactional
    public void deleteBalanceRecurringCharge(Long recurringChargeId) {
        Long userId = requireLoginUserId();
        LightAppBalanceRecurringChargeEntity entity = requireRecurringCharge(userId, recurringChargeId);
        balanceRecurringChargeMapper.deleteById(entity.getId());
    }

    @Override
    @Transactional
    public LightAppBalanceOverviewResponse getBalanceOverview(String baseCurrency) {
        Long userId = requireLoginUserId();
        applyRecurringChargesForUser(userId);
        String targetBaseCurrency = normalizeCurrencyCode(baseCurrency, BASE_CURRENCY_CNY);
        Map<String, BigDecimal> rates = toRateMap(ensureFxRates(targetBaseCurrency, false));

        BigDecimal totalBalance = listBalanceAccountsEntities(userId).stream()
            .map(item -> convertToBase(item.getBalanceAmount(), item.getCurrencyCode(), targetBaseCurrency, rates))
            .reduce(BigDecimal.ZERO, BigDecimal::add);

        BigDecimal totalDebt = balanceDebtMapper.selectList(new LambdaQueryWrapper<LightAppBalanceDebtEntity>()
                .eq(LightAppBalanceDebtEntity::getUserId, userId)
                .eq(LightAppBalanceDebtEntity::getStatusCode, DEBT_STATUS_OPEN))
            .stream()
            .map(item -> convertToBase(item.getAmount(), item.getCurrencyCode(), targetBaseCurrency, rates))
            .reduce(BigDecimal.ZERO, BigDecimal::add);

        BigDecimal netAsset = totalBalance.subtract(totalDebt);
        return new LightAppBalanceOverviewResponse(
            targetBaseCurrency,
            totalBalance.setScale(4, RoundingMode.HALF_UP),
            totalDebt.setScale(4, RoundingMode.HALF_UP),
            netAsset.setScale(4, RoundingMode.HALF_UP),
            LocalDateTime.now()
        );
    }

    @Override
    @Transactional
    public List<LightAppFxRateResponse> listFxRates(String baseCurrency) {
        String targetBaseCurrency = normalizeCurrencyCode(baseCurrency, BASE_CURRENCY_CNY);
        return ensureFxRates(targetBaseCurrency, false);
    }

    @Override
    @Transactional
    public List<LightAppFxRateResponse> refreshFxRates(String baseCurrency) {
        String targetBaseCurrency = normalizeCurrencyCode(baseCurrency, BASE_CURRENCY_CNY);
        return ensureFxRates(targetBaseCurrency, true);
    }

    @Override
    public List<LightAppPomodoroResponse> listPomodoros() {
        Long userId = requireLoginUserId();
        return pomodoroTemplateMapper.selectList(new LambdaQueryWrapper<LightAppPomodoroTemplateEntity>()
                .eq(LightAppPomodoroTemplateEntity::getUserId, userId)
                .orderByAsc(LightAppPomodoroTemplateEntity::getSortNum)
                .orderByDesc(LightAppPomodoroTemplateEntity::getUpdatedAt)
                .orderByDesc(LightAppPomodoroTemplateEntity::getId))
            .stream()
            .map(this::toPomodoroResponse)
            .toList();
    }

    @Override
    @Transactional
    public LightAppPomodoroResponse createPomodoro(LightAppPomodoroUpsertRequest request) {
        Long userId = requireLoginUserId();
        LightAppPomodoroTemplateEntity entity = new LightAppPomodoroTemplateEntity();
        entity.setUserId(userId);
        applyPomodoroUpsert(entity, request, userId);
        entity.setSortNum(resolveSortNum(request.getSortNum(), pomodoroTemplateMapper.selectMaxSortNumByUserId(userId)));
        pomodoroTemplateMapper.insert(entity);
        return toPomodoroResponse(requirePomodoro(userId, entity.getId()));
    }

    @Override
    @Transactional
    public LightAppPomodoroResponse updatePomodoro(Long pomodoroId, LightAppPomodoroUpsertRequest request) {
        Long userId = requireLoginUserId();
        LightAppPomodoroTemplateEntity entity = requirePomodoro(userId, pomodoroId);
        applyPomodoroUpsert(entity, request, userId);
        if (request.getSortNum() != null) {
            entity.setSortNum(request.getSortNum());
        }
        pomodoroTemplateMapper.updateById(entity);
        return toPomodoroResponse(requirePomodoro(userId, pomodoroId));
    }

    @Override
    @Transactional
    public void deletePomodoro(Long pomodoroId) {
        Long userId = requireLoginUserId();
        LightAppPomodoroTemplateEntity entity = requirePomodoro(userId, pomodoroId);
        pomodoroTemplateMapper.deleteById(entity.getId());
    }

    @Override
    public List<LightAppTodoResponse> listTodos() {
        Long userId = requireLoginUserId();
        materializeTodoRecurringInstances(userId);
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
    public List<LightAppTodoRecurringRuleResponse> listTodoRecurringRules() {
        Long userId = requireLoginUserId();
        return todoRecurringRuleMapper.selectList(new LambdaQueryWrapper<LightAppTodoRecurringRuleEntity>()
                .eq(LightAppTodoRecurringRuleEntity::getUserId, userId)
                .orderByAsc(LightAppTodoRecurringRuleEntity::getSortNum)
                .orderByDesc(LightAppTodoRecurringRuleEntity::getUpdatedAt)
                .orderByDesc(LightAppTodoRecurringRuleEntity::getId))
            .stream()
            .map(this::toTodoRecurringRuleResponse)
            .toList();
    }

    @Override
    @Transactional
    public LightAppTodoRecurringRuleResponse createTodoRecurringRule(LightAppTodoRecurringRuleUpsertRequest request) {
        Long userId = requireLoginUserId();
        LightAppTodoRecurringRuleEntity entity = new LightAppTodoRecurringRuleEntity();
        entity.setUserId(userId);
        applyTodoRecurringRuleUpsert(entity, request, userId);
        entity.setSortNum(resolveSortNum(request.getSortNum(), todoRecurringRuleMapper.selectMaxSortNumByUserId(userId)));
        todoRecurringRuleMapper.insert(entity);
        return toTodoRecurringRuleResponse(requireTodoRecurringRule(userId, entity.getId()));
    }

    @Override
    @Transactional
    public LightAppTodoRecurringRuleResponse updateTodoRecurringRule(Long ruleId, LightAppTodoRecurringRuleUpsertRequest request) {
        Long userId = requireLoginUserId();
        LightAppTodoRecurringRuleEntity entity = requireTodoRecurringRule(userId, ruleId);
        applyTodoRecurringRuleUpsert(entity, request, userId);
        if (request.getSortNum() != null) {
            entity.setSortNum(request.getSortNum());
        }
        todoRecurringRuleMapper.updateById(entity);
        return toTodoRecurringRuleResponse(requireTodoRecurringRule(userId, ruleId));
    }

    @Override
    @Transactional
    public void deleteTodoRecurringRule(Long ruleId) {
        Long userId = requireLoginUserId();
        LightAppTodoRecurringRuleEntity entity = requireTodoRecurringRule(userId, ruleId);
        todoRecurringRuleMapper.deleteById(entity.getId());
    }

    @Override
    public List<LightAppTaskResponse> listTasks() {
        Long userId = requireLoginUserId();
        materializeTaskRecurringInstances(userId);
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
    public List<LightAppTaskRecurringRuleResponse> listTaskRecurringRules() {
        Long userId = requireLoginUserId();
        return taskRecurringRuleMapper.selectList(new LambdaQueryWrapper<LightAppTaskRecurringRuleEntity>()
                .eq(LightAppTaskRecurringRuleEntity::getUserId, userId)
                .orderByAsc(LightAppTaskRecurringRuleEntity::getSortNum)
                .orderByDesc(LightAppTaskRecurringRuleEntity::getUpdatedAt)
                .orderByDesc(LightAppTaskRecurringRuleEntity::getId))
            .stream()
            .map(this::toTaskRecurringRuleResponse)
            .toList();
    }

    @Override
    @Transactional
    public LightAppTaskRecurringRuleResponse createTaskRecurringRule(LightAppTaskRecurringRuleUpsertRequest request) {
        Long userId = requireLoginUserId();
        ensureDefaultTaskColumns(userId);
        LightAppTaskRecurringRuleEntity entity = new LightAppTaskRecurringRuleEntity();
        entity.setUserId(userId);
        applyTaskRecurringRuleUpsert(entity, request, userId);
        entity.setSortNum(resolveSortNum(request.getSortNum(), taskRecurringRuleMapper.selectMaxSortNumByUserId(userId)));
        taskRecurringRuleMapper.insert(entity);
        return toTaskRecurringRuleResponse(requireTaskRecurringRule(userId, entity.getId()));
    }

    @Override
    @Transactional
    public LightAppTaskRecurringRuleResponse updateTaskRecurringRule(Long ruleId, LightAppTaskRecurringRuleUpsertRequest request) {
        Long userId = requireLoginUserId();
        ensureDefaultTaskColumns(userId);
        LightAppTaskRecurringRuleEntity entity = requireTaskRecurringRule(userId, ruleId);
        applyTaskRecurringRuleUpsert(entity, request, userId);
        if (request.getSortNum() != null) {
            entity.setSortNum(request.getSortNum());
        }
        taskRecurringRuleMapper.updateById(entity);
        return toTaskRecurringRuleResponse(requireTaskRecurringRule(userId, ruleId));
    }

    @Override
    @Transactional
    public void deleteTaskRecurringRule(Long ruleId) {
        Long userId = requireLoginUserId();
        LightAppTaskRecurringRuleEntity entity = requireTaskRecurringRule(userId, ruleId);
        taskRecurringRuleMapper.deleteById(entity.getId());
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
        materializeScheduleRecurringInstances(userId);
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
        materializeScheduleRecurringInstances(userId);
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

    @Override
    public List<LightAppScheduleRecurringRuleResponse> listScheduleRecurringRules() {
        Long userId = requireLoginUserId();
        return scheduleRecurringRuleMapper.selectList(new LambdaQueryWrapper<LightAppScheduleRecurringRuleEntity>()
                .eq(LightAppScheduleRecurringRuleEntity::getUserId, userId)
                .orderByAsc(LightAppScheduleRecurringRuleEntity::getSortNum)
                .orderByDesc(LightAppScheduleRecurringRuleEntity::getUpdatedAt)
                .orderByDesc(LightAppScheduleRecurringRuleEntity::getId))
            .stream()
            .map(this::toScheduleRecurringRuleResponse)
            .toList();
    }

    @Override
    @Transactional
    public LightAppScheduleRecurringRuleResponse createScheduleRecurringRule(LightAppScheduleRecurringRuleUpsertRequest request) {
        Long userId = requireLoginUserId();
        LightAppScheduleRecurringRuleEntity entity = new LightAppScheduleRecurringRuleEntity();
        entity.setUserId(userId);
        applyScheduleRecurringRuleUpsert(entity, request, userId);
        entity.setSortNum(resolveSortNum(request.getSortNum(), scheduleRecurringRuleMapper.selectMaxSortNumByUserId(userId)));
        scheduleRecurringRuleMapper.insert(entity);
        return toScheduleRecurringRuleResponse(requireScheduleRecurringRule(userId, entity.getId()));
    }

    @Override
    @Transactional
    public LightAppScheduleRecurringRuleResponse updateScheduleRecurringRule(Long ruleId, LightAppScheduleRecurringRuleUpsertRequest request) {
        Long userId = requireLoginUserId();
        LightAppScheduleRecurringRuleEntity entity = requireScheduleRecurringRule(userId, ruleId);
        applyScheduleRecurringRuleUpsert(entity, request, userId);
        if (request.getSortNum() != null) {
            entity.setSortNum(request.getSortNum());
        }
        scheduleRecurringRuleMapper.updateById(entity);
        return toScheduleRecurringRuleResponse(requireScheduleRecurringRule(userId, ruleId));
    }

    @Override
    @Transactional
    public void deleteScheduleRecurringRule(Long ruleId) {
        Long userId = requireLoginUserId();
        LightAppScheduleRecurringRuleEntity entity = requireScheduleRecurringRule(userId, ruleId);
        scheduleRecurringRuleMapper.deleteById(entity.getId());
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

    private LightAppPomodoroTemplateEntity requirePomodoro(Long userId, Long pomodoroId) {
        LightAppPomodoroTemplateEntity entity = pomodoroTemplateMapper.selectOne(new LambdaQueryWrapper<LightAppPomodoroTemplateEntity>()
            .eq(LightAppPomodoroTemplateEntity::getId, pomodoroId)
            .eq(LightAppPomodoroTemplateEntity::getUserId, userId)
            .last("LIMIT 1"));
        if (entity == null) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "Pomodoro template not found");
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

    private void applyPomodoroUpsert(LightAppPomodoroTemplateEntity entity, LightAppPomodoroUpsertRequest request, Long userId) {
        entity.setTitle(normalizeRequiredText(request.getTitle(), "title"));
        entity.setFocusMinutes(normalizePomodoroMinutes(request.getFocusMinutes(), 5, 120, "focus_minutes"));
        entity.setShortBreakMinutes(normalizePomodoroMinutes(request.getShortBreakMinutes(), 1, 60, "short_break_minutes"));
        entity.setLongBreakMinutes(normalizePomodoroMinutes(request.getLongBreakMinutes(), 5, 90, "long_break_minutes"));
        entity.setLongBreakEvery(normalizePomodoroMinutes(request.getLongBreakEvery(), 2, 12, "long_break_every"));
        entity.setAutoStartNext(Boolean.TRUE.equals(request.getAutoStartNext()));

        String ringtoneType = normalizeRingtoneType(request.getRingtoneType());
        String ringtoneName = normalizeOptionalText(request.getRingtoneName());
        String ringtoneCode = normalizeOptionalText(request.getRingtoneCode());
        Long ringtoneAssetId = request.getRingtoneAssetId();
        if (ringtoneAssetId != null && ringtoneAssetId <= 0) {
            ringtoneAssetId = null;
        }

        if (RINGTONE_TYPE_UPLOAD.equals(ringtoneType)) {
            if (ringtoneAssetId == null) {
                throw new BusinessException(ErrorCode.BAD_REQUEST, "ringtone_asset_id is required when ringtone_type is UPLOAD");
            }
            ringtoneCode = null;
            if (ringtoneName == null) {
                ringtoneName = "Uploaded Ringtone";
            }
        } else {
            if (!StringUtils.hasText(ringtoneCode)) {
                throw new BusinessException(ErrorCode.BAD_REQUEST, "ringtone_code is required when ringtone_type is BUILTIN");
            }
            ringtoneAssetId = null;
        }

        entity.setUserId(userId);
        entity.setRingtoneTypeCode(ringtoneType);
        entity.setRingtoneName(ringtoneName);
        entity.setRingtoneCode(ringtoneCode);
        entity.setRingtoneAssetId(ringtoneAssetId);
    }

    private int normalizePomodoroMinutes(Integer value, int min, int max, String fieldName) {
        if (value == null) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, fieldName + " is required");
        }
        if (value < min || value > max) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, fieldName + " out of range");
        }
        return value;
    }

    private String normalizeRingtoneType(String rawType) {
        String normalized = String.valueOf(rawType == null ? "" : rawType).trim().toUpperCase(Locale.ROOT);
        if (!StringUtils.hasText(normalized)) {
            return RINGTONE_TYPE_BUILTIN;
        }
        if (RINGTONE_TYPE_BUILTIN.equals(normalized) || RINGTONE_TYPE_UPLOAD.equals(normalized)) {
            return normalized;
        }
        throw new BusinessException(ErrorCode.BAD_REQUEST, "Unsupported ringtone_type: " + rawType);
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

    private LightAppBalanceAccountEntity requireBalanceAccount(Long userId, Long accountId) {
        LightAppBalanceAccountEntity entity = balanceAccountMapper.selectOne(new LambdaQueryWrapper<LightAppBalanceAccountEntity>()
            .eq(LightAppBalanceAccountEntity::getId, accountId)
            .eq(LightAppBalanceAccountEntity::getUserId, userId)
            .last("LIMIT 1"));
        if (entity == null) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "Balance account not found");
        }
        return entity;
    }

    private LightAppBalanceTransactionEntity requireBalanceTransaction(Long userId, Long transactionId) {
        LightAppBalanceTransactionEntity entity = balanceTransactionMapper.selectOne(new LambdaQueryWrapper<LightAppBalanceTransactionEntity>()
            .eq(LightAppBalanceTransactionEntity::getId, transactionId)
            .eq(LightAppBalanceTransactionEntity::getUserId, userId)
            .last("LIMIT 1"));
        if (entity == null) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "Balance transaction not found");
        }
        return entity;
    }

    private LightAppBalanceDebtEntity requireBalanceDebt(Long userId, Long debtId) {
        LightAppBalanceDebtEntity entity = balanceDebtMapper.selectOne(new LambdaQueryWrapper<LightAppBalanceDebtEntity>()
            .eq(LightAppBalanceDebtEntity::getId, debtId)
            .eq(LightAppBalanceDebtEntity::getUserId, userId)
            .last("LIMIT 1"));
        if (entity == null) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "Balance debt not found");
        }
        return entity;
    }

    private LightAppBalanceRecurringChargeEntity requireRecurringCharge(Long userId, Long recurringChargeId) {
        LightAppBalanceRecurringChargeEntity entity = balanceRecurringChargeMapper.selectOne(new LambdaQueryWrapper<LightAppBalanceRecurringChargeEntity>()
            .eq(LightAppBalanceRecurringChargeEntity::getId, recurringChargeId)
            .eq(LightAppBalanceRecurringChargeEntity::getUserId, userId)
            .last("LIMIT 1"));
        if (entity == null) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "Recurring charge not found");
        }
        return entity;
    }

    private LightAppTodoRecurringRuleEntity requireTodoRecurringRule(Long userId, Long ruleId) {
        LightAppTodoRecurringRuleEntity entity = todoRecurringRuleMapper.selectOne(new LambdaQueryWrapper<LightAppTodoRecurringRuleEntity>()
            .eq(LightAppTodoRecurringRuleEntity::getId, ruleId)
            .eq(LightAppTodoRecurringRuleEntity::getUserId, userId)
            .last("LIMIT 1"));
        if (entity == null) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "Todo recurring rule not found");
        }
        return entity;
    }

    private LightAppTaskRecurringRuleEntity requireTaskRecurringRule(Long userId, Long ruleId) {
        LightAppTaskRecurringRuleEntity entity = taskRecurringRuleMapper.selectOne(new LambdaQueryWrapper<LightAppTaskRecurringRuleEntity>()
            .eq(LightAppTaskRecurringRuleEntity::getId, ruleId)
            .eq(LightAppTaskRecurringRuleEntity::getUserId, userId)
            .last("LIMIT 1"));
        if (entity == null) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "Task recurring rule not found");
        }
        return entity;
    }

    private LightAppScheduleRecurringRuleEntity requireScheduleRecurringRule(Long userId, Long ruleId) {
        LightAppScheduleRecurringRuleEntity entity = scheduleRecurringRuleMapper.selectOne(new LambdaQueryWrapper<LightAppScheduleRecurringRuleEntity>()
            .eq(LightAppScheduleRecurringRuleEntity::getId, ruleId)
            .eq(LightAppScheduleRecurringRuleEntity::getUserId, userId)
            .last("LIMIT 1"));
        if (entity == null) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "Schedule recurring rule not found");
        }
        return entity;
    }

    private List<LightAppBalanceAccountEntity> listBalanceAccountsEntities(Long userId) {
        return balanceAccountMapper.selectList(new LambdaQueryWrapper<LightAppBalanceAccountEntity>()
            .eq(LightAppBalanceAccountEntity::getUserId, userId)
            .orderByAsc(LightAppBalanceAccountEntity::getSortNum)
            .orderByDesc(LightAppBalanceAccountEntity::getUpdatedAt)
            .orderByDesc(LightAppBalanceAccountEntity::getId));
    }

    private List<LightAppBalanceRecurringChargeEntity> listRecurringCharges(Long userId) {
        return balanceRecurringChargeMapper.selectList(new LambdaQueryWrapper<LightAppBalanceRecurringChargeEntity>()
            .eq(LightAppBalanceRecurringChargeEntity::getUserId, userId)
            .orderByAsc(LightAppBalanceRecurringChargeEntity::getSortNum)
            .orderByDesc(LightAppBalanceRecurringChargeEntity::getUpdatedAt)
            .orderByDesc(LightAppBalanceRecurringChargeEntity::getId));
    }

    private void applyBalanceAccountUpsert(LightAppBalanceAccountEntity entity, LightAppBalanceAccountUpsertRequest request) {
        entity.setChannelCode(normalizeRequiredText(request.getChannelCode(), "channel_code").toLowerCase(Locale.ROOT));
        entity.setChannelName(normalizeRequiredText(request.getChannelName(), "channel_name"));
        entity.setAccountName(normalizeRequiredText(request.getAccountName(), "account_name"));
        entity.setCurrencyCode(normalizeCurrencyCode(request.getCurrencyCode(), BASE_CURRENCY_CNY));
        entity.setBalanceAmount(normalizeMoney(request.getBalanceAmount(), true, "balance_amount"));
    }

    private void applyBalanceTransactionUpsert(
        LightAppBalanceTransactionEntity entity,
        LightAppBalanceTransactionUpsertRequest request,
        Long userId,
        boolean applyAccountEffect
    ) {
        Long accountId = request.getAccountId();
        if (accountId != null && accountId <= 0) {
            accountId = null;
        }
        LightAppBalanceAccountEntity account = accountId == null ? null : requireBalanceAccount(userId, accountId);
        String currency = normalizeCurrencyCode(request.getCurrencyCode(), account == null ? BASE_CURRENCY_CNY : account.getCurrencyCode());
        if (account != null && !Objects.equals(account.getCurrencyCode(), currency)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Account currency does not match transaction currency");
        }

        String direction = normalizeDirection(request.getDirection());
        BigDecimal amount = normalizeMoney(request.getAmount(), false, "amount");
        LocalDateTime occurredAt = request.getOccurredAt();
        if (occurredAt == null) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "occurred_at is required");
        }

        entity.setUserId(userId);
        entity.setAccountId(accountId);
        entity.setDirectionCode(direction);
        entity.setAmount(amount);
        entity.setCurrencyCode(currency);
        entity.setCategory(normalizeOptionalText(request.getCategory()));
        entity.setNote(normalizeOptionalText(request.getNote()));
        entity.setOccurredAt(occurredAt);
        entity.setRecurringChargeId(null);
        entity.setRecurringInstanceAt(null);

        if (!applyAccountEffect || account == null) {
            return;
        }
        BigDecimal delta = DIRECTION_INCOME.equals(direction) ? amount : amount.negate();
        BigDecimal nextBalance = safeAmount(account.getBalanceAmount()).add(delta);
        if (nextBalance.compareTo(BigDecimal.ZERO) < 0) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Account balance is insufficient");
        }
        account.setBalanceAmount(nextBalance.setScale(4, RoundingMode.HALF_UP));
        balanceAccountMapper.updateById(account);
    }

    private void rollbackManualTransactionEffect(Long userId, LightAppBalanceTransactionEntity transaction) {
        if (transaction == null || transaction.getAccountId() == null) {
            return;
        }
        LightAppBalanceAccountEntity account = balanceAccountMapper.selectOne(new LambdaQueryWrapper<LightAppBalanceAccountEntity>()
            .eq(LightAppBalanceAccountEntity::getId, transaction.getAccountId())
            .eq(LightAppBalanceAccountEntity::getUserId, userId)
            .last("LIMIT 1"));
        if (account == null) {
            return;
        }
        BigDecimal amount = safeAmount(transaction.getAmount());
        BigDecimal delta = DIRECTION_INCOME.equals(normalizeDirection(transaction.getDirectionCode()))
            ? amount.negate()
            : amount;
        BigDecimal nextBalance = safeAmount(account.getBalanceAmount()).add(delta);
        if (nextBalance.compareTo(BigDecimal.ZERO) < 0) {
            nextBalance = BigDecimal.ZERO;
        }
        account.setBalanceAmount(nextBalance.setScale(4, RoundingMode.HALF_UP));
        balanceAccountMapper.updateById(account);
    }

    private void applyBalanceDebtUpsert(LightAppBalanceDebtEntity entity, LightAppBalanceDebtUpsertRequest request) {
        LocalDateTime occurredAt = request.getOccurredAt();
        if (occurredAt == null) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "occurred_at is required");
        }
        LocalDateTime dueAt = request.getDueAt();
        if (dueAt != null && dueAt.isBefore(occurredAt)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "due_at can not be before occurred_at");
        }

        entity.setTitle(normalizeRequiredText(request.getTitle(), "title"));
        entity.setCreditor(normalizeOptionalText(request.getCreditor()));
        entity.setAmount(normalizeMoney(request.getAmount(), false, "amount"));
        entity.setCurrencyCode(normalizeCurrencyCode(request.getCurrencyCode(), BASE_CURRENCY_CNY));
        entity.setOccurredAt(occurredAt);
        entity.setDueAt(dueAt);
        entity.setStatusCode(normalizeDebtStatus(request.getStatus()));
        entity.setNote(normalizeOptionalText(request.getNote()));
    }

    private void applyBalanceRecurringChargeUpsert(
        LightAppBalanceRecurringChargeEntity entity,
        LightAppBalanceRecurringChargeUpsertRequest request,
        Long userId
    ) {
        Long accountId = request.getAccountId();
        if (accountId != null && accountId <= 0) {
            accountId = null;
        }
        LightAppBalanceAccountEntity account = accountId == null ? null : requireBalanceAccount(userId, accountId);
        String currency = normalizeCurrencyCode(request.getCurrencyCode(), account == null ? BASE_CURRENCY_CNY : account.getCurrencyCode());
        if (account != null && !Objects.equals(account.getCurrencyCode(), currency)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Account currency does not match recurring charge currency");
        }

        LocalDateTime startAt = request.getStartAt();
        LocalDateTime endAt = request.getEndAt();
        if (startAt != null && endAt != null && endAt.isBefore(startAt)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "end_at can not be before start_at");
        }

        entity.setUserId(userId);
        entity.setAccountId(accountId);
        entity.setTitle(normalizeRequiredText(request.getTitle(), "title"));
        entity.setAmount(normalizeMoney(request.getAmount(), false, "amount"));
        entity.setCurrencyCode(currency);
        entity.setCategory(normalizeOptionalText(request.getCategory()));
        entity.setNote(normalizeOptionalText(request.getNote()));
        entity.setCronExpr(normalizeCronExpr(request.getCronExpr()));
        entity.setTimeZoneId(normalizeTimeZoneId(request.getTimeZoneId()));
        entity.setStartAt(startAt);
        entity.setEndAt(endAt);
        entity.setEnabled(request.getEnabled() == null || Boolean.TRUE.equals(request.getEnabled()));
    }

    private void applyTodoRecurringRuleUpsert(
        LightAppTodoRecurringRuleEntity entity,
        LightAppTodoRecurringRuleUpsertRequest request,
        Long userId
    ) {
        LocalDateTime startAt = request.getStartAt();
        LocalDateTime endAt = request.getEndAt();
        if (startAt != null && endAt != null && endAt.isBefore(startAt)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "end_at can not be before start_at");
        }

        entity.setUserId(userId);
        entity.setProjectId(normalizeProjectId(userId, request.getProjectId()));
        entity.setTitle(normalizeRequiredText(request.getTitle(), "title"));
        entity.setDetail(normalizeOptionalText(request.getDetail()));
        entity.setPriorityCode(normalizePriority(request.getPriority()));
        entity.setCronExpr(normalizeCronExpr(request.getCronExpr()));
        entity.setTimeZoneId(normalizeTimeZoneId(request.getTimeZoneId()));
        entity.setStartAt(startAt);
        entity.setEndAt(endAt);
        entity.setEnabled(request.getEnabled() == null || Boolean.TRUE.equals(request.getEnabled()));
    }

    private void applyTaskRecurringRuleUpsert(
        LightAppTaskRecurringRuleEntity entity,
        LightAppTaskRecurringRuleUpsertRequest request,
        Long userId
    ) {
        LocalDateTime startAt = request.getStartAt();
        LocalDateTime endAt = request.getEndAt();
        if (startAt != null && endAt != null && endAt.isBefore(startAt)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "end_at can not be before start_at");
        }

        entity.setUserId(userId);
        entity.setProjectId(normalizeProjectId(userId, request.getProjectId()));
        entity.setColumnCode(resolveColumnCode(userId, request.getColumnCode(), true));
        entity.setTitle(normalizeRequiredText(request.getTitle(), "title"));
        entity.setDetail(normalizeOptionalText(request.getDetail()));
        entity.setCronExpr(normalizeCronExpr(request.getCronExpr()));
        entity.setTimeZoneId(normalizeTimeZoneId(request.getTimeZoneId()));
        entity.setStartAt(startAt);
        entity.setEndAt(endAt);
        entity.setEnabled(request.getEnabled() == null || Boolean.TRUE.equals(request.getEnabled()));
    }

    private void applyScheduleRecurringRuleUpsert(
        LightAppScheduleRecurringRuleEntity entity,
        LightAppScheduleRecurringRuleUpsertRequest request,
        Long userId
    ) {
        LocalDateTime startAt = request.getStartAt();
        LocalDateTime endAt = request.getEndAt();
        if (startAt != null && endAt != null && endAt.isBefore(startAt)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "end_at can not be before start_at");
        }

        Integer durationMinutes = request.getDurationMinutes();
        if (durationMinutes == null) {
            durationMinutes = 60;
        }
        if (durationMinutes < 1 || durationMinutes > 1440) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "duration_minutes out of range");
        }

        entity.setUserId(userId);
        entity.setProjectId(normalizeProjectId(userId, request.getProjectId()));
        entity.setTitle(normalizeRequiredText(request.getTitle(), "title"));
        entity.setDetail(normalizeOptionalText(request.getDetail()));
        entity.setDurationMinutes(durationMinutes);
        entity.setAllDay(Boolean.TRUE.equals(request.getAllDay()));
        entity.setLocation(normalizeOptionalText(request.getLocation()));
        entity.setStatusCode(normalizeScheduleStatus(request.getStatus()));
        entity.setCronExpr(normalizeCronExpr(request.getCronExpr()));
        entity.setTimeZoneId(normalizeTimeZoneId(request.getTimeZoneId()));
        entity.setStartAt(startAt);
        entity.setEndAt(endAt);
        entity.setEnabled(request.getEnabled() == null || Boolean.TRUE.equals(request.getEnabled()));
    }

    private void materializeTodoRecurringInstances(Long userId) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime windowEnd = now.plusDays(FUTURE_MATERIALIZE_DAYS);
        List<LightAppTodoRecurringRuleEntity> rules = todoRecurringRuleMapper.selectList(new LambdaQueryWrapper<LightAppTodoRecurringRuleEntity>()
            .eq(LightAppTodoRecurringRuleEntity::getUserId, userId)
            .eq(LightAppTodoRecurringRuleEntity::getEnabled, true)
            .orderByAsc(LightAppTodoRecurringRuleEntity::getSortNum)
            .orderByAsc(LightAppTodoRecurringRuleEntity::getId));
        for (LightAppTodoRecurringRuleEntity rule : rules) {
            List<LocalDateTime> triggers = computeRecurringTriggers(
                rule.getCronExpr(),
                rule.getTimeZoneId(),
                now,
                windowEnd,
                rule.getStartAt(),
                rule.getEndAt()
            );
            for (LocalDateTime triggerAt : triggers) {
                LightAppTodoEntity existing = todoMapper.selectOne(new LambdaQueryWrapper<LightAppTodoEntity>()
                    .eq(LightAppTodoEntity::getUserId, userId)
                    .eq(LightAppTodoEntity::getRecurringRuleId, rule.getId())
                    .eq(LightAppTodoEntity::getRecurringInstanceAt, triggerAt)
                    .last("LIMIT 1"));
                if (existing != null) {
                    continue;
                }
                LightAppTodoEntity created = new LightAppTodoEntity();
                created.setUserId(userId);
                created.setProjectId(rule.getProjectId());
                created.setRecurringRuleId(rule.getId());
                created.setTitle(rule.getTitle());
                created.setDetail(rule.getDetail());
                created.setPriorityCode(normalizePriority(rule.getPriorityCode()));
                created.setDone(false);
                created.setDueAt(triggerAt);
                created.setRecurringInstanceAt(triggerAt);
                created.setSortNum(resolveSortNum(null, todoMapper.selectMaxSortNumByUserId(userId)));
                todoMapper.insert(created);
            }
        }
    }

    private void materializeTaskRecurringInstances(Long userId) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime windowEnd = now.plusDays(FUTURE_MATERIALIZE_DAYS);
        List<LightAppTaskRecurringRuleEntity> rules = taskRecurringRuleMapper.selectList(new LambdaQueryWrapper<LightAppTaskRecurringRuleEntity>()
            .eq(LightAppTaskRecurringRuleEntity::getUserId, userId)
            .eq(LightAppTaskRecurringRuleEntity::getEnabled, true)
            .orderByAsc(LightAppTaskRecurringRuleEntity::getSortNum)
            .orderByAsc(LightAppTaskRecurringRuleEntity::getId));
        for (LightAppTaskRecurringRuleEntity rule : rules) {
            List<LocalDateTime> triggers = computeRecurringTriggers(
                rule.getCronExpr(),
                rule.getTimeZoneId(),
                now,
                windowEnd,
                rule.getStartAt(),
                rule.getEndAt()
            );
            for (LocalDateTime triggerAt : triggers) {
                LightAppTaskEntity existing = taskMapper.selectOne(new LambdaQueryWrapper<LightAppTaskEntity>()
                    .eq(LightAppTaskEntity::getUserId, userId)
                    .eq(LightAppTaskEntity::getRecurringRuleId, rule.getId())
                    .eq(LightAppTaskEntity::getRecurringInstanceAt, triggerAt)
                    .last("LIMIT 1"));
                if (existing != null) {
                    continue;
                }
                LightAppTaskEntity created = new LightAppTaskEntity();
                created.setUserId(userId);
                created.setProjectId(rule.getProjectId());
                created.setRecurringRuleId(rule.getId());
                created.setColumnCode(resolveColumnCode(userId, rule.getColumnCode(), false));
                created.setTitle(rule.getTitle());
                created.setDetail(rule.getDetail());
                created.setDueAt(triggerAt);
                created.setRecurringInstanceAt(triggerAt);
                created.setSortNum(resolveSortNum(null, taskMapper.selectMaxSortNumByUserId(userId)));
                taskMapper.insert(created);
            }
        }
    }

    private void materializeScheduleRecurringInstances(Long userId) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime windowEnd = now.plusDays(FUTURE_MATERIALIZE_DAYS);
        List<LightAppScheduleRecurringRuleEntity> rules = scheduleRecurringRuleMapper.selectList(new LambdaQueryWrapper<LightAppScheduleRecurringRuleEntity>()
            .eq(LightAppScheduleRecurringRuleEntity::getUserId, userId)
            .eq(LightAppScheduleRecurringRuleEntity::getEnabled, true)
            .orderByAsc(LightAppScheduleRecurringRuleEntity::getSortNum)
            .orderByAsc(LightAppScheduleRecurringRuleEntity::getId));
        for (LightAppScheduleRecurringRuleEntity rule : rules) {
            List<LocalDateTime> triggers = computeRecurringTriggers(
                rule.getCronExpr(),
                rule.getTimeZoneId(),
                now,
                windowEnd,
                rule.getStartAt(),
                rule.getEndAt()
            );
            for (LocalDateTime triggerAt : triggers) {
                LightAppScheduleEventEntity existing = scheduleEventMapper.selectOne(new LambdaQueryWrapper<LightAppScheduleEventEntity>()
                    .eq(LightAppScheduleEventEntity::getUserId, userId)
                    .eq(LightAppScheduleEventEntity::getRecurringRuleId, rule.getId())
                    .eq(LightAppScheduleEventEntity::getRecurringInstanceAt, triggerAt)
                    .last("LIMIT 1"));
                if (existing != null) {
                    continue;
                }
                int durationMinutes = rule.getDurationMinutes() == null ? 60 : Math.max(1, rule.getDurationMinutes());
                LightAppScheduleEventEntity created = new LightAppScheduleEventEntity();
                created.setUserId(userId);
                created.setProjectId(rule.getProjectId());
                created.setRecurringRuleId(rule.getId());
                created.setTitle(rule.getTitle());
                created.setDetail(rule.getDetail());
                created.setStartAt(triggerAt);
                created.setEndAt(triggerAt.plusMinutes(durationMinutes));
                created.setRecurringInstanceAt(triggerAt);
                created.setAllDay(Boolean.TRUE.equals(rule.getAllDay()));
                created.setLocation(rule.getLocation());
                created.setStatusCode(normalizeScheduleStatus(rule.getStatusCode()));
                created.setSortNum(resolveSortNum(null, scheduleEventMapper.selectMaxSortNumByUserId(userId)));
                scheduleEventMapper.insert(created);
            }
        }
    }

    private void applyRecurringChargesForUser(Long userId) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime catchupStart = now.minusDays(BALANCE_CATCHUP_DAYS);
        List<LightAppBalanceRecurringChargeEntity> rules = listRecurringCharges(userId);
        for (LightAppBalanceRecurringChargeEntity rule : rules) {
            if (!Boolean.TRUE.equals(rule.getEnabled())) {
                continue;
            }
            LocalDateTime effectiveStart = catchupStart;
            if (rule.getLastTriggerAt() != null) {
                LocalDateTime nextStart = rule.getLastTriggerAt().plusSeconds(1);
                if (nextStart.isAfter(effectiveStart)) {
                    effectiveStart = nextStart;
                }
            }
            List<LocalDateTime> triggers = computeRecurringTriggers(
                rule.getCronExpr(),
                rule.getTimeZoneId(),
                effectiveStart,
                now,
                rule.getStartAt(),
                rule.getEndAt()
            );
            LocalDateTime lastApplied = rule.getLastTriggerAt();
            for (LocalDateTime triggerAt : triggers) {
                LightAppBalanceTransactionEntity existing = balanceTransactionMapper.selectOne(new LambdaQueryWrapper<LightAppBalanceTransactionEntity>()
                    .eq(LightAppBalanceTransactionEntity::getUserId, userId)
                    .eq(LightAppBalanceTransactionEntity::getRecurringChargeId, rule.getId())
                    .eq(LightAppBalanceTransactionEntity::getRecurringInstanceAt, triggerAt)
                    .last("LIMIT 1"));
                if (existing != null) {
                    if (lastApplied == null || triggerAt.isAfter(lastApplied)) {
                        lastApplied = triggerAt;
                    }
                    continue;
                }

                LightAppBalanceTransactionEntity transaction = new LightAppBalanceTransactionEntity();
                transaction.setUserId(userId);
                transaction.setAccountId(rule.getAccountId());
                transaction.setDirectionCode(DIRECTION_EXPENSE);
                transaction.setAmount(rule.getAmount());
                transaction.setCurrencyCode(rule.getCurrencyCode());
                transaction.setCategory(rule.getCategory());
                transaction.setNote(rule.getNote());
                transaction.setOccurredAt(triggerAt);
                transaction.setRecurringChargeId(rule.getId());
                transaction.setRecurringInstanceAt(triggerAt);
                transaction.setSortNum(resolveSortNum(null, balanceTransactionMapper.selectMaxSortNumByUserId(userId)));
                balanceTransactionMapper.insert(transaction);

                applyRecurringChargeAccounting(userId, rule, transaction, triggerAt);
                if (lastApplied == null || triggerAt.isAfter(lastApplied)) {
                    lastApplied = triggerAt;
                }
            }
            if (!Objects.equals(lastApplied, rule.getLastTriggerAt())) {
                rule.setLastTriggerAt(lastApplied);
                balanceRecurringChargeMapper.updateById(rule);
            }
        }
    }

    private void applyRecurringChargeAccounting(
        Long userId,
        LightAppBalanceRecurringChargeEntity rule,
        LightAppBalanceTransactionEntity transaction,
        LocalDateTime triggerAt
    ) {
        Long accountId = transaction.getAccountId();
        if (accountId == null) {
            return;
        }
        LightAppBalanceAccountEntity account = balanceAccountMapper.selectOne(new LambdaQueryWrapper<LightAppBalanceAccountEntity>()
            .eq(LightAppBalanceAccountEntity::getId, accountId)
            .eq(LightAppBalanceAccountEntity::getUserId, userId)
            .last("LIMIT 1"));
        if (account == null) {
            return;
        }
        BigDecimal available = safeAmount(account.getBalanceAmount());
        if (available.compareTo(BigDecimal.ZERO) < 0) {
            available = BigDecimal.ZERO;
        }
        BigDecimal amount = safeAmount(transaction.getAmount());
        BigDecimal deducted = available.min(amount);
        BigDecimal remaining = amount.subtract(deducted);
        BigDecimal nextBalance = available.subtract(deducted);
        account.setBalanceAmount(nextBalance.setScale(4, RoundingMode.HALF_UP));
        balanceAccountMapper.updateById(account);

        if (remaining.compareTo(BigDecimal.ZERO) <= 0) {
            return;
        }
        LightAppBalanceDebtEntity debt = new LightAppBalanceDebtEntity();
        debt.setUserId(userId);
        debt.setTitle(rule.getTitle() + " (shortfall)");
        debt.setCreditor(account.getChannelName());
        debt.setAmount(remaining.setScale(4, RoundingMode.HALF_UP));
        debt.setCurrencyCode(transaction.getCurrencyCode());
        debt.setOccurredAt(triggerAt);
        debt.setDueAt(null);
        debt.setStatusCode(DEBT_STATUS_OPEN);
        debt.setNote("Auto-created by recurring charge shortfall");
        debt.setLinkedTransactionId(transaction.getId());
        debt.setSortNum(resolveSortNum(null, balanceDebtMapper.selectMaxSortNumByUserId(userId)));
        balanceDebtMapper.insert(debt);
    }

    private List<LightAppFxRateResponse> ensureFxRates(String baseCurrency, boolean forceRefresh) {
        String normalizedBase = normalizeCurrencyCode(baseCurrency, BASE_CURRENCY_CNY);
        List<LightAppFxRateEntity> cached = fxRateMapper.selectList(new LambdaQueryWrapper<LightAppFxRateEntity>()
            .eq(LightAppFxRateEntity::getBaseCurrencyCode, normalizedBase)
            .orderByDesc(LightAppFxRateEntity::getRateAt)
            .orderByAsc(LightAppFxRateEntity::getQuoteCurrencyCode)
            .orderByAsc(LightAppFxRateEntity::getId));

        boolean cacheUsable = !cached.isEmpty() && cached.stream()
            .map(LightAppFxRateEntity::getRateAt)
            .filter(Objects::nonNull)
            .max(LocalDateTime::compareTo)
            .map(last -> last.isAfter(LocalDateTime.now().minusHours(FX_STALE_HOURS)))
            .orElse(false);

        if (!forceRefresh && cacheUsable) {
            return cached.stream().map(this::toFxRateResponse).toList();
        }

        List<LightAppFxRateResponse> fetched = fetchFxRatesFromProvider(normalizedBase);
        if (!fetched.isEmpty()) {
            for (LightAppFxRateResponse item : fetched) {
                LightAppFxRateEntity existing = fxRateMapper.selectOne(new LambdaQueryWrapper<LightAppFxRateEntity>()
                    .eq(LightAppFxRateEntity::getBaseCurrencyCode, item.baseCurrency())
                    .eq(LightAppFxRateEntity::getQuoteCurrencyCode, item.quoteCurrency())
                    .last("LIMIT 1"));
                if (existing == null) {
                    LightAppFxRateEntity created = new LightAppFxRateEntity();
                    created.setBaseCurrencyCode(item.baseCurrency());
                    created.setQuoteCurrencyCode(item.quoteCurrency());
                    created.setRateValue(item.rate());
                    created.setProviderCode(item.provider());
                    created.setRateAt(item.updatedAt());
                    fxRateMapper.insert(created);
                } else {
                    existing.setRateValue(item.rate());
                    existing.setProviderCode(item.provider());
                    existing.setRateAt(item.updatedAt());
                    fxRateMapper.updateById(existing);
                }
            }
            cached = fxRateMapper.selectList(new LambdaQueryWrapper<LightAppFxRateEntity>()
                .eq(LightAppFxRateEntity::getBaseCurrencyCode, normalizedBase)
                .orderByAsc(LightAppFxRateEntity::getQuoteCurrencyCode)
                .orderByAsc(LightAppFxRateEntity::getId));
            return cached.stream().map(this::toFxRateResponse).toList();
        }

        if (!cached.isEmpty()) {
            return cached.stream().map(this::toFxRateResponse).toList();
        }
        return List.of(new LightAppFxRateResponse(
            normalizedBase,
            normalizedBase,
            BigDecimal.ONE.setScale(FX_SCALE, RoundingMode.HALF_UP),
            FX_PROVIDER_CODE,
            LocalDateTime.now()
        ));
    }

    private List<LightAppFxRateResponse> fetchFxRatesFromProvider(String baseCurrency) {
        try {
            @SuppressWarnings("unchecked")
            Map<String, Object> payload = restClient.get()
                .uri(FX_PROVIDER_URL_TEMPLATE, baseCurrency)
                .retrieve()
                .body(Map.class);
            if (payload == null) {
                return List.of();
            }
            Object ratesObject = payload.get("rates");
            if (!(ratesObject instanceof Map<?, ?> ratesMap)) {
                return List.of();
            }
            LocalDateTime now = LocalDateTime.now();
            List<LightAppFxRateResponse> responses = new ArrayList<>();
            for (Map.Entry<?, ?> entry : ratesMap.entrySet()) {
                String quoteCurrency = normalizeCurrencyCode(String.valueOf(entry.getKey()), null);
                if (!StringUtils.hasText(quoteCurrency)) {
                    continue;
                }
                BigDecimal rate = toBigDecimal(entry.getValue());
                if (rate == null || rate.compareTo(BigDecimal.ZERO) <= 0) {
                    continue;
                }
                responses.add(new LightAppFxRateResponse(
                    baseCurrency,
                    quoteCurrency,
                    rate.setScale(FX_SCALE, RoundingMode.HALF_UP),
                    FX_PROVIDER_CODE,
                    now
                ));
            }
            boolean hasBase = responses.stream().anyMatch(item -> Objects.equals(item.quoteCurrency(), baseCurrency));
            if (!hasBase) {
                responses.add(new LightAppFxRateResponse(
                    baseCurrency,
                    baseCurrency,
                    BigDecimal.ONE.setScale(FX_SCALE, RoundingMode.HALF_UP),
                    FX_PROVIDER_CODE,
                    now
                ));
            }
            return responses;
        } catch (Exception ignored) {
            return List.of();
        }
    }

    private Map<String, BigDecimal> toRateMap(List<LightAppFxRateResponse> rates) {
        Map<String, BigDecimal> result = new LinkedHashMap<>();
        for (LightAppFxRateResponse item : rates) {
            if (item == null || !StringUtils.hasText(item.quoteCurrency())) {
                continue;
            }
            if (item.rate() == null || item.rate().compareTo(BigDecimal.ZERO) <= 0) {
                continue;
            }
            result.put(item.quoteCurrency(), item.rate());
        }
        if (!rates.isEmpty() && StringUtils.hasText(rates.get(0).baseCurrency())) {
            result.putIfAbsent(rates.get(0).baseCurrency(), BigDecimal.ONE.setScale(FX_SCALE, RoundingMode.HALF_UP));
        }
        return result;
    }

    private BigDecimal convertToBase(
        BigDecimal amount,
        String currencyCode,
        String baseCurrency,
        Map<String, BigDecimal> rates
    ) {
        BigDecimal normalizedAmount = safeAmount(amount);
        String sourceCurrency = normalizeCurrencyCode(currencyCode, baseCurrency);
        if (Objects.equals(sourceCurrency, baseCurrency)) {
            return normalizedAmount;
        }
        BigDecimal sourceRate = rates.get(sourceCurrency);
        if (sourceRate == null || sourceRate.compareTo(BigDecimal.ZERO) <= 0) {
            return normalizedAmount;
        }
        return normalizedAmount.divide(sourceRate, FX_SCALE, RoundingMode.HALF_UP);
    }

    private List<LocalDateTime> computeRecurringTriggers(
        String cronExpr,
        String timeZoneId,
        LocalDateTime windowStart,
        LocalDateTime windowEnd,
        LocalDateTime startAt,
        LocalDateTime endAt
    ) {
        if (windowStart == null || windowEnd == null || windowEnd.isBefore(windowStart)) {
            return List.of();
        }
        LocalDateTime effectiveStart = windowStart;
        if (startAt != null && startAt.isAfter(effectiveStart)) {
            effectiveStart = startAt;
        }
        LocalDateTime effectiveEnd = windowEnd;
        if (endAt != null && endAt.isBefore(effectiveEnd)) {
            effectiveEnd = endAt;
        }
        if (effectiveEnd.isBefore(effectiveStart)) {
            return List.of();
        }

        String normalizedZoneId = normalizeTimeZoneId(timeZoneId);
        CronExpression cron = parseCronExpression(cronExpr);
        ZonedDateTime cursor = effectiveStart.minusSeconds(1).atZone(ZoneId.of(normalizedZoneId));
        List<LocalDateTime> result = new ArrayList<>();
        for (int i = 0; i < MAX_RECURRING_OCCURRENCES_PER_PASS; i++) {
            ZonedDateTime next = cron.next(cursor);
            if (next == null) {
                break;
            }
            LocalDateTime triggerAt = next.toLocalDateTime();
            if (triggerAt.isAfter(effectiveEnd)) {
                break;
            }
            result.add(triggerAt);
            cursor = next;
        }
        return result;
    }

    private CronExpression parseCronExpression(String cronExpr) {
        try {
            return CronExpression.parse(normalizeRequiredText(cronExpr, "cron_expr"));
        } catch (IllegalArgumentException ex) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Invalid cron_expr");
        }
    }

    private String normalizeCronExpr(String cronExpr) {
        String normalized = normalizeRequiredText(cronExpr, "cron_expr");
        parseCronExpression(normalized);
        return normalized;
    }

    private String normalizeTimeZoneId(String rawTimeZoneId) {
        String candidate = normalizeOptionalText(rawTimeZoneId);
        if (!StringUtils.hasText(candidate)) {
            return DEFAULT_TIME_ZONE;
        }
        try {
            return ZoneId.of(candidate).getId();
        } catch (DateTimeException ex) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Invalid time_zone_id");
        }
    }

    private String normalizeCurrencyCode(String rawCurrencyCode, String fallbackCurrencyCode) {
        String normalized = String.valueOf(rawCurrencyCode == null ? "" : rawCurrencyCode).trim().toUpperCase(Locale.ROOT);
        if (!StringUtils.hasText(normalized)) {
            normalized = String.valueOf(fallbackCurrencyCode == null ? "" : fallbackCurrencyCode).trim().toUpperCase(Locale.ROOT);
        }
        if (!StringUtils.hasText(normalized)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "currency_code is required");
        }
        if (normalized.length() > 16) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "currency_code is too long");
        }
        return normalized;
    }

    private String normalizeDirection(String rawDirection) {
        String normalized = String.valueOf(rawDirection == null ? "" : rawDirection).trim().toUpperCase(Locale.ROOT);
        if (DIRECTION_INCOME.equals(normalized) || DIRECTION_EXPENSE.equals(normalized)) {
            return normalized;
        }
        throw new BusinessException(ErrorCode.BAD_REQUEST, "direction must be INCOME or EXPENSE");
    }

    private String normalizeDebtStatus(String rawStatus) {
        String normalized = String.valueOf(rawStatus == null ? "" : rawStatus).trim().toUpperCase(Locale.ROOT);
        if (!StringUtils.hasText(normalized)) {
            return DEBT_STATUS_OPEN;
        }
        if (DEBT_STATUS_OPEN.equals(normalized) || DEBT_STATUS_CLOSED.equals(normalized)) {
            return normalized;
        }
        throw new BusinessException(ErrorCode.BAD_REQUEST, "status must be OPEN or CLOSED");
    }

    private BigDecimal normalizeMoney(BigDecimal amount, boolean allowZero, String fieldName) {
        if (amount == null) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, fieldName + " is required");
        }
        BigDecimal normalized = amount.setScale(4, RoundingMode.HALF_UP);
        int compareZero = normalized.compareTo(BigDecimal.ZERO);
        if (allowZero ? compareZero < 0 : compareZero <= 0) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, fieldName + " must be " + (allowZero ? ">= 0" : "> 0"));
        }
        return normalized;
    }

    private BigDecimal safeAmount(BigDecimal amount) {
        if (amount == null) {
            return BigDecimal.ZERO.setScale(4, RoundingMode.HALF_UP);
        }
        return amount.setScale(4, RoundingMode.HALF_UP);
    }

    private BigDecimal toBigDecimal(Object rawValue) {
        if (rawValue == null) {
            return null;
        }
        if (rawValue instanceof BigDecimal value) {
            return value;
        }
        if (rawValue instanceof Number value) {
            return BigDecimal.valueOf(value.doubleValue());
        }
        try {
            return new BigDecimal(String.valueOf(rawValue));
        } catch (NumberFormatException ex) {
            return null;
        }
    }

    private LightAppFxRateResponse toFxRateResponse(LightAppFxRateEntity entity) {
        return new LightAppFxRateResponse(
            entity.getBaseCurrencyCode(),
            entity.getQuoteCurrencyCode(),
            entity.getRateValue(),
            entity.getProviderCode(),
            entity.getRateAt()
        );
    }

    private LightAppBalanceAccountResponse toBalanceAccountResponse(LightAppBalanceAccountEntity entity) {
        return new LightAppBalanceAccountResponse(
            entity.getId(),
            entity.getChannelCode(),
            entity.getChannelName(),
            entity.getAccountName(),
            entity.getCurrencyCode(),
            safeAmount(entity.getBalanceAmount()),
            entity.getSortNum() == null ? 0 : entity.getSortNum(),
            entity.getUpdatedAt()
        );
    }

    private LightAppBalanceTransactionResponse toBalanceTransactionResponse(LightAppBalanceTransactionEntity entity) {
        return new LightAppBalanceTransactionResponse(
            entity.getId(),
            entity.getAccountId(),
            normalizeDirection(entity.getDirectionCode()),
            safeAmount(entity.getAmount()),
            entity.getCurrencyCode(),
            entity.getCategory(),
            entity.getNote(),
            entity.getOccurredAt(),
            entity.getSortNum() == null ? 0 : entity.getSortNum(),
            entity.getUpdatedAt()
        );
    }

    private LightAppBalanceDebtResponse toBalanceDebtResponse(LightAppBalanceDebtEntity entity) {
        return new LightAppBalanceDebtResponse(
            entity.getId(),
            entity.getTitle(),
            entity.getCreditor(),
            safeAmount(entity.getAmount()),
            entity.getCurrencyCode(),
            entity.getOccurredAt(),
            entity.getDueAt(),
            normalizeDebtStatus(entity.getStatusCode()),
            entity.getNote(),
            entity.getSortNum() == null ? 0 : entity.getSortNum(),
            entity.getUpdatedAt()
        );
    }

    private LightAppBalanceRecurringChargeResponse toBalanceRecurringChargeResponse(LightAppBalanceRecurringChargeEntity entity) {
        return new LightAppBalanceRecurringChargeResponse(
            entity.getId(),
            entity.getAccountId(),
            entity.getTitle(),
            safeAmount(entity.getAmount()),
            entity.getCurrencyCode(),
            entity.getCategory(),
            entity.getNote(),
            entity.getCronExpr(),
            normalizeTimeZoneId(entity.getTimeZoneId()),
            entity.getStartAt(),
            entity.getEndAt(),
            entity.getLastTriggerAt(),
            Boolean.TRUE.equals(entity.getEnabled()),
            entity.getSortNum() == null ? 0 : entity.getSortNum(),
            entity.getUpdatedAt()
        );
    }

    private LightAppTodoRecurringRuleResponse toTodoRecurringRuleResponse(LightAppTodoRecurringRuleEntity entity) {
        return new LightAppTodoRecurringRuleResponse(
            entity.getId(),
            entity.getProjectId(),
            entity.getTitle(),
            entity.getDetail(),
            normalizePriority(entity.getPriorityCode()),
            entity.getCronExpr(),
            normalizeTimeZoneId(entity.getTimeZoneId()),
            entity.getStartAt(),
            entity.getEndAt(),
            Boolean.TRUE.equals(entity.getEnabled()),
            entity.getSortNum() == null ? 0 : entity.getSortNum(),
            entity.getUpdatedAt()
        );
    }

    private LightAppTaskRecurringRuleResponse toTaskRecurringRuleResponse(LightAppTaskRecurringRuleEntity entity) {
        return new LightAppTaskRecurringRuleResponse(
            entity.getId(),
            entity.getProjectId(),
            entity.getColumnCode(),
            entity.getTitle(),
            entity.getDetail(),
            entity.getCronExpr(),
            normalizeTimeZoneId(entity.getTimeZoneId()),
            entity.getStartAt(),
            entity.getEndAt(),
            Boolean.TRUE.equals(entity.getEnabled()),
            entity.getSortNum() == null ? 0 : entity.getSortNum(),
            entity.getUpdatedAt()
        );
    }

    private LightAppScheduleRecurringRuleResponse toScheduleRecurringRuleResponse(LightAppScheduleRecurringRuleEntity entity) {
        return new LightAppScheduleRecurringRuleResponse(
            entity.getId(),
            entity.getProjectId(),
            entity.getTitle(),
            entity.getDetail(),
            entity.getDurationMinutes() == null ? 60 : entity.getDurationMinutes(),
            Boolean.TRUE.equals(entity.getAllDay()),
            entity.getLocation(),
            normalizeScheduleStatus(entity.getStatusCode()),
            entity.getCronExpr(),
            normalizeTimeZoneId(entity.getTimeZoneId()),
            entity.getStartAt(),
            entity.getEndAt(),
            Boolean.TRUE.equals(entity.getEnabled()),
            entity.getSortNum() == null ? 0 : entity.getSortNum(),
            entity.getUpdatedAt()
        );
    }

    private LightAppPomodoroResponse toPomodoroResponse(LightAppPomodoroTemplateEntity entity) {
        String ringtoneType = RINGTONE_TYPE_UPLOAD.equalsIgnoreCase(String.valueOf(entity.getRingtoneTypeCode()))
            ? RINGTONE_TYPE_UPLOAD
            : RINGTONE_TYPE_BUILTIN;
        return new LightAppPomodoroResponse(
            entity.getId(),
            entity.getTitle(),
            entity.getFocusMinutes() == null ? 25 : entity.getFocusMinutes(),
            entity.getShortBreakMinutes() == null ? 5 : entity.getShortBreakMinutes(),
            entity.getLongBreakMinutes() == null ? 15 : entity.getLongBreakMinutes(),
            entity.getLongBreakEvery() == null ? 4 : entity.getLongBreakEvery(),
            Boolean.TRUE.equals(entity.getAutoStartNext()),
            ringtoneType,
            entity.getRingtoneName(),
            entity.getRingtoneCode(),
            entity.getRingtoneAssetId(),
            entity.getSortNum() == null ? 0 : entity.getSortNum(),
            entity.getUpdatedAt()
        );
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
