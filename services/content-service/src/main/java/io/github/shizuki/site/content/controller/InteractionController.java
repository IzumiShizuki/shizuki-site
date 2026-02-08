package io.github.shizuki.site.content.controller;

import io.github.shizuki.common.audit.annotation.AuditLog;
import io.github.shizuki.common.core.response.ApiResponse;
import io.github.shizuki.site.content.dto.ReportRequest;
import io.github.shizuki.site.content.service.ContentService;
import jakarta.validation.Valid;
import java.util.Map;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class InteractionController {

    private final ContentService contentFacade;

    public InteractionController(ContentService contentFacade) {
        this.contentFacade = contentFacade;
    }

    @PostMapping("/posts/{post_id}/likes")
    @AuditLog(action = "post.like", resource = "post")
    public ApiResponse<Map<String, Object>> likePost(@PathVariable("post_id") Long postId) {
        return ApiResponse.success(contentFacade.likePost(postId));
    }

    @PostMapping("/apps/{app_id}/likes")
    @AuditLog(action = "app.like", resource = "app")
    public ApiResponse<Map<String, Object>> likeApp(@PathVariable("app_id") Long appId) {
        return ApiResponse.success(contentFacade.likeApp(appId));
    }

    @PostMapping("/reports")
    @AuditLog(action = "report.create", resource = "report")
    public ApiResponse<Map<String, Object>> report(@Valid @RequestBody ReportRequest request) {
        return ApiResponse.success(contentFacade.report(request));
    }
}
