package io.github.shizuki.site.content.controller;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import io.github.shizuki.site.content.provider.ProviderAttribution;
import io.github.shizuki.site.content.request.NearbyWeatherRequest;
import io.github.shizuki.site.content.service.widget.NearbyWeatherCallerKeyResolver;
import io.github.shizuki.site.content.service.widget.NearbyWeatherService;
import io.github.shizuki.site.content.service.widget.SiteWeatherFreshness;
import io.github.shizuki.site.content.service.widget.SiteWeatherSnapshot;
import io.github.shizuki.site.content.service.widget.SiteWeatherSnapshotService;
import java.math.BigDecimal;
import java.net.URI;
import java.time.Instant;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpHeaders;
import org.springframework.mock.web.MockHttpServletRequest;

@ExtendWith(MockitoExtension.class)
class SiteWeatherControllerTest {

    @Mock
    private SiteWeatherSnapshotService siteWeatherService;
    @Mock
    private NearbyWeatherService nearbyWeatherService;
    @Mock
    private NearbyWeatherCallerKeyResolver callerKeyResolver;

    @Test
    void nearbyResponseIsPrivateNoStoreAndUsesPseudonymousCallerKey() {
        MockHttpServletRequest servletRequest = new MockHttpServletRequest();
        NearbyWeatherRequest request = new NearbyWeatherRequest(
            new BigDecimal("31.23"),
            new BigDecimal("121.47"),
            true
        );
        SiteWeatherSnapshot snapshot = snapshot();
        when(callerKeyResolver.resolve(servletRequest)).thenReturn("hashed-caller");
        when(nearbyWeatherService.getNearbyWeather(
            request.latitude(), request.longitude(), true, "hashed-caller"
        )).thenReturn(snapshot);

        var response = controller().nearbyWeather(request, servletRequest);

        assertThat(response.getHeaders().getCacheControl()).isEqualTo("private, no-store, max-age=0");
        assertThat(response.getHeaders().getFirst(HttpHeaders.PRAGMA)).isEqualTo("no-cache");
        assertThat(response.getBody().data()).isEqualTo(snapshot);
        verify(nearbyWeatherService).getNearbyWeather(
            request.latitude(), request.longitude(), true, "hashed-caller"
        );
    }

    private SiteWeatherController controller() {
        return new SiteWeatherController(siteWeatherService, nearbyWeatherService, callerKeyResolver);
    }

    private SiteWeatherSnapshot snapshot() {
        return new SiteWeatherSnapshot(
            "你的位置附近",
            28.5,
            31.2,
            73,
            3,
            11.4,
            List.of(),
            Instant.parse("2026-08-28T11:59:00Z"),
            Instant.parse("2026-08-28T12:00:00Z"),
            SiteWeatherFreshness.FRESH,
            new ProviderAttribution("Open-Meteo", URI.create("https://open-meteo.com"))
        );
    }
}
