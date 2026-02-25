package io.github.shizuki.site.media.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import java.util.List;

/**
 * 音乐库首页聚合响应。
 */
@Schema(description = "音乐库首页聚合响应")
public record MusicLibraryHomeResponse(
    @Schema(description = "推荐歌单列表") List<MusicPlaylistSummaryResponse> featuredPlaylists,
    @Schema(description = "推荐曲目列表") List<MusicTrackResponse> featuredTracks
) {
}
