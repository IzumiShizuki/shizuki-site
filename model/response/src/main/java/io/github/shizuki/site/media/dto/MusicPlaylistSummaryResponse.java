package io.github.shizuki.site.media.dto;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * 音乐歌单摘要响应。
 */
@Schema(description = "音乐歌单摘要响应")
public record MusicPlaylistSummaryResponse(
    @Schema(description = "歌单业务编码") String playlistCode,
    @Schema(description = "歌单名称") String name,
    @Schema(description = "歌单简介") String description,
    @Schema(description = "歌单封面 URL") String cover,
    @Schema(description = "歌单类型（DEFAULT/LIKED/CUSTOM）") String playlistType,
    @Schema(description = "所属用户 ID，默认歌单为 0") Long ownerUserId,
    @Schema(description = "是否公开") boolean isPublic,
    @Schema(description = "曲目数量") int trackCount
) {
}
