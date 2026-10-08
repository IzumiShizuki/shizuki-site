package io.github.shizuki.site.media.service.impl;

import com.fasterxml.jackson.databind.JsonNode;
import java.time.Duration;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

/** Bounded detail cache with shared loads and an automatic enrichment budget. */
final class WallhavenMetadataCache {
    private final Map<String, Entry> entries = new LinkedHashMap<>(16, 0.75f, true);
    private final ConcurrentHashMap<String, CompletableFuture<JsonNode>> pending = new ConcurrentHashMap<>();
    private final LongSupplier nanoTime;
    private long windowStart;
    private int automaticRequests;

    WallhavenMetadataCache() { this(System::nanoTime); }
    WallhavenMetadataCache(LongSupplier nanoTime) {
        this.nanoTime = nanoTime;
        this.windowStart = nanoTime.getAsLong();
    }

    synchronized JsonNode get(String id) {
        Entry entry = entries.get(id);
        if (entry == null) return null;
        if (nanoTime.getAsLong() - entry.expiresAt() >= 0) {
            entries.remove(id);
            return null;
        }
        return entry.data();
    }

    JsonNode load(String id, Supplier<JsonNode> loader, boolean automatic) {
        JsonNode cached = get(id);
        if (cached != null) return cached;
        CompletableFuture<JsonNode> future = new CompletableFuture<>();
        CompletableFuture<JsonNode> existing = pending.putIfAbsent(id, future);
        if (existing != null) {
            try { return existing.join(); }
            catch (CompletionException exception) { throw (RuntimeException) exception.getCause(); }
        }
        try {
            cached = get(id);
            if (cached != null) { future.complete(cached); return cached; }
            if (automatic && !reserveAutomaticRequest()) { future.complete(null); return null; }
            JsonNode data = loader.get();
            synchronized (this) {
                entries.put(id, new Entry(data, nanoTime.getAsLong() + Duration.ofHours(6).toNanos()));
                while (entries.size() > 512) entries.remove(entries.keySet().iterator().next());
            }
            future.complete(data);
            return data;
        } catch (RuntimeException exception) {
            future.completeExceptionally(exception);
            throw exception;
        } finally { pending.remove(id, future); }
    }

    private synchronized boolean reserveAutomaticRequest() {
        long now = nanoTime.getAsLong();
        if (now - windowStart >= Duration.ofMinutes(1).toNanos()) {
            windowStart = now;
            automaticRequests = 0;
        }
        if (automaticRequests >= 30) return false;
        automaticRequests++;
        return true;
    }

    private record Entry(JsonNode data, long expiresAt) { }
}
