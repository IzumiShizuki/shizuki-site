package io.github.shizuki.site.content.controller;

import io.github.shizuki.common.audit.annotation.AuditLog;
import io.github.shizuki.common.core.response.ApiResponse;
import io.github.shizuki.common.core.response.PageResponse;
import io.github.shizuki.common.ratelimit.annotation.RateLimit;
import io.github.shizuki.site.content.dto.PostSummary;
import io.github.shizuki.site.content.service.ContentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/posts")
public class PostController {

    private final ContentService contentFacade;

    public PostController(ContentService contentFacade) {
        this.contentFacade = contentFacade;
    }

    @GetMapping
    @RateLimit(key = "posts.list", limit = 60, windowSeconds = 60)
    public ApiResponse<PageResponse<PostSummary>> list(@RequestParam(defaultValue = "1") long pageNo,
                                                       @RequestParam(defaultValue = "10") long pageSize) {
        return ApiResponse.success(contentFacade.listPosts(pageNo, pageSize));
    }

    @GetMapping("/internal/ping")
    @AuditLog(action = "content.ping", resource = "posts")
    public ApiResponse<String> ping() {
        return ApiResponse.success("pong");
    }
}
