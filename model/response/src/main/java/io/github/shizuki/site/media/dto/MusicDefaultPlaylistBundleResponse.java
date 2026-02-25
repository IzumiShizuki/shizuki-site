package io.github.shizuki.site.media.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import java.util.List;

/**
 * 默认歌单聚合响应。
 */
@Schema(description = "默认歌单聚合响应")
public record MusicDefaultPlaylistBundleResponse(
    @Schema(description = "歌单资料") MusicPlaylistProfileResponse profile,
    @Schema(description = "曲目列表") List<MusicTrackResponse> tracks
) {
}
