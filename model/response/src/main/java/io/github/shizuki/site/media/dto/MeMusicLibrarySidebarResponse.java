package io.github.shizuki.site.media.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import java.util.List;

/**
 * 我的音乐库侧栏聚合响应。
 */
@Schema(description = "我的音乐库侧栏聚合响应")
public record MeMusicLibrarySidebarResponse(
    @Schema(description = "默认歌单") MusicPlaylistSummaryResponse defaultPlaylist,
    @Schema(description = "我喜欢的歌单") MusicPlaylistSummaryResponse likedPlaylist,
    @Schema(description = "我创建的歌单") List<MusicPlaylistSummaryResponse> createdPlaylists,
    @Schema(description = "我收藏的歌单") List<MusicPlaylistSummaryResponse> collectedPlaylists
) {
}
