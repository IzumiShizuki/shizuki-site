package io.github.shizuki.site.content.service.widget;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.lenient;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.site.content.config.ExternalWidgetFeatureProperties;
import io.github.shizuki.site.content.provider.ProviderAttribution;
import io.github.shizuki.site.content.provider.weather.NormalizedWeather;
import io.github.shizuki.site.content.provider.weather.WeatherProvider;
import io.github.shizuki.site.content.provider.weather.WeatherProviderRequest;
import java.math.BigDecimal;
import java.net.URI;
import java.time.Clock;
import java.time.Instant;
import java.time.ZoneOffset;
import java.util.List;
import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class NearbyWeatherServiceTest {

    private static final Instant NOW = Instant.parse("2026-08-28T12:00:00Z");
    private static final ProviderAttribution ATTRIBUTION = new ProviderAttribution(
        "Open-Meteo",
        URI.create("https://open-meteo.com")
    );

    @Mock
    private WeatherProvider provider;
    @Mock
    private NearbyWeatherTrafficGuard trafficGuard;

    private NearbyWeatherService service;

    @BeforeEach
    void setUp() {
        NearbyWeatherProperties properties = new NearbyWeatherProperties();
        properties.afterPropertiesSet();
        ExternalWidgetFeatureProperties features = new ExternalWidgetFeatureProperties();
        features.setEnabled(true);
        features.setWeatherEnabled(true);
        features.setUpstreamRequestsEnabled(true);
        features.afterPropertiesSet();
        lenient().when(provider.providerCode()).thenReturn("OPEN_METEO");
        lenient().when(provider.attribution()).thenReturn(ATTRIBUTION);
        service = new NearbyWeatherService(
            provider,
            trafficGuard,
            new NearbyWeatherCache(properties, Clock.fixed(NOW, ZoneOffset.UTC)),
            properties,
            features,
            Clock.fixed(NOW, ZoneOffset.UTC)
        );
    }

    @Test
    void explicitConsentNormalizesCoordinatesAndReusesAnonymousCellCache() {
        when(provider.fetch(any(WeatherProviderRequest.class))).thenReturn(weather());

        SiteWeatherSnapshot first = service.getNearbyWeather(
            new BigDecimal("31.2341"),
            new BigDecimal("121.4762"),
            true,
            "caller-a"
        );
        SiteWeatherSnapshot second = service.getNearbyWeather(
            new BigDecimal("31.2310"),
            new BigDecimal("121.4790"),
            true,
            "caller-b"
        );

        assertThat(first.freshness()).isEqualTo(SiteWeatherFreshness.FRESH);
        assertThat(second).isEqualTo(first);
        assertThat(first.fetchedAt()).isEqualTo(NOW);
        ArgumentCaptor<WeatherProviderRequest> request = ArgumentCaptor.forClass(WeatherProviderRequest.class);
        verify(provider, times(1)).fetch(request.capture());
        assertThat(request.getValue().latitude()).isEqualByComparingTo("31.23");
        assertThat(request.getValue().longitude()).isEqualByComparingTo("121.48");
        assertThat(request.getValue().timezone().getId()).isEqualTo("GMT");
        verify(trafficGuard).acquire("caller-a");
        verify(trafficGuard).acquire("caller-b");
    }

    @Test
    void missingConsentOrOutOfRangeCoordinatesNeverConsumeTrafficOrContactProvider() {
        assertThatThrownBy(() -> service.getNearbyWeather(
            new BigDecimal("31.23"), new BigDecimal("121.47"), false, "caller"
        )).isInstanceOfSatisfying(BusinessException.class, exception ->
            assertThat(exception.getErrorCode()).isEqualTo(ErrorCode.BAD_REQUEST));
        assertThatThrownBy(() -> service.getNearbyWeather(
            new BigDecimal("91"), new BigDecimal("121.47"), true, "caller"
        )).isInstanceOfSatisfying(BusinessException.class, exception ->
            assertThat(exception.getErrorCode()).isEqualTo(ErrorCode.BAD_REQUEST));

        verify(trafficGuard, never()).acquire(any());
        verify(provider, never()).fetch(any(WeatherProviderRequest.class));
    }

    @Test
    void failedProviderReturnsUnavailableWithoutFabricatedReadings() {
        when(provider.fetch(any(WeatherProviderRequest.class)))
            .thenThrow(new BusinessException(ErrorCode.UPSTREAM_UNAVAILABLE, "timeout"));

        SiteWeatherSnapshot result = service.getNearbyWeather(
            new BigDecimal("31.23"), new BigDecimal("121.47"), true, "caller"
        );

        assertThat(result.freshness()).isEqualTo(SiteWeatherFreshness.UNAVAILABLE);
        assertThat(result.temperature()).isNull();
        assertThat(result.forecast()).isEmpty();
        assertThat(result.attribution()).isEqualTo(ATTRIBUTION);
    }

    @Test
    void nearbyPathHasNoDurableSnapshotOrSharedWeatherCacheDependency() {
        assertThat(Arrays.stream(NearbyWeatherService.class.getDeclaredFields())
            .map(field -> field.getType().getName()))
            .doesNotContain(
                "io.github.shizuki.site.content.mapper.WeatherSnapshotMapper",
                "io.github.shizuki.site.content.service.widget.SiteWeatherRedisStore"
            );
    }

    private NormalizedWeather weather() {
        return new NormalizedWeather(
            "OPEN_METEO",
            "你的位置附近",
            28.5,
            31.2,
            73,
            3,
            11.4,
            NOW.minusSeconds(60),
            List.of(),
            ATTRIBUTION
        );
    }
}
