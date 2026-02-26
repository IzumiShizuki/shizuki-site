package io.github.shizuki.site.media.dto;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * 音乐搜索曲目结果。
 */
@Schema(description = "音乐搜索曲目结果")
public record MusicSearchTrackResponse(
    @Schema(description = "曲目 ID") String trackId,
    @Schema(description = "Provider 编码") String provider,
    @Schema(description = "曲目标题") String title,
    @Schema(description = "歌手") String artist,
    @Schema(description = "专辑") String album,
    @Schema(description = "封面 URL") String cover,
    @Schema(description = "时长（秒）") Integer durationSec
) {
}
