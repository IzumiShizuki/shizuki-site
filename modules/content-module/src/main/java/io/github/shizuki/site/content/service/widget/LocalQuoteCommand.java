package io.github.shizuki.site.content.service.widget;

/** Administrator-curated quote content and provenance. */
public record LocalQuoteCommand(
    String text,
    String author,
    String sourceTitle,
    String categoryCode,
    String providerCode,
    String providerUuid,
    String sourceUrl
) {
}
