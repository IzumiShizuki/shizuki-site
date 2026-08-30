package io.github.shizuki.site.media.service.download;

import io.github.shizuki.site.life.model.LifeContentLifecycleEnum;
import io.github.shizuki.site.life.model.LifeContentVisibilityEnum;
import io.github.shizuki.site.life.model.PhotoDownloadModeEnum;
import io.github.shizuki.site.media.mapper.MediaAssociationMapper;
import io.github.shizuki.site.media.model.ImageDerivativeStatusEnum;
import io.github.shizuki.site.media.model.ImageVariantTypeEnum;
import io.github.shizuki.site.media.model.OpaqueMediaReference;
import io.github.shizuki.site.media.response.OriginalDownloadCapabilityResponse;
import io.github.shizuki.site.media.service.authorization.MediaAssociationAuthorizationService;
import io.github.shizuki.site.media.service.authorization.MediaAssociationRow;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

/**
 * 签发和验证关联级原图下载 capability。
 */
@Service
public class OriginalDownloadAuthorizationService {

    private final MediaAssociationMapper associationMapper;
    private final MediaAssociationAuthorizationService presentationAuthorization;
    private final OriginalDownloadCapabilityCodec capabilityCodec;

    public OriginalDownloadAuthorizationService(MediaAssociationMapper associationMapper,
                                                MediaAssociationAuthorizationService presentationAuthorization,
                                                OriginalDownloadCapabilityCodec capabilityCodec) {
        this.associationMapper = associationMapper;
        this.presentationAuthorization = presentationAuthorization;
        this.capabilityCodec = capabilityCodec;
    }

    public Optional<OriginalDownloadCapabilityResponse> issue(String mediaRef,
                                                              String presentationCapability) {
        Optional<MediaAssociationRow> resolved = findCanonical(mediaRef);
        if (resolved.isEmpty() || !isOriginalDownloadEligible(resolved.get())) {
            return Optional.empty();
        }
        MediaAssociationRow association = resolved.get();
        if (LifeContentVisibilityEnum.UNLISTED.name().equals(association.getVisibilityStatus())) {
            if (presentationCapability == null || presentationCapability.isBlank()
                || presentationAuthorization.authorizeGatewayVariant(
                    mediaRef,
                    ImageVariantTypeEnum.DISPLAY_WEBP,
                    presentationCapability
                ).isEmpty()) {
                return Optional.empty();
            }
        } else if (presentationCapability != null && !presentationCapability.isBlank()) {
            return Optional.empty();
        }

        IssuedOriginalDownloadCapability issued = capabilityCodec.issue(
            mediaRef,
            association.getAssociationType(),
            association.getAssociationId(),
            valueOrZero(association.getContentVersion()),
            valueOrZero(association.getAssociationVersion())
        );
        return Optional.of(new OriginalDownloadCapabilityResponse(issued.token(), issued.expiresAt()));
    }

    public Optional<AuthorizedOriginalDownload> authorize(String mediaRef, String capability) {
        Optional<OriginalDownloadCapabilityClaims> verified = capabilityCodec.verify(capability);
        if (verified.isEmpty() || !verified.get().mediaRef().equals(mediaRef)) {
            return Optional.empty();
        }
        Optional<MediaAssociationRow> resolved = findCanonical(mediaRef);
        if (resolved.isEmpty() || !isOriginalDownloadEligible(resolved.get())) {
            return Optional.empty();
        }
        MediaAssociationRow association = resolved.get();
        OriginalDownloadCapabilityClaims claims = verified.get();
        if (!claims.associationType().equals(association.getAssociationType())
            || claims.associationId() != association.getAssociationId()
            || claims.contentVersion() != valueOrZero(association.getContentVersion())
            || claims.associationVersion() != valueOrZero(association.getAssociationVersion())) {
            return Optional.empty();
        }
        return Optional.of(new AuthorizedOriginalDownload(
            mediaRef,
            association.getSourceAssetId(),
            valueOrZero(association.getContentVersion()),
            valueOrZero(association.getAssociationVersion())
        ));
    }

    private Optional<MediaAssociationRow> findCanonical(String mediaRef) {
        if (!OpaqueMediaReference.isValid(mediaRef)) {
            return Optional.empty();
        }
        List<MediaAssociationRow> rows = associationMapper.findByMediaRef(mediaRef);
        if (rows == null || rows.size() != 1) {
            return Optional.empty();
        }
        return Optional.ofNullable(rows.get(0));
    }

    private boolean isOriginalDownloadEligible(MediaAssociationRow row) {
        return row != null
            && "ALBUM".equals(row.getAssociationType())
            && row.getAssociationId() != null
            && row.getSourceAssetId() != null
            && Boolean.FALSE.equals(row.getDeliveryRevoked())
            && LifeContentLifecycleEnum.PUBLISHED.name().equals(row.getLifecycleStatus())
            && (LifeContentVisibilityEnum.PUBLIC.name().equals(row.getVisibilityStatus())
                || LifeContentVisibilityEnum.UNLISTED.name().equals(row.getVisibilityStatus()))
            && ImageDerivativeStatusEnum.READY.name().equals(row.getProcessingStatus())
            && PhotoDownloadModeEnum.ORIGINAL.name().equals(row.getDownloadMode());
    }

    private int valueOrZero(Integer value) {
        return value == null ? 0 : value;
    }
}
