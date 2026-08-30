package io.github.shizuki.site.content.service.widget;

import java.time.Duration;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/** Coordination bounds for the immutable daily quote snapshot job. */
@Component
@ConfigurationProperties(prefix = "shizuki.site.daily-quote")
public class DailyQuoteSnapshotProperties implements InitializingBean {

    private Duration refreshLockTtl = Duration.ofSeconds(45);

    public Duration getRefreshLockTtl() {
        return refreshLockTtl;
    }

    public void setRefreshLockTtl(Duration refreshLockTtl) {
        this.refreshLockTtl = refreshLockTtl;
    }

    @Override
    public void afterPropertiesSet() {
        if (refreshLockTtl == null || refreshLockTtl.compareTo(Duration.ofSeconds(10)) < 0
            || refreshLockTtl.compareTo(Duration.ofMinutes(2)) > 0) {
            throw new IllegalStateException("daily quote refresh-lock-ttl must be between 10 seconds and 2 minutes");
        }
    }
}
