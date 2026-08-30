package io.github.shizuki.site.media.service.derivative;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.shizuki.common.storage.client.ObjectStorageClient;
import io.github.shizuki.common.storage.model.StorageObjectMetadata;
import io.github.shizuki.site.media.config.MediaDerivativeFeatureProperties;
import io.github.shizuki.site.media.config.MediaStorageProperties;
import io.github.shizuki.site.media.entity.MediaAssetEntity;
import io.github.shizuki.site.media.entity.MediaAssetVariantEntity;
import io.github.shizuki.site.media.mapper.MediaAssetMapper;
import io.github.shizuki.site.media.model.AssetAuditStatusEnum;
import io.github.shizuki.site.media.model.AssetKindEnum;
import io.github.shizuki.site.media.model.AssetVisibilityEnum;
import io.github.shizuki.site.media.model.ImageVariantTypeEnum;
import io.github.shizuki.site.media.service.security.DerivativeOutputInspection;
import io.github.shizuki.site.media.service.security.DerivativeOutputInspector;
import io.github.shizuki.site.media.service.security.ImageUploadDraftMetadata;
import io.github.shizuki.site.media.service.security.PhotoUploadDraftValidator;
import io.github.shizuki.site.media.service.security.ProtectedPhotoProcessingContext;
import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

/**
 * 基于阿里云 OSS 图片处理与 sys/saveas 的照片派生执行器。
 */
@Component
public class OssMediaDerivativeProcessor implements MediaDerivativeProcessor {

    private final ObjectStorageClient storageClient;
    private final MediaAssetMapper mediaAssetMapper;
    private final MediaStorageProperties storageProperties;
    private final MediaDerivativeFeatureProperties derivativeProperties;
    private final AvifCapabilityProbe avifCapabilityProbe;
    private final MediaDerivativeObjectKeyFactory objectKeyFactory;
    private final PhotoUploadDraftValidator sourceValidator;
    private final DerivativeOutputInspector outputInspector;
    private final ObjectMapper objectMapper;

    public OssMediaDerivativeProcessor(ObjectStorageClient storageClient,
                                       MediaAssetMapper mediaAssetMapper,
                                       MediaStorageProperties storageProperties,
                                       MediaDerivativeFeatureProperties derivativeProperties,
                                       AvifCapabilityProbe avifCapabilityProbe,
                                       MediaDerivativeObjectKeyFactory objectKeyFactory,
                                       PhotoUploadDraftValidator sourceValidator,
                                       DerivativeOutputInspector outputInspector,
                                       ObjectMapper objectMapper) {
        this.storageClient = storageClient;
        this.mediaAssetMapper = mediaAssetMapper;
        this.storageProperties = storageProperties;
        this.derivativeProperties = derivativeProperties;
        this.avifCapabilityProbe = avifCapabilityProbe;
        this.objectKeyFactory = objectKeyFactory;
        this.sourceValidator = sourceValidator;
        this.outputInspector = outputInspector;
        this.objectMapper = objectMapper;
    }

    @Override
    public boolean supports(MediaAssetVariantEntity task) {
        if (!derivativeProperties.canUseOssProcessing() || task == null) {
            return false;
        }
        try {
            ImageVariantTypeEnum.valueOf(task.getVariantCode());
            MediaDerivativeDeliveryScope.valueOf(task.getDeliveryScope());
            return derivativeProperties.getProcessorVersion().equals(task.getProcessorVersion());
        } catch (RuntimeException exception) {
            return false;
        }
    }

    @Override
    public MediaDerivativeProcessResult process(MediaAssetVariantEntity task, String targetObjectKey) {
        if (!supports(task) || !StringUtils.hasText(targetObjectKey)
            || !objectKeyFactory.create(task).equals(targetObjectKey)) {
            throw new IllegalArgumentException("unsupported OSS derivative task");
        }
        MediaAssetEntity source = mediaAssetMapper.selectById(task.getSourceAssetId());
        requireUsableSource(source);
        validateCurrentSourceBytes(source);

        ImageVariantTypeEnum variant = ImageVariantTypeEnum.valueOf(task.getVariantCode());
        MediaDerivativeDeliveryScope scope = MediaDerivativeDeliveryScope.valueOf(task.getDeliveryScope());
        if (!outputInspector.supports(variant)) {
            throw new IllegalStateException("no independent output inspector supports this derivative");
        }
        if (variant == ImageVariantTypeEnum.DISPLAY_AVIF && !avifCapabilityProbe.isSupported(source)) {
            throw new IllegalStateException("OSS AVIF capability preflight has not passed");
        }

        String destinationBucket = destinationBucket(scope);
        storageClient.saveProcessedObject(
            source.getBucketName(),
            source.getObjectKey(),
            destinationBucket,
            targetObjectKey,
            operations(variant)
        );
        try {
            StorageObjectMetadata metadata = storageClient.getObjectMetadata(destinationBucket, targetObjectKey);
            validateProcessedObject(metadata, variant);
            DerivativeOutputInspection inspection = inspectOutput(
                destinationBucket,
                targetObjectKey,
                metadata,
                variant
            );
            MediaAssetEntity asset = findOrCreateAsset(
                source,
                destinationBucket,
                targetObjectKey,
                variant,
                scope,
                metadata,
                inspection
            );
            return new MediaDerivativeProcessResult(asset.getId(), inspection.width(), inspection.height());
        } catch (RuntimeException exception) {
            deleteRejectedOutput(destinationBucket, targetObjectKey);
            throw exception;
        }
    }

