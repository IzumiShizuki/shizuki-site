package io.github.shizuki.site.notification;

import java.util.Optional;

/** Empty means unavailable, withdrawn or not anonymously readable. */
public interface NotificationContentResolver {
    Optional<Content> resolve(String kind, String sourceId);
    record Content(Long authorId, String title, String summary, String readingPath) {}
}
