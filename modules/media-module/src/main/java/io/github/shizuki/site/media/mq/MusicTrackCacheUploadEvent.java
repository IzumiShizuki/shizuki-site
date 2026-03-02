package io.github.shizuki.site.media.mq;

/**
 * 音乐曲目缓存上传事件。
 *
 * @param provider provider 编码
 * @param trackId 曲目 ID
 * @param sourceAudioUrl 源音频地址
 * @param title 歌曲标题（用于生成对象名）
 * @param artist 歌手名称（用于生成对象名）
 */
public record MusicTrackCacheUploadEvent(
    String provider,
    String trackId,
    String sourceAudioUrl,
    String title,
    String artist
) {
}
