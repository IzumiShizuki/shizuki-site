package io.github.shizuki.site.monolith.config;

import java.util.ArrayList;
import java.util.List;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
@ConfigurationProperties(prefix = "shizuki.gateway.auth")
public class GatewayAuthProperties {

    private boolean enabled = true;
    private long cacheTtlSeconds = 30L;
    private int cacheMaxEntries = 10000;
    private GuestInvalidTokenPolicy guestInvalidTokenPolicy = GuestInvalidTokenPolicy.DOWNGRADE;
    private List<String> publicPaths = new ArrayList<>();
    private List<String> guestPaths = new ArrayList<>();

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public long getCacheTtlSeconds() {
        return cacheTtlSeconds;
    }

    public void setCacheTtlSeconds(long cacheTtlSeconds) {
        this.cacheTtlSeconds = Math.max(1L, cacheTtlSeconds);
    }

    public int getCacheMaxEntries() {
        return cacheMaxEntries;
    }

    public void setCacheMaxEntries(int cacheMaxEntries) {
        this.cacheMaxEntries = Math.max(100, cacheMaxEntries);
    }

    public GuestInvalidTokenPolicy getGuestInvalidTokenPolicy() {
        return guestInvalidTokenPolicy;
    }

    public void setGuestInvalidTokenPolicy(String guestInvalidTokenPolicy) {
        this.guestInvalidTokenPolicy = GuestInvalidTokenPolicy.from(guestInvalidTokenPolicy);
    }

    public List<String> getPublicPaths() {
        return publicPaths;
    }

    public void setPublicPaths(List<String> publicPaths) {
        this.publicPaths = publicPaths;
    }

    public List<String> getGuestPaths() {
        return guestPaths;
    }

    public void setGuestPaths(List<String> guestPaths) {
        this.guestPaths = guestPaths;
    }

    public enum GuestInvalidTokenPolicy {
        DOWNGRADE,
        REJECT;

        public static GuestInvalidTokenPolicy from(String raw) {
            if (!StringUtils.hasText(raw)) {
                return DOWNGRADE;
            }
            for (GuestInvalidTokenPolicy policy : values()) {
                if (policy.name().equalsIgnoreCase(raw.trim())) {
                    return policy;
                }
            }
            return DOWNGRADE;
        }
    }
}
