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
import io.github.shizuki.site.media.config.MusicListenCacheProperties;
import io.github.shizuki.site.media.integration.UserMusicGateway;
import io.github.shizuki.site.media.integration.SpotifyMusicProvider;
import io.github.shizuki.site.media.integration.TuneHubMusicProvider;
import io.github.shizuki.site.media.config.MediaStorageProperties;
import io.github.shizuki.site.media.config.TuneHubMusicProperties;
import io.github.shizuki.site.media.dto.AdminAssetUpdateRequest;
import io.github.shizuki.site.media.dto.AdminAssetAuditResponse;
import io.github.shizuki.site.media.dto.AdminMusicDefaultPlaylistBundleReplaceRequest;
import io.github.shizuki.site.media.dto.AdminMusicPlaylistReplaceRequest;
import io.github.shizuki.site.media.dto.AdminMusicPlaylistProfileUpsertRequest;
import io.github.shizuki.site.media.dto.AdminMusicProviderGuideUpsertRequest;
import io.github.shizuki.site.media.dto.AdminMusicProviderVisibilityUpdateRequest;
import io.github.shizuki.site.media.dto.AdminMusicTrackUpsertRequest;
import io.github.shizuki.site.media.dto.AssetCreateRequest;
import io.github.shizuki.site.media.dto.AssetCreateResponse;
import io.github.shizuki.site.media.dto.AssetDownloadResponse;
import io.github.shizuki.site.media.dto.AssetReportResponse;
import io.github.shizuki.site.media.dto.L2dValidationResponse;
import io.github.shizuki.site.media.dto.MusicKeyGuideResponse;
import io.github.shizuki.site.media.dto.MeMusicLibrarySidebarResponse;
import io.github.shizuki.site.media.dto.MeMusicPlaylistCreateRequest;
import io.github.shizuki.site.media.dto.MeMusicPlaylistTrackUpsertRequest;
import io.github.shizuki.site.media.dto.MeMusicPlaylistUpdateRequest;
import io.github.shizuki.site.media.dto.MusicPickQuotaResponse;
import io.github.shizuki.site.media.dto.MusicPickRequest;
import io.github.shizuki.site.media.dto.MusicPickResponse;
import io.github.shizuki.site.media.dto.MusicProviderResponse;
import io.github.shizuki.site.media.dto.MusicQuotaResponse;
import io.github.shizuki.site.media.dto.MusicResolvePlaybackRequest;
import io.github.shizuki.site.media.dto.MusicSearchArtistResponse;
import io.github.shizuki.site.media.dto.MusicSearchResponse;
import io.github.shizuki.site.media.dto.MusicSearchTrackResponse;
import io.github.shizuki.site.media.dto.MusicTrackResponse;
import io.github.shizuki.site.media.dto.MusicDefaultPlaylistBundleResponse;
import io.github.shizuki.site.media.dto.MusicLibraryHomeResponse;
import io.github.shizuki.site.media.dto.MusicPlaylistBundleResponse;
import io.github.shizuki.site.media.dto.MusicPlaylistSummaryResponse;
import io.github.shizuki.site.media.dto.MusicPlaylistProfileResponse;
import io.github.shizuki.site.media.dto.PublicHomeRoleResponse;
import io.github.shizuki.site.media.dto.SpotifyPreviewResponse;
import io.github.shizuki.site.media.dto.SpotifyTrackResponse;
import io.github.shizuki.site.media.dto.UploadPolicyRequest;
import io.github.shizuki.site.media.dto.UploadPolicyResponse;
import io.github.shizuki.site.media.dto.UploadRelayResponse;
import io.github.shizuki.site.media.entity.MediaAssetEntity;
import io.github.shizuki.site.media.entity.MediaAssetGroupAclEntity;
import io.github.shizuki.site.media.entity.MediaAssetReportEntity;
import io.github.shizuki.site.media.entity.MediaL2dPackageEntity;
import io.github.shizuki.site.media.entity.MusicPickUsageEntity;
import io.github.shizuki.site.media.entity.MusicPlaylistEntity;
import io.github.shizuki.site.media.entity.MusicPlaylistProfileEntity;
import io.github.shizuki.site.media.entity.MusicProviderConfigEntity;
import io.github.shizuki.site.media.entity.MusicProviderGuideEntity;
import io.github.shizuki.site.media.entity.MusicTrackCacheEntity;
import io.github.shizuki.site.media.entity.MusicUploadUsageEntity;
import io.github.shizuki.site.media.entity.UserMusicPlaylistCollectEntity;
import io.github.shizuki.site.media.entity.UserMusicPlaylistEntity;
import io.github.shizuki.site.media.entity.UserMusicPlaylistTrackEntity;
import io.github.shizuki.site.media.mapper.MediaAssetGroupAclMapper;
import io.github.shizuki.site.media.mapper.MediaAssetMapper;
import io.github.shizuki.site.media.mapper.MediaAssetReportMapper;
import io.github.shizuki.site.media.mapper.MediaL2dPackageMapper;
import io.github.shizuki.site.media.mapper.MusicPickUsageMapper;
import io.github.shizuki.site.media.mapper.MusicPlaylistMapper;
import io.github.shizuki.site.media.mapper.MusicPlaylistProfileMapper;
import io.github.shizuki.site.media.mapper.MusicProviderConfigMapper;
import io.github.shizuki.site.media.mapper.MusicProviderGuideMapper;
import io.github.shizuki.site.media.mapper.MusicTrackCacheMapper;
import io.github.shizuki.site.media.mapper.MusicUploadUsageMapper;
import io.github.shizuki.site.media.mapper.UserMusicPlaylistCollectMapper;
import io.github.shizuki.site.media.mapper.UserMusicPlaylistMapper;
import io.github.shizuki.site.media.mapper.UserMusicPlaylistTrackMapper;
import io.github.shizuki.site.media.mq.MusicTrackCacheUploadPublisher;
import io.github.shizuki.site.media.model.AssetAuditStatusEnum;
import io.github.shizuki.site.media.model.AssetKindEnum;
import io.github.shizuki.site.media.model.AssetVisibilityEnum;
import io.github.shizuki.site.media.model.L2dValidationEnum;
import io.github.shizuki.site.media.service.MediaService;
import io.github.shizuki.site.media.service.l2d.L2dValidationResult;
import io.github.shizuki.site.media.service.l2d.L2dZipValidator;
import io.github.shizuki.site.media.service.security.AssetInspectionResult;
import io.github.shizuki.site.media.service.security.AssetSecurityInspector;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.LocalDateTime;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Comparator;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.support.TransactionTemplate;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

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
    private static final String DEFAULT_PLAYLIST_CODE = "default_public";
    private static final String PLAYLIST_TYPE_DEFAULT = "DEFAULT";
    private static final String PLAYLIST_TYPE_LIKED = "LIKED";
    private static final String PLAYLIST_TYPE_CUSTOM = "CUSTOM";
    private static final Set<String> TUNEHUB_PLAYLIST_PLATFORMS = Set.of("netease", "kuwo", "qq");
    private static final Set<String> SUPPORTED_MUSIC_PROVIDERS = Set.of("tunehub", "spotify", "asmr");
    private static final Pattern VIRTUAL_TUNEHUB_PLAYLIST_CODE_PATTERN =
        Pattern.compile("^vh_tunehub_([a-z0-9_\\-]+)_([a-z0-9_\\-]+)_(.+)$");
    private static final String LOG_EVENT_BUILD_START = "MUSIC_TUNEHUB_DEFAULT_PLAYLIST_BUILD_START";
    private static final String LOG_EVENT_SEARCH_START = "MUSIC_SEARCH_START";
    private static final String LOG_EVENT_SEARCH_PROVIDER_FAIL = "MUSIC_SEARCH_PROVIDER_FAIL";
    private static final String LOG_EVENT_SEARCH_PROVIDER_RESULT = "MUSIC_SEARCH_PROVIDER_RESULT";
    private static final String LOG_EVENT_SEARCH_DONE = "MUSIC_SEARCH_DONE";
    private static final String LOG_EVENT_SEARCH_STAGE_START = "MUSIC_SEARCH_STAGE_START";
    private static final String LOG_EVENT_SEARCH_STAGE_PROVIDER_FETCH_DONE = "MUSIC_SEARCH_STAGE_PROVIDER_FETCH_DONE";
    private static final String LOG_EVENT_SEARCH_STAGE_PLAYLIST_MATCH_DONE = "MUSIC_SEARCH_STAGE_PLAYLIST_MATCH_DONE";
    private static final String LOG_EVENT_SEARCH_STAGE_DONE = "MUSIC_SEARCH_STAGE_DONE";
    private static final String LOG_EVENT_RESOLVE_STAGE_START = "MUSIC_RESOLVE_PLAYBACK_STAGE_START";
    private static final String LOG_EVENT_RESOLVE_STAGE_DONE = "MUSIC_RESOLVE_PLAYBACK_STAGE_DONE";

    private final ObjectStorageClient objectStorageClient;
    private final MediaStorageProperties mediaStorageProperties;
    private final OssProperties ossProperties;
    private final MediaAssetMapper mediaAssetMapper;
    private final MediaAssetGroupAclMapper mediaAssetGroupAclMapper;
    private final MediaAssetReportMapper mediaAssetReportMapper;
    private final MediaL2dPackageMapper mediaL2dPackageMapper;
    private final MusicPlaylistMapper musicPlaylistMapper;
    private final MusicPlaylistProfileMapper musicPlaylistProfileMapper;
    private final MusicPickUsageMapper musicPickUsageMapper;
    private final MusicProviderConfigMapper musicProviderConfigMapper;
    private final MusicProviderGuideMapper musicProviderGuideMapper;
    private final MusicUploadUsageMapper musicUploadUsageMapper;
    private final MusicTrackCacheMapper musicTrackCacheMapper;
    private final UserMusicPlaylistMapper userMusicPlaylistMapper;
    private final UserMusicPlaylistTrackMapper userMusicPlaylistTrackMapper;
    private final UserMusicPlaylistCollectMapper userMusicPlaylistCollectMapper;
    private final L2dZipValidator l2dZipValidator;
    private final AssetSecurityInspector assetSecurityInspector;
    private final UserMusicGateway userMusicClient;
    private final SpotifyMusicProvider spotifyMusicClient;
    private final TuneHubMusicProvider tuneHubMusicProvider;
    private final MusicTrackCacheUploadPublisher musicTrackCacheUploadPublisher;
    private final TuneHubMusicProperties tuneHubMusicProperties;
    private final MusicListenCacheProperties musicListenCacheProperties;
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
                            MusicPlaylistProfileMapper musicPlaylistProfileMapper,
                            MusicPickUsageMapper musicPickUsageMapper,
                            MusicProviderConfigMapper musicProviderConfigMapper,
                            MusicProviderGuideMapper musicProviderGuideMapper,
                            MusicUploadUsageMapper musicUploadUsageMapper,
                            MusicTrackCacheMapper musicTrackCacheMapper,
                            UserMusicPlaylistMapper userMusicPlaylistMapper,
                            UserMusicPlaylistTrackMapper userMusicPlaylistTrackMapper,
                            UserMusicPlaylistCollectMapper userMusicPlaylistCollectMapper,
                            L2dZipValidator l2dZipValidator,
                            AssetSecurityInspector assetSecurityInspector,
                            UserMusicGateway userMusicClient,
                            SpotifyMusicProvider spotifyMusicClient,
                            TuneHubMusicProvider tuneHubMusicProvider,
                            MusicTrackCacheUploadPublisher musicTrackCacheUploadPublisher,
                            TuneHubMusicProperties tuneHubMusicProperties,
                            MusicListenCacheProperties musicListenCacheProperties,
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
        this.musicPlaylistProfileMapper = musicPlaylistProfileMapper;
        this.musicPickUsageMapper = musicPickUsageMapper;
        this.musicProviderConfigMapper = musicProviderConfigMapper;
        this.musicProviderGuideMapper = musicProviderGuideMapper;
        this.musicUploadUsageMapper = musicUploadUsageMapper;
        this.musicTrackCacheMapper = musicTrackCacheMapper;
        this.userMusicPlaylistMapper = userMusicPlaylistMapper;
        this.userMusicPlaylistTrackMapper = userMusicPlaylistTrackMapper;
        this.userMusicPlaylistCollectMapper = userMusicPlaylistCollectMapper;
        this.l2dZipValidator = l2dZipValidator;
        this.assetSecurityInspector = assetSecurityInspector;
        this.userMusicClient = userMusicClient;
        this.spotifyMusicClient = spotifyMusicClient;
        this.tuneHubMusicProvider = tuneHubMusicProvider;
        this.musicTrackCacheUploadPublisher = musicTrackCacheUploadPublisher;
        this.tuneHubMusicProperties = tuneHubMusicProperties;
        this.musicListenCacheProperties = musicListenCacheProperties;
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
     * 服务端中转上传：校验文件后直接写入 OSS，返回对象定位信息。
     */
    @Override
    public UploadRelayResponse uploadRelay(MultipartFile file, String assetKindRaw, String visibilityRaw) {
        Long userId = requireLoginUserId();
        if (file == null || file.isEmpty()) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Upload file is required");
        }

        AssetKindEnum assetKind = AssetKindEnum.fromName(assetKindRaw);
        AssetVisibilityEnum visibility = AssetVisibilityEnum.fromName(visibilityRaw, AssetVisibilityEnum.PRIVATE);
        String contentType = readString(file.getContentType(), "");
        validateContentTypeByKind(assetKind, contentType);
        if (assetKind == AssetKindEnum.AUDIO) {
            long total = resolveQuotaValue(MUSIC_UPLOAD_QUOTA_CODE, currentLoginUserGroups(), 104857600L);
            long used = loadUploadUsedBytes(userId);
            if (used >= total) {
                throw new BusinessException(ErrorCode.FORBIDDEN, "Music upload quota exhausted",
                    Map.of("music_error_code", "MUSIC_UPLOAD_QUOTA_EXHAUSTED", "total", total, "used", used, "remaining", 0));
            }
            long next = used + Math.max(0L, file.getSize());
            if (next > total) {
                throw new BusinessException(ErrorCode.FORBIDDEN, "Music upload quota exhausted",
                    Map.of("music_error_code", "MUSIC_UPLOAD_QUOTA_EXHAUSTED", "total", total, "used", used, "remaining", Math.max(0L, total - used)));
            }
        }

        String fileName = resolveRelayFileName(file, assetKind, contentType);
        UploadValidator.validate(
            fileName,
            contentType,
            Math.max(1L, file.getSize()),
            mediaStorageProperties.getMaxUploadSize(),
            mediaStorageProperties.getAllowedContentTypes()
        );

        String extension = getExtension(fileName);
        String bucket = bucketByVisibility(visibility);
        String key = OssKeyBuilder.build("assets", "user-" + userId, userId, extension);
        try (InputStream inputStream = file.getInputStream()) {
            StorageObjectMetadata metadata = new StorageObjectMetadata();
            metadata.setContentType(contentType);
            metadata.setContentLength(Math.max(0L, file.getSize()));
            objectStorageClient.putObject(bucket, key, inputStream, metadata);
            if (assetKind == AssetKindEnum.AUDIO) {
                increaseUploadUsedBytes(userId, Math.max(0L, file.getSize()));
            }
            return new UploadRelayResponse(
                bucket,
                key,
                contentType,
                assetKind.name(),
                "RELAY_OSS"
            );
        } catch (IOException exception) {
            throw new BusinessException(ErrorCode.INTERNAL_ERROR, "Relay upload failed");
        }
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
        return listDefaultMusicPlaylistFromDb();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MusicDefaultPlaylistBundleResponse getDefaultPlaylistBundle() {
        List<MusicTrackResponse> tracks = listDefaultMusicPlaylistFromDb();
        return new MusicDefaultPlaylistBundleResponse(
            loadDefaultPlaylistProfile(),
            tracks
        );
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MusicLibraryHomeResponse getMusicLibraryHome() {
        List<MusicPlaylistSummaryResponse> featuredPlaylists = new ArrayList<>();
        List<MusicTrackResponse> featuredTracks = new ArrayList<>();

        TuneHubApiContext apiContext = resolveTuneHubApiContext();
        if (StringUtils.hasText(apiContext.apiKey())) {
            try {
                List<TuneHubMusicProvider.VirtualPlaylistSummary> virtualPlaylists = tuneHubMusicProvider.listToplistPlaylists(
                    apiContext.apiKey(),
                    apiContext.platformOrder(),
                    2
                );
                for (TuneHubMusicProvider.VirtualPlaylistSummary item : virtualPlaylists) {
                    featuredPlaylists.add(new MusicPlaylistSummaryResponse(
                        item.playlistCode(),
                        readString(item.name(), "TuneHub 推荐歌单"),
                        readString(item.description(), ""),
                        readString(item.cover(), ""),
                        PLAYLIST_TYPE_CUSTOM,
                        0L,
                        true,
                        0,
                        normalizeSourceProvider(item.platform())
                    ));
                }
                if (!virtualPlaylists.isEmpty()) {
                    TuneHubMusicProvider.VirtualPlaylistSummary first = virtualPlaylists.get(0);
                    featuredTracks = tuneHubMusicProvider.loadVirtualPlaylistTracks(
                        apiContext.apiKey(),
                        first.platform(),
                        first.sourceType(),
                        first.sourceId()
                    );
                }
            } catch (Exception ex) {
                LOGGER.warn("MUSIC_TUNEHUB_HOME_LOAD_FAIL reason={}", readString(ex.getMessage(), "unknown_error"));
            }
        }

        List<UserMusicPlaylistEntity> publicPlaylists = userMusicPlaylistMapper.selectList(
            new LambdaQueryWrapper<UserMusicPlaylistEntity>()
                .eq(UserMusicPlaylistEntity::getPublicFlag, true)
                .orderByAsc(UserMusicPlaylistEntity::getSortNum)
                .orderByDesc(UserMusicPlaylistEntity::getId)
                .last("LIMIT 32")
        );
        for (UserMusicPlaylistEntity item : publicPlaylists) {
            if (PLAYLIST_TYPE_LIKED.equalsIgnoreCase(item.getPlaylistType())) {
                continue;
            }
            int count = countPlaylistTracks(item.getPlaylistCode(), false);
            featuredPlaylists.add(toPlaylistSummary(item, count));
        }

        return new MusicLibraryHomeResponse(featuredPlaylists, featuredTracks);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MusicPlaylistBundleResponse getMusicPlaylistBundle(String playlistCode) {
        String normalizedCode = normalizePlaylistCode(playlistCode);
        TuneHubVirtualPlaylistRef virtualPlaylistRef = parseVirtualTunehubPlaylistCode(normalizedCode);
        if (virtualPlaylistRef != null) {
            return loadVirtualTunehubPlaylistBundle(virtualPlaylistRef);
        }
        if (DEFAULT_PLAYLIST_CODE.equals(normalizedCode)) {
            List<MusicTrackResponse> tracks = listDefaultMusicPlaylistFromDb();
            return new MusicPlaylistBundleResponse(
                buildDefaultPlaylistSummary(tracks.size(), ""),
                tracks
            );
        }

        UserMusicPlaylistEntity playlist = loadUserPlaylistByCode(normalizedCode);
        if (playlist == null) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "Playlist not found");
        }
        Long userId = currentLoginUser() == null ? 0L : currentLoginUser().getUserId();
        boolean ownerView = userId > 0 && userId.equals(playlist.getUserId());
        if (!ownerView && !Boolean.TRUE.equals(playlist.getPublicFlag())) {
            throw new BusinessException(ErrorCode.FORBIDDEN, "No permission to access this playlist");
        }
        return buildUserPlaylistBundle(playlist, ownerView);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MusicSearchResponse searchMusic(String query, String type, String providers, Integer page, Integer limit) {
        String normalizedQuery = normalizeMusicSearchQuery(query);
        String normalizedType = normalizeMusicSearchType(type);
        int safePage = page == null ? 1 : Math.max(1, page);
        int safeLimit = limit == null ? 24 : Math.max(1, Math.min(60, limit));
        int playlistCollectLimit = Math.max(safeLimit + 1, safePage * safeLimit + 1);
        int trackCollectLimit = safeLimit + 1;
        Long userId = currentLoginUser() == null ? 0L : currentLoginUser().getUserId();
        String queryDigest = hashQueryFingerprint(normalizedQuery);
        boolean includeDeepPlaylistMatch = "playlist".equals(normalizedType);

        List<String> selectedProviders = resolveSearchProviders(providers, userId);
        boolean includePlaylists = "all".equals(normalizedType) || "playlist".equals(normalizedType);
        boolean includeTracks = "all".equals(normalizedType) || "track".equals(normalizedType) || "artist".equals(normalizedType);
        boolean includeArtists = "all".equals(normalizedType) || "artist".equals(normalizedType);
        long startMs = System.currentTimeMillis();

        LOGGER.info(
            "{} userId={} queryLength={} queryHash={} type={} providers={} page={} limit={} playlistMatch={}",
            LOG_EVENT_SEARCH_STAGE_START,
            userId,
            normalizedQuery.length(),
            queryDigest,
            normalizedType,
            selectedProviders,
            safePage,
            safeLimit,
            includeDeepPlaylistMatch ? "deep" : "light"
        );
        LOGGER.info(
            "{} userId={} queryLength={} type={} providers={} page={} limit={}",
            LOG_EVENT_SEARCH_START,
            userId,
            normalizedQuery.length(),
            normalizedType,
            selectedProviders,
            safePage,
            safeLimit
        );

        List<MusicPlaylistSummaryResponse> playlists = new ArrayList<>();
        List<MusicSearchTrackResponse> tracks = new ArrayList<>();
        Set<String> playlistCodes = new LinkedHashSet<>();
        Set<String> trackKeys = new LinkedHashSet<>();
        Set<String> failedProviders = new LinkedHashSet<>();

        TuneHubApiContext apiContext = resolveTuneHubApiContext(false);
        boolean tuneHubReady = StringUtils.hasText(apiContext.apiKey());

        for (String provider : selectedProviders) {
            long providerStartMs = System.currentTimeMillis();
            int providerTrackMapped = 0;
            String providerTopCover = "";
            if ("spotify".equals(provider)) {
                if (!includeTracks) {
                    continue;
                }
                try {
                    List<SpotifyTrackResponse> items = searchSpotify(normalizedQuery, Math.min(safeLimit, 20));
                    int mappedCount = 0;
                    for (SpotifyTrackResponse item : items) {
                        String trackId = readString(item == null ? null : item.trackId(), "");
                        if (!StringUtils.hasText(trackId)) {
                            continue;
                        }
                        String dedupeKey = provider + ":" + trackId;
                        if (!trackKeys.add(dedupeKey)) {
                            continue;
                        }
                        tracks.add(new MusicSearchTrackResponse(
                            trackId,
                            "spotify",
                            readString(item.title(), ""),
                            readString(item.artist(), ""),
                            "",
                            "",
                            null
                        ));
                        mappedCount += 1;
                        if (tracks.size() >= trackCollectLimit) {
                            break;
                        }
                    }
                    providerTrackMapped = mappedCount;
                    LOGGER.info("{} provider={} rowCount={} mappedCount={} totalTrackCount={}",
                        LOG_EVENT_SEARCH_PROVIDER_RESULT, "spotify", items.size(), mappedCount, tracks.size());
                } catch (Exception ex) {
                    failedProviders.add("spotify");
                    LOGGER.warn(
                        "{} provider={} reason={}",
                        LOG_EVENT_SEARCH_PROVIDER_FAIL,
                        "spotify",
                        sanitizeLogMessage(readString(ex.getMessage(), "unknown_error"))
                    );
                } finally {
                    LOGGER.info(
                        "{} provider={} durationMs={} mappedTrackCount={} failed={}",
                        LOG_EVENT_SEARCH_STAGE_PROVIDER_FETCH_DONE,
                        "spotify",
                        Math.max(1L, System.currentTimeMillis() - providerStartMs),
                        providerTrackMapped,
                        failedProviders.contains("spotify")
                    );
                }
                continue;
            }

            if (!TUNEHUB_PLAYLIST_PLATFORMS.contains(provider)) {
                continue;
            }
            if (!tuneHubReady) {
                failedProviders.add(provider);
                LOGGER.info(
                    "{} provider={} durationMs={} mappedTrackCount={} failed=true reason=no_api_key",
                    LOG_EVENT_SEARCH_STAGE_PROVIDER_FETCH_DONE,
                    provider,
                    Math.max(1L, System.currentTimeMillis() - providerStartMs),
                    providerTrackMapped
                );
                continue;
            }

            if (includeTracks && tracks.size() < trackCollectLimit) {
                long trackFetchStartMs = System.currentTimeMillis();
                try {
                    List<TuneHubMusicProvider.SearchTrackResult> searchItems = tuneHubMusicProvider.searchTracks(
                        apiContext.apiKey(),
                        provider,
                        normalizedQuery,
                        safePage,
                        safeLimit
                    );
                    int mappedCount = 0;
                    for (TuneHubMusicProvider.SearchTrackResult item : searchItems) {
                        String trackId = readString(item.trackId(), "");
                        if (!StringUtils.hasText(trackId)) {
                            continue;
                        }
                        String dedupeKey = provider + ":" + trackId;
                        if (!trackKeys.add(dedupeKey)) {
                            continue;
                        }
                        tracks.add(new MusicSearchTrackResponse(
                            trackId,
                            provider,
                            readString(item.title(), ""),
                            readString(item.artist(), ""),
                            readString(item.album(), ""),
                            readString(item.cover(), ""),
                            item.durationSec()
                        ));
                        mappedCount += 1;
                        if (!StringUtils.hasText(providerTopCover)) {
                            providerTopCover = readString(item.cover(), "");
                        }
                        if (tracks.size() >= trackCollectLimit) {
                            break;
                        }
                    }
                    providerTrackMapped = mappedCount;
                    LOGGER.info("{} provider={} rowCount={} mappedCount={} totalTrackCount={}",
                        LOG_EVENT_SEARCH_PROVIDER_RESULT, provider, searchItems.size(), mappedCount, tracks.size());
                } catch (Exception ex) {
                    failedProviders.add(provider);
                    LOGGER.warn(
                        "{} provider={} reason={}",
                        LOG_EVENT_SEARCH_PROVIDER_FAIL,
                        provider,
                        sanitizeLogMessage(readString(ex.getMessage(), "unknown_error"))
                    );
                } finally {
                    LOGGER.info(
                        "{} provider={} stage=track_fetch durationMs={} mappedCount={} failed={}",
                        LOG_EVENT_SEARCH_STAGE_PROVIDER_FETCH_DONE,
                        provider,
                        Math.max(1L, System.currentTimeMillis() - trackFetchStartMs),
                        providerTrackMapped,
                        failedProviders.contains(provider)
                    );
                }
            }

            if (includePlaylists && providerTrackMapped > 0 && playlists.size() < playlistCollectLimit) {
                String searchPlaylistCode = buildVirtualSearchPlaylistCode(provider, normalizedQuery);
                if (playlistCodes.add(searchPlaylistCode)) {
                    playlists.add(new MusicPlaylistSummaryResponse(
                        searchPlaylistCode,
                        resolveProviderDisplayName(provider) + " 搜索结果",
                        "关键词：" + normalizedQuery + " · " + providerTrackMapped + " 首",
                        providerTopCover,
                        PLAYLIST_TYPE_CUSTOM,
                        0L,
                        true,
                        providerTrackMapped,
                        normalizeSourceProvider(provider)
                    ));
                }
            }

            if (includePlaylists && playlists.size() < playlistCollectLimit) {
                long playlistMatchStartMs = System.currentTimeMillis();
                int playlistMatchedCount = 0;
                try {
                    List<TuneHubMusicProvider.VirtualPlaylistSummary> summaries = tuneHubMusicProvider.listToplistPlaylists(
                        apiContext.apiKey(),
                        List.of(provider),
                        includeDeepPlaylistMatch
                            ? Math.max(10, playlistCollectLimit)
                            : Math.min(12, Math.max(4, safeLimit))
                    );
                    for (TuneHubMusicProvider.VirtualPlaylistSummary item : summaries) {
                        String name = readString(item.name(), "");
                        String description = readString(item.description(), "");
                        boolean matched = containsKeyword(name, normalizedQuery) || containsKeyword(description, normalizedQuery);
                        if (!matched && includeDeepPlaylistMatch) {
                            matched = virtualPlaylistMatchesKeyword(apiContext.apiKey(), item, normalizedQuery);
                        }
                        if (!matched) {
                            continue;
                        }
                        String code = readString(item.playlistCode(), "");
                        if (!StringUtils.hasText(code) || !playlistCodes.add(code)) {
                            continue;
                        }
                        playlists.add(new MusicPlaylistSummaryResponse(
                            code,
                            readString(item.name(), "TuneHub 推荐歌单"),
                            description,
                            readString(item.cover(), ""),
                            PLAYLIST_TYPE_CUSTOM,
                            0L,
                            true,
                            0,
                            normalizeSourceProvider(item.platform())
                        ));
                        playlistMatchedCount += 1;
                        if (playlists.size() >= playlistCollectLimit) {
                            break;
                        }
                    }
                } catch (Exception ex) {
                    failedProviders.add(provider);
                    LOGGER.warn(
                        "{} provider={} reason={}",
                        LOG_EVENT_SEARCH_PROVIDER_FAIL,
                        provider,
                        sanitizeLogMessage(readString(ex.getMessage(), "unknown_error"))
                    );
                } finally {
                    LOGGER.info(
                        "{} provider={} strategy={} matchedCount={} durationMs={}",
                        LOG_EVENT_SEARCH_STAGE_PLAYLIST_MATCH_DONE,
                        provider,
                        includeDeepPlaylistMatch ? "deep" : "light",
                        playlistMatchedCount,
                        Math.max(1L, System.currentTimeMillis() - playlistMatchStartMs)
                    );
                }
            }

            LOGGER.info(
                "{} provider={} durationMs={} mappedTrackCount={} failed={}",
                LOG_EVENT_SEARCH_STAGE_PROVIDER_FETCH_DONE,
                provider,
                Math.max(1L, System.currentTimeMillis() - providerStartMs),
                providerTrackMapped,
                failedProviders.contains(provider)
            );
        }

        if (includePlaylists && playlists.size() < playlistCollectLimit) {
            List<UserMusicPlaylistEntity> publicPlaylists = userMusicPlaylistMapper.selectList(
                new LambdaQueryWrapper<UserMusicPlaylistEntity>()
                    .eq(UserMusicPlaylistEntity::getPublicFlag, true)
                    .and(
                        wrapper -> wrapper.like(UserMusicPlaylistEntity::getName, normalizedQuery)
                            .or()
                            .like(UserMusicPlaylistEntity::getDescription, normalizedQuery)
                    )
                    .orderByAsc(UserMusicPlaylistEntity::getSortNum)
                    .orderByDesc(UserMusicPlaylistEntity::getId)
                    .last("LIMIT " + playlistCollectLimit)
            );
            for (UserMusicPlaylistEntity item : publicPlaylists) {
                String code = readString(item.getPlaylistCode(), "");
                if (!StringUtils.hasText(code) || !playlistCodes.add(code)) {
                    continue;
                }
                if (PLAYLIST_TYPE_LIKED.equalsIgnoreCase(item.getPlaylistType())) {
                    continue;
                }
                playlists.add(toPlaylistSummary(item, countPlaylistTracks(code, false)));
                if (playlists.size() >= playlistCollectLimit) {
                    break;
                }
            }

            MusicPlaylistProfileResponse defaultProfile = loadDefaultPlaylistProfile();
            if (playlists.size() < playlistCollectLimit) {
                String defaultName = readString(defaultProfile.name(), "默认歌单");
                String defaultDesc = readString(defaultProfile.description(), "");
                if (containsKeyword(defaultName, normalizedQuery) || containsKeyword(defaultDesc, normalizedQuery)) {
                    if (playlistCodes.add(DEFAULT_PLAYLIST_CODE)) {
                        int defaultCount = listDefaultMusicPlaylistFromDb().size();
                        playlists.add(buildDefaultPlaylistSummary(defaultCount, "tunehub"));
                    }
                }
            }
        }

        boolean hasMoreTracks = includeTracks && tracks.size() > safeLimit;
        if (hasMoreTracks) {
            tracks = new ArrayList<>(tracks.subList(0, safeLimit));
        }

        List<MusicSearchArtistResponse> artists = includeArtists
            ? buildArtistSearchResults(tracks, Math.max(safeLimit + 1, safePage * safeLimit + 1))
            : List.of();
        boolean hasMoreArtists = false;
        if (includeArtists) {
            hasMoreArtists = artists.size() > safeLimit;
            if (hasMoreArtists) {
                artists = new ArrayList<>(artists.subList(0, safeLimit));
            }
        }

        boolean hasMorePlaylists = false;
        if (includePlaylists) {
            int start = Math.max(0, (safePage - 1) * safeLimit);
            int end = Math.min(playlists.size(), start + safeLimit);
            hasMorePlaylists = playlists.size() > end;
            if (start >= playlists.size()) {
                playlists = List.of();
            } else {
                playlists = new ArrayList<>(playlists.subList(start, end));
            }
        } else {
            playlists = List.of();
        }

        if (!includeTracks) {
            tracks = List.of();
            hasMoreTracks = false;
        }
        if (!includeArtists) {
            artists = List.of();
            hasMoreArtists = false;
        }

        boolean partial = !failedProviders.isEmpty();
        long costMs = Math.max(1L, System.currentTimeMillis() - startMs);

        LOGGER.info(
            "{} userId={} type={} providers={} playlistCount={} trackCount={} artistCount={} partial={} costMs={}",
            LOG_EVENT_SEARCH_DONE,
            userId,
            normalizedType,
            selectedProviders,
            playlists.size(),
            tracks.size(),
            artists.size(),
            partial,
            costMs
        );
        LOGGER.info(
            "{} userId={} queryHash={} type={} partial={} costMs={} playlistCount={} trackCount={} artistCount={}",
            LOG_EVENT_SEARCH_STAGE_DONE,
            userId,
            queryDigest,
            normalizedType,
            partial,
            costMs,
            playlists.size(),
            tracks.size(),
            artists.size()
        );

        return new MusicSearchResponse(
            normalizedQuery,
            normalizedType,
            safePage,
            safeLimit,
            partial,
            new ArrayList<>(failedProviders),
            hasMorePlaylists,
            hasMoreTracks,
            hasMoreArtists,
            playlists,
            tracks,
            artists
        );
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MusicTrackResponse resolvePlaybackTrack(MusicResolvePlaybackRequest request) {
        long startMs = System.currentTimeMillis();
        String provider = normalizeSourceProvider(readString(request == null ? null : request.getProvider(), ""));
        if (!StringUtils.hasText(provider)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Unsupported playback provider");
        }
        String trackId = readString(request == null ? null : request.getTrackId(), "");
        if (!StringUtils.hasText(trackId)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "track_id is required");
        }
        LOGGER.info("{} provider={} trackId={} resolveLyric={}",
            LOG_EVENT_RESOLVE_STAGE_START,
            provider,
            trackId,
            request != null && Boolean.TRUE.equals(request.getResolveLyric()));

        boolean resolveLyric = request != null && Boolean.TRUE.equals(request.getResolveLyric());
        MusicTrackCacheEntity cache = loadTrackCache(provider, trackId);
        if (cache != null && objectStorageClient.objectExists(cache.getBucketCode(), cache.getObjectCode())) {
            touchTrackCacheLastListen(cache);
            String lyricText = "";
            String resolvedCover = readString(request == null ? null : request.getCover(), "");
            if (resolveLyric) {
                TuneHubApiContext lyricApiContext = resolveTuneHubApiContext();
                if (StringUtils.hasText(lyricApiContext.apiKey())) {
                    try {
                        TuneHubMusicProvider.ParseTrackResult parsedLyric = tuneHubMusicProvider.parseSingleTrack(
                            lyricApiContext.apiKey(),
                            provider,
                            trackId,
                            tuneHubMusicProperties.getDefaultQuality()
                        );
                        lyricText = readString(parsedLyric.lyricText(), "");
                        resolvedCover = resolvePlaybackCover(resolvedCover, parsedLyric.cover());
                        LOGGER.info("MUSIC_LYRIC_FALLBACK_RESOLVED provider={} trackId={} success=true", provider, trackId);
                    } catch (Exception ex) {
                        LOGGER.warn("MUSIC_RESOLVE_PLAYBACK_LYRIC_REFETCH_FAIL provider={} trackId={} reason={}",
                            provider,
                            trackId,
                            sanitizeLogMessage(readString(ex.getMessage(), "unknown_error")));
                        LOGGER.info("MUSIC_LYRIC_FALLBACK_RESOLVED provider={} trackId={} success=false", provider, trackId);
                    }
                }
            }
            LOGGER.info(
                "{} provider={} trackId={} source=cache lyricResolved={} durationMs={}",
                LOG_EVENT_RESOLVE_STAGE_DONE,
                provider,
                trackId,
                StringUtils.hasText(lyricText),
                Math.max(1L, System.currentTimeMillis() - startMs)
            );
            return new MusicTrackResponse(
                trackId,
                provider,
                readString(request == null ? null : request.getTitle(), trackId),
                readString(request == null ? null : request.getArtist(), ""),
                resolvedCover,
                readString(cache.getPublicUrl(), ""),
                "",
                0,
                true,
                lyricText
            );
        }

        TuneHubApiContext apiContext = resolveTuneHubApiContext();
        if (!StringUtils.hasText(apiContext.apiKey())) {
            throw new BusinessException(ErrorCode.FORBIDDEN, "TuneHub API key missing");
        }

        TuneHubMusicProvider.ParseTrackResult parsed = tuneHubMusicProvider.parseSingleTrack(
            apiContext.apiKey(),
            provider,
            trackId,
            tuneHubMusicProperties.getDefaultQuality()
        );
        long parseDoneMs = System.currentTimeMillis();

        String resolvedAudio = readString(parsed.audioUrl(), "");
        if (!StringUtils.hasText(resolvedAudio)) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "Track parse failed");
        }
        validateHttpUrlIfPresent(resolvedAudio, "audio");

        Long userId = currentLoginUser() == null ? 0L : currentLoginUser().getUserId();
        boolean shouldCache = musicListenCacheProperties.isEnabled()
            && (!musicListenCacheProperties.isLoginOnly() || userId > 0);
        boolean cacheEnqueued = false;
        if (shouldCache) {
            cacheEnqueued = musicTrackCacheUploadPublisher.publish(provider, trackId, resolvedAudio);
        }
        String resolvedCover = resolvePlaybackCover(
            readString(request == null ? null : request.getCover(), ""),
            readString(parsed.cover(), "")
        );
        String lyricText = readString(parsed.lyricText(), "");
        LOGGER.info("MUSIC_COVER_FALLBACK_RESOLVED provider={} trackId={} success={}",
            provider,
            trackId,
            StringUtils.hasText(resolvedCover));
        LOGGER.info("MUSIC_LYRIC_FALLBACK_RESOLVED provider={} trackId={} success={}",
            provider,
            trackId,
            StringUtils.hasText(lyricText));
        LOGGER.info(
            "{} provider={} trackId={} source=parse parseMs={} cacheEnqueued={} durationMs={}",
            LOG_EVENT_RESOLVE_STAGE_DONE,
            provider,
            trackId,
            Math.max(1L, parseDoneMs - startMs),
            cacheEnqueued,
            Math.max(1L, System.currentTimeMillis() - startMs)
        );

        return new MusicTrackResponse(
            trackId,
            provider,
            readString(request == null ? null : request.getTitle(), readString(parsed.title(), trackId)),
            readString(request == null ? null : request.getArtist(), readString(parsed.artist(), "")),
            resolvedCover,
            resolvedAudio,
            "",
            0,
            true,
            lyricText
        );
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
        String sourceAudioUrl = readString(selected.audio(), "");
        boolean shouldAsyncCache = musicListenCacheProperties.isEnabled()
            && (!musicListenCacheProperties.isLoginOnly() || userId > 0)
            && StringUtils.hasText(trackId)
            && StringUtils.hasText(sourceAudioUrl);
        if (shouldAsyncCache) {
            musicTrackCacheUploadPublisher.publish(provider, trackId, sourceAudioUrl);
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
        String userToken = resolveOptionalSpotifyToken(userId);
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
        String userToken = resolveOptionalSpotifyToken(userId);
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
    public MusicDefaultPlaylistBundleResponse getAdminDefaultPlaylistBundle() {
        return new MusicDefaultPlaylistBundleResponse(
            loadDefaultPlaylistProfile(),
            listAdminDefaultPlaylist()
        );
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
    @Transactional(rollbackFor = Exception.class)
    public MusicDefaultPlaylistBundleResponse replaceAdminDefaultPlaylistBundle(AdminMusicDefaultPlaylistBundleReplaceRequest request) {
        upsertDefaultPlaylistProfile(request == null ? null : request.getProfile());

        AdminMusicPlaylistReplaceRequest tracksRequest = new AdminMusicPlaylistReplaceRequest();
        tracksRequest.setTracks(request == null ? null : request.getTracks());
        replaceAdminDefaultPlaylist(tracksRequest);

        return getAdminDefaultPlaylistBundle();
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
     * {@inheritDoc}
     */
    @Override
    public MeMusicLibrarySidebarResponse getMyMusicLibrarySidebar() {
        Long userId = requireLoginUserId();
        MusicPlaylistSummaryResponse defaultSummary = buildDefaultPlaylistSummary(
            listDefaultMusicPlaylistFromDb().size(),
            ""
        );
        UserMusicPlaylistEntity likedPlaylist = ensureLikedPlaylist(userId);
        MusicPlaylistSummaryResponse likedSummary = toPlaylistSummary(
            likedPlaylist,
            countPlaylistTracks(likedPlaylist.getPlaylistCode(), true)
        );

        List<UserMusicPlaylistEntity> createdEntities = userMusicPlaylistMapper.selectList(
            new LambdaQueryWrapper<UserMusicPlaylistEntity>()
                .eq(UserMusicPlaylistEntity::getUserId, userId)
                .eq(UserMusicPlaylistEntity::getPlaylistType, PLAYLIST_TYPE_CUSTOM)
                .orderByAsc(UserMusicPlaylistEntity::getSortNum)
                .orderByDesc(UserMusicPlaylistEntity::getId)
        );
        List<MusicPlaylistSummaryResponse> createdPlaylists = new ArrayList<>();
        for (UserMusicPlaylistEntity item : createdEntities) {
            createdPlaylists.add(toPlaylistSummary(item, countPlaylistTracks(item.getPlaylistCode(), true)));
        }

        List<UserMusicPlaylistCollectEntity> collectEntities = userMusicPlaylistCollectMapper.selectList(
            new LambdaQueryWrapper<UserMusicPlaylistCollectEntity>()
                .eq(UserMusicPlaylistCollectEntity::getUserId, userId)
                .orderByDesc(UserMusicPlaylistCollectEntity::getId)
        );
        List<MusicPlaylistSummaryResponse> collectedPlaylists = new ArrayList<>();
        Set<String> collectedCodes = new LinkedHashSet<>();
        for (UserMusicPlaylistCollectEntity item : collectEntities) {
            String code = normalizePlaylistCode(item.getPlaylistCode());
            if (!collectedCodes.add(code)) {
                continue;
            }
            if (DEFAULT_PLAYLIST_CODE.equals(code)) {
                collectedPlaylists.add(defaultSummary);
                continue;
            }
            UserMusicPlaylistEntity playlist = loadUserPlaylistByCode(code);
            if (playlist == null) {
                continue;
            }
            boolean owner = userId.equals(playlist.getUserId());
            if (!owner && !Boolean.TRUE.equals(playlist.getPublicFlag())) {
                continue;
            }
            collectedPlaylists.add(toPlaylistSummary(playlist, countPlaylistTracks(code, owner)));
        }

        return new MeMusicLibrarySidebarResponse(
            defaultSummary,
            likedSummary,
            createdPlaylists,
            collectedPlaylists
        );
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public MusicPlaylistSummaryResponse createMyMusicPlaylist(MeMusicPlaylistCreateRequest request) {
        Long userId = requireLoginUserId();
        String playlistCode = generateCustomPlaylistCode(userId);
        String name = readString(request == null ? null : request.getName(), "我的歌单");
        String description = readString(request == null ? null : request.getDescription(), "");
        String cover = readString(request == null ? null : request.getCover(), "");
        validateHttpUrlIfPresent(cover, "cover");
        boolean isPublic = request != null && Boolean.TRUE.equals(request.getIsPublic());

        UserMusicPlaylistEntity entity = new UserMusicPlaylistEntity();
        entity.setPlaylistCode(playlistCode);
        entity.setUserId(userId);
        entity.setPlaylistType(PLAYLIST_TYPE_CUSTOM);
        entity.setName(name);
        entity.setDescription(description);
        entity.setCoverUrl(cover);
        entity.setPublicFlag(isPublic);
        entity.setSystemReservedFlag(false);
        entity.setSortNum(resolveNextUserPlaylistSort(userId));
        entity.setMetadataJson(writeJson(Map.of()));
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        userMusicPlaylistMapper.insert(entity);
        return toPlaylistSummary(entity, 0);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public MusicPlaylistSummaryResponse updateMyMusicPlaylist(String playlistCode, MeMusicPlaylistUpdateRequest request) {
        Long userId = requireLoginUserId();
        UserMusicPlaylistEntity playlist = requireOwnedUserPlaylist(userId, playlistCode);
        if (request == null) {
            return toPlaylistSummary(playlist, countPlaylistTracks(playlist.getPlaylistCode(), true));
        }

        if (request.getName() != null) {
            playlist.setName(readString(request.getName(), playlist.getName()));
        }
        if (request.getDescription() != null) {
            playlist.setDescription(request.getDescription().trim());
        }
        if (request.getCover() != null) {
            String cover = request.getCover().trim();
            validateHttpUrlIfPresent(cover, "cover");
            playlist.setCoverUrl(cover);
        }
        if (request.getIsPublic() != null) {
            if (Boolean.TRUE.equals(playlist.getSystemReservedFlag()) && Boolean.TRUE.equals(request.getIsPublic())) {
                throw new BusinessException(ErrorCode.BAD_REQUEST, "System playlist cannot be public");
            }
            playlist.setPublicFlag(request.getIsPublic());
        }
        playlist.setUpdatedAt(LocalDateTime.now());
        userMusicPlaylistMapper.updateById(playlist);
        return toPlaylistSummary(playlist, countPlaylistTracks(playlist.getPlaylistCode(), true));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public void deleteMyMusicPlaylist(String playlistCode) {
        Long userId = requireLoginUserId();
        UserMusicPlaylistEntity playlist = requireOwnedUserPlaylist(userId, playlistCode);
        if (Boolean.TRUE.equals(playlist.getSystemReservedFlag()) || PLAYLIST_TYPE_LIKED.equalsIgnoreCase(playlist.getPlaylistType())) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "System playlist cannot be deleted");
        }
        userMusicPlaylistTrackMapper.delete(
            new LambdaQueryWrapper<UserMusicPlaylistTrackEntity>().eq(UserMusicPlaylistTrackEntity::getPlaylistCode, playlist.getPlaylistCode())
        );
        userMusicPlaylistCollectMapper.delete(
            new LambdaQueryWrapper<UserMusicPlaylistCollectEntity>().eq(UserMusicPlaylistCollectEntity::getPlaylistCode, playlist.getPlaylistCode())
        );
        userMusicPlaylistMapper.deleteById(playlist.getId());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public MusicPlaylistBundleResponse upsertMyMusicPlaylistTrack(String playlistCode, MeMusicPlaylistTrackUpsertRequest request) {
        Long userId = requireLoginUserId();
        UserMusicPlaylistEntity playlist = requireOwnedUserPlaylist(userId, playlistCode);
        if (request == null) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Track request is required");
        }
        String provider = normalizeTrackProvider(request.getProvider());
        String trackId = readString(request.getTrackId(), "");
        if (!StringUtils.hasText(trackId)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "track_id is required");
        }
        String title = readString(request.getTitle(), trackId);
        String artist = readString(request.getArtist(), "");
        String cover = readString(request.getCover(), "");
        String audio = readString(request.getAudio(), "");
        String lyric = readString(request.getLyric(), "");
        validateHttpUrlIfPresent(cover, "cover");
        validateHttpUrlIfPresent(audio, "audio");
        validateHttpUrlIfPresent(lyric, "lyric");

        UserMusicPlaylistTrackEntity entity = userMusicPlaylistTrackMapper.selectOne(
            new LambdaQueryWrapper<UserMusicPlaylistTrackEntity>()
                .eq(UserMusicPlaylistTrackEntity::getPlaylistCode, playlist.getPlaylistCode())
                .eq(UserMusicPlaylistTrackEntity::getProviderCode, provider)
                .eq(UserMusicPlaylistTrackEntity::getTrackId, trackId)
                .last("LIMIT 1")
        );
        boolean created = false;
        if (entity == null) {
            entity = new UserMusicPlaylistTrackEntity();
            entity.setPlaylistCode(playlist.getPlaylistCode());
            entity.setProviderCode(provider);
            entity.setTrackId(trackId);
            entity.setCreatedAt(LocalDateTime.now());
            created = true;
        }
        entity.setTitle(title);
        entity.setArtist(artist);
        entity.setCoverUrl(cover);
        entity.setAudioUrl(audio);
        entity.setLyricUrl(lyric);
        entity.setSortNum(request.getSort() == null ? (created ? resolveNextPlaylistTrackSort(playlist.getPlaylistCode()) : entity.getSortNum()) : Math.max(0, request.getSort()));
        entity.setEnabledFlag(request.getEnabled() == null ? true : request.getEnabled());
        entity.setMetadataJson(writeJson(request.getMetadata() == null ? Map.of() : request.getMetadata()));
        entity.setUpdatedAt(LocalDateTime.now());
        if (created) {
            userMusicPlaylistTrackMapper.insert(entity);
        } else {
            userMusicPlaylistTrackMapper.updateById(entity);
        }
        return buildUserPlaylistBundle(playlist, true);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public MusicPlaylistBundleResponse removeMyMusicPlaylistTrack(String playlistCode, String provider, String trackId) {
        Long userId = requireLoginUserId();
        UserMusicPlaylistEntity playlist = requireOwnedUserPlaylist(userId, playlistCode);
        String normalizedProvider = normalizeTrackProvider(provider);
        String normalizedTrackId = readString(trackId, "");
        if (!StringUtils.hasText(normalizedTrackId)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "track_id is required");
        }
        userMusicPlaylistTrackMapper.delete(
            new LambdaQueryWrapper<UserMusicPlaylistTrackEntity>()
                .eq(UserMusicPlaylistTrackEntity::getPlaylistCode, playlist.getPlaylistCode())
                .eq(UserMusicPlaylistTrackEntity::getProviderCode, normalizedProvider)
                .eq(UserMusicPlaylistTrackEntity::getTrackId, normalizedTrackId)
        );
        return buildUserPlaylistBundle(playlist, true);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public void collectPlaylist(String playlistCode) {
        Long userId = requireLoginUserId();
        String normalizedCode = normalizePlaylistCode(playlistCode);
        if (!DEFAULT_PLAYLIST_CODE.equals(normalizedCode)) {
            UserMusicPlaylistEntity playlist = loadUserPlaylistByCode(normalizedCode);
            if (playlist == null) {
                throw new BusinessException(ErrorCode.NOT_FOUND, "Playlist not found");
            }
            boolean owner = userId.equals(playlist.getUserId());
            if (!owner && !Boolean.TRUE.equals(playlist.getPublicFlag())) {
                throw new BusinessException(ErrorCode.FORBIDDEN, "No permission to collect this playlist");
            }
            if (Boolean.TRUE.equals(playlist.getSystemReservedFlag()) && PLAYLIST_TYPE_LIKED.equalsIgnoreCase(playlist.getPlaylistType()) && !owner) {
                throw new BusinessException(ErrorCode.FORBIDDEN, "No permission to collect this playlist");
            }
        }

        UserMusicPlaylistCollectEntity existing = userMusicPlaylistCollectMapper.selectOne(
            new LambdaQueryWrapper<UserMusicPlaylistCollectEntity>()
                .eq(UserMusicPlaylistCollectEntity::getUserId, userId)
                .eq(UserMusicPlaylistCollectEntity::getPlaylistCode, normalizedCode)
                .last("LIMIT 1")
        );
        if (existing != null) {
            return;
        }
        UserMusicPlaylistCollectEntity entity = new UserMusicPlaylistCollectEntity();
        entity.setUserId(userId);
        entity.setPlaylistCode(normalizedCode);
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        userMusicPlaylistCollectMapper.insert(entity);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public void uncollectPlaylist(String playlistCode) {
        Long userId = requireLoginUserId();
        String normalizedCode = normalizePlaylistCode(playlistCode);
        userMusicPlaylistCollectMapper.delete(
            new LambdaQueryWrapper<UserMusicPlaylistCollectEntity>()
                .eq(UserMusicPlaylistCollectEntity::getUserId, userId)
                .eq(UserMusicPlaylistCollectEntity::getPlaylistCode, normalizedCode)
        );
    }

    private MusicPlaylistBundleResponse loadVirtualTunehubPlaylistBundle(TuneHubVirtualPlaylistRef ref) {
        TuneHubApiContext apiContext = resolveTuneHubApiContext();
        if (!StringUtils.hasText(apiContext.apiKey())) {
            throw new BusinessException(ErrorCode.FORBIDDEN, "TuneHub API key missing");
        }
        List<MusicTrackResponse> tracks = tuneHubMusicProvider.loadVirtualPlaylistTracks(
            apiContext.apiKey(),
            ref.provider(),
            ref.sourceType(),
            ref.sourceId()
        );

        TuneHubMusicProvider.VirtualPlaylistSummary summary = tuneHubMusicProvider
            .listToplistPlaylists(apiContext.apiKey(), List.of(ref.provider()), 8)
            .stream()
            .filter(item ->
                ref.provider().equals(item.platform())
                    && ref.sourceType().equals(item.sourceType())
                    && ref.sourceId().equals(item.sourceId())
            )
            .findFirst()
            .orElseGet(() -> new TuneHubMusicProvider.VirtualPlaylistSummary(
                ref.provider(),
                ref.sourceType(),
                ref.sourceId(),
                ref.provider().toUpperCase(Locale.ROOT) + " 歌单",
                "TuneHub 虚拟歌单",
                "",
                ref.playlistCode()
            ));

        MusicPlaylistSummaryResponse profile = new MusicPlaylistSummaryResponse(
            ref.playlistCode(),
            readString(summary.name(), "TuneHub 歌单"),
            readString(summary.description(), ""),
            readString(summary.cover(), ""),
            PLAYLIST_TYPE_CUSTOM,
            0L,
            true,
            tracks.size(),
            normalizeSourceProvider(summary.platform())
        );
        return new MusicPlaylistBundleResponse(profile, tracks);
    }

    private TuneHubVirtualPlaylistRef parseVirtualTunehubPlaylistCode(String playlistCode) {
        Matcher matcher = VIRTUAL_TUNEHUB_PLAYLIST_CODE_PATTERN.matcher(readString(playlistCode, ""));
        if (!matcher.matches()) {
            return null;
        }
        String provider = normalizeSourceProvider(matcher.group(1));
        String sourceType = readString(matcher.group(2), "").toLowerCase(Locale.ROOT);
        String sourceId = readString(matcher.group(3), "");
        if (!StringUtils.hasText(provider) || !StringUtils.hasText(sourceType) || !StringUtils.hasText(sourceId)) {
            return null;
        }
        return new TuneHubVirtualPlaylistRef(playlistCode, provider, sourceType, sourceId);
    }

    private TuneHubApiContext resolveTuneHubApiContext() {
        return resolveTuneHubApiContext(true);
    }

    private TuneHubApiContext resolveTuneHubApiContext(boolean logBuildStart) {
        Long userId = currentLoginUser() == null ? 0L : currentLoginUser().getUserId();
        String userApiKey = userId > 0 ? userMusicClient.getApiKeyPlaintext(userId, "tunehub") : "";
        String systemApiKey = readString(tuneHubMusicProperties.getDefaultApiKey(), "");
        String apiKey = StringUtils.hasText(userApiKey) ? userApiKey : systemApiKey;
        String keySource = StringUtils.hasText(userApiKey) ? "user" : "system";
        List<String> preferredOrder = resolveTuneHubPlatformOrder(userId);
        if (logBuildStart) {
            LOGGER.info("{} userId={} keySource={} platformOrder={}", LOG_EVENT_BUILD_START, userId, keySource, preferredOrder);
        }
        return new TuneHubApiContext(apiKey, keySource, preferredOrder);
    }

    private String normalizeMusicSearchQuery(String query) {
        String normalized = readString(query, "");
        if (!StringUtils.hasText(normalized)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "search query is required");
        }
        if (normalized.length() < 2) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "search query is too short");
        }
        if (normalized.length() > 64) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "search query is too long");
        }
        return normalized;
    }

    private String normalizeMusicSearchType(String type) {
        String normalized = readString(type, "all").toLowerCase(Locale.ROOT);
        if (
            "all".equals(normalized)
                || "playlist".equals(normalized)
                || "track".equals(normalized)
                || "artist".equals(normalized)
        ) {
            return normalized;
        }
        throw new BusinessException(ErrorCode.BAD_REQUEST, "unsupported search type");
    }

    private List<String> resolveSearchProviders(String providers, Long userId) {
        List<String> result = new ArrayList<>();
        Set<String> seen = new LinkedHashSet<>();
        String raw = readString(providers, "");
        if (StringUtils.hasText(raw)) {
            for (String item : raw.split(",")) {
                String normalized = normalizeSearchProvider(item);
                if (!StringUtils.hasText(normalized) || !seen.add(normalized)) {
                    continue;
                }
                result.add(normalized);
            }
        }
        if (!result.isEmpty()) {
            return result;
        }

        List<String> defaults = resolveTuneHubPlatformOrder(userId);
        for (String item : defaults) {
            String normalized = normalizeSearchProvider(item);
            if (!StringUtils.hasText(normalized) || !seen.add(normalized)) {
                continue;
            }
            result.add(normalized);
        }
        if (result.isEmpty()) {
            return List.of("netease", "kuwo", "qq");
        }
        return result;
    }

    private String normalizeSearchProvider(String provider) {
        String normalized = readString(provider, "").toLowerCase(Locale.ROOT);
        if ("spotify".equals(normalized)) {
            return "spotify";
        }
        return normalizeSourceProvider(normalized);
    }

    private boolean containsKeyword(String value, String keyword) {
        String source = readString(value, "").toLowerCase(Locale.ROOT);
        String key = readString(keyword, "").toLowerCase(Locale.ROOT);
        if (!StringUtils.hasText(key)) {
            return false;
        }
        return source.contains(key);
    }

    private String buildVirtualSearchPlaylistCode(String provider, String keyword) {
        String normalizedProvider = normalizeSourceProvider(provider);
        String normalizedKeyword = readString(keyword, "");
        String encodedKeyword = Base64.getUrlEncoder()
            .withoutPadding()
            .encodeToString(normalizedKeyword.getBytes(StandardCharsets.UTF_8));
        return "vh_tunehub_" + normalizedProvider + "_search_" + encodedKeyword;
    }

    private String resolveProviderDisplayName(String provider) {
        String normalized = normalizeSourceProvider(provider);
        return switch (normalized) {
            case "netease" -> "网易云";
            case "kuwo" -> "酷我";
            case "qq" -> "QQ 音乐";
            default -> normalized.toUpperCase(Locale.ROOT);
        };
    }

    private String resolvePlaybackCover(String preferredCover, String fallbackCover) {
        String preferred = readString(preferredCover, "");
        if (StringUtils.hasText(preferred)) {
            return preferred;
        }
        return readString(fallbackCover, "");
    }

    private String hashQueryFingerprint(String query) {
        String value = readString(query, "");
        if (!StringUtils.hasText(value)) {
            return "-";
        }
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] bytes = digest.digest(value.getBytes(StandardCharsets.UTF_8));
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < Math.min(8, bytes.length); i += 1) {
                builder.append(String.format("%02x", bytes[i]));
            }
            return builder.toString();
        } catch (Exception ex) {
            return "hash_err";
        }
    }

    private boolean virtualPlaylistMatchesKeyword(String apiKey,
                                                  TuneHubMusicProvider.VirtualPlaylistSummary summary,
                                                  String keyword) {
        if (!StringUtils.hasText(apiKey) || summary == null || !StringUtils.hasText(keyword)) {
            return false;
        }
        try {
            List<MusicTrackResponse> tracks = tuneHubMusicProvider.loadVirtualPlaylistTracks(
                apiKey,
                readString(summary.platform(), ""),
                readString(summary.sourceType(), ""),
                readString(summary.sourceId(), "")
            );
            int inspected = 0;
            for (MusicTrackResponse item : tracks) {
                if (item == null) {
                    continue;
                }
                if (containsKeyword(item.title(), keyword) || containsKeyword(item.artist(), keyword)) {
                    return true;
                }
                inspected += 1;
                if (inspected >= 12) {
                    break;
                }
            }
        } catch (Exception ex) {
            LOGGER.warn(
                "MUSIC_SEARCH_PLAYLIST_MATCH_FAIL provider={} sourceType={} sourceId={} reason={}",
                sanitizeLogMessage(readString(summary.platform(), "")),
                sanitizeLogMessage(readString(summary.sourceType(), "")),
                sanitizeLogMessage(readString(summary.sourceId(), "")),
                sanitizeLogMessage(readString(ex.getMessage(), "unknown_error"))
            );
        }
        return false;
    }

    private List<MusicSearchArtistResponse> buildArtistSearchResults(List<MusicSearchTrackResponse> tracks, int limit) {
        Map<String, ArtistAggregate> aggregateMap = new LinkedHashMap<>();
        for (MusicSearchTrackResponse item : tracks) {
            String artist = readString(item == null ? null : item.artist(), "");
            if (!StringUtils.hasText(artist)) {
                continue;
            }
            String key = artist.toLowerCase(Locale.ROOT);
            ArtistAggregate aggregate = aggregateMap.get(key);
            if (aggregate == null) {
                aggregate = new ArtistAggregate(artist);
                aggregateMap.put(key, aggregate);
            }
            aggregate.hitCount += 1;
            String provider = readString(item.provider(), "");
            if (StringUtils.hasText(provider)) {
                aggregate.providers.add(provider);
            }
        }

        List<MusicSearchArtistResponse> result = new ArrayList<>();
        List<ArtistAggregate> rows = new ArrayList<>(aggregateMap.values());
        rows.sort(
            Comparator.comparingInt(ArtistAggregate::hitCount).reversed()
                .thenComparing(ArtistAggregate::name, String::compareToIgnoreCase)
        );
        for (ArtistAggregate row : rows) {
            result.add(new MusicSearchArtistResponse(
                row.name(),
                row.hitCount(),
                new ArrayList<>(row.providers())
            ));
            if (result.size() >= limit) {
                break;
            }
        }
        return result;
    }

    private String sanitizeLogMessage(String raw) {
        if (!StringUtils.hasText(raw)) {
            return "unknown_error";
        }
        String normalized = raw.replace('\n', ' ').replace('\r', ' ').trim();
        if (normalized.length() > 240) {
            return normalized.substring(0, 240) + "...";
        }
        return normalized;
    }

    private List<String> resolveTuneHubPlatformOrder(Long userId) {
        List<String> defaultOrder = normalizeTuneHubPlatformOrder(tuneHubMusicProperties.getDefaultPlatformOrder());
        if (userId == null || userId <= 0) {
            return defaultOrder;
        }

        Map<String, Object> preference = userMusicClient.getPreference(userId);
        Map<String, Object> musicObject = asObjectMap(preference.get("music"));
        List<String> preferredOrder = asStringList(preference.get("music.provider_order"));
        if (preferredOrder.isEmpty()) {
            preferredOrder = asStringList(musicObject.get("provider_order"));
        }
        Map<String, Boolean> enabledMap = asBooleanMap(preference.get("music.provider_enabled"));
        if (enabledMap.isEmpty()) {
            enabledMap = asBooleanMap(musicObject.get("provider_enabled"));
        }

        List<String> merged = new ArrayList<>();
        Set<String> seen = new LinkedHashSet<>();
        for (String item : preferredOrder) {
            String normalized = normalizeSourceProvider(item);
            if (!TUNEHUB_PLAYLIST_PLATFORMS.contains(normalized) || !seen.add(normalized)) {
                continue;
            }
            if (!isProviderEnabled(enabledMap, normalized)) {
                continue;
            }
            merged.add(normalized);
        }
        for (String fallback : defaultOrder) {
            if (!seen.add(fallback)) {
                continue;
            }
            if (!isProviderEnabled(enabledMap, fallback)) {
                continue;
            }
            merged.add(fallback);
        }
        if (merged.isEmpty()) {
            return defaultOrder;
        }
        return merged;
    }

    private boolean isProviderEnabled(Map<String, Boolean> enabledMap, String providerCode) {
        if (enabledMap == null || enabledMap.isEmpty()) {
            return true;
        }
        Boolean enabled = enabledMap.get(providerCode);
        return enabled == null || enabled;
    }

    private List<String> normalizeTuneHubPlatformOrder(List<String> rawOrder) {
        List<String> source = rawOrder == null ? Collections.emptyList() : rawOrder;
        List<String> result = new ArrayList<>();
        Set<String> seen = new LinkedHashSet<>();
        for (String item : source) {
            String normalized = normalizeSourceProvider(item);
            if (!TUNEHUB_PLAYLIST_PLATFORMS.contains(normalized) || !seen.add(normalized)) {
                continue;
            }
            result.add(normalized);
        }
        if (result.isEmpty()) {
            return List.of("netease", "kuwo", "qq");
        }
        return result;
    }

    private Map<String, Object> asObjectMap(Object raw) {
        if (!(raw instanceof Map<?, ?> mapRaw)) {
            return Map.of();
        }
        Map<String, Object> result = new LinkedHashMap<>();
        for (Map.Entry<?, ?> entry : mapRaw.entrySet()) {
            result.put(String.valueOf(entry.getKey()), entry.getValue());
        }
        return result;
    }

    private List<String> asStringList(Object raw) {
        if (!(raw instanceof List<?> listRaw)) {
            return List.of();
        }
        List<String> result = new ArrayList<>();
        Set<String> seen = new LinkedHashSet<>();
        for (Object item : listRaw) {
            String value = normalizeSourceProvider(item == null ? "" : String.valueOf(item));
            if (!StringUtils.hasText(value) || !seen.add(value)) {
                continue;
            }
            result.add(value);
        }
        return result;
    }

    private Map<String, Boolean> asBooleanMap(Object raw) {
        if (!(raw instanceof Map<?, ?> mapRaw)) {
            return Map.of();
        }
        Map<String, Boolean> result = new LinkedHashMap<>();
        for (Map.Entry<?, ?> entry : mapRaw.entrySet()) {
            String key = normalizeSourceProvider(String.valueOf(entry.getKey()));
            if (!StringUtils.hasText(key)) {
                continue;
            }
            Object valueObj = entry.getValue();
            boolean enabled;
            if (valueObj instanceof Boolean boolValue) {
                enabled = boolValue;
            } else {
                enabled = !"false".equalsIgnoreCase(String.valueOf(valueObj));
            }
            result.put(key, enabled);
        }
        return result;
    }

    private List<MusicTrackResponse> listDefaultMusicPlaylistFromDb() {
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

    private String normalizeSourceProvider(String provider) {
        String normalized = readString(provider, "").toLowerCase(Locale.ROOT);
        return TUNEHUB_PLAYLIST_PLATFORMS.contains(normalized) ? normalized : "";
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

    private void touchTrackCacheLastListen(MusicTrackCacheEntity entity) {
        if (entity == null || entity.getId() == null) {
            return;
        }
        entity.setLastListenTime(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        musicTrackCacheMapper.updateById(entity);
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
            touchTrackCacheLastListen(existing);
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
            entity.setLastListenTime(LocalDateTime.now());
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

    private String resolveOptionalSpotifyToken(Long userId) {
        if (userId == null || userId <= 0) {
            return "";
        }
        if (!userMusicClient.hasOAuthBinding(userId, "spotify")) {
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

    private String normalizePlaylistCode(String playlistCode) {
        String normalized = readString(playlistCode, "").toLowerCase(Locale.ROOT);
        if (!StringUtils.hasText(normalized)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "playlist_code is required");
        }
        if (normalized.length() > 64) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "playlist_code is too long");
        }
        return normalized;
    }

    private String normalizeTrackProvider(String provider) {
        String normalized = readString(provider, "local").toLowerCase(Locale.ROOT);
        if (normalized.length() > 64) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "provider is too long");
        }
        return normalized;
    }

    private MusicPlaylistSummaryResponse buildDefaultPlaylistSummary(int trackCount, String sourceProvider) {
        MusicPlaylistProfileResponse profile = loadDefaultPlaylistProfile();
        return new MusicPlaylistSummaryResponse(
            DEFAULT_PLAYLIST_CODE,
            readString(profile.name(), "默认歌单"),
            readString(profile.description(), ""),
            readString(profile.cover(), ""),
            PLAYLIST_TYPE_DEFAULT,
            0L,
            true,
            Math.max(0, trackCount),
            normalizeSourceProvider(sourceProvider)
        );
    }

    private MusicPlaylistSummaryResponse toPlaylistSummary(UserMusicPlaylistEntity entity, int trackCount) {
        if (entity == null) {
            return new MusicPlaylistSummaryResponse("", "", "", "", PLAYLIST_TYPE_CUSTOM, 0L, false, 0);
        }
        String playlistType = readString(entity.getPlaylistType(), PLAYLIST_TYPE_CUSTOM).toUpperCase(Locale.ROOT);
        return new MusicPlaylistSummaryResponse(
            readString(entity.getPlaylistCode(), ""),
            readString(entity.getName(), "我的歌单"),
            readString(entity.getDescription(), ""),
            readString(entity.getCoverUrl(), ""),
            playlistType,
            entity.getUserId() == null ? 0L : entity.getUserId(),
            Boolean.TRUE.equals(entity.getPublicFlag()),
            Math.max(0, trackCount),
            ""
        );
    }

    private MusicPlaylistBundleResponse buildUserPlaylistBundle(UserMusicPlaylistEntity playlist, boolean ownerView) {
        List<MusicTrackResponse> tracks = listUserPlaylistTracks(playlist.getPlaylistCode(), ownerView);
        return new MusicPlaylistBundleResponse(
            toPlaylistSummary(playlist, tracks.size()),
            tracks
        );
    }

    private List<MusicTrackResponse> listUserPlaylistTracks(String playlistCode, boolean includeDisabled) {
        LambdaQueryWrapper<UserMusicPlaylistTrackEntity> wrapper = new LambdaQueryWrapper<UserMusicPlaylistTrackEntity>()
            .eq(UserMusicPlaylistTrackEntity::getPlaylistCode, playlistCode)
            .orderByAsc(UserMusicPlaylistTrackEntity::getSortNum)
            .orderByAsc(UserMusicPlaylistTrackEntity::getId);
        if (!includeDisabled) {
            wrapper.eq(UserMusicPlaylistTrackEntity::getEnabledFlag, true);
        }
        List<UserMusicPlaylistTrackEntity> rows = userMusicPlaylistTrackMapper.selectList(wrapper);
        List<MusicTrackResponse> result = new ArrayList<>();
        for (UserMusicPlaylistTrackEntity row : rows) {
            result.add(toPlaylistTrackResponse(row));
        }
        return result;
    }

    private int countPlaylistTracks(String playlistCode, boolean includeDisabled) {
        LambdaQueryWrapper<UserMusicPlaylistTrackEntity> wrapper = new LambdaQueryWrapper<UserMusicPlaylistTrackEntity>()
            .eq(UserMusicPlaylistTrackEntity::getPlaylistCode, playlistCode);
        if (!includeDisabled) {
            wrapper.eq(UserMusicPlaylistTrackEntity::getEnabledFlag, true);
        }
        Long count = userMusicPlaylistTrackMapper.selectCount(wrapper);
        return count == null ? 0 : Math.max(0, count.intValue());
    }

    private MusicTrackResponse toPlaylistTrackResponse(UserMusicPlaylistTrackEntity entity) {
        return new MusicTrackResponse(
            readString(entity.getTrackId(), ""),
            readString(entity.getProviderCode(), "local"),
            readString(entity.getTitle(), "Unknown"),
            readString(entity.getArtist(), ""),
            readString(entity.getCoverUrl(), ""),
            readString(entity.getAudioUrl(), ""),
            readString(entity.getLyricUrl(), ""),
            entity.getSortNum() == null ? 0 : entity.getSortNum(),
            Boolean.TRUE.equals(entity.getEnabledFlag())
        );
    }

    private UserMusicPlaylistEntity loadUserPlaylistByCode(String playlistCode) {
        return userMusicPlaylistMapper.selectOne(
            new LambdaQueryWrapper<UserMusicPlaylistEntity>()
                .eq(UserMusicPlaylistEntity::getPlaylistCode, playlistCode)
                .last("LIMIT 1")
        );
    }

    private UserMusicPlaylistEntity requireOwnedUserPlaylist(Long userId, String playlistCode) {
        String normalized = normalizePlaylistCode(playlistCode);
        UserMusicPlaylistEntity playlist = loadUserPlaylistByCode(normalized);
        if (playlist == null) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "Playlist not found");
        }
        if (!userId.equals(playlist.getUserId())) {
            throw new BusinessException(ErrorCode.FORBIDDEN, "No permission to modify this playlist");
        }
        return playlist;
    }

    private UserMusicPlaylistEntity ensureLikedPlaylist(Long userId) {
        UserMusicPlaylistEntity existing = userMusicPlaylistMapper.selectOne(
            new LambdaQueryWrapper<UserMusicPlaylistEntity>()
                .eq(UserMusicPlaylistEntity::getUserId, userId)
                .eq(UserMusicPlaylistEntity::getPlaylistType, PLAYLIST_TYPE_LIKED)
                .orderByAsc(UserMusicPlaylistEntity::getId)
                .last("LIMIT 1")
        );
        if (existing != null) {
            return existing;
        }

        UserMusicPlaylistEntity entity = new UserMusicPlaylistEntity();
        entity.setPlaylistCode("liked_u_" + userId);
        entity.setUserId(userId);
        entity.setPlaylistType(PLAYLIST_TYPE_LIKED);
        entity.setName("我喜欢的音乐");
        entity.setDescription("系统保留歌单");
        entity.setCoverUrl("");
        entity.setPublicFlag(false);
        entity.setSystemReservedFlag(true);
        entity.setSortNum(0);
        entity.setMetadataJson(writeJson(Map.of()));
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        try {
            userMusicPlaylistMapper.insert(entity);
            return entity;
        } catch (DuplicateKeyException duplicateKeyException) {
            UserMusicPlaylistEntity reloaded = userMusicPlaylistMapper.selectOne(
                new LambdaQueryWrapper<UserMusicPlaylistEntity>()
                    .eq(UserMusicPlaylistEntity::getUserId, userId)
                    .eq(UserMusicPlaylistEntity::getPlaylistType, PLAYLIST_TYPE_LIKED)
                    .orderByAsc(UserMusicPlaylistEntity::getId)
                    .last("LIMIT 1")
            );
            if (reloaded != null) {
                return reloaded;
            }
            throw duplicateKeyException;
        }
    }

    private int resolveNextUserPlaylistSort(Long userId) {
        UserMusicPlaylistEntity maxSort = userMusicPlaylistMapper.selectOne(
            new LambdaQueryWrapper<UserMusicPlaylistEntity>()
                .eq(UserMusicPlaylistEntity::getUserId, userId)
                .orderByDesc(UserMusicPlaylistEntity::getSortNum)
                .orderByDesc(UserMusicPlaylistEntity::getId)
                .last("LIMIT 1")
        );
        if (maxSort == null || maxSort.getSortNum() == null) {
            return 1;
        }
        return Math.max(0, maxSort.getSortNum()) + 1;
    }

    private int resolveNextPlaylistTrackSort(String playlistCode) {
        UserMusicPlaylistTrackEntity maxSort = userMusicPlaylistTrackMapper.selectOne(
            new LambdaQueryWrapper<UserMusicPlaylistTrackEntity>()
                .eq(UserMusicPlaylistTrackEntity::getPlaylistCode, playlistCode)
                .orderByDesc(UserMusicPlaylistTrackEntity::getSortNum)
                .orderByDesc(UserMusicPlaylistTrackEntity::getId)
                .last("LIMIT 1")
        );
        if (maxSort == null || maxSort.getSortNum() == null) {
            return 1;
        }
        return Math.max(0, maxSort.getSortNum()) + 1;
    }

    private boolean playlistCodeExists(String playlistCode) {
        if (DEFAULT_PLAYLIST_CODE.equals(playlistCode)) {
            return true;
        }
        Long count = userMusicPlaylistMapper.selectCount(
            new LambdaQueryWrapper<UserMusicPlaylistEntity>().eq(UserMusicPlaylistEntity::getPlaylistCode, playlistCode)
        );
        return count != null && count > 0;
    }

    private String generateCustomPlaylistCode(Long userId) {
        for (int i = 0; i < 6; i += 1) {
            String suffix = UUID.randomUUID().toString().replace("-", "").substring(0, 10);
            String code = ("upl_" + userId + "_" + suffix).toLowerCase(Locale.ROOT);
            if (!playlistCodeExists(code)) {
                return code;
            }
        }
        return ("upl_" + userId + "_" + System.currentTimeMillis()).toLowerCase(Locale.ROOT);
    }

    private MusicPlaylistProfileResponse loadDefaultPlaylistProfile() {
        MusicPlaylistProfileEntity entity = musicPlaylistProfileMapper.selectOne(
            new LambdaQueryWrapper<MusicPlaylistProfileEntity>()
                .eq(MusicPlaylistProfileEntity::getPlaylistCode, DEFAULT_PLAYLIST_CODE)
                .last("LIMIT 1")
        );
        if (entity == null) {
            return new MusicPlaylistProfileResponse(
                DEFAULT_PLAYLIST_CODE,
                "默认歌单",
                "全站共通默认歌单",
                ""
            );
        }
        return new MusicPlaylistProfileResponse(
            readString(entity.getPlaylistCode(), DEFAULT_PLAYLIST_CODE),
            readString(entity.getName(), "默认歌单"),
            readString(entity.getDescription(), ""),
            readString(entity.getCoverUrl(), "")
        );
    }

    private void upsertDefaultPlaylistProfile(AdminMusicPlaylistProfileUpsertRequest request) {
        String playlistCode = readString(request == null ? null : request.getPlaylistCode(), DEFAULT_PLAYLIST_CODE);
        if (!DEFAULT_PLAYLIST_CODE.equals(playlistCode)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "playlist_code must be default_public");
        }
        String name = readString(request == null ? null : request.getName(), "默认歌单");
        String description = readString(request == null ? null : request.getDescription(), "全站共通默认歌单");
        String cover = readString(request == null ? null : request.getCover(), "");
        validateHttpUrlIfPresent(cover, "cover");

        MusicPlaylistProfileEntity entity = musicPlaylistProfileMapper.selectOne(
            new LambdaQueryWrapper<MusicPlaylistProfileEntity>()
                .eq(MusicPlaylistProfileEntity::getPlaylistCode, playlistCode)
                .last("LIMIT 1")
        );

        if (entity == null) {
            entity = new MusicPlaylistProfileEntity();
            entity.setPlaylistCode(playlistCode);
            entity.setCreatedAt(LocalDateTime.now());
        }
        entity.setName(name);
        entity.setDescription(description);
        entity.setCoverUrl(cover);
        entity.setMetadataJson(writeJson(Map.of()));
        entity.setUpdatedAt(LocalDateTime.now());

        if (entity.getId() == null) {
            musicPlaylistProfileMapper.insert(entity);
        } else {
            musicPlaylistProfileMapper.updateById(entity);
        }
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

    private String resolveRelayFileName(MultipartFile file, AssetKindEnum assetKind, String contentType) {
        String original = readString(file.getOriginalFilename(), "");
        if (StringUtils.hasText(original) && original.contains(".")) {
            return original;
        }
        String extension = inferExtensionByContentType(contentType, assetKind);
        return "upload." + extension;
    }

    private String inferExtensionByContentType(String contentType, AssetKindEnum assetKind) {
        String normalized = readString(contentType, "").toLowerCase(Locale.ROOT);
        return switch (normalized) {
            case "image/jpeg" -> "jpg";
            case "image/webp" -> "webp";
            case "image/gif" -> "gif";
            case "image/apng" -> "apng";
            case "application/zip", "application/x-zip-compressed" -> "zip";
            case "audio/wav", "audio/x-wav" -> "wav";
            case "audio/ogg" -> "ogg";
            case "audio/flac" -> "flac";
            case "audio/aac" -> "aac";
            case "audio/mp4" -> "m4a";
            default -> assetKind == AssetKindEnum.AUDIO ? "mp3" : "png";
        };
    }

    private record TuneHubApiContext(String apiKey,
                                     String keySource,
                                     List<String> platformOrder) {
    }

    private record TuneHubVirtualPlaylistRef(String playlistCode,
                                             String provider,
                                             String sourceType,
                                             String sourceId) {
    }

    private static final class ArtistAggregate {
        private final String name;
        private int hitCount;
        private final Set<String> providers = new LinkedHashSet<>();

        private ArtistAggregate(String name) {
            this.name = name;
            this.hitCount = 0;
        }

        private String name() {
            return name;
        }

        private int hitCount() {
            return hitCount;
        }

        private Set<String> providers() {
            return providers;
        }
    }
}
