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
import io.github.shizuki.common.storage.model.StorageObjectMetadata;
import io.github.shizuki.common.storage.util.OssKeyBuilder;
import io.github.shizuki.common.storage.util.UploadValidator;
import io.github.shizuki.site.media.integration.UserMusicGateway;
import io.github.shizuki.site.media.integration.SpotifyMusicProvider;
import io.github.shizuki.site.media.config.MediaStorageProperties;
import io.github.shizuki.site.media.dto.AdminAssetUpdateRequest;
import io.github.shizuki.site.media.dto.AdminAssetAuditResponse;
import io.github.shizuki.site.media.dto.AdminMusicPlaylistReplaceRequest;
import io.github.shizuki.site.media.dto.AdminMusicProviderGuideUpsertRequest;
import io.github.shizuki.site.media.dto.AdminMusicProviderVisibilityUpdateRequest;
import io.github.shizuki.site.media.dto.AdminMusicTrackUpsertRequest;
import io.github.shizuki.site.media.dto.AssetCreateRequest;
import io.github.shizuki.site.media.dto.AssetCreateResponse;
import io.github.shizuki.site.media.dto.AssetDownloadResponse;
import io.github.shizuki.site.media.dto.AssetReportResponse;
import io.github.shizuki.site.media.dto.L2dValidationResponse;
import io.github.shizuki.site.media.dto.MusicKeyGuideResponse;
import io.github.shizuki.site.media.dto.MusicPickQuotaResponse;
import io.github.shizuki.site.media.dto.MusicPickRequest;
import io.github.shizuki.site.media.dto.MusicPickResponse;
import io.github.shizuki.site.media.dto.MusicProviderResponse;
import io.github.shizuki.site.media.dto.MusicQuotaResponse;
import io.github.shizuki.site.media.dto.MusicTrackResponse;
import io.github.shizuki.site.media.dto.PublicHomeRoleResponse;
import io.github.shizuki.site.media.dto.SpotifyPreviewResponse;
import io.github.shizuki.site.media.dto.SpotifyTrackResponse;
import io.github.shizuki.site.media.dto.UploadPolicyRequest;
import io.github.shizuki.site.media.dto.UploadPolicyResponse;
import io.github.shizuki.site.media.entity.MediaAssetEntity;
import io.github.shizuki.site.media.entity.MediaAssetGroupAclEntity;
import io.github.shizuki.site.media.entity.MediaAssetReportEntity;
import io.github.shizuki.site.media.entity.MediaL2dPackageEntity;
import io.github.shizuki.site.media.entity.MusicPickUsageEntity;
import io.github.shizuki.site.media.entity.MusicPlaylistEntity;
import io.github.shizuki.site.media.entity.MusicProviderConfigEntity;
import io.github.shizuki.site.media.entity.MusicProviderGuideEntity;
import io.github.shizuki.site.media.entity.MusicTrackCacheEntity;
import io.github.shizuki.site.media.entity.MusicUploadUsageEntity;
import io.github.shizuki.site.media.mapper.MediaAssetGroupAclMapper;
import io.github.shizuki.site.media.mapper.MediaAssetMapper;
import io.github.shizuki.site.media.mapper.MediaAssetReportMapper;
import io.github.shizuki.site.media.mapper.MediaL2dPackageMapper;
import io.github.shizuki.site.media.mapper.MusicPickUsageMapper;
import io.github.shizuki.site.media.mapper.MusicPlaylistMapper;
import io.github.shizuki.site.media.mapper.MusicProviderConfigMapper;
import io.github.shizuki.site.media.mapper.MusicProviderGuideMapper;
import io.github.shizuki.site.media.mapper.MusicTrackCacheMapper;
import io.github.shizuki.site.media.mapper.MusicUploadUsageMapper;
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
import java.net.URL;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.support.TransactionTemplate;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

/**
 * 媒体域核心服务实现，负责上传策略、资产落库、公开角色池与下载链接等主流程。
 */
@Service
public class MediaServiceImpl implements MediaService {
    private static final Logger LOGGER = LoggerFactory.getLogger(MediaServiceImpl.class);

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
    /**
     * 音频白名单（首版按常见格式放行）。
     */
    private static final Set<String> AUDIO_TYPES = Set.of(
        "audio/mpeg", "audio/mp3", "audio/wav", "audio/x-wav", "audio/ogg", "audio/flac", "audio/aac", "audio/mp4"
    );
    private static final String MUSIC_PICK_QUOTA_CODE = "music_song_pick_total";
    private static final String MUSIC_UPLOAD_QUOTA_CODE = "music_upload_bytes_total";
    private static final Set<String> SUPPORTED_MUSIC_PROVIDERS = Set.of("tunehub", "spotify", "asmr");

