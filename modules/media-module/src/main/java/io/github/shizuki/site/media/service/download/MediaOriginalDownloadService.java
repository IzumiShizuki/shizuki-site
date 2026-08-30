package io.github.shizuki.site.media.service.download;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.common.storage.client.ObjectStorageClient;
import io.github.shizuki.common.storage.model.StorageObjectMetadata;
import io.github.shizuki.site.media.config.MediaStorageProperties;
import io.github.shizuki.site.media.entity.MediaAssetEntity;
import io.github.shizuki.site.media.mapper.MediaAssetMapper;
import io.github.shizuki.site.media.model.AssetAuditStatusEnum;
import io.github.shizuki.site.media.model.AssetKindEnum;
import io.github.shizuki.site.media.model.AssetVisibilityEnum;
import io.github.shizuki.site.media.service.gateway.MediaGatewayStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HexFormat;
import java.util.Set;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * 已授权原图的私有、无缓存、站内流式交付。
 */
@Service
public class MediaOriginalDownloadService {

    private static final Set<String> ORIGINAL_IMAGE_TYPES = Set.of(
        "image/jpeg",
        "image/png",
        "image/webp",
        "image/gif",
        "image/apng"
    );

    private final OriginalDownloadAuthorizationService authorizationService;
    private final MediaAssetMapper assetMapper;
    private final ObjectStorageClient storageClient;
    private final MediaStorageProperties storageProperties;

    public MediaOriginalDownloadService(OriginalDownloadAuthorizationService authorizationService,
                                        MediaAssetMapper assetMapper,
                                        ObjectStorageClient storageClient,
                                        MediaStorageProperties storageProperties) {
        this.authorizationService = authorizationService;
        this.assetMapper = assetMapper;
        this.storageClient = storageClient;
        this.storageProperties = storageProperties;
    }

    public MediaGatewayStream open(String mediaRef, String capability) {
        AuthorizedOriginalDownload authorization = authorizationService.authorize(mediaRef, capability)
            .orElseThrow(this::notFound);
        MediaAssetEntity asset = assetMapper.selectById(authorization.sourceAssetId());
        if (!isEligibleOriginal(asset)) {
            throw notFound();
        }

        StorageObjectMetadata metadata;
        InputStream stream;
        try {
            metadata = storageClient.getObjectMetadata(asset.getBucketName(), asset.getObjectKey());
            if (!isEligibleMetadata(metadata, asset)) {
                throw notFound();
            }
            stream = storageClient.getObjectStream(asset.getBucketName(), asset.getObjectKey());
            if (stream == null) {
                throw notFound();
            }
        } catch (BusinessException exception) {
            throw exception;
        } catch (RuntimeException exception) {
            throw new BusinessException(ErrorCode.UPSTREAM_UNAVAILABLE, "Original media delivery is unavailable");
        }
        return new MediaGatewayStream(
            stream,
            metadata.getContentType().toLowerCase(),
            metadata.getContentLength(),
            "private, no-store, max-age=0",
            siteEtag(authorization, asset)
        );
    }

    private boolean isEligibleOriginal(MediaAssetEntity asset) {
        return asset != null
            && !Integer.valueOf(1).equals(asset.getDeleted())
            && asset.getId() != null
            && storageProperties.getPrivateBucket().equals(asset.getBucketName())
            && StringUtils.hasText(asset.getObjectKey())
            && Integer.valueOf(AssetVisibilityEnum.PRIVATE.getCode()).equals(asset.getVisibilityCode())
            && Integer.valueOf(AssetKindEnum.STATIC_IMAGE.getCode()).equals(asset.getAssetKindCode())
            && AssetAuditStatusEnum.APPROVED.name().equals(asset.getAuditStatus())
            && ORIGINAL_IMAGE_TYPES.contains(normalizeType(asset.getContentTypeText()));
    }

    private boolean isEligibleMetadata(StorageObjectMetadata metadata, MediaAssetEntity asset) {
        return metadata != null
            && metadata.getContentLength() > 0
            && metadata.getContentLength() <= storageProperties.getMaxUploadSize()
            && ORIGINAL_IMAGE_TYPES.contains(normalizeType(metadata.getContentType()))
            && normalizeType(metadata.getContentType()).equals(normalizeType(asset.getContentTypeText()));
    }

    private String normalizeType(String raw) {
        return raw == null ? "" : raw.trim().toLowerCase();
    }

    private String siteEtag(AuthorizedOriginalDownload authorization, MediaAssetEntity asset) {
        String identity = String.join(":",
            "original",
            authorization.mediaRef(),
            Long.toString(authorization.sourceAssetId()),
            Integer.toString(authorization.contentVersion()),
            Integer.toString(authorization.associationVersion()),
            asset.getObjectHash() == null ? "no-hash" : asset.getObjectHash()
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
