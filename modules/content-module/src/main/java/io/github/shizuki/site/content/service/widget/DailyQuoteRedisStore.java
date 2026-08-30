package io.github.shizuki.site.content.service.widget;

import java.time.Duration;

public interface DailyQuoteRedisStore {

    String get();

    void put(String payload, Duration ttl);

    void evict();
}
