package io.github.shizuki.site.media.controller;

import io.github.shizuki.common.audit.annotation.AuditLog;
import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.common.core.response.ApiResponse;
import io.github.shizuki.common.ratelimit.annotation.RateLimit;
import io.github.shizuki.common.security.annotation.RequireGroup;
import io.github.shizuki.common.security.annotation.RequirePermission;
import io.github.shizuki.site.content.annotation.RequirePersonalContentStudio;
import io.github.shizuki.site.media.model.ImageVariantTypeEnum;
import io.github.shizuki.site.media.service.derivative.AdminMediaDerivativeRetryService;
import org.springframework.http.CacheControl;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/admin/life/media-associations")
@RequirePersonalContentStudio
@RequireGroup("ADMIN")
@RequirePermission("life.content.manage")
public class AdminMediaDerivativeController {

    private final AdminMediaDerivativeRetryService retryService;

    public AdminMediaDerivativeController(AdminMediaDerivativeRetryService retryService) {
        this.retryService = retryService;
    }

    @PostMapping("/{media_ref}/processing/{variant}/retry")
    @RateLimit(key = "admin.life.media.processing.retry", limit = 30, windowSeconds = 60)
    @AuditLog(action = "life.media.derivative.retry", resource = "media_derivative")
    public ResponseEntity<ApiResponse<AdminMediaDerivativeRetryResponse>> retry(
        @PathVariable("media_ref") String mediaRef,
        @PathVariable("variant") String variantCode,
        @RequestHeader(value = HttpHeaders.IF_MATCH, required = false) String ifMatch
    ) {
        ImageVariantTypeEnum variant = parseVariant(variantCode);
        AdminMediaDerivativeRetryResponse response = retryService.retry(mediaRef, variant, ifMatch);
        return ResponseEntity.ok()
            .cacheControl(CacheControl.noStore().cachePrivate())
            .header(HttpHeaders.ETAG, response.etag())
            .header(HttpHeaders.PRAGMA, "no-cache")
            .header(HttpHeaders.VARY, HttpHeaders.AUTHORIZATION)
            .body(ApiResponse.success(response));
    }

    private ImageVariantTypeEnum parseVariant(String value) {
        try {
            return ImageVariantTypeEnum.fromJson(value);
        } catch (RuntimeException exception) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "Failed media derivative was not found");
        }
    }
}
