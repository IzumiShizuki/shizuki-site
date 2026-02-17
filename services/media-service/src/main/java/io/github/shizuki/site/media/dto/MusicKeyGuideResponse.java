package io.github.shizuki.site.media.dto;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * API Key 引导响应。
 */
@Schema(description = "API Key 引导响应")
public record MusicKeyGuideResponse(
    @Schema(description = "Provider 编码") String provider,
    @Schema(description = "引导标题") String title,
    @Schema(description = "引导内容") String content,
    @Schema(description = "引导链接") String link
) {
}
