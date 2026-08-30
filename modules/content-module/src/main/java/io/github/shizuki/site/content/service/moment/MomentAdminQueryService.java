package io.github.shizuki.site.content.service.moment;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.common.security.context.LoginUserContext;
import io.github.shizuki.common.security.model.LoginUser;
import io.github.shizuki.site.admin.response.OptimisticVersionResponse;
import io.github.shizuki.site.content.entity.MomentEntity;
import io.github.shizuki.site.content.mapper.MomentAdminPhotoProcessingRow;
import io.github.shizuki.site.content.mapper.MomentAdminReadMapper;
import io.github.shizuki.site.content.mapper.AdminMomentSummaryRow;
import io.github.shizuki.site.content.response.AdminMomentDerivativeStatusResponse;
import io.github.shizuki.site.content.response.AdminMomentDetailResponse;
import io.github.shizuki.site.content.response.AdminMomentPhotoStatusResponse;
import io.github.shizuki.site.content.response.AdminMomentSummaryResponse;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MomentAdminQueryService {

    private static final String MANAGE_PERMISSION = "life.content.manage";

    private final MomentAdminReadMapper readMapper;

    public MomentAdminQueryService(MomentAdminReadMapper readMapper) {
        this.readMapper = readMapper;
    }

    @Transactional(readOnly = true)
    public List<AdminMomentSummaryResponse> list(boolean includeRecycled, int requestedLimit) {
        requireAdministrator();
        int limit = Math.max(1, Math.min(100, requestedLimit));
        List<AdminMomentSummaryRow> rows = readMapper.selectAdminList(includeRecycled ? 1 : 0, limit);
        return (rows == null ? List.<AdminMomentSummaryRow>of() : rows).stream().map(row -> {
            int version = row.getVersion() == null ? 0 : row.getVersion();
            String body = row.getBody() == null ? "" : row.getBody().strip();
            String excerpt = body.length() <= 120 ? body : body.substring(0, 117) + "…";
            return new AdminMomentSummaryResponse(
                row.getId() == null ? 0L : row.getId(),
                excerpt,
                row.getLifecycle(),
                row.getVisibility(),
                Boolean.TRUE.equals(row.getFeatured()),
                Boolean.TRUE.equals(row.getPinned()),
                row.getPhotoCount() == null ? 0 : row.getPhotoCount(),
                version,
                OptimisticVersionResponse.toEtag(version),
                row.getUpdatedAt()
            );
        }).toList();
    }

    @Transactional(readOnly = true)
    public AdminMomentDetailResponse get(long momentId) {
        requireAdministrator();
        MomentEntity moment = readMapper.selectAdminDetail(momentId);
        if (moment == null || moment.getId() == null) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "Moment was not found");
        }
        List<AdminMomentPhotoStatusResponse> photos = groupPhotos(readMapper.selectPhotoProcessing(momentId));
        int version = moment.getVersion() == null ? 0 : moment.getVersion();
        return new AdminMomentDetailResponse(
            moment.getId(),
            moment.getPublicId(),
            moment.getBody(),
            moment.getLifecycleStatus(),
            moment.getVisibilityStatus(),
            Boolean.TRUE.equals(moment.getFeatured()),
            Boolean.TRUE.equals(moment.getPinned()),
            moment.getPublishTime(),
            moment.getRecycleTime(),
            moment.getPurgeAfter(),
            version,
            OptimisticVersionResponse.toEtag(version),
            photos
        );
    }

    private List<AdminMomentPhotoStatusResponse> groupPhotos(List<MomentAdminPhotoProcessingRow> rows) {
        Map<Long, MutablePhoto> grouped = new LinkedHashMap<>();
        for (MomentAdminPhotoProcessingRow row : rows == null ? List.<MomentAdminPhotoProcessingRow>of() : rows) {
            MutablePhoto photo = grouped.computeIfAbsent(row.getPhotoId(), ignored -> new MutablePhoto(row));
            if (row.getVariantCode() != null) {
                photo.derivatives.add(new AdminMomentDerivativeStatusResponse(
                    row.getVariantCode(),
                    row.getDeliveryScope(),
                    row.getDerivativeStatus(),
                    "FAILED".equalsIgnoreCase(row.getDerivativeStatus())
                        ? "DERIVATIVE_PROCESSING_FAILED"
                        : null,
                    row.getAssetAuditStatus(),
                    "FAILED".equalsIgnoreCase(row.getDerivativeStatus()),
                    row.getDerivativeVersion(),
                    row.getDerivativeVersion() == null ? null : OptimisticVersionResponse.toEtag(row.getDerivativeVersion()),
                    "FAILED".equalsIgnoreCase(row.getDerivativeStatus())
                        ? adminRetryPath(row.getMediaRef(), row.getVariantCode())
                        : null,
                    isPreviewReady(row) ? adminPreviewPath(row.getMediaRef(), row.getVariantCode()) : null
                ));
            }
        }
        return grouped.values().stream().map(MutablePhoto::toResponse).toList();
    }

    private boolean isPreviewReady(MomentAdminPhotoProcessingRow row) {
        return "READY".equalsIgnoreCase(row.getDerivativeStatus())
            && "APPROVED".equalsIgnoreCase(row.getAssetAuditStatus());
    }

    private String adminPreviewPath(String mediaRef, String variant) {
        return "/api/v1/admin/life/media-associations/" + mediaRef + "/preview/" + variant;
    }

    private String adminRetryPath(String mediaRef, String variant) {
        return "/api/v1/admin/life/media-associations/" + mediaRef + "/processing/" + variant + "/retry";
    }

    private void requireAdministrator() {
        LoginUser user = LoginUserContext.get().orElse(null);
        boolean admin = user != null && user.getGroups().stream().anyMatch("ADMIN"::equalsIgnoreCase);
        if (!admin || !user.hasPermission(MANAGE_PERMISSION)) {
            throw new BusinessException(ErrorCode.FORBIDDEN, "Life content management permission is required");
        }
    }

    private static final class MutablePhoto {
        private final MomentAdminPhotoProcessingRow row;
        private final List<AdminMomentDerivativeStatusResponse> derivatives = new ArrayList<>();

        private MutablePhoto(MomentAdminPhotoProcessingRow row) {
            this.row = row;
        }

        private AdminMomentPhotoStatusResponse toResponse() {
            return new AdminMomentPhotoStatusResponse(
                row.getPhotoId(),
                row.getMediaRef(),
                row.getSortNum() == null ? 0 : row.getSortNum(),
                row.getTitle(),
                row.getAltText(),
                row.getPublishedLocationLabel(),
                row.getPhotoStatus(),
                derivatives
            );
        }
    }
}
