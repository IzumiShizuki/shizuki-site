package io.github.shizuki.site.content.response;

import java.time.LocalDateTime;

public record LightAppWhiteboardResponse(
    Long whiteboardId,
    String title,
    String boardKind,
    String documentJson,
    Long thumbnailAssetId,
    int sortNum,
    LocalDateTime updatedAt
) {
}
