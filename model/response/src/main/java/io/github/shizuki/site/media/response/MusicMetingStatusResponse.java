package io.github.shizuki.site.media.response;

import io.swagger.v3.oas.annotations.media.Schema;
import java.util.List;

/**
 * Meting sidecar 状态响应。
 */
@Schema(description = "Meting sidecar 状态响应")
public record MusicMetingStatusResponse(
    @Schema(description = "sidecar 是否可用") boolean available,
    @Schema(description = "sidecar 支持的平台列表") List<String> providers
) {
}
