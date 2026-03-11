package io.github.shizuki.site.content.dto;

import java.time.LocalDateTime;

public record LightAppUrlLinkResponse(
    Long urlLinkId,
    String title,
    String url,
    String iconMode,
    Long iconAssetId,
    String faviconUrl,
    int sortNum,
    LocalDateTime updatedAt
) {
}
