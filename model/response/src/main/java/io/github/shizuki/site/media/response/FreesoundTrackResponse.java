package io.github.shizuki.site.media.response;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Freesound 环境音搜索结果响应。
 */
@Schema(description = "Freesound 环境音搜索结果响应")
public record FreesoundTrackResponse(
    @Schema(description = "Freesound 音频 ID") String soundId,
    @Schema(description = "标题") String title,
    @Schema(description = "上传者") String author,
    @Schema(description = "可直接播放的预览地址（mp3）") String previewUrl,
    @Schema(description = "许可证编码，如 cc0 / by") String license,
    @Schema(description = "许可证展示名") String licenseName,
    @Schema(description = "是否需要署名") boolean attributionRequired,
    @Schema(description = "Freesound 详情页地址") String pageUrl,
    @Schema(description = "时长（秒）") double duration
) {
}
