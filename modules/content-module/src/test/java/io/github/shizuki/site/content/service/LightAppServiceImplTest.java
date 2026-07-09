package io.github.shizuki.site.content.service;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.common.security.context.LoginUserContext;
import io.github.shizuki.common.security.model.LoginUser;
import io.github.shizuki.site.content.entity.LightAppBalanceAccountEntity;
import io.github.shizuki.site.content.entity.LightAppBalanceDebtEntity;
import io.github.shizuki.site.content.entity.LightAppBalanceRecurringChargeEntity;
import io.github.shizuki.site.content.entity.LightAppTaskColumnEntity;
import io.github.shizuki.site.content.response.LightAppBalanceAnalyticsResponse;
import io.github.shizuki.site.content.response.LightAppTaskColumnResponse;
import io.github.shizuki.site.content.request.LightAppBalanceAccountUpsertRequest;
import io.github.shizuki.site.content.request.LightAppBalanceTransactionUpsertRequest;
import io.github.shizuki.site.content.request.LightAppPomodoroUpsertRequest;
import io.github.shizuki.site.content.request.LightAppTaskColumnsUpdateRequest;
import io.github.shizuki.site.content.request.LightAppTodoReorderRequest;
import io.github.shizuki.site.content.support.LightAppTaskNotionProperties;
import io.github.shizuki.site.content.support.LightAppTaskNotionSyncService;
import io.github.shizuki.site.content.entity.LightAppBalanceTransactionEntity;
import io.github.shizuki.site.content.entity.LightAppFxRateEntity;
import io.github.shizuki.site.content.entity.LightAppTodoEntity;
import java.math.BigDecimal;
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
import io.github.shizuki.site.content.mapper.LightAppUrlLinkMapper;
import io.github.shizuki.site.content.mapper.LightAppWhiteboardMapper;
import io.github.shizuki.site.content.service.impl.LightAppServiceImpl;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.util.ReflectionTestUtils;
import org.springframework.web.client.RestClient;

@ExtendWith(MockitoExtension.class)
class LightAppServiceImplTest {

    @Mock
    private LightAppBalanceAccountMapper balanceAccountMapper;

    @Mock
    private LightAppBalanceTransactionMapper balanceTransactionMapper;

    @Mock
    private LightAppBalanceDebtMapper balanceDebtMapper;

    @Mock
    private LightAppBalanceRecurringChargeMapper balanceRecurringChargeMapper;

    @Mock
    private LightAppFxRateMapper fxRateMapper;

    @Mock
    private LightAppPomodoroTemplateMapper pomodoroTemplateMapper;

    @Mock
    private LightAppProjectMapper projectMapper;

    @Mock
    private LightAppTodoMapper todoMapper;

    @Mock
    private LightAppTodoRecurringRuleMapper todoRecurringRuleMapper;

    @Mock
    private LightAppTaskMapper taskMapper;

    @Mock
    private LightAppTaskRecurringRuleMapper taskRecurringRuleMapper;

    @Mock
    private LightAppTaskColumnMapper taskColumnMapper;

    @Mock
    private LightAppScheduleEventMapper scheduleEventMapper;

    @Mock
    private LightAppScheduleRecurringRuleMapper scheduleRecurringRuleMapper;

    @Mock
    private LightAppUrlLinkMapper urlLinkMapper;

    @Mock
    private LightAppWhiteboardMapper whiteboardMapper;

    @Mock
    private RestClient.Builder restClientBuilder;

    @Mock
    private RestClient restClient;

    @Mock
    private LightAppTaskNotionProperties taskNotionProperties;

    @Mock
    private LightAppTaskNotionSyncService taskNotionSyncService;

    @Mock
    private Executor notionSyncExecutor;

    @InjectMocks
    private LightAppServiceImpl lightAppService;

    @BeforeEach
    void setUp() {
        Mockito.lenient().when(restClientBuilder.build()).thenReturn(restClient);
    }

    @AfterEach
    void tearDown() {
        LoginUserContext.clear();
    }

