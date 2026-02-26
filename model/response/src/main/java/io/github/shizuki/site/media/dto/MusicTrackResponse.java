package io.github.shizuki.site.media.dto;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * 音乐曲目响应。
 */
@Schema(description = "音乐曲目响应")
public record MusicTrackResponse(
    @Schema(description = "曲目 ID") String trackId,
    @Schema(description = "Provider 编码") String provider,
    @Schema(description = "标题") String title,
    @Schema(description = "歌手") String artist,
    @Schema(description = "封面 URL") String cover,
    @Schema(description = "音频 URL") String audio,
    @Schema(description = "歌词 URL") String lyric,
    @Schema(description = "排序值") int sort,
    @Schema(description = "是否启用") boolean enabled,
    @Schema(description = "内联歌词文本（无歌词 URL 时使用）") String lyricText
) {

    public MusicTrackResponse(String trackId,
                              String provider,
                              String title,
                              String artist,
                              String cover,
                              String audio,
                              String lyric,
                              int sort,
                              boolean enabled) {
        this(trackId, provider, title, artist, cover, audio, lyric, sort, enabled, "");
    }
}
