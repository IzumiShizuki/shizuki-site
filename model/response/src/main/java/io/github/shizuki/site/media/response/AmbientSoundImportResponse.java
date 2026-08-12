package io.github.shizuki.site.media.response;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "在线环境音导入结果")
public record AmbientSoundImportResponse(
    @Schema(description = "来源平台") String provider,
    @Schema(description = "来源平台音频 ID") String soundId,
    @Schema(description = "站内私有资产 ID") Long assetId,
    @Schema(description = "标题") String title,
    @Schema(description = "作者") String author,
    @Schema(description = "许可证编码") String license,
    @Schema(description = "许可证展示名") String licenseName,
    @Schema(description = "是否需要署名") boolean attributionRequired,
    @Schema(description = "Freesound 详情页") String pageUrl,
    @Schema(description = "时长（秒）") double duration,
    @Schema(description = "站内签名播放地址") String downloadUrl,
    @Schema(description = "签名地址有效期（秒）") Long expireSeconds,
    @Schema(description = "是否复用了已有导入") boolean alreadyImported
) {
}
