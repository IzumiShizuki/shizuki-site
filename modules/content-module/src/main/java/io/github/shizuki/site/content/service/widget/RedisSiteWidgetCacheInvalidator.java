package io.github.shizuki.site.content.service.widget;

import java.util.LinkedHashSet;
import java.util.Set;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.support.TransactionSynchronization;
import org.springframework.transaction.support.TransactionSynchronizationManager;

/** Deletes only widget keys made stale by one committed versioned configuration change. */
@Component
public class RedisSiteWidgetCacheInvalidator implements SiteWidgetCacheInvalidator {

    private static final Logger LOGGER = LoggerFactory.getLogger(RedisSiteWidgetCacheInvalidator.class);

    private final StringRedisTemplate redisTemplate;

    public RedisSiteWidgetCacheInvalidator(StringRedisTemplate redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    @Override
    public void invalidate(SiteWidgetCacheInvalidation invalidation) {
        if (invalidation == null) {
            return;
        }
        Set<String> keys = new LinkedHashSet<>();
        if (invalidation.weatherChanged()) {
            keys.add(SiteWidgetCacheKeys.SITE_WEATHER_DEFAULT);
            if (invalidation.previousLocationId() != null && invalidation.previousLocationId() > 0) {
                keys.add(SiteWidgetCacheKeys.siteWeatherLocation(invalidation.previousLocationId()));
            }
            keys.add(SiteWidgetCacheKeys.siteWeatherLocation(invalidation.activeLocationId()));
        }
        if (invalidation.quoteSourceChanged()) {
            keys.add(SiteWidgetCacheKeys.DAILY_QUOTE_TODAY);
        }
        if (keys.isEmpty()) {
            return;
        }
        afterCommit(() -> delete(keys));
    }

    private void delete(Set<String> keys) {
        try {
            redisTemplate.delete(keys);
        } catch (RuntimeException exception) {
            LOGGER.debug(
                "SITE_WIDGET_CACHE_INVALIDATION_SKIP keyCount={} reason={}",
                keys.size(),
                exception.getClass().getSimpleName()
            );
        }
    }

    private void afterCommit(Runnable invalidation) {
        if (TransactionSynchronizationManager.isSynchronizationActive()
            && TransactionSynchronizationManager.isActualTransactionActive()) {
            TransactionSynchronizationManager.registerSynchronization(new TransactionSynchronization() {
                @Override
                public void afterCommit() {
                    invalidation.run();
                }
            });
            return;
        }
        invalidation.run();
    }
}
