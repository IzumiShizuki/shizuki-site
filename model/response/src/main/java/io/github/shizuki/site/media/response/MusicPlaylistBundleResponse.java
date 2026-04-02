package io.github.shizuki.site.media.response;

import io.swagger.v3.oas.annotations.media.Schema;
import java.util.List;

/**
 * 音乐歌单聚合响应。
 */
@Schema(description = "音乐歌单聚合响应")
public record MusicPlaylistBundleResponse(
    @Schema(description = "歌单摘要") MusicPlaylistSummaryResponse profile,
    @Schema(description = "曲目列表") List<MusicTrackResponse> tracks
) {
}
