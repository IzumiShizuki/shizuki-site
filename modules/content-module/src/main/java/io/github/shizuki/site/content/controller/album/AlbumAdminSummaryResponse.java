package io.github.shizuki.site.content.controller.album;

import io.github.shizuki.site.life.model.LifeContentLifecycleEnum;
import io.github.shizuki.site.life.model.LifeContentVisibilityEnum;
import java.time.LocalDateTime;

public record AlbumAdminSummaryResponse(
    long id,
    String title,
    LifeContentLifecycleEnum lifecycle,
    LifeContentVisibilityEnum visibility,
    boolean featured,
    int photoCount,
    int version,
    String etag,
    LocalDateTime updatedAt
) {
}
