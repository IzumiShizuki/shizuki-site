package io.github.shizuki.site.content.service.widget;

import java.time.Duration;
import java.util.Objects;
import java.util.Set;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/** Privacy and abuse-control bounds for explicitly consented nearby weather. */
@Component
@ConfigurationProperties(prefix = "shizuki.site.nearby-weather")
public class NearbyWeatherProperties implements InitializingBean {

    private int coordinatePrecision = 2;
    private Duration cacheTtl = Duration.ofMinutes(5);
    private int maxCacheEntries = 512;
    private int callerCapacity = 6;
    private int callerRefillPerMinute = 12;
    private int globalCapacity = 120;
    private int globalRefillPerMinute = 120;
    private int maxLocalCallerBuckets = 4_096;
    private Duration bucketTtl = Duration.ofMinutes(10);
    private String callerKeySecret = "development-nearby-caller-key";
    /**
     * Transport peers that are explicitly allowed to supply the original caller address.
     * Empty by default so public clients cannot forge rate-limit identities with proxy headers.
     */
    private Set<String> trustedProxyAddresses = Set.of();

    public int getCoordinatePrecision() {
        return coordinatePrecision;
    }

    public void setCoordinatePrecision(int coordinatePrecision) {
        this.coordinatePrecision = coordinatePrecision;
    }

    public Duration getCacheTtl() {
        return cacheTtl;
    }

    public void setCacheTtl(Duration cacheTtl) {
        this.cacheTtl = cacheTtl;
    }

    public int getMaxCacheEntries() {
        return maxCacheEntries;
    }

    public void setMaxCacheEntries(int maxCacheEntries) {
        this.maxCacheEntries = maxCacheEntries;
    }

    public int getCallerCapacity() {
        return callerCapacity;
    }

    public void setCallerCapacity(int callerCapacity) {
        this.callerCapacity = callerCapacity;
    }

    public int getCallerRefillPerMinute() {
        return callerRefillPerMinute;
    }

    public void setCallerRefillPerMinute(int callerRefillPerMinute) {
        this.callerRefillPerMinute = callerRefillPerMinute;
    }

    public int getGlobalCapacity() {
        return globalCapacity;
    }

    public void setGlobalCapacity(int globalCapacity) {
        this.globalCapacity = globalCapacity;
    }

    public int getGlobalRefillPerMinute() {
        return globalRefillPerMinute;
    }

    public void setGlobalRefillPerMinute(int globalRefillPerMinute) {
        this.globalRefillPerMinute = globalRefillPerMinute;
    }

    public int getMaxLocalCallerBuckets() {
        return maxLocalCallerBuckets;
    }

    public void setMaxLocalCallerBuckets(int maxLocalCallerBuckets) {
        this.maxLocalCallerBuckets = maxLocalCallerBuckets;
    }

    public Duration getBucketTtl() {
        return bucketTtl;
    }

    public void setBucketTtl(Duration bucketTtl) {
        this.bucketTtl = bucketTtl;
    }

    public String getCallerKeySecret() {
        return callerKeySecret;
    }

    public void setCallerKeySecret(String callerKeySecret) {
        this.callerKeySecret = callerKeySecret;
    }

    public Set<String> getTrustedProxyAddresses() {
        return trustedProxyAddresses;
    }

    public void setTrustedProxyAddresses(Set<String> trustedProxyAddresses) {
        if (trustedProxyAddresses == null) {
            this.trustedProxyAddresses = Set.of();
            return;
        }
        this.trustedProxyAddresses = trustedProxyAddresses.stream()
            .filter(Objects::nonNull)
            .map(String::trim)
            .filter(value -> !value.isEmpty())
            .collect(java.util.stream.Collectors.toUnmodifiableSet());
    }

    @Override
    public void afterPropertiesSet() {
        if (coordinatePrecision < 0 || coordinatePrecision > 4) {
            throw new IllegalStateException("nearby weather coordinate precision must be between 0 and 4");
        }
        if (cacheTtl == null || cacheTtl.compareTo(Duration.ofSeconds(30)) < 0
            || cacheTtl.compareTo(Duration.ofMinutes(15)) > 0) {
            throw new IllegalStateException("nearby weather cache TTL must be between 30 seconds and 15 minutes");
        }
        if (maxCacheEntries < 16 || maxCacheEntries > 10_000
            || maxLocalCallerBuckets < 16 || maxLocalCallerBuckets > 100_000) {
            throw new IllegalStateException("nearby weather cache or caller-key bound is invalid");
        }
        requirePositive(callerCapacity, "caller capacity");
        requirePositive(callerRefillPerMinute, "caller refill");
        requirePositive(globalCapacity, "global capacity");
        requirePositive(globalRefillPerMinute, "global refill");
        if (bucketTtl == null || bucketTtl.compareTo(Duration.ofMinutes(1)) < 0
            || bucketTtl.compareTo(Duration.ofHours(1)) > 0) {
            throw new IllegalStateException("nearby weather bucket TTL must be between 1 minute and 1 hour");
        }
        if (callerKeySecret == null || callerKeySecret.trim().length() < 16) {
            throw new IllegalStateException("nearby weather caller-key secret must contain at least 16 characters");
        }
        callerKeySecret = callerKeySecret.trim();
    }

    private void requirePositive(int value, String field) {
        if (value <= 0 || value > 100_000) {
            throw new IllegalStateException("nearby weather " + field + " is invalid");
        }
    }
}
