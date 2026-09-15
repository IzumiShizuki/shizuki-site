package io.github.shizuki.site.media.service.playback;

import java.io.InputStream;

/**
 * 已打开的上游音乐流及其可透传响应元数据。
 */
public record MusicPlaybackStream(
    InputStream inputStream,
    int statusCode,
    String contentType,
    long contentLength,
    String contentRange,
    String acceptRanges
) {
}