    @Test
    void shouldRejectWhenNoLoginContext() {
        BusinessException exception = Assertions.assertThrows(BusinessException.class, () -> lightAppService.listProjects());
        Assertions.assertEquals(ErrorCode.UNAUTHORIZED, exception.getErrorCode());
    }

    @Test
    void shouldRejectReorderWhenTodoNotOwnedByUser() {
        LoginUserContext.set(new LoginUser(7L, Set.of("USER"), Set.of()));

        LightAppTodoEntity entity = new LightAppTodoEntity();
        entity.setId(1L);
        entity.setUserId(7L);
        Mockito.when(todoMapper.selectList(Mockito.any())).thenReturn(List.of(entity));

        LightAppTodoReorderRequest request = new LightAppTodoReorderRequest();
        LightAppTodoReorderRequest.Item first = new LightAppTodoReorderRequest.Item();
        first.setTodoId(1L);
        first.setSortNum(10);
        LightAppTodoReorderRequest.Item second = new LightAppTodoReorderRequest.Item();
        second.setTodoId(2L);
        second.setSortNum(20);
        request.setItems(List.of(first, second));

        BusinessException exception = Assertions.assertThrows(BusinessException.class, () -> lightAppService.reorderTodos(request));
        Assertions.assertEquals(ErrorCode.NOT_FOUND, exception.getErrorCode());
    }

    @Test
    void shouldRejectUploadRingtoneWithoutAssetId() {
        LoginUserContext.set(new LoginUser(7L, Set.of("USER"), Set.of()));

        LightAppPomodoroUpsertRequest request = new LightAppPomodoroUpsertRequest();
        request.setTitle("测试模板");
        request.setFocusMinutes(25);
        request.setShortBreakMinutes(5);
        request.setLongBreakMinutes(15);
        request.setLongBreakEvery(4);
        request.setRingtoneType("UPLOAD");
        request.setRingtoneName("custom.mp3");

        BusinessException exception = Assertions.assertThrows(BusinessException.class, () -> lightAppService.createPomodoro(request));
        Assertions.assertEquals(ErrorCode.BAD_REQUEST, exception.getErrorCode());
    }

    @Test
    void shouldRejectBalanceTransactionsWhenDirectionInvalid() {
        LoginUserContext.set(new LoginUser(7L, Set.of("USER"), Set.of()));
        Mockito.when(balanceRecurringChargeMapper.selectList(Mockito.any())).thenReturn(List.of());

        BusinessException exception = Assertions.assertThrows(
            BusinessException.class,
            () -> lightAppService.listBalanceTransactions(null, null, "Asia/Shanghai", null, null, "invalid")
        );
        Assertions.assertEquals(ErrorCode.BAD_REQUEST, exception.getErrorCode());
    }

    @Test
    void shouldRejectBalanceTransactionsWhenDateRangeInvalid() {
        LoginUserContext.set(new LoginUser(7L, Set.of("USER"), Set.of()));
        Mockito.when(balanceRecurringChargeMapper.selectList(Mockito.any())).thenReturn(List.of());

        BusinessException exception = Assertions.assertThrows(
            BusinessException.class,
            () -> lightAppService.listBalanceTransactions(
                LocalDateTime.of(2026, 2, 20, 0, 0),
                LocalDateTime.of(2026, 1, 10, 23, 59, 59),
                "Asia/Shanghai",
                null,
                null,
                null
            )
        );
        Assertions.assertEquals(ErrorCode.BAD_REQUEST, exception.getErrorCode());
    }

