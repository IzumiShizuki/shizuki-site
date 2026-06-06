package io.github.shizuki.site.content.response;

import java.util.List;

public record PostVideoSummaryResponse(
    PostVideoSourceResponse source,
    String markdown,
    List<String> summary,
    List<TimelineItem> timeline,
    List<KeyframeItem> keyframes,
    List<OcrItem> ocr,
    PostVideoTranscriptResponse transcript,
    List<PostVideoToolStatus> toolStatus
) {
    public record TimelineItem(
        Double start,
        Double end,
        String title,
        String summary
    ) {
    }

    public record KeyframeItem(
        String id,
        Double timestamp,
        String description
    ) {
    }

    public record OcrItem(
        String frameId,
        Double timestamp,
        List<String> texts
    ) {
    }
}
