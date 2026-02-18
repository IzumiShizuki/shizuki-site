package io.github.shizuki.site.media.dto;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * 音乐配额响应。
 */
@Schema(description = "音乐配额响应")
public record MusicQuotaResponse(
    @Schema(description = "配额编码") String quotaCode,
    @Schema(description = "总次数") long total,
    @Schema(description = "已用次数") long used,
    @Schema(description = "剩余次数") long remaining,
    @Schema(description = "是否绑定 API Key") boolean keyBound,
    @Schema(description = "上传总字节额度") long uploadBytesTotal,
    @Schema(description = "上传已用字节") long uploadBytesUsed,
    @Schema(description = "上传剩余字节") long uploadBytesRemaining
) {
}
