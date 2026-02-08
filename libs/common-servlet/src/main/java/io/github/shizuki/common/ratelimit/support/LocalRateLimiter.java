package io.github.shizuki.common.ratelimit.support;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class LocalRateLimiter {

    private final Map<String, WindowCounter> counter = new ConcurrentHashMap<>();

    public boolean tryAcquire(String key, int limit, int windowSeconds) {
        long nowSeconds = System.currentTimeMillis() / 1000;
        WindowCounter windowCounter = counter.computeIfAbsent(key, ignored -> new WindowCounter(nowSeconds, 0));
        synchronized (windowCounter) {
            if (nowSeconds - windowCounter.windowStart >= windowSeconds) {
                windowCounter.windowStart = nowSeconds;
                windowCounter.count = 0;
            }
            windowCounter.count++;
            return windowCounter.count <= limit;
        }
    }

    private static class WindowCounter {
        private long windowStart;
        private int count;

        private WindowCounter(long windowStart, int count) {
            this.windowStart = windowStart;
            this.count = count;
        }
    }
}
