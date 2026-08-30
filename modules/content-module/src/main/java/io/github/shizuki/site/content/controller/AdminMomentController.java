package io.github.shizuki.site.content.controller;

import io.github.shizuki.common.audit.annotation.AuditLog;
import io.github.shizuki.common.core.concurrency.ManagementCommandVersionGuard;
import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.common.core.response.ApiResponse;
import io.github.shizuki.common.ratelimit.annotation.RateLimit;
import io.github.shizuki.common.security.annotation.RequireGroup;
import io.github.shizuki.common.security.annotation.RequirePermission;
import io.github.shizuki.site.content.annotation.RequirePersonalContentStudio;
import io.github.shizuki.common.security.purge.PurgeCapabilityGrant;
import io.github.shizuki.common.security.purge.PurgeCapabilityService;
import io.github.shizuki.site.admin.request.AdminPurgeConfirmationRequest;
import io.github.shizuki.site.admin.request.AdminPurgeDryRunRequest;
import io.github.shizuki.site.admin.response.AdminPurgeDryRunResponse;
import io.github.shizuki.site.admin.response.OptimisticVersionResponse;
import io.github.shizuki.site.content.entity.MomentEntity;
import io.github.shizuki.site.content.entity.MomentPhotoEntity;
import io.github.shizuki.site.content.life.ContentPurgeReadiness;
import io.github.shizuki.site.content.request.AdminMomentCreateRequest;
import io.github.shizuki.site.content.request.AdminMomentEditRequest;
import io.github.shizuki.site.content.request.AdminMomentPhotoIdsRequest;
import io.github.shizuki.site.content.response.AdminMomentCreatedResponse;
import io.github.shizuki.site.content.response.AdminMomentDetailResponse;
import io.github.shizuki.site.content.response.AdminMomentPhotoOrderResponse;
import io.github.shizuki.site.content.response.AdminMomentPhotoReferenceResponse;
import io.github.shizuki.site.content.response.AdminMomentSummaryResponse;
import io.github.shizuki.site.content.service.moment.MomentPhotoMutationResult;
import io.github.shizuki.site.content.service.moment.MomentAdminQueryService;
import io.github.shizuki.site.content.service.moment.MomentService;
import io.github.shizuki.site.content.service.photo.ManagedPhotoPublicationPreparationService;
import jakarta.validation.Valid;
import java.util.List;
import org.springframework.http.CacheControl;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/admin/life/moments")
@RequirePersonalContentStudio
@RequireGroup("ADMIN")
@RequirePermission("life.content.manage")
public class AdminMomentController {

    private final MomentService momentService;
    private final MomentAdminQueryService queryService;
    private final ManagedPhotoPublicationPreparationService publicationPreparationService;
    private final PurgeCapabilityService purgeCapabilityService;

    public AdminMomentController(MomentService momentService, MomentAdminQueryService queryService) {
        this(momentService, queryService, null, null);
    }

    public AdminMomentController(
        MomentService momentService,
        MomentAdminQueryService queryService,
        ManagedPhotoPublicationPreparationService publicationPreparationService
    ) {
        this(momentService, queryService, publicationPreparationService, null);
    }

    @Autowired
    public AdminMomentController(
        MomentService momentService,
        MomentAdminQueryService queryService,
        ManagedPhotoPublicationPreparationService publicationPreparationService,
        PurgeCapabilityService purgeCapabilityService
    ) {
        this.momentService = momentService;
        this.queryService = queryService;
        this.publicationPreparationService = publicationPreparationService;
        this.purgeCapabilityService = purgeCapabilityService;
    }

    @GetMapping
    public ResponseEntity<ApiResponse<List<AdminMomentSummaryResponse>>> list(
        @RequestParam(name = "include_recycled", defaultValue = "false") boolean includeRecycled,
        @RequestParam(name = "limit", defaultValue = "50") int limit
    ) {
        return ResponseEntity.ok()
            .cacheControl(CacheControl.noStore())
            .body(ApiResponse.success(queryService.list(includeRecycled, limit)));
    }

    @GetMapping("/{moment_id}")
    public ResponseEntity<ApiResponse<AdminMomentDetailResponse>> detail(
        @PathVariable("moment_id") long momentId
    ) {
        AdminMomentDetailResponse result = queryService.get(momentId);
        return ResponseEntity.ok()
            .eTag(result.etag())
            .cacheControl(CacheControl.noStore())
            .body(ApiResponse.success(result));
    }

    @GetMapping("/{moment_id}/preview")
    public ResponseEntity<ApiResponse<AdminMomentDetailResponse>> preview(
        @PathVariable("moment_id") long momentId
    ) {
        // Dedicated admin route intentionally reuses no public response cache or visibility filter.
        return detail(momentId);
    }