    @Test
    void shouldAggregateCategoryBreakdownWithOtherFallback() {
        LoginUserContext.set(new LoginUser(7L, Set.of("USER"), Set.of()));
        Mockito.when(balanceRecurringChargeMapper.selectList(Mockito.any())).thenReturn(List.of());
        Mockito.when(balanceAccountMapper.selectList(Mockito.any())).thenReturn(List.of());
        Mockito.when(balanceDebtMapper.selectList(Mockito.any())).thenReturn(List.of());

        LightAppFxRateEntity rate = new LightAppFxRateEntity();
        rate.setBaseCurrencyCode("CNY");
        rate.setQuoteCurrencyCode("CNY");
        rate.setRateValue(BigDecimal.ONE);
        rate.setProviderCode("TEST");
        rate.setRateAt(LocalDateTime.now());
        Mockito.when(fxRateMapper.selectList(Mockito.any())).thenReturn(List.of(rate));

        LightAppBalanceTransactionEntity income = new LightAppBalanceTransactionEntity();
        income.setId(1L);
        income.setUserId(7L);
        income.setDirectionCode("INCOME");
        income.setAmount(new BigDecimal("100"));
        income.setCurrencyCode("CNY");
        income.setCategory(null);
        income.setOccurredAt(LocalDateTime.of(2026, 3, 1, 10, 0));

        LightAppBalanceTransactionEntity expenseA = new LightAppBalanceTransactionEntity();
        expenseA.setId(2L);
        expenseA.setUserId(7L);
        expenseA.setDirectionCode("EXPENSE");
        expenseA.setAmount(new BigDecimal("40"));
        expenseA.setCurrencyCode("CNY");
        expenseA.setCategory("餐饮");
        expenseA.setOccurredAt(LocalDateTime.of(2026, 3, 1, 12, 0));

        LightAppBalanceTransactionEntity expenseB = new LightAppBalanceTransactionEntity();
        expenseB.setId(3L);
        expenseB.setUserId(7L);
        expenseB.setDirectionCode("EXPENSE");
        expenseB.setAmount(new BigDecimal("10"));
        expenseB.setCurrencyCode("CNY");
        expenseB.setCategory("  ");
        expenseB.setOccurredAt(LocalDateTime.of(2026, 3, 2, 12, 0));

        Mockito.when(balanceTransactionMapper.selectList(Mockito.any()))
            .thenReturn(List.of(income, expenseA, expenseB));

        LightAppBalanceAnalyticsResponse response = lightAppService.getBalanceAnalytics(
            "CNY",
            LocalDateTime.of(2026, 3, 1, 0, 0),
            LocalDateTime.of(2026, 3, 3, 23, 59, 59),
            "Asia/Shanghai",
            null,
            null
        );

        Assertions.assertEquals(2, response.expenseCategoryBreakdown().size());
        Assertions.assertEquals("餐饮", response.expenseCategoryBreakdown().get(0).categoryName());
        Assertions.assertEquals(new BigDecimal("80.0000"), response.expenseCategoryBreakdown().get(0).ratioPercent());
        Assertions.assertEquals("其他", response.expenseCategoryBreakdown().get(1).categoryName());

        Assertions.assertEquals(1, response.incomeCategoryBreakdown().size());
        Assertions.assertEquals("其他", response.incomeCategoryBreakdown().get(0).categoryName());
        Assertions.assertEquals(new BigDecimal("100.0000"), response.incomeCategoryBreakdown().get(0).ratioPercent());
    }

    @Test
    void shouldCreateBalanceAccountWithNegativeBalance() {
        LoginUserContext.set(new LoginUser(7L, Set.of("USER"), Set.of()));
        LightAppBalanceAccountEntity[] stored = new LightAppBalanceAccountEntity[1];

        Mockito.when(balanceAccountMapper.selectMaxSortNumByUserId(7L)).thenReturn(0);
        Mockito.when(balanceAccountMapper.insert(Mockito.<LightAppBalanceAccountEntity>any())).thenAnswer(invocation -> {
            LightAppBalanceAccountEntity entity = invocation.getArgument(0);
            entity.setId(11L);
            stored[0] = entity;
            return 1;
        });
        Mockito.when(balanceAccountMapper.selectOne(Mockito.any())).thenAnswer(invocation -> stored[0]);

        LightAppBalanceAccountUpsertRequest request = new LightAppBalanceAccountUpsertRequest();
        request.setChannelCode("wechat");
        request.setChannelName("微信");
        request.setAccountName("微信零钱");
        request.setCurrencyCode("CNY");
        request.setBalanceAmount(new BigDecimal("-89.16"));

        var response = lightAppService.createBalanceAccount(request);

        Assertions.assertEquals(new BigDecimal("-89.1600"), response.balanceAmount());
        Assertions.assertEquals(new BigDecimal("-89.1600"), stored[0].getBalanceAmount());
    }

