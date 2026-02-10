package io.github.shizuki.site.media.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.common.security.context.LoginUserContext;
import io.github.shizuki.common.storage.client.ObjectStorageClient;
import io.github.shizuki.common.storage.util.OssKeyBuilder;
import io.github.shizuki.common.storage.util.UploadValidator;
import io.github.shizuki.site.media.config.MediaStorageProperties;
import io.github.shizuki.site.media.dto.AssetCreateRequest;
import io.github.shizuki.site.media.dto.UploadPolicyRequest;
import io.github.shizuki.site.media.dto.UploadPolicyResponse;
import io.github.shizuki.site.media.entity.MediaAssetEntity;
import io.github.shizuki.site.media.entity.MediaAssetReportEntity;
import io.github.shizuki.site.media.mapper.MediaAssetMapper;
import io.github.shizuki.site.media.mapper.MediaAssetReportMapper;
import io.github.shizuki.site.media.service.MediaService;
import java.time.LocalDateTime;
import java.util.Locale;
import java.util.Map;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class MediaServiceImpl implements MediaService {

    private final ObjectStorageClient objectStorageClient;
    private final MediaStorageProperties mediaStorageProperties;
    private final MediaAssetMapper mediaAssetMapper;
    private final MediaAssetReportMapper mediaAssetReportMapper;

    public MediaServiceImpl(ObjectStorageClient objectStorageClient,
                         MediaStorageProperties mediaStorageProperties,
                         MediaAssetMapper mediaAssetMapper,
                         MediaAssetReportMapper mediaAssetReportMapper) {
        this.objectStorageClient = objectStorageClient;
        this.mediaStorageProperties = mediaStorageProperties;
        this.mediaAssetMapper = mediaAssetMapper;
        this.mediaAssetReportMapper = mediaAssetReportMapper;
    }

    @Override
    public UploadPolicyResponse createUploadPolicy(UploadPolicyRequest request) {
        UploadValidator.validate(
            request.getFileName(),
            request.getContentType(),
            1,
            mediaStorageProperties.getMaxUploadSize(),
            mediaStorageProperties.getAllowedContentTypes()
        );
        Long userId = LoginUserContext.get().map(loginUser -> loginUser.getUserId()).orElse(0L);
        String extension = getExtension(request.getFileName());
        String key = OssKeyBuilder.build("assets", "user", userId, extension);
        String uploadUrl = objectStorageClient.generatePutUrl(
            mediaStorageProperties.getPrivateBucket(),
            key,
            mediaStorageProperties.getSignExpireSeconds()
        );
        return new UploadPolicyResponse(
            mediaStorageProperties.getPrivateBucket(),
            key,
            uploadUrl,
            mediaStorageProperties.getSignExpireSeconds()
        );
    }

    @Override
    public Map<String, Object> createAsset(AssetCreateRequest request) {
        Long userId = LoginUserContext.get().map(loginUser -> loginUser.getUserId()).orElse(0L);
        MediaAssetEntity asset = new MediaAssetEntity();
        asset.setUserId(userId);
        asset.setBucketName(request.getBucket());
        asset.setObjectKey(request.getKey());
        asset.setAssetType(request.getAssetType());
        asset.setAuditStatus("PENDING_AUDIT");
        asset.setCreatedAt(LocalDateTime.now());
        asset.setUpdatedAt(LocalDateTime.now());
        mediaAssetMapper.insert(asset);

        return Map.of(
            "asset_id", asset.getId(),
            "bucket", asset.getBucketName(),
            "key", asset.getObjectKey(),
            "asset_type", asset.getAssetType(),
            "status", asset.getAuditStatus()
        );
    }

    @Override
    public Map<String, Object> createDownloadUrl(Long assetId) {
        MediaAssetEntity asset = mediaAssetMapper.selectById(assetId);
        if (asset == null) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "Asset not found");
        }
        String downloadUrl = objectStorageClient.generateGetUrl(
            asset.getBucketName(),
            asset.getObjectKey(),
            mediaStorageProperties.getSignExpireSeconds()
        );
        return Map.of(
            "asset_id", assetId,
            "download_url", downloadUrl,
            "expire_seconds", mediaStorageProperties.getSignExpireSeconds()
        );
    }

    @Override
    public Map<String, Object> reportAsset(Long assetId) {
        MediaAssetEntity asset = mediaAssetMapper.selectById(assetId);
        if (asset == null) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "Asset not found");
        }

        MediaAssetReportEntity report = new MediaAssetReportEntity();
        report.setAssetId(assetId);
        report.setStatus("CREATED");
        report.setCreatedAt(LocalDateTime.now());
        mediaAssetReportMapper.insert(report);
        return Map.of("asset_id", assetId, "report_status", "CREATED", "report_id", report.getId());
    }

    @Override
    public Map<String, Object> auditAsset(Long assetId, String auditStatus) {
        MediaAssetEntity asset = mediaAssetMapper.selectById(assetId);
        if (asset == null) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "Asset not found");
        }
        String normalized = StringUtils.hasText(auditStatus) ? auditStatus.toUpperCase(Locale.ROOT) : "PENDING_AUDIT";
        asset.setAuditStatus(normalized);
        asset.setUpdatedAt(LocalDateTime.now());
        mediaAssetMapper.updateById(asset);
        return Map.of("asset_id", assetId, "audit_status", normalized);
    }

    private String getExtension(String fileName) {
        int index = fileName.lastIndexOf('.');
        if (index < 0 || index == fileName.length() - 1) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "File extension is required");
        }
        return fileName.substring(index + 1);
    }
}