    @PostMapping
    @RateLimit(key = "admin.life.moments.create", limit = 20, windowSeconds = 60)
    @AuditLog(action = "life.moment.create", resource = "moment")
    public ResponseEntity<ApiResponse<AdminMomentCreatedResponse>> create(
        @Valid @RequestBody AdminMomentCreateRequest request
    ) {
        MomentEntity moment = momentService.createDraft(request.body(), request.visibility());
        OptimisticVersionResponse version = OptimisticVersionResponse.of(valueOrZero(moment.getVersion()));
        AdminMomentCreatedResponse response = new AdminMomentCreatedResponse(
            moment.getId(),
            moment.getPublicId(),
            moment.getLifecycleStatus(),
            moment.getVisibilityStatus(),
            version
        );
        return versioned(response, version);
    }

    @PutMapping("/{moment_id}")
    @RateLimit(key = "admin.life.moments.edit", limit = 30, windowSeconds = 60)
    @AuditLog(action = "life.moment.edit", resource = "moment")
    public ResponseEntity<ApiResponse<OptimisticVersionResponse>> edit(
        @PathVariable("moment_id") long momentId,
        @RequestHeader(HttpHeaders.IF_MATCH) String ifMatch,
        @Valid @RequestBody AdminMomentEditRequest request
    ) {
        OptimisticVersionResponse result = momentService.edit(
            momentId,
            expectedVersion(ifMatch),
            request.body(),
            request.visibility(),
            request.featured(),
            request.pinned()
        );
        preparePublicMedia(momentId);
        return versioned(result, result);
    }

    @PostMapping("/{moment_id}/photos/attach")
    @RateLimit(key = "admin.life.moments.photos.attach", limit = 30, windowSeconds = 60)
    @AuditLog(action = "life.moment.photos.attach", resource = "moment")
    public ResponseEntity<ApiResponse<AdminMomentPhotoOrderResponse>> attachPhotos(
        @PathVariable("moment_id") long momentId,
        @RequestHeader(HttpHeaders.IF_MATCH) String ifMatch,
        @Valid @RequestBody AdminMomentPhotoIdsRequest request
    ) {
        MomentPhotoMutationResult result = momentService.attachPhotos(
            momentId,
            expectedVersion(ifMatch),
            request.photoIds()
        );
        preparePublicMedia(momentId);
        return versioned(toPhotoOrder(result), result.version());
    }

    @PostMapping("/{moment_id}/photos/detach")
    @RateLimit(key = "admin.life.moments.photos.detach", limit = 30, windowSeconds = 60)
    @AuditLog(action = "life.moment.photos.detach", resource = "moment")
    public ResponseEntity<ApiResponse<AdminMomentPhotoOrderResponse>> detachPhotos(
        @PathVariable("moment_id") long momentId,
        @RequestHeader(HttpHeaders.IF_MATCH) String ifMatch,
        @Valid @RequestBody AdminMomentPhotoIdsRequest request
    ) {
        MomentPhotoMutationResult result = momentService.detachPhotos(
            momentId,
            expectedVersion(ifMatch),
            request.photoIds()
        );
        return versioned(toPhotoOrder(result), result.version());
    }

    @PutMapping("/{moment_id}/photos/order")
    @RateLimit(key = "admin.life.moments.photos.reorder", limit = 30, windowSeconds = 60)
    @AuditLog(action = "life.moment.photos.reorder", resource = "moment")
    public ResponseEntity<ApiResponse<AdminMomentPhotoOrderResponse>> reorderPhotos(
        @PathVariable("moment_id") long momentId,
        @RequestHeader(HttpHeaders.IF_MATCH) String ifMatch,
        @Valid @RequestBody AdminMomentPhotoIdsRequest request
    ) {
        MomentPhotoMutationResult result = momentService.reorderPhotos(
            momentId,
            expectedVersion(ifMatch),
            request.photoIds()
        );
        return versioned(toPhotoOrder(result), result.version());
    }

    @PostMapping("/{moment_id}/publish")
    @AuditLog(action = "life.moment.publish", resource = "moment")
    public ResponseEntity<ApiResponse<OptimisticVersionResponse>> publish(
        @PathVariable("moment_id") long momentId,
        @RequestHeader(HttpHeaders.IF_MATCH) String ifMatch
    ) {
        OptimisticVersionResponse result = momentService.publish(momentId, expectedVersion(ifMatch));
        return versioned(result, result);
    }

    @PostMapping("/{moment_id}/archive")
    @AuditLog(action = "life.moment.archive", resource = "moment")
    public ResponseEntity<ApiResponse<OptimisticVersionResponse>> archive(
        @PathVariable("moment_id") long momentId,
        @RequestHeader(HttpHeaders.IF_MATCH) String ifMatch
    ) {
        OptimisticVersionResponse result = momentService.archive(momentId, expectedVersion(ifMatch));
        return versioned(result, result);
    }

    @PostMapping("/{moment_id}/recycle")
    @AuditLog(action = "life.moment.recycle", resource = "moment")
    public ResponseEntity<ApiResponse<OptimisticVersionResponse>> recycle(
        @PathVariable("moment_id") long momentId,
        @RequestHeader(HttpHeaders.IF_MATCH) String ifMatch
    ) {
        OptimisticVersionResponse result = momentService.recycle(momentId, expectedVersion(ifMatch));
        return versioned(result, result);
    }

