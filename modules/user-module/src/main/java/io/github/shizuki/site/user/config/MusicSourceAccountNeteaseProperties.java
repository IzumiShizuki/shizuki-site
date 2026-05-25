package io.github.shizuki.site.user.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "shizuki.music.source-account.netease")
public class MusicSourceAccountNeteaseProperties {

    private boolean manualCookieFallbackEnabled = false;

    public boolean isManualCookieFallbackEnabled() {
        return manualCookieFallbackEnabled;
    }

    public void setManualCookieFallbackEnabled(boolean manualCookieFallbackEnabled) {
        this.manualCookieFallbackEnabled = manualCookieFallbackEnabled;
    }
}
