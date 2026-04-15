package io.github.shizuki.site.media.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
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
import io.github.shizuki.site.media.cache.MusicLibraryHomeCacheStore;
import io.github.shizuki.site.media.config.MediaStorageProperties;
import io.github.shizuki.site.media.config.MusicListenCacheProperties;
import io.github.shizuki.site.media.config.TuneHubMusicProperties;
import io.github.shizuki.site.media.integration.AsmrMusicProvider;
import io.github.shizuki.site.media.integration.NeteaseCookieProvider;
import io.github.shizuki.site.media.integration.SpotifyMusicProvider;
import io.github.shizuki.site.media.integration.TuneHubMusicProvider;
import io.github.shizuki.site.media.integration.UserMusicGateway;
import io.github.shizuki.site.media.request.AdminAssetUpdateRequest;
import io.github.shizuki.site.media.response.AdminAssetAuditResponse;
import io.github.shizuki.site.media.request.AdminMusicDefaultPlaylistBundleReplaceRequest;
import io.github.shizuki.site.media.request.AdminMusicPlaylistReplaceRequest;
import io.github.shizuki.site.media.request.AdminMusicPlaylistProfileUpsertRequest;
import io.github.shizuki.site.media.request.AdminMusicProviderGuideUpsertRequest;
import io.github.shizuki.site.media.request.AdminMusicProviderVisibilityUpdateRequest;
import io.github.shizuki.site.media.request.AdminMusicTrackUpsertRequest;
import io.github.shizuki.site.media.request.AssetCreateRequest;
import io.github.shizuki.site.media.response.AssetCreateResponse;
import io.github.shizuki.site.media.response.AssetDownloadResponse;
import io.github.shizuki.site.media.response.AssetReportResponse;
import io.github.shizuki.site.media.response.L2dValidationResponse;
import io.github.shizuki.site.media.response.MusicKeyGuideResponse;
import io.github.shizuki.site.media.response.MeMusicLibrarySidebarResponse;
import io.github.shizuki.site.media.request.MeMusicPlaylistCreateRequest;
import io.github.shizuki.site.media.request.MeMusicPlaylistTrackUpsertRequest;
import io.github.shizuki.site.media.request.MeMusicPlaylistUpdateRequest;
import io.github.shizuki.site.media.response.MusicPickQuotaResponse;
import io.github.shizuki.site.media.request.MusicPickRequest;
import io.github.shizuki.site.media.response.MusicPickResponse;
import io.github.shizuki.site.media.response.MusicProviderResponse;
import io.github.shizuki.site.media.response.MusicQuotaResponse;
import io.github.shizuki.site.media.request.MusicResolvePlaybackRequest;
import io.github.shizuki.site.media.response.MusicSearchArtistResponse;
import io.github.shizuki.site.media.response.MusicSearchResponse;
import io.github.shizuki.site.media.response.MusicSearchTrackResponse;
import io.github.shizuki.site.media.response.MusicTrackResponse;
import io.github.shizuki.site.media.response.MusicDefaultPlaylistBundleResponse;
import io.github.shizuki.site.media.response.MusicLibraryHomeResponse;
import io.github.shizuki.site.media.response.MusicPlaylistBundleResponse;
import io.github.shizuki.site.media.response.MusicPlaylistSummaryResponse;
import io.github.shizuki.site.media.response.MusicPlaylistProfileResponse;
import io.github.shizuki.site.media.response.MusicSourcePlaylistImportResponse;
import io.github.shizuki.site.media.response.PublicHomeRoleResponse;
import io.github.shizuki.site.media.response.SpotifyPreviewResponse;
import io.github.shizuki.site.media.response.SpotifyTrackResponse;
import io.github.shizuki.site.media.request.UploadPolicyRequest;
import io.github.shizuki.site.media.response.UploadPolicyResponse;
import io.github.shizuki.site.media.response.UploadRelayResponse;
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
import io.github.shizuki.site.media.util.TrackUrlExpiryPolicy;
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
import org.slf4j.MDC;
import org.springframework.beans.factory.annotation.Autowired;
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
    private static final Set<String> TUNEHUB_REAL_PLAYLIST_SEARCH_PLATFORMS = Set.of("netease", "kuwo");
    private static final Set<String> SUPPORTED_MUSIC_PROVIDERS = Set.of("tunehub", "spotify", "asmr");
    private static final Pattern VIRTUAL_TUNEHUB_PLAYLIST_CODE_PATTERN =
        Pattern.compile("^vh_tunehub_([a-z0-9_\\-]+)_([a-z0-9_\\-]+)_(.+)$");
    private static final Pattern VIRTUAL_ASMR_PLAYLIST_CODE_PATTERN = Pattern.compile("^vh_asmr_work_([0-9]+)$");
    private static final String LOG_EVENT_API_CONTEXT_START = "MUSIC_TUNEHUB_API_CONTEXT_RESOLVE";
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
    private static final String LOG_EVENT_DEFAULT_COLLECT_UPSERT_DONE = "MUSIC_DEFAULT_COLLECT_UPSERT_DONE";
    private static final String LOG_EVENT_DEFAULT_COLLECT_CLOUD_ENQUEUE_OK = "MUSIC_DEFAULT_COLLECT_CLOUD_ENQUEUE_OK";
    private static final String LOG_EVENT_DEFAULT_COLLECT_CLOUD_ENQUEUE_FAIL = "MUSIC_DEFAULT_COLLECT_CLOUD_ENQUEUE_FAIL";
    private static final String LOG_KEY_REQUEST_ID = "request_id";
    private static final String LOG_KEY_TRACE_ID = "trace_id";
    private static final String MUSIC_ERROR_CODE_SEARCH_API_KEY_MISSING = "MUSIC_SEARCH_API_KEY_MISSING";
    private static final String MUSIC_ERROR_CODE_SOURCE_ACCOUNT_REQUIRED = "MUSIC_SOURCE_ACCOUNT_REQUIRED";
    private static final String MUSIC_ERROR_CODE_SOURCE_PROVIDER_UNSUPPORTED = "MUSIC_SOURCE_PROVIDER_UNSUPPORTED";
    private static final String MUSIC_ERROR_CODE_SOURCE_IMPORT_PROVIDER_UNSUPPORTED =
        "MUSIC_SOURCE_IMPORT_PROVIDER_UNSUPPORTED";
    private static final String SOURCE_MODE_ACCOUNT_FIRST = "account_first";
    private static final String SOURCE_MODE_TUNEHUB_FIRST = "tunehub_first";
    private static final String SOURCE_MODE_ACCOUNT_ONLY = "account_only";
    private static final String SOURCE_MODE_TUNEHUB_ONLY = "tunehub_only";
    private static final List<String> SOURCE_PROVIDER_DEFAULT_ORDER = List.of("netease", "qqmusic", "kugou");
    private static final Set<String> SOURCE_ACCOUNT_SUPPORTED_PROVIDERS = Set.of("netease", "qqmusic", "kugou");
    private static final String SOURCE_ONLY_OBJECT_CODE = "__source_only__";
    private static final int TRACK_METADATA_JSON_MAX_LENGTH = 4096;
    private static final Set<String> TRACK_METADATA_ALLOWED_KEYS = Set.of(
        "album",
        "durationSec",
        "durationLabel",
        "provider",
        "playlistCode",
        "sourceScene",
        "intro",
        "description",
        "lyricTextAvailable",
        "coverSource"
    );

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
    private final NeteaseCookieProvider neteaseCookieProvider;
    private final TuneHubMusicProvider tuneHubMusicProvider;
    private final AsmrMusicProvider asmrMusicProvider;
    private final MusicTrackCacheUploadPublisher musicTrackCacheUploadPublisher;
    private final TuneHubMusicProperties tuneHubMusicProperties;
    private final MusicListenCacheProperties musicListenCacheProperties;
    private final ObjectMapper objectMapper;
    private final TransactionTemplate transactionTemplate;
    @Autowired(required = false)
    private MusicLibraryHomeCacheStore musicLibraryHomeCacheStore;

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
                            NeteaseCookieProvider neteaseCookieProvider,
                            TuneHubMusicProvider tuneHubMusicProvider,
                            AsmrMusicProvider asmrMusicProvider,
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
        this.neteaseCookieProvider = neteaseCookieProvider;
        this.tuneHubMusicProvider = tuneHubMusicProvider;
        this.asmrMusicProvider = asmrMusicProvider;
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
            if (!isUnlimitedQuota(total) && used >= total) {
                throw new BusinessException(ErrorCode.FORBIDDEN, "Music upload quota exhausted",
                    Map.of(
                        "music_error_code", "MUSIC_UPLOAD_QUOTA_EXHAUSTED",
                        "total", total,
                        "used", used,
                        "remaining", quotaRemaining(total, used)
                    ));
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
            if (!isUnlimitedQuota(total) && used >= total) {
                throw new BusinessException(ErrorCode.FORBIDDEN, "Music upload quota exhausted",
                    Map.of(
                        "music_error_code", "MUSIC_UPLOAD_QUOTA_EXHAUSTED",
                        "total", total,
                        "used", used,
                        "remaining", quotaRemaining(total, used)
                    ));
            }
            long next = used + Math.max(0L, file.getSize());
            if (!isUnlimitedQuota(total) && next > total) {
                throw new BusinessException(ErrorCode.FORBIDDEN, "Music upload quota exhausted",
                    Map.of(
                        "music_error_code", "MUSIC_UPLOAD_QUOTA_EXHAUSTED",
                        "total", total,
                        "used", used,
                        "remaining", quotaRemaining(total, used)
                    ));
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
            if (!isUnlimitedQuota(total) && next > total) {
                throw new BusinessException(ErrorCode.FORBIDDEN, "Music upload quota exhausted",
                    Map.of(
                        "music_error_code", "MUSIC_UPLOAD_QUOTA_EXHAUSTED",
                        "total", total,
                        "used", used,
                        "remaining", quotaRemaining(total, used)
                    ));
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
        if (musicLibraryHomeCacheStore != null && musicLibraryHomeCacheStore.isEnabled()) {
            MusicLibraryHomeResponse cached = musicLibraryHomeCacheStore.read();
            if (cached != null) {
                LOGGER.info(
                    "MUSIC_LIBRARY_HOME_CACHE_HIT playlists={} tracks={}",
                    cached.featuredPlaylists() == null ? 0 : cached.featuredPlaylists().size(),
                    cached.featuredTracks() == null ? 0 : cached.featuredTracks().size()
                );
                return cached;
            }
            LOGGER.info("MUSIC_LIBRARY_HOME_CACHE_MISS");
        }
        return rebuildMusicLibraryHomeCache();
    }

    public MusicLibraryHomeResponse rebuildMusicLibraryHomeCache() {
        MusicLibraryHomeResponse response = buildMusicLibraryHome();
        if (musicLibraryHomeCacheStore != null && musicLibraryHomeCacheStore.isEnabled()) {
            musicLibraryHomeCacheStore.write(response);
            LOGGER.info(
                "MUSIC_LIBRARY_HOME_CACHE_REFRESH_DONE playlists={} tracks={}",
                response.featuredPlaylists() == null ? 0 : response.featuredPlaylists().size(),
                response.featuredTracks() == null ? 0 : response.featuredTracks().size()
            );
        }
        return response;
    }

    private MusicLibraryHomeResponse buildMusicLibraryHome() {
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
        AsmrVirtualPlaylistRef asmrVirtualPlaylistRef = parseVirtualAsmrPlaylistCode(normalizedCode);
        if (asmrVirtualPlaylistRef != null) {
            return loadVirtualAsmrPlaylistBundle(asmrVirtualPlaylistRef);
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
        int playlistCollectLimit = safeLimit + 1;
        int trackCollectLimit = safeLimit + 1;
        Long userId = currentLoginUser() == null ? 0L : currentLoginUser().getUserId();
        String queryDigest = hashQueryFingerprint(normalizedQuery);
        String searchId = UUID.randomUUID().toString();
        String requestId = readString(MDC.get(LOG_KEY_REQUEST_ID), "-");
        String traceId = readString(MDC.get(LOG_KEY_TRACE_ID), "-");

        List<String> selectedProviders = resolveSearchProviders(providers, userId);
        boolean includePlaylists = "all".equals(normalizedType) || "playlist".equals(normalizedType);
        boolean includeTracks = "all".equals(normalizedType) || "track".equals(normalizedType) || "artist".equals(normalizedType);
        boolean includeArtists = "all".equals(normalizedType) || "artist".equals(normalizedType);
        long startMs = System.currentTimeMillis();

        LOGGER.info(
            "{} search_id={} request_id={} trace_id={} user_id={} type={} query_hash={} query_length={} providers={} page={} limit={} playlist_match={}",
            LOG_EVENT_SEARCH_STAGE_START,
            searchId,
            requestId,
            traceId,
            userId,
            normalizedType,
            queryDigest,
            normalizedQuery.length(),
            selectedProviders,
            safePage,
            safeLimit,
            includePlaylists ? "real" : "off"
        );
        LOGGER.info(
            "{} search_id={} request_id={} trace_id={} user_id={} type={} query_hash={} query_length={} providers={} page={} limit={}",
            LOG_EVENT_SEARCH_START,
            searchId,
            requestId,
            traceId,
            userId,
            normalizedType,
            queryDigest,
            normalizedQuery.length(),
            selectedProviders,
            safePage,
            safeLimit
        );

        List<MusicPlaylistSummaryResponse> playlists = new ArrayList<>();
        List<MusicSearchTrackResponse> tracks = new ArrayList<>();
        Set<String> playlistCodes = new LinkedHashSet<>();
        Set<String> trackKeys = new LinkedHashSet<>();
        Set<String> failedProviders = new LinkedHashSet<>();
        Set<String> missingApiKeyProviders = new LinkedHashSet<>();

        TuneHubApiContext apiContext = resolveTuneHubApiContext(false);
        SearchSourcePolicy sourcePolicy = resolveSearchSourcePolicy(userId);
        if (sourcePolicy.accountOnly()) {
            boolean hasBoundProvider = selectedProviders.stream()
                .filter(TUNEHUB_PLAYLIST_PLATFORMS::contains)
                .anyMatch(sourcePolicy.boundProviders()::contains);
            if (!hasBoundProvider && selectedProviders.stream().anyMatch(TUNEHUB_PLAYLIST_PLATFORMS::contains)) {
                throw new BusinessException(
                    ErrorCode.FORBIDDEN,
                    "No bound source account for current mode",
                    Map.of(
                        "music_error_code", MUSIC_ERROR_CODE_SOURCE_ACCOUNT_REQUIRED,
                        "mode", sourcePolicy.mode(),
                        "providers", selectedProviders,
                        "request_id", requestId,
                        "trace_id", traceId
                    )
                );
            }
        }
        if (!StringUtils.hasText(apiContext.apiKey())) {
            for (String provider : selectedProviders) {
                if (TUNEHUB_PLAYLIST_PLATFORMS.contains(provider)) {
                    missingApiKeyProviders.add(provider);
                }
            }
            if (!missingApiKeyProviders.isEmpty() && missingApiKeyProviders.size() == selectedProviders.size()) {
                throw new BusinessException(
                    ErrorCode.FORBIDDEN,
                    "TuneHub API key missing",
                    Map.of(
                        "music_error_code", MUSIC_ERROR_CODE_SEARCH_API_KEY_MISSING,
                        "providers", new ArrayList<>(missingApiKeyProviders),
                        "request_id", requestId,
                        "trace_id", traceId
                    )
                );
            }
        }

        for (String provider : selectedProviders) {
            long providerStartMs = System.currentTimeMillis();
            int providerTrackMapped = 0;
            int providerRowCount = 0;
            int providerDedupeDropped = 0;
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
                    providerRowCount = items.size();
                    providerDedupeDropped = Math.max(0, providerRowCount - mappedCount);
                    LOGGER.info(
                        "{} search_id={} request_id={} trace_id={} user_id={} type={} query_hash={} provider={} stage=track_fetch result=ok reason=- duration_ms={} row_count={} mapped_count={} dedupe_dropped={} total_track_count={} partial={}",
                        LOG_EVENT_SEARCH_PROVIDER_RESULT,
                        searchId,
                        requestId,
                        traceId,
                        userId,
                        normalizedType,
                        queryDigest,
                        "spotify",
                        Math.max(1L, System.currentTimeMillis() - providerStartMs),
                        providerRowCount,
                        mappedCount,
                        providerDedupeDropped,
                        tracks.size(),
                        false
                    );
                } catch (Exception ex) {
                    failedProviders.add("spotify");
                    LOGGER.warn(
                        "{} search_id={} request_id={} trace_id={} user_id={} type={} query_hash={} provider={} stage=track_fetch result=fail reason={} duration_ms={} row_count={} mapped_count={} dedupe_dropped={} partial=true",
                        LOG_EVENT_SEARCH_PROVIDER_FAIL,
                        searchId,
                        requestId,
                        traceId,
                        userId,
                        normalizedType,
                        queryDigest,
                        "spotify",
                        sanitizeLogMessage(readString(ex.getMessage(), "unknown_error")),
                        Math.max(1L, System.currentTimeMillis() - providerStartMs),
                        providerRowCount,
                        providerTrackMapped,
                        providerDedupeDropped
                    );
                } finally {
                    LOGGER.info(
                        "{} search_id={} request_id={} trace_id={} user_id={} type={} query_hash={} provider={} stage=provider_done result={} reason={} duration_ms={} row_count={} mapped_count={} dedupe_dropped={} partial={}",
                        LOG_EVENT_SEARCH_STAGE_PROVIDER_FETCH_DONE,
                        searchId,
                        requestId,
                        traceId,
                        userId,
                        normalizedType,
                        queryDigest,
                        "spotify",
                        failedProviders.contains("spotify") ? "fail" : "ok",
                        failedProviders.contains("spotify") ? "provider_error" : "-",
                        Math.max(1L, System.currentTimeMillis() - providerStartMs),
                        providerRowCount,
                        providerTrackMapped,
                        providerDedupeDropped,
                        failedProviders.contains("spotify")
                    );
                }
                continue;
            }

            if ("asmr".equals(provider)) {
                if (!includeTracks && !includePlaylists) {
                    continue;
                }
                int playlistMatchedCount = 0;
                try {
                    AsmrMusicProvider.SearchResult searchResult = asmrMusicProvider.searchWorks(normalizedQuery, safePage, safeLimit);
                    List<AsmrMusicProvider.WorkSummary> works = searchResult.works();
                    providerRowCount = works == null ? 0 : works.size();

                    if (includeTracks && tracks.size() < trackCollectLimit) {
                        int mappedCount = 0;
                        for (AsmrMusicProvider.WorkSummary item : works) {
                            String trackId = String.valueOf(item.id());
                            if (!StringUtils.hasText(trackId)) {
                                continue;
                            }
                            String dedupeKey = provider + ":" + trackId;
                            if (!trackKeys.add(dedupeKey)) {
                                continue;
                            }
                            tracks.add(new MusicSearchTrackResponse(
                                trackId,
                                "asmr",
                                readString(item.title(), ""),
                                readString(item.artist(), ""),
                                "",
                                readString(item.cover(), ""),
                                item.durationSec()
                            ));
                            mappedCount += 1;
                            if (tracks.size() >= trackCollectLimit) {
                                break;
                            }
                        }
                        providerTrackMapped = mappedCount;
                        providerDedupeDropped = Math.max(0, providerRowCount - mappedCount);
                    }

                    if (includePlaylists && playlists.size() < playlistCollectLimit) {
                        for (AsmrMusicProvider.WorkSummary item : works) {
                            String playlistCode = buildVirtualAsmrWorkPlaylistCode(item.id());
                            if (!StringUtils.hasText(playlistCode) || !playlistCodes.add(playlistCode)) {
                                continue;
                            }
                            playlists.add(new MusicPlaylistSummaryResponse(
                                playlistCode,
                                readString(item.title(), "ASMR 作品"),
                                "ASMR 作品歌单",
                                readString(item.cover(), ""),
                                PLAYLIST_TYPE_CUSTOM,
                                0L,
                                true,
                                0,
                                "asmr"
                            ));
                            playlistMatchedCount += 1;
                            if (playlists.size() >= playlistCollectLimit) {
                                break;
                            }
                        }
                    }

                    LOGGER.info(
                        "{} search_id={} request_id={} trace_id={} user_id={} type={} query_hash={} provider={} stage=track_fetch result=ok reason=- duration_ms={} row_count={} mapped_count={} dedupe_dropped={} total_track_count={} partial={}",
                        LOG_EVENT_SEARCH_PROVIDER_RESULT,
                        searchId,
                        requestId,
                        traceId,
                        userId,
                        normalizedType,
                        queryDigest,
                        provider,
                        Math.max(1L, System.currentTimeMillis() - providerStartMs),
                        providerRowCount,
                        providerTrackMapped,
                        providerDedupeDropped,
                        tracks.size(),
                        false
                    );
                    LOGGER.info(
                        "{} search_id={} request_id={} trace_id={} user_id={} type={} query_hash={} provider={} stage=playlist_fetch result=ok strategy={} matched_count={} duration_ms={} partial={}",
                        LOG_EVENT_SEARCH_STAGE_PLAYLIST_MATCH_DONE,
                        searchId,
                        requestId,
                        traceId,
                        userId,
                        normalizedType,
                        queryDigest,
                        provider,
                        "work_virtual",
                        playlistMatchedCount,
                        Math.max(1L, System.currentTimeMillis() - providerStartMs),
                        false
                    );
                } catch (Exception ex) {
                    failedProviders.add(provider);
                    LOGGER.warn(
                        "{} search_id={} request_id={} trace_id={} user_id={} type={} query_hash={} provider={} stage=track_fetch result=fail reason={} duration_ms={} row_count={} mapped_count={} dedupe_dropped={} partial=true",
                        LOG_EVENT_SEARCH_PROVIDER_FAIL,
                        searchId,
                        requestId,
                        traceId,
                        userId,
                        normalizedType,
                        queryDigest,
                        provider,
                        sanitizeLogMessage(readString(ex.getMessage(), "unknown_error")),
                        Math.max(1L, System.currentTimeMillis() - providerStartMs),
                        providerRowCount,
                        providerTrackMapped,
                        providerDedupeDropped
                    );
                } finally {
                    LOGGER.info(
                        "{} search_id={} request_id={} trace_id={} user_id={} type={} query_hash={} provider={} stage=provider_done result={} reason={} duration_ms={} row_count={} mapped_count={} dedupe_dropped={} partial={}",
                        LOG_EVENT_SEARCH_STAGE_PROVIDER_FETCH_DONE,
                        searchId,
                        requestId,
                        traceId,
                        userId,
                        normalizedType,
                        queryDigest,
                        provider,
                        failedProviders.contains(provider) ? "fail" : "ok",
                        failedProviders.contains(provider) ? "provider_error" : "-",
                        Math.max(1L, System.currentTimeMillis() - providerStartMs),
                        providerRowCount,
                        providerTrackMapped,
                        providerDedupeDropped,
                        failedProviders.contains(provider)
                    );
                }
                continue;
            }

            if (!TUNEHUB_PLAYLIST_PLATFORMS.contains(provider)) {
                continue;
            }

            if (missingApiKeyProviders.contains(provider)) {
                failedProviders.add(provider);
                LOGGER.info(
                    "{} search_id={} request_id={} trace_id={} user_id={} type={} query_hash={} provider={} stage=provider_done result=fail reason=api_key_missing duration_ms={} row_count=0 mapped_count=0 dedupe_dropped=0 partial=true",
                    LOG_EVENT_SEARCH_STAGE_PROVIDER_FETCH_DONE,
                    searchId,
                    requestId,
                    traceId,
                    userId,
                    normalizedType,
                    queryDigest,
                    provider,
                    Math.max(1L, System.currentTimeMillis() - providerStartMs)
                );
                continue;
            }

            if (sourcePolicy.accountOnly() && !sourcePolicy.boundProviders().contains(provider)) {
                failedProviders.add(provider);
                LOGGER.info(
                    "{} search_id={} request_id={} trace_id={} user_id={} type={} query_hash={} provider={} stage=provider_done result=fail reason=account_not_bound duration_ms={} row_count=0 mapped_count={} dedupe_dropped=0 partial=true",
                    LOG_EVENT_SEARCH_STAGE_PROVIDER_FETCH_DONE,
                    searchId,
                    requestId,
                    traceId,
                    userId,
                    normalizedType,
                    queryDigest,
                    provider,
                    Math.max(1L, System.currentTimeMillis() - providerStartMs),
                    providerTrackMapped
                );
                continue;
            }

            boolean shouldProbeTracks = includeTracks && tracks.size() < trackCollectLimit;
            if (shouldProbeTracks) {
                long trackFetchStartMs = System.currentTimeMillis();
                try {
                    List<TuneHubMusicProvider.SearchTrackResult> searchItems = tuneHubMusicProvider.searchTracks(
                        apiContext.apiKey(),
                        provider,
                        normalizedQuery,
                        safePage,
                        safeLimit
                    );
                    providerRowCount = searchItems.size();
                    int mappedCount = 0;
                    for (TuneHubMusicProvider.SearchTrackResult item : searchItems) {
                        String trackId = readString(item.trackId(), "");
                        if (!StringUtils.hasText(trackId)) {
                            continue;
                        }
                        if (includeTracks && tracks.size() < trackCollectLimit) {
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
                            if (tracks.size() >= trackCollectLimit) {
                                break;
                            }
                            continue;
                        }
                    }
                    providerTrackMapped = mappedCount;
                    providerDedupeDropped = Math.max(0, providerRowCount - mappedCount);
                    LOGGER.info(
                        "{} search_id={} request_id={} trace_id={} user_id={} type={} query_hash={} provider={} stage=track_fetch result=ok reason=- duration_ms={} row_count={} mapped_count={} dedupe_dropped={} total_track_count={} partial={}",
                        LOG_EVENT_SEARCH_PROVIDER_RESULT,
                        searchId,
                        requestId,
                        traceId,
                        userId,
                        normalizedType,
                        queryDigest,
                        provider,
                        Math.max(1L, System.currentTimeMillis() - trackFetchStartMs),
                        providerRowCount,
                        mappedCount,
                        providerDedupeDropped,
                        tracks.size(),
                        false
                    );
                } catch (Exception ex) {
                    failedProviders.add(provider);
                    LOGGER.warn(
                        "{} search_id={} request_id={} trace_id={} user_id={} type={} query_hash={} provider={} stage=track_fetch result=fail reason={} duration_ms={} row_count={} mapped_count={} dedupe_dropped={} partial=true",
                        LOG_EVENT_SEARCH_PROVIDER_FAIL,
                        searchId,
                        requestId,
                        traceId,
                        userId,
                        normalizedType,
                        queryDigest,
                        provider,
                        sanitizeLogMessage(readString(ex.getMessage(), "unknown_error")),
                        Math.max(1L, System.currentTimeMillis() - trackFetchStartMs),
                        providerRowCount,
                        providerTrackMapped,
                        providerDedupeDropped
                    );
                } finally {
                    LOGGER.info(
                        "{} search_id={} request_id={} trace_id={} user_id={} type={} query_hash={} provider={} stage={} result={} reason={} duration_ms={} row_count={} mapped_count={} dedupe_dropped={} partial={}",
                        LOG_EVENT_SEARCH_STAGE_PROVIDER_FETCH_DONE,
                        searchId,
                        requestId,
                        traceId,
                        userId,
                        normalizedType,
                        queryDigest,
                        provider,
                        "track_fetch",
                        failedProviders.contains(provider) ? "fail" : "ok",
                        failedProviders.contains(provider) ? "track_fetch_error" : "-",
                        Math.max(1L, System.currentTimeMillis() - trackFetchStartMs),
                        providerRowCount,
                        providerTrackMapped,
                        providerDedupeDropped,
                        failedProviders.contains(provider)
                    );
                }
            }

            if (includePlaylists && TUNEHUB_REAL_PLAYLIST_SEARCH_PLATFORMS.contains(provider) && playlists.size() < playlistCollectLimit) {
                long playlistSearchStartMs = System.currentTimeMillis();
                int playlistMatchedCount = 0;
                try {
                    List<TuneHubMusicProvider.VirtualPlaylistSummary> searchPlaylists = tuneHubMusicProvider.searchPlaylists(
                        apiContext.apiKey(),
                        provider,
                        normalizedQuery,
                        safePage,
                        safeLimit
                    );
                    for (TuneHubMusicProvider.VirtualPlaylistSummary item : searchPlaylists) {
                        String code = readString(item.playlistCode(), "");
                        if (!StringUtils.hasText(code) || !playlistCodes.add(code)) {
                            continue;
                        }
                        playlists.add(new MusicPlaylistSummaryResponse(
                            code,
                            readString(item.name(), resolveProviderDisplayName(provider) + " 歌单"),
                            readString(item.description(), ""),
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
                        "{} search_id={} request_id={} trace_id={} user_id={} type={} query_hash={} provider={} stage=playlist_fetch result=fail reason={} duration_ms={} row_count=0 mapped_count=0 dedupe_dropped=0 partial=true",
                        LOG_EVENT_SEARCH_PROVIDER_FAIL,
                        searchId,
                        requestId,
                        traceId,
                        userId,
                        normalizedType,
                        queryDigest,
                        provider,
                        sanitizeLogMessage(readString(ex.getMessage(), "unknown_error")),
                        Math.max(1L, System.currentTimeMillis() - playlistSearchStartMs)
                    );
                } finally {
                    LOGGER.info(
                        "{} search_id={} request_id={} trace_id={} user_id={} type={} query_hash={} provider={} stage=playlist_fetch result={} strategy={} matched_count={} duration_ms={} partial={}",
                        LOG_EVENT_SEARCH_STAGE_PLAYLIST_MATCH_DONE,
                        searchId,
                        requestId,
                        traceId,
                        userId,
                        normalizedType,
                        queryDigest,
                        provider,
                        failedProviders.contains(provider) ? "fail" : "ok",
                        "real",
                        playlistMatchedCount,
                        Math.max(1L, System.currentTimeMillis() - playlistSearchStartMs),
                        failedProviders.contains(provider)
                    );
                }
            }

            LOGGER.info(
                "{} search_id={} request_id={} trace_id={} user_id={} type={} query_hash={} provider={} stage=provider_done result={} reason={} duration_ms={} row_count={} mapped_count={} dedupe_dropped={} partial={}",
                LOG_EVENT_SEARCH_STAGE_PROVIDER_FETCH_DONE,
                searchId,
                requestId,
                traceId,
                userId,
                normalizedType,
                queryDigest,
                provider,
                failedProviders.contains(provider) ? "fail" : "ok",
                failedProviders.contains(provider) ? "provider_error" : "-",
                Math.max(1L, System.currentTimeMillis() - providerStartMs),
                providerRowCount,
                providerTrackMapped,
                providerDedupeDropped,
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
            hasMorePlaylists = playlists.size() > safeLimit;
            if (hasMorePlaylists) {
                playlists = new ArrayList<>(playlists.subList(0, safeLimit));
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
            "{} search_id={} request_id={} trace_id={} user_id={} type={} query_hash={} providers={} result={} reason={} playlist_count={} track_count={} artist_count={} partial={} cost_ms={}",
            LOG_EVENT_SEARCH_DONE,
            searchId,
            requestId,
            traceId,
            userId,
            normalizedType,
            queryDigest,
            selectedProviders,
            partial ? "partial" : "ok",
            partial ? "provider_partial_failure" : "-",
            playlists.size(),
            tracks.size(),
            artists.size(),
            partial,
            costMs
        );
        LOGGER.info(
            "{} search_id={} request_id={} trace_id={} user_id={} type={} query_hash={} partial={} cost_ms={} playlist_count={} track_count={} artist_count={}",
            LOG_EVENT_SEARCH_STAGE_DONE,
            searchId,
            requestId,
            traceId,
            userId,
            normalizedType,
            queryDigest,
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
        String provider = normalizePlaybackProvider(readString(request == null ? null : request.getProvider(), ""));
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
        Long userId = currentLoginUser() == null ? 0L : currentLoginUser().getUserId();
        SearchSourcePolicy sourcePolicy = resolveSearchSourcePolicy(userId);
        MusicListenCacheProperties.StorageMode storageMode = musicListenCacheProperties.resolveStorageMode();
        MusicTrackCacheEntity cache = loadTrackCache(provider, trackId);
        String cachedSourceAudio = readString(cache == null ? null : cache.getSourceUrl(), "");
        if (cache != null && canReuseCachedSourceAudio(cachedSourceAudio)) {
            touchTrackCacheLastListen(cache);
            String lyricText = "";
            String translationLyricText = "";
            String furiganaLyricText = "";
            String resolvedCover = resolvePlaybackCover(
                readString(request == null ? null : request.getCover(), ""),
                "",
                ""
            );
            if (resolveLyric) {
                if ("asmr".equals(provider)) {
                    try {
                        AsmrPlaybackTrackResult asmrTrack = resolveAsmrPlaybackTrackTarget(
                            trackId,
                            readString(request == null ? null : request.getTitle(), ""),
                            readString(request == null ? null : request.getArtist(), ""),
                            readString(request == null ? null : request.getCover(), "")
                        );
                        lyricText = asmrMusicProvider.loadLyricText(asmrTrack.lyricUrl());
                        resolvedCover = resolvePlaybackCover(resolvedCover, asmrTrack.cover(), "");
                        LOGGER.info("MUSIC_LYRIC_FALLBACK_RESOLVED provider={} trackId={} success=true", provider, trackId);
                    } catch (Exception ex) {
                        LOGGER.warn("MUSIC_RESOLVE_PLAYBACK_LYRIC_REFETCH_FAIL provider={} trackId={} reason={}",
                            provider,
                            trackId,
                            sanitizeLogMessage(readString(ex.getMessage(), "unknown_error")));
                        LOGGER.info("MUSIC_LYRIC_FALLBACK_RESOLVED provider={} trackId={} success=false", provider, trackId);
                    }
                } else {
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
                            translationLyricText = readString(parsedLyric.translationLyricText(), "");
                            furiganaLyricText = readString(parsedLyric.furiganaLyricText(), "");
                            resolvedCover = resolvePlaybackCover(resolvedCover, parsedLyric.cover(), "");
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
            }
            LOGGER.info(
                "{} provider={} trackId={} source=cache_source lyricSource=cache_source lyricResolved={} lyricTextLength={} durationMs={}",
                LOG_EVENT_RESOLVE_STAGE_DONE,
                provider,
                trackId,
                StringUtils.hasText(lyricText),
                lyricText == null ? 0 : lyricText.length(),
                Math.max(1L, System.currentTimeMillis() - startMs)
            );
            return new MusicTrackResponse(
                trackId,
                provider,
                readString(request == null ? null : request.getTitle(), trackId),
                readString(request == null ? null : request.getArtist(), ""),
                resolvedCover,
                cachedSourceAudio,
                "",
                0,
                true,
                lyricText,
                buildPlaybackMetadata(
                    Map.of("cacheSource", "source_url"),
                    lyricText,
                    translationLyricText,
                    furiganaLyricText
                )
            );
        }
        if (hasOssObjectCache(cache)) {
            touchTrackCacheLastListen(cache);
            String lyricText = "";
            String translationLyricText = "";
            String furiganaLyricText = "";
            String resolvedCover = resolvePlaybackCover(
                readString(request == null ? null : request.getCover(), ""),
                "",
                ""
            );
            if (resolveLyric) {
                if ("asmr".equals(provider)) {
                    try {
                        AsmrPlaybackTrackResult asmrTrack = resolveAsmrPlaybackTrackTarget(
                            trackId,
                            readString(request == null ? null : request.getTitle(), ""),
                            readString(request == null ? null : request.getArtist(), ""),
                            readString(request == null ? null : request.getCover(), "")
                        );
                        lyricText = asmrMusicProvider.loadLyricText(asmrTrack.lyricUrl());
                        resolvedCover = resolvePlaybackCover(resolvedCover, asmrTrack.cover(), "");
                        LOGGER.info("MUSIC_LYRIC_FALLBACK_RESOLVED provider={} trackId={} success=true", provider, trackId);
                    } catch (Exception ex) {
                        LOGGER.warn("MUSIC_RESOLVE_PLAYBACK_LYRIC_REFETCH_FAIL provider={} trackId={} reason={}",
                            provider,
                            trackId,
                            sanitizeLogMessage(readString(ex.getMessage(), "unknown_error")));
                        LOGGER.info("MUSIC_LYRIC_FALLBACK_RESOLVED provider={} trackId={} success=false", provider, trackId);
                    }
                } else {
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
                            translationLyricText = readString(parsedLyric.translationLyricText(), "");
                            furiganaLyricText = readString(parsedLyric.furiganaLyricText(), "");
                            resolvedCover = resolvePlaybackCover(resolvedCover, parsedLyric.cover(), "");
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
            }
            LOGGER.info(
                "{} provider={} trackId={} source=cache lyricSource=oss_cache lyricResolved={} lyricTextLength={} durationMs={}",
                LOG_EVENT_RESOLVE_STAGE_DONE,
                provider,
                trackId,
                StringUtils.hasText(lyricText),
                lyricText == null ? 0 : lyricText.length(),
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
                lyricText,
                buildPlaybackMetadata(
                    Map.of("cacheSource", "oss"),
                    lyricText,
                    translationLyricText,
                    furiganaLyricText
                )
            );
        }

        if ("asmr".equals(provider)) {
            return resolvePlaybackViaAsmr(request, trackId, storageMode, resolveLyric, userId, startMs);
        }

        TuneHubApiContext apiContext = resolveTuneHubApiContext();
        boolean canUseNeteaseAccount = canUseNeteaseAccountSource(userId, sourcePolicy, provider);
        boolean hasBoundAccountSource = sourcePolicy.boundProviders().contains(provider);
        boolean accountFirst = SOURCE_MODE_ACCOUNT_FIRST.equals(sourcePolicy.mode());
        boolean accountOnly = SOURCE_MODE_ACCOUNT_ONLY.equals(sourcePolicy.mode());
        if ((accountFirst || accountOnly) && canUseNeteaseAccount) {
            try {
                return resolvePlaybackViaNeteaseAccount(request, trackId, storageMode, resolveLyric, userId, startMs, false);
            } catch (Exception ex) {
                if (accountOnly) {
                    throw ex;
                }
                LOGGER.warn(
                    "MUSIC_RESOLVE_PLAYBACK_ACCOUNT_FAIL provider={} trackId={} mode={} reason={}",
                    provider,
                    trackId,
                    sourcePolicy.mode(),
                    sanitizeLogMessage(readString(ex.getMessage(), "unknown_error"))
                );
            }
        }

        if (accountOnly && !hasBoundAccountSource) {
            throw new BusinessException(
                ErrorCode.FORBIDDEN,
                "No bound account source for current provider",
                Map.of(
                    "music_error_code", MUSIC_ERROR_CODE_SOURCE_ACCOUNT_REQUIRED,
                    "provider", provider,
                    "mode", sourcePolicy.mode()
                )
            );
        }
        if (accountOnly && hasBoundAccountSource && !canUseNeteaseAccount) {
            throw new BusinessException(
                ErrorCode.FORBIDDEN,
                "Current account source playback is not supported yet",
                Map.of(
                    "music_error_code", MUSIC_ERROR_CODE_SOURCE_PROVIDER_UNSUPPORTED,
                    "provider", provider,
                    "mode", sourcePolicy.mode()
                )
            );
        }
        if (!StringUtils.hasText(apiContext.apiKey())) {
            if (canUseNeteaseAccount) {
                return resolvePlaybackViaNeteaseAccount(request, trackId, storageMode, resolveLyric, userId, startMs, true);
            }
            throw new BusinessException(
                ErrorCode.FORBIDDEN,
                "TuneHub API key missing",
                Map.of("music_error_code", MUSIC_ERROR_CODE_SEARCH_API_KEY_MISSING, "provider", provider)
            );
        }

        ParseAttemptResult parseAttempt;
        try {
            parseAttempt = parseSingleTrackWithRetry(
                apiContext.apiKey(),
                provider,
                trackId,
                tuneHubMusicProperties.getDefaultQuality(),
                2
            );
        } catch (Exception ex) {
            if (canUseNeteaseAccount) {
                return resolvePlaybackViaNeteaseAccount(request, trackId, storageMode, resolveLyric, userId, startMs, true);
            }
            throw ex;
        }
        TuneHubMusicProvider.ParseTrackResult parsed = parseAttempt.result();
        int retryCount = parseAttempt.retryCount();
        long parseDoneMs = System.currentTimeMillis();

        String resolvedAudio = readString(parsed.audioUrl(), "");
        if (!StringUtils.hasText(resolvedAudio)) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "Track parse failed");
        }
        validateHttpUrlIfPresent(resolvedAudio, "audio");

        boolean shouldCache = musicListenCacheProperties.isEnabled()
            && (!musicListenCacheProperties.isLoginOnly() || userId > 0);
        boolean cacheEnqueued = false;
        if (shouldCache) {
            upsertTrackSourceCache(provider, trackId, resolvedAudio);
            if (shouldEnqueueTrackToOss(storageMode, resolvedAudio)) {
                cacheEnqueued = musicTrackCacheUploadPublisher.publish(
                    provider,
                    trackId,
                    resolvedAudio,
                    readString(request == null ? null : request.getTitle(), ""),
                    readString(request == null ? null : request.getArtist(), "")
                );
            }
        }
        String resolvedCover = resolvePlaybackCover(
            readString(request == null ? null : request.getCover(), ""),
            readString(parsed.cover(), ""),
            ""
        );
        String lyricText = readString(parsed.lyricText(), "");
        String translationLyricText = readString(parsed.translationLyricText(), "");
        String furiganaLyricText = readString(parsed.furiganaLyricText(), "");
        LOGGER.info("MUSIC_COVER_FALLBACK_RESOLVED provider={} trackId={} success={}",
            provider,
            trackId,
            StringUtils.hasText(resolvedCover));
        LOGGER.info("MUSIC_LYRIC_FALLBACK_RESOLVED provider={} trackId={} success={}",
            provider,
            trackId,
            StringUtils.hasText(lyricText));
        LOGGER.info(
            "{} provider={} trackId={} source=parse lyricSource=parse parseMs={} cacheEnqueued={} lyricTextLength={} durationMs={}",
            LOG_EVENT_RESOLVE_STAGE_DONE,
            provider,
            trackId,
            Math.max(1L, parseDoneMs - startMs),
            cacheEnqueued,
            lyricText == null ? 0 : lyricText.length(),
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
            lyricText,
            buildPlaybackMetadata(
                Map.of(
                    "cacheMode", storageMode.code(),
                    "resolved_source", "tunehub",
                    "fallback_applied", false,
                    "retry_count", retryCount
                ),
                lyricText,
                translationLyricText,
                furiganaLyricText
            )
        );
    }

    private MusicTrackResponse resolvePlaybackViaAsmr(MusicResolvePlaybackRequest request,
                                                      String trackId,
                                                      MusicListenCacheProperties.StorageMode storageMode,
                                                      boolean resolveLyric,
                                                      Long userId,
                                                      long startMs) {
        AsmrPlaybackTrackResult asmrTrack = resolveAsmrPlaybackTrackTarget(
            trackId,
            readString(request == null ? null : request.getTitle(), ""),
            readString(request == null ? null : request.getArtist(), ""),
            readString(request == null ? null : request.getCover(), "")
        );
        String resolvedAudio = readString(asmrTrack.audioUrl(), "");
        if (!StringUtils.hasText(resolvedAudio)) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "ASMR track stream unavailable");
        }
        validateHttpUrlIfPresent(resolvedAudio, "audio");

        boolean shouldCache = musicListenCacheProperties.isEnabled()
            && (!musicListenCacheProperties.isLoginOnly() || userId > 0);
        boolean cacheEnqueued = false;
        if (shouldCache) {
            upsertTrackSourceCache("asmr", trackId, resolvedAudio);
            if (shouldEnqueueTrackToOss(storageMode, resolvedAudio)) {
                cacheEnqueued = musicTrackCacheUploadPublisher.publish(
                    "asmr",
                    trackId,
                    resolvedAudio,
                    readString(asmrTrack.title(), ""),
                    readString(asmrTrack.artist(), "")
                );
            }
        }

        String lyricText = "";
        String translationLyricText = "";
        String furiganaLyricText = "";
        if (resolveLyric && StringUtils.hasText(readString(asmrTrack.lyricUrl(), ""))) {
            lyricText = readString(asmrMusicProvider.loadLyricText(asmrTrack.lyricUrl()), "");
        }

        Map<String, Object> metadata = new LinkedHashMap<>();
        metadata.put("cacheMode", storageMode.code());
        metadata.put("resolved_source", "asmr");
        metadata.put("provider", "asmr");
        metadata.put("sourceScene", "asmr_playback");
        metadata.put("lyricTextAvailable", StringUtils.hasText(lyricText));
        if (asmrTrack.workId() > 0L) {
            metadata.put("workId", asmrTrack.workId());
        }
        if (StringUtils.hasText(readString(asmrTrack.hash(), ""))) {
            metadata.put("asmrHash", asmrTrack.hash());
        }
        if (asmrTrack.durationSec() != null) {
            metadata.put("durationSec", asmrTrack.durationSec());
        }
        if (StringUtils.hasText(readString(asmrTrack.sourceId(), ""))) {
            metadata.put("sourceId", asmrTrack.sourceId());
        }
        if (StringUtils.hasText(readString(asmrTrack.sourceUrl(), ""))) {
            metadata.put("sourceUrl", asmrTrack.sourceUrl());
        }
        metadata.put("cacheEnqueued", cacheEnqueued);

        LOGGER.info("MUSIC_COVER_FALLBACK_RESOLVED provider=asmr trackId={} success={}",
            trackId,
            StringUtils.hasText(readString(asmrTrack.cover(), "")));
        LOGGER.info("MUSIC_LYRIC_FALLBACK_RESOLVED provider=asmr trackId={} success={}",
            trackId,
            StringUtils.hasText(lyricText));
        LOGGER.info(
            "{} provider=asmr trackId={} source=parse lyricSource=asmr parseMs={} cacheEnqueued={} lyricTextLength={} durationMs={}",
            LOG_EVENT_RESOLVE_STAGE_DONE,
            trackId,
            Math.max(1L, System.currentTimeMillis() - startMs),
            cacheEnqueued,
            lyricText.length(),
            Math.max(1L, System.currentTimeMillis() - startMs)
        );

        return new MusicTrackResponse(
            trackId,
            "asmr",
            readString(asmrTrack.title(), trackId),
            readString(asmrTrack.artist(), ""),
            readString(asmrTrack.cover(), ""),
            resolvedAudio,
            "",
            0,
            true,
            lyricText,
            buildPlaybackMetadata(
                metadata,
                lyricText,
                translationLyricText,
                furiganaLyricText
            )
        );
    }

    private AsmrPlaybackTrackResult resolveAsmrPlaybackTrackTarget(String trackId,
                                                                   String titleHint,
                                                                   String artistHint,
                                                                   String coverHint) {
        AsmrPlaybackTrackRef ref = parseAsmrPlaybackTrackRef(trackId);
        String normalizedTitleHint = readString(titleHint, "");
        String normalizedArtistHint = readString(artistHint, "");
        String normalizedCoverHint = readString(coverHint, "");

        if (ref.workId() > 0L) {
            AsmrMusicProvider.WorkSummary work = asmrMusicProvider.getWork(ref.workId());
            String workTitle = readString(work.title(), "");
            String workArtist = readString(work.artist(), "");
            String workCover = readString(work.cover(), "");
            if (StringUtils.hasText(ref.hash())) {
                AsmrMusicProvider.AudioTrack selected = null;
                List<AsmrMusicProvider.AudioTrack> tracks = asmrMusicProvider.listAudioTracks(ref.workId());
                for (AsmrMusicProvider.AudioTrack item : tracks) {
                    if (ref.hash().equals(readString(item.hash(), ""))) {
                        selected = item;
                        break;
                    }
                }
                String audioUrl = "";
                String lyricUrl = "";
                Integer durationSec = null;
                String selectedTitle = "";
                if (selected != null) {
                    audioUrl = firstNonBlank(
                        readString(selected.playableAudioUrl(), ""),
                        readString(selected.mediaStreamUrl(), ""),
                        readString(selected.streamLowQualityUrl(), ""),
                        readString(selected.mediaDownloadUrl(), "")
                    );
                    lyricUrl = readString(selected.lyricUrl(), "");
                    durationSec = selected.durationSec();
                    selectedTitle = readString(selected.title(), "");
                }
                if (!StringUtils.hasText(audioUrl)) {
                    audioUrl = asmrMusicProvider.resolveStreamUrlByHash(ref.hash());
                }
                return new AsmrPlaybackTrackResult(
                    ref.workId(),
                    trackId,
                    firstNonBlank(normalizedTitleHint, selectedTitle, workTitle, "ASMR 音轨"),
                    firstNonBlank(normalizedArtistHint, workArtist),
                    firstNonBlank(normalizedCoverHint, workCover),
                    readString(audioUrl, ""),
                    lyricUrl,
                    durationSec,
                    ref.hash(),
                    readString(work.sourceId(), ""),
                    readString(work.sourceUrl(), "")
                );
            }
            AsmrMusicProvider.ResolvedTrack resolved = asmrMusicProvider.resolvePlayableByWork(ref.workId(), normalizedTitleHint);
            return new AsmrPlaybackTrackResult(
                ref.workId(),
                trackId,
                firstNonBlank(normalizedTitleHint, resolved.title(), workTitle, "ASMR 音轨"),
                firstNonBlank(normalizedArtistHint, resolved.artist(), workArtist),
                firstNonBlank(normalizedCoverHint, resolved.cover(), workCover),
                readString(resolved.audioUrl(), ""),
                readString(resolved.lyricUrl(), ""),
                resolved.durationSec(),
                readString(resolved.hash(), ""),
                firstNonBlank(readString(resolved.sourceId(), ""), readString(work.sourceId(), "")),
                firstNonBlank(readString(resolved.sourceUrl(), ""), readString(work.sourceUrl(), ""))
            );
        }

        String hash = readString(ref.hash(), "");
        String audioUrl = asmrMusicProvider.resolveStreamUrlByHash(hash);
        return new AsmrPlaybackTrackResult(
            0L,
            trackId,
            firstNonBlank(normalizedTitleHint, "ASMR 音轨"),
            normalizedArtistHint,
            normalizedCoverHint,
            readString(audioUrl, ""),
            "",
            null,
            hash,
            "",
            ""
        );
    }

    private AsmrPlaybackTrackRef parseAsmrPlaybackTrackRef(String trackId) {
        String normalized = readString(trackId, "");
        if (!StringUtils.hasText(normalized)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "track_id is required");
        }
        int separator = normalized.indexOf('|');
        if (separator > 0) {
            String workPart = readString(normalized.substring(0, separator), "");
            String hashPart = readString(normalized.substring(separator + 1), "");
            try {
                long workId = Long.parseLong(workPart);
                String hash = normalizeAsmrTrackHash(hashPart);
                if (workId > 0L && StringUtils.hasText(hash)) {
                    return new AsmrPlaybackTrackRef(workId, hash);
                }
            } catch (Exception ignored) {
                // ignore
            }
            throw new BusinessException(ErrorCode.BAD_REQUEST, "ASMR track_id format invalid");
        }
        if (normalized.matches("^[0-9]+$")) {
            try {
                long workId = Long.parseLong(normalized);
                if (workId > 0L) {
                    return new AsmrPlaybackTrackRef(workId, "");
                }
            } catch (Exception ignored) {
                // ignore
            }
        }
        String hash = normalizeAsmrTrackHash(normalized);
        if (StringUtils.hasText(hash)) {
            return new AsmrPlaybackTrackRef(0L, hash);
        }
        throw new BusinessException(ErrorCode.BAD_REQUEST, "ASMR track_id format invalid");
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
            quotaRemaining(total, used),
            keyStatus != null && keyStatus.keyBound(),
            uploadTotal,
            uploadUsed,
            quotaRemaining(uploadTotal, uploadUsed)
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
            String cachedSourceAudio = readString(cache == null ? null : cache.getSourceUrl(), "");
            if (cache != null && canReuseCachedSourceAudio(cachedSourceAudio)) {
                MusicTrackResponse cachedTrack = new MusicTrackResponse(
                    selected.trackId(),
                    selected.provider(),
                    selected.title(),
                    selected.artist(),
                    selected.cover(),
                    cachedSourceAudio,
                    selected.lyric(),
                    selected.sort(),
                    selected.enabled(),
                    selected.lyricText(),
                    selected.metadata()
                );
                touchTrackCacheLastListen(cache);
                long cachedUsed = loadPickUsedCount(userId);
                long cachedTotal = resolveQuotaValue(MUSIC_PICK_QUOTA_CODE, currentLoginUserGroups(), 5L);
                return new MusicPickResponse(
                    provider,
                    cachedTrack,
                    true,
                    new MusicPickQuotaResponse(cachedTotal, cachedUsed, quotaRemaining(cachedTotal, cachedUsed))
                );
            }
            if (hasOssObjectCache(cache)) {
                MusicTrackResponse cachedTrack = new MusicTrackResponse(
                    selected.trackId(),
                    selected.provider(),
                    selected.title(),
                    selected.artist(),
                    selected.cover(),
                    cache.getPublicUrl(),
                    selected.lyric(),
                    selected.sort(),
                    selected.enabled(),
                    selected.lyricText(),
                    selected.metadata()
                );
                long cachedUsed = loadPickUsedCount(userId);
                long cachedTotal = resolveQuotaValue(MUSIC_PICK_QUOTA_CODE, currentLoginUserGroups(), 5L);
                return new MusicPickResponse(
                    provider,
                    cachedTrack,
                    true,
                    new MusicPickQuotaResponse(cachedTotal, cachedUsed, quotaRemaining(cachedTotal, cachedUsed))
                );
            }
        }

        long total = resolveQuotaValue(MUSIC_PICK_QUOTA_CODE, currentLoginUserGroups(), 5L);
        long used = loadPickUsedCount(userId);
        if (!isUnlimitedQuota(total) && used >= total) {
            UserMusicGateway.ApiKeyStatus keyStatus = userMusicClient.getApiKeyStatus(userId, provider);
            if (keyStatus == null || !keyStatus.keyBound()) {
                throw new BusinessException(ErrorCode.FORBIDDEN, "Music API key required",
                    Map.of("music_error_code", "MUSIC_API_KEY_REQUIRED", "provider", provider, "total", total, "used", used));
            }
            // 首版只校验已绑定。后续可在此调用 provider API 并使用明文 key：
            // String apiKey = userMusicClient.getApiKeyPlaintext(userId, provider);
        } else if (!isUnlimitedQuota(total)) {
            increasePickUsedCount(userId, 1L);
            used += 1L;
        }

        MusicTrackResponse returnedTrack = selected;
        String sourceAudioUrl = readString(selected.audio(), "");
        boolean shouldAsyncCache = musicListenCacheProperties.isEnabled()
            && (!musicListenCacheProperties.isLoginOnly() || userId > 0)
            && StringUtils.hasText(trackId)
            && StringUtils.hasText(sourceAudioUrl);
        MusicListenCacheProperties.StorageMode storageMode = musicListenCacheProperties.resolveStorageMode();
        if (shouldAsyncCache) {
            upsertTrackSourceCache(provider, trackId, sourceAudioUrl);
            if (shouldEnqueueTrackToOss(storageMode, sourceAudioUrl)) {
                musicTrackCacheUploadPublisher.publish(
                    provider,
                    trackId,
                    sourceAudioUrl,
                    selected.title(),
                    selected.artist()
                );
            }
        }
        return new MusicPickResponse(
            provider,
            returnedTrack,
            false,
            new MusicPickQuotaResponse(total, used, quotaRemaining(total, used))
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
            entity.setMetadataJson(writeJson(sanitizeTrackMetadata(track.getMetadata())));
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
    @Transactional(rollbackFor = Exception.class)
    public void upsertAdminDefaultPlaylistTrack(AdminMusicTrackUpsertRequest request) {
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

        MusicPlaylistEntity entity = musicPlaylistMapper.selectOne(
            new LambdaQueryWrapper<MusicPlaylistEntity>()
                .eq(MusicPlaylistEntity::getProviderCode, provider)
                .eq(MusicPlaylistEntity::getTrackId, trackId)
                .last("LIMIT 1")
        );
        boolean created = false;
        if (entity == null) {
            entity = new MusicPlaylistEntity();
            entity.setProviderCode(provider);
            entity.setTrackId(trackId);
            entity.setCreatedAt(LocalDateTime.now());
            created = true;
        }
        int nextSort = request.getSort() == null
            ? (created ? resolveNextDefaultPlaylistTrackSort() : Math.max(0, entity.getSortNum() == null ? 0 : entity.getSortNum()))
            : Math.max(0, request.getSort());
        entity.setTitle(title);
        entity.setArtist(artist);
        entity.setCoverUrl(cover);
        entity.setAudioUrl(audio);
        entity.setLyricUrl(lyric);
        entity.setSortNum(nextSort);
        entity.setEnabledFlag(request.getEnabled() == null ? true : request.getEnabled());
        entity.setMetadataJson(writeJson(sanitizeTrackMetadata(request.getMetadata())));
        entity.setUpdatedAt(LocalDateTime.now());
        if (created) {
            musicPlaylistMapper.insert(entity);
        } else {
            musicPlaylistMapper.updateById(entity);
        }

        ensureDefaultPlaylistTrackCloudPersist(provider, trackId, title, artist, audio);
        LOGGER.info(
            "{} provider={} trackId={} created={} enabled={} sort={}",
            LOG_EVENT_DEFAULT_COLLECT_UPSERT_DONE,
            provider,
            trackId,
            created,
            Boolean.TRUE.equals(entity.getEnabledFlag()),
            entity.getSortNum()
        );
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
        entity.setMetadataJson(writeJson(sanitizeTrackMetadata(request.getMetadata())));
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

    /**
     * {@inheritDoc}
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public MusicSourcePlaylistImportResponse importSourceAccountPlaylists(String provider) {
        Long userId = requireLoginUserId();
        String normalizedProvider = normalizeSourceAccountProvider(provider);
        if (!StringUtils.hasText(normalizedProvider)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Unsupported source provider");
        }
        String cookie = userMusicClient.getSourceAccountCookiePlaintext(userId, normalizedProvider);
        if (!StringUtils.hasText(cookie)) {
            throw new BusinessException(
                ErrorCode.BAD_REQUEST,
                "Music source account is not bound",
                Map.of("music_error_code", MUSIC_ERROR_CODE_SOURCE_ACCOUNT_REQUIRED, "provider", normalizedProvider)
            );
        }
        if (!"netease".equals(normalizedProvider)) {
            throw new BusinessException(
                ErrorCode.BAD_REQUEST,
                "Current provider import is not supported yet",
                Map.of(
                    "music_error_code", MUSIC_ERROR_CODE_SOURCE_IMPORT_PROVIDER_UNSUPPORTED,
                    "provider", normalizedProvider
                )
            );
        }

        List<NeteaseCookieProvider.PlaylistSummary> sourcePlaylists = neteaseCookieProvider.listUserPlaylists(cookie, 300);
        int importedPlaylists = 0;
        int importedTracks = 0;
        int skippedPlaylists = 0;
        int failedPlaylists = 0;
        for (NeteaseCookieProvider.PlaylistSummary sourcePlaylist : sourcePlaylists) {
            String sourcePlaylistId = readString(sourcePlaylist.sourcePlaylistId(), "");
            if (!StringUtils.hasText(sourcePlaylistId)) {
                skippedPlaylists += 1;
                continue;
            }
            try {
                String playlistCode = buildSourceImportPlaylistCode(normalizedProvider, sourcePlaylistId, userId);
                UserMusicPlaylistEntity playlist = upsertSourceImportedPlaylist(userId, playlistCode, normalizedProvider, sourcePlaylist);

                List<NeteaseCookieProvider.TrackSummary> sourceTracks =
                    neteaseCookieProvider.listPlaylistTracks(sourcePlaylistId, cookie, 1000);
                userMusicPlaylistTrackMapper.delete(
                    new LambdaQueryWrapper<UserMusicPlaylistTrackEntity>()
                        .eq(UserMusicPlaylistTrackEntity::getPlaylistCode, playlist.getPlaylistCode())
                );
                int sort = 1;
                for (NeteaseCookieProvider.TrackSummary sourceTrack : sourceTracks) {
                    String trackId = readString(sourceTrack.trackId(), "");
                    if (!StringUtils.hasText(trackId)) {
                        continue;
                    }
                    UserMusicPlaylistTrackEntity trackEntity = new UserMusicPlaylistTrackEntity();
                    trackEntity.setPlaylistCode(playlist.getPlaylistCode());
                    trackEntity.setProviderCode(normalizedProvider);
                    trackEntity.setTrackId(trackId);
                    trackEntity.setTitle(readString(sourceTrack.title(), trackId));
                    trackEntity.setArtist(readString(sourceTrack.artist(), "未知歌手"));
                    trackEntity.setCoverUrl(readString(sourceTrack.cover(), ""));
                    trackEntity.setAudioUrl("");
                    trackEntity.setLyricUrl("");
                    trackEntity.setSortNum(sort++);
                    trackEntity.setEnabledFlag(true);
                    trackEntity.setMetadataJson(writeJson(sanitizeTrackMetadata(Map.of(
                        "provider", normalizedProvider,
                        "album", readString(sourceTrack.album(), ""),
                        "durationSec", sourceTrack.durationSec() == null ? 0 : Math.max(0, sourceTrack.durationSec()),
                        "sourceScene", "account_import",
                        "playlistCode", playlist.getPlaylistCode()
                    ))));
                    trackEntity.setCreatedAt(LocalDateTime.now());
                    trackEntity.setUpdatedAt(LocalDateTime.now());
                    userMusicPlaylistTrackMapper.insert(trackEntity);
                    importedTracks += 1;
                }
                importedPlaylists += 1;
            } catch (Exception ex) {
                failedPlaylists += 1;
                LOGGER.warn(
                    "MUSIC_SOURCE_IMPORT_PLAYLIST_FAIL provider={} sourcePlaylistId={} userId={} reason={}",
                    normalizedProvider,
                    sanitizeLogMessage(sourcePlaylistId),
                    userId,
                    sanitizeLogMessage(readString(ex.getMessage(), "unknown_error"))
                );
            }
        }
        LOGGER.info(
            "MUSIC_SOURCE_IMPORT_DONE provider={} userId={} importedPlaylists={} importedTracks={} skippedPlaylists={} failedPlaylists={}",
            normalizedProvider,
            userId,
            importedPlaylists,
            importedTracks,
            skippedPlaylists,
            failedPlaylists
        );
        return new MusicSourcePlaylistImportResponse(
            normalizedProvider,
            importedPlaylists,
            importedTracks,
            skippedPlaylists,
            failedPlaylists
        );
    }

    private MusicPlaylistBundleResponse loadVirtualTunehubPlaylistBundle(TuneHubVirtualPlaylistRef ref) {
        TuneHubApiContext apiContext = resolveTuneHubApiContext();
        List<MusicTrackResponse> tracks = tuneHubMusicProvider.loadVirtualPlaylistTracks(
            apiContext.apiKey(),
            ref.provider(),
            ref.sourceType(),
            ref.sourceId()
        );

        TuneHubMusicProvider.VirtualPlaylistSummary summary = null;
        if ("toplist".equals(ref.sourceType())) {
            summary = tuneHubMusicProvider
                .listToplistPlaylists(apiContext.apiKey(), List.of(ref.provider()), 8)
                .stream()
                .filter(item ->
                    ref.provider().equals(item.platform())
                        && ref.sourceType().equals(item.sourceType())
                        && ref.sourceId().equals(item.sourceId())
                )
                .findFirst()
                .orElse(null);
        } else if ("playlist".equals(ref.sourceType())) {
            summary = tuneHubMusicProvider.loadPlaylistSummary(
                apiContext.apiKey(),
                ref.provider(),
                ref.sourceType(),
                ref.sourceId()
            );
        }
        if (summary == null) {
            summary = new TuneHubMusicProvider.VirtualPlaylistSummary(
                ref.provider(),
                ref.sourceType(),
                ref.sourceId(),
                ref.provider().toUpperCase(Locale.ROOT) + " 歌单",
                "TuneHub 虚拟歌单",
                "",
                ref.playlistCode(),
                tracks.size()
            );
        }
        int resolvedTrackCount = tracks.size();
        if (summary.trackCount() != null && summary.trackCount() > 0) {
            resolvedTrackCount = Math.max(resolvedTrackCount, summary.trackCount());
        }
        LOGGER.info(
            "MUSIC_VIRTUAL_PLAYLIST_BUNDLE_DONE playlistCode={} provider={} sourceType={} sourceId={} loadedTrackCount={} summaryTrackCount={} resolvedTrackCount={}",
            ref.playlistCode(),
            summary.platform(),
            summary.sourceType(),
            summary.sourceId(),
            tracks.size(),
            summary.trackCount() == null ? 0 : summary.trackCount(),
            resolvedTrackCount
        );

        MusicPlaylistSummaryResponse profile = new MusicPlaylistSummaryResponse(
            ref.playlistCode(),
            readString(summary.name(), "TuneHub 歌单"),
            readString(summary.description(), ""),
            readString(summary.cover(), ""),
            PLAYLIST_TYPE_CUSTOM,
            0L,
            true,
            resolvedTrackCount,
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

    private MusicPlaylistBundleResponse loadVirtualAsmrPlaylistBundle(AsmrVirtualPlaylistRef ref) {
        AsmrMusicProvider.WorkSummary work = asmrMusicProvider.getWork(ref.workId());
        List<AsmrMusicProvider.AudioTrack> audioTracks = asmrMusicProvider.listAudioTracks(ref.workId());
        List<MusicTrackResponse> tracks = new ArrayList<>();
        int sort = 1;
        for (AsmrMusicProvider.AudioTrack item : audioTracks) {
            String hash = readString(item.hash(), "");
            String trackId = buildAsmrTrackId(ref.workId(), hash);
            if (!StringUtils.hasText(trackId)) {
                continue;
            }
            String title = readString(item.title(), "");
            String cover = readString(work.cover(), "");
            String lyricUrl = readString(item.lyricUrl(), "");
            String audioUrl = firstNonBlank(
                readString(item.playableAudioUrl(), ""),
                readString(item.mediaStreamUrl(), ""),
                readString(item.streamLowQualityUrl(), ""),
                readString(item.mediaDownloadUrl(), "")
            );
            if (!StringUtils.hasText(audioUrl) && StringUtils.hasText(hash)) {
                audioUrl = asmrMusicProvider.resolveStreamUrlByHash(hash);
            }
            Map<String, Object> metadata = new LinkedHashMap<>();
            metadata.put("provider", "asmr");
            metadata.put("workId", ref.workId());
            metadata.put("sourceScene", "asmr_virtual_work");
            if (StringUtils.hasText(hash)) {
                metadata.put("asmrHash", hash);
            }
            if (item.durationSec() != null) {
                metadata.put("durationSec", item.durationSec());
            }
            tracks.add(new MusicTrackResponse(
                trackId,
                "asmr",
                StringUtils.hasText(title) ? title : readString(work.title(), "ASMR 音轨"),
                readString(work.artist(), ""),
                cover,
                audioUrl,
                lyricUrl,
                sort++,
                true,
                "",
                sanitizeTrackMetadata(metadata)
            ));
        }
        if (tracks.isEmpty()) {
            tracks.add(new MusicTrackResponse(
                String.valueOf(ref.workId()),
                "asmr",
                readString(work.title(), "ASMR 作品"),
                readString(work.artist(), ""),
                readString(work.cover(), ""),
                "",
                "",
                1,
                true,
                "",
                sanitizeTrackMetadata(Map.of(
                    "provider", "asmr",
                    "workId", ref.workId(),
                    "sourceScene", "asmr_virtual_work"
                ))
            ));
        }
        MusicPlaylistSummaryResponse profile = new MusicPlaylistSummaryResponse(
            ref.playlistCode(),
            readString(work.title(), "ASMR 作品"),
            "ASMR 作品歌单",
            readString(work.cover(), ""),
            PLAYLIST_TYPE_CUSTOM,
            0L,
            true,
            tracks.size(),
            "asmr"
        );
        return new MusicPlaylistBundleResponse(profile, tracks);
    }

    private AsmrVirtualPlaylistRef parseVirtualAsmrPlaylistCode(String playlistCode) {
        Matcher matcher = VIRTUAL_ASMR_PLAYLIST_CODE_PATTERN.matcher(readString(playlistCode, ""));
        if (!matcher.matches()) {
            return null;
        }
        long workId;
        try {
            workId = Long.parseLong(readString(matcher.group(1), ""));
        } catch (Exception ex) {
            return null;
        }
        if (workId <= 0L) {
            return null;
        }
        return new AsmrVirtualPlaylistRef(playlistCode, workId);
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
            LOGGER.info("{} userId={} keySource={} platformOrder={}", LOG_EVENT_API_CONTEXT_START, userId, keySource, preferredOrder);
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
        if (result.isEmpty()) {
            List<String> defaults = resolveTuneHubPlatformOrder(userId);
            for (String item : defaults) {
                String normalized = normalizeSearchProvider(item);
                if (!StringUtils.hasText(normalized) || !seen.add(normalized)) {
                    continue;
                }
                result.add(normalized);
            }
        }
        if (result.isEmpty()) {
            result = new ArrayList<>(List.of("netease", "kuwo", "qq"));
        }

        SearchSourcePolicy sourcePolicy = resolveSearchSourcePolicy(userId);
        if (SOURCE_MODE_ACCOUNT_ONLY.equals(sourcePolicy.mode())) {
            List<String> filtered = new ArrayList<>();
            for (String provider : result) {
                if (!TUNEHUB_PLAYLIST_PLATFORMS.contains(provider)) {
                    filtered.add(provider);
                    continue;
                }
                if (sourcePolicy.boundProviders().contains(provider)) {
                    filtered.add(provider);
                }
            }
            result = filtered;
        }
        if (SOURCE_MODE_ACCOUNT_FIRST.equals(sourcePolicy.mode())) {
            List<String> priorityOrder = normalizeTuneHubPlatformOrder(sourcePolicy.providerOrder());
            Map<String, Integer> rankMap = new LinkedHashMap<>();
            for (int i = 0; i < priorityOrder.size(); i += 1) {
                rankMap.put(priorityOrder.get(i), i);
            }
            result.sort((left, right) -> {
                boolean leftBound = sourcePolicy.boundProviders().contains(left);
                boolean rightBound = sourcePolicy.boundProviders().contains(right);
                if (leftBound != rightBound) {
                    return leftBound ? -1 : 1;
                }
                int leftRank = rankMap.getOrDefault(left, 99);
                int rightRank = rankMap.getOrDefault(right, 99);
                if (leftRank != rightRank) {
                    return Integer.compare(leftRank, rightRank);
                }
                return 0;
            });
        }
        return result;
    }

    private String normalizeSearchProvider(String provider) {
        String normalized = readString(provider, "").toLowerCase(Locale.ROOT);
        if ("spotify".equals(normalized) || "asmr".equals(normalized)) {
            return normalized;
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

    private String buildVirtualAsmrWorkPlaylistCode(long workId) {
        if (workId <= 0L) {
            return "";
        }
        return "vh_asmr_work_" + workId;
    }

    private String buildAsmrTrackId(long workId, String hash) {
        String normalizedHash = normalizeAsmrTrackHash(hash);
        if (workId > 0L && StringUtils.hasText(normalizedHash)) {
            return workId + "|" + normalizedHash;
        }
        if (workId > 0L) {
            return String.valueOf(workId);
        }
        return normalizedHash;
    }

    private String normalizeAsmrTrackHash(String hash) {
        String normalized = readString(hash, "");
        if (!StringUtils.hasText(normalized)) {
            return "";
        }
        if (!normalized.matches("^[0-9]+/[0-9]+$")) {
            return "";
        }
        return normalized;
    }

    private String resolveProviderDisplayName(String provider) {
        String normalized = readString(provider, "").toLowerCase(Locale.ROOT);
        return switch (normalized) {
            case "netease" -> "网易云";
            case "kuwo" -> "酷我";
            case "qq" -> "QQ 音乐";
            case "asmr" -> "ASMR";
            default -> normalized.toUpperCase(Locale.ROOT);
        };
    }

    private String resolvePlaybackCover(String preferredCover, String fallbackCover, String cacheCover) {
        String preferred = readString(preferredCover, "");
        if (StringUtils.hasText(preferred)) {
            return preferred;
        }
        String fallback = readString(fallbackCover, "");
        if (StringUtils.hasText(fallback)) {
            return fallback;
        }
        return readString(cacheCover, "");
    }

    private Map<String, Object> buildPlaybackMetadata(Map<String, Object> baseMetadata,
                                                      String lyricText,
                                                      String translationLyricText,
                                                      String furiganaLyricText) {
        Map<String, Object> result = new LinkedHashMap<>();
        if (baseMetadata != null && !baseMetadata.isEmpty()) {
            result.putAll(baseMetadata);
        }

        String original = readString(lyricText, "");
        String translation = readString(translationLyricText, "");
        String furigana = readString(furiganaLyricText, "");
        if (StringUtils.hasText(original) || StringUtils.hasText(translation) || StringUtils.hasText(furigana)) {
            result.put("lyricTracks", Map.of(
                "original", original,
                "translation", translation,
                "furigana", furigana
            ));
        }
        return result;
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

    private boolean canUseNeteaseAccountSource(Long userId, SearchSourcePolicy sourcePolicy, String provider) {
        if (userId == null || userId <= 0) {
            return false;
        }
        if (!"netease".equals(provider)) {
            return false;
        }
        if (sourcePolicy == null || sourcePolicy.boundProviders() == null) {
            return false;
        }
        return sourcePolicy.boundProviders().contains("netease");
    }

    private MusicTrackResponse resolvePlaybackViaNeteaseAccount(MusicResolvePlaybackRequest request,
                                                                String trackId,
                                                                MusicListenCacheProperties.StorageMode storageMode,
                                                                boolean resolveLyric,
                                                                Long userId,
                                                                long startMs,
                                                                boolean fallbackApplied) {
        String cookie = userMusicClient.getSourceAccountCookiePlaintext(userId, "netease");
        if (!StringUtils.hasText(cookie)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Netease cookie not bound");
        }
        NeteaseCookieProvider.ResolvedTrack resolved = neteaseCookieProvider.resolveTrack(trackId, cookie, resolveLyric);
        String resolvedAudio = readString(resolved.audioUrl(), "");
        if (!StringUtils.hasText(resolvedAudio)) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "Netease account playback resolve failed");
        }
        validateHttpUrlIfPresent(resolvedAudio, "audio");

        boolean shouldCache = musicListenCacheProperties.isEnabled()
            && (!musicListenCacheProperties.isLoginOnly() || userId > 0);
        boolean cacheEnqueued = false;
        if (shouldCache) {
            upsertTrackSourceCache("netease", trackId, resolvedAudio);
            if (shouldEnqueueTrackToOss(storageMode, resolvedAudio)) {
                cacheEnqueued = musicTrackCacheUploadPublisher.publish(
                    "netease",
                    trackId,
                    resolvedAudio,
                    readString(request == null ? null : request.getTitle(), readString(resolved.title(), "")),
                    readString(request == null ? null : request.getArtist(), readString(resolved.artist(), ""))
                );
            }
        }

        String resolvedCover = resolvePlaybackCover(
            readString(request == null ? null : request.getCover(), ""),
            readString(resolved.cover(), ""),
            ""
        );
        String lyricText = readString(resolved.lyricText(), "");
        LOGGER.info(
            "{} provider={} trackId={} source=account_netease lyricSource=account_netease cacheEnqueued={} lyricTextLength={} durationMs={}",
            LOG_EVENT_RESOLVE_STAGE_DONE,
            "netease",
            trackId,
            cacheEnqueued,
            lyricText.length(),
            Math.max(1L, System.currentTimeMillis() - startMs)
        );
        return new MusicTrackResponse(
            trackId,
            "netease",
            readString(request == null ? null : request.getTitle(), readString(resolved.title(), trackId)),
            readString(request == null ? null : request.getArtist(), readString(resolved.artist(), "")),
            resolvedCover,
            resolvedAudio,
            "",
            0,
            true,
            lyricText,
            buildPlaybackMetadata(
                Map.of(
                    "cacheMode", storageMode.code(),
                    "resolved_source", "netease_account",
                    "fallback_applied", fallbackApplied,
                    "retry_count", 0
                ),
                lyricText,
                "",
                ""
            )
        );
    }

    private ParseAttemptResult parseSingleTrackWithRetry(String apiKey,
                                                         String provider,
                                                         String trackId,
                                                         String quality,
                                                         int maxRetries) {
        int attempts = 0;
        Exception lastException = null;
        while (attempts <= Math.max(0, maxRetries)) {
            try {
                TuneHubMusicProvider.ParseTrackResult result = tuneHubMusicProvider.parseSingleTrack(
                    apiKey,
                    provider,
                    trackId,
                    quality
                );
                return new ParseAttemptResult(result, attempts);
            } catch (Exception ex) {
                lastException = ex;
                attempts += 1;
            }
        }
        if (lastException instanceof RuntimeException runtimeException) {
            throw runtimeException;
        }
        throw new BusinessException(ErrorCode.INTERNAL_ERROR, "TuneHub parse failed");
    }

    private SearchSourcePolicy resolveSearchSourcePolicy(Long userId) {
        if (userId == null || userId <= 0) {
            return new SearchSourcePolicy(SOURCE_MODE_TUNEHUB_FIRST, SOURCE_PROVIDER_DEFAULT_ORDER, Set.of());
        }
        Map<String, Object> preference = userMusicClient.getPreference(userId);
        Map<String, Object> musicObject = asObjectMap(preference.get("music"));
        String sourceMode = normalizeSourceMode(
            readString(
                preference.get("music.source_mode"),
                readString(musicObject.get("source_mode"), SOURCE_MODE_TUNEHUB_FIRST)
            )
        );
        List<String> providerOrder = asSourceProviderList(preference.get("music.account_provider_order"));
        if (providerOrder.isEmpty()) {
            providerOrder = asSourceProviderList(musicObject.get("account_provider_order"));
        }
        if (providerOrder.isEmpty()) {
            providerOrder = SOURCE_PROVIDER_DEFAULT_ORDER;
        }
        Set<String> boundProviders = new LinkedHashSet<>();
        List<UserMusicGateway.SourceAccountStatus> statuses = userMusicClient.listSourceAccountStatus(userId);
        for (UserMusicGateway.SourceAccountStatus status : statuses) {
            if (status == null || !status.bound()) {
                continue;
            }
            String provider = normalizeSourceAccountProviderToSearch(status.provider());
            if (!StringUtils.hasText(provider)) {
                continue;
            }
            boundProviders.add(provider);
        }
        return new SearchSourcePolicy(sourceMode, providerOrder, boundProviders);
    }

    private List<String> asSourceProviderList(Object raw) {
        if (!(raw instanceof List<?> listRaw)) {
            return List.of();
        }
        List<String> result = new ArrayList<>();
        Set<String> seen = new LinkedHashSet<>();
        for (Object item : listRaw) {
            String value = normalizeSourceAccountProviderToSearch(item == null ? "" : String.valueOf(item));
            if (!StringUtils.hasText(value) || !seen.add(value)) {
                continue;
            }
            result.add(value);
        }
        return result;
    }

    private String normalizeSourceAccountProviderToSearch(String provider) {
        String normalized = readString(provider, "").toLowerCase(Locale.ROOT);
        if ("qqmusic".equals(normalized) || "qq".equals(normalized)) {
            return "qq";
        }
        if ("kugou".equals(normalized) || "kuwo".equals(normalized)) {
            return "kuwo";
        }
        if ("netease".equals(normalized) || "kuwo".equals(normalized)) {
            return normalized;
        }
        return "";
    }

    private String normalizeSourceMode(String mode) {
        String normalized = readString(mode, SOURCE_MODE_TUNEHUB_FIRST).toLowerCase(Locale.ROOT);
        if (
            SOURCE_MODE_ACCOUNT_FIRST.equals(normalized)
                || SOURCE_MODE_TUNEHUB_FIRST.equals(normalized)
                || SOURCE_MODE_ACCOUNT_ONLY.equals(normalized)
                || SOURCE_MODE_TUNEHUB_ONLY.equals(normalized)
        ) {
            return normalized;
        }
        return SOURCE_MODE_TUNEHUB_FIRST;
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

    private String normalizePlaybackProvider(String provider) {
        String normalized = readString(provider, "").toLowerCase(Locale.ROOT);
        if ("asmr".equals(normalized)) {
            return "asmr";
        }
        return normalizeSourceProvider(normalized);
    }

    private String normalizeSourceAccountProvider(String provider) {
        String normalized = readString(provider, "").toLowerCase(Locale.ROOT);
        return SOURCE_ACCOUNT_SUPPORTED_PROVIDERS.contains(normalized) ? normalized : "";
    }

    private String buildSourceImportPlaylistCode(String provider, String sourcePlaylistId, Long userId) {
        String raw = "src_" + provider + "_" + sourcePlaylistId + "_u_" + userId;
        if (raw.length() <= 64) {
            return raw;
        }
        String hash = hashQueryFingerprint(raw);
        String compact = "src_" + provider + "_" + hash + "_u_" + userId;
        if (compact.length() <= 64) {
            return compact;
        }
        return compact.substring(0, 64);
    }

    private UserMusicPlaylistEntity upsertSourceImportedPlaylist(Long userId,
                                                                 String playlistCode,
                                                                 String provider,
                                                                 NeteaseCookieProvider.PlaylistSummary sourcePlaylist) {
        UserMusicPlaylistEntity existing = userMusicPlaylistMapper.selectOne(
            new LambdaQueryWrapper<UserMusicPlaylistEntity>()
                .eq(UserMusicPlaylistEntity::getUserId, userId)
                .eq(UserMusicPlaylistEntity::getPlaylistCode, playlistCode)
                .last("LIMIT 1")
        );
        LocalDateTime now = LocalDateTime.now();
        Map<String, Object> metadata = Map.of(
            "sourceProvider", provider,
            "sourcePlaylistId", readString(sourcePlaylist.sourcePlaylistId(), ""),
            "lastSyncTime", now.toString()
        );
        if (existing == null) {
            UserMusicPlaylistEntity entity = new UserMusicPlaylistEntity();
            entity.setPlaylistCode(playlistCode);
            entity.setUserId(userId);
            entity.setPlaylistType(PLAYLIST_TYPE_CUSTOM);
            entity.setName(readString(sourcePlaylist.name(), "导入歌单"));
            entity.setDescription(readString(sourcePlaylist.description(), ""));
            entity.setCoverUrl(readString(sourcePlaylist.cover(), ""));
            entity.setPublicFlag(false);
            entity.setSystemReservedFlag(false);
            entity.setSortNum(resolveNextUserPlaylistSort(userId));
            entity.setMetadataJson(writeJson(metadata));
            entity.setCreatedAt(now);
            entity.setUpdatedAt(now);
            userMusicPlaylistMapper.insert(entity);
            return entity;
        }
        existing.setName(readString(sourcePlaylist.name(), existing.getName()));
        existing.setDescription(readString(sourcePlaylist.description(), existing.getDescription()));
        existing.setCoverUrl(readString(sourcePlaylist.cover(), existing.getCoverUrl()));
        existing.setMetadataJson(writeJson(metadata));
        existing.setUpdatedAt(now);
        userMusicPlaylistMapper.updateById(existing);
        return existing;
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

    private Map<String, Object> readTrackMetadata(String rawJson) {
        String json = readString(rawJson, "");
        if (!StringUtils.hasText(json)) {
            return Map.of();
        }
        try {
            Map<String, Object> parsed = objectMapper.readValue(json, new TypeReference<Map<String, Object>>() {
            });
            return sanitizeTrackMetadata(parsed);
        } catch (Exception ex) {
            return Map.of();
        }
    }

    private Map<String, Object> sanitizeTrackMetadata(Map<String, Object> rawMetadata) {
        if (rawMetadata == null || rawMetadata.isEmpty()) {
            return Map.of();
        }
        Map<String, Object> sanitized = new LinkedHashMap<>();
        for (String key : TRACK_METADATA_ALLOWED_KEYS) {
            if (!rawMetadata.containsKey(key)) {
                continue;
            }
            Object normalized = normalizeTrackMetadataValue(key, rawMetadata.get(key));
            if (normalized != null) {
                sanitized.put(key, normalized);
            }
        }
        if (sanitized.isEmpty()) {
            return Map.of();
        }
        String encoded = writeJson(sanitized);
        if (encoded.length() > TRACK_METADATA_JSON_MAX_LENGTH) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "track metadata is too large");
        }
        return sanitized;
    }

    private Object normalizeTrackMetadataValue(String key, Object rawValue) {
        if (rawValue == null) {
            return null;
        }
        if ("lyricTextAvailable".equals(key)) {
            if (rawValue instanceof Boolean bool) {
                return bool;
            }
            String normalizedBool = readString(String.valueOf(rawValue), "").toLowerCase(Locale.ROOT);
            return "true".equals(normalizedBool) || "1".equals(normalizedBool);
        }
        if ("durationSec".equals(key)) {
            try {
                long value = Long.parseLong(String.valueOf(rawValue).trim());
                if (value <= 0) {
                    return null;
                }
                return Math.min(value, Integer.MAX_VALUE);
            } catch (Exception ex) {
                return null;
            }
        }
        String value = readString(String.valueOf(rawValue), "");
        if (!StringUtils.hasText(value)) {
            return null;
        }
        return value.length() > 512 ? value.substring(0, 512) : value;
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
        long value = resolved == null ? fallback : resolved;
        return value < 0 ? -1L : value;
    }

    private boolean isUnlimitedQuota(long total) {
        return total < 0;
    }

    private long quotaRemaining(long total, long used) {
        if (isUnlimitedQuota(total)) {
            return -1L;
        }
        return Math.max(0L, total - Math.max(0L, used));
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

    private boolean canReuseCachedSourceAudio(String sourceAudioUrl) {
        String url = readString(sourceAudioUrl, "");
        if (!StringUtils.hasText(url)) {
            return false;
        }
        if (!url.startsWith("http://") && !url.startsWith("https://")) {
            return false;
        }
        return !TrackUrlExpiryPolicy.isExpired(url);
    }

    private void ensureDefaultPlaylistTrackCloudPersist(String provider,
                                                        String trackId,
                                                        String title,
                                                        String artist,
                                                        String audioUrl) {
        String resolvedAudioUrl = readString(audioUrl, "");
        if (!StringUtils.hasText(resolvedAudioUrl)) {
            String normalizedProvider = normalizeSourceProvider(provider);
            if (!StringUtils.hasText(normalizedProvider)) {
                LOGGER.warn(
                    "{} provider={} trackId={} reason=audio_missing_and_provider_not_supported",
                    LOG_EVENT_DEFAULT_COLLECT_CLOUD_ENQUEUE_FAIL,
                    provider,
                    trackId
                );
                return;
            }
            TuneHubApiContext apiContext = resolveTuneHubApiContext(false);
            if (!StringUtils.hasText(apiContext.apiKey())) {
                LOGGER.warn(
                    "{} provider={} trackId={} reason=api_key_missing",
                    LOG_EVENT_DEFAULT_COLLECT_CLOUD_ENQUEUE_FAIL,
                    provider,
                    trackId
                );
                return;
            }
            try {
                TuneHubMusicProvider.ParseTrackResult parsed = tuneHubMusicProvider.parseSingleTrack(
                    apiContext.apiKey(),
                    normalizedProvider,
                    trackId,
                    tuneHubMusicProperties.getDefaultQuality()
                );
                resolvedAudioUrl = readString(parsed.audioUrl(), "");
            } catch (Exception exception) {
                LOGGER.warn(
                    "{} provider={} trackId={} reason=parse_failed detail={}",
                    LOG_EVENT_DEFAULT_COLLECT_CLOUD_ENQUEUE_FAIL,
                    provider,
                    trackId,
                    sanitizeLogMessage(readString(exception.getMessage(), "unknown_error"))
                );
                return;
            }
        }

        if (!StringUtils.hasText(resolvedAudioUrl)) {
            LOGGER.warn(
                "{} provider={} trackId={} reason=audio_missing",
                LOG_EVENT_DEFAULT_COLLECT_CLOUD_ENQUEUE_FAIL,
                provider,
                trackId
            );
            return;
        }
        try {
            validateHttpUrlIfPresent(resolvedAudioUrl, "audio");
        } catch (BusinessException exception) {
            LOGGER.warn(
                "{} provider={} trackId={} reason=invalid_audio_url",
                LOG_EVENT_DEFAULT_COLLECT_CLOUD_ENQUEUE_FAIL,
                provider,
                trackId
            );
            return;
        }
        upsertTrackSourceCache(provider, trackId, resolvedAudioUrl);
        boolean enqueued = musicTrackCacheUploadPublisher.publish(provider, trackId, resolvedAudioUrl, title, artist);
        if (enqueued) {
            LOGGER.info(
                "{} provider={} trackId={}",
                LOG_EVENT_DEFAULT_COLLECT_CLOUD_ENQUEUE_OK,
                provider,
                trackId
            );
            return;
        }
        LOGGER.warn(
            "{} provider={} trackId={} reason=enqueue_failed",
            LOG_EVENT_DEFAULT_COLLECT_CLOUD_ENQUEUE_FAIL,
            provider,
            trackId
        );
    }

    private boolean hasOssObjectCache(MusicTrackCacheEntity cache) {
        if (cache == null) {
            return false;
        }
        String bucketCode = readString(cache.getBucketCode(), "");
        String objectCode = readString(cache.getObjectCode(), "");
        if (!StringUtils.hasText(bucketCode) || !StringUtils.hasText(objectCode)) {
            return false;
        }
        if (SOURCE_ONLY_OBJECT_CODE.equalsIgnoreCase(objectCode)) {
            return false;
        }
        return objectStorageClient.objectExists(bucketCode, objectCode);
    }

    private boolean shouldEnqueueTrackToOss(MusicListenCacheProperties.StorageMode storageMode, String sourceAudioUrl) {
        MusicListenCacheProperties.StorageMode mode = storageMode == null
            ? MusicListenCacheProperties.StorageMode.SMART
            : storageMode;
        return switch (mode) {
            case URL_ONLY -> false;
            case HYBRID -> true;
            case SMART -> TrackUrlExpiryPolicy.shouldFallbackToOss(
                sourceAudioUrl,
                musicListenCacheProperties.getUrlTtlThresholdSeconds()
            );
        };
    }

    private void upsertTrackSourceCache(String provider, String trackId, String sourceAudioUrl) {
        if (!StringUtils.hasText(provider) || !StringUtils.hasText(trackId) || !StringUtils.hasText(sourceAudioUrl)) {
            return;
        }
        MusicTrackCacheEntity existing = loadTrackCache(provider, trackId);
        MusicTrackCacheEntity entity = existing == null ? new MusicTrackCacheEntity() : existing;
        String bucketCode = readString(entity.getBucketCode(), "");
        if (!StringUtils.hasText(bucketCode)) {
            bucketCode = readString(mediaStorageProperties.getPublicBucket(), "music-cache");
        }
        String objectCode = readString(entity.getObjectCode(), "");
        if (!StringUtils.hasText(objectCode)) {
            objectCode = SOURCE_ONLY_OBJECT_CODE;
        }
        String publicUrl = readString(entity.getPublicUrl(), "");
        if (!StringUtils.hasText(publicUrl)) {
            publicUrl = sourceAudioUrl;
        }
        entity.setProviderCode(provider);
        entity.setTrackId(trackId);
        entity.setBucketCode(bucketCode);
        entity.setObjectCode(objectCode);
        entity.setPublicUrl(publicUrl);
        entity.setSourceUrl(sourceAudioUrl);
        entity.setLastListenTime(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        if (existing == null) {
            entity.setCreatedAt(LocalDateTime.now());
            try {
                musicTrackCacheMapper.insert(entity);
            } catch (DuplicateKeyException duplicateKeyException) {
                MusicTrackCacheEntity concurrent = loadTrackCache(provider, trackId);
                if (concurrent != null) {
                    concurrent.setSourceUrl(sourceAudioUrl);
                    concurrent.setLastListenTime(LocalDateTime.now());
                    concurrent.setUpdatedAt(LocalDateTime.now());
                    musicTrackCacheMapper.updateById(concurrent);
                }
            }
        } else {
            musicTrackCacheMapper.updateById(entity);
        }
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
        return cacheTrackToOss(provider, trackId, "", "", sourceAudioUrl);
    }

    private MusicTrackCacheEntity cacheTrackToOss(String provider,
                                                  String trackId,
                                                  String title,
                                                  String artist,
                                                  String sourceAudioUrl) {
        validateHttpUrlIfPresent(sourceAudioUrl, "audio");
        MusicTrackCacheEntity existing = loadTrackCache(provider, trackId);
        if (hasOssObjectCache(existing)) {
            touchTrackCacheLastListen(existing);
            return existing;
        }
        try (InputStream in = new URL(sourceAudioUrl).openStream()) {
            String bucket = mediaStorageProperties.getPublicBucket();
            String extension = inferAudioExtension(sourceAudioUrl);
            String key = buildTrackCacheObjectKey(provider, trackId, title, artist);
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

    private String buildTrackCacheObjectKey(String provider, String trackId, String title, String artist) {
        String normalizedProvider = sanitizeTrackCacheObjectNamePart(provider, "source", 32);
        String normalizedTrackId = sanitizeTrackCacheObjectNamePart(trackId, "track", 64);
        String normalizedTitle = sanitizeTrackCacheObjectNamePart(title, "unknown-title", 80);
        String normalizedArtist = sanitizeTrackCacheObjectNamePart(artist, "unknown-artist", 80);
        String filename = normalizedTitle + "-" + normalizedArtist + "-" + normalizedProvider + ".mp3";
        return "music-cache/" + normalizedProvider + "/" + normalizedTrackId + "/" + filename;
    }

    private String sanitizeTrackCacheObjectNamePart(String raw, String fallback, int maxLength) {
        String value = readString(raw, fallback)
            .replaceAll("[\\\\/:*?\"<>|\\s]+", "_")
            .replaceAll("[^\\p{IsAlphabetic}\\p{IsDigit}_\\-\\.]+", "");
        if (!StringUtils.hasText(value)) {
            value = fallback;
        }
        if (value.length() > maxLength) {
            value = value.substring(0, maxLength);
        }
        return value;
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
        long missingTrackId = tracks.stream()
            .filter(item -> !StringUtils.hasText(readString(item.trackId(), "")))
            .count();
        long missingAudio = tracks.stream()
            .filter(item -> !StringUtils.hasText(readString(item.audio(), "")))
            .count();
        long tunehubResolvable = tracks.stream()
            .filter(item -> {
                String provider = readString(item.provider(), "").toLowerCase(Locale.ROOT);
                return TUNEHUB_PLAYLIST_PLATFORMS.contains(provider)
                    && StringUtils.hasText(readString(item.trackId(), ""));
            })
            .count();
        LOGGER.info(
            "MUSIC_USER_PLAYLIST_BUNDLE_STATS playlistCode={} ownerView={} total={} missingTrackId={} missingAudio={} tunehubResolvable={}",
            readString(playlist.getPlaylistCode(), ""),
            ownerView,
            tracks.size(),
            missingTrackId,
            missingAudio,
            tunehubResolvable
        );
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
        Map<String, Object> metadata = readTrackMetadata(entity.getMetadataJson());
        String trackId = readString(entity.getTrackId(), "");
        if (!StringUtils.hasText(trackId)) {
            trackId = readMetadataString(metadata, "trackId", "track_id", "id", "songId", "song_id");
        }
        String provider = readString(entity.getProviderCode(), "");
        if (!StringUtils.hasText(provider)) {
            provider = readMetadataString(metadata, "provider", "providerCode", "provider_code");
        }
        if (!StringUtils.hasText(provider)) {
            provider = "local";
        }
        String title = readString(entity.getTitle(), readMetadataString(metadata, "title", "name"));
        String artist = readString(entity.getArtist(), readMetadataString(metadata, "artist", "artists"));
        String coverUrl = readString(
            entity.getCoverUrl(),
            readMetadataString(metadata, "cover", "coverUrl", "cover_url", "picUrl", "pic_url")
        );
        String audioUrl = readString(
            entity.getAudioUrl(),
            readMetadataString(
                metadata,
                "audio",
                "audioUrl",
                "audio_url",
                "sourceAudioUrl",
                "source_audio_url",
                "sourceUrl",
                "source_url"
            )
        );
        String lyricUrl = readString(
            entity.getLyricUrl(),
            readMetadataString(metadata, "lyric", "lyricUrl", "lyric_url")
        );
        return new MusicTrackResponse(
            trackId,
            provider,
            readString(title, "Unknown"),
            artist,
            coverUrl,
            audioUrl,
            lyricUrl,
            entity.getSortNum() == null ? 0 : entity.getSortNum(),
            Boolean.TRUE.equals(entity.getEnabledFlag()),
            "",
            metadata
        );
    }

    private String readMetadataString(Map<String, Object> metadata, String... keys) {
        if (metadata == null || metadata.isEmpty() || keys == null || keys.length == 0) {
            return "";
        }
        for (String key : keys) {
            if (!StringUtils.hasText(key) || !metadata.containsKey(key)) {
                continue;
            }
            Object raw = metadata.get(key);
            if (raw == null) {
                continue;
            }
            String normalized = readString(String.valueOf(raw), "");
            if (StringUtils.hasText(normalized)) {
                return normalized;
            }
        }
        return "";
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

    private int resolveNextDefaultPlaylistTrackSort() {
        MusicPlaylistEntity maxSort = musicPlaylistMapper.selectOne(
            new LambdaQueryWrapper<MusicPlaylistEntity>()
                .orderByDesc(MusicPlaylistEntity::getSortNum)
                .orderByDesc(MusicPlaylistEntity::getId)
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
        Map<String, Object> metadata = readTrackMetadata(entity.getMetadataJson());
        return new MusicTrackResponse(
            entity.getTrackId(),
            entity.getProviderCode(),
            entity.getTitle(),
            entity.getArtist(),
            entity.getCoverUrl(),
            entity.getAudioUrl(),
            entity.getLyricUrl(),
            entity.getSortNum() == null ? 0 : entity.getSortNum(),
            Boolean.TRUE.equals(entity.getEnabledFlag()),
            "",
            metadata
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
     * 读取对象值并转字符串；空白值返回兜底值。
     */
    private String readString(Object value, String fallback) {
        if (value == null) {
            return fallback;
        }
        return readString(String.valueOf(value), fallback);
    }

    private String firstNonBlank(String... values) {
        if (values == null || values.length == 0) {
            return "";
        }
        for (String item : values) {
            String value = readString(item, "");
            if (StringUtils.hasText(value)) {
                return value;
            }
        }
        return "";
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

    private record ParseAttemptResult(TuneHubMusicProvider.ParseTrackResult result,
                                      int retryCount) {
    }

    private record SearchSourcePolicy(String mode,
                                      List<String> providerOrder,
                                      Set<String> boundProviders) {
        private boolean accountOnly() {
            return SOURCE_MODE_ACCOUNT_ONLY.equals(mode);
        }
    }

    private record TuneHubVirtualPlaylistRef(String playlistCode,
                                             String provider,
                                             String sourceType,
                                             String sourceId) {
    }

    private record AsmrVirtualPlaylistRef(String playlistCode, long workId) {
    }

    private record AsmrPlaybackTrackRef(long workId, String hash) {
    }

    private record AsmrPlaybackTrackResult(long workId,
                                           String trackId,
                                           String title,
                                           String artist,
                                           String cover,
                                           String audioUrl,
                                           String lyricUrl,
                                           Integer durationSec,
                                           String hash,
                                           String sourceId,
                                           String sourceUrl) {
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
