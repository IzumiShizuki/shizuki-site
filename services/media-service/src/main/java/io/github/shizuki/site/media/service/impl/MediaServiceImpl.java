package io.github.shizuki.site.media.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.common.security.context.LoginUserContext;
import io.github.shizuki.common.security.model.LoginUser;
import io.github.shizuki.common.storage.client.ObjectStorageClient;
import io.github.shizuki.common.storage.config.OssProperties;
import io.github.shizuki.common.storage.util.OssKeyBuilder;
import io.github.shizuki.common.storage.util.UploadValidator;
import io.github.shizuki.site.media.config.MediaStorageProperties;
import io.github.shizuki.site.media.dto.AdminAssetUpdateRequest;
import io.github.shizuki.site.media.dto.AdminAssetAuditResponse;
import io.github.shizuki.site.media.dto.AssetCreateRequest;
import io.github.shizuki.site.media.dto.AssetCreateResponse;
import io.github.shizuki.site.media.dto.AssetDownloadResponse;
import io.github.shizuki.site.media.dto.AssetReportResponse;
import io.github.shizuki.site.media.dto.L2dValidationResponse;
import io.github.shizuki.site.media.dto.PublicHomeRoleResponse;
import io.github.shizuki.site.media.dto.UploadPolicyRequest;
import io.github.shizuki.site.media.dto.UploadPolicyResponse;
import io.github.shizuki.site.media.entity.MediaAssetEntity;
import io.github.shizuki.site.media.entity.MediaAssetGroupAclEntity;
import io.github.shizuki.site.media.entity.MediaAssetReportEntity;
import io.github.shizuki.site.media.entity.MediaL2dPackageEntity;
import io.github.shizuki.site.media.mapper.MediaAssetGroupAclMapper;
import io.github.shizuki.site.media.mapper.MediaAssetMapper;
import io.github.shizuki.site.media.mapper.MediaAssetReportMapper;
import io.github.shizuki.site.media.mapper.MediaL2dPackageMapper;
import io.github.shizuki.site.media.model.AssetAuditStatusEnum;
import io.github.shizuki.site.media.model.AssetKindEnum;
import io.github.shizuki.site.media.model.AssetVisibilityEnum;
import io.github.shizuki.site.media.model.L2dValidationEnum;
import io.github.shizuki.site.media.service.MediaService;
import io.github.shizuki.site.media.service.l2d.L2dValidationResult;
import io.github.shizuki.site.media.service.l2d.L2dZipValidator;
import io.github.shizuki.site.media.service.security.AssetInspectionResult;
import io.github.shizuki.site.media.service.security.AssetSecurityInspector;
import java.io.InputStream;
import java.net.URI;
import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;
import org.springframework.transaction.support.TransactionTemplate;
import org.springframework.util.StringUtils;

/**
 * 媒体域核心服务实现，负责上传策略、资产落库、公开角色池与下载链接等主流程。
 */
@Service
public class MediaServiceImpl implements MediaService {

    /**
     * 静态图片白名单。
     */
    private static final Set<String> STATIC_IMAGE_TYPES = Set.of("image/png", "image/jpeg", "image/webp");
    /**
     * 动态图片白名单（一期优先 GIF，同时预留 WebP/APNG）。
     */
    private static final Set<String> ANIMATED_IMAGE_TYPES = Set.of("image/gif", "image/webp", "image/apng");
    /**
     * Live2D 包白名单。
     */
    private static final Set<String> LIVE2D_TYPES = Set.of("application/zip", "application/x-zip-compressed");

    private final ObjectStorageClient objectStorageClient;
    private final MediaStorageProperties mediaStorageProperties;
    private final OssProperties ossProperties;
    private final MediaAssetMapper mediaAssetMapper;
    private final MediaAssetGroupAclMapper mediaAssetGroupAclMapper;
    private final MediaAssetReportMapper mediaAssetReportMapper;
    private final MediaL2dPackageMapper mediaL2dPackageMapper;
    private final L2dZipValidator l2dZipValidator;
    private final AssetSecurityInspector assetSecurityInspector;
    private final ObjectMapper objectMapper;
    private final TransactionTemplate transactionTemplate;

