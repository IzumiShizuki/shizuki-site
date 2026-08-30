package io.github.shizuki.site.content.service.widget;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.site.content.config.ExternalWidgetFeatureProperties;
import io.github.shizuki.site.content.provider.weather.NormalizedWeather;
import io.github.shizuki.site.content.provider.weather.WeatherProvider;
import io.github.shizuki.site.content.provider.weather.WeatherProviderRequest;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;
import java.util.HexFormat;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/** Ephemeral nearby weather: consented, normalized, bounded, and never written to durable snapshot storage. */
@Service
public class NearbyWeatherService {

    private static final String PERSONAL_LOCATION_LABEL = "你的位置附近";

    private final WeatherProvider provider;
    private final NearbyWeatherTrafficGuard trafficGuard;
    private final NearbyWeatherCache cache;
    private final NearbyWeatherProperties properties;
    private final ExternalWidgetFeatureProperties featureProperties;
    private final Clock clock;

    @Autowired
    public NearbyWeatherService(
        WeatherProvider provider,
        NearbyWeatherTrafficGuard trafficGuard,
        NearbyWeatherCache cache,
        NearbyWeatherProperties properties,
        ExternalWidgetFeatureProperties featureProperties
    ) {
        this(provider, trafficGuard, cache, properties, featureProperties, Clock.systemUTC());
    }

    NearbyWeatherService(
        WeatherProvider provider,
        NearbyWeatherTrafficGuard trafficGuard,
        NearbyWeatherCache cache,
        NearbyWeatherProperties properties,
        ExternalWidgetFeatureProperties featureProperties,
        Clock clock
    ) {
        this.provider = provider;
        this.trafficGuard = trafficGuard;
        this.cache = cache;
        this.properties = properties;
        this.featureProperties = featureProperties;
        this.clock = clock;
    }

    public SiteWeatherSnapshot getNearbyWeather(
        BigDecimal latitude,
        BigDecimal longitude,
        boolean explicitConsent,
        String callerKey
    ) {
        Coordinates coordinates = validateAndNormalize(latitude, longitude, explicitConsent);
        if (!featureProperties.isEnabled() || !featureProperties.isWeatherEnabled()) {
            throw new BusinessException(ErrorCode.FEATURE_DISABLED, "Nearby weather is disabled");
        }
        trafficGuard.acquire(callerKey);
        String cacheKey = anonymousCellKey(coordinates);
        NearbyWeatherCache.Lookup lookup = cache.lookupOrReserve(cacheKey);
        if (lookup.state() == NearbyWeatherCache.State.HIT) {
            return lookup.snapshot();
        }
        if (lookup.state() == NearbyWeatherCache.State.BUSY
            || lookup.state() == NearbyWeatherCache.State.FULL) {
            throw new BusinessException(
                ErrorCode.TOO_MANY_REQUESTS,
                "Nearby weather capacity is temporarily unavailable",
                Map.of("limit_reason", lookup.state().name().toLowerCase())
            );
        }
        if (!featureProperties.canContactWeatherUpstream()) {
            cache.abandon(cacheKey);
            return unavailable();
        }

        try {
            NormalizedWeather weather = provider.fetch(new WeatherProviderRequest(
                coordinates.latitude(),
                coordinates.longitude(),
                ZoneId.of("GMT"),
                PERSONAL_LOCATION_LABEL
            ));
            if (!provider.providerCode().equals(weather.providerCode())
                || !provider.attribution().equals(weather.attribution())
                || !PERSONAL_LOCATION_LABEL.equals(weather.locationLabel())) {
                throw new IllegalArgumentException("nearby weather provider identity is invalid");
            }
            Instant fetchedAt = clock.instant();
            SiteWeatherSnapshot snapshot = new SiteWeatherSnapshot(
                PERSONAL_LOCATION_LABEL,
                weather.temperature(),
                weather.apparentTemperature(),
                weather.relativeHumidity(),
                weather.weatherCode(),
                weather.windSpeed(),
                weather.forecast(),
                weather.observedAt(),
                fetchedAt,
                SiteWeatherFreshness.FRESH,
                weather.attribution()
            );
            cache.complete(cacheKey, snapshot);
            return snapshot;
        } catch (RuntimeException exception) {
            cache.abandon(cacheKey);
            return unavailable();
        }
    }

    private Coordinates validateAndNormalize(
        BigDecimal latitude,
        BigDecimal longitude,
        boolean explicitConsent
    ) {
        if (!explicitConsent) {
            throw badRequest("explicit geolocation consent is required");
        }
        if (latitude == null || latitude.compareTo(BigDecimal.valueOf(-90)) < 0
            || latitude.compareTo(BigDecimal.valueOf(90)) > 0) {
            throw badRequest("latitude is outside the geographic range");
        }
        if (longitude == null || longitude.compareTo(BigDecimal.valueOf(-180)) < 0
            || longitude.compareTo(BigDecimal.valueOf(180)) > 0) {
            throw badRequest("longitude is outside the geographic range");
        }
        int precision = properties.getCoordinatePrecision();
        return new Coordinates(
            latitude.setScale(precision, RoundingMode.HALF_UP),
            longitude.setScale(precision, RoundingMode.HALF_UP)
        );
    }

    private String anonymousCellKey(Coordinates coordinates) {
        String normalized = coordinates.latitude().toPlainString()
            + ":" + coordinates.longitude().toPlainString();
        try {
            byte[] digest = MessageDigest.getInstance("SHA-256")
                .digest(normalized.getBytes(StandardCharsets.UTF_8));
            return HexFormat.of().formatHex(digest);
        } catch (NoSuchAlgorithmException exception) {
            throw new IllegalStateException("nearby weather location hashing is unavailable", exception);
        }
    }

    private SiteWeatherSnapshot unavailable() {
        return new SiteWeatherSnapshot(
            PERSONAL_LOCATION_LABEL,
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

    private BusinessException badRequest(String message) {
        return new BusinessException(ErrorCode.BAD_REQUEST, message);
    }

    private record Coordinates(BigDecimal latitude, BigDecimal longitude) {
    }
}
