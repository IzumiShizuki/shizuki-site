package io.github.shizuki.site.content.controller;

import io.github.shizuki.common.core.response.ApiResponse;
import io.github.shizuki.site.content.request.NearbyWeatherRequest;
import io.github.shizuki.site.content.service.widget.NearbyWeatherCallerKeyResolver;
import io.github.shizuki.site.content.service.widget.NearbyWeatherService;
import io.github.shizuki.site.content.service.widget.SiteWeatherSnapshot;
import io.github.shizuki.site.content.service.widget.SiteWeatherSnapshotService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import java.time.Duration;
import org.springframework.http.CacheControl;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/site/weather")
public class SiteWeatherController {

    private static final CacheControl SITE_CACHE = CacheControl.maxAge(Duration.ofMinutes(5))
        .cachePublic();

    private final SiteWeatherSnapshotService siteWeatherService;
    private final NearbyWeatherService nearbyWeatherService;
    private final NearbyWeatherCallerKeyResolver callerKeyResolver;

    public SiteWeatherController(
        SiteWeatherSnapshotService siteWeatherService,
        NearbyWeatherService nearbyWeatherService,
        NearbyWeatherCallerKeyResolver callerKeyResolver
    ) {
        this.siteWeatherService = siteWeatherService;
        this.nearbyWeatherService = nearbyWeatherService;
        this.callerKeyResolver = callerKeyResolver;
    }

    @GetMapping
    public ResponseEntity<ApiResponse<SiteWeatherSnapshot>> siteWeather() {
        return ResponseEntity.ok()
            .cacheControl(SITE_CACHE)
            .body(ApiResponse.success(siteWeatherService.getSiteWeather()));
    }

    @PostMapping("/nearby")
    public ResponseEntity<ApiResponse<SiteWeatherSnapshot>> nearbyWeather(
        @Valid @RequestBody NearbyWeatherRequest request,
        HttpServletRequest servletRequest
    ) {
        SiteWeatherSnapshot snapshot = nearbyWeatherService.getNearbyWeather(
            request.latitude(),
            request.longitude(),
            request.consent(),
            callerKeyResolver.resolve(servletRequest)
        );
        return ResponseEntity.ok()
            .header(HttpHeaders.CACHE_CONTROL, "private, no-store, max-age=0")
            .header(HttpHeaders.PRAGMA, "no-cache")
            .body(ApiResponse.success(snapshot));
    }
}