    private MediaAssetEntity findOrCreateAsset(MediaAssetEntity source,
                                               String bucket,
                                               String objectKey,
                                               ImageVariantTypeEnum variant,
                                               MediaDerivativeDeliveryScope scope,
                                               StorageObjectMetadata metadata,
                                               DerivativeOutputInspection inspection) {
        MediaAssetEntity existing = mediaAssetMapper.findByStorageIdentity(bucket, objectKey);
        if (existing != null) {
            approveInspectedAsset(existing, source, variant, scope, inspection);
            return existing;
        }

        MediaAssetEntity asset = new MediaAssetEntity();
        asset.setUserId(source.getUserId());
        asset.setBucketName(bucket);
        asset.setObjectKey(objectKey);
        asset.setAssetType(AssetKindEnum.STATIC_IMAGE.name());
        asset.setAssetKindCode(AssetKindEnum.STATIC_IMAGE.getCode());
        asset.setVisibilityCode(scope == MediaDerivativeDeliveryScope.PUBLIC_MATERIALIZED
            ? AssetVisibilityEnum.PUBLIC.getCode()
            : AssetVisibilityEnum.PRIVATE.getCode());
        asset.setHomeEnabledFlag(false);
        asset.setHomeSortNum(0);
        asset.setContentTypeText(contentType(variant));
        asset.setObjectHash(inspection.sha256());
        asset.setMetadataJson(metadataJson(source.getId(), variant, scope, inspection));
        asset.setAuditStatus(AssetAuditStatusEnum.APPROVED.name());
        asset.setCreatedAt(LocalDateTime.now());
        asset.setUpdatedAt(LocalDateTime.now());
        asset.setDeleted(0);
        asset.setVersion(0);
        try {
            mediaAssetMapper.insert(asset);
            return asset;
        } catch (DuplicateKeyException duplicate) {
            MediaAssetEntity winner = mediaAssetMapper.findByStorageIdentity(bucket, objectKey);
            if (winner != null) {
                return winner;
            }
            throw duplicate;
        }
    }

    private void approveInspectedAsset(MediaAssetEntity existing,
                                       MediaAssetEntity source,
                                       ImageVariantTypeEnum variant,
                                       MediaDerivativeDeliveryScope scope,
                                       DerivativeOutputInspection inspection) {
        if (Integer.valueOf(1).equals(existing.getDeleted())
            || !source.getUserId().equals(existing.getUserId())) {
            throw new IllegalStateException("existing derivative asset ownership does not match its source");
        }
        existing.setContentTypeText(contentType(variant));
        existing.setObjectHash(inspection.sha256());
        existing.setMetadataJson(metadataJson(source.getId(), variant, scope, inspection));
        existing.setAuditStatus(AssetAuditStatusEnum.APPROVED.name());
        existing.setUpdatedAt(LocalDateTime.now());
        existing.setVersion((existing.getVersion() == null ? 0 : existing.getVersion()) + 1);
        if (mediaAssetMapper.updateById(existing) != 1) {
            throw new IllegalStateException("inspected derivative asset could not be approved");
        }
    }

    private List<String> operations(ImageVariantTypeEnum variant) {
        return switch (variant) {
            case THUMB_WEBP -> List.of(
                "auto-orient,1",
                "resize,m_fill,w_480,h_360,limit_0",
                "quality,q_82",
                "format,webp"
            );
            case DISPLAY_WEBP -> List.of(
                "auto-orient,1",
                "resize,m_lfit,w_1920,h_1920,limit_1",
                "quality,q_86",
                "format,webp"
            );
            case FULL_SANITIZED -> List.of(
                "auto-orient,1",
                "resize,m_lfit,w_4096,h_4096,limit_1",
                "quality,q_92",
                "format,webp"
            );
            case DISPLAY_AVIF -> List.of(
                "auto-orient,1",
                "resize,m_lfit,w_1920,h_1920,limit_1",
                "quality,q_82",
                "format,avif"
            );
        };
    }

