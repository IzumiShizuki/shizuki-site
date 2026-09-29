package io.github.shizuki.site.content.response;

import java.util.List;

/** Public published-post counts grouped by calendar day for one month. */
public record PostPublicationCalendarResponse(String month, List<DayCount> days) {
    public record DayCount(String date, long count) {}
}
