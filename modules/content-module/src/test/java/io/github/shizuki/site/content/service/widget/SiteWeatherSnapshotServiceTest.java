package io.github.shizuki.site.content.service.widget;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.lenient;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.site.content.config.ExternalWidgetFeatureProperties;
import io.github.shizuki.site.content.entity.SiteLocationEntity;
import io.github.shizuki.site.content.entity.SiteWidgetConfigEntity;
import io.github.shizuki.site.content.entity.WeatherSnapshotEntity;
import io.github.shizuki.site.content.mapper.SiteLocationMapper;
import io.github.shizuki.site.content.mapper.SiteWidgetConfigMapper;
import io.github.shizuki.site.content.mapper.WeatherSnapshotMapper;
import io.github.shizuki.site.content.provider.ProviderAttribution;
import io.github.shizuki.site.content.provider.weather.NormalizedWeather;
import io.github.shizuki.site.content.provider.weather.NormalizedWeatherDay;
import io.github.shizuki.site.content.provider.weather.WeatherProvider;
import io.github.shizuki.site.content.provider.weather.WeatherProviderRequest;
import java.math.BigDecimal;
import java.net.URI;
import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class SiteWeatherSnapshotServiceTest {

    private static final Instant NOW = Instant.parse("2026-08-28T10:00:00Z");
    private static final ProviderAttribution ATTRIBUTION = new ProviderAttribution(
        "Open-Meteo",
        URI.create("https://open-meteo.com")
    );

    @Mock
    private SiteWidgetConfigMapper configMapper;
    @Mock
    private SiteLocationMapper locationMapper;
    @Mock
    private WeatherSnapshotMapper snapshotMapper;
    @Mock
    private WeatherProvider provider;
    @Mock
    private SiteWeatherRedisStore redisStore;

    private ObjectMapper objectMapper;
    private ExternalWidgetFeatureProperties features;
    private SiteWeatherSnapshotService service;

    @BeforeEach
    void setUp() {
        objectMapper = new ObjectMapper().findAndRegisterModules();
        features = new ExternalWidgetFeatureProperties();
        features.setEnabled(true);
        features.setWeatherEnabled(true);
        features.setUpstreamRequestsEnabled(true);
        features.afterPropertiesSet();
        SiteWeatherCacheProperties cacheProperties = new SiteWeatherCacheProperties();
        cacheProperties.afterPropertiesSet();
        lenient().when(provider.providerCode()).thenReturn("OPEN_METEO");
        lenient().when(provider.attribution()).thenReturn(ATTRIBUTION);
        service = new SiteWeatherSnapshotService(
            configMapper,
            locationMapper,
            snapshotMapper,
            provider,
            redisStore,
            cacheProperties,
            features,
            objectMapper,
            Clock.fixed(NOW, ZoneOffset.UTC)
        );
        prepareConfiguredLocation(360);
    }

    @Test
    void freshRedisSnapshotAvoidsDatabaseAndUpstream() throws Exception {
        NormalizedWeather weather = weather(NOW.minusSeconds(120));
        when(redisStore.get(31L)).thenReturn(objectMapper.writeValueAsString(
            new SiteWeatherCacheDocument(31L, weather, NOW.minusSeconds(300))
        ));

        SiteWeatherSnapshot result = service.getSiteWeather();

        assertThat(result.freshness()).isEqualTo(SiteWeatherFreshness.FRESH);
        assertThat(result.locationLabel()).isEqualTo("上海");
        assertThat(result.observedAt()).isEqualTo(NOW.minusSeconds(120));
        assertThat(result.fetchedAt()).isEqualTo(NOW.minusSeconds(300));
        assertThat(result.attribution()).isEqualTo(ATTRIBUTION);
        verify(snapshotMapper, never()).selectRecentByLocationId(anyLong(), anyInt());
        verify(provider, never()).fetch(any(WeatherProviderRequest.class));
    }

    @Test
    void redisFailureUsesDatabaseOnlyAndNeverContactsUpstream() throws Exception {
        when(redisStore.get(31L)).thenThrow(new IllegalStateException("redis unavailable"));
        when(snapshotMapper.selectRecentByLocationId(31L, 8))
            .thenReturn(List.of(entity(NOW.minusSeconds(1_800), NOW.minusSeconds(1_920))));

        SiteWeatherSnapshot result = service.getSiteWeather();

        assertThat(result.freshness()).isEqualTo(SiteWeatherFreshness.STALE);
        assertThat(result.fetchedAt()).isEqualTo(NOW.minusSeconds(1_800));
        verify(redisStore, never()).tryAcquireRefresh(anyLong(), any(), any());
        verify(provider, never()).fetch(any(WeatherProviderRequest.class));
    }

    @Test
    void expiredFreshnessRefreshesBehindLeaseAndPersistsBeforeCaching() throws Exception {
        when(redisStore.get(31L)).thenReturn(null);
        when(snapshotMapper.selectRecentByLocationId(31L, 8))
            .thenReturn(List.of(entity(NOW.minusSeconds(1_800), NOW.minusSeconds(1_920))));
        when(redisStore.tryAcquireRefresh(eq(31L), any(), any())).thenReturn(true);
        when(provider.fetch(any(WeatherProviderRequest.class))).thenReturn(weather(NOW.minusSeconds(60)));
        when(snapshotMapper.insert(any(WeatherSnapshotEntity.class))).thenReturn(1);

        SiteWeatherSnapshot result = service.getSiteWeather();

        assertThat(result.freshness()).isEqualTo(SiteWeatherFreshness.FRESH);
        assertThat(result.fetchedAt()).isEqualTo(NOW);
        ArgumentCaptor<WeatherSnapshotEntity> inserted = ArgumentCaptor.forClass(WeatherSnapshotEntity.class);
        verify(snapshotMapper).insert(inserted.capture());
        assertThat(inserted.getValue().getSiteLocationId()).isEqualTo(31L);
        assertThat(inserted.getValue().getObservedAt())
            .isEqualTo(LocalDateTime.ofInstant(NOW.minusSeconds(60), ZoneOffset.UTC));
        assertThat(inserted.getValue().getPayloadJson())
            .contains("OPEN_METEO", "Open-Meteo")
            .doesNotContain("latitude", "longitude");
        verify(redisStore).put(eq(31L), any(), any());
        verify(redisStore).releaseRefresh(eq(31L), any());
    }

    @Test
    void providerFailureReturnsUsableLastGoodAsStaleWithOriginalTimes() throws Exception {
        when(redisStore.get(31L)).thenReturn(null);
        when(snapshotMapper.selectRecentByLocationId(31L, 8))
            .thenReturn(List.of(entity(NOW.minusSeconds(3_600), NOW.minusSeconds(3_720))));
        when(redisStore.tryAcquireRefresh(eq(31L), any(), any())).thenReturn(true);
        when(provider.fetch(any(WeatherProviderRequest.class)))
            .thenThrow(new BusinessException(ErrorCode.UPSTREAM_UNAVAILABLE, "provider down"));

        SiteWeatherSnapshot result = service.getSiteWeather();

        assertThat(result.freshness()).isEqualTo(SiteWeatherFreshness.STALE);
        assertThat(result.observedAt()).isEqualTo(NOW.minusSeconds(3_720));
        assertThat(result.fetchedAt()).isEqualTo(NOW.minusSeconds(3_600));
        verify(snapshotMapper, never()).insert(any(WeatherSnapshotEntity.class));
        verify(redisStore).releaseRefresh(eq(31L), any());
    }

    @Test
    void expiredLastGoodReportsUnavailableWithoutDeletingDiagnosticFact() throws Exception {
        when(redisStore.get(31L)).thenReturn(null);
        when(snapshotMapper.selectRecentByLocationId(31L, 8))
            .thenReturn(List.of(entity(NOW.minusSeconds(7 * 3_600L), NOW.minusSeconds(7 * 3_600L + 60))));
        when(redisStore.tryAcquireRefresh(eq(31L), any(), any())).thenReturn(true);
        when(provider.fetch(any(WeatherProviderRequest.class)))
            .thenThrow(new BusinessException(ErrorCode.UPSTREAM_UNAVAILABLE, "provider down"));

        SiteWeatherSnapshot result = service.getSiteWeather();

        assertThat(result.freshness()).isEqualTo(SiteWeatherFreshness.UNAVAILABLE);
        assertThat(result.temperature()).isNull();
        assertThat(result.observedAt()).isNull();
        assertThat(result.forecast()).isEmpty();
        assertThat(result.attribution()).isEqualTo(ATTRIBUTION);
        verify(snapshotMapper, never()).deleteById(any());
    }

    @Test
    void busyRefreshLeaseReturnsLastGoodWithoutDuplicateProviderWork() throws Exception {
        when(redisStore.get(31L)).thenReturn(null);
        when(snapshotMapper.selectRecentByLocationId(31L, 8))
            .thenReturn(List.of(entity(NOW.minusSeconds(1_800), NOW.minusSeconds(1_920))));
        when(redisStore.tryAcquireRefresh(eq(31L), any(), any())).thenReturn(false);

        SiteWeatherSnapshot result = service.getSiteWeather();

        assertThat(result.freshness()).isEqualTo(SiteWeatherFreshness.STALE);
        verify(provider, never()).fetch(any(WeatherProviderRequest.class));
        verify(redisStore, never()).releaseRefresh(anyLong(), any());
    }

    @Test
    void noSnapshotAndFailedRefreshReturnUnavailableWithoutCreatingAFact() {
        when(redisStore.get(31L)).thenReturn(null);
        when(snapshotMapper.selectRecentByLocationId(31L, 8)).thenReturn(List.of());
        when(redisStore.tryAcquireRefresh(eq(31L), any(), any())).thenReturn(true);
        when(provider.fetch(any(WeatherProviderRequest.class)))
            .thenThrow(new BusinessException(ErrorCode.UPSTREAM_UNAVAILABLE, "provider down"));

        SiteWeatherSnapshot result = service.getSiteWeather();

        assertThat(result.freshness()).isEqualTo(SiteWeatherFreshness.UNAVAILABLE);
        assertThat(result.temperature()).isNull();
        assertThat(result.fetchedAt()).isNull();
        verify(snapshotMapper, never()).insert(any(WeatherSnapshotEntity.class));
        verify(redisStore).releaseRefresh(eq(31L), any());
    }

    @Test
    void missingEnabledSiteLocationReturnsHonestUnavailableState() {
        when(locationMapper.selectById(31L)).thenReturn(null);

        SiteWeatherSnapshot result = service.getSiteWeather();

        assertThat(result.freshness()).isEqualTo(SiteWeatherFreshness.UNAVAILABLE);
        assertThat(result.locationLabel()).isNull();
        verify(redisStore, never()).get(anyLong());
        verify(provider, never()).fetch(any(WeatherProviderRequest.class));
    }

    private void prepareConfiguredLocation(int maxStaleMinutes) {
        SiteWidgetConfigEntity config = new SiteWidgetConfigEntity();
        config.setSingletonKey("SITE");
        config.setActiveLocationId(31L);
        config.setWeatherEnabled(true);
        config.setWeatherMaxStaleMinutes(maxStaleMinutes);
        config.setDeleted(0);
        config.setVersion(2);
        when(configMapper.selectById("SITE")).thenReturn(config);

        SiteLocationEntity location = new SiteLocationEntity();
        location.setId(31L);
        location.setDisplayName("上海");
        location.setLatitude(new BigDecimal("31.230400"));
        location.setLongitude(new BigDecimal("121.473700"));
        location.setTimezone("Asia/Shanghai");
        location.setEnabled(true);
        location.setDeleted(0);
        when(locationMapper.selectById(31L)).thenReturn(location);
    }

    private WeatherSnapshotEntity entity(Instant fetchedAt, Instant observedAt) throws Exception {
        WeatherSnapshotEntity entity = new WeatherSnapshotEntity();
        entity.setId(91L);
        entity.setSiteLocationId(31L);
        entity.setProviderCode("OPEN_METEO");
        entity.setPayloadJson(objectMapper.writeValueAsString(weather(observedAt)));
        entity.setObservedAt(LocalDateTime.ofInstant(observedAt, ZoneOffset.UTC));
        entity.setFetchedAt(LocalDateTime.ofInstant(fetchedAt, ZoneOffset.UTC));
        entity.setDeleted(0);
        return entity;
    }

    private NormalizedWeather weather(Instant observedAt) {
        return new NormalizedWeather(
            "OPEN_METEO",
            "上海",
            28.5,
            31.2,
            73,
            3,
            11.4,
            observedAt,
            List.of(new NormalizedWeatherDay(LocalDate.of(2026, 8, 28), 25, 32, 3, 20)),
            ATTRIBUTION
        );
    }
}
