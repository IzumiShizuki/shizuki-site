package io.github.shizuki.site.content.service.widget;

import java.time.Duration;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/** Bounded freshness and Redis coordination settings for durable site weather. */
@Component
@ConfigurationProperties(prefix = "shizuki.site.weather-cache")
public class SiteWeatherCacheProperties implements InitializingBean {

    private Duration freshFor = Duration.ofMinutes(15);
    private Duration valueTtl = Duration.ofMinutes(20);
    private Duration refreshLockTtl = Duration.ofSeconds(30);

    public Duration getFreshFor() {
        return freshFor;
    }

    public void setFreshFor(Duration freshFor) {
        this.freshFor = freshFor;
    }

    public Duration getValueTtl() {
        return valueTtl;
    }

    public void setValueTtl(Duration valueTtl) {
        this.valueTtl = valueTtl;
    }

    public Duration getRefreshLockTtl() {
        return refreshLockTtl;
    }

    public void setRefreshLockTtl(Duration refreshLockTtl) {
        this.refreshLockTtl = refreshLockTtl;
    }

    @Override
    public void afterPropertiesSet() {
        if (!positive(freshFor) || freshFor.compareTo(Duration.ofHours(1)) > 0) {
            throw new IllegalStateException("site weather fresh-for must be between 1 ms and 1 hour");
        }
        if (!positive(valueTtl) || valueTtl.compareTo(freshFor) < 0
            || valueTtl.compareTo(Duration.ofHours(2)) > 0) {
            throw new IllegalStateException("site weather value-ttl must cover fresh-for and be at most 2 hours");
        }
        if (refreshLockTtl == null || refreshLockTtl.compareTo(Duration.ofSeconds(5)) < 0
            || refreshLockTtl.compareTo(Duration.ofMinutes(2)) > 0) {
            throw new IllegalStateException("site weather refresh-lock-ttl must be between 5 seconds and 2 minutes");
        }
    }

    private boolean positive(Duration duration) {
        return duration != null && !duration.isZero() && !duration.isNegative();
    }
}
