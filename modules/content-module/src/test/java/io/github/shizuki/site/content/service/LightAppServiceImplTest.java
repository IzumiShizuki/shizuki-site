package io.github.shizuki.site.content.service;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.common.security.context.LoginUserContext;
import io.github.shizuki.common.security.model.LoginUser;
import io.github.shizuki.site.content.dto.LightAppBalanceAnalyticsResponse;
import io.github.shizuki.site.content.dto.LightAppPomodoroUpsertRequest;
import io.github.shizuki.site.content.dto.LightAppTodoReorderRequest;
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
import io.github.shizuki.site.content.service.impl.LightAppServiceImpl;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
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
    private RestClient.Builder restClientBuilder;

    @Mock
    private RestClient restClient;

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
}
