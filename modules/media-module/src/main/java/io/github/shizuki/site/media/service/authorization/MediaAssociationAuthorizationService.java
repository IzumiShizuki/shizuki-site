package io.github.shizuki.site.media.service.authorization;

import io.github.shizuki.site.life.model.LifeContentLifecycleEnum;
import io.github.shizuki.site.life.model.LifeContentVisibilityEnum;
import io.github.shizuki.site.life.model.PhotoDownloadModeEnum;
import io.github.shizuki.site.media.config.MediaDerivativeFeatureProperties;
import io.github.shizuki.site.media.entity.MediaAssetVariantEntity;
import io.github.shizuki.site.media.mapper.MediaAssociationMapper;
import io.github.shizuki.site.media.mapper.MediaAssetVariantMapper;
import io.github.shizuki.site.media.model.ImageDerivativeStatusEnum;
import io.github.shizuki.site.media.model.ImageVariantTypeEnum;
import io.github.shizuki.site.media.model.OpaqueMediaReference;
import io.github.shizuki.site.media.port.PublicMediaPresentationPort;
import io.github.shizuki.site.media.response.ProtectedMediaPresentationResponse;
import io.github.shizuki.site.media.response.ProtectedMediaVariantRouteResponse;
import io.github.shizuki.site.media.response.PublicMediaPresentationResponse;
import io.github.shizuki.site.media.response.PublicMediaVariantRouteResponse;
import io.github.shizuki.site.media.service.gateway.MediaGatewayActorScope;
import io.github.shizuki.site.media.service.gateway.MediaGatewayCapabilityClaims;
import io.github.shizuki.site.media.service.gateway.MediaGatewayCapabilityCodec;
import io.github.shizuki.site.media.service.derivative.MediaDerivativeDeliveryScope;
import io.github.shizuki.common.security.context.LoginUserContext;
import io.github.shizuki.common.security.model.LoginUser;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

/**
 * 以具体内容关联而不是共享 asset 进行公共媒体授权。
 */
@Service
public class MediaAssociationAuthorizationService implements PublicMediaPresentationPort {

    private static final List<ImageVariantTypeEnum> PRESENTATION_VARIANTS = List.of(
        ImageVariantTypeEnum.THUMB_WEBP,
        ImageVariantTypeEnum.DISPLAY_WEBP,
        ImageVariantTypeEnum.DISPLAY_AVIF,
        ImageVariantTypeEnum.FULL_SANITIZED
    );

    private final MediaAssociationMapper associationMapper;
    private final MediaAssetVariantMapper variantMapper;
    private final MediaDerivativeFeatureProperties derivativeProperties;
    private final MediaGatewayCapabilityCodec capabilityCodec;

    public MediaAssociationAuthorizationService(MediaAssociationMapper associationMapper,
                                                MediaAssetVariantMapper variantMapper,
                                                MediaDerivativeFeatureProperties derivativeProperties,
                                                MediaGatewayCapabilityCodec capabilityCodec) {
        this.associationMapper = associationMapper;
        this.variantMapper = variantMapper;
        this.derivativeProperties = derivativeProperties;
        this.capabilityCodec = capabilityCodec;
    }

    public Optional<AuthorizedMediaAssociation> authorizePublicVariant(String mediaRef,
                                                                       ImageVariantTypeEnum variant) {
        if (!OpaqueMediaReference.isValid(mediaRef) || variant == null) {
            return Optional.empty();
        }
        Optional<MediaAssociationRow> resolved = findCanonicalAssociation(mediaRef);
        if (resolved.isEmpty()) {
            return Optional.empty();
        }
        MediaAssociationRow association = resolved.get();
        if (!isPublicAssociationEligible(association) || !isVariantAllowed(association, variant)) {
            return Optional.empty();
        }
        return authorizeDerivative(association, variant, MediaDerivativeDeliveryScope.PUBLIC_MATERIALIZED);
    }

    /**
     * 网关统一入口。携带 capability 时绝不降级为公共访问，避免无效凭证掩盖调用错误。
     */
    public Optional<AuthorizedMediaAssociation> authorizeGatewayVariant(String mediaRef,
                                                                        ImageVariantTypeEnum variant,
                                                                        String capability) {
        if (capability == null || capability.isBlank()) {
            return authorizePublicVariant(mediaRef, variant);
        }
        Optional<MediaGatewayCapabilityClaims> verified = capabilityCodec.verify(capability);
        if (verified.isEmpty() || !matchesRequest(verified.get(), mediaRef, variant)) {
            return Optional.empty();
        }
        Optional<MediaAssociationRow> resolved = findCanonicalAssociation(mediaRef);
        if (resolved.isEmpty()) {
            return Optional.empty();
        }
        MediaAssociationRow association = resolved.get();
        MediaGatewayCapabilityClaims claims = verified.get();
        if (!matchesAssociation(claims, association)
            || !isCapabilityActorEligible(claims, association)
            || !isPhotoReady(association)
            || !isVariantAllowed(association, variant)) {
            return Optional.empty();
        }
        return authorizeDerivative(association, variant, MediaDerivativeDeliveryScope.PRIVATE_WORKING);
    }

