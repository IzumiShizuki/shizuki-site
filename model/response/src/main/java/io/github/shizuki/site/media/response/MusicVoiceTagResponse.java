package io.github.shizuki.site.media.response;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * 音声标签。
 */
@Schema(description = "音声标签")
public record MusicVoiceTagResponse(
    @Schema(description = "标签 ID") long tagId,
    @Schema(description = "标签名称") String name
) {
}
