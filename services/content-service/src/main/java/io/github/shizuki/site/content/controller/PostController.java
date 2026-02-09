package io.github.shizuki.site.content.controller;

import io.github.shizuki.common.audit.annotation.AuditLog;
import io.github.shizuki.common.core.response.ApiResponse;
import io.github.shizuki.common.core.response.PageResponse;
import io.github.shizuki.common.ratelimit.annotation.RateLimit;
import io.github.shizuki.site.content.dto.PostSummary;
import io.github.shizuki.site.content.service.ContentService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/posts")
@Tag(name = "Post", description = "帖子查询与内部诊断接口")
public class PostController {

    private final ContentService contentFacade;

    public PostController(ContentService contentFacade) {
        this.contentFacade = contentFacade;
    }

    @GetMapping
    @RateLimit(key = "posts.list", limit = 60, windowSeconds = 60)
    @Operation(summary = "分页查询帖子", description = "按 pageNo/pageSize 分页返回帖子列表")
    public ApiResponse<PageResponse<PostSummary>> list(@RequestParam(name = "page_no", defaultValue = "1") long pageNo,
                                                       @RequestParam(name = "page_size", defaultValue = "10") long pageSize) {
        return ApiResponse.success(contentFacade.listPosts(pageNo, pageSize));
    }

    @GetMapping("/internal/ping")
    @AuditLog(action = "content.ping", resource = "posts")
    @Operation(summary = "内容服务连通性探测", description = "用于快速确认服务链路可用")
    public ApiResponse<String> ping() {
        return ApiResponse.success("pong");
    }
}
