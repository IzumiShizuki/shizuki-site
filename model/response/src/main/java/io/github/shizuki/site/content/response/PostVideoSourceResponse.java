package io.github.shizuki.site.content.response;

import java.util.List;
import java.util.Map;

public record PostVideoSourceResponse(
    String sourceUrl,
    String platform,
    String title,
    String author,
    Integer durationSeconds,
    String thumbnailUrl,
    List<ChapterItem> chapters,
    List<String> availableSubtitles,
    List<String> availableAutoCaptions,
    boolean needsCookies,
    Map<String, Object> metadata
) {
    public record ChapterItem(
        String title,
        Double start,
        Double end
    ) {
    }
}
