package io.github.shizuki.site.media.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import java.util.List;

/**
 * 音乐搜索聚合结果。
 */
@Schema(description = "音乐搜索聚合结果")
public record MusicSearchResponse(
    @Schema(description = "搜索词") String query,
    @Schema(description = "筛选类型（all/playlist/track/artist）") String type,
    @Schema(description = "页码") int page,
    @Schema(description = "每页数量") int limit,
    @Schema(description = "是否部分成功") boolean partial,
    @Schema(description = "失败平台列表") List<String> failedProviders,
    @Schema(description = "歌单是否还有下一页") boolean hasMorePlaylists,
    @Schema(description = "歌曲是否还有下一页") boolean hasMoreTracks,
    @Schema(description = "歌手是否还有下一页") boolean hasMoreArtists,
    @Schema(description = "歌单结果") List<MusicPlaylistSummaryResponse> playlists,
    @Schema(description = "曲目结果") List<MusicSearchTrackResponse> tracks,
    @Schema(description = "歌手结果") List<MusicSearchArtistResponse> artists
) {
}
