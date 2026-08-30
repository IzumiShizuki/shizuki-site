package io.github.shizuki.site.content.service.widget;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.shizuki.site.content.config.ExternalWidgetFeatureProperties;
import io.github.shizuki.site.content.entity.DailyQuoteSnapshotEntity;
import io.github.shizuki.site.content.entity.QuoteEntity;
import io.github.shizuki.site.content.entity.SiteLocationEntity;
import io.github.shizuki.site.content.entity.SiteWidgetConfigEntity;
import io.github.shizuki.site.content.mapper.DailyQuoteSnapshotMapper;
import io.github.shizuki.site.content.mapper.QuoteMapper;
import io.github.shizuki.site.content.mapper.SiteLocationMapper;
import io.github.shizuki.site.content.mapper.SiteWidgetConfigMapper;
import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/** Visitor reads persisted/cache facts only; this service has no provider or refresh dependency. */
@Service
public class DailyQuoteQueryService {

    private static final Logger LOGGER = LoggerFactory.getLogger(DailyQuoteQueryService.class);

    private final SiteWidgetConfigMapper configMapper;
    private final SiteLocationMapper locationMapper;
    private final DailyQuoteSnapshotMapper snapshotMapper;
    private final QuoteMapper quoteMapper;
    private final DailyQuoteRedisStore redisStore;
    private final ExternalWidgetFeatureProperties featureProperties;
    private final ObjectMapper objectMapper;
    private final Clock clock;

    @Autowired
    public DailyQuoteQueryService(
        SiteWidgetConfigMapper configMapper,
        SiteLocationMapper locationMapper,
        DailyQuoteSnapshotMapper snapshotMapper,
        QuoteMapper quoteMapper,
        DailyQuoteRedisStore redisStore,
        ExternalWidgetFeatureProperties featureProperties,
        ObjectMapper objectMapper
    ) {
        this(
            configMapper,
            locationMapper,
            snapshotMapper,
            quoteMapper,
            redisStore,
            featureProperties,
            objectMapper,
            Clock.systemUTC()
        );
    }

    DailyQuoteQueryService(
        SiteWidgetConfigMapper configMapper,
        SiteLocationMapper locationMapper,
        DailyQuoteSnapshotMapper snapshotMapper,
        QuoteMapper quoteMapper,
        DailyQuoteRedisStore redisStore,
        ExternalWidgetFeatureProperties featureProperties,
        ObjectMapper objectMapper,
        Clock clock
    ) {
        this.configMapper = configMapper;
        this.locationMapper = locationMapper;
        this.snapshotMapper = snapshotMapper;
        this.quoteMapper = quoteMapper;
        this.redisStore = redisStore;
        this.featureProperties = featureProperties;
        this.objectMapper = objectMapper;
        this.clock = clock;
    }

    public DailyQuoteView today() {
        ZoneId timezone = resolveSiteTimezone();
        if (timezone == null) {
            return unavailable();
        }
        LocalDate today = LocalDate.now(clock.withZone(timezone));
        DailyQuoteView cached = readCache(today);
        if (cached != null) {
            return cached;
        }
        DailyQuoteSnapshotEntity current = snapshotMapper.selectByQuoteDate(today);
        DailyQuoteView result;
        if (current != null) {
            result = snapshotView(current, DailyQuoteState.CURRENT);
        } else {
            DailyQuoteSnapshotEntity lastGood = snapshotMapper.selectLatestBefore(today);
            result = lastGood == null
                ? unavailable()
                : snapshotView(lastGood, DailyQuoteState.STALE);
        }
        cacheBestEffort(today, timezone, result);
        return result;
    }

    public DailyQuoteView alternative(Long afterQuoteId) {
        if (resolveSiteTimezone() == null) {
            return unavailable();
        }
        List<QuoteEntity> eligible = quoteMapper.selectApprovedEnabled(500);
        if (eligible == null || eligible.isEmpty()) {
            return null;
        }
        QuoteEntity selected = eligible.get(0);
        if (afterQuoteId != null) {
            for (QuoteEntity quote : eligible) {
                if (quote.getId() != null && quote.getId() > afterQuoteId) {
                    selected = quote;
                    break;
                }
            }
        }
        return new DailyQuoteView(
            null,
            selected.getId(),
            null,
            selected.getText(),
            selected.getAuthor(),
            selected.getSourceTitle(),
            selected.getCategoryCode(),
            selected.getProviderCode() == null ? "LOCAL" : selected.getProviderCode(),
            selected.getProviderUuid(),
            selected.getSourceUrl(),
            null,
            DailyQuoteState.LOCAL_ALTERNATIVE
        );
    }

    private DailyQuoteView snapshotView(DailyQuoteSnapshotEntity entity, DailyQuoteState state) {
        return new DailyQuoteView(
            entity.getId(),
            entity.getQuoteId(),
            entity.getQuoteDate(),
            entity.getText(),
            entity.getAuthor(),
            entity.getSourceTitle(),
            entity.getCategoryCode(),
            entity.getProviderCode(),
            entity.getProviderUuid(),
            entity.getSourceUrl(),
            entity.getFetchedAt() == null ? null : entity.getFetchedAt().toInstant(ZoneOffset.UTC),
            state
        );
    }

    private DailyQuoteView readCache(LocalDate today) {
        try {
            String payload = redisStore.get();
            if (payload == null || payload.isBlank()) {
                return null;
            }
            DailyQuoteCacheDocument document = objectMapper.readValue(payload, DailyQuoteCacheDocument.class);
            if (today.equals(document.requestedDate())) {
                return document.view();
            }
            redisStore.evict();
        } catch (RuntimeException | JsonProcessingException exception) {
            logCacheSkip("read", exception);
        }
        return null;
    }

    private void cacheBestEffort(LocalDate today, ZoneId timezone, DailyQuoteView view) {
        try {
            ZonedDateTime now = ZonedDateTime.ofInstant(clock.instant(), timezone);
            Duration ttl = Duration.between(now, today.plusDays(1).atStartOfDay(timezone).plusHours(1));
            if (ttl.isNegative() || ttl.isZero()) {
                ttl = Duration.ofMinutes(5);
            }
            redisStore.put(
                objectMapper.writeValueAsString(new DailyQuoteCacheDocument(today, view)),
                ttl
            );
        } catch (RuntimeException | JsonProcessingException exception) {
            logCacheSkip("write", exception);
        }
    }

    private ZoneId resolveSiteTimezone() {
        if (!featureProperties.isEnabled() || !featureProperties.isQuoteEnabled()) {
            return null;
        }
        SiteWidgetConfigEntity config = configMapper.selectById(SiteWidgetConfigurationService.SINGLETON_KEY);
        if (config == null || Integer.valueOf(1).equals(config.getDeleted())
            || config.getActiveLocationId() == null) {
            return null;
        }
        SiteLocationEntity location = locationMapper.selectById(config.getActiveLocationId());
        if (location == null || Integer.valueOf(1).equals(location.getDeleted())
            || !Boolean.TRUE.equals(location.getEnabled()) || location.getTimezone() == null) {
            return null;
        }
        try {
            return ZoneId.of(location.getTimezone());
        } catch (RuntimeException exception) {
            return null;
        }
    }

    private DailyQuoteView unavailable() {
        return new DailyQuoteView(
            null, null, null, null, null, null, null, null, null, null, null,
            DailyQuoteState.UNAVAILABLE
        );
    }

    private void logCacheSkip(String stage, Exception exception) {
        LOGGER.debug("DAILY_QUOTE_CACHE_SKIP stage={} reason={}", stage, exception.getClass().getSimpleName());
    }
}
