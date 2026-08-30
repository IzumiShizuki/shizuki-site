package io.github.shizuki.site.content.service.widget;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Locale;

public enum DailyQuoteState {
    CURRENT,
    STALE,
    LOCAL_ALTERNATIVE,
    UNAVAILABLE;

    @JsonValue
    public String code() {
        return name().toLowerCase(Locale.ROOT);
    }
}
