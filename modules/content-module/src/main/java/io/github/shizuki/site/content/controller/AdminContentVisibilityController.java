package io.github.shizuki.site.content.controller;

import io.github.shizuki.common.audit.annotation.AuditLog;
import io.github.shizuki.common.core.response.ApiResponse;
import io.github.shizuki.common.security.annotation.RequireGroup;
import io.github.shizuki.site.content.dto.ContentVisibilityResponse;
import io.github.shizuki.site.content.dto.ContentVisibilityUpdateRequest;
import io.github.shizuki.site.content.service.ContentService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequireGroup("ADMIN")
@Tag(name = "Admin Content Visibility", description = "管理员内容可见性管理接口")
public class AdminContentVisibilityController {

    private final ContentService contentService;

    public AdminContentVisibilityController(ContentService contentService) {
        this.contentService = contentService;
    }

    @GetMapping("/api/v1/admin/posts/{post_id}/visibility")
    @Operation(summary = "查询帖子可见性", description = "按帖子 ID 查询可见性与授权组")
    public ApiResponse<ContentVisibilityResponse> getPostVisibility(@PathVariable("post_id") Long postId) {
        return ApiResponse.success(contentService.getPostVisibility(postId));
    }

    @PutMapping("/api/v1/admin/posts/{post_id}/visibility")
    @AuditLog(action = "post.visibility.update", resource = "post_visibility")
    @Operation(summary = "更新帖子可见性", description = "按帖子 ID 更新可见性与授权组")
    public ApiResponse<ContentVisibilityResponse> updatePostVisibility(@PathVariable("post_id") Long postId,
                                                                       @Valid @RequestBody ContentVisibilityUpdateRequest request) {
        return ApiResponse.success(contentService.updatePostVisibility(postId, request));
    }

    @GetMapping("/api/v1/admin/apps/{app_id}/visibility")
    @Operation(summary = "查询应用可见性", description = "按应用 ID 查询可见性与授权组")
    public ApiResponse<ContentVisibilityResponse> getAppVisibility(@PathVariable("app_id") Long appId) {
        return ApiResponse.success(contentService.getAppVisibility(appId));
    }

    @PutMapping("/api/v1/admin/apps/{app_id}/visibility")
    @AuditLog(action = "app.visibility.update", resource = "app_visibility")
    @Operation(summary = "更新应用可见性", description = "按应用 ID 更新可见性与授权组")
    public ApiResponse<ContentVisibilityResponse> updateAppVisibility(@PathVariable("app_id") Long appId,
                                                                      @Valid @RequestBody ContentVisibilityUpdateRequest request) {
        return ApiResponse.success(contentService.updateAppVisibility(appId, request));
    }
}
