package io.github.shizuki.site.media.dto;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Spotify 搜索结果响应。
 */
@Schema(description = "Spotify 搜索结果响应")
public record SpotifyTrackResponse(
    @Schema(description = "曲目 ID") String trackId,
    @Schema(description = "标题") String title,
    @Schema(description = "歌手") String artist,
    @Schema(description = "预览 URL") String previewUrl,
    @Schema(description = "Provider 编码") String provider
) {
}
