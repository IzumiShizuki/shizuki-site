package io.github.shizuki.site.media.controller;

import io.github.shizuki.common.audit.annotation.AuditLog;
import io.github.shizuki.common.core.response.ApiResponse;
import io.github.shizuki.common.ratelimit.annotation.RateLimit;
import io.github.shizuki.common.security.annotation.RequireGroup;
import io.github.shizuki.common.security.annotation.RequirePermission;
import io.github.shizuki.site.content.annotation.RequirePersonalContentStudio;
import io.github.shizuki.site.admin.response.OptimisticVersionResponse;
import io.github.shizuki.site.media.request.PhotoDownloadPolicyUpdateRequest;
import io.github.shizuki.site.media.service.download.PhotoDownloadPolicyService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/admin/life/media-associations")
@RequirePersonalContentStudio
@RequireGroup("ADMIN")
public class AdminPhotoDownloadPolicyController {

    private final PhotoDownloadPolicyService policyService;

    public AdminPhotoDownloadPolicyController(PhotoDownloadPolicyService policyService) {
        this.policyService = policyService;
    }

    @PutMapping("/{media_ref}/download-policy")
    @RequirePermission("life.content.manage")
    @RateLimit(key = "admin.life.media.download-policy", limit = 30, windowSeconds = 60)
    @AuditLog(action = "life.media.download-policy.update", resource = "album_photo")
    public ApiResponse<OptimisticVersionResponse> update(
        @PathVariable("media_ref") String mediaRef,
        @Valid @RequestBody PhotoDownloadPolicyUpdateRequest request
    ) {
        return ApiResponse.success(policyService.update(mediaRef, request));
    }
}