    @Test
    void shouldAllowExpenseTransactionToDriveAccountNegative() {
        LoginUserContext.set(new LoginUser(7L, Set.of("USER"), Set.of()));

        LightAppBalanceAccountEntity account = new LightAppBalanceAccountEntity();
        account.setId(5L);
        account.setUserId(7L);
        account.setChannelCode("wechat");
        account.setChannelName("微信");
        account.setAccountName("微信零钱");
        account.setCurrencyCode("CNY");
        account.setBalanceAmount(new BigDecimal("10.00"));

        LightAppBalanceTransactionEntity[] stored = new LightAppBalanceTransactionEntity[1];
        Mockito.when(balanceAccountMapper.selectOne(Mockito.any())).thenReturn(account);
        Mockito.when(balanceTransactionMapper.selectMaxSortNumByUserId(7L)).thenReturn(0);
        Mockito.when(balanceTransactionMapper.insert(Mockito.<LightAppBalanceTransactionEntity>any())).thenAnswer(invocation -> {
            LightAppBalanceTransactionEntity entity = invocation.getArgument(0);
            entity.setId(21L);
            stored[0] = entity;
            return 1;
        });
        Mockito.when(balanceTransactionMapper.selectOne(Mockito.any())).thenAnswer(invocation -> stored[0]);

        LightAppBalanceTransactionUpsertRequest request = new LightAppBalanceTransactionUpsertRequest();
        request.setAccountId(5L);
        request.setDirection("EXPENSE");
        request.setAmount(new BigDecimal("25.00"));
        request.setCurrencyCode("CNY");
        request.setCategory("餐饮");
        request.setNote("测试支出");
        request.setOccurredAt(LocalDateTime.of(2026, 7, 9, 10, 0));

        var response = lightAppService.createBalanceTransaction(request);

        Assertions.assertEquals(new BigDecimal("-15.0000"), account.getBalanceAmount());
        Assertions.assertEquals(21L, response.transactionId());
        Mockito.verify(balanceAccountMapper).updateById(account);
    }

    @Test
    void shouldKeepNegativeBalanceWhenDeletingIncomeTransaction() {
        LoginUserContext.set(new LoginUser(7L, Set.of("USER"), Set.of()));

        LightAppBalanceAccountEntity account = new LightAppBalanceAccountEntity();
        account.setId(5L);
        account.setUserId(7L);
        account.setBalanceAmount(new BigDecimal("-5.00"));

        LightAppBalanceTransactionEntity transaction = new LightAppBalanceTransactionEntity();
        transaction.setId(22L);
        transaction.setUserId(7L);
        transaction.setAccountId(5L);
        transaction.setDirectionCode("INCOME");
        transaction.setAmount(new BigDecimal("10.00"));
        transaction.setCurrencyCode("CNY");
        transaction.setOccurredAt(LocalDateTime.of(2026, 7, 9, 8, 0));

        Mockito.when(balanceTransactionMapper.selectOne(Mockito.any())).thenReturn(transaction);
        Mockito.when(balanceAccountMapper.selectOne(Mockito.any())).thenReturn(account);

        lightAppService.deleteBalanceTransaction(22L);

        Assertions.assertEquals(new BigDecimal("-15.0000"), account.getBalanceAmount());
        Mockito.verify(balanceAccountMapper).updateById(account);
        Mockito.verify(balanceTransactionMapper).deleteById(22L);
    }

