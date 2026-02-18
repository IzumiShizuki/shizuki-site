package io.github.shizuki.site.media.dto;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * 音乐 Provider 配置响应。
 */
@Schema(description = "音乐 Provider 配置响应")
public record MusicProviderResponse(
    @Schema(description = "Provider 编码") String provider,
    @Schema(description = "是否启用") boolean enabled,
    @Schema(description = "是否可见") boolean visible,
    @Schema(description = "排序值") int sort
) {
}
