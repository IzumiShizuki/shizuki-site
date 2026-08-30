package io.github.shizuki.site.media.controller;

import io.github.shizuki.common.audit.annotation.AuditLog;
import io.github.shizuki.common.core.response.ApiResponse;
import io.github.shizuki.common.ratelimit.annotation.RateLimit;
import io.github.shizuki.common.security.annotation.RequireGroup;
import io.github.shizuki.common.security.annotation.RequirePermission;
import io.github.shizuki.site.content.annotation.RequirePersonalContentStudio;
import io.github.shizuki.common.security.purge.PurgeCapabilityGrant;
import io.github.shizuki.common.security.purge.PurgeCapabilityService;
import io.github.shizuki.site.admin.request.AdminPurgeConfirmationRequest;
import io.github.shizuki.site.admin.request.AdminPurgeDryRunRequest;
import io.github.shizuki.site.admin.response.AdminPurgeBlockerResponse;
import io.github.shizuki.site.admin.response.AdminPurgeDryRunResponse;
import io.github.shizuki.site.admin.response.OptimisticVersionResponse;
import io.github.shizuki.site.media.request.PhotoRetentionCommandRequest;
import io.github.shizuki.site.media.response.PhotoPurgeDryRunResponse;
import io.github.shizuki.site.media.response.PhotoRecycleResponse;
import io.github.shizuki.site.media.service.retention.PhotoRetentionService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.CacheControl;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/admin/life/photos")
@RequirePersonalContentStudio
@RequireGroup("ADMIN")
@RequirePermission("life.content.manage")
public class AdminPhotoRetentionController {

    private final PhotoRetentionService retentionService;
    private final PurgeCapabilityService purgeCapabilityService;

    public AdminPhotoRetentionController(PhotoRetentionService retentionService) {
        this(retentionService, null);
    }

    @Autowired
    public AdminPhotoRetentionController(
        PhotoRetentionService retentionService,
        PurgeCapabilityService purgeCapabilityService
    ) {
        this.retentionService = retentionService;
        this.purgeCapabilityService = purgeCapabilityService;
    }

    @PostMapping("/{photo_id}/recycle")
    @RateLimit(key = "admin.life.photos.recycle", limit = 20, windowSeconds = 60)
    @AuditLog(action = "life.photo.recycle", resource = "photo")
    public ApiResponse<PhotoRecycleResponse> recycle(
        @PathVariable("photo_id") long photoId,
        @Valid @RequestBody PhotoRetentionCommandRequest request
    ) {
        return ApiResponse.success(retentionService.recycle(photoId, request.expectedVersion()));
    }

    @PostMapping("/{photo_id}/restore")
    @RateLimit(key = "admin.life.photos.restore", limit = 20, windowSeconds = 60)
    @AuditLog(action = "life.photo.restore", resource = "photo")
    public ApiResponse<OptimisticVersionResponse> restore(
        @PathVariable("photo_id") long photoId,
        @Valid @RequestBody PhotoRetentionCommandRequest request
    ) {
        return ApiResponse.success(retentionService.restore(photoId, request.expectedVersion()));
    }

    @PostMapping("/{photo_id}/purge-dry-run")
    @RateLimit(key = "admin.life.photos.purge-dry-run", limit = 20, windowSeconds = 60)
    @AuditLog(action = "life.photo.purge.dry-run", resource = "photo")
    public ResponseEntity<ApiResponse<AdminPurgeDryRunResponse>> dryRunPurge(
        @PathVariable("photo_id") long photoId,
        @Valid @RequestBody AdminPurgeDryRunRequest request
    ) {
        PhotoPurgeDryRunResponse readiness = retentionService.dryRunPurge(photoId, request.expectedVersion());
        PurgeCapabilityGrant grant = readiness.eligible()
            ? requirePurgeCapabilityService().issue("PHOTO", photoId, request.expectedVersion())
            : null;
        AdminPurgeDryRunResponse response = new AdminPurgeDryRunResponse(
            "PHOTO",
            photoId,
            request.expectedVersion(),
            readiness.eligible(),
            readiness.purgeAfter(),
            readiness.derivativeCount(),
            readiness.blockers().stream()
                .map(blocker -> new AdminPurgeBlockerResponse(blocker.code(), blocker.count(), blocker.message()))
                .toList(),
            grant == null ? null : grant.capability(),
            grant == null ? null : grant.expiresAt(),
            grant == null ? null : purgePhrase(photoId)
        );
        return noStore(ApiResponse.success(response));
    }

    @PostMapping("/{photo_id}/purge")
    @RateLimit(key = "admin.life.photos.purge", limit = 10, windowSeconds = 60)
    @AuditLog(action = "life.photo.purge", resource = "photo")
    public ResponseEntity<ApiResponse<OptimisticVersionResponse>> purge(
        @PathVariable("photo_id") long photoId,
        @Valid @RequestBody AdminPurgeConfirmationRequest request
    ) {
        requireConfirmation(request.confirmation(), purgePhrase(photoId));
        requirePurgeCapabilityService().consume(
            request.capability(),
            "PHOTO",
            photoId,
            request.expectedVersion()
        );
        return noStore(ApiResponse.success(retentionService.purge(photoId, request.expectedVersion())));
    }

    private PurgeCapabilityService requirePurgeCapabilityService() {
        if (purgeCapabilityService == null) {
            throw new IllegalStateException("Purge capability service is unavailable");
        }
        return purgeCapabilityService;
    }

    private void requireConfirmation(String actual, String required) {
        if (!required.equals(actual == null ? null : actual.trim())) {
            throw new io.github.shizuki.common.core.error.BusinessException(
                io.github.shizuki.common.core.error.ErrorCode.BAD_REQUEST,
                "Permanent cleanup confirmation does not match"
            );
        }
    }

    private String purgePhrase(long photoId) {
        return "PURGE PHOTO " + photoId;
    }

    private <T> ResponseEntity<ApiResponse<T>> noStore(ApiResponse<T> body) {
        return ResponseEntity.ok()
            .cacheControl(CacheControl.noStore().cachePrivate())
            .header(HttpHeaders.PRAGMA, "no-cache")
            .header(HttpHeaders.VARY, HttpHeaders.AUTHORIZATION)
            .body(body);
    }
}
