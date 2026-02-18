package io.github.shizuki.site.media.dto;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * 选歌后配额快照。
 */
@Schema(description = "选歌后配额快照")
public record MusicPickQuotaResponse(
    @Schema(description = "总次数") long total,
    @Schema(description = "已用次数") long used,
    @Schema(description = "剩余次数") long remaining
) {
}