    private final ObjectStorageClient objectStorageClient;
    private final MediaStorageProperties mediaStorageProperties;
    private final OssProperties ossProperties;
    private final MediaAssetMapper mediaAssetMapper;
    private final MediaAssetGroupAclMapper mediaAssetGroupAclMapper;
    private final MediaAssetReportMapper mediaAssetReportMapper;
    private final MediaL2dPackageMapper mediaL2dPackageMapper;
    private final MusicPlaylistMapper musicPlaylistMapper;
    private final MusicPickUsageMapper musicPickUsageMapper;
    private final MusicProviderConfigMapper musicProviderConfigMapper;
    private final MusicProviderGuideMapper musicProviderGuideMapper;
    private final MusicUploadUsageMapper musicUploadUsageMapper;
    private final MusicTrackCacheMapper musicTrackCacheMapper;
    private final L2dZipValidator l2dZipValidator;
    private final AssetSecurityInspector assetSecurityInspector;
    private final UserMusicGateway userMusicClient;
    private final SpotifyMusicProvider spotifyMusicClient;
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
                            MusicPlaylistMapper musicPlaylistMapper,
                            MusicPickUsageMapper musicPickUsageMapper,
                            MusicProviderConfigMapper musicProviderConfigMapper,
                            MusicProviderGuideMapper musicProviderGuideMapper,
                            MusicUploadUsageMapper musicUploadUsageMapper,
                            MusicTrackCacheMapper musicTrackCacheMapper,
                            L2dZipValidator l2dZipValidator,
                            AssetSecurityInspector assetSecurityInspector,
                            UserMusicGateway userMusicClient,
                            SpotifyMusicProvider spotifyMusicClient,
                            ObjectMapper objectMapper,
                            TransactionTemplate transactionTemplate) {
        this.objectStorageClient = objectStorageClient;
        this.mediaStorageProperties = mediaStorageProperties;
        this.ossProperties = ossProperties;
        this.mediaAssetMapper = mediaAssetMapper;
        this.mediaAssetGroupAclMapper = mediaAssetGroupAclMapper;
        this.mediaAssetReportMapper = mediaAssetReportMapper;
        this.mediaL2dPackageMapper = mediaL2dPackageMapper;
        this.musicPlaylistMapper = musicPlaylistMapper;
        this.musicPickUsageMapper = musicPickUsageMapper;
        this.musicProviderConfigMapper = musicProviderConfigMapper;
        this.musicProviderGuideMapper = musicProviderGuideMapper;
        this.musicUploadUsageMapper = musicUploadUsageMapper;
        this.musicTrackCacheMapper = musicTrackCacheMapper;
        this.l2dZipValidator = l2dZipValidator;
        this.assetSecurityInspector = assetSecurityInspector;
        this.userMusicClient = userMusicClient;
        this.spotifyMusicClient = spotifyMusicClient;
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
        if (assetKind == AssetKindEnum.AUDIO) {
            long total = resolveQuotaValue(MUSIC_UPLOAD_QUOTA_CODE, currentLoginUserGroups(), 104857600L);
            long used = loadUploadUsedBytes(userId);
            if (used >= total) {
                throw new BusinessException(ErrorCode.FORBIDDEN, "Music upload quota exhausted",
                    Map.of("music_error_code", "MUSIC_UPLOAD_QUOTA_EXHAUSTED", "total", total, "used", used, "remaining", 0));
            }
        }

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
        long objectSizeBytes = inspectionResult != null && inspectionResult.objectSizeBytes() != null
            ? Math.max(0L, inspectionResult.objectSizeBytes())
            : 0L;
        if (assetKind == AssetKindEnum.AUDIO) {
            long total = resolveQuotaValue(MUSIC_UPLOAD_QUOTA_CODE, currentLoginUserGroups(), 104857600L);
            long used = loadUploadUsedBytes(userId);
            long next = used + objectSizeBytes;
            if (next > total) {
                throw new BusinessException(ErrorCode.FORBIDDEN, "Music upload quota exhausted",
                    Map.of("music_error_code", "MUSIC_UPLOAD_QUOTA_EXHAUSTED", "total", total, "used", used, "remaining", Math.max(0L, total - used)));
            }
        }

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
            if (assetKind == AssetKindEnum.AUDIO) {
                increaseUploadUsedBytes(userId, objectSizeBytes);
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

        Set<Long> l2dAssetIds = new LinkedHashSet<>();
        for (MediaAssetEntity asset : assets) {
            if (resolveAssetKind(asset) == AssetKindEnum.LIVE2D_PACKAGE) {
                l2dAssetIds.add(asset.getId());
            }
        }

        Map<Long, MediaL2dPackageEntity> l2dMap = new LinkedHashMap<>();
        if (!l2dAssetIds.isEmpty()) {
            List<MediaL2dPackageEntity> l2dList = mediaL2dPackageMapper.selectList(
                new LambdaQueryWrapper<MediaL2dPackageEntity>().in(MediaL2dPackageEntity::getAssetId, l2dAssetIds)
            );
            for (MediaL2dPackageEntity l2d : l2dList) {
                l2dMap.put(l2d.getAssetId(), l2d);
            }
        }

        List<PublicHomeRoleResponse> result = new ArrayList<>();
        for (MediaAssetEntity asset : assets) {
            AssetKindEnum assetKind = resolveAssetKind(asset);
            String publicUrl = buildPublicUrl(asset.getBucketName(), asset.getObjectKey());
            MediaL2dPackageEntity l2d = l2dMap.get(asset.getId());
            result.add(new PublicHomeRoleResponse(
                asset.getId(),
                assetKind.name(),
                publicUrl,
                publicUrl,
                l2d == null ? null : l2d.getEntryModelJson(),
                asset.getHomeSortNum()
            ));
        }
        return result;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<MusicTrackResponse> listDefaultMusicPlaylist() {
        List<MusicPlaylistEntity> entities = musicPlaylistMapper.selectList(
            new LambdaQueryWrapper<MusicPlaylistEntity>()
                .eq(MusicPlaylistEntity::getEnabledFlag, true)
                .orderByAsc(MusicPlaylistEntity::getSortNum)
                .orderByAsc(MusicPlaylistEntity::getId)
        );
        List<MusicTrackResponse> result = new ArrayList<>();
        for (MusicPlaylistEntity entity : entities) {
            result.add(toPlaylistResponse(entity));
        }
        return result;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MusicQuotaResponse myMusicQuota() {
        Long userId = requireLoginUserId();
        Set<String> groups = currentLoginUserGroups();
        long total = resolveQuotaValue(MUSIC_PICK_QUOTA_CODE, groups, 5L);
        long used = loadPickUsedCount(userId);
        long uploadTotal = resolveQuotaValue(MUSIC_UPLOAD_QUOTA_CODE, groups, 104857600L);
        long uploadUsed = loadUploadUsedBytes(userId);
        UserMusicGateway.ApiKeyStatus keyStatus = userMusicClient.getApiKeyStatus(userId, "tunehub");
        return new MusicQuotaResponse(
            MUSIC_PICK_QUOTA_CODE,
            total,
            used,
            Math.max(0L, total - used),
            keyStatus != null && keyStatus.keyBound(),
            uploadTotal,
            uploadUsed,
            Math.max(0L, uploadTotal - uploadUsed)
        );
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MusicPickResponse pickMusic(MusicPickRequest request) {
        Long userId = requireLoginUserId();
        String provider = normalizeProviderCode(readString(request == null ? null : request.getProvider(), "tunehub"));
        String query = readString(request == null ? null : request.getQuery(), "");
        validateMusicQuery(query);

        MusicProviderResponse providerConfig = null;
        List<MusicProviderResponse> providers = listMusicProviders();
        for (MusicProviderResponse item : providers) {
            if (provider.equals(item.provider())) {
                providerConfig = item;
                break;
            }
        }
        if (providerConfig == null) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Unsupported provider");
        }
        boolean enabled = providerConfig.enabled();
        if (!enabled) {
            throw new BusinessException(ErrorCode.FORBIDDEN, "Music provider disabled",
                Map.of("music_error_code", "MUSIC_PROVIDER_DISABLED", "provider", provider));
        }
        if ("asmr".equals(provider) && !currentLoginUserHasPermission("music.asmr.access")) {
            throw new BusinessException(ErrorCode.FORBIDDEN, "Music provider permission denied",
                Map.of("music_error_code", "MUSIC_PROVIDER_PERMISSION_DENIED", "provider", provider));
        }

        List<MusicTrackResponse> playlist = listDefaultMusicPlaylist();
        MusicTrackResponse selected = null;
        for (MusicTrackResponse item : playlist) {
            if (!StringUtils.hasText(query)) {
                selected = item;
                break;
            }
            String title = readString(item.title(), "").toLowerCase(Locale.ROOT);
            if (title.contains(query.toLowerCase(Locale.ROOT))) {
                selected = item;
                break;
            }
        }
        if (selected == null) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "Music track not found",
                Map.of("music_error_code", "MUSIC_TRACK_NOT_FOUND"));
        }
        String trackId = readString(selected.trackId(), "");
        if (StringUtils.hasText(trackId)) {
            MusicTrackCacheEntity cache = loadTrackCache(provider, trackId);
            if (cache != null && objectStorageClient.objectExists(cache.getBucketCode(), cache.getObjectCode())) {
                MusicTrackResponse cachedTrack = new MusicTrackResponse(
                    selected.trackId(),
                    selected.provider(),
                    selected.title(),
                    selected.artist(),
                    selected.cover(),
                    cache.getPublicUrl(),
                    selected.lyric(),
                    selected.sort(),
                    selected.enabled()
                );
                long cachedUsed = loadPickUsedCount(userId);
                long cachedTotal = resolveQuotaValue(MUSIC_PICK_QUOTA_CODE, currentLoginUserGroups(), 5L);
                return new MusicPickResponse(
                    provider,
                    cachedTrack,
                    true,
                    new MusicPickQuotaResponse(cachedTotal, cachedUsed, Math.max(0L, cachedTotal - cachedUsed))
                );
            }
        }

        long total = resolveQuotaValue(MUSIC_PICK_QUOTA_CODE, currentLoginUserGroups(), 5L);
        long used = loadPickUsedCount(userId);
        if (used >= total) {
            UserMusicGateway.ApiKeyStatus keyStatus = userMusicClient.getApiKeyStatus(userId, provider);
            if (keyStatus == null || !keyStatus.keyBound()) {
                throw new BusinessException(ErrorCode.FORBIDDEN, "Music API key required",
                    Map.of("music_error_code", "MUSIC_API_KEY_REQUIRED", "provider", provider, "total", total, "used", used));
            }
            // 首版只校验已绑定。后续可在此调用 provider API 并使用明文 key：
            // String apiKey = userMusicClient.getApiKeyPlaintext(userId, provider);
        } else {
            increasePickUsedCount(userId, 1L);
            used += 1L;
        }

        MusicTrackResponse returnedTrack = selected;
        if (StringUtils.hasText(trackId) && shouldStoreProviderTrackToOss(currentLoginUserGroups())) {
            String sourceAudioUrl = readString(selected.audio(), "");
            if (StringUtils.hasText(sourceAudioUrl)) {
                MusicTrackCacheEntity cached = cacheTrackToOss(provider, trackId, sourceAudioUrl);
                if (cached != null) {
                    returnedTrack = new MusicTrackResponse(
                        selected.trackId(),
                        selected.provider(),
                        selected.title(),
                        selected.artist(),
                        selected.cover(),
                        cached.getPublicUrl(),
                        selected.lyric(),
                        selected.sort(),
                        selected.enabled()
                    );
                }
            }
        }
        return new MusicPickResponse(
            provider,
            returnedTrack,
            false,
            new MusicPickQuotaResponse(total, used, Math.max(0L, total - used))
        );
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<MusicProviderResponse> listMusicProviders() {
        List<MusicProviderConfigEntity> configs = musicProviderConfigMapper.selectList(
            new LambdaQueryWrapper<MusicProviderConfigEntity>()
                .orderByAsc(MusicProviderConfigEntity::getSortNum)
                .orderByAsc(MusicProviderConfigEntity::getId)
        );
        if (configs == null || configs.isEmpty()) {
            return List.of(
                new MusicProviderResponse("tunehub", true, true, 10),
                new MusicProviderResponse("spotify", true, true, 20),
                new MusicProviderResponse("asmr", true, false, 30)
            );
        }
        boolean asmrPermitted = currentLoginUserHasPermission("music.asmr.access");
        List<MusicProviderResponse> result = new ArrayList<>();
        for (MusicProviderConfigEntity item : configs) {
            boolean visible = Boolean.TRUE.equals(item.getVisibleFlag());
            if ("asmr".equalsIgnoreCase(item.getProviderCode()) && !asmrPermitted) {
                visible = false;
            }
            result.add(new MusicProviderResponse(
                item.getProviderCode(),
                Boolean.TRUE.equals(item.getEnabledFlag()),
                visible,
                item.getSortNum() == null ? 0 : item.getSortNum()
            ));
        }
        return result;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MusicKeyGuideResponse getMusicKeyGuide(String provider) {
        String normalized = provider == null ? "" : provider.trim().toLowerCase(Locale.ROOT);
        MusicProviderGuideEntity guide = musicProviderGuideMapper.selectOne(
            new LambdaQueryWrapper<MusicProviderGuideEntity>().eq(MusicProviderGuideEntity::getProviderCode, normalized)
        );
        if (guide == null) {
            return new MusicKeyGuideResponse(
                normalized,
                "API Key 获取引导",
                "请联系管理员补充该 provider 的引导文案。",
                ""
            );
        }
        return new MusicKeyGuideResponse(
            guide.getProviderCode(),
            guide.getGuideTitle() == null ? "" : guide.getGuideTitle(),
            guide.getGuideText() == null ? "" : guide.getGuideText(),
            guide.getGuideLink() == null ? "" : guide.getGuideLink()
        );
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<SpotifyTrackResponse> searchSpotify(String query, Integer limit) {
        int max = limit == null ? 10 : Math.max(1, Math.min(50, limit));
        String normalizedQuery = query == null ? "" : query.trim();
        validateMusicQuery(normalizedQuery);
        Long userId = currentLoginUser() == null ? 0L : currentLoginUser().getUserId();
        String userToken = resolveUserSpotifyToken(userId);
        return spotifyMusicClient.searchTracks(normalizedQuery, max, userToken);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SpotifyPreviewResponse getSpotifyPreview(String trackId) {
        String normalizedTrackId = readString(trackId, "");
        if (!StringUtils.hasText(normalizedTrackId)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "track_id is required");
        }
        Long userId = currentLoginUser() == null ? 0L : currentLoginUser().getUserId();
        String userToken = resolveUserSpotifyToken(userId);
        SpotifyPreviewResponse preview = spotifyMusicClient.getTrackPreview(normalizedTrackId, userToken);
        if (!StringUtils.hasText(preview.previewUrl())) {
            return new SpotifyPreviewResponse(normalizedTrackId, "", "spotify", "MUSIC_SPOTIFY_PREVIEW_NOT_AVAILABLE");
        }
        return preview;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<MusicTrackResponse> listAdminDefaultPlaylist() {
        List<MusicPlaylistEntity> entities = musicPlaylistMapper.selectList(
            new LambdaQueryWrapper<MusicPlaylistEntity>()
                .orderByAsc(MusicPlaylistEntity::getSortNum)
                .orderByAsc(MusicPlaylistEntity::getId)
        );
        List<MusicTrackResponse> result = new ArrayList<>();
        for (MusicPlaylistEntity entity : entities) {
            result.add(toPlaylistResponse(entity));
        }
        return result;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public List<MusicTrackResponse> replaceAdminDefaultPlaylist(AdminMusicPlaylistReplaceRequest request) {
        List<MusicPlaylistEntity> existing = musicPlaylistMapper.selectList(new LambdaQueryWrapper<>());
        for (MusicPlaylistEntity item : existing) {
            musicPlaylistMapper.deleteById(item.getId());
        }
        if (request == null || request.getTracks() == null) {
            return List.of();
        }
        int fallbackSort = 1;
        for (AdminMusicTrackUpsertRequest track : request.getTracks()) {
            int currentSort = track.getSort() == null ? fallbackSort++ : Math.max(0, track.getSort());
            MusicPlaylistEntity entity = new MusicPlaylistEntity();
            entity.setTrackId(readString(track.getTrackId(), "track-" + currentSort));
            entity.setProviderCode(readString(track.getProvider(), "local"));
            entity.setTitle(readString(track.getTitle(), "Unknown"));
            entity.setArtist(readString(track.getArtist(), "未知歌手"));
            entity.setCoverUrl(readString(track.getCover(), ""));
            entity.setAudioUrl(readString(track.getAudio(), ""));
            entity.setLyricUrl(readString(track.getLyric(), ""));
            validateHttpUrlIfPresent(entity.getCoverUrl(), "cover");
            validateHttpUrlIfPresent(entity.getAudioUrl(), "audio");
            validateHttpUrlIfPresent(entity.getLyricUrl(), "lyric");
            entity.setSortNum(currentSort);
            entity.setEnabledFlag(track.getEnabled() == null ? true : track.getEnabled());
            entity.setMetadataJson(writeJson(track.getMetadata() == null ? Map.of() : track.getMetadata()));
            entity.setCreatedAt(LocalDateTime.now());
            entity.setUpdatedAt(LocalDateTime.now());
            musicPlaylistMapper.insert(entity);
        }
        return listAdminDefaultPlaylist();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<MusicProviderResponse> listAdminProviders() {
        List<MusicProviderConfigEntity> entities = musicProviderConfigMapper.selectList(
            new LambdaQueryWrapper<MusicProviderConfigEntity>()
                .orderByAsc(MusicProviderConfigEntity::getSortNum)
                .orderByAsc(MusicProviderConfigEntity::getId)
        );
        List<MusicProviderResponse> result = new ArrayList<>();
        for (MusicProviderConfigEntity item : entities) {
            result.add(new MusicProviderResponse(
                item.getProviderCode(),
                Boolean.TRUE.equals(item.getEnabledFlag()),
                Boolean.TRUE.equals(item.getVisibleFlag()),
                item.getSortNum() == null ? 0 : item.getSortNum()
            ));
        }
        return result;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MusicProviderResponse updateAdminProviderVisibility(String provider, AdminMusicProviderVisibilityUpdateRequest request) {
        String normalized = provider == null ? "" : provider.trim().toLowerCase(Locale.ROOT);
        MusicProviderConfigEntity entity = musicProviderConfigMapper.selectOne(
            new LambdaQueryWrapper<MusicProviderConfigEntity>().eq(MusicProviderConfigEntity::getProviderCode, normalized)
        );
        if (entity == null) {
            entity = new MusicProviderConfigEntity();
            entity.setProviderCode(normalized);
            entity.setCreatedAt(LocalDateTime.now());
            entity.setSortNum(999);
            entity.setEnabledFlag(true);
            entity.setVisibleFlag(true);
            musicProviderConfigMapper.insert(entity);
        }
        if (request != null && request.getEnabled() != null) {
            entity.setEnabledFlag(request.getEnabled());
        }
        if (request != null && request.getVisible() != null) {
            entity.setVisibleFlag(request.getVisible());
        }
        if (request != null && request.getSort() != null) {
            entity.setSortNum(Math.max(0, request.getSort()));
        }
        entity.setUpdatedAt(LocalDateTime.now());
        musicProviderConfigMapper.updateById(entity);
        return new MusicProviderResponse(
            entity.getProviderCode(),
            Boolean.TRUE.equals(entity.getEnabledFlag()),
            Boolean.TRUE.equals(entity.getVisibleFlag()),
            entity.getSortNum() == null ? 0 : entity.getSortNum()
        );
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<MusicKeyGuideResponse> listAdminProviderGuides() {
        List<MusicProviderGuideEntity> entities = musicProviderGuideMapper.selectList(new LambdaQueryWrapper<>());
        List<MusicKeyGuideResponse> result = new ArrayList<>();
        for (MusicProviderGuideEntity item : entities) {
            result.add(new MusicKeyGuideResponse(
                item.getProviderCode(),
                item.getGuideTitle() == null ? "" : item.getGuideTitle(),
                item.getGuideText() == null ? "" : item.getGuideText(),
                item.getGuideLink() == null ? "" : item.getGuideLink()
            ));
        }
        return result;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MusicKeyGuideResponse upsertAdminProviderGuide(String provider, AdminMusicProviderGuideUpsertRequest request) {
        String normalized = provider == null ? "" : provider.trim().toLowerCase(Locale.ROOT);
        MusicProviderGuideEntity entity = musicProviderGuideMapper.selectOne(
            new LambdaQueryWrapper<MusicProviderGuideEntity>().eq(MusicProviderGuideEntity::getProviderCode, normalized)
        );
        if (entity == null) {
            entity = new MusicProviderGuideEntity();
            entity.setProviderCode(normalized);
            entity.setCreatedAt(LocalDateTime.now());
            musicProviderGuideMapper.insert(entity);
        }
        String nextTitle = request == null ? null : request.getTitle();
        String nextContent = request == null ? null : request.getContent();
        String nextLink = request == null ? null : request.getLink();
        entity.setGuideTitle(readString(nextTitle, entity.getGuideTitle()));
        entity.setGuideText(readString(nextContent, entity.getGuideText()));
        entity.setGuideLink(readString(nextLink, entity.getGuideLink()));
        entity.setUpdatedAt(LocalDateTime.now());
        musicProviderGuideMapper.updateById(entity);
        return new MusicKeyGuideResponse(
            entity.getProviderCode(),
            entity.getGuideTitle() == null ? "" : entity.getGuideTitle(),
            entity.getGuideText() == null ? "" : entity.getGuideText(),
            entity.getGuideLink() == null ? "" : entity.getGuideLink()
        );
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

    /**
     * 获取当前登录用户，不存在或 userId<=0 统一视为未登录。
     */
    private LoginUser currentLoginUser() {
        LoginUser loginUser = LoginUserContext.get().orElse(null);
        if (loginUser == null || loginUser.getUserId() == null || loginUser.getUserId() <= 0) {
            return null;
        }
        return loginUser;
    }

    /**
     * 校验登录用户对受限资源（PRIVATE/GROUP）的访问权限。
     */
    private boolean canAccessRestrictedAsset(MediaAssetEntity asset,
                                             LoginUser loginUser,
                                             AssetVisibilityEnum visibility,
                                             Set<String> allowedGroups) {
        boolean owner = loginUser.getUserId().equals(asset.getUserId());
        boolean admin = false;
        Set<String> groups = loginUser.getGroups();
        if (groups != null) {
            for (String group : groups) {
                if ("ADMIN".equalsIgnoreCase(group)) {
                    admin = true;
                    break;
                }
            }
        }
        if (owner || admin) {
            return true;
        }
        if (visibility != AssetVisibilityEnum.GROUP || allowedGroups == null || allowedGroups.isEmpty()) {
            return false;
        }
        Set<String> userGroups = normalizeGroupCodes(loginUser.getGroups());
        for (String group : userGroups) {
            if (allowedGroups.contains(group)) {
                return true;
            }
        }
        return false;
    }

    /**
     * 查询资源 ACL 分组。
     */
    private Set<String> loadAssetAclGroups(Long assetId) {
        List<MediaAssetGroupAclEntity> rows = mediaAssetGroupAclMapper.selectList(
            new LambdaQueryWrapper<MediaAssetGroupAclEntity>()
                .eq(MediaAssetGroupAclEntity::getAssetId, assetId)
                .orderByAsc(MediaAssetGroupAclEntity::getGroupCode)
        );
        Set<String> groups = new LinkedHashSet<>();
        for (MediaAssetGroupAclEntity row : rows) {
            groups.add(row.getGroupCode());
        }
        return groups;
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
        for (MediaAssetGroupAclEntity entity : existing) {
            mediaAssetGroupAclMapper.deleteById(entity.getId());
        }
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
        Set<String> normalized = new LinkedHashSet<>();
        for (String value : groups) {
            if (!StringUtils.hasText(value)) {
                continue;
            }
            normalized.add(value.trim().toUpperCase(Locale.ROOT));
        }
        return normalized.isEmpty() ? Set.of() : normalized;
    }

    private Set<String> currentLoginUserGroups() {
        return LoginUserContext.get().map(LoginUser::getGroups).orElse(Set.of());
    }

    private boolean currentLoginUserHasPermission(String permission) {
        return LoginUserContext.get().map(user -> user.hasPermission(permission)).orElse(false);
    }

    private long resolveQuotaValue(String quotaCode, Set<String> groups, long fallback) {
        Long resolved = userMusicClient.resolveQuota(quotaCode, groups, fallback);
        return resolved == null ? fallback : resolved;
    }

    private long loadPickUsedCount(Long userId) {
        MusicPickUsageEntity usage = musicPickUsageMapper.selectOne(
            new LambdaQueryWrapper<MusicPickUsageEntity>()
                .eq(MusicPickUsageEntity::getUserId, userId)
                .eq(MusicPickUsageEntity::getQuotaCode, MUSIC_PICK_QUOTA_CODE)
        );
        return usage == null || usage.getUsedCount() == null ? 0L : Math.max(0L, usage.getUsedCount());
    }

    private void increasePickUsedCount(Long userId, long delta) {
        if (delta <= 0) {
            return;
        }
        int affected = musicPickUsageMapper.increaseUsedCount(userId, MUSIC_PICK_QUOTA_CODE, delta);
        if (affected > 0) {
            return;
        }
        MusicPickUsageEntity usage = musicPickUsageMapper.selectOne(
            new LambdaQueryWrapper<MusicPickUsageEntity>()
                .eq(MusicPickUsageEntity::getUserId, userId)
                .eq(MusicPickUsageEntity::getQuotaCode, MUSIC_PICK_QUOTA_CODE)
        );
        if (usage == null) {
            usage = new MusicPickUsageEntity();
            usage.setUserId(userId);
            usage.setQuotaCode(MUSIC_PICK_QUOTA_CODE);
            usage.setUsedCount(Math.max(0L, delta));
            LocalDateTime now = LocalDateTime.now();
            usage.setCreatedAt(now);
            usage.setUpdatedAt(now);
            try {
                musicPickUsageMapper.insert(usage);
            } catch (DuplicateKeyException exception) {
                // 并发插入竞争时回退到原子增量，避免覆盖写。
                musicPickUsageMapper.increaseUsedCount(userId, MUSIC_PICK_QUOTA_CODE, delta);
            }
            return;
        }
        musicPickUsageMapper.increaseUsedCount(userId, MUSIC_PICK_QUOTA_CODE, delta);
    }

    private long loadUploadUsedBytes(Long userId) {
        MusicUploadUsageEntity usage = musicUploadUsageMapper.selectOne(
            new LambdaQueryWrapper<MusicUploadUsageEntity>().eq(MusicUploadUsageEntity::getUserId, userId)
        );
        return usage == null || usage.getUsedBytes() == null ? 0L : Math.max(0L, usage.getUsedBytes());
    }

    private void increaseUploadUsedBytes(Long userId, long delta) {
        if (delta <= 0) {
            return;
        }
        int affected = musicUploadUsageMapper.increaseUsedBytes(userId, delta);
        if (affected > 0) {
            return;
        }
        MusicUploadUsageEntity usage = musicUploadUsageMapper.selectOne(
            new LambdaQueryWrapper<MusicUploadUsageEntity>().eq(MusicUploadUsageEntity::getUserId, userId)
        );
        if (usage == null) {
            usage = new MusicUploadUsageEntity();
            usage.setUserId(userId);
            usage.setUsedBytes(delta);
            LocalDateTime now = LocalDateTime.now();
            usage.setCreatedAt(now);
            usage.setUpdatedAt(now);
            try {
                musicUploadUsageMapper.insert(usage);
            } catch (DuplicateKeyException exception) {
                // 并发插入竞争时回退到原子增量，避免覆盖写。
                musicUploadUsageMapper.increaseUsedBytes(userId, delta);
            }
            return;
        }
        musicUploadUsageMapper.increaseUsedBytes(userId, delta);
    }

    private MusicTrackCacheEntity loadTrackCache(String provider, String trackId) {
        return musicTrackCacheMapper.selectOne(
            new LambdaQueryWrapper<MusicTrackCacheEntity>()
                .eq(MusicTrackCacheEntity::getProviderCode, provider)
                .eq(MusicTrackCacheEntity::getTrackId, trackId)
        );
    }

    private boolean shouldStoreProviderTrackToOss(Set<String> groups) {
        Set<String> normalized = normalizeGroupCodes(groups);
        return normalized.contains("FRIEND") || normalized.contains("INTERVIEWER") || normalized.contains("ADMIN");
    }

    /**
     * 将第三方歌曲缓存到 OSS。
     *
     * <p>缓存失败不抛错，返回 null 让主流程继续，避免因缓存影响选歌主链路可用性。
     */
    private MusicTrackCacheEntity cacheTrackToOss(String provider, String trackId, String sourceAudioUrl) {
        validateHttpUrlIfPresent(sourceAudioUrl, "audio");
        MusicTrackCacheEntity existing = loadTrackCache(provider, trackId);
        if (existing != null && objectStorageClient.objectExists(existing.getBucketCode(), existing.getObjectCode())) {
            return existing;
        }
        try (InputStream in = new URL(sourceAudioUrl).openStream()) {
            String bucket = mediaStorageProperties.getPublicBucket();
            String extension = inferAudioExtension(sourceAudioUrl);
            String key = OssKeyBuilder.build("music-cache", provider, 0L, extension);
            StorageObjectMetadata metadata = new StorageObjectMetadata();
            metadata.setContentType(inferAudioContentType(extension));
            objectStorageClient.putObject(bucket, key, in, metadata);
            String publicUrl = buildPublicUrl(bucket, key);

            MusicTrackCacheEntity entity = existing == null ? new MusicTrackCacheEntity() : existing;
            entity.setProviderCode(provider);
            entity.setTrackId(trackId);
            entity.setBucketCode(bucket);
            entity.setObjectCode(key);
            entity.setPublicUrl(publicUrl);
            entity.setSourceUrl(sourceAudioUrl);
            entity.setUpdatedAt(LocalDateTime.now());
            if (existing == null) {
                entity.setCreatedAt(LocalDateTime.now());
                musicTrackCacheMapper.insert(entity);
            } else {
                musicTrackCacheMapper.updateById(entity);
            }
            return entity;
        } catch (Exception ex) {
            LOGGER.warn("Cache provider track to OSS failed, provider={}, trackId={}", provider, trackId, ex);
            return null;
        }
    }

    private String resolveUserSpotifyToken(Long userId) {
        if (userId == null || userId <= 0) {
            return "";
        }
        return userMusicClient.getApiKeyPlaintext(userId, "spotify");
    }

    private String normalizeProviderCode(String provider) {
        String normalized = readString(provider, "").toLowerCase(Locale.ROOT);
        if (!StringUtils.hasText(normalized) || !SUPPORTED_MUSIC_PROVIDERS.contains(normalized)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Unsupported provider");
        }
        return normalized;
    }

    private void validateMusicQuery(String query) {
        if (query == null) {
            return;
        }
        if (query.length() > 128) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "query is too long");
        }
    }

    private void validateHttpUrlIfPresent(String url, String field) {
        if (!StringUtils.hasText(url)) {
            return;
        }
        String normalized = url.trim().toLowerCase(Locale.ROOT);
        if (!normalized.startsWith("http://") && !normalized.startsWith("https://")) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, field + " url must start with http:// or https://");
        }
    }

    /**
     * 从音频 URL 推断扩展名，无法识别时默认 mp3。
     */
    private String inferAudioExtension(String sourceAudioUrl) {
        if (!StringUtils.hasText(sourceAudioUrl)) {
            return "mp3";
        }
        String cleaned = sourceAudioUrl.split("\\?")[0];
        int dot = cleaned.lastIndexOf('.');
        if (dot < 0 || dot == cleaned.length() - 1) {
            return "mp3";
        }
        String ext = cleaned.substring(dot + 1).toLowerCase(Locale.ROOT);
        return switch (ext) {
            case "mp3", "wav", "ogg", "flac", "aac", "m4a" -> ext;
            default -> "mp3";
        };
    }

    /**
     * 根据扩展名推断 MIME 类型，默认使用 audio/mpeg。
     */
    private String inferAudioContentType(String extension) {
        return switch (extension) {
            case "wav" -> "audio/wav";
            case "ogg" -> "audio/ogg";
            case "flac" -> "audio/flac";
            case "aac" -> "audio/aac";
            case "m4a" -> "audio/mp4";
            default -> "audio/mpeg";
        };
    }

    /**
     * 数据库歌单实体转前台响应 DTO。
     */
    private MusicTrackResponse toPlaylistResponse(MusicPlaylistEntity entity) {
        return new MusicTrackResponse(
            entity.getTrackId(),
            entity.getProviderCode(),
            entity.getTitle(),
            entity.getArtist(),
            entity.getCoverUrl(),
            entity.getAudioUrl(),
            entity.getLyricUrl(),
            entity.getSortNum() == null ? 0 : entity.getSortNum(),
            Boolean.TRUE.equals(entity.getEnabledFlag())
        );
    }

    /**
     * 读取字符串值；空白值返回兜底值。
     */
    private String readString(String value, String fallback) {
        if (!StringUtils.hasText(value)) {
            return fallback;
        }
        return value.trim();
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
            case AUDIO -> AUDIO_TYPES.contains(normalized);
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
