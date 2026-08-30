package io.github.shizuki.site.content.service.widget;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.shizuki.site.content.config.ExternalWidgetFeatureProperties;
import io.github.shizuki.site.content.entity.SiteLocationEntity;
import io.github.shizuki.site.content.entity.SiteWidgetConfigEntity;
import io.github.shizuki.site.content.entity.WeatherSnapshotEntity;
import io.github.shizuki.site.content.mapper.SiteLocationMapper;
import io.github.shizuki.site.content.mapper.SiteWidgetConfigMapper;
import io.github.shizuki.site.content.mapper.WeatherSnapshotMapper;
import io.github.shizuki.site.content.provider.weather.NormalizedWeather;
import io.github.shizuki.site.content.provider.weather.WeatherProvider;
import io.github.shizuki.site.content.provider.weather.WeatherProviderRequest;
import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Resolves only the configured site location and refreshes it behind a Redis lease.
 * Redis failure deliberately disables upstream access for that request; the database remains the fact boundary.
 */
@Service
public class SiteWeatherSnapshotService {

    private static final Logger LOGGER = LoggerFactory.getLogger(SiteWeatherSnapshotService.class);
    private static final int LAST_GOOD_SCAN_LIMIT = 8;

    private final SiteWidgetConfigMapper configMapper;
    private final SiteLocationMapper locationMapper;
    private final WeatherSnapshotMapper snapshotMapper;
    private final WeatherProvider provider;
    private final SiteWeatherRedisStore redisStore;
    private final SiteWeatherCacheProperties cacheProperties;
    private final ExternalWidgetFeatureProperties featureProperties;
    private final ObjectMapper objectMapper;
    private final Clock clock;

    @Autowired
    public SiteWeatherSnapshotService(
        SiteWidgetConfigMapper configMapper,
        SiteLocationMapper locationMapper,
        WeatherSnapshotMapper snapshotMapper,
        WeatherProvider provider,
        SiteWeatherRedisStore redisStore,
        SiteWeatherCacheProperties cacheProperties,
        ExternalWidgetFeatureProperties featureProperties,
        ObjectMapper objectMapper
    ) {
        this(
            configMapper,
            locationMapper,
            snapshotMapper,
            provider,
            redisStore,
            cacheProperties,
            featureProperties,
            objectMapper,
            Clock.systemUTC()
        );
    }

    SiteWeatherSnapshotService(
        SiteWidgetConfigMapper configMapper,
        SiteLocationMapper locationMapper,
        WeatherSnapshotMapper snapshotMapper,
        WeatherProvider provider,
        SiteWeatherRedisStore redisStore,
        SiteWeatherCacheProperties cacheProperties,
        ExternalWidgetFeatureProperties featureProperties,
        ObjectMapper objectMapper,
        Clock clock
    ) {
        this.configMapper = configMapper;
        this.locationMapper = locationMapper;
        this.snapshotMapper = snapshotMapper;
        this.provider = provider;
        this.redisStore = redisStore;
        this.cacheProperties = cacheProperties;
        this.featureProperties = featureProperties;
        this.objectMapper = objectMapper;
        this.clock = clock;
    }

    public SiteWeatherSnapshot getSiteWeather() {
        ConfiguredLocation configured = resolveConfiguredLocation();
        if (configured == null) {
            return unavailable(null);
        }
        Instant now = clock.instant();
        RedisRead redisRead = readRedis(configured, now);
        if (redisRead.freshSnapshot() != null) {
            return redisRead.freshSnapshot();
        }

        SnapshotFact lastGood;
        try {
            lastGood = loadLastGood(configured.locationId());
        } catch (RuntimeException exception) {
            logFallback("database-read", exception);
            return unavailable(configured.displayName());
        }
        if (isFresh(lastGood, now)) {
            if (redisRead.available()) {
                cacheBestEffort(lastGood);
            }
            return present(configured, lastGood, SiteWeatherFreshness.FRESH);
        }

        if (!redisRead.available() || !featureProperties.canContactWeatherUpstream()) {
            return fallback(configured, lastGood, now);
        }

        String token = UUID.randomUUID().toString();
        boolean acquired;
        try {
            acquired = redisStore.tryAcquireRefresh(
                configured.locationId(),
                token,
                cacheProperties.getRefreshLockTtl()
            );
        } catch (RuntimeException exception) {
            logFallback("redis-lock", exception);
            return fallback(configured, lastGood, now);
        }
        if (!acquired) {
            return fallback(configured, lastGood, now);
        }

        try {
            return refresh(configured, lastGood, now);
        } finally {
            releaseBestEffort(configured.locationId(), token);
        }
    }

