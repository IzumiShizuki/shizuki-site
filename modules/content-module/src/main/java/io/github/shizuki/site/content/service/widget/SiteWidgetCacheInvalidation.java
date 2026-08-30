package io.github.shizuki.site.content.service.widget;

/** Exact cache namespaces affected by a committed widget configuration mutation. */
public record SiteWidgetCacheInvalidation(
    Long previousLocationId,
    long activeLocationId,
    boolean weatherChanged,
    boolean quoteSourceChanged
) {
}
