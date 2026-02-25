package io.github.shizuki.site.media.dto;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * 默认歌单资料响应。
 */
@Schema(description = "默认歌单资料响应")
public record MusicPlaylistProfileResponse(
    @Schema(description = "歌单业务编码") String playlistCode,
    @Schema(description = "歌单名称") String name,
    @Schema(description = "歌单简介") String description,
    @Schema(description = "歌单封面 URL") String cover
) {
}
