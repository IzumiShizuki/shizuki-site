package io.github.shizuki.common.ratelimit.support;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class LocalRateLimiter {

    /**
     * 按 key 维护本地固定窗口计数器。
     */
    private final Map<String, WindowCounter> counter = new ConcurrentHashMap<>();

    /**
     * 固定窗口限流算法：
     * 1. 每个 key 对应一个窗口开始时间 + 计数。
     * 2. 窗口过期后重置计数。
     * 3. 当前窗口内计数超过 limit 即拒绝。
     */
    public boolean tryAcquire(String key, int limit, int windowSeconds) {
        long nowSeconds = System.currentTimeMillis() / 1000;
        WindowCounter windowCounter = counter.computeIfAbsent(key, ignored -> new WindowCounter(nowSeconds, 0));
        // 针对同一 key 的窗口计数更新需要串行，避免并发下超发。
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
