package io.github.shizuki.site.media.service.download;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.common.security.context.LoginUserContext;
import io.github.shizuki.common.security.model.LoginUser;
import io.github.shizuki.site.admin.response.OptimisticVersionResponse;
import io.github.shizuki.site.life.model.PhotoDownloadModeEnum;
import io.github.shizuki.site.media.mapper.MediaAssociationMapper;
import io.github.shizuki.site.media.model.OpaqueMediaReference;
import io.github.shizuki.site.media.request.PhotoDownloadPolicyUpdateRequest;
import io.github.shizuki.site.media.service.authorization.MediaAssociationRow;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 * 管理相册照片关联级下载策略，复用同一照片不会继承其他关联的授权。
 */
@Service
public class PhotoDownloadPolicyService {

    private static final String MANAGE_PERMISSION = "life.content.manage";

    private final MediaAssociationMapper associationMapper;

    public PhotoDownloadPolicyService(MediaAssociationMapper associationMapper) {
        this.associationMapper = associationMapper;
    }

    public OptimisticVersionResponse update(String mediaRef, PhotoDownloadPolicyUpdateRequest request) {
        requireAdministrator();
        if (request == null || request.mode() == null || request.expectedVersion() < 0) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Download policy is invalid");
        }
        if (request.mode() == PhotoDownloadModeEnum.ORIGINAL && !request.originalPrivacyAcknowledged()) {
            throw new BusinessException(
                ErrorCode.BAD_REQUEST,
                "Original download requires explicit metadata and privacy acknowledgement"
            );
        }
        MediaAssociationRow association = requireAlbumAssociation(mediaRef);
        if (valueOrZero(association.getAssociationVersion()) != request.expectedVersion()) {
            throw new BusinessException(ErrorCode.CONFLICT, "Download policy version changed");
        }
        int updated = associationMapper.updateAlbumDownloadMode(
            association.getAssociationId(),
            request.expectedVersion(),
            request.mode().name()
        );
        if (updated != 1) {
            throw new BusinessException(ErrorCode.CONFLICT, "Download policy version changed");
        }
        return OptimisticVersionResponse.of((long) request.expectedVersion() + 1L);
    }

    private MediaAssociationRow requireAlbumAssociation(String mediaRef) {
        if (!OpaqueMediaReference.isValid(mediaRef)) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "Media association was not found");
        }
        List<MediaAssociationRow> rows = associationMapper.findByMediaRef(mediaRef);
        if (rows == null || rows.size() != 1 || rows.get(0) == null
            || !"ALBUM".equals(rows.get(0).getAssociationType())) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "Media association was not found");
        }
        return rows.get(0);
    }

    private void requireAdministrator() {
        LoginUser user = LoginUserContext.get().orElse(null);
        boolean admin = user != null && user.getGroups().stream().anyMatch("ADMIN"::equalsIgnoreCase);
        if (!admin || !user.hasPermission(MANAGE_PERMISSION)) {
            throw new BusinessException(ErrorCode.FORBIDDEN, "Life content management permission is required");
        }
    }

    private int valueOrZero(Integer value) {
        return value == null ? 0 : value;
    }
}
