package io.github.shizuki.site.media.dto;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * 音乐源账号歌单导入结果。
 */
@Schema(description = "音乐源账号歌单导入结果")
public record MusicSourcePlaylistImportResponse(
    @Schema(description = "来源 provider") String provider,
    @Schema(description = "导入歌单数量") int importedPlaylists,
    @Schema(description = "导入歌曲数量") int importedTracks,
    @Schema(description = "跳过歌单数量") int skippedPlaylists,
    @Schema(description = "失败歌单数量") int failedPlaylists
) {
}
