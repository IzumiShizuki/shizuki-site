package io.github.shizuki.site.media.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.Duration;
import java.util.concurrent.atomic.AtomicLong;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WallhavenMetadataCacheTest {
    @Test
    void reusesMetadataAndDefersAutomaticMissesUntilBudgetResets() throws Exception {
        AtomicLong now = new AtomicLong();
        WallhavenMetadataCache cache = new WallhavenMetadataCache(now::get);
        var data = new ObjectMapper().readTree("{\"tags\":[{\"name\":\"Tokyo\"}]}");
        for (int i = 0; i < 30; i++) assertSame(data, cache.load("id" + i, () -> data, true));
        assertSame(data, cache.load("id0", () -> { throw new AssertionError("cache hit must not reload"); }, true));
        assertNull(cache.load("deferred", () -> { throw new AssertionError("budget must defer loader"); }, true));
        now.set(Duration.ofMinutes(1).toNanos());
        assertSame(data, cache.load("deferred", () -> data, true));
        now.set(Duration.ofHours(7).toNanos());
        assertNull(cache.get("id0"));
    }
}