    /**
     * 构造媒体服务实现。
     *
     * @param objectStorageClient 对象存储客户端
     * @param mediaStorageProperties 媒体配置
     * @param ossProperties OSS 基础配置
     * @param mediaAssetMapper 资产主表访问器
     * @param mediaAssetReportMapper 举报表访问器
     * @param mediaL2dPackageMapper L2D 扩展表访问器
     * @param l2dZipValidator L2D ZIP 校验器
     * @param assetSecurityInspector 资产安全检查器（去重/扫描状态）
     * @param objectMapper JSON 序列化组件
     * @param transactionTemplate 事务模板
     */
    public MediaServiceImpl(ObjectStorageClient objectStorageClient,
                            MediaStorageProperties mediaStorageProperties,
                            OssProperties ossProperties,
                            MediaAssetMapper mediaAssetMapper,
                            MediaAssetGroupAclMapper mediaAssetGroupAclMapper,
                            MediaAssetReportMapper mediaAssetReportMapper,
                            MediaL2dPackageMapper mediaL2dPackageMapper,
                            L2dZipValidator l2dZipValidator,
                            AssetSecurityInspector assetSecurityInspector,
                            ObjectMapper objectMapper,
                            TransactionTemplate transactionTemplate) {
        this.objectStorageClient = objectStorageClient;
        this.mediaStorageProperties = mediaStorageProperties;
        this.ossProperties = ossProperties;
        this.mediaAssetMapper = mediaAssetMapper;
        this.mediaAssetGroupAclMapper = mediaAssetGroupAclMapper;
        this.mediaAssetReportMapper = mediaAssetReportMapper;
        this.mediaL2dPackageMapper = mediaL2dPackageMapper;
        this.l2dZipValidator = l2dZipValidator;
        this.assetSecurityInspector = assetSecurityInspector;
        this.objectMapper = objectMapper;
        this.transactionTemplate = transactionTemplate;
    }

    /**
     * 创建上传策略：完成登录校验、类型校验、上传约束校验并签发直传 URL。
     */
    @Override
    public UploadPolicyResponse createUploadPolicy(UploadPolicyRequest request) {
        Long userId = requireLoginUserId();
        AssetKindEnum assetKind = AssetKindEnum.fromName(request.getAssetKind());
        AssetVisibilityEnum visibility = AssetVisibilityEnum.fromName(request.getVisibility(), AssetVisibilityEnum.PRIVATE);
        validateContentTypeByKind(assetKind, request.getContentType());

        UploadValidator.validate(
            request.getFileName(),
            request.getContentType(),
            1,
            mediaStorageProperties.getMaxUploadSize(),
            mediaStorageProperties.getAllowedContentTypes()
        );

        // key 继续沿用统一构建器，保证对象路径可追溯到用户与场景。
        String extension = getExtension(request.getFileName());
        String bucket = bucketByVisibility(visibility);
        String key = OssKeyBuilder.build("assets", "user-" + userId, userId, extension);
        String uploadUrl = objectStorageClient.generatePutUrl(
            bucket,
            key,
            mediaStorageProperties.getSignExpireSeconds()
        );
        return new UploadPolicyResponse(
            bucket,
            key,
            uploadUrl,
            mediaStorageProperties.getSignExpireSeconds(),
            assetKind.name(),
            assetKind.getCode(),
            "DIRECT_OSS"
        );
    }

