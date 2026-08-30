package io.github.shizuki.site.content.service.widget;

import io.github.shizuki.site.content.config.ExternalWidgetFeatureProperties;
import io.github.shizuki.site.content.entity.DailyQuoteSnapshotEntity;
import io.github.shizuki.site.content.entity.SiteLocationEntity;
import io.github.shizuki.site.content.entity.SiteWidgetConfigEntity;
import io.github.shizuki.site.content.mapper.DailyQuoteSnapshotMapper;
import io.github.shizuki.site.content.mapper.QuoteMapper;
import io.github.shizuki.site.content.mapper.SiteLocationMapper;
import io.github.shizuki.site.content.mapper.SiteWidgetConfigMapper;
import io.github.shizuki.site.content.provider.quote.DailyQuoteProvider;
import io.github.shizuki.site.content.provider.quote.NormalizedDailyQuote;
import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.List;
import java.util.UUID;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/** Resolves a missing site-local date once; committed rows are never updated or replaced. */
@Service
public class DailyQuoteSnapshotCoordinator {

    private static final Logger LOGGER = LoggerFactory.getLogger(DailyQuoteSnapshotCoordinator.class);

    private final SiteWidgetConfigMapper configMapper;
    private final SiteLocationMapper locationMapper;
    private final DailyQuoteSnapshotMapper snapshotMapper;
    private final QuoteMapper quoteMapper;
    private final DailyQuoteProvider provider;
    private final DailyQuoteRefreshLock refreshLock;
    private final DailyQuoteSnapshotProperties properties;
    private final ExternalWidgetFeatureProperties featureProperties;
    private final SiteWidgetCacheInvalidator cacheInvalidator;
    private final Clock clock;

    @Autowired
    public DailyQuoteSnapshotCoordinator(
        SiteWidgetConfigMapper configMapper,
        SiteLocationMapper locationMapper,
        DailyQuoteSnapshotMapper snapshotMapper,
        QuoteMapper quoteMapper,
        DailyQuoteProvider provider,
        DailyQuoteRefreshLock refreshLock,
        DailyQuoteSnapshotProperties properties,
        ExternalWidgetFeatureProperties featureProperties,
        SiteWidgetCacheInvalidator cacheInvalidator
    ) {
        this(
            configMapper,
            locationMapper,
            snapshotMapper,
            quoteMapper,
            provider,
            refreshLock,
            properties,
            featureProperties,
            cacheInvalidator,
            Clock.systemUTC()
        );
    }

    DailyQuoteSnapshotCoordinator(
        SiteWidgetConfigMapper configMapper,
        SiteLocationMapper locationMapper,
        DailyQuoteSnapshotMapper snapshotMapper,
        QuoteMapper quoteMapper,
        DailyQuoteProvider provider,
        DailyQuoteRefreshLock refreshLock,
        DailyQuoteSnapshotProperties properties,
        ExternalWidgetFeatureProperties featureProperties,
        SiteWidgetCacheInvalidator cacheInvalidator,
        Clock clock
    ) {
        this.configMapper = configMapper;
        this.locationMapper = locationMapper;
        this.snapshotMapper = snapshotMapper;
        this.quoteMapper = quoteMapper;
        this.provider = provider;
        this.refreshLock = refreshLock;
        this.properties = properties;
        this.featureProperties = featureProperties;
        this.cacheInvalidator = cacheInvalidator;
        this.clock = clock;
    }

    public DailyQuoteSnapshotEntity refreshMissingCurrentDate() {
        QuoteContext context = resolveContext();
        if (context == null) {
            return null;
        }
        LocalDate quoteDate = LocalDate.now(clock.withZone(context.timezone()));
        SnapshotLookup initialLookup = lookupSnapshot(quoteDate);
        if (!initialLookup.available()) {
            return null;
        }
        DailyQuoteSnapshotEntity existing = initialLookup.snapshot();
        if (existing != null) {
            return existing;
        }
        if (context.sourceMode() == SiteWidgetQuoteSourceMode.HITOKOTO
            && (!context.hitokotoEnabled() || !featureProperties.canContactQuoteUpstream())) {
            return null;
        }

        String token = UUID.randomUUID().toString();
        boolean acquired;
        try {
            acquired = refreshLock.tryAcquire(quoteDate, token, properties.getRefreshLockTtl());
        } catch (RuntimeException exception) {
            logSkip("redis-lock", exception);
            return null;
        }
        if (!acquired) {
            return availableSnapshot(lookupSnapshot(quoteDate));
        }

        try {
            SnapshotLookup lockedLookup = lookupSnapshot(quoteDate);
            if (!lockedLookup.available()) {
                return null;
            }
            existing = lockedLookup.snapshot();
            if (existing != null) {
                return existing;
            }
            DailyQuoteSnapshotEntity candidate = resolveCandidate(context.sourceMode(), quoteDate);
            if (candidate == null) {
                return null;
            }
            try {
                if (snapshotMapper.insert(candidate) == 1) {
                    cacheInvalidator.invalidate(new SiteWidgetCacheInvalidation(
                        context.locationId(),
                        context.locationId(),
                        false,
                        true
                    ));
                    return candidate;
                }
            } catch (RuntimeException conflictOrFailure) {
                logSkip("snapshot-insert", conflictOrFailure);
            }
            return availableSnapshot(lookupSnapshot(quoteDate));
        } catch (RuntimeException exception) {
            logSkip("snapshot-resolution", exception);
            return null;
        } finally {
            releaseSafely(quoteDate, token);
        }
    }

