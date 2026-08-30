package io.github.shizuki.site.content.provider.weather;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.site.content.config.ExternalWidgetFeatureProperties;
import io.github.shizuki.site.content.provider.BoundedProviderJsonParser;
import io.github.shizuki.site.content.provider.ExternalWidgetProviderPolicies;
import io.github.shizuki.site.content.provider.ProviderHttpTransport;
import java.io.ByteArrayInputStream;
import java.math.BigDecimal;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.time.Instant;
import java.time.ZoneId;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class OpenMeteoWeatherProviderTest {

    @Mock
    private ProviderHttpTransport transport;

    private ExternalWidgetFeatureProperties features;
    private OpenMeteoWeatherProvider provider;

    @BeforeEach
    void setUp() {
        features = new ExternalWidgetFeatureProperties();
        provider = new OpenMeteoWeatherProvider(
            transport,
            new BoundedProviderJsonParser(new ObjectMapper()),
            features
        );
    }

    @Test
    void featureGatePreventsAnyNetworkRequest() {
        assertThatThrownBy(() -> provider.fetch(request()))
            .isInstanceOfSatisfying(BusinessException.class, exception ->
                assertThat(exception.getErrorCode()).isEqualTo(ErrorCode.FEATURE_DISABLED));

        verify(transport, never()).get(any(), any());
    }

    @Test
    void fixedEndpointAndStrictPayloadProduceNormalizedWeather() {
        enableWeatherUpstream();
        when(transport.get(any(), eq(ExternalWidgetProviderPolicies.OPEN_METEO)))
            .thenReturn(stream(validPayload()));

        NormalizedWeather weather = provider.fetch(request());

        ArgumentCaptor<URI> endpoint = ArgumentCaptor.forClass(URI.class);
        verify(transport).get(endpoint.capture(), eq(ExternalWidgetProviderPolicies.OPEN_METEO));
        assertThat(endpoint.getValue().getScheme()).isEqualTo("https");
        assertThat(endpoint.getValue().getHost()).isEqualTo("api.open-meteo.com");
        assertThat(endpoint.getValue().getPath()).isEqualTo("/v1/forecast");
        assertThat(endpoint.getValue().getRawQuery())
            .contains("latitude=31.2304", "longitude=121.4737", "timezone=Asia%2FShanghai")
            .doesNotContain("url=", "host=");
        assertThat(weather.providerCode()).isEqualTo("OPEN_METEO");
        assertThat(weather.locationLabel()).isEqualTo("上海");
        assertThat(weather.temperature()).isEqualTo(28.5D);
        assertThat(weather.observedAt()).isEqualTo(Instant.parse("2026-08-28T02:15:00Z"));
        assertThat(weather.forecast()).hasSize(2);
        assertThat(weather.attribution().name()).isEqualTo("Open-Meteo");
    }

    @Test
    void unexpectedSchemaOrUnitIsRejectedAsUnavailable() {
        enableWeatherUpstream();
        when(transport.get(any(), eq(ExternalWidgetProviderPolicies.OPEN_METEO)))
            .thenReturn(stream(validPayload().replace("\"km/h\"", "\"m/s\"")));

        assertThatThrownBy(() -> provider.fetch(request()))
            .isInstanceOfSatisfying(BusinessException.class, exception ->
                assertThat(exception.getErrorCode()).isEqualTo(ErrorCode.UPSTREAM_UNAVAILABLE));
    }

    @Test
    void transportTimeoutIsNormalizedAsUnavailableWithoutPartialWeather() {
        enableWeatherUpstream();
        when(transport.get(any(), eq(ExternalWidgetProviderPolicies.OPEN_METEO)))
            .thenThrow(new IllegalStateException("read timeout"));

        assertThatThrownBy(() -> provider.fetch(request()))
            .isInstanceOfSatisfying(BusinessException.class, exception -> {
                assertThat(exception.getErrorCode()).isEqualTo(ErrorCode.UPSTREAM_UNAVAILABLE);
                assertThat(exception.getMessage()).doesNotContain("timeout");
            });
    }

    private void enableWeatherUpstream() {
        features.setEnabled(true);
        features.setWeatherEnabled(true);
        features.setUpstreamRequestsEnabled(true);
        features.afterPropertiesSet();
    }

    private WeatherProviderRequest request() {
        return new WeatherProviderRequest(
            new BigDecimal("31.230400"),
            new BigDecimal("121.473700"),
            ZoneId.of("Asia/Shanghai"),
            "上海"
        );
    }

    private ByteArrayInputStream stream(String payload) {
        return new ByteArrayInputStream(payload.getBytes(StandardCharsets.UTF_8));
    }

    private String validPayload() {
        return """
            {
              "latitude": 31.25,
              "longitude": 121.5,
              "generationtime_ms": 0.05,
              "utc_offset_seconds": 28800,
              "timezone": "Asia/Shanghai",
              "timezone_abbreviation": "GMT+8",
              "elevation": 4.0,
              "current_units": {
                "time": "iso8601",
                "interval": "seconds",
                "temperature_2m": "°C",
                "relative_humidity_2m": "%",
                "apparent_temperature": "°C",
                "weather_code": "wmo code",
                "wind_speed_10m": "km/h"
              },
              "current": {
                "time": "2026-08-28T10:15",
                "interval": 900,
                "temperature_2m": 28.5,
                "relative_humidity_2m": 73,
                "apparent_temperature": 31.2,
                "weather_code": 3,
                "wind_speed_10m": 11.4
              },
              "daily_units": {
                "time": "iso8601",
                "weather_code": "wmo code",
                "temperature_2m_max": "°C",
                "temperature_2m_min": "°C",
                "precipitation_probability_max": "%"
              },
              "daily": {
                "time": ["2026-08-28", "2026-08-29"],
                "weather_code": [3, 61],
                "temperature_2m_max": [32.0, 30.0],
                "temperature_2m_min": [25.0, 24.0],
                "precipitation_probability_max": [20, 65]
              }
            }
            """;
    }
}
