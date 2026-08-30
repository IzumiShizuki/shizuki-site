package io.github.shizuki.site.content.controller.photo;

import io.github.shizuki.common.audit.annotation.AuditLog;
import io.github.shizuki.common.core.concurrency.ManagementCommandVersionGuard;
import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.common.core.response.ApiResponse;
import io.github.shizuki.common.ratelimit.annotation.RateLimit;
import io.github.shizuki.common.security.annotation.RequireGroup;
import io.github.shizuki.common.security.annotation.RequirePermission;
import io.github.shizuki.site.content.annotation.RequirePersonalContentStudio;
import io.github.shizuki.site.content.service.photo.AdminManagedPhotoService;
import jakarta.validation.Valid;
import java.util.List;
import org.springframework.http.CacheControl;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/admin/life/photos")
@RequirePersonalContentStudio
@RequireGroup("ADMIN")
@RequirePermission("life.content.manage")
public class AdminManagedPhotoController {

    private final AdminManagedPhotoService service;

    public AdminManagedPhotoController(AdminManagedPhotoService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<ApiResponse<List<AdminManagedPhotoResponse>>> list(
        @RequestParam(name = "include_recycled", defaultValue = "false") boolean includeRecycled,
        @RequestParam(name = "limit", defaultValue = "100") int limit
    ) {
        return noStore(ApiResponse.success(service.list(includeRecycled, limit)));
    }

    @PostMapping
    @RateLimit(key = "admin.life.photos.register", limit = 60, windowSeconds = 60)
    @AuditLog(action = "life.photo.register", resource = "photo")
    public ResponseEntity<ApiResponse<AdminManagedPhotoResponse>> register(
        @Valid @RequestBody AdminManagedPhotoRequest request
    ) {
        return photoResponse(service.register(request));
    }

    @PutMapping("/{photo_id}")
    @RateLimit(key = "admin.life.photos.update", limit = 120, windowSeconds = 60)
    @AuditLog(action = "life.photo.update", resource = "photo")
    public ResponseEntity<ApiResponse<AdminManagedPhotoResponse>> update(
        @PathVariable("photo_id") long photoId,
        @RequestHeader(value = HttpHeaders.IF_MATCH, required = false) String ifMatch,
        @Valid @RequestBody AdminManagedPhotoUpdateRequest request
    ) {
        long parsed = ManagementCommandVersionGuard.parseRequiredIfMatch(ifMatch);
        if (parsed > Integer.MAX_VALUE) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "If-Match version is outside the supported range");
        }
        return photoResponse(service.update(photoId, (int) parsed, request));
    }

    private ResponseEntity<ApiResponse<AdminManagedPhotoResponse>> photoResponse(AdminManagedPhotoResponse response) {
        return ResponseEntity.ok()
            .cacheControl(CacheControl.noStore().cachePrivate())
            .header(HttpHeaders.ETAG, response.etag())
            .header(HttpHeaders.PRAGMA, "no-cache")
            .header(HttpHeaders.VARY, HttpHeaders.AUTHORIZATION)
            .body(ApiResponse.success(response));
    }

    private <T> ResponseEntity<T> noStore(T body) {
        return ResponseEntity.ok()
            .cacheControl(CacheControl.noStore().cachePrivate())
            .header(HttpHeaders.PRAGMA, "no-cache")
            .header(HttpHeaders.VARY, HttpHeaders.AUTHORIZATION)
            .body(body);
    }
}