    private QuoteContext resolveContext() {
        if (!featureProperties.isEnabled() || !featureProperties.isQuoteEnabled()) {
            return null;
        }
        SiteWidgetConfigEntity config = configMapper.selectById(SiteWidgetConfigurationService.SINGLETON_KEY);
        if (config == null
            || Integer.valueOf(1).equals(config.getDeleted())
            || config.getActiveLocationId() == null
            || config.getActiveLocationId() <= 0) {
            return null;
        }
        SiteLocationEntity location = locationMapper.selectById(config.getActiveLocationId());
        if (location == null
            || location.getId() == null
            || Integer.valueOf(1).equals(location.getDeleted())
            || !Boolean.TRUE.equals(location.getEnabled())
            || location.getTimezone() == null) {
            return null;
        }
        try {
            return new QuoteContext(
                location.getId(),
                ZoneId.of(location.getTimezone()),
                SiteWidgetQuoteSourceMode.parse(config.getQuoteSourceMode()),
                Boolean.TRUE.equals(config.getHitokotoEnabled())
            );
        } catch (RuntimeException exception) {
            return null;
        }
    }

    private DailyQuoteSnapshotEntity toEntity(LocalDate quoteDate, NormalizedDailyQuote quote) {
        DailyQuoteSnapshotEntity entity = new DailyQuoteSnapshotEntity();
        entity.setQuoteDate(quoteDate);
        entity.setQuoteId(null);
        entity.setText(quote.text());
        entity.setAuthor(quote.author());
        entity.setSourceTitle(quote.sourceTitle());
        entity.setCategoryCode(quote.category());
        entity.setProviderCode(quote.providerCode());
        entity.setProviderUuid(quote.externalId());
        entity.setSourceUrl(quote.sourceDestination().toString());
        entity.setStale(false);
        entity.setFetchedAt(LocalDateTime.ofInstant(quote.fetchedAt(), ZoneOffset.UTC));
        entity.setDeleted(0);
        entity.setVersion(0);
        return entity;
    }

    private DailyQuoteSnapshotEntity hitokotoCandidate(LocalDate quoteDate) {
        NormalizedDailyQuote quote = provider.fetch();
        requireProviderQuote(quote);
        return toEntity(quoteDate, quote);
    }

    private DailyQuoteSnapshotEntity resolveCandidate(
        SiteWidgetQuoteSourceMode sourceMode,
        LocalDate quoteDate
    ) {
        if (sourceMode == SiteWidgetQuoteSourceMode.LOCAL) {
            return localCandidate(quoteDate);
        }
        try {
            return hitokotoCandidate(quoteDate);
        } catch (RuntimeException exception) {
            logSkip("provider-refresh", exception);
            return localCandidate(quoteDate);
        }
    }

    private DailyQuoteSnapshotEntity localCandidate(LocalDate quoteDate) {
        List<io.github.shizuki.site.content.entity.QuoteEntity> eligible = quoteMapper.selectApprovedEnabled(500);
        if (eligible == null || eligible.isEmpty()) {
            return null;
        }
        int index = (int) Math.floorMod(quoteDate.toEpochDay(), eligible.size());
        io.github.shizuki.site.content.entity.QuoteEntity quote = eligible.get(index);
        if (quote == null
            || quote.getId() == null
            || Integer.valueOf(1).equals(quote.getDeleted())
            || !Boolean.TRUE.equals(quote.getEnabled())
            || !QuoteApprovalStatus.APPROVED.name().equals(quote.getApprovalStatus())
            || quote.getText() == null
            || quote.getText().isBlank()) {
            return null;
        }
        DailyQuoteSnapshotEntity entity = new DailyQuoteSnapshotEntity();
        entity.setQuoteDate(quoteDate);
        entity.setQuoteId(quote.getId());
        entity.setText(quote.getText());
        entity.setAuthor(quote.getAuthor());
        entity.setSourceTitle(quote.getSourceTitle());
        entity.setCategoryCode(quote.getCategoryCode());
        entity.setProviderCode(quote.getProviderCode() == null ? "LOCAL" : quote.getProviderCode());
        entity.setProviderUuid(quote.getProviderUuid());
        entity.setSourceUrl(quote.getSourceUrl());
        entity.setStale(false);
        entity.setFetchedAt(LocalDateTime.ofInstant(clock.instant(), ZoneOffset.UTC));
        entity.setDeleted(0);
        entity.setVersion(0);
        return entity;
    }

    private void requireProviderQuote(NormalizedDailyQuote quote) {
        if (quote == null
            || !provider.providerCode().equals(quote.providerCode())
            || !provider.attribution().equals(quote.attribution())) {
            throw new IllegalArgumentException("daily quote provider identity is invalid");
        }
    }

    private SnapshotLookup lookupSnapshot(LocalDate quoteDate) {
        try {
            return new SnapshotLookup(true, snapshotMapper.selectByQuoteDate(quoteDate));
        } catch (RuntimeException exception) {
            logSkip("snapshot-read", exception);
            return new SnapshotLookup(false, null);
        }
    }

    private DailyQuoteSnapshotEntity availableSnapshot(SnapshotLookup lookup) {
        return lookup.available() ? lookup.snapshot() : null;
    }

    private void releaseSafely(LocalDate quoteDate, String token) {
        try {
            refreshLock.release(quoteDate, token);
        } catch (RuntimeException exception) {
            logSkip("redis-release", exception);
        }
    }

    private void logSkip(String stage, RuntimeException exception) {
        LOGGER.debug(
            "DAILY_QUOTE_REFRESH_SKIP stage={} reason={}",
            stage,
            exception.getClass().getSimpleName()
        );
    }

    private record QuoteContext(
        long locationId,
        ZoneId timezone,
        SiteWidgetQuoteSourceMode sourceMode,
        boolean hitokotoEnabled
    ) {
    }

    private record SnapshotLookup(boolean available, DailyQuoteSnapshotEntity snapshot) {
    }
}
