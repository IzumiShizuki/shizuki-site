package io.github.shizuki.site.media.service.impl;

import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.concurrent.atomic.AtomicLong;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class WorkshopPreviewMetadataCacheTest {

    @Test
    void expiresEntriesAndEvictsLeastRecentlyUsedWhenAtCapacity() {
        AtomicLong clock = new AtomicLong();
        WorkshopPreviewMetadataCache cache = new WorkshopPreviewMetadataCache(2, Duration.ofSeconds(5), clock::get);
        cache.put("101", "https://cdn.example.test/101.jpg");
        cache.put("102", "https://cdn.example.test/102.jpg");
        assertEquals("https://cdn.example.test/101.jpg", cache.get("101"));
        cache.put("103", "https://cdn.example.test/103.jpg");

        assertNull(cache.get("102"));
        assertEquals("https://cdn.example.test/101.jpg", cache.get("101"));
        assertEquals("https://cdn.example.test/103.jpg", cache.get("103"));
        clock.set(Duration.ofSeconds(6).toNanos());
        assertNull(cache.get("101"));
        assertNull(cache.get("103"));
        assertEquals(0, cache.size());
    }
}
