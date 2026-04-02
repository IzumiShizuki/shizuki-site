package io.github.shizuki.site.content.controller;

import io.github.shizuki.common.audit.annotation.AuditLog;
import io.github.shizuki.common.core.response.ApiResponse;
import io.github.shizuki.common.security.annotation.RequireGroup;
import io.github.shizuki.site.content.response.AuthorProfileResponse;
import io.github.shizuki.site.content.request.AuthorProfileUpsertRequest;
import io.github.shizuki.site.content.service.ContentService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.http.CacheControl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequireGroup("ADMIN")
@RequestMapping("/api/v1/admin/author/profile")
@Tag(name = "Admin Author Profile", description = "管理员作者主页资料管理接口")
public class AdminAuthorProfileController {

    private final ContentService contentService;

    public AdminAuthorProfileController(ContentService contentService) {
        this.contentService = contentService;
    }

    @GetMapping
    @Operation(summary = "管理员获取作者资料")
    public ResponseEntity<ApiResponse<AuthorProfileResponse>> getProfile() {
        return ResponseEntity.ok()
            .cacheControl(CacheControl.noStore())
            .body(ApiResponse.success(contentService.getAdminAuthorProfile()));
    }

    @PutMapping
    @AuditLog(action = "author.profile.update", resource = "author_profile")
    @Operation(summary = "管理员更新作者资料")
    public ResponseEntity<ApiResponse<AuthorProfileResponse>> updateProfile(@Valid @RequestBody AuthorProfileUpsertRequest request) {
        return ResponseEntity.ok()
            .cacheControl(CacheControl.noStore())
            .body(ApiResponse.success(contentService.upsertAdminAuthorProfile(request)));
    }
}