    /**
     * 为已发布但未列出的内容签发链接 capability。调用方仍负责保护承载该链接的内容入口。
     */
    public Optional<String> issueUnlistedCapability(String mediaRef, ImageVariantTypeEnum variant) {
        Optional<MediaAssociationRow> resolved = findCanonicalAssociation(mediaRef);
        if (resolved.isEmpty()) {
            return Optional.empty();
        }
        MediaAssociationRow association = resolved.get();
        if (!isUnlistedAssociationEligible(association) || !isVariantAllowed(association, variant)
            || authorizeDerivative(association, variant, MediaDerivativeDeliveryScope.PRIVATE_WORKING).isEmpty()) {
            return Optional.empty();
        }
        return Optional.of(issueCapability(association, variant, MediaGatewayActorScope.UNLISTED_LINK, 0L));
    }

    /**
     * 为当前管理员签发草稿/私有内容预览 capability。
     */
    public Optional<String> issueAdminPreviewCapability(String mediaRef, ImageVariantTypeEnum variant) {
        LoginUser actor = LoginUserContext.get().orElse(null);
        if (!isAdmin(actor)) {
            return Optional.empty();
        }
        Optional<MediaAssociationRow> resolved = findCanonicalAssociation(mediaRef);
        if (resolved.isEmpty()) {
            return Optional.empty();
        }
        MediaAssociationRow association = resolved.get();
        if (!isAdminPreviewAssociationEligible(association) || !isVariantAllowed(association, variant)
            || authorizeDerivative(association, variant, MediaDerivativeDeliveryScope.PRIVATE_WORKING).isEmpty()) {
            return Optional.empty();
        }
        return Optional.of(issueCapability(
            association,
            variant,
            MediaGatewayActorScope.ADMIN_PREVIEW,
            actor.getUserId()
        ));
    }

    @Override
    public Optional<PublicMediaPresentationResponse> resolvePublicPresentation(String mediaRef) {
        List<PublicMediaVariantRouteResponse> routes = new ArrayList<>();
        String altText = "";
        for (ImageVariantTypeEnum variant : PRESENTATION_VARIANTS) {
            Optional<AuthorizedMediaAssociation> authorization = authorizePublicVariant(mediaRef, variant);
            if (authorization.isEmpty()) {
                continue;
            }
            AuthorizedMediaAssociation allowed = authorization.get();
            altText = allowed.altText();
            routes.add(new PublicMediaVariantRouteResponse(
                variant,
                "/api/v1/media/" + mediaRef + "/variants/" + variant.name(),
                allowed.width(),
                allowed.height(),
                variant == ImageVariantTypeEnum.DISPLAY_AVIF ? "avif" : "webp"
            ));
        }
        if (routes.isEmpty()) {
            return Optional.empty();
        }
        return Optional.of(new PublicMediaPresentationResponse(mediaRef, altText, routes));
    }

    @Override
    public Optional<ProtectedMediaPresentationResponse> resolveUnlistedPresentation(String mediaRef) {
        Optional<MediaAssociationRow> resolved = findCanonicalAssociation(mediaRef);
        if (resolved.isEmpty() || !isUnlistedAssociationEligible(resolved.get())) {
            return Optional.empty();
        }
        MediaAssociationRow association = resolved.get();
        List<ProtectedMediaVariantRouteResponse> routes = new ArrayList<>();
        String altText = association.getAltText() == null ? "" : association.getAltText().trim();
        for (ImageVariantTypeEnum variant : PRESENTATION_VARIANTS) {
            if (!isVariantAllowed(association, variant)) {
                continue;
            }
            Optional<AuthorizedMediaAssociation> authorization = authorizeDerivative(
                association,
                variant,
                MediaDerivativeDeliveryScope.PRIVATE_WORKING
            );
            if (authorization.isEmpty()) {
                continue;
            }
            AuthorizedMediaAssociation allowed = authorization.get();
            String capability = issueCapability(
                association,
                variant,
                MediaGatewayActorScope.UNLISTED_LINK,
                0L
            );
            routes.add(new ProtectedMediaVariantRouteResponse(
                variant,
                "/api/v1/media/" + mediaRef + "/variants/" + variant.name(),
                allowed.width(),
                allowed.height(),
                variant == ImageVariantTypeEnum.DISPLAY_AVIF ? "avif" : "webp",
                capability
            ));
        }
        if (routes.isEmpty()) {
            return Optional.empty();
        }
        return Optional.of(new ProtectedMediaPresentationResponse(mediaRef, altText, routes));
    }

    private boolean isPublicAssociationEligible(MediaAssociationRow row) {
        return row != null
            && row.getAssociationId() != null
            && row.getSourceAssetId() != null
            && LifeContentLifecycleEnum.PUBLISHED.name().equals(row.getLifecycleStatus())
            && LifeContentVisibilityEnum.PUBLIC.name().equals(row.getVisibilityStatus())
            && Boolean.FALSE.equals(row.getDeliveryRevoked())
            && ImageDerivativeStatusEnum.READY.name().equals(row.getProcessingStatus());
    }

