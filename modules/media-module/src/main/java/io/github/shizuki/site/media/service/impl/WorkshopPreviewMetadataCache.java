package io.github.shizuki.site.media.service.impl;

import java.time.Duration;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.LongSupplier;

/** Bounded short-lived cache for preview URLs already returned by discovery search. */
final class WorkshopPreviewMetadataCache {

    private static final int DEFAULT_MAX_ENTRIES = 256;
    private static final Duration DEFAULT_TTL = Duration.ofMinutes(10);

    private final int maxEntries;
    private final long ttlNanos;
    private final LongSupplier nanoTime;
    private final Map<String, Entry> entries = new LinkedHashMap<>(16, 0.75f, true);

    WorkshopPreviewMetadataCache() {
        this(DEFAULT_MAX_ENTRIES, DEFAULT_TTL, System::nanoTime);
    }

    WorkshopPreviewMetadataCache(int maxEntries, Duration ttl, LongSupplier nanoTime) {
        if (maxEntries < 1 || ttl == null || ttl.isNegative() || ttl.isZero()) {
            throw new IllegalArgumentException("Preview metadata cache bounds must be positive");
        }
        this.maxEntries = maxEntries;
        this.ttlNanos = ttl.toNanos();
        this.nanoTime = nanoTime;
    }

    synchronized void put(String itemId, String previewUrl) {
        if (itemId == null || itemId.isBlank() || previewUrl == null || previewUrl.isBlank()) {
            return;
        }
        long expiresAt = nanoTime.getAsLong() + ttlNanos;
        entries.put(itemId, new Entry(previewUrl, expiresAt));
        while (entries.size() > maxEntries) {
            entries.remove(entries.keySet().iterator().next());
        }
    }

    synchronized String get(String itemId) {
        Entry entry = entries.get(itemId);
        if (entry == null) {
            return null;
        }
        if (nanoTime.getAsLong() - entry.expiresAtNanos() >= 0) {
            entries.remove(itemId);
            return null;
        }
        return entry.previewUrl();
    }

    synchronized int size() {
        return entries.size();
    }

    private record Entry(String previewUrl, long expiresAtNanos) {
    }
}
