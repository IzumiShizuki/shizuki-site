package io.github.shizuki.site.media.response;

import io.swagger.v3.oas.annotations.media.Schema;
import java.util.List;

/**
 * 音声作品聚合详情。
 */
@Schema(description = "音声作品聚合详情")
public record MusicVoiceWorkBundleResponse(
    @Schema(description = "作品详情") MusicVoiceWorkDetailResponse work,
    @Schema(description = "音轨树") List<MusicVoiceTrackNodeResponse> trackTree,
    @Schema(description = "可播放音轨") List<MusicVoicePlayableTrackResponse> playableTracks
) {
}
