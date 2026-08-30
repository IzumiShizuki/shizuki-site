package io.github.shizuki.site.content.service.widget;

import java.time.Clock;
import java.time.Instant;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/** Bounded, process-local cache of anonymous normalized nearby-weather cells. */
@Component
public class NearbyWeatherCache {

    private final NearbyWeatherProperties properties;
    private final Clock clock;
    private final LinkedHashMap<String, Entry> entries = new LinkedHashMap<>(16, 0.75F, true);

    @Autowired
    public NearbyWeatherCache(NearbyWeatherProperties properties) {
        this(properties, Clock.systemUTC());
    }

    NearbyWeatherCache(NearbyWeatherProperties properties, Clock clock) {
        this.properties = properties;
        this.clock = clock;
    }

    public synchronized Lookup lookupOrReserve(String key) {
        Instant now = clock.instant();
        Entry existing = entries.get(key);
        if (existing != null && !existing.expiresAt().isAfter(now)) {
            entries.remove(key);
            existing = null;
        }
        if (existing != null) {
            return existing.snapshot() == null
                ? new Lookup(State.BUSY, null)
                : new Lookup(State.HIT, existing.snapshot());
        }
        purgeExpired(now);
        if (entries.size() >= properties.getMaxCacheEntries()) {
            return new Lookup(State.FULL, null);
        }
        entries.put(key, new Entry(null, now.plus(properties.getCacheTtl())));
        return new Lookup(State.RESERVED, null);
    }

    public synchronized void complete(String key, SiteWeatherSnapshot snapshot) {
        Entry entry = entries.get(key);
        if (entry != null && entry.snapshot() == null) {
            entries.put(key, new Entry(snapshot, clock.instant().plus(properties.getCacheTtl())));
        }
    }

    public synchronized void abandon(String key) {
        Entry entry = entries.get(key);
        if (entry != null && entry.snapshot() == null) {
            entries.remove(key);
        }
    }

    private void purgeExpired(Instant now) {
        Iterator<Map.Entry<String, Entry>> iterator = entries.entrySet().iterator();
        while (iterator.hasNext()) {
            if (!iterator.next().getValue().expiresAt().isAfter(now)) {
                iterator.remove();
            }
        }
    }

    public enum State {
        HIT,
        RESERVED,
        BUSY,
        FULL
    }

    public record Lookup(State state, SiteWeatherSnapshot snapshot) {
    }

    private record Entry(SiteWeatherSnapshot snapshot, Instant expiresAt) {
    }
}
