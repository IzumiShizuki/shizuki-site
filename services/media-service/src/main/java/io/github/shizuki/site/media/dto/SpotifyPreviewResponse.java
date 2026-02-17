package io.github.shizuki.site.media.dto;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Spotify 预览链接响应。
 */
@Schema(description = "Spotify 预览链接响应")
public record SpotifyPreviewResponse(
    @Schema(description = "曲目 ID") String trackId,
    @Schema(description = "预览 URL") String previewUrl,
    @Schema(description = "Provider 编码") String provider,
    @Schema(description = "预览缺失时返回 MUSIC_SPOTIFY_PREVIEW_NOT_AVAILABLE，其余场景为空") String musicErrorCode
) {
}