    private SiteWeatherSnapshot refresh(ConfiguredLocation configured, SnapshotFact lastGood, Instant requestTime) {
        try {
            NormalizedWeather weather = provider.fetch(new WeatherProviderRequest(
                configured.latitude(),
                configured.longitude(),
                configured.timezone(),
                configured.displayName()
            ));
            requireProviderResult(configured, weather);
            Instant fetchedAt = clock.instant();
            SnapshotFact refreshed = new SnapshotFact(configured.locationId(), weather, fetchedAt);
            WeatherSnapshotEntity entity = toEntity(refreshed);
            if (snapshotMapper.insert(entity) != 1) {
                throw new IllegalStateException("weather snapshot was not persisted");
            }
            cacheBestEffort(refreshed);
            return present(configured, refreshed, SiteWeatherFreshness.FRESH);
        } catch (RuntimeException | JsonProcessingException exception) {
            logFallback("provider-refresh", exception);
            return fallback(configured, lastGood, requestTime);
        }
    }

    private RedisRead readRedis(ConfiguredLocation configured, Instant now) {
        String payload;
        try {
            payload = redisStore.get(configured.locationId());
        } catch (RuntimeException exception) {
            logFallback("redis-read", exception);
            return new RedisRead(false, null);
        }
        if (payload == null || payload.isBlank()) {
            return new RedisRead(true, null);
        }
        try {
            SiteWeatherCacheDocument document = objectMapper.readValue(payload, SiteWeatherCacheDocument.class);
            SnapshotFact fact = validateDocument(configured.locationId(), document);
            if (isFresh(fact, now)) {
                return new RedisRead(true, present(configured, fact, SiteWeatherFreshness.FRESH));
            }
        } catch (JsonProcessingException | IllegalArgumentException exception) {
            logFallback("redis-payload", exception);
        }
        evictBestEffort(configured.locationId());
        return new RedisRead(true, null);
    }

    private SnapshotFact loadLastGood(long locationId) {
        List<WeatherSnapshotEntity> recent = snapshotMapper.selectRecentByLocationId(
            locationId,
            LAST_GOOD_SCAN_LIMIT
        );
        if (recent == null) {
            return null;
        }
        for (WeatherSnapshotEntity entity : recent) {
            try {
                SnapshotFact fact = decodeEntity(locationId, entity);
                if (fact != null) {
                    return fact;
                }
            } catch (JsonProcessingException | IllegalArgumentException exception) {
                logFallback("database-payload", exception);
            }
        }
        return null;
    }

    private SnapshotFact decodeEntity(long locationId, WeatherSnapshotEntity entity)
        throws JsonProcessingException {
        if (entity == null
            || !Objects.equals(entity.getSiteLocationId(), locationId)
            || entity.getPayloadJson() == null
            || entity.getFetchedAt() == null
            || entity.getObservedAt() == null
            || !provider.providerCode().equals(entity.getProviderCode())) {
            return null;
        }
        NormalizedWeather weather = objectMapper.readValue(entity.getPayloadJson(), NormalizedWeather.class);
        requireProviderWeather(weather);
        Instant observedAt = entity.getObservedAt().toInstant(ZoneOffset.UTC);
        if (!observedAt.equals(weather.observedAt())) {
            throw new IllegalArgumentException("weather observation timestamp does not match its durable row");
        }
        return new SnapshotFact(
            locationId,
            weather,
            entity.getFetchedAt().toInstant(ZoneOffset.UTC)
        );
    }

    private SnapshotFact validateDocument(long locationId, SiteWeatherCacheDocument document) {
        if (document == null || document.locationId() != locationId) {
            throw new IllegalArgumentException("weather cache location does not match its key");
        }
        requireProviderWeather(document.weather());
        return new SnapshotFact(locationId, document.weather(), document.fetchedAt());
    }

    private void requireProviderResult(ConfiguredLocation configured, NormalizedWeather weather) {
        requireProviderWeather(weather);
        if (!configured.displayName().equals(weather.locationLabel())) {
            throw new IllegalArgumentException("weather provider changed the configured location label");
        }
    }

    private void requireProviderWeather(NormalizedWeather weather) {
        if (weather == null
            || !provider.providerCode().equals(weather.providerCode())
            || !provider.attribution().equals(weather.attribution())) {
            throw new IllegalArgumentException("weather provider identity or attribution is invalid");
        }
    }

    private WeatherSnapshotEntity toEntity(SnapshotFact fact) throws JsonProcessingException {
        WeatherSnapshotEntity entity = new WeatherSnapshotEntity();
        entity.setSiteLocationId(fact.locationId());
        entity.setProviderCode(fact.weather().providerCode());
        entity.setPayloadJson(objectMapper.writeValueAsString(fact.weather()));
        entity.setObservedAt(LocalDateTime.ofInstant(fact.weather().observedAt(), ZoneOffset.UTC));
        entity.setFetchedAt(LocalDateTime.ofInstant(fact.fetchedAt(), ZoneOffset.UTC));
        entity.setDeleted(0);
        entity.setVersion(0);
        return entity;
    }

