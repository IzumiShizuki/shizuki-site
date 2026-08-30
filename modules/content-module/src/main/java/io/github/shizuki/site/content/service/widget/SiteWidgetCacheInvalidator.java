package io.github.shizuki.site.content.service.widget;

/** Targeted invalidation port shared with the later snapshot cache implementation. */
@FunctionalInterface
public interface SiteWidgetCacheInvalidator {

    void invalidate(SiteWidgetCacheInvalidation invalidation);
}
