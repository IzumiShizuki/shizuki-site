package io.github.shizuki.site.content.service.widget;

/** Central cache-key contract; no wildcard deletion is permitted. */
public final class SiteWidgetCacheKeys {

    public static final String SITE_WEATHER_DEFAULT = "site:widgets:weather:default";
    public static final String DAILY_QUOTE_TODAY = "site:widgets:quote:today";

    private SiteWidgetCacheKeys() {
    }

    public static String siteWeatherLocation(long locationId) {
        if (locationId <= 0) {
            throw new IllegalArgumentException("locationId must be positive");
        }
        return "site:widgets:weather:location:" + locationId;
    }

    public static String siteWeatherRefreshLock(long locationId) {
        if (locationId <= 0) {
            throw new IllegalArgumentException("locationId must be positive");
        }
        return "site:widgets:weather:refresh-lock:" + locationId;
    }
}
