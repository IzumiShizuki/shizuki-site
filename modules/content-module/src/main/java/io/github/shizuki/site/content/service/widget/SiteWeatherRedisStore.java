package io.github.shizuki.site.content.service.widget;

import java.time.Duration;

/** Exact-key Redis cache and lease boundary for site weather refreshes. */
public interface SiteWeatherRedisStore {

    String get(long locationId);

    void put(long locationId, String payload, Duration ttl);

    void evict(long locationId);

    boolean tryAcquireRefresh(long locationId, String token, Duration ttl);

    void releaseRefresh(long locationId, String token);
}