    @PostMapping("/{moment_id}/restore")
    @AuditLog(action = "life.moment.restore", resource = "moment")
    public ResponseEntity<ApiResponse<OptimisticVersionResponse>> restore(
        @PathVariable("moment_id") long momentId,
        @RequestHeader(HttpHeaders.IF_MATCH) String ifMatch
    ) {
        OptimisticVersionResponse result = momentService.restore(momentId, expectedVersion(ifMatch));
        return versioned(result, result);
    }

    @PostMapping("/{moment_id}/purge-dry-run")
    @RateLimit(key = "admin.life.moments.purge-dry-run", limit = 20, windowSeconds = 60)
    @AuditLog(action = "life.moment.purge.dry-run", resource = "moment")
    public ResponseEntity<ApiResponse<AdminPurgeDryRunResponse>> dryRunPurge(
        @PathVariable("moment_id") long momentId,
        @Valid @RequestBody AdminPurgeDryRunRequest request
    ) {
        ContentPurgeReadiness readiness = momentService.dryRunPurge(momentId, request.expectedVersion());
        PurgeCapabilityGrant grant = readiness.eligible()
            ? requirePurgeCapabilityService().issue("MOMENT", momentId, request.expectedVersion())
            : null;
        return noStore(ApiResponse.success(new AdminPurgeDryRunResponse(
            "MOMENT",
            momentId,
            request.expectedVersion(),
            readiness.eligible(),
            readiness.purgeAfter(),
            0,
            readiness.blockers(),
            grant == null ? null : grant.capability(),
            grant == null ? null : grant.expiresAt(),
            grant == null ? null : purgePhrase(momentId)
        )));
    }

    @PostMapping("/{moment_id}/purge")
    @RateLimit(key = "admin.life.moments.purge", limit = 10, windowSeconds = 60)
    @AuditLog(action = "life.moment.purge", resource = "moment")
    public ResponseEntity<ApiResponse<OptimisticVersionResponse>> purge(
        @PathVariable("moment_id") long momentId,
        @Valid @RequestBody AdminPurgeConfirmationRequest request
    ) {
        requireConfirmation(request.confirmation(), purgePhrase(momentId));
        requirePurgeCapabilityService().consume(
            request.capability(),
            "MOMENT",
            momentId,
            request.expectedVersion()
        );
        OptimisticVersionResponse result = momentService.purge(momentId, request.expectedVersion());
        return versioned(result, result);
    }

    private AdminMomentPhotoOrderResponse toPhotoOrder(MomentPhotoMutationResult result) {
        List<AdminMomentPhotoReferenceResponse> photos = result.photos().stream()
            .map(this::toPhotoReference)
            .toList();
        return new AdminMomentPhotoOrderResponse(result.version(), photos);
    }

    private AdminMomentPhotoReferenceResponse toPhotoReference(MomentPhotoEntity photo) {
        return new AdminMomentPhotoReferenceResponse(
            photo.getPhotoId(),
            photo.getMediaRefId(),
            photo.getSortNum() == null ? 0 : photo.getSortNum()
        );
    }

    private int expectedVersion(String ifMatch) {
        long version = ManagementCommandVersionGuard.parseRequiredIfMatch(ifMatch);
        if (version > Integer.MAX_VALUE) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "If-Match version is outside the supported range");
        }
        return (int) version;
    }

    private void preparePublicMedia(long momentId) {
        if (publicationPreparationService != null) {
            publicationPreparationService.prepareMomentIfPublic(momentId);
        }
    }

    private int valueOrZero(Integer value) {
        return value == null ? 0 : value;
    }

    private <T> ResponseEntity<ApiResponse<T>> noStore(ApiResponse<T> body) {
        return ResponseEntity.ok()
            .cacheControl(CacheControl.noStore())
            .header(HttpHeaders.PRAGMA, "no-cache")
            .header(HttpHeaders.VARY, HttpHeaders.AUTHORIZATION)
            .body(body);
    }

    private PurgeCapabilityService requirePurgeCapabilityService() {
        if (purgeCapabilityService == null) {
            throw new IllegalStateException("Purge capability service is unavailable");
        }
        return purgeCapabilityService;
    }

    private void requireConfirmation(String actual, String required) {
        if (!required.equals(actual == null ? null : actual.trim())) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Permanent cleanup confirmation does not match");
        }
    }

    private String purgePhrase(long momentId) {
        return "PURGE MOMENT " + momentId;
    }

    private <T> ResponseEntity<ApiResponse<T>> versioned(T body, OptimisticVersionResponse version) {
        return ResponseEntity.ok()
            .eTag(version.etag())
            .cacheControl(CacheControl.noStore())
            .body(ApiResponse.success(body));
    }
}