    private void validateProcessedObject(StorageObjectMetadata metadata, ImageVariantTypeEnum variant) {
        if (metadata == null || metadata.getContentLength() <= 0) {
            throw new IllegalStateException("OSS derivative object is empty");
        }
        String actual = metadata.getContentType();
        if (!contentType(variant).equalsIgnoreCase(actual)) {
            throw new IllegalStateException("OSS derivative content type does not match the requested format");
        }
    }

    private String destinationBucket(MediaDerivativeDeliveryScope scope) {
        String bucket = scope == MediaDerivativeDeliveryScope.PUBLIC_MATERIALIZED
            ? storageProperties.getPublicBucket()
            : storageProperties.getPrivateBucket();
        if (!StringUtils.hasText(bucket)) {
            throw new IllegalStateException("OSS derivative destination bucket is missing");
        }
        return bucket;
    }

    private String contentType(ImageVariantTypeEnum variant) {
        return variant == ImageVariantTypeEnum.DISPLAY_AVIF ? "image/avif" : "image/webp";
    }

    private String metadataJson(Long sourceAssetId,
                                ImageVariantTypeEnum variant,
                                MediaDerivativeDeliveryScope scope,
                                DerivativeOutputInspection inspection) {
        try {
            return objectMapper.writeValueAsString(Map.of(
                "derived_from_asset_id", sourceAssetId,
                "variant_code", variant.name(),
                "delivery_scope", scope.name(),
                "processor_version", derivativeProperties.getProcessorVersion(),
                "metadata_reinspection", "PASSED",
                "decoded_width", inspection.width(),
                "decoded_height", inspection.height(),
                "decoded_frame_count", inspection.frameCount()
            ));
        } catch (JsonProcessingException exception) {
            throw new IllegalStateException("cannot serialize derivative metadata", exception);
        }
    }

    private void requireUsableSource(MediaAssetEntity source) {
        if (source == null || Integer.valueOf(1).equals(source.getDeleted())
            || source.getId() == null || source.getUserId() == null
            || !StringUtils.hasText(source.getBucketName())
            || !StringUtils.hasText(source.getObjectKey())
            || !storageProperties.getPrivateBucket().equals(source.getBucketName())
            || !Integer.valueOf(AssetVisibilityEnum.PRIVATE.getCode()).equals(source.getVisibilityCode())
            || !Integer.valueOf(AssetKindEnum.STATIC_IMAGE.getCode()).equals(source.getAssetKindCode())
            || source.getObjectHash() == null
            || !source.getObjectHash().matches("[0-9a-f]{64}")) {
            throw new IllegalArgumentException("source asset is unavailable for derivative processing");
        }
    }

    private void validateCurrentSourceBytes(MediaAssetEntity source) {
        StorageObjectMetadata metadata = storageClient.getObjectMetadata(
            source.getBucketName(),
            source.getObjectKey()
        );
        if (metadata == null || metadata.getContentLength() <= 0) {
            throw new IllegalStateException("source object metadata is unavailable");
        }
        try (InputStream stream = storageClient.getObjectStream(source.getBucketName(), source.getObjectKey())) {
            ProtectedPhotoProcessingContext context = sourceValidator.validate(
                stream,
                metadata.getContentLength(),
                source.getContentTypeText(),
                AssetKindEnum.STATIC_IMAGE
            );
            ImageUploadDraftMetadata draft = context.draftMetadata();
            if (!source.getObjectHash().equals(draft.sha256())) {
                throw new IllegalStateException("source object changed after upload validation");
            }
        } catch (IOException exception) {
            throw new IllegalStateException("source object stream could not be closed", exception);
        }
    }

    private DerivativeOutputInspection inspectOutput(String bucket,
                                                     String objectKey,
                                                     StorageObjectMetadata metadata,
                                                     ImageVariantTypeEnum variant) {
        try (InputStream stream = storageClient.getObjectStream(bucket, objectKey)) {
            return outputInspector.inspect(
                stream,
                metadata.getContentLength(),
                metadata.getContentType(),
                variant
            );
        } catch (IOException exception) {
            throw new IllegalStateException("derivative object stream could not be closed", exception);
        }
    }

    private void deleteRejectedOutput(String bucket, String objectKey) {
        try {
            storageClient.deleteObject(bucket, objectKey);
        } catch (RuntimeException ignored) {
            // Worker 保留原始处理故障；清理失败由后续引用感知清理链路继续处理。
        }
    }
}
