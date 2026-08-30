package io.github.shizuki.site.content.service.widget;

import static org.assertj.core.api.Assertions.assertThatCode;
import static org.mockito.ArgumentMatchers.anyCollection;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Set;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.transaction.support.TransactionSynchronization;
import org.springframework.transaction.support.TransactionSynchronizationManager;

class RedisSiteWidgetCacheInvalidatorTest {

    private StringRedisTemplate redisTemplate;
    private RedisSiteWidgetCacheInvalidator invalidator;

    @BeforeEach
    void setUp() {
        redisTemplate = org.mockito.Mockito.mock(StringRedisTemplate.class);
        invalidator = new RedisSiteWidgetCacheInvalidator(redisTemplate);
    }

    @AfterEach
    void clearTransactionState() {
        if (TransactionSynchronizationManager.isSynchronizationActive()) {
            TransactionSynchronizationManager.clearSynchronization();
        }
        TransactionSynchronizationManager.setActualTransactionActive(false);
    }

    @Test
    void deletesOnlyAffectedWeatherAndQuoteKeysAfterCommit() {
        TransactionSynchronizationManager.setActualTransactionActive(true);
        TransactionSynchronizationManager.initSynchronization();

        invalidator.invalidate(new SiteWidgetCacheInvalidation(7L, 9L, true, true));

        verify(redisTemplate, never()).delete(anyCollection());
        TransactionSynchronizationManager.getSynchronizations().get(0).afterCommit();

        verify(redisTemplate).delete(Set.of(
            SiteWidgetCacheKeys.SITE_WEATHER_DEFAULT,
            SiteWidgetCacheKeys.siteWeatherLocation(7L),
            SiteWidgetCacheKeys.siteWeatherLocation(9L),
            SiteWidgetCacheKeys.DAILY_QUOTE_TODAY
        ));
    }

    @Test
    void rollbackDoesNotInvalidateCommittedCacheFacts() {
        TransactionSynchronizationManager.setActualTransactionActive(true);
        TransactionSynchronizationManager.initSynchronization();

        invalidator.invalidate(new SiteWidgetCacheInvalidation(7L, 9L, true, false));

        TransactionSynchronization synchronization = TransactionSynchronizationManager
            .getSynchronizations()
            .get(0);
        synchronization.afterCompletion(TransactionSynchronization.STATUS_ROLLED_BACK);

        verify(redisTemplate, never()).delete(anyCollection());
    }

    @Test
    void noTransactionInvalidatesImmediatelyAndNoChangeDoesNothing() {
        invalidator.invalidate(new SiteWidgetCacheInvalidation(7L, 9L, true, false));
        invalidator.invalidate(new SiteWidgetCacheInvalidation(9L, 9L, false, false));

        verify(redisTemplate).delete(Set.of(
            SiteWidgetCacheKeys.SITE_WEATHER_DEFAULT,
            SiteWidgetCacheKeys.siteWeatherLocation(7L),
            SiteWidgetCacheKeys.siteWeatherLocation(9L)
        ));
    }

    @Test
    void redisFailureDoesNotTurnCommittedConfigurationIntoAnApparentFailure() {
        when(redisTemplate.delete(anyCollection())).thenThrow(new IllegalStateException("redis unavailable"));

        assertThatCode(() -> invalidator.invalidate(
            new SiteWidgetCacheInvalidation(null, 9L, true, false)
        )).doesNotThrowAnyException();
    }
}
