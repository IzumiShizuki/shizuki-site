package io.github.shizuki.site.user.service;

import java.time.Duration;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

/** Bounded public-image storage. Callers must verify current artwork metadata before accessing it. */
final class PixivPreviewCache {
    private final Map<String, Entry> entries = new LinkedHashMap<>(16, 0.75f, true);
    private final Object[] downloadLocks = new Object[16];
    private final long maxBytes;
    private final int maxEntries;
    private final long lifetimeMillis;
    private final LongSupplier clock;
    private long storedBytes;

    PixivPreviewCache() {
        this(64L * 1024 * 1024, 64, Duration.ofHours(24), System::currentTimeMillis);
    }

    PixivPreviewCache(long maxBytes, int maxEntries, Duration lifetime, LongSupplier clock) {
        if (maxBytes <= 0 || maxEntries <= 0 || lifetime.toMillis() <= 0) {
            throw new IllegalArgumentException("Preview cache limits must be positive");
        }
        this.maxBytes = maxBytes;
        this.maxEntries = maxEntries;
        this.lifetimeMillis = lifetime.toMillis();
        this.clock = clock;
        for (int i = 0; i < downloadLocks.length; i++) downloadLocks[i] = new Object();
    }

    PixivClient.Preview getOrLoad(String url, Supplier<PixivClient.Preview> download) {
        PixivClient.Preview cached = get(url);
        if (cached != null) return cached;
        // Fixed stripes avoid an unbounded lock map; no network operation holds the cache-map lock.
        synchronized (downloadLocks[Math.floorMod(url.hashCode(), downloadLocks.length)]) {
            cached = get(url);
            if (cached != null) return cached;
            PixivClient.Preview loaded = download.get();
            put(url, loaded);
            return loaded;
        }
    }

    private synchronized PixivClient.Preview get(String url) {
        Entry entry = entries.get(url);
        if (entry == null) return null;
        if (entry.expiresAt() <= clock.getAsLong()) {
            storedBytes -= entries.remove(url).preview().bytes().length;
            return null;
        }
        return entry.preview();
    }

    private synchronized void put(String url, PixivClient.Preview preview) {
        if (preview.bytes().length > maxBytes) return;
        long now = clock.getAsLong();
        var iterator = entries.values().iterator();
        while (iterator.hasNext()) {
            Entry entry = iterator.next();
            if (entry.expiresAt() <= now) {
                storedBytes -= entry.preview().bytes().length;
                iterator.remove();
            }
        }
        Entry previous = entries.remove(url);
        if (previous != null) storedBytes -= previous.preview().bytes().length;
        while (entries.size() >= maxEntries || storedBytes + preview.bytes().length > maxBytes) {
            var eldest = entries.values().iterator();
            storedBytes -= eldest.next().preview().bytes().length;
            eldest.remove();
        }
        entries.put(url, new Entry(preview, now + lifetimeMillis));
        storedBytes += preview.bytes().length;
    }

    private record Entry(PixivClient.Preview preview, long expiresAt) { }
}
