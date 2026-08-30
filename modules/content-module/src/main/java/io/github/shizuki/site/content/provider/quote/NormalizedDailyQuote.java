package io.github.shizuki.site.content.provider.quote;

import io.github.shizuki.site.content.provider.ProviderAttribution;
import java.net.URI;
import java.time.Instant;

/** 可写入不可变每日快照的归一化语录及来源。 */
public record NormalizedDailyQuote(
    String providerCode,
    String externalId,
    String text,
    String category,
    String author,
    String sourceTitle,
    URI sourceDestination,
    Instant fetchedAt,
    ProviderAttribution attribution
) {

    public NormalizedDailyQuote {
        if (providerCode == null || providerCode.isBlank()
            || externalId == null || externalId.isBlank() || externalId.length() > 128
            || text == null || text.isBlank() || text.length() > 1000
            || category == null || category.isBlank() || category.length() > 64
            || sourceDestination == null || !"https".equalsIgnoreCase(sourceDestination.getScheme())
            || fetchedAt == null
            || attribution == null) {
            throw new IllegalArgumentException("invalid normalized daily quote");
        }
        providerCode = providerCode.trim();
        externalId = externalId.trim();
        text = text.trim();
        category = category.trim();
        author = normalizeOptional(author, 256, "author");
        sourceTitle = normalizeOptional(sourceTitle, 256, "sourceTitle");
    }

    private static String normalizeOptional(String value, int maxLength, String field) {
        if (value == null || value.isBlank()) {
            return null;
        }
        String normalized = value.trim();
        if (normalized.length() > maxLength) {
            throw new IllegalArgumentException(field + " exceeds its normalized limit");
        }
        return normalized;
    }
}
