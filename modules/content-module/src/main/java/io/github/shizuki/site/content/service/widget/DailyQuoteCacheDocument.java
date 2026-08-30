package io.github.shizuki.site.content.service.widget;

import java.time.LocalDate;

record DailyQuoteCacheDocument(LocalDate requestedDate, DailyQuoteView view) {

    DailyQuoteCacheDocument {
        if (requestedDate == null || view == null) {
            throw new IllegalArgumentException("invalid daily quote cache document");
        }
    }
}
