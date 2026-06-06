package io.github.shizuki.site.content.response;

import java.util.List;

public record PostVideoTranscriptResponse(
    PostVideoSourceResponse source,
    String transcriptSource,
    List<SegmentItem> segments,
    FormatBundle formats,
    List<PostVideoToolStatus> toolStatus
) {
    public record SegmentItem(
        Double start,
        Double end,
        String text
    ) {
    }

    public record FormatBundle(
        String txt,
        String md,
        String srt,
        String vtt,
        List<SegmentItem> json
    ) {
    }
}
