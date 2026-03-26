package io.github.shizuki.site.ai.dto;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

public record AiTownAssetPreviewResponse(
    Long assetImportId,
    String assetCode,
    String sourceName,
    String assetType,
    String parserStatus,
    Long rawSizeBytes,
    String attachedSceneCode,
    List<String> previewHighlights,
    Map<String, Object> metadata,
    Map<String, Object> preview,
    LocalDateTime updatedAt
) {
}
