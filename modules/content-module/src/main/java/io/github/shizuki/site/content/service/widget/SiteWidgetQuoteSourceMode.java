package io.github.shizuki.site.content.service.widget;

import java.util.Locale;

/** Persisted daily-quote source selection. */
public enum SiteWidgetQuoteSourceMode {
    HITOKOTO,
    LOCAL;

    public static SiteWidgetQuoteSourceMode parse(String raw) {
        try {
            return valueOf(String.valueOf(raw).trim().toUpperCase(Locale.ROOT));
        } catch (RuntimeException exception) {
            throw new IllegalArgumentException("quote source mode must be HITOKOTO or LOCAL");
        }
    }
}
