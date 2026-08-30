package io.github.shizuki.site.content.service.widget;

import java.time.Instant;
import java.time.LocalDate;

/** Visitor-safe quote projection with immutable snapshot provenance. */
public record DailyQuoteView(
    Long snapshotId,
    Long localQuoteId,
    LocalDate effectiveDate,
    String text,
    String author,
    String sourceTitle,
    String categoryCode,
    String providerCode,
    String providerUuid,
    String sourceUrl,
    Instant fetchedAt,
    DailyQuoteState state
) {

    public DailyQuoteView {
        if (state == null) {
            throw new IllegalArgumentException("daily quote state is required");
        }
        if (state == DailyQuoteState.UNAVAILABLE) {
            snapshotId = null;
            localQuoteId = null;
            effectiveDate = null;
            text = null;
            author = null;
            sourceTitle = null;
            categoryCode = null;
            providerCode = null;
            providerUuid = null;
            sourceUrl = null;
            fetchedAt = null;
        } else if (text == null || text.isBlank() || providerCode == null || providerCode.isBlank()) {
            throw new IllegalArgumentException("available daily quote requires text and provider provenance");
        }
    }
}