    /**
     * 写入资产元数据；若为 L2D 包则先校验 ZIP，再在事务中完成双表持久化。
     */
    @Override
    public AssetCreateResponse createAsset(AssetCreateRequest request) {
        Long userId = requireLoginUserId();
        AssetKindEnum assetKind = AssetKindEnum.fromName(request.getAssetKind());
        AssetVisibilityEnum visibility = AssetVisibilityEnum.fromName(request.getVisibility(), AssetVisibilityEnum.PRIVATE);
        Set<String> normalizedAllowedGroups = normalizeGroupCodes(request.getAllowedGroupCodes());
        validateVisibilityAcl(visibility, normalizedAllowedGroups);

        validateContentTypeByKind(assetKind, request.getContentType());
        // 防止通过伪造 bucket 绕过可见性策略（公开/私有桶强绑定）。
        if (!bucketByVisibility(visibility).equals(request.getBucket())) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Bucket does not match visibility");
        }
        if (!objectStorageClient.objectExists(request.getBucket(), request.getKey())) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Object does not exist in storage");
        }

        AssetInspectionResult inspectionResult = assetSecurityInspector.inspect(
            userId,
            request.getBucket(),
            request.getKey(),
            assetKind,
            request.getContentType(),
            request.getMetadata()
        );
        Map<String, Object> normalizedMetadata = enrichMetadata(request.getMetadata(), inspectionResult);

        // L2D 校验放到事务外，避免远程 IO 与 ZIP 解析长时间占用数据库事务。
        L2dValidationResult l2dValidation = null;
        if (assetKind == AssetKindEnum.LIVE2D_PACKAGE) {
            l2dValidation = validateL2dPackage(request.getBucket(), request.getKey());
        }
        final L2dValidationResult persistedL2dValidation = l2dValidation;
        final Set<String> persistedAllowedGroups = normalizedAllowedGroups;

        MediaAssetEntity persisted = transactionTemplate.execute(status -> {
            MediaAssetEntity asset = new MediaAssetEntity();
            asset.setUserId(userId);
            asset.setBucketName(request.getBucket());
            asset.setObjectKey(request.getKey());
            asset.setAssetType(StringUtils.hasText(request.getAssetType())
                ? request.getAssetType().trim()
                : assetKind.name());
            asset.setAssetKindCode(assetKind.getCode());
            asset.setVisibilityCode(visibility.getCode());
            asset.setHomeEnabledFlag(false);
            asset.setHomeSortNum(0);
            asset.setContentTypeText(request.getContentType());
            asset.setObjectHash(inspectionResult == null ? null : inspectionResult.objectHash());
            asset.setMetadataJson(writeJson(normalizedMetadata));
            asset.setAuditStatus(AssetAuditStatusEnum.PENDING_AUDIT.name());
            asset.setCreatedAt(LocalDateTime.now());
            asset.setUpdatedAt(LocalDateTime.now());
            mediaAssetMapper.insert(asset);

            if (persistedL2dValidation != null) {
                persistL2dPackage(asset.getId(), persistedL2dValidation);
            }
            if (visibility == AssetVisibilityEnum.GROUP) {
                replaceAssetAcl(asset.getId(), persistedAllowedGroups);
            }
            return asset;
        });

        if (persisted == null) {
            throw new BusinessException(ErrorCode.INTERNAL_ERROR, "Create asset failed");
        }

        return new AssetCreateResponse(
            persisted.getId(),
            persisted.getBucketName(),
            persisted.getObjectKey(),
            assetKind.name(),
            visibility.name(),
            persisted.getAuditStatus(),
            "CREATED",
            l2dValidation == null ? null : new L2dValidationResponse(
                L2dValidationEnum.PASSED.name(),
                l2dValidation.getEntryModelJson(),
                l2dValidation.getTextureCount()
            )
        );
    }

    /**
     * 生成下载地址：
     * 1) PUBLIC + APPROVED 允许匿名访问；
     * 2) 其余情况仅资源 owner 或 ADMIN 允许访问；
     * 3) 不满足条件统一返回 403。
     */
    @Override
    public AssetDownloadResponse createDownloadUrl(Long assetId) {
        MediaAssetEntity asset = mediaAssetMapper.selectById(assetId);
        if (asset == null) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "Asset not found");
        }

        AssetKindEnum assetKind = resolveAssetKind(asset);
        AssetVisibilityEnum visibility = AssetVisibilityEnum.fromCode(
            asset.getVisibilityCode() == null ? AssetVisibilityEnum.PRIVATE.getCode() : asset.getVisibilityCode()
        );
        AssetAuditStatusEnum auditStatus = resolveAuditStatus(asset);
        Set<String> aclGroups = visibility == AssetVisibilityEnum.GROUP
            ? loadAssetAclGroups(assetId)
            : Set.of();
        boolean canAccessAsPublic = visibility == AssetVisibilityEnum.PUBLIC && auditStatus == AssetAuditStatusEnum.APPROVED;
        if (canAccessAsPublic) {
            return new AssetDownloadResponse(
                assetId,
                assetKind.name(),
                true,
                buildPublicUrl(asset.getBucketName(), asset.getObjectKey()),
                null,
                null
            );
        }

        LoginUser loginUser = currentLoginUser();
        if (loginUser == null || !canAccessRestrictedAsset(asset, loginUser, visibility, aclGroups)) {
            throw new BusinessException(ErrorCode.FORBIDDEN, "No permission to access this asset");
        }

        String downloadUrl = objectStorageClient.generateGetUrl(
            asset.getBucketName(),
            asset.getObjectKey(),
            mediaStorageProperties.getSignExpireSeconds()
        );
        return new AssetDownloadResponse(
            assetId,
            assetKind.name(),
            false,
            null,
            downloadUrl,
            mediaStorageProperties.getSignExpireSeconds()
        );
    }

    /**
     * 创建资源举报记录。
     */
    @Override
    public AssetReportResponse reportAsset(Long assetId) {
        requireLoginUserId();
        MediaAssetEntity asset = mediaAssetMapper.selectById(assetId);
        if (asset == null) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "Asset not found");
        }

        MediaAssetReportEntity report = new MediaAssetReportEntity();
        report.setAssetId(assetId);
        report.setStatus("CREATED");
        report.setCreatedAt(LocalDateTime.now());
        mediaAssetReportMapper.insert(report);
        return new AssetReportResponse(assetId, report.getId(), "CREATED");
    }

    /**
     * 管理员更新资源审核与展示状态。
     */
    @Override
    public AdminAssetAuditResponse auditAsset(Long assetId, AdminAssetUpdateRequest request) {
        MediaAssetEntity asset = mediaAssetMapper.selectById(assetId);
        if (asset == null) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "Asset not found");
        }
        if (request == null) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Request body is required");
        }
        AssetVisibilityEnum previousVisibility = AssetVisibilityEnum.fromCode(
            asset.getVisibilityCode() == null ? AssetVisibilityEnum.PRIVATE.getCode() : asset.getVisibilityCode()
        );
        AssetVisibilityEnum targetVisibility = previousVisibility;
        boolean visibilitySpecified = StringUtils.hasText(request.getVisibility());
        boolean aclSpecified = request.getAllowedGroupCodes() != null;
        Set<String> normalizedAllowedGroups = normalizeGroupCodes(request.getAllowedGroupCodes());
        boolean replaceAcl = false;

        if (StringUtils.hasText(request.getAuditStatus())) {
            AssetAuditStatusEnum auditStatus = AssetAuditStatusEnum.fromName(request.getAuditStatus());
            asset.setAuditStatus(auditStatus.name());
        }

        if (request.getHomeEnabled() != null) {
            asset.setHomeEnabledFlag(request.getHomeEnabled());
        }

        if (request.getHomeSortNum() != null) {
            asset.setHomeSortNum(Math.max(0, request.getHomeSortNum()));
        }

        if (StringUtils.hasText(request.getVisibility())) {
            AssetVisibilityEnum visibility = AssetVisibilityEnum.fromName(request.getVisibility(), AssetVisibilityEnum.PRIVATE);
            String expectedBucket = bucketByVisibility(visibility);
            // 仅允许更新“状态语义”，不在本接口做对象搬迁，避免桶与可见性不一致。
            if (!expectedBucket.equals(asset.getBucketName())) {
                throw new BusinessException(ErrorCode.BAD_REQUEST, "Visibility cannot be changed when bucket mismatches");
            }
            asset.setVisibilityCode(visibility.getCode());
            targetVisibility = visibility;
        }

        if (targetVisibility == AssetVisibilityEnum.GROUP) {
            if (!aclSpecified && previousVisibility != AssetVisibilityEnum.GROUP) {
                throw new BusinessException(ErrorCode.BAD_REQUEST, "Allowed groups are required for GROUP visibility");
            }
            if (aclSpecified) {
                if (normalizedAllowedGroups.isEmpty()) {
                    throw new BusinessException(ErrorCode.BAD_REQUEST, "Allowed groups are required for GROUP visibility");
                }
                replaceAcl = true;
            }
        } else {
            if (aclSpecified && !normalizedAllowedGroups.isEmpty()) {
                throw new BusinessException(ErrorCode.BAD_REQUEST, "Allowed groups can only be set for GROUP visibility");
            }
        }

        asset.setUpdatedAt(LocalDateTime.now());
        mediaAssetMapper.updateById(asset);
        if (targetVisibility == AssetVisibilityEnum.GROUP && replaceAcl) {
            replaceAssetAcl(assetId, normalizedAllowedGroups);
        }
        if (targetVisibility != AssetVisibilityEnum.GROUP && previousVisibility == AssetVisibilityEnum.GROUP && visibilitySpecified) {
            clearAssetAcl(assetId);
        }

        AssetKindEnum assetKind = resolveAssetKind(asset);
        return new AdminAssetAuditResponse(
            assetId,
            asset.getAuditStatus(),
            Boolean.TRUE.equals(asset.getHomeEnabledFlag()),
            asset.getHomeSortNum(),
            targetVisibility.name(),
            assetKind.name()
        );
    }

    /**
     * 查询首页公开角色池。
     */
    @Override
    public List<PublicHomeRoleResponse> listPublicHomeRoles() {
        List<MediaAssetEntity> assets = mediaAssetMapper.selectList(
            new LambdaQueryWrapper<MediaAssetEntity>()
                .eq(MediaAssetEntity::getVisibilityCode, AssetVisibilityEnum.PUBLIC.getCode())
                .eq(MediaAssetEntity::getAuditStatus, AssetAuditStatusEnum.APPROVED.name())
                .eq(MediaAssetEntity::getHomeEnabledFlag, true)
                .orderByAsc(MediaAssetEntity::getHomeSortNum)
                .orderByAsc(MediaAssetEntity::getId)
        );

        Set<Long> l2dAssetIds = assets.stream()
            .filter(asset -> resolveAssetKind(asset) == AssetKindEnum.LIVE2D_PACKAGE)
            .map(MediaAssetEntity::getId)
            .collect(Collectors.toSet());
        Map<Long, MediaL2dPackageEntity> l2dMap = l2dAssetIds.isEmpty()
            ? Map.of()
            : mediaL2dPackageMapper.selectList(
                    new LambdaQueryWrapper<MediaL2dPackageEntity>().in(MediaL2dPackageEntity::getAssetId, l2dAssetIds)
                ).stream()
                .collect(Collectors.toMap(MediaL2dPackageEntity::getAssetId, Function.identity()));

        return assets.stream()
            .map(asset -> {
                AssetKindEnum assetKind = resolveAssetKind(asset);
                String publicUrl = buildPublicUrl(asset.getBucketName(), asset.getObjectKey());
                MediaL2dPackageEntity l2d = l2dMap.get(asset.getId());
                return new PublicHomeRoleResponse(
                    asset.getId(),
                    assetKind.name(),
                    publicUrl,
                    publicUrl,
                    l2d == null ? null : l2d.getEntryModelJson(),
                    asset.getHomeSortNum()
                );
            })
            .toList();
    }

    /**
     * 从对象存储读取并校验 L2D ZIP。
     */
    private L2dValidationResult validateL2dPackage(String bucket, String key) {
        try (InputStream stream = objectStorageClient.getObjectStream(bucket, key)) {
            return l2dZipValidator.validate(stream);
        } catch (Exception exception) {
            if (exception instanceof BusinessException businessException) {
                throw businessException;
            }
            throw new BusinessException(ErrorCode.BAD_REQUEST, "L2D package validation failed");
        }
    }

    /**
     * 写入 L2D 扩展表。
     */
    private void persistL2dPackage(Long assetId, L2dValidationResult result) {
        MediaL2dPackageEntity l2dEntity = new MediaL2dPackageEntity();
        l2dEntity.setAssetId(assetId);
        l2dEntity.setEntryModelJson(result.getEntryModelJson());
        l2dEntity.setMocPath(result.getMocPath());
        l2dEntity.setTextureCount(result.getTextureCount());
        l2dEntity.setMotionGroupCount(result.getMotionGroupCount());
        l2dEntity.setExpressionCount(result.getExpressionCount());
        l2dEntity.setHasPhysicsFlag(result.isHasPhysics());
        l2dEntity.setHasPoseFlag(result.isHasPose());
        l2dEntity.setValidationCode(L2dValidationEnum.PASSED.getCode());
        l2dEntity.setReferencesJson(writeJson(result.getReferences()));
        l2dEntity.setCreatedAt(LocalDateTime.now());
        l2dEntity.setUpdatedAt(LocalDateTime.now());
        mediaL2dPackageMapper.insert(l2dEntity);
    }

    /**
     * 合并用户元数据与系统元数据（object_hash、安全扫描状态等）。
     *
     * <p>系统字段总是覆盖同名用户字段，避免被客户端伪造。
     */
    private Map<String, Object> enrichMetadata(Map<String, Object> rawMetadata, AssetInspectionResult inspectionResult) {
        Map<String, Object> merged = new LinkedHashMap<>();
        if (rawMetadata != null) {
            merged.putAll(rawMetadata);
        }
        if (inspectionResult != null) {
            if (StringUtils.hasText(inspectionResult.objectHash())) {
                merged.put("object_hash", inspectionResult.objectHash());
            }
            if (StringUtils.hasText(inspectionResult.scanStatus())) {
                merged.put("security_scan_status", inspectionResult.scanStatus());
            }
            if (StringUtils.hasText(inspectionResult.scanMessage())) {
                merged.put("security_scan_message", inspectionResult.scanMessage());
            }
            if (inspectionResult.objectSizeBytes() != null) {
                merged.put("object_size_bytes", inspectionResult.objectSizeBytes());
            }
            if (StringUtils.hasText(inspectionResult.storageContentType())) {
                merged.put("storage_content_type", inspectionResult.storageContentType());
            }
        }
        return merged;
    }

    /**
     * 将对象写为 JSON。空值统一回写为空对象，避免下游出现 null 判空分支。
     */
    private String writeJson(Object payload) {
        try {
            return objectMapper.writeValueAsString(payload == null ? Map.of() : payload);
        } catch (JsonProcessingException exception) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "JSON serialization failed");
        }
    }

    /**
     * 读取当前登录用户 ID，不存在则抛未登录异常。
     */
    private Long requireLoginUserId() {
        Long userId = LoginUserContext.get().map(loginUser -> loginUser.getUserId()).orElse(0L);
        if (userId == null || userId <= 0) {
            throw new BusinessException(ErrorCode.UNAUTHORIZED, "Login required");
        }
        return userId;
    }

    private LoginUser currentLoginUser() {
        return LoginUserContext.get()
            .filter(loginUser -> loginUser.getUserId() != null && loginUser.getUserId() > 0)
            .orElse(null);
    }

    private boolean canAccessRestrictedAsset(MediaAssetEntity asset,
                                             LoginUser loginUser,
                                             AssetVisibilityEnum visibility,
                                             Set<String> allowedGroups) {
        boolean owner = loginUser.getUserId().equals(asset.getUserId());
        boolean admin = loginUser.getGroups().stream().anyMatch(group -> "ADMIN".equalsIgnoreCase(group));
        if (owner || admin) {
            return true;
        }
        if (visibility != AssetVisibilityEnum.GROUP || allowedGroups == null || allowedGroups.isEmpty()) {
            return false;
        }
        Set<String> userGroups = normalizeGroupCodes(loginUser.getGroups());
        return userGroups.stream().anyMatch(allowedGroups::contains);
    }

    private Set<String> loadAssetAclGroups(Long assetId) {
        return mediaAssetGroupAclMapper.selectList(
                new LambdaQueryWrapper<MediaAssetGroupAclEntity>()
                    .eq(MediaAssetGroupAclEntity::getAssetId, assetId)
                    .orderByAsc(MediaAssetGroupAclEntity::getGroupCode)
            ).stream()
            .map(MediaAssetGroupAclEntity::getGroupCode)
            .collect(Collectors.toCollection(LinkedHashSet::new));
    }

    private void replaceAssetAcl(Long assetId, Set<String> allowedGroups) {
        clearAssetAcl(assetId);
        if (allowedGroups == null || allowedGroups.isEmpty()) {
            return;
        }
        LocalDateTime now = LocalDateTime.now();
        for (String groupCode : allowedGroups) {
            MediaAssetGroupAclEntity acl = new MediaAssetGroupAclEntity();
            acl.setAssetId(assetId);
            acl.setGroupCode(groupCode);
            acl.setCreatedAt(now);
            acl.setUpdatedAt(now);
            mediaAssetGroupAclMapper.insert(acl);
        }
    }

    private void clearAssetAcl(Long assetId) {
        List<MediaAssetGroupAclEntity> existing = mediaAssetGroupAclMapper.selectList(
            new LambdaQueryWrapper<MediaAssetGroupAclEntity>().eq(MediaAssetGroupAclEntity::getAssetId, assetId)
        );
        existing.forEach(entity -> mediaAssetGroupAclMapper.deleteById(entity.getId()));
    }

    private void validateVisibilityAcl(AssetVisibilityEnum visibility, Set<String> allowedGroups) {
        if (visibility == AssetVisibilityEnum.GROUP && (allowedGroups == null || allowedGroups.isEmpty())) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Allowed groups are required for GROUP visibility");
        }
        if (visibility != AssetVisibilityEnum.GROUP && allowedGroups != null && !allowedGroups.isEmpty()) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Allowed groups can only be set for GROUP visibility");
        }
    }

    private Set<String> normalizeGroupCodes(Set<String> groups) {
        if (groups == null || groups.isEmpty()) {
            return Set.of();
        }
        Set<String> normalized = groups.stream()
            .map(value -> value == null ? null : value.trim())
            .filter(StringUtils::hasText)
            .map(value -> value.toUpperCase(Locale.ROOT))
            .collect(Collectors.toCollection(LinkedHashSet::new));
        return normalized.isEmpty() ? Set.of() : normalized;
    }

    /**
     * 优先以新字段 `asset_kind_code` 解析；兼容历史 `asset_type` 回退读取。
     */
    private AssetKindEnum resolveAssetKind(MediaAssetEntity asset) {
        if (asset.getAssetKindCode() != null) {
            return AssetKindEnum.fromCode(asset.getAssetKindCode());
        }
        if (StringUtils.hasText(asset.getAssetType())) {
            try {
                return AssetKindEnum.fromName(asset.getAssetType());
            } catch (BusinessException ignored) {
                return AssetKindEnum.STATIC_IMAGE;
            }
        }
        return AssetKindEnum.STATIC_IMAGE;
    }

    private AssetAuditStatusEnum resolveAuditStatus(MediaAssetEntity asset) {
        if (!StringUtils.hasText(asset.getAuditStatus())) {
            return AssetAuditStatusEnum.PENDING_AUDIT;
        }
        try {
            return AssetAuditStatusEnum.fromName(asset.getAuditStatus());
        } catch (BusinessException ignored) {
            return AssetAuditStatusEnum.PENDING_AUDIT;
        }
    }

    /**
     * 按可见性映射目标 bucket。
     */
    private String bucketByVisibility(AssetVisibilityEnum visibility) {
        if (visibility == AssetVisibilityEnum.PUBLIC) {
            return mediaStorageProperties.getPublicBucket();
        }
        return mediaStorageProperties.getPrivateBucket();
    }

    /**
     * 校验资源类型与 MIME 的匹配关系，防止类型伪造。
     */
    private void validateContentTypeByKind(AssetKindEnum assetKind, String contentType) {
        if (!StringUtils.hasText(contentType)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Content type is required");
        }
        String normalized = contentType.toLowerCase(Locale.ROOT).trim();
        boolean matched = switch (assetKind) {
            case STATIC_IMAGE -> STATIC_IMAGE_TYPES.contains(normalized);
            case ANIMATED_IMAGE -> ANIMATED_IMAGE_TYPES.contains(normalized);
            case LIVE2D_PACKAGE -> LIVE2D_TYPES.contains(normalized);
        };
        if (!matched) {
            throw new BusinessException(ErrorCode.BAD_REQUEST,
                "Unsupported content type for " + assetKind.name() + ": " + contentType);
        }
    }

    /**
     * 生成公开访问 URL：
     * 1) 优先使用显式配置的 `publicBaseUrl`；
     * 2) 否则基于 OSS endpoint 推导；
     * 3) 若无法推导则返回配置错误。
     */
    private String buildPublicUrl(String bucket, String key) {
        if (StringUtils.hasText(mediaStorageProperties.getPublicBaseUrl())) {
            String baseUrl = trimTrailingSlash(mediaStorageProperties.getPublicBaseUrl());
            return baseUrl + "/" + key;
        }

        if (!StringUtils.hasText(ossProperties.getEndpoint())) {
            throw new BusinessException(ErrorCode.INTERNAL_ERROR, "Public URL config is missing");
        }

        URI endpoint = URI.create(ossProperties.getEndpoint());
        String scheme = StringUtils.hasText(endpoint.getScheme()) ? endpoint.getScheme() : "https";
        String host = endpoint.getHost();
        if (!StringUtils.hasText(host)) {
            throw new BusinessException(ErrorCode.INTERNAL_ERROR, "Invalid OSS endpoint for public URL");
        }
        if (host.startsWith(bucket + ".")) {
            return scheme + "://" + host + "/" + key;
        }
        return scheme + "://" + bucket + "." + host + "/" + key;
    }

    /**
     * 去掉 URL 末尾斜杠，避免拼接出现双斜杠。
     */
    private String trimTrailingSlash(String value) {
        if (value.endsWith("/")) {
            return value.substring(0, value.length() - 1);
        }
        return value;
    }

    /**
     * 读取文件后缀。上传策略阶段要求必须携带后缀，便于对象键命名与审计定位。
     */
    private String getExtension(String fileName) {
        int index = fileName.lastIndexOf('.');
        if (index < 0 || index == fileName.length() - 1) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "File extension is required");
        }
        return fileName.substring(index + 1);
    }
}
