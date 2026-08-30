package io.github.shizuki.site.content.service.widget;

import java.util.Locale;

public enum QuoteApprovalStatus {
    DRAFT,
    APPROVED,
    REJECTED;

    public static QuoteApprovalStatus parse(String value) {
        try {
            return valueOf(String.valueOf(value).trim().toUpperCase(Locale.ROOT));
        } catch (RuntimeException exception) {
            throw new IllegalArgumentException("quote approval status must be DRAFT, APPROVED, or REJECTED");
        }
    }
}
