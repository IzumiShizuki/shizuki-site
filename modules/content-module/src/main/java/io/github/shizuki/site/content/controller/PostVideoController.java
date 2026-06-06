package io.github.shizuki.site.content.controller;

import io.github.shizuki.common.audit.annotation.AuditLog;
import io.github.shizuki.common.core.response.ApiResponse;
import io.github.shizuki.common.ratelimit.annotation.RateLimit;
import io.github.shizuki.site.content.request.PostVideoProcessRequest;
import io.github.shizuki.site.content.response.PostVideoSourceResponse;
import io.github.shizuki.site.content.response.PostVideoSummaryResponse;
import io.github.shizuki.site.content.response.PostVideoTranscriptResponse;
import io.github.shizuki.site.content.service.PostVideoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/me/posts/video")
@Tag(name = "Post Video", description = "作者视频链接解析、转写与内容总结接口")
public class PostVideoController {

    private final PostVideoService postVideoService;

    public PostVideoController(PostVideoService postVideoService) {
        this.postVideoService = postVideoService;
    }

    @PostMapping("/inspect")
    @RateLimit(key = "me.posts.video.inspect", limit = 20, windowSeconds = 60)
    @Operation(summary = "解析视频链接元数据")
    public ApiResponse<PostVideoSourceResponse> inspect(@Valid @RequestBody PostVideoProcessRequest request) {
        return ApiResponse.success(postVideoService.inspect(request));
    }

    @PostMapping("/transcribe")
    @AuditLog(action = "post.video.transcribe", resource = "post")
    @RateLimit(key = "me.posts.video.transcribe", limit = 5, windowSeconds = 60)
    @Operation(summary = "转写视频字幕或音轨")
    public ApiResponse<PostVideoTranscriptResponse> transcribe(@Valid @RequestBody PostVideoProcessRequest request) {
        return ApiResponse.success(postVideoService.transcribe(request));
    }

    @PostMapping("/summarize")
    @AuditLog(action = "post.video.summarize", resource = "post")
    @RateLimit(key = "me.posts.video.summarize", limit = 5, windowSeconds = 60)
    @Operation(summary = "生成视频内容 Markdown 笔记")
    public ApiResponse<PostVideoSummaryResponse> summarize(@Valid @RequestBody PostVideoProcessRequest request) {
        return ApiResponse.success(postVideoService.summarize(request));
    }
}
