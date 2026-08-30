package io.github.shizuki.site.content.config;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 天气与今日一言组件的发布和上游访问总闸。
 */
@Component
@ConfigurationProperties(prefix = "shizuki.site.external-widgets")
public class ExternalWidgetFeatureProperties implements InitializingBean {

    private boolean enabled = false;
    private boolean weatherEnabled = false;
    private boolean quoteEnabled = false;
    private boolean upstreamRequestsEnabled = false;
    private long connectTimeoutMs = 2_000L;
    private long readTimeoutMs = 5_000L;
    private int maxResponseBytes = 262_144;

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public boolean isWeatherEnabled() {
        return weatherEnabled;
    }

    public void setWeatherEnabled(boolean weatherEnabled) {
        this.weatherEnabled = weatherEnabled;
    }

    public boolean isQuoteEnabled() {
        return quoteEnabled;
    }

    public void setQuoteEnabled(boolean quoteEnabled) {
        this.quoteEnabled = quoteEnabled;
    }

    public boolean isUpstreamRequestsEnabled() {
        return upstreamRequestsEnabled;
    }

    public void setUpstreamRequestsEnabled(boolean upstreamRequestsEnabled) {
        this.upstreamRequestsEnabled = upstreamRequestsEnabled;
    }

    public long getConnectTimeoutMs() {
        return connectTimeoutMs;
    }

    public void setConnectTimeoutMs(long connectTimeoutMs) {
        this.connectTimeoutMs = connectTimeoutMs;
    }

    public long getReadTimeoutMs() {
        return readTimeoutMs;
    }

    public void setReadTimeoutMs(long readTimeoutMs) {
        this.readTimeoutMs = readTimeoutMs;
    }

    public int getMaxResponseBytes() {
        return maxResponseBytes;
    }

    public void setMaxResponseBytes(int maxResponseBytes) {
        this.maxResponseBytes = maxResponseBytes;
    }

    public boolean canContactUpstream() {
        return enabled && upstreamRequestsEnabled && (weatherEnabled || quoteEnabled);
    }

    public boolean canContactWeatherUpstream() {
        return canContactUpstream() && weatherEnabled;
    }

    public boolean canContactQuoteUpstream() {
        return canContactUpstream() && quoteEnabled;
    }

    @Override
    public void afterPropertiesSet() {
        if (!enabled && (weatherEnabled || quoteEnabled || upstreamRequestsEnabled)) {
            throw new IllegalStateException(
                "shizuki.site.external-widgets.enabled must be true before child capabilities are enabled"
            );
        }
        if (upstreamRequestsEnabled && !weatherEnabled && !quoteEnabled) {
            throw new IllegalStateException(
                "external widget upstream requests require at least one enabled widget"
            );
        }
        if (connectTimeoutMs < 100L || connectTimeoutMs > 10_000L) {
            throw new IllegalStateException("external widget connect-timeout-ms must be between 100 and 10000");
        }
        if (readTimeoutMs < connectTimeoutMs || readTimeoutMs > 30_000L) {
            throw new IllegalStateException(
                "external widget read-timeout-ms must be >= connect-timeout-ms and <= 30000"
            );
        }
        if (maxResponseBytes < 1_024 || maxResponseBytes > 2_097_152) {
            throw new IllegalStateException("external widget max-response-bytes must be between 1024 and 2097152");
        }
    }
}
