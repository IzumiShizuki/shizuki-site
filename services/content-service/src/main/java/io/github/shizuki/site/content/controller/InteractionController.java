package io.github.shizuki.site.content.controller;

import io.github.shizuki.common.audit.annotation.AuditLog;
import io.github.shizuki.common.core.response.ApiResponse;
import io.github.shizuki.site.content.dto.ReportRequest;
import io.github.shizuki.site.content.service.ContentService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import java.util.Map;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@Tag(name = "Interaction", description = "点赞与举报交互接口")
public class InteractionController {

    private final ContentService contentService;

    public InteractionController(ContentService contentService) {
        this.contentService = contentService;
    }

    @PostMapping("/posts/{post_id}/likes")
    @AuditLog(action = "post.like", resource = "post")
    @Operation(summary = "点赞帖子")
    public ApiResponse<Map<String, Object>> likePost(@PathVariable("post_id") Long postId) {
        return ApiResponse.success(contentService.likePost(postId));
    }

    @PostMapping("/apps/{app_id}/likes")
    @AuditLog(action = "app.like", resource = "app")
    @Operation(summary = "点赞应用")
    public ApiResponse<Map<String, Object>> likeApp(@PathVariable("app_id") Long appId) {
        return ApiResponse.success(contentService.likeApp(appId));
    }

    @PostMapping("/reports")
    @AuditLog(action = "report.create", resource = "report")
    @Operation(summary = "提交举报", description = "支持举报帖子或应用")
    public ApiResponse<Map<String, Object>> report(@Valid @RequestBody ReportRequest request) {
        return ApiResponse.success(contentService.report(request));
    }
}
