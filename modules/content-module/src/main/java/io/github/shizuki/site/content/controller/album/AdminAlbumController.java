package io.github.shizuki.site.content.controller.album;

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
import io.github.shizuki.site.content.entity.AlbumEntity;
import io.github.shizuki.site.content.life.ContentPurgeReadiness;
import io.github.shizuki.site.content.service.album.AlbumPhotoAttachmentCommand;
import io.github.shizuki.site.content.service.album.AlbumPhotoCommandService;
import io.github.shizuki.site.content.service.album.AlbumService;
import io.github.shizuki.site.content.service.album.admin.AlbumAdminQueryService;
import io.github.shizuki.site.content.service.photo.ManagedPhotoPublicationPreparationService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import java.util.List;
import org.springframework.http.CacheControl;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/** Complete album management surface. Public album controllers never call this projection. */
@RestController
@RequestMapping("/api/v1/admin/life/albums")
@RequirePersonalContentStudio
@RequireGroup("ADMIN")
@RequirePermission("life.content.manage")
@Tag(name = "Admin Life Albums", description = "相册草稿、预览、媒体编排与发布管理")
public class AdminAlbumController {

    private final AlbumService albumService;
    private final AlbumPhotoCommandService photoCommandService;
    private final AlbumAdminQueryService queryService;
    private final ManagedPhotoPublicationPreparationService publicationPreparationService;
    private final PurgeCapabilityService purgeCapabilityService;

    public AdminAlbumController(
        AlbumService albumService,
        AlbumPhotoCommandService photoCommandService,
        AlbumAdminQueryService queryService
    ) {
        this(albumService, photoCommandService, queryService, null, null);
    }

    public AdminAlbumController(
        AlbumService albumService,
        AlbumPhotoCommandService photoCommandService,
        AlbumAdminQueryService queryService,
        ManagedPhotoPublicationPreparationService publicationPreparationService
    ) {
        this(albumService, photoCommandService, queryService, publicationPreparationService, null);
    }

    @Autowired
    public AdminAlbumController(
        AlbumService albumService,
        AlbumPhotoCommandService photoCommandService,
        AlbumAdminQueryService queryService,
        ManagedPhotoPublicationPreparationService publicationPreparationService,
        PurgeCapabilityService purgeCapabilityService
    ) {
        this.albumService = albumService;
        this.photoCommandService = photoCommandService;
        this.queryService = queryService;
        this.publicationPreparationService = publicationPreparationService;
        this.purgeCapabilityService = purgeCapabilityService;
    }

    @GetMapping
    @Operation(summary = "查询相册管理列表")
    public ResponseEntity<ApiResponse<List<AlbumAdminSummaryResponse>>> list(
        @RequestParam(name = "include_recycled", defaultValue = "false") boolean includeRecycled,
        @RequestParam(name = "limit", defaultValue = "50") int limit
    ) {
        return noStore(ApiResponse.success(queryService.list(includeRecycled, limit)));
    }

    @GetMapping("/{album_id}")
    @Operation(summary = "读取相册管理详情")
    public ResponseEntity<ApiResponse<AlbumAdminResponse>> detail(
        @PathVariable("album_id") long albumId
    ) {
        return albumResponse(queryService.detail(albumId));
    }

    @GetMapping("/{album_id}/preview")
    @Operation(summary = "独立读取草稿或私有相册预览")
    public ResponseEntity<ApiResponse<AlbumAdminPreviewResponse>> preview(
        @PathVariable("album_id") long albumId
    ) {
        return ResponseEntity.ok()
            .cacheControl(CacheControl.noStore().cachePrivate())
            .header(HttpHeaders.PRAGMA, "no-cache")
            .header(HttpHeaders.VARY, HttpHeaders.AUTHORIZATION)
            .header("X-Robots-Tag", "noindex, nofollow, noarchive")
            .body(ApiResponse.success(queryService.preview(albumId)));
    }

    @PostMapping
    @RateLimit(key = "admin.life.albums.create", limit = 30, windowSeconds = 60)
    @AuditLog(action = "life.album.create", resource = "album")
    @Operation(summary = "创建相册草稿")
    public ResponseEntity<ApiResponse<AlbumAdminResponse>> create(
        @Valid @RequestBody AlbumCreateRequest request
    ) {
        AlbumEntity album = albumService.createDraft(request.title(), request.summary(), request.visibility());
        return albumResponse(queryService.detail(album.getId()));
    }

    @PutMapping("/{album_id}")
    @RateLimit(key = "admin.life.albums.update", limit = 60, windowSeconds = 60)
    @AuditLog(action = "life.album.update", resource = "album")
    @Operation(summary = "编辑相册标题、可见性与精选状态")
    public ResponseEntity<ApiResponse<AlbumAdminResponse>> update(
        @PathVariable("album_id") long albumId,
        @RequestHeader(value = HttpHeaders.IF_MATCH, required = false) String ifMatch,
        @Valid @RequestBody AlbumUpdateRequest request
    ) {
        int expectedVersion = expectedVersion(ifMatch);
        albumService.edit(
            albumId,
            expectedVersion,
            request.title(),
            request.summary(),
            request.visibility(),
            request.featured(),
            request.sortNum()
        );
        preparePublicMedia(albumId);
        return albumResponse(queryService.detail(albumId));
    }

