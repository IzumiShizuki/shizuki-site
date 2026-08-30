package io.github.shizuki.site.content.service.widget;

import java.time.Duration;
import java.time.LocalDate;

/** Cross-instance lease for resolving one immutable quote date. */
public interface DailyQuoteRefreshLock {

    boolean tryAcquire(LocalDate quoteDate, String token, Duration ttl);

    void release(LocalDate quoteDate, String token);
}