    private boolean isUnlistedAssociationEligible(MediaAssociationRow row) {
        return isPhotoReady(row)
            && LifeContentLifecycleEnum.PUBLISHED.name().equals(row.getLifecycleStatus())
            && LifeContentVisibilityEnum.UNLISTED.name().equals(row.getVisibilityStatus())
            && Boolean.FALSE.equals(row.getDeliveryRevoked());
    }

    private boolean isAdminPreviewAssociationEligible(MediaAssociationRow row) {
        return isPhotoReady(row)
            && (LifeContentLifecycleEnum.DRAFT.name().equals(row.getLifecycleStatus())
                || LifeContentLifecycleEnum.PUBLISHED.name().equals(row.getLifecycleStatus()));
    }

    private boolean isPhotoReady(MediaAssociationRow row) {
        return row != null
            && row.getAssociationId() != null
            && row.getSourceAssetId() != null
            && ImageDerivativeStatusEnum.READY.name().equals(row.getProcessingStatus());
    }

    private boolean isVariantAllowed(MediaAssociationRow association, ImageVariantTypeEnum variant) {
        if (variant != ImageVariantTypeEnum.FULL_SANITIZED) {
            return true;
        }
        return PhotoDownloadModeEnum.SANITIZED.name().equals(association.getDownloadMode())
            || PhotoDownloadModeEnum.ORIGINAL.name().equals(association.getDownloadMode());
    }

    private boolean isReady(MediaAssetVariantEntity derivative) {
        return derivative != null
            && ImageDerivativeStatusEnum.READY.name().equals(derivative.getProcessStatus())
            && derivative.getVariantAssetId() != null
            && derivative.getWidth() != null && derivative.getWidth() > 0
            && derivative.getHeight() != null && derivative.getHeight() > 0;
    }

    private Optional<MediaAssociationRow> findCanonicalAssociation(String mediaRef) {
        if (!OpaqueMediaReference.isValid(mediaRef)) {
            return Optional.empty();
        }
        List<MediaAssociationRow> rows = associationMapper.findByMediaRef(mediaRef);
        if (rows == null || rows.size() != 1) {
            return Optional.empty();
        }
        return Optional.ofNullable(rows.get(0));
    }

    private Optional<AuthorizedMediaAssociation> authorizeDerivative(MediaAssociationRow association,
                                                                     ImageVariantTypeEnum variant,
                                                                     MediaDerivativeDeliveryScope scope) {
        if (variant == null) {
            return Optional.empty();
        }
        MediaAssetVariantEntity derivative = variantMapper.findByIdentity(
            association.getSourceAssetId(),
            variant.name(),
            scope.name(),
            derivativeProperties.getProcessorVersion()
        );
        if (!isReady(derivative)) {
            return Optional.empty();
        }
        return Optional.of(new AuthorizedMediaAssociation(
            association.getMediaRef(),
            association.getAssociationType(),
            association.getAssociationId(),
            derivative.getVariantAssetId(),
            valueOrZero(association.getContentVersion()),
            valueOrZero(association.getAssociationVersion()),
            variant,
            scope,
            derivative.getWidth(),
            derivative.getHeight(),
            association.getAltText() == null ? "" : association.getAltText().trim()
        ));
    }

    private boolean matchesRequest(MediaGatewayCapabilityClaims claims,
                                   String mediaRef,
                                   ImageVariantTypeEnum variant) {
        return claims.mediaRef().equals(mediaRef) && claims.variant() == variant;
    }

    private boolean matchesAssociation(MediaGatewayCapabilityClaims claims, MediaAssociationRow association) {
        return claims.associationType().equals(association.getAssociationType())
            && claims.associationId() == association.getAssociationId()
            && claims.contentVersion() == valueOrZero(association.getContentVersion())
            && claims.associationVersion() == valueOrZero(association.getAssociationVersion());
    }

    private boolean isCapabilityActorEligible(MediaGatewayCapabilityClaims claims,
                                              MediaAssociationRow association) {
        if (claims.actorScope() == MediaGatewayActorScope.UNLISTED_LINK) {
            return claims.actorId() == 0 && isUnlistedAssociationEligible(association);
        }
        LoginUser current = LoginUserContext.get().orElse(null);
        return claims.actorScope() == MediaGatewayActorScope.ADMIN_PREVIEW
            && isAdmin(current)
            && current.getUserId() != null
            && current.getUserId() == claims.actorId()
            && isAdminPreviewAssociationEligible(association);
    }

    private boolean isAdmin(LoginUser user) {
        return user != null && user.getGroups().stream().anyMatch("ADMIN"::equalsIgnoreCase);
    }

    private String issueCapability(MediaAssociationRow association,
                                   ImageVariantTypeEnum variant,
                                   MediaGatewayActorScope actorScope,
                                   long actorId) {
        return capabilityCodec.issue(
            association.getMediaRef(),
            association.getAssociationType(),
            association.getAssociationId(),
            variant,
            actorScope,
            actorId,
            valueOrZero(association.getContentVersion()),
            valueOrZero(association.getAssociationVersion())
        );
    }

    private int valueOrZero(Integer value) {
        return value == null ? 0 : value;
    }
}
