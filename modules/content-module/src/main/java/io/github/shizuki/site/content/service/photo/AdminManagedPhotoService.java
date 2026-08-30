package io.github.shizuki.site.content.service.photo;

import io.github.shizuki.common.core.concurrency.ManagementCommandVersionGuard;
import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.common.security.context.LoginUserContext;
import io.github.shizuki.common.security.model.LoginUser;
import io.github.shizuki.site.content.controller.photo.AdminManagedPhotoRequest;
import io.github.shizuki.site.content.controller.photo.AdminManagedPhotoResponse;
import io.github.shizuki.site.content.controller.photo.AdminManagedPhotoUpdateRequest;
import io.github.shizuki.site.content.entity.PhotoEntity;
import io.github.shizuki.site.content.mapper.PhotoMapper;
import io.github.shizuki.site.media.port.ManagedPhotoMediaPort;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/** Registration and editorial metadata boundary for reusable managed photos. */
@Service
public class AdminManagedPhotoService {

    private static final String MANAGE_PERMISSION = "life.content.manage";

    private final PhotoMapper photoMapper;
    private final ManagedPhotoMediaPort mediaPort;

    public AdminManagedPhotoService(PhotoMapper photoMapper, ManagedPhotoMediaPort mediaPort) {
        this.photoMapper = photoMapper;
        this.mediaPort = mediaPort;
    }

    public List<AdminManagedPhotoResponse> list(boolean includeRecycled, int requestedLimit) {
        requireAdministrator();
        int limit = Math.max(1, Math.min(200, requestedLimit));
        return safe(photoMapper.selectManaged(includeRecycled ? 1 : 0, limit)).stream()
            .map(this::response)
            .toList();
    }

    @Transactional(rollbackFor = Exception.class)
    public AdminManagedPhotoResponse register(AdminManagedPhotoRequest request) {
        LoginUser actor = requireAdministrator();
        long assetId = request.assetId() == null ? 0L : request.assetId();
        mediaPort.requireOwnedPrivateImage(assetId, actor.getUserId());
        if (photoMapper.selectActiveByOriginalAssetId(assetId) != null) {
            throw new BusinessException(ErrorCode.CONFLICT, "Asset is already registered as a managed photo");
        }

        PhotoEntity photo = new PhotoEntity();
        photo.setOriginalAssetId(assetId);
        applyEditorial(photo, request.title(), request.altText(), request.capturedAtDraft(),
            request.publishedLocationLabel(), request.locationReviewAcknowledged());
        photo.setProcessingStatus("PENDING");
        photo.setDeleted(0);
        photo.setVersion(0);
        if (photoMapper.insert(photo) != 1 || photo.getId() == null) {
            throw new BusinessException(ErrorCode.CONFLICT, "Managed photo was not registered");
        }
        mediaPort.enqueuePrivateWorkingDerivatives(assetId);
        return response(requirePhoto(photo.getId()));
    }

    @Transactional(rollbackFor = Exception.class)
    public AdminManagedPhotoResponse update(
        long photoId,
        int expectedVersion,
        AdminManagedPhotoUpdateRequest request
    ) {
        requireAdministrator();
        requirePhoto(photoId);
        String title = requireTitle(request.title());
        String altText = normalize(request.altText());
        String location = reviewedLocation(request.publishedLocationLabel(), request.locationReviewAcknowledged());
        int updated = photoMapper.updateEditorial(
            photoId,
            expectedVersion,
            title,
            altText,
            request.capturedAtDraft(),
            location
        );
        ManagementCommandVersionGuard.requireSingleRowUpdated(updated, () -> currentVersion(photoId));
        return response(requirePhoto(photoId));
    }

    private void applyEditorial(
        PhotoEntity photo,
        String title,
        String altText,
        java.time.LocalDateTime capturedAtDraft,
        String publishedLocationLabel,
        boolean locationReviewAcknowledged
    ) {
        photo.setTitle(requireTitle(title));
        photo.setAltText(normalize(altText));
        photo.setCapturedAtDraft(capturedAtDraft);
        photo.setPublishedLocationLabel(reviewedLocation(publishedLocationLabel, locationReviewAcknowledged));
    }

    private String requireTitle(String value) {
        String normalized = normalize(value);
        if (normalized.isEmpty() || normalized.length() > 256) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Photo title must contain 1 to 256 characters");
        }
        return normalized;
    }

    private String reviewedLocation(String value, boolean acknowledged) {
        String normalized = normalize(value);
        if (!normalized.isEmpty() && !acknowledged) {
            throw new BusinessException(
                ErrorCode.BAD_REQUEST,
                "Publishing a location label requires an explicit privacy review acknowledgment"
            );
        }
        return normalized.isEmpty() ? null : normalized;
    }

    private PhotoEntity requirePhoto(long photoId) {
        PhotoEntity photo = photoId <= 0 ? null : photoMapper.selectManagedById(photoId);
        if (photo == null) throw new BusinessException(ErrorCode.NOT_FOUND, "Managed photo was not found");
        return photo;
    }

    private long currentVersion(long photoId) {
        PhotoEntity current = photoMapper.selectManagedById(photoId);
        return current == null || current.getVersion() == null ? 0L : current.getVersion();
    }

    private LoginUser requireAdministrator() {
        LoginUser user = LoginUserContext.get().orElse(null);
        boolean admin = user != null && user.getGroups().stream().anyMatch("ADMIN"::equalsIgnoreCase);
        if (!admin || !user.hasPermission(MANAGE_PERMISSION) || user.getUserId() == null || user.getUserId() <= 0) {
            throw new BusinessException(ErrorCode.FORBIDDEN, "Life content management permission is required");
        }
        return user;
    }

    private AdminManagedPhotoResponse response(PhotoEntity photo) {
        int version = photo.getVersion() == null ? 0 : photo.getVersion();
        return new AdminManagedPhotoResponse(
            photo.getId(),
            photo.getTitle(),
            photo.getAltText(),
            photo.getCapturedAtDraft(),
            photo.getPublishedLocationLabel(),
            photo.getProcessingStatus(),
            photo.getRecycleTime(),
            photo.getPurgeAfter(),
            photo.getCreatedAt(),
            photo.getUpdatedAt(),
            version,
            ManagementCommandVersionGuard.toStrongEtag(version)
        );
    }

    private String normalize(String value) {
        return value == null ? "" : value.trim();
    }

    private <T> List<T> safe(List<T> values) {
        return values == null ? List.of() : values;
    }
}