    @PutMapping("/{album_id}/cover")
    @RateLimit(key = "admin.life.albums.cover", limit = 60, windowSeconds = 60)
    @AuditLog(action = "life.album.cover.update", resource = "album")
    @Operation(summary = "选择相册封面")
    public ResponseEntity<ApiResponse<AlbumAdminResponse>> selectCover(
        @PathVariable("album_id") long albumId,
        @RequestHeader(value = HttpHeaders.IF_MATCH, required = false) String ifMatch,
        @Valid @RequestBody AlbumCoverUpdateRequest request
    ) {
        albumService.selectCover(albumId, expectedVersion(ifMatch), request.photoId());
        return albumResponse(queryService.detail(albumId));
    }

    @PostMapping("/{album_id}/photos/attach")
    @RateLimit(key = "admin.life.albums.photos.attach", limit = 30, windowSeconds = 60)
    @AuditLog(action = "life.album.photos.attach", resource = "album_photo")
    @Operation(summary = "批量复用并附加已管理照片")
    public ResponseEntity<ApiResponse<AlbumAdminResponse>> attachPhotos(
        @PathVariable("album_id") long albumId,
        @RequestHeader(value = HttpHeaders.IF_MATCH, required = false) String ifMatch,
        @Valid @RequestBody AlbumPhotoBatchRequest request
    ) {
        List<AlbumPhotoAttachmentCommand> commands = request.photos().stream()
            .map(item -> new AlbumPhotoAttachmentCommand(item.photoId(), item.caption(), item.downloadMode()))
            .toList();
        photoCommandService.attach(albumId, expectedVersion(ifMatch), commands);
        preparePublicMedia(albumId);
        return albumResponse(queryService.detail(albumId));
    }

    @PostMapping("/{album_id}/photos/detach")
    @RateLimit(key = "admin.life.albums.photos.detach", limit = 30, windowSeconds = 60)
    @AuditLog(action = "life.album.photos.detach", resource = "album_photo")
    @Operation(summary = "批量移除相册照片关联")
    public ResponseEntity<ApiResponse<AlbumAdminResponse>> detachPhotos(
        @PathVariable("album_id") long albumId,
        @RequestHeader(value = HttpHeaders.IF_MATCH, required = false) String ifMatch,
        @Valid @RequestBody AlbumPhotoIdsRequest request
    ) {
        photoCommandService.detach(albumId, expectedVersion(ifMatch), request.photoIds());
        return albumResponse(queryService.detail(albumId));
    }

    @PutMapping("/{album_id}/photos/order")
    @RateLimit(key = "admin.life.albums.photos.order", limit = 60, windowSeconds = 60)
    @AuditLog(action = "life.album.photos.reorder", resource = "album_photo")
    @Operation(summary = "原子重排相册照片")
    public ResponseEntity<ApiResponse<AlbumAdminResponse>> reorderPhotos(
        @PathVariable("album_id") long albumId,
        @RequestHeader(value = HttpHeaders.IF_MATCH, required = false) String ifMatch,
        @Valid @RequestBody AlbumPhotoIdsRequest request
    ) {
        photoCommandService.reorder(albumId, expectedVersion(ifMatch), request.photoIds());
        return albumResponse(queryService.detail(albumId));
    }

    @PostMapping("/{album_id}/publish")
    @RateLimit(key = "admin.life.albums.publish", limit = 20, windowSeconds = 60)
    @AuditLog(action = "life.album.publish", resource = "album")
    @Operation(summary = "发布相册")
    public ResponseEntity<ApiResponse<AlbumAdminResponse>> publish(
        @PathVariable("album_id") long albumId,
        @RequestHeader(value = HttpHeaders.IF_MATCH, required = false) String ifMatch
    ) {
        albumService.publish(albumId, expectedVersion(ifMatch));
        return albumResponse(queryService.detail(albumId));
    }

    @PostMapping("/{album_id}/archive")
    @RateLimit(key = "admin.life.albums.archive", limit = 20, windowSeconds = 60)
    @AuditLog(action = "life.album.archive", resource = "album")
    @Operation(summary = "归档并撤回相册")
    public ResponseEntity<ApiResponse<AlbumAdminResponse>> archive(
        @PathVariable("album_id") long albumId,
        @RequestHeader(value = HttpHeaders.IF_MATCH, required = false) String ifMatch
    ) {
        albumService.archive(albumId, expectedVersion(ifMatch));
        return albumResponse(queryService.detail(albumId));
    }

