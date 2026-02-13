package io.github.shizuki.site.media.service.security;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.common.storage.client.ObjectStorageClient;
import io.github.shizuki.common.storage.model.StorageObjectMetadata;
import io.github.shizuki.site.media.config.MediaStorageProperties;
import io.github.shizuki.site.media.mapper.MediaAssetMapper;
import io.github.shizuki.site.media.model.AssetKindEnum;
import io.github.shizuki.site.media.model.AssetSecurityScanStatusEnum;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

/**
 * 默认资产安全检查器。
 *
 * <p>一期能力：
 * 1) 读取对象元数据并提取 ETag 指纹；
 * 2) 可选执行“同用户 object_hash 去重”；
 * 3) 可选标记安全扫描状态（先占位，待二期接入外部扫描引擎）。
 */
@Component
public class DefaultAssetSecurityInspector implements AssetSecurityInspector {

    /**
     * 静态图片允许的 MIME（用于“请求 MIME 与存储 MIME 一致性”二次校验）。
     */
    private static final Set<String> STATIC_IMAGE_TYPES = Set.of("image/png", "image/jpeg", "image/webp");
    /**
     * 动态图片允许的 MIME。
     */
    private static final Set<String> ANIMATED_IMAGE_TYPES = Set.of("image/gif", "image/webp", "image/apng");
    /**
     * Live2D 包允许的 MIME。
     */
    private static final Set<String> LIVE2D_TYPES = Set.of("application/zip", "application/x-zip-compressed");

    private final ObjectStorageClient objectStorageClient;
    private final MediaAssetMapper mediaAssetMapper;
    private final MediaStorageProperties mediaStorageProperties;

    public DefaultAssetSecurityInspector(ObjectStorageClient objectStorageClient,
                                         MediaAssetMapper mediaAssetMapper,
                                         MediaStorageProperties mediaStorageProperties) {
        this.objectStorageClient = objectStorageClient;
        this.mediaAssetMapper = mediaAssetMapper;
        this.mediaStorageProperties = mediaStorageProperties;
    }

    @Override
    public AssetInspectionResult inspect(Long userId,
                                         String bucket,
                                         String key,
                                         AssetKindEnum assetKind,
                                         String requestContentType,
                                         Map<String, Object> requestMetadata) {
        StorageObjectMetadata objectMetadata = objectStorageClient.getObjectMetadata(bucket, key);
        String objectHash = normalizeHash(objectMetadata.getEtag());
        String normalizedRequestContentType = normalizeContentType(requestContentType);
        String normalizedStorageContentType = normalizeContentType(objectMetadata.getContentType());

        // 要求“请求声明 MIME”与“存储端记录 MIME”一致，避免客户端伪造类型。
        if (StringUtils.hasText(normalizedRequestContentType)
            && StringUtils.hasText(normalizedStorageContentType)
            && !normalizedRequestContentType.equals(normalizedStorageContentType)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Storage content type mismatch with request");
        }
        // 存储端 MIME 若可读取，则再次验证与资产种类兼容，避免错误落库。
        if (StringUtils.hasText(normalizedStorageContentType)
            && !isContentTypeAllowedForAssetKind(assetKind, normalizedStorageContentType)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Storage content type is not allowed for asset kind");
        }

        // 一期默认按“同用户 + object_hash”做轻量去重，防止重复上传同内容对象。
        if (mediaStorageProperties.isEnableObjectHashDedup() && StringUtils.hasText(objectHash)) {
            Boolean exists = mediaAssetMapper.existsByUserIdAndObjectHash(userId, objectHash);
            if (Boolean.TRUE.equals(exists)) {
                throw new BusinessException(ErrorCode.BAD_REQUEST, "Duplicate asset content for current user");
            }
        }

        AssetSecurityScanStatusEnum scanStatus = mediaStorageProperties.isEnableSecurityScanHook()
            ? AssetSecurityScanStatusEnum.PENDING
            : AssetSecurityScanStatusEnum.BYPASSED;
        String scanMessage = scanStatus == AssetSecurityScanStatusEnum.PENDING
            ? "SECURITY_SCAN_PENDING"
            : "SECURITY_SCAN_BYPASSED";

        return new AssetInspectionResult(
            objectHash,
            scanStatus.name(),
            scanMessage,
            objectMetadata.getContentLength() > 0 ? objectMetadata.getContentLength() : null,
            normalizedStorageContentType
        );
    }

    /**
     * 归一化 ETag。
     *
     * <p>阿里云返回值可能带引号，统一剥离后转小写。
     */
    private String normalizeHash(String raw) {
        if (!StringUtils.hasText(raw)) {
            return null;
        }
        String hash = raw.trim();
        if (hash.startsWith("\"") && hash.endsWith("\"") && hash.length() > 1) {
            hash = hash.substring(1, hash.length() - 1);
        }
        return hash.toLowerCase();
    }

    /**
     * 归一化 content-type。
     *
     * <p>处理大小写、参数后缀与 zip 别名，避免比较误差。
     */
    private String normalizeContentType(String raw) {
        if (!StringUtils.hasText(raw)) {
            return null;
        }
        String normalized = raw.trim().toLowerCase(Locale.ROOT);
        int semicolonIndex = normalized.indexOf(';');
        if (semicolonIndex >= 0) {
            normalized = normalized.substring(0, semicolonIndex).trim();
        }
        if ("application/x-zip-compressed".equals(normalized)) {
            return "application/zip";
        }
        return normalized;
    }

    /**
     * 检查 MIME 是否匹配资产类别。
     */
    private boolean isContentTypeAllowedForAssetKind(AssetKindEnum assetKind, String contentType) {
        return switch (assetKind) {
            case STATIC_IMAGE -> STATIC_IMAGE_TYPES.contains(contentType);
            case ANIMATED_IMAGE -> ANIMATED_IMAGE_TYPES.contains(contentType);
            case LIVE2D_PACKAGE -> LIVE2D_TYPES.contains(contentType) || "application/zip".equals(contentType);
        };
    }
}
