package io.github.shizuki.site.user.service;

import org.junit.jupiter.api.Test;
import java.time.Duration;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Supplier;
import static org.assertj.core.api.Assertions.*;

class PixivPreviewCacheTest {
    @Test void expiresFromDownloadTimeEvenWhenFrequentlyRead() {
        AtomicLong clock = new AtomicLong();
        AtomicInteger downloads = new AtomicInteger();
        var cache = new PixivPreviewCache(100, 10, Duration.ofMillis(10), clock::get);
        var image = image(1, downloads);
        cache.getOrLoad("a", image);
        clock.set(9);
        cache.getOrLoad("a", image);
        clock.set(10);
        cache.getOrLoad("a", image);
        assertThat(downloads).hasValue(2);
    }

    @Test void evictsLeastRecentlyUsedEntriesAtEntryLimit() {
        AtomicInteger downloads = new AtomicInteger();
        var cache = new PixivPreviewCache(100, 2, Duration.ofHours(1), () -> 0);
        var image = image(1, downloads);
        cache.getOrLoad("a", image);
        cache.getOrLoad("b", image);
        cache.getOrLoad("a", image);
        cache.getOrLoad("c", image);
        cache.getOrLoad("a", image);
        assertThat(downloads).hasValue(3);
        cache.getOrLoad("b", image);
        assertThat(downloads).hasValue(4);
    }

    @Test void evictsByByteBudgetAndDoesNotRetainOversizedImages() {
        AtomicInteger downloads = new AtomicInteger();
        var cache = new PixivPreviewCache(5, 10, Duration.ofHours(1), () -> 0);
        var image = image(3, downloads);
        cache.getOrLoad("a", image);
        cache.getOrLoad("b", image);
        cache.getOrLoad("b", image);
        assertThat(downloads).hasValue(2);
        cache.getOrLoad("a", image);
        assertThat(downloads).hasValue(3);
        cache.getOrLoad("large", image(6, downloads));
        cache.getOrLoad("large", image(6, downloads));
        assertThat(downloads).hasValue(5);
        cache.getOrLoad("a", image);
        assertThat(downloads).hasValue(5);
    }

    @Test void dropsExpiredEntriesBeforeEvictingFreshImages() {
        AtomicLong clock = new AtomicLong();
        AtomicInteger downloads = new AtomicInteger();
        var cache = new PixivPreviewCache(6, 2, Duration.ofMillis(10), clock::get);
        var image = image(3, downloads);
        cache.getOrLoad("expired", image);
        clock.set(5);
        cache.getOrLoad("fresh", image);
        cache.getOrLoad("expired", image);
        clock.set(10);
        cache.getOrLoad("new", image);
        cache.getOrLoad("fresh", image);
        assertThat(downloads).hasValue(3);
    }

    private Supplier<PixivClient.Preview> image(int bytes, AtomicInteger downloads) {
        return () -> {
            downloads.incrementAndGet();
            return new PixivClient.Preview(new byte[bytes], "image/jpeg");
        };
    }
}