    @PostMapping("/{album_id}/recycle")
    @RateLimit(key = "admin.life.albums.recycle", limit = 20, windowSeconds = 60)
    @AuditLog(action = "life.album.recycle", resource = "album")
    @Operation(summary = "将相册移入回收站")
    public ResponseEntity<ApiResponse<AlbumAdminResponse>> recycle(
        @PathVariable("album_id") long albumId,
        @RequestHeader(value = HttpHeaders.IF_MATCH, required = false) String ifMatch
    ) {
        albumService.recycle(albumId, expectedVersion(ifMatch));
        return albumResponse(queryService.detail(albumId));
    }

    @PostMapping("/{album_id}/restore")
    @RateLimit(key = "admin.life.albums.restore", limit = 20, windowSeconds = 60)
    @AuditLog(action = "life.album.restore", resource = "album")
    @Operation(summary = "安全恢复相册且不自动重新发布")
    public ResponseEntity<ApiResponse<AlbumAdminResponse>> restore(
        @PathVariable("album_id") long albumId,
        @RequestHeader(value = HttpHeaders.IF_MATCH, required = false) String ifMatch
    ) {
        albumService.restore(albumId, expectedVersion(ifMatch));
        return albumResponse(queryService.detail(albumId));
    }

    @PostMapping("/{album_id}/purge-dry-run")
    @RateLimit(key = "admin.life.albums.purge-dry-run", limit = 20, windowSeconds = 60)
    @AuditLog(action = "life.album.purge.dry-run", resource = "album")
    @Operation(summary = "检查相册永久清理资格并签发一次性确认凭证")
    public ResponseEntity<ApiResponse<AdminPurgeDryRunResponse>> dryRunPurge(
        @PathVariable("album_id") long albumId,
        @Valid @RequestBody AdminPurgeDryRunRequest request
    ) {
        ContentPurgeReadiness readiness = albumService.dryRunPurge(albumId, request.expectedVersion());
        PurgeCapabilityGrant grant = readiness.eligible()
            ? requirePurgeCapabilityService().issue("ALBUM", albumId, request.expectedVersion())
            : null;
        return noStore(ApiResponse.success(new AdminPurgeDryRunResponse(
            "ALBUM",
            albumId,
            request.expectedVersion(),
            readiness.eligible(),
            readiness.purgeAfter(),
            0,
            readiness.blockers(),
            grant == null ? null : grant.capability(),
            grant == null ? null : grant.expiresAt(),
            grant == null ? null : purgePhrase(albumId)
        )));
    }

    @PostMapping("/{album_id}/purge")
    @RateLimit(key = "admin.life.albums.purge", limit = 10, windowSeconds = 60)
    @AuditLog(action = "life.album.purge", resource = "album")
    @Operation(summary = "使用一次性凭证永久清理相册")
    public ResponseEntity<ApiResponse<OptimisticVersionResponse>> purge(
        @PathVariable("album_id") long albumId,
        @Valid @RequestBody AdminPurgeConfirmationRequest request
    ) {
        requireConfirmation(request.confirmation(), purgePhrase(albumId));
        requirePurgeCapabilityService().consume(
            request.capability(),
            "ALBUM",
            albumId,
            request.expectedVersion()
        );
        OptimisticVersionResponse result = albumService.purge(albumId, request.expectedVersion());
        return ResponseEntity.ok()
            .eTag(result.etag())
            .cacheControl(CacheControl.noStore().cachePrivate())
            .header(HttpHeaders.PRAGMA, "no-cache")
            .header(HttpHeaders.VARY, HttpHeaders.AUTHORIZATION)
            .body(ApiResponse.success(result));
    }

    private ResponseEntity<ApiResponse<AlbumAdminResponse>> albumResponse(AlbumAdminResponse response) {
        return ResponseEntity.ok()
            .cacheControl(CacheControl.noStore().cachePrivate())
            .header(HttpHeaders.ETAG, response.audit().etag())
            .header(HttpHeaders.PRAGMA, "no-cache")
            .header(HttpHeaders.VARY, HttpHeaders.AUTHORIZATION)
            .body(ApiResponse.success(response));
    }

    private void preparePublicMedia(long albumId) {
        if (publicationPreparationService != null) {
            publicationPreparationService.prepareAlbumIfPublic(albumId);
        }
    }

    private <T> ResponseEntity<T> noStore(T body) {
        return ResponseEntity.ok()
            .cacheControl(CacheControl.noStore().cachePrivate())
            .header(HttpHeaders.PRAGMA, "no-cache")
            .header(HttpHeaders.VARY, HttpHeaders.AUTHORIZATION)
            .body(body);
    }

    private int expectedVersion(String ifMatch) {
        long version = ManagementCommandVersionGuard.parseRequiredIfMatch(ifMatch);
        if (version > Integer.MAX_VALUE) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "If-Match version is outside the supported range");
        }
        return (int) version;
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

    private String purgePhrase(long albumId) {
        return "PURGE ALBUM " + albumId;
    }
}
