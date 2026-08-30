package io.github.shizuki.site.media.service.gateway;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.common.storage.client.ObjectStorageClient;
import io.github.shizuki.common.storage.model.StorageObjectMetadata;
import io.github.shizuki.site.media.config.MediaGatewayProperties;
import io.github.shizuki.site.media.config.MediaStorageProperties;
import io.github.shizuki.site.media.entity.MediaAssetEntity;
import io.github.shizuki.site.media.mapper.MediaAssetMapper;
import io.github.shizuki.site.media.model.AssetAuditStatusEnum;
import io.github.shizuki.site.media.model.AssetVisibilityEnum;
import io.github.shizuki.site.media.model.ImageVariantTypeEnum;
import io.github.shizuki.site.media.service.authorization.AuthorizedMediaAssociation;
import io.github.shizuki.site.media.service.authorization.MediaAssociationAuthorizationService;
import io.github.shizuki.site.media.service.derivative.MediaDerivativeDeliveryScope;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HexFormat;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * 逐次授权并以站内响应流代理 OSS 媒体；此服务从不生成或返回上游 URL。
 */
@Service
public class MediaGatewayService {

    private final MediaAssociationAuthorizationService authorizationService;
    private final MediaAssetMapper assetMapper;
    private final ObjectStorageClient storageClient;
    private final MediaStorageProperties storageProperties;
    private final MediaGatewayProperties gatewayProperties;

    public MediaGatewayService(MediaAssociationAuthorizationService authorizationService,
                               MediaAssetMapper assetMapper,
                               ObjectStorageClient storageClient,
                               MediaStorageProperties storageProperties,
                               MediaGatewayProperties gatewayProperties) {
        this.authorizationService = authorizationService;
        this.assetMapper = assetMapper;
        this.storageClient = storageClient;
        this.storageProperties = storageProperties;
        this.gatewayProperties = gatewayProperties;
    }

    public MediaGatewayStream open(String mediaRef,
                                   ImageVariantTypeEnum variant,
                                   String capability) {
        AuthorizedMediaAssociation authorization = authorizationService
            .authorizeGatewayVariant(mediaRef, variant, capability)
            .orElseThrow(this::notFound);
        MediaAssetEntity asset = assetMapper.selectById(authorization.variantAssetId());
        if (!isEligibleAsset(asset, authorization.deliveryScope(), variant)) {
            throw notFound();
        }

        StorageObjectMetadata metadata;
        InputStream stream;
        try {
            metadata = storageClient.getObjectMetadata(asset.getBucketName(), asset.getObjectKey());
            if (!isEligibleMetadata(metadata, asset, variant)) {
                throw notFound();
            }
            stream = storageClient.getObjectStream(asset.getBucketName(), asset.getObjectKey());
            if (stream == null) {
                throw notFound();
            }
        } catch (BusinessException exception) {
            throw exception;
        } catch (RuntimeException exception) {
            throw new BusinessException(ErrorCode.UPSTREAM_UNAVAILABLE, "Media delivery is unavailable");
        }

        boolean publicDelivery = authorization.deliveryScope() == MediaDerivativeDeliveryScope.PUBLIC_MATERIALIZED;
        String cacheControl = publicDelivery
            ? "public, max-age=" + gatewayProperties.getPublicMaxAgeSeconds() + ", must-revalidate"
            : "private, no-store, max-age=0";
        return new MediaGatewayStream(
            stream,
            metadata.getContentType().toLowerCase(),
            metadata.getContentLength(),
            cacheControl,
            siteEtag(authorization)
        );
    }

    private boolean isEligibleAsset(MediaAssetEntity asset,
                                    MediaDerivativeDeliveryScope scope,
                                    ImageVariantTypeEnum variant) {
        if (asset == null || Integer.valueOf(1).equals(asset.getDeleted())
            || asset.getId() == null || !StringUtils.hasText(asset.getBucketName())
            || !StringUtils.hasText(asset.getObjectKey())
            || !AssetAuditStatusEnum.APPROVED.name().equals(asset.getAuditStatus())) {
            return false;
        }
        boolean publicDelivery = scope == MediaDerivativeDeliveryScope.PUBLIC_MATERIALIZED;
        int expectedVisibility = publicDelivery
            ? AssetVisibilityEnum.PUBLIC.getCode()
            : AssetVisibilityEnum.PRIVATE.getCode();
        String expectedBucket = publicDelivery
            ? storageProperties.getPublicBucket()
            : storageProperties.getPrivateBucket();
        return Integer.valueOf(expectedVisibility).equals(asset.getVisibilityCode())
            && expectedBucket.equals(asset.getBucketName())
            && expectedContentType(variant).equalsIgnoreCase(asset.getContentTypeText());
    }

    private boolean isEligibleMetadata(StorageObjectMetadata metadata,
                                       MediaAssetEntity asset,
                                       ImageVariantTypeEnum variant) {
        return metadata != null
            && metadata.getContentLength() > 0
            && metadata.getContentLength() <= storageProperties.getMaxUploadSize()
            && expectedContentType(variant).equalsIgnoreCase(metadata.getContentType())
            && metadata.getContentType().equalsIgnoreCase(asset.getContentTypeText());
    }

    private String expectedContentType(ImageVariantTypeEnum variant) {
        return variant == ImageVariantTypeEnum.DISPLAY_AVIF ? "image/avif" : "image/webp";
    }

    private String siteEtag(AuthorizedMediaAssociation authorization) {
        String identity = String.join(":",
            authorization.mediaRef(),
            authorization.associationType(),
            Long.toString(authorization.associationId()),
            Long.toString(authorization.variantAssetId()),
            Integer.toString(authorization.contentVersion()),
            Integer.toString(authorization.associationVersion()),
            authorization.variant().name(),
            authorization.deliveryScope().name()
        );
        try {
            byte[] hash = MessageDigest.getInstance("SHA-256")
                .digest(identity.getBytes(StandardCharsets.UTF_8));
            return "\"mgw-" + HexFormat.of().formatHex(hash, 0, 16) + "\"";
        } catch (NoSuchAlgorithmException exception) {
            throw new IllegalStateException("SHA-256 is unavailable", exception);
        }
    }

    private BusinessException notFound() {
        return new BusinessException(ErrorCode.NOT_FOUND, "Media is unavailable");
    }
}
