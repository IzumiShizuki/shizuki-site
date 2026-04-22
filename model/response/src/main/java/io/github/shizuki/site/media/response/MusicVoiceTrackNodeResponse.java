package io.github.shizuki.site.media.response;

import io.swagger.v3.oas.annotations.media.Schema;
import java.util.List;

/**
 * 音声音轨树节点。
 */
@Schema(description = "音声音轨树节点")
public record MusicVoiceTrackNodeResponse(
    @Schema(description = "节点类型（folder/audio/text）") String nodeType,
    @Schema(description = "标题") String title,
    @Schema(description = "哈希（audio/text 节点）") String hash,
    @Schema(description = "媒体流地址") String mediaStreamUrl,
    @Schema(description = "低码率媒体流地址") String streamLowQualityUrl,
    @Schema(description = "媒体下载地址") String mediaDownloadUrl,
    @Schema(description = "时长（秒）") Double durationSec,
    @Schema(description = "子节点") List<MusicVoiceTrackNodeResponse> children
) {
}
