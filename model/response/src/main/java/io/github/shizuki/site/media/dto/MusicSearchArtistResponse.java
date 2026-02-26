package io.github.shizuki.site.media.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import java.util.List;

/**
 * 音乐搜索歌手结果。
 */
@Schema(description = "音乐搜索歌手结果")
public record MusicSearchArtistResponse(
    @Schema(description = "歌手名称") String name,
    @Schema(description = "命中曲目数") int hitCount,
    @Schema(description = "来源平台") List<String> providers
) {
}