    @Test
    void shouldAllowRecurringChargeToKeepAccountNegativeWithoutCreatingDebt() {
        LightAppBalanceAccountEntity account = new LightAppBalanceAccountEntity();
        account.setId(5L);
        account.setUserId(7L);
        account.setChannelName("微信");
        account.setBalanceAmount(new BigDecimal("-5.00"));

        LightAppBalanceRecurringChargeEntity rule = new LightAppBalanceRecurringChargeEntity();
        rule.setId(3L);
        rule.setTitle("会员");
        rule.setAccountId(5L);

        LightAppBalanceTransactionEntity transaction = new LightAppBalanceTransactionEntity();
        transaction.setId(30L);
        transaction.setAccountId(5L);
        transaction.setAmount(new BigDecimal("20.00"));
        transaction.setCurrencyCode("CNY");

        Mockito.when(balanceAccountMapper.selectOne(Mockito.any())).thenReturn(account);

        ReflectionTestUtils.invokeMethod(
            lightAppService,
            "applyRecurringChargeAccounting",
            7L,
            rule,
            transaction,
            LocalDateTime.of(2026, 7, 9, 9, 0)
        );

        Assertions.assertEquals(new BigDecimal("-25.0000"), account.getBalanceAmount());
        Mockito.verify(balanceAccountMapper).updateById(account);
        Mockito.verify(balanceDebtMapper, Mockito.never()).insert(Mockito.<LightAppBalanceDebtEntity>any());
    }

    @Test
    void shouldBootstrapDefaultTaskColumnsWhenListingTaskColumns() {
        LoginUserContext.set(new LoginUser(7L, Set.of("USER"), Set.of()));

        LightAppTaskColumnEntity todo = new LightAppTaskColumnEntity();
        todo.setId(1L);
        todo.setUserId(7L);
        todo.setColumnCode("todo");
        todo.setTitle("todo");
        todo.setSortNum(10);
        todo.setEnabled(true);

        LightAppTaskColumnEntity doing = new LightAppTaskColumnEntity();
        doing.setId(2L);
        doing.setUserId(7L);
        doing.setColumnCode("doing");
        doing.setTitle("doing");
        doing.setSortNum(20);
        doing.setEnabled(true);

        LightAppTaskColumnEntity done = new LightAppTaskColumnEntity();
        done.setId(3L);
        done.setUserId(7L);
        done.setColumnCode("done");
        done.setTitle("done");
        done.setSortNum(30);
        done.setEnabled(true);

        Mockito.when(taskColumnMapper.selectList(Mockito.any()))
            .thenReturn(List.of())
            .thenReturn(List.of(todo, doing, done));

        List<LightAppTaskColumnResponse> response = lightAppService.listTaskColumns();

        Assertions.assertEquals(List.of("todo", "doing", "done"), response.stream().map(LightAppTaskColumnResponse::columnCode).toList());

        ArgumentCaptor<LightAppTaskColumnEntity> captor = ArgumentCaptor.forClass(LightAppTaskColumnEntity.class);
        Mockito.verify(taskColumnMapper, Mockito.times(3)).insert(captor.capture());
        Assertions.assertEquals(List.of("todo", "doing", "done"), captor.getAllValues().stream().map(LightAppTaskColumnEntity::getColumnCode).toList());
        Assertions.assertTrue(captor.getAllValues().stream().allMatch(entity -> Boolean.TRUE.equals(entity.getEnabled())));
    }

    @Test
    void shouldRejectTaskColumnsUpdateWhenNotionManagedByOwner() {
        LoginUserContext.set(new LoginUser(7L, Set.of("USER"), Set.of()));
        Mockito.when(taskNotionProperties.isConfigured()).thenReturn(true);
        Mockito.when(taskNotionProperties.getOwnerUserId()).thenReturn(7L);

        LightAppTaskColumnsUpdateRequest request = new LightAppTaskColumnsUpdateRequest();
        LightAppTaskColumnsUpdateRequest.Item item = new LightAppTaskColumnsUpdateRequest.Item();
        item.setColumnCode("todo");
        item.setTitle("待处理");
        item.setSortNum(10);
        item.setEnabled(true);
        request.setColumns(List.of(item));

        BusinessException exception = Assertions.assertThrows(
            BusinessException.class,
            () -> lightAppService.updateTaskColumns(request)
        );
        Assertions.assertEquals(ErrorCode.CONFLICT, exception.getErrorCode());
        Mockito.verify(taskNotionSyncService).ensureColumnMirrorInitialized();
    }
}
