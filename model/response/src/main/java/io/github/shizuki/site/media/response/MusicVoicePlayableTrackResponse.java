package io.github.shizuki.site.media.response;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * 音声可播放音轨。
 */
@Schema(description = "音声可播放音轨")
public record MusicVoicePlayableTrackResponse(
    @Schema(description = "播放器 trackId（workId|hash）") String trackId,
    @Schema(description = "原始 hash") String hash,
    @Schema(description = "音轨标题") String title,
    @Schema(description = "音轨路径") String path,
    @Schema(description = "艺术家 / 社团") String artist,
    @Schema(description = "封面") String cover,
    @Schema(description = "歌词地址") String lyricUrl,
    @Schema(description = "时长（秒）") Integer durationSec,
    @Schema(description = "来源编号（如 RJ 号）") String sourceId,
    @Schema(description = "来源链接") String sourceUrl,
    @Schema(description = "作品标题") String workTitle
) {
}
