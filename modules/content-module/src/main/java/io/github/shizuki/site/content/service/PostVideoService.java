package io.github.shizuki.site.content.service;

import io.github.shizuki.site.content.request.PostVideoProcessRequest;
import io.github.shizuki.site.content.response.PostVideoSourceResponse;
import io.github.shizuki.site.content.response.PostVideoSummaryResponse;
import io.github.shizuki.site.content.response.PostVideoTranscriptResponse;

public interface PostVideoService {

    PostVideoSourceResponse inspect(PostVideoProcessRequest request);

    PostVideoTranscriptResponse transcribe(PostVideoProcessRequest request);

    PostVideoSummaryResponse summarize(PostVideoProcessRequest request);
}
