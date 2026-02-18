package io.github.shizuki.site.media.dto;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * 选歌响应。
 */
@Schema(description = "音乐选歌响应")
public record MusicPickResponse(
    @Schema(description = "Provider 编码") String provider,
    @Schema(description = "返回曲目") MusicTrackResponse track,
    @Schema(description = "是否命中缓存") boolean fromCache,
    @Schema(description = "配额快照") MusicPickQuotaResponse quota
) {
}
