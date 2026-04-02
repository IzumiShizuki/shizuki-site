package io.github.shizuki.site.content.response;

import java.time.LocalDateTime;

public record LightAppWhiteboardSummaryResponse(
    Long whiteboardId,
    String title,
    String boardKind,
    Long thumbnailAssetId,
    int sortNum,
    LocalDateTime updatedAt
) {
}
