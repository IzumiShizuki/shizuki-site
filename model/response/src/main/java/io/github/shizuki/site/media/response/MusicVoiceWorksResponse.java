package io.github.shizuki.site.media.response;

import io.swagger.v3.oas.annotations.media.Schema;
import java.util.List;

/**
 * 音声作品搜索响应。
 */
@Schema(description = "音声作品搜索响应")
public record MusicVoiceWorksResponse(
    @Schema(description = "作品列表") List<MusicVoiceWorkItemResponse> items,
    @Schema(description = "页码") int page,
    @Schema(description = "每页数量") int limit,
    @Schema(description = "是否有更多") boolean hasMore,
    @Schema(description = "当前结果窗口可用标签") List<MusicVoiceTagResponse> availableTags
) {
}