    private void cacheBestEffort(SnapshotFact fact) {
        try {
            redisStore.put(
                fact.locationId(),
                objectMapper.writeValueAsString(new SiteWeatherCacheDocument(
                    fact.locationId(),
                    fact.weather(),
                    fact.fetchedAt()
                )),
                cacheProperties.getValueTtl()
            );
        } catch (RuntimeException | JsonProcessingException exception) {
            logFallback("redis-write", exception);
        }
    }

    private void evictBestEffort(long locationId) {
        try {
            redisStore.evict(locationId);
        } catch (RuntimeException exception) {
            logFallback("redis-evict", exception);
        }
    }

    private void releaseBestEffort(long locationId, String token) {
        try {
            redisStore.releaseRefresh(locationId, token);
        } catch (RuntimeException exception) {
            logFallback("redis-release", exception);
        }
    }

    private SiteWeatherSnapshot fallback(
        ConfiguredLocation configured,
        SnapshotFact lastGood,
        Instant now
    ) {
        if (isUsable(lastGood, now, Duration.ofMinutes(configured.maxStaleMinutes()))) {
            return present(configured, lastGood, SiteWeatherFreshness.STALE);
        }
        return unavailable(configured.displayName());
    }

    private boolean isFresh(SnapshotFact fact, Instant now) {
        return isUsable(fact, now, cacheProperties.getFreshFor());
    }

    private boolean isUsable(SnapshotFact fact, Instant now, Duration maximumAge) {
        if (fact == null || fact.fetchedAt().isAfter(now.plus(Duration.ofMinutes(5)))) {
            return false;
        }
        return !fact.fetchedAt().isBefore(now.minus(maximumAge));
    }

    private SiteWeatherSnapshot present(
        ConfiguredLocation configured,
        SnapshotFact fact,
        SiteWeatherFreshness freshness
    ) {
        NormalizedWeather weather = fact.weather();
        return new SiteWeatherSnapshot(
            configured.displayName(),
            weather.temperature(),
            weather.apparentTemperature(),
            weather.relativeHumidity(),
            weather.weatherCode(),
            weather.windSpeed(),
            weather.forecast(),
            weather.observedAt(),
            fact.fetchedAt(),
            freshness,
            weather.attribution()
        );
    }

    private SiteWeatherSnapshot unavailable(String locationLabel) {
        return new SiteWeatherSnapshot(
            locationLabel,
            null,
            null,
            null,
            null,
            null,
            List.of(),
            null,
            null,
            SiteWeatherFreshness.UNAVAILABLE,
            provider.attribution()
        );
    }

    private ConfiguredLocation resolveConfiguredLocation() {
        if (!featureProperties.isEnabled() || !featureProperties.isWeatherEnabled()) {
            return null;
        }
        SiteWidgetConfigEntity config = configMapper.selectById(SiteWidgetConfigurationService.SINGLETON_KEY);
        if (config == null
            || Integer.valueOf(1).equals(config.getDeleted())
            || !Boolean.TRUE.equals(config.getWeatherEnabled())
            || config.getActiveLocationId() == null
            || config.getActiveLocationId() <= 0) {
            return null;
        }
        SiteLocationEntity location = locationMapper.selectById(config.getActiveLocationId());
        if (location == null
            || location.getId() == null
            || Integer.valueOf(1).equals(location.getDeleted())
            || !Boolean.TRUE.equals(location.getEnabled())
            || location.getDisplayName() == null
            || location.getLatitude() == null
            || location.getLongitude() == null
            || location.getTimezone() == null) {
            return null;
        }
        int maxStale = config.getWeatherMaxStaleMinutes() == null
            ? SiteWidgetConfigurationService.DEFAULT_MAX_STALE_MINUTES
            : config.getWeatherMaxStaleMinutes();
        if (maxStale < SiteWidgetConfigurationService.MIN_MAX_STALE_MINUTES
            || maxStale > SiteWidgetConfigurationService.MAX_MAX_STALE_MINUTES) {
            return null;
        }
        try {
            return new ConfiguredLocation(
                location.getId(),
                location.getDisplayName(),
                location.getLatitude(),
                location.getLongitude(),
                ZoneId.of(location.getTimezone()),
                maxStale
            );
        } catch (RuntimeException exception) {
            return null;
        }
    }

    private void logFallback(String stage, Exception exception) {
        LOGGER.debug(
            "SITE_WEATHER_FALLBACK stage={} reason={}",
            stage,
            exception.getClass().getSimpleName()
        );
    }

    private record ConfiguredLocation(
        long locationId,
        String displayName,
        java.math.BigDecimal latitude,
        java.math.BigDecimal longitude,
        ZoneId timezone,
        int maxStaleMinutes
    ) {
    }

    private record SnapshotFact(long locationId, NormalizedWeather weather, Instant fetchedAt) {
    }

    private record RedisRead(boolean available, SiteWeatherSnapshot freshSnapshot) {
    }
}
