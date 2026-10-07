package io.github.shizuki.site.media.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.common.security.context.LoginUserContext;
import io.github.shizuki.common.security.model.LoginUser;
import io.github.shizuki.common.storage.client.ObjectStorageClient;
import io.github.shizuki.common.storage.config.OssProperties;
import io.github.shizuki.common.storage.model.StorageObjectMetadata;
import io.github.shizuki.common.storage.util.OssKeyBuilder;
import io.github.shizuki.site.media.config.MediaStorageProperties;
import io.github.shizuki.site.media.config.WallpaperWorkshopProperties;
import io.github.shizuki.site.media.request.AdminWallpaperAuditRequest;
import io.github.shizuki.site.media.response.AdminWallpaperAuditResponse;
import io.github.shizuki.site.media.response.WallpaperImportJobResponse;
import io.github.shizuki.site.media.response.WallpaperProfileResponse;
import io.github.shizuki.site.media.request.WallpaperSettingsUpdateRequest;
import io.github.shizuki.site.media.request.WallpaperVisibilityUpdateRequest;
import io.github.shizuki.site.media.request.WorkshopImportCreateRequest;
import io.github.shizuki.site.media.entity.MediaAssetEntity;
import io.github.shizuki.site.media.entity.MediaL2dPackageEntity;
import io.github.shizuki.site.media.entity.MediaWallpaperImportJobEntity;
import io.github.shizuki.site.media.entity.MediaWallpaperProfileEntity;
import io.github.shizuki.site.media.mapper.MediaAssetMapper;
import io.github.shizuki.site.media.mapper.MediaL2dPackageMapper;
import io.github.shizuki.site.media.mapper.MediaWallpaperImportJobMapper;
import io.github.shizuki.site.media.mapper.MediaWallpaperProfileMapper;
import io.github.shizuki.site.media.model.AssetAuditStatusEnum;
import io.github.shizuki.site.media.model.AssetKindEnum;
import io.github.shizuki.site.media.model.AssetVisibilityEnum;
import io.github.shizuki.site.media.model.L2dValidationEnum;
import io.github.shizuki.site.media.model.WallpaperImportProgressStageEnum;
import io.github.shizuki.site.media.model.WallpaperImportSourceEnum;
import io.github.shizuki.site.media.model.WallpaperImportStatusEnum;
import io.github.shizuki.site.media.model.WallpaperSceneTypeEnum;
import io.github.shizuki.site.media.service.WallpaperService;
import io.github.shizuki.site.media.service.l2d.L2dValidationResult;
import io.github.shizuki.site.media.service.l2d.L2dZipValidator;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.support.TransactionTemplate;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

@Service
public class WallpaperServiceImpl implements WallpaperService {

    private static final Logger LOGGER = LoggerFactory.getLogger(WallpaperServiceImpl.class);
    private static final Pattern WORKSHOP_ID_PATTERN = Pattern.compile("(?:id=|/filedetails/)(\\d+)");
    private static final Set<String> STATIC_EXTENSIONS = Set.of("png", "jpg", "jpeg", "avif");
    private static final Set<String> DYNAMIC_EXTENSIONS = Set.of("gif", "webp", "apng", "mp4", "webm", "mov");
    private static final Set<String> AUDIO_EXTENSIONS = Set.of("mp3", "wav", "ogg", "flac", "aac", "m4a");
    private static final Set<String> VIDEO_EXTENSIONS = Set.of("mp4", "webm", "mov");
    private static final Duration WORKSHOP_DIRECT_DOWNLOAD_TIMEOUT = Duration.ofSeconds(90);
    private static final long DOWNLOAD_PROGRESS_PERSIST_BYTES = 256L * 1024L;
    private static final long DOWNLOAD_PROGRESS_PERSIST_NANOS = TimeUnit.MILLISECONDS.toNanos(500L);

    private final ObjectStorageClient objectStorageClient;
    private final MediaStorageProperties mediaStorageProperties;
    private final OssProperties ossProperties;
    private final WallpaperWorkshopProperties workshopProperties;
    private final MediaAssetMapper mediaAssetMapper;
    private final MediaL2dPackageMapper mediaL2dPackageMapper;
    private final MediaWallpaperProfileMapper wallpaperProfileMapper;
    private final MediaWallpaperImportJobMapper wallpaperImportJobMapper;
    private final L2dZipValidator l2dZipValidator;
    private final ObjectMapper objectMapper;
    private final TransactionTemplate transactionTemplate;
    private final WorkshopImportWorker workshopImportWorker;
    private final WorkshopMetadataProvider workshopMetadataProvider;
    private final WallpaperOutboundClient outboundClient;
    private final WorkshopDownloadChannelResolver downloadChannelResolver;
    private final SteamCmdProcessRunner steamCmdProcessRunner = new SteamCmdProcessRunner();

    public WallpaperServiceImpl(ObjectStorageClient objectStorageClient,
                                MediaStorageProperties mediaStorageProperties,
                                OssProperties ossProperties,
                                WallpaperWorkshopProperties workshopProperties,
                                MediaAssetMapper mediaAssetMapper,
                                MediaL2dPackageMapper mediaL2dPackageMapper,
                                MediaWallpaperProfileMapper wallpaperProfileMapper,
                                MediaWallpaperImportJobMapper wallpaperImportJobMapper,
                                L2dZipValidator l2dZipValidator,
                                ObjectMapper objectMapper,
                                TransactionTemplate transactionTemplate,
                                WorkshopImportWorker workshopImportWorker,
                                WorkshopMetadataProvider workshopMetadataProvider,
                                WallpaperOutboundClient outboundClient,
                                WorkshopDownloadChannelResolver downloadChannelResolver) {
        this.objectStorageClient = objectStorageClient;
        this.mediaStorageProperties = mediaStorageProperties;
        this.ossProperties = ossProperties;
        this.workshopProperties = workshopProperties;
        this.mediaAssetMapper = mediaAssetMapper;
        this.mediaL2dPackageMapper = mediaL2dPackageMapper;
        this.wallpaperProfileMapper = wallpaperProfileMapper;
        this.wallpaperImportJobMapper = wallpaperImportJobMapper;
        this.l2dZipValidator = l2dZipValidator;
        this.objectMapper = objectMapper;
        this.transactionTemplate = transactionTemplate;
        this.workshopImportWorker = workshopImportWorker;
        this.workshopMetadataProvider = workshopMetadataProvider;
        this.outboundClient = outboundClient;
        this.downloadChannelResolver = downloadChannelResolver;
    }

    @Override
    public WallpaperImportJobResponse importPackage(MultipartFile file, String visibilityRaw, String titleRaw) {
        Long userId = requireLoginUserId();
        LoginUser loginUser = currentLoginUser();
        AssetVisibilityEnum visibility = AssetVisibilityEnum.fromName(visibilityRaw, AssetVisibilityEnum.PRIVATE);
        if (file == null || file.isEmpty()) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Upload file is required");
        }

        MediaWallpaperImportJobEntity job = createJob(
            userId,
            WallpaperImportSourceEnum.PACKAGE,
            null,
            null,
            visibility,
            WallpaperImportStatusEnum.RUNNING,
            writeJson(Map.of("fileName", readString(file.getOriginalFilename(), "upload.zip")))
        );

        try {
            DetectedPackage detected = detectFromUpload(file);
            String title = StringUtils.hasText(titleRaw)
                ? titleRaw.trim()
                : defaultTitleByFileName(file.getOriginalFilename(), detected.sceneType());
            ImportedWallpaper imported = persistDetectedWallpaper(
                userId,
                visibility,
                title,
                detected,
                WallpaperImportSourceEnum.PACKAGE,
                null,
                isAdmin(loginUser)
            );
            finishJob(job.getId(), WallpaperImportStatusEnum.SUCCEEDED, imported.wallpaperId(), null, null);
            return getImportJob(job.getId());
        } catch (BusinessException businessException) {
            finishJob(job.getId(), WallpaperImportStatusEnum.FAILED, null, businessException.getMessage(), null);
            throw businessException;
        } catch (Exception exception) {
            LOGGER.error("Wallpaper package import failed: fileName={}", file.getOriginalFilename(), exception);
            finishJob(job.getId(), WallpaperImportStatusEnum.FAILED, null, "Package import failed", null);
            throw new BusinessException(ErrorCode.INTERNAL_ERROR, "Package import failed");
        }
    }

    @Override
    public WallpaperImportJobResponse importWorkshop(WorkshopImportCreateRequest request) {
        Long userId = requireLoginUserId();
        AssetVisibilityEnum visibility = AssetVisibilityEnum.fromName(
            request == null ? null : request.getVisibility(),
            AssetVisibilityEnum.PRIVATE
        );
        String workshopUrl = request == null ? "" : readString(request.getWorkshopUrl(), "");
        if (!StringUtils.hasText(workshopUrl)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "workshop_url is required");
        }
        String workshopItemId = resolveWorkshopItemId(workshopUrl);

        Map<String, Object> payload = new LinkedHashMap<>();
        payload.put("titleOverride", request == null ? "" : readString(request.getTitle(), ""));
        payload.put("requestedAt", LocalDateTime.now().toString());

        MediaWallpaperImportJobEntity job = createJob(
            userId,
            WallpaperImportSourceEnum.WORKSHOP,
            workshopUrl,
            workshopItemId,
            visibility,
            WallpaperImportStatusEnum.PENDING,
            writeJson(payload)
        );

        workshopImportWorker.submit(() -> handleWorkshopImport(job.getId(), userId, workshopUrl, workshopItemId, visibility, request));
        return toJobResponse(job);
    }

    @Override
    public WallpaperImportJobResponse getImportJob(Long jobId) {
        MediaWallpaperImportJobEntity job = wallpaperImportJobMapper.selectById(jobId);
        if (job == null) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "Import job not found");
        }
        LoginUser loginUser = currentLoginUser();
        if (loginUser == null || (!isAdmin(loginUser) && !job.getOwnerUserId().equals(loginUser.getUserId()))) {
            throw new BusinessException(ErrorCode.FORBIDDEN, "No permission to view this import job");
        }
        return toJobResponse(job);
    }

    @Override
    public List<WallpaperProfileResponse> listLibrary(String scopeRaw) {
        String scope = readString(scopeRaw, "my").toLowerCase(Locale.ROOT);
        LoginUser loginUser = currentLoginUser();
        Long userId = loginUser == null ? null : loginUser.getUserId();

        LambdaQueryWrapper<MediaWallpaperProfileEntity> wrapper = new LambdaQueryWrapper<MediaWallpaperProfileEntity>()
            .eq(MediaWallpaperProfileEntity::getEnabledFlag, 1)
            .orderByDesc(MediaWallpaperProfileEntity::getId);

        switch (scope) {
            case "public" -> wrapper
                .eq(MediaWallpaperProfileEntity::getVisibilityCode, AssetVisibilityEnum.PUBLIC.getCode())
                .eq(MediaWallpaperProfileEntity::getAuditStatus, AssetAuditStatusEnum.APPROVED.name());
            case "all" -> {
                if (userId == null || userId <= 0) {
                    wrapper
                        .eq(MediaWallpaperProfileEntity::getVisibilityCode, AssetVisibilityEnum.PUBLIC.getCode())
                        .eq(MediaWallpaperProfileEntity::getAuditStatus, AssetAuditStatusEnum.APPROVED.name());
                } else {
                    wrapper.and(w -> w
                        .eq(MediaWallpaperProfileEntity::getOwnerUserId, userId)
                        .or(q -> q
                            .eq(MediaWallpaperProfileEntity::getVisibilityCode, AssetVisibilityEnum.PUBLIC.getCode())
                            .eq(MediaWallpaperProfileEntity::getAuditStatus, AssetAuditStatusEnum.APPROVED.name())
                        )
                    );
                }
            }
            case "my" -> {
                if (userId == null || userId <= 0) {
                    throw new BusinessException(ErrorCode.UNAUTHORIZED, "Login required");
                }
                wrapper.eq(MediaWallpaperProfileEntity::getOwnerUserId, userId);
            }
            default -> throw new BusinessException(ErrorCode.BAD_REQUEST, "Unsupported scope: " + scopeRaw);
        }

        List<MediaWallpaperProfileEntity> profiles = wallpaperProfileMapper.selectList(wrapper);
        return toWallpaperResponses(profiles, loginUser, true);
    }

    @Override
    public List<WallpaperProfileResponse> listPublicWallpapers() {
        List<MediaWallpaperProfileEntity> profiles = wallpaperProfileMapper.selectList(
            new LambdaQueryWrapper<MediaWallpaperProfileEntity>()
                .eq(MediaWallpaperProfileEntity::getEnabledFlag, 1)
                .eq(MediaWallpaperProfileEntity::getVisibilityCode, AssetVisibilityEnum.PUBLIC.getCode())
                .eq(MediaWallpaperProfileEntity::getAuditStatus, AssetAuditStatusEnum.APPROVED.name())
                .orderByDesc(MediaWallpaperProfileEntity::getId)
        );
        return toWallpaperResponses(profiles, currentLoginUser(), false);
    }

    @Override
    public WallpaperProfileResponse updateWallpaperSettings(Long wallpaperId, WallpaperSettingsUpdateRequest request) {
        Long userId = requireLoginUserId();
        LoginUser loginUser = currentLoginUser();
        MediaWallpaperProfileEntity profile = wallpaperProfileMapper.selectById(wallpaperId);
        if (profile == null) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "Wallpaper not found");
        }
        if (!profile.getOwnerUserId().equals(userId) && !isAdmin(loginUser)) {
            throw new BusinessException(ErrorCode.FORBIDDEN, "No permission to update this wallpaper");
        }

        if (request.getTitle() != null) {
            String title = readString(request.getTitle(), "").trim();
            if (!StringUtils.hasText(title)) {
                throw new BusinessException(ErrorCode.BAD_REQUEST, "Wallpaper title cannot be blank");
            }
            profile.setTitleText(title);
        }

        if (request.getEmbeddedBgmAssetId() != null) {
            if (request.getEmbeddedBgmAssetId() <= 0) {
                profile.setEmbeddedBgmAssetId(null);
            } else {
                ensureAssetExists(request.getEmbeddedBgmAssetId());
                profile.setEmbeddedBgmAssetId(request.getEmbeddedBgmAssetId());
            }
        }
        if (request.getEmbeddedBgvAssetId() != null) {
            if (request.getEmbeddedBgvAssetId() <= 0) {
                profile.setEmbeddedBgvAssetId(null);
            } else {
                ensureAssetExists(request.getEmbeddedBgvAssetId());
                profile.setEmbeddedBgvAssetId(request.getEmbeddedBgvAssetId());
            }
        }
        if (request.getDefaultMasterVolume() != null) {
            profile.setDefaultMasterVolume(clampVolume(request.getDefaultMasterVolume()));
        }
        if (request.getDefaultBgmVolume() != null) {
            profile.setDefaultBgmVolume(clampVolume(request.getDefaultBgmVolume()));
        }
        if (request.getDefaultBgvVolume() != null) {
            profile.setDefaultBgvVolume(clampVolume(request.getDefaultBgvVolume()));
        }

        Map<String, Object> customDefaults = readJsonMap(profile.getCustomDefaultsJson());
        if (request.getBgmEnabled() != null) {
            customDefaults.put("bgmEnabled", request.getBgmEnabled());
        }
        if (request.getBgvEnabled() != null) {
            customDefaults.put("bgvEnabled", request.getBgvEnabled());
        }
        if (request.getCustomSchema() != null) {
            profile.setCustomSchemaJson(writeJson(request.getCustomSchema()));
        }
        if (request.getCustomDefaults() != null) {
            customDefaults.putAll(request.getCustomDefaults());
        }
        profile.setCustomDefaultsJson(writeJson(customDefaults));
        profile.setUpdatedAt(LocalDateTime.now());
        wallpaperProfileMapper.updateById(profile);

        return fetchWallpaperResponse(profile.getId(), loginUser);
    }

    @Override
    public void deleteWallpaper(Long wallpaperId) {
        Long userId = requireLoginUserId();
        LoginUser loginUser = currentLoginUser();
        MediaWallpaperProfileEntity profile = wallpaperProfileMapper.selectById(wallpaperId);
        if (profile == null) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "Wallpaper not found");
        }
        if (!profile.getOwnerUserId().equals(userId) && !isAdmin(loginUser)) {
            throw new BusinessException(ErrorCode.FORBIDDEN, "No permission to delete this wallpaper");
        }

        transactionTemplate.executeWithoutResult(status -> {
            deleteWallpaperManagedAsset(profile.getVisualAssetId());
            deleteWallpaperManagedAsset(profile.getEmbeddedBgmAssetId());
            deleteWallpaperManagedAsset(profile.getEmbeddedBgvAssetId());
            wallpaperProfileMapper.deleteById(profile.getId());
        });
    }

    @Override
    public WallpaperProfileResponse updateWallpaperVisibility(Long wallpaperId, WallpaperVisibilityUpdateRequest request) {
        Long userId = requireLoginUserId();
        LoginUser loginUser = currentLoginUser();
        MediaWallpaperProfileEntity profile = wallpaperProfileMapper.selectById(wallpaperId);
        if (profile == null) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "Wallpaper not found");
        }
        if (!profile.getOwnerUserId().equals(userId) && !isAdmin(loginUser)) {
            throw new BusinessException(ErrorCode.FORBIDDEN, "No permission to update this wallpaper");
        }

        AssetVisibilityEnum visibility = AssetVisibilityEnum.fromName(request.getVisibility(), AssetVisibilityEnum.PRIVATE);
        boolean admin = isAdmin(loginUser);
        String nextAuditStatus = resolveAuditStatus(visibility, admin);
        migrateWallpaperAssets(profile, visibility, nextAuditStatus, profile.getOwnerUserId());

        profile.setVisibilityCode(visibility.getCode());
        profile.setAuditStatus(nextAuditStatus);
        profile.setUpdatedAt(LocalDateTime.now());
        wallpaperProfileMapper.updateById(profile);

        return fetchWallpaperResponse(profile.getId(), loginUser);
    }

    @Override
    public List<WallpaperProfileResponse> listPendingWallpapers() {
        List<MediaWallpaperProfileEntity> profiles = wallpaperProfileMapper.selectList(
            new LambdaQueryWrapper<MediaWallpaperProfileEntity>()
                .eq(MediaWallpaperProfileEntity::getEnabledFlag, 1)
                .eq(MediaWallpaperProfileEntity::getAuditStatus, AssetAuditStatusEnum.PENDING_AUDIT.name())
                .orderByDesc(MediaWallpaperProfileEntity::getId)
        );
        return toWallpaperResponses(profiles, currentLoginUser(), true);
    }

    @Override
    public AdminWallpaperAuditResponse auditWallpaper(Long wallpaperId, AdminWallpaperAuditRequest request) {
        MediaWallpaperProfileEntity profile = wallpaperProfileMapper.selectById(wallpaperId);
        if (profile == null) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "Wallpaper not found");
        }

        String auditStatus = AssetAuditStatusEnum.fromName(request.getAuditStatus()).name();
        AssetVisibilityEnum visibility = StringUtils.hasText(request.getVisibility())
            ? AssetVisibilityEnum.fromName(request.getVisibility(), AssetVisibilityEnum.PRIVATE)
            : AssetVisibilityEnum.fromCode(profile.getVisibilityCode());

        migrateWallpaperAssets(profile, visibility, auditStatus, profile.getOwnerUserId());

        profile.setAuditStatus(auditStatus);
        profile.setVisibilityCode(visibility.getCode());
        profile.setUpdatedAt(LocalDateTime.now());
        wallpaperProfileMapper.updateById(profile);

        return new AdminWallpaperAuditResponse(
            profile.getId(),
            auditStatus,
            visibility.name(),
            readString(profile.getSceneType(), WallpaperSceneTypeEnum.STATIC.name()),
            Integer.valueOf(1).equals(profile.getEnabledFlag())
        );
    }

    void handleWorkshopImport(Long jobId,
                              Long userId,
                              String workshopUrl,
                              String workshopItemId,
                              AssetVisibilityEnum visibility,
                              WorkshopImportCreateRequest request) {
        markJobRunning(jobId);
        try {
            WorkshopMetadataProvider.WorkshopMetadata workshopMeta =
                workshopMetadataProvider.resolve(workshopItemId);
            DetectedPackage detected = null;
            String requestedTitle = request == null ? "" : readString(request.getTitle(), "");
            String sourceTitle = StringUtils.hasText(requestedTitle)
                ? requestedTitle
                : readString(workshopMeta.title(), "Workshop-" + workshopItemId);
            BusinessException directDownloadFailure = null;
            if (StringUtils.hasText(workshopMeta.fileUrl())) {
                markJobProgress(jobId, WallpaperImportProgressStageEnum.DOWNLOADING);
                try {
                    detected = downloadWorkshopByFileUrl(jobId, workshopMeta, workshopItemId);
                    markJobProgress(jobId, WallpaperImportProgressStageEnum.INSPECTING);
                } catch (BusinessException exception) {
                    directDownloadFailure = exception;
                }
            }
            WorkshopDownloadChannelResolver.ChannelState steamCmdChannel =
                downloadChannelResolver.resolve(false);
            if (detected == null && steamCmdChannel.available()) {
                markJobProgress(jobId, WallpaperImportProgressStageEnum.DOWNLOADING);
                DetectedPackage steamDownloaded = downloadWorkshopBySteamCmd(jobId, workshopItemId);
                markJobProgress(jobId, WallpaperImportProgressStageEnum.INSPECTING);
                detected = steamDownloaded;
            }
            if (detected == null) {
                finishJob(
                    jobId,
                    WallpaperImportStatusEnum.FALLBACK_REQUIRED,
                    null,
                    directDownloadFailure == null
                        ? steamCmdChannel.message()
                        : directDownloadFailure.getMessage(),
                    "请检查下载通道或改用本地包上传导入"
                );
                return;
            }

            markJobProgress(jobId, WallpaperImportProgressStageEnum.PERSISTING);
            ImportedWallpaper imported = persistDetectedWallpaper(
                userId,
                visibility,
                sourceTitle,
                detected,
                WallpaperImportSourceEnum.WORKSHOP,
                workshopItemId,
                false
            );
            finishJob(jobId, WallpaperImportStatusEnum.SUCCEEDED, imported.wallpaperId(), null, null);
        } catch (BusinessException businessException) {
            finishJob(jobId, WallpaperImportStatusEnum.FALLBACK_REQUIRED, null, businessException.getMessage(), "请改用本地包上传导入");
        } catch (Exception exception) {
            finishJob(jobId, WallpaperImportStatusEnum.FAILED, null, "Workshop import failed", "请改用本地包上传导入");
        }
    }

    private ImportedWallpaper persistDetectedWallpaper(Long userId,
                                                       AssetVisibilityEnum visibility,
                                                       String title,
                                                       DetectedPackage detected,
                                                       WallpaperImportSourceEnum source,
                                                       String workshopItemId,
                                                       boolean forceApproved) {
        String auditStatus = resolveAuditStatus(visibility, forceApproved);
        return transactionTemplate.execute(status -> {
            Long visualAssetId = persistAsset(userId, visibility, detected.visual(), auditStatus, detected.l2dValidation());
            Long bgmAssetId = detected.bgm() == null ? null : persistAsset(userId, visibility, detected.bgm(), auditStatus, null);
            Long bgvAssetId = detected.bgv() == null ? null : persistAsset(userId, visibility, detected.bgv(), auditStatus, null);

            MediaWallpaperProfileEntity profile = new MediaWallpaperProfileEntity();
            profile.setOwnerUserId(userId);
            profile.setTitleText(readString(title, "壁纸-" + UUID.randomUUID().toString().substring(0, 8)));
            profile.setVisualAssetId(visualAssetId);
            profile.setSceneType(detected.sceneType().name());
            profile.setEmbeddedBgmAssetId(bgmAssetId);
            profile.setEmbeddedBgvAssetId(bgvAssetId);
            profile.setDefaultMasterVolume(new BigDecimal("1.00"));
            profile.setDefaultBgmVolume(new BigDecimal("1.00"));
            profile.setDefaultBgvVolume(new BigDecimal("1.00"));
            profile.setCustomSchemaJson(writeJson(Map.of()));
            profile.setCustomDefaultsJson(writeJson(Map.of(
                "bgmEnabled", bgmAssetId != null,
                "bgvEnabled", bgvAssetId != null
            )));
            profile.setVisibilityCode(visibility.getCode());
            profile.setAuditStatus(auditStatus);
            profile.setImportSource(source.name());
            profile.setWorkshopItemId(readString(workshopItemId, null));
            profile.setEnabledFlag(1);
            profile.setCreatedAt(LocalDateTime.now());
            profile.setUpdatedAt(LocalDateTime.now());
            wallpaperProfileMapper.insert(profile);
            return new ImportedWallpaper(profile.getId());
        });
    }

    private Long persistAsset(Long userId,
                              AssetVisibilityEnum visibility,
                              DetectedAsset detectedAsset,
                              String auditStatus,
                              L2dValidationResult l2dValidationResult) {
        String bucket = bucketByVisibility(visibility);
        String extension = extensionByFileName(detectedAsset.fileName());
        String key = OssKeyBuilder.build("assets", "user-" + userId, userId, extension);

        StorageObjectMetadata metadata = new StorageObjectMetadata();
        metadata.setContentType(detectedAsset.contentType());
        try (InputStream inputStream = detectedAsset.openStream()) {
            metadata.setContentLength(detectedAsset.contentLength());
            objectStorageClient.putObject(bucket, key, inputStream, metadata);
        } catch (IOException exception) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "读取已下载壁纸文件失败，请重试");
        }

        MediaAssetEntity asset = new MediaAssetEntity();
        asset.setUserId(userId);
        asset.setBucketName(bucket);
        asset.setObjectKey(key);
        asset.setAssetType(detectedAsset.assetKind().name());
        asset.setAssetKindCode(detectedAsset.assetKind().getCode());
        asset.setVisibilityCode(visibility.getCode());
        asset.setHomeEnabledFlag(0);
        asset.setHomeSortNum(0);
        asset.setContentTypeText(detectedAsset.contentType());
        asset.setMetadataJson(writeJson(Map.of(
            "fileName", detectedAsset.fileName(),
            "wallpaper", true,
            "source", "wallpaper_import"
        )));
        asset.setAuditStatus(auditStatus);
        asset.setCreatedAt(LocalDateTime.now());
        asset.setUpdatedAt(LocalDateTime.now());
        mediaAssetMapper.insert(asset);

        if (l2dValidationResult != null && detectedAsset.assetKind() == AssetKindEnum.LIVE2D_PACKAGE) {
            MediaL2dPackageEntity l2d = new MediaL2dPackageEntity();
            l2d.setAssetId(asset.getId());
            l2d.setEntryModelJson(l2dValidationResult.getEntryModelJson());
            l2d.setMocPath(l2dValidationResult.getMocPath());
            l2d.setTextureCount(l2dValidationResult.getTextureCount());
            l2d.setMotionGroupCount(l2dValidationResult.getMotionGroupCount());
            l2d.setExpressionCount(l2dValidationResult.getExpressionCount());
            l2d.setHasPhysicsFlag(l2dValidationResult.isHasPhysics());
            l2d.setHasPoseFlag(l2dValidationResult.isHasPose());
            l2d.setValidationCode(L2dValidationEnum.PASSED.getCode());
            l2d.setReferencesJson(writeJson(l2dValidationResult.getReferences()));
            l2d.setCreatedAt(LocalDateTime.now());
            l2d.setUpdatedAt(LocalDateTime.now());
            mediaL2dPackageMapper.insert(l2d);
        }
        return asset.getId();
    }

    private DetectedPackage detectFromUpload(MultipartFile file) {
        String fileName = readString(file.getOriginalFilename(), "upload.bin");
        String extension = extensionByFileName(fileName);
        byte[] bytes;
        try {
            bytes = file.getBytes();
        } catch (IOException exception) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Read upload file failed");
        }
        if (bytes.length <= 0 || bytes.length > mediaStorageProperties.getMaxUploadSize()) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Upload file size is invalid");
        }

        if ("zip".equals(extension)) {
            L2dValidationResult l2dValidation = tryValidateL2d(bytes);
            if (l2dValidation != null) {
                return new DetectedPackage(
                    WallpaperSceneTypeEnum.L2D,
                    new DetectedAsset(fileName, "application/zip", AssetKindEnum.LIVE2D_PACKAGE, bytes),
                    null,
                    null,
                    l2dValidation
                );
            }
            return detectFromZipEntries(fileName, bytes);
        }

        AssetKindEnum visualKind = classifyVisualKindByExtension(extension);
        if (visualKind == null) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Unsupported wallpaper visual type");
        }
        WallpaperSceneTypeEnum sceneType = visualKind == AssetKindEnum.ANIMATED_IMAGE
            ? WallpaperSceneTypeEnum.DYNAMIC
            : WallpaperSceneTypeEnum.STATIC;
        return new DetectedPackage(
            sceneType,
            new DetectedAsset(fileName, contentTypeByExtension(extension, visualKind), visualKind, bytes),
            null,
            null,
            null
        );
    }

    private DetectedPackage detectFromZipEntries(String fileName, byte[] zipBytes) {
        return detectFromZipEntries(fileName, zipBytes, false);
    }

    private DetectedPackage detectFromZipEntries(String fileName,
                                                 byte[] zipBytes,
                                                 boolean excludeWorkshopPresentationAssets) {
        DetectedAsset visual = null;
        DetectedAsset bgm = null;
        DetectedAsset bgv = null;
        boolean containsNativeWallpaperEngineResource = false;

        try (ZipInputStream zipInputStream = new ZipInputStream(new ByteArrayInputStream(zipBytes), StandardCharsets.UTF_8)) {
            ZipEntry entry;
            while ((entry = zipInputStream.getNextEntry()) != null) {
                if (entry.isDirectory()) {
                    continue;
                }
                String entryName = readString(entry.getName(), "").replace('\\', '/');
                String ext = extensionByFileName(entryName);
                if (!StringUtils.hasText(ext)) {
                    continue;
                }
                containsNativeWallpaperEngineResource |= isNativeWallpaperEngineResource(entryName, ext);
                byte[] bytes = readZipEntryBytes(zipInputStream, mediaStorageProperties.getMaxUploadSize());
                if (bytes.length <= 0) {
                    continue;
                }

                AssetKindEnum visualKind = classifyVisualKindByExtension(ext);
                if (visualKind != null) {
                    if (excludeWorkshopPresentationAssets && isWorkshopPresentationFileName(entryName)) {
                        continue;
                    }
                    DetectedAsset candidate = new DetectedAsset(
                        sanitizeZipFileName(entryName),
                        contentTypeByExtension(ext, visualKind),
                        visualKind,
                        bytes
                    );
                    if (shouldReplaceVisual(visual, candidate.assetKind())) {
                        visual = candidate;
                    }
                    continue;
                }
                if (AUDIO_EXTENSIONS.contains(ext) && bgm == null) {
                    bgm = new DetectedAsset(
                        sanitizeZipFileName(entryName),
                        contentTypeByExtension(ext, AssetKindEnum.AUDIO),
                        AssetKindEnum.AUDIO,
                        bytes
                    );
                    continue;
                }
                if (VIDEO_EXTENSIONS.contains(ext) && bgv == null) {
                    bgv = new DetectedAsset(
                        sanitizeZipFileName(entryName),
                        contentTypeByExtension(ext, AssetKindEnum.ANIMATED_IMAGE),
                        AssetKindEnum.ANIMATED_IMAGE,
                        bytes
                    );
                }
            }
        } catch (IOException exception) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Invalid zip package");
        }

        if (visual == null) {
            if (excludeWorkshopPresentationAssets && containsNativeWallpaperEngineResource) {
                throw new BusinessException(
                    ErrorCode.BAD_REQUEST,
                    "Wallpaper Engine native scene requires conversion before it can be used on this site"
                );
            }
            throw new BusinessException(ErrorCode.BAD_REQUEST, "No usable visual resource found in package");
        }

        WallpaperSceneTypeEnum sceneType = visual.assetKind() == AssetKindEnum.ANIMATED_IMAGE
            ? WallpaperSceneTypeEnum.DYNAMIC
            : WallpaperSceneTypeEnum.STATIC;

        return new DetectedPackage(sceneType, visual, bgm, bgv, null);
    }

    DetectedPackage detectFromDirectory(Path dir) {
        if (dir == null || !Files.exists(dir) || !Files.isDirectory(dir)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Workshop download directory is missing");
        }

        try {
            List<Path> files;
            try (java.util.stream.Stream<Path> paths = Files.walk(dir)) {
                files = paths.filter(Files::isRegularFile)
                    .sorted(Comparator.comparing(Path::toString))
                    .toList();
            }
            if (files.isEmpty()) {
                throw new BusinessException(ErrorCode.BAD_REQUEST, "Workshop package has no files");
            }

            Path l2dModel = files.stream()
                .filter(path -> path.getFileName().toString().toLowerCase(Locale.ROOT).endsWith(".model3.json"))
                .findFirst()
                .orElse(null);
            if (l2dModel != null) {
                byte[] zipBytes = zipDirectory(dir);
                L2dValidationResult result = tryValidateL2d(zipBytes);
                if (result != null) {
                    return new DetectedPackage(
                        WallpaperSceneTypeEnum.L2D,
                        new DetectedAsset(dir.getFileName().toString() + ".zip", "application/zip", AssetKindEnum.LIVE2D_PACKAGE, zipBytes),
                        null,
                        null,
                        result
                    );
                }
            }

            DetectedAsset visual = null;
            DetectedAsset bgm = null;
            DetectedAsset bgv = null;
            boolean containsNativeWallpaperEngineResource = false;
            long maxAssetBytes = Math.max(1L, workshopProperties.getMaxImportAssetBytes());
            long oversizedVisualBytes = 0L;

            for (Path path : files) {
                String extension = extensionByFileName(path.getFileName().toString());
                if (!StringUtils.hasText(extension)) {
                    continue;
                }
                containsNativeWallpaperEngineResource |= isNativeWallpaperEngineResource(path, extension);
                if (isWorkshopPresentationAsset(path)) {
                    continue;
                }
                AssetKindEnum visualKind = classifyVisualKindByExtension(extension);
                if (visualKind == null && !AUDIO_EXTENSIONS.contains(extension)
                    && !VIDEO_EXTENSIONS.contains(extension)) {
                    continue;
                }
                long fileSize = Files.size(path);
                if (fileSize <= 0L) {
                    continue;
                }
                if (fileSize > maxAssetBytes) {
                    if (visualKind != null) {
                        oversizedVisualBytes = Math.max(oversizedVisualBytes, fileSize);
                    }
                    continue;
                }
                if (visualKind != null) {
                    DetectedAsset candidate = new DetectedAsset(
                        path.getFileName().toString(),
                        contentTypeByExtension(extension, visualKind),
                        visualKind,
                        null,
                        path
                    );
                    if (shouldReplaceVisual(visual, candidate.assetKind())) {
                        visual = candidate;
                    }
                    continue;
                }
                if (AUDIO_EXTENSIONS.contains(extension) && bgm == null) {
                    bgm = new DetectedAsset(path.getFileName().toString(), contentTypeByExtension(extension, AssetKindEnum.AUDIO), AssetKindEnum.AUDIO, null, path);
                    continue;
                }
                if (VIDEO_EXTENSIONS.contains(extension) && bgv == null) {
                    bgv = new DetectedAsset(path.getFileName().toString(), contentTypeByExtension(extension, AssetKindEnum.ANIMATED_IMAGE), AssetKindEnum.ANIMATED_IMAGE, null, path);
                }
            }

            if (visual == null) {
                if (oversizedVisualBytes > 0L) {
                    throw new BusinessException(ErrorCode.BAD_REQUEST,
                        "壁纸文件过大（" + formatImportSize(oversizedVisualBytes)
                            + "），工坊导入上限为 " + formatImportSize(maxAssetBytes));
                }
                if (containsNativeWallpaperEngineResource) {
                    throw new BusinessException(
                        ErrorCode.BAD_REQUEST,
                        "Wallpaper Engine native scene requires conversion before it can be used on this site"
                    );
                }
                throw new BusinessException(ErrorCode.BAD_REQUEST, "Workshop package has no usable visual resource");
            }
            WallpaperSceneTypeEnum sceneType = visual.assetKind() == AssetKindEnum.ANIMATED_IMAGE
                ? WallpaperSceneTypeEnum.DYNAMIC
                : WallpaperSceneTypeEnum.STATIC;
            return new DetectedPackage(sceneType, visual, bgm, bgv, null);
        } catch (IOException exception) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Read workshop package failed");
        }
    }

    private String formatImportSize(long bytes) {
        return bytes < 1024L * 1024L ? bytes + " B"
            : String.format(Locale.ROOT, "%.1f MiB", bytes / (1024.0 * 1024.0));
    }

    private boolean isWorkshopPresentationAsset(Path path) {
        return isWorkshopPresentationFileName(
            path == null || path.getFileName() == null ? null : path.getFileName().toString()
        );
    }

    private boolean isWorkshopPresentationFileName(String rawFileName) {
        String fileName = readString(rawFileName, "").replace('\\', '/');
        int separatorIndex = fileName.lastIndexOf('/');
        if (separatorIndex >= 0) {
            fileName = fileName.substring(separatorIndex + 1);
        }
        fileName = fileName.toLowerCase(Locale.ROOT);
        int extensionIndex = fileName.lastIndexOf('.');
        String baseName = extensionIndex > 0 ? fileName.substring(0, extensionIndex) : fileName;
        return Set.of("preview", "thumbnail", "thumb", "cover").contains(baseName);
    }

    private boolean isNativeWallpaperEngineResource(Path path, String extension) {
        return isNativeWallpaperEngineResource(
            path == null || path.getFileName() == null ? null : path.getFileName().toString(),
            extension
        );
    }

    private boolean isNativeWallpaperEngineResource(String rawFileName, String extension) {
        String fileName = readString(rawFileName, "").replace('\\', '/');
        int separatorIndex = fileName.lastIndexOf('/');
        if (separatorIndex >= 0) {
            fileName = fileName.substring(separatorIndex + 1);
        }
        fileName = fileName.toLowerCase(Locale.ROOT);
        return "scene.json".equals(fileName) || "pkg".equals(readString(extension, "").toLowerCase(Locale.ROOT));
    }

    private L2dValidationResult tryValidateL2d(byte[] zipBytes) {
        try {
            return l2dZipValidator.validate(new ByteArrayInputStream(zipBytes));
        } catch (Exception ignore) {
            return null;
        }
    }

    private void markJobRunning(Long jobId) {
        updateJobProgress(jobId, WallpaperImportStatusEnum.RUNNING, WallpaperImportProgressStageEnum.RESOLVING, true);
    }

    private void markJobProgress(Long jobId, WallpaperImportProgressStageEnum progressStage) {
        updateJobProgress(jobId, WallpaperImportStatusEnum.RUNNING, progressStage, false);
    }

    private void updateJobProgress(Long jobId,
                                   WallpaperImportStatusEnum status,
                                   WallpaperImportProgressStageEnum progressStage,
                                   boolean clearDiagnostics) {
        MediaWallpaperImportJobEntity job = wallpaperImportJobMapper.selectById(jobId);
        if (job == null) {
            return;
        }
        job.setStatusText(status.name());
        job.setProgressStage(progressStage.name());
        job.setProgressPercent(progressStage.getPercent());
        if (clearDiagnostics) {
            job.setErrorMessage(null);
            job.setFallbackHint(null);
        }
        job.setUpdatedAt(LocalDateTime.now());
        wallpaperImportJobMapper.updateById(job);
    }

    private void updateDownloadBytes(Long jobId, long downloadedBytes, Long totalBytes) {
        MediaWallpaperImportJobEntity job = wallpaperImportJobMapper.selectById(jobId);
        if (job == null) {
            return;
        }
        job.setDownloadedBytes(Math.max(0L, downloadedBytes));
        job.setTotalBytes(totalBytes != null && totalBytes > 0L ? totalBytes : null);
        job.setUpdatedAt(LocalDateTime.now());
        wallpaperImportJobMapper.updateById(job);
    }

    private void finishJob(Long jobId,
                           WallpaperImportStatusEnum status,
                           Long wallpaperId,
                           String errorMessage,
                           String fallbackHint) {
        MediaWallpaperImportJobEntity job = wallpaperImportJobMapper.selectById(jobId);
        if (job == null) {
            return;
        }
        job.setStatusText(status.name());
        WallpaperImportProgressStageEnum progressStage = terminalProgressStage(status);
        job.setProgressStage(progressStage.name());
        job.setProgressPercent(progressStage.getPercent());
        job.setWallpaperId(wallpaperId);
        job.setErrorMessage(readString(errorMessage, null));
        job.setFallbackHint(readString(fallbackHint, null));
        job.setUpdatedAt(LocalDateTime.now());
        wallpaperImportJobMapper.updateById(job);
    }

    private MediaWallpaperImportJobEntity createJob(Long userId,
                                                    WallpaperImportSourceEnum source,
                                                    String workshopUrl,
                                                    String workshopItemId,
                                                    AssetVisibilityEnum visibility,
                                                    WallpaperImportStatusEnum status,
                                                    String payloadJson) {
        MediaWallpaperImportJobEntity job = new MediaWallpaperImportJobEntity();
        job.setOwnerUserId(userId);
        job.setSourceType(source.name());
        job.setWorkshopUrl(workshopUrl);
        job.setWorkshopItemId(workshopItemId);
        job.setStatusText(status.name());
        job.setProgressStage(WallpaperImportProgressStageEnum.QUEUED.name());
        job.setProgressPercent(WallpaperImportProgressStageEnum.QUEUED.getPercent());
        job.setVisibilityCode(visibility.getCode());
        job.setPayloadJson(payloadJson);
        job.setCreatedAt(LocalDateTime.now());
        job.setUpdatedAt(LocalDateTime.now());
        wallpaperImportJobMapper.insert(job);
        return job;
    }

    private String resolveWorkshopItemId(String workshopUrl) {
        Matcher matcher = WORKSHOP_ID_PATTERN.matcher(workshopUrl);
        if (!matcher.find()) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Invalid workshop url");
        }
        return matcher.group(1);
    }

    private DetectedPackage downloadWorkshopBySteamCmd(Long jobId, String workshopItemId) {
        Path downloaded;
        DetectedPackage[] validatedDownloadContent = new DetectedPackage[1];
        BusinessException[] inspectionFailure = new BusinessException[1];
        try {
            Path root = Paths.get(readString(workshopProperties.getDownloadRoot(), "/tmp/steam-workshop"));
            Files.createDirectories(root);
            downloaded = workshopItemDirectory(root, workshopItemId);
            long[] lastObservedBytes = {Math.max(0L, directoryByteSize(downloaded))};
            updateDownloadBytes(jobId, lastObservedBytes[0], null);
            List<String> command = new ArrayList<>();
            command.add(readString(workshopProperties.getSteamcmdPath(), "steamcmd"));
            command.add("+force_install_dir");
            command.add(root.toAbsolutePath().toString());
            command.add("+login");
            if (StringUtils.hasText(workshopProperties.getSteamUsername())
                && StringUtils.hasText(workshopProperties.getSteamPassword())) {
                command.add(workshopProperties.getSteamUsername());
                command.add(workshopProperties.getSteamPassword());
            } else {
                command.add("anonymous");
            }
            command.add("+workshop_download_item");
            command.add(workshopProperties.getWorkshopAppId());
            command.add(workshopItemId);
            command.add("validate");
            command.add("+quit");
            SteamCmdProcessRunner.Execution execution = steamCmdProcessRunner.run(
                command,
                workshopProperties.getCommandTimeoutSeconds(),
                ignoredAttempt -> {
                long sampledBytes = directoryByteSize(downloaded);
                if (sampledBytes >= 0L && sampledBytes != lastObservedBytes[0]) {
                    lastObservedBytes[0] = sampledBytes;
                    updateDownloadBytes(jobId, lastObservedBytes[0], null);
                }
                },
                () -> {
                    try {
                        validatedDownloadContent[0] = detectFromDirectory(downloaded);
                        return true;
                    } catch (BusinessException invalidContent) {
                        inspectionFailure[0] = invalidContent;
                        return false;
                    }
                });
            long finalBytes = directoryByteSize(downloaded);
            if (finalBytes >= 0L) {
                lastObservedBytes[0] = finalBytes;
            }
            updateDownloadBytes(jobId, lastObservedBytes[0], null);
            if (!execution.succeeded()) {
                if (execution.failure().category() == SteamCmdProcessRunner.Category.CONTENT
                    && inspectionFailure[0] != null) {
                    throw inspectionFailure[0];
                }
                throw new BusinessException(ErrorCode.BAD_REQUEST, execution.failure().safeMessage());
            }
            if (validatedDownloadContent[0] != null) {
                return validatedDownloadContent[0];
            }
            return detectFromDirectory(downloaded);
        } catch (IOException exception) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "SteamCMD 下载目录不可用，请检查服务器配置");
        }
    }

    private Path workshopItemDirectory(Path root, String workshopItemId) {
        return root
            .resolve("steamapps")
            .resolve("workshop")
            .resolve("content")
            .resolve(readString(workshopProperties.getWorkshopAppId(), "431960"))
            .resolve(workshopItemId);
    }

    private long directoryByteSize(Path directory) {
        if (!Files.isDirectory(directory)) {
            return 0L;
        }
        try (java.util.stream.Stream<Path> paths = Files.walk(directory)) {
            return paths
                .filter(Files::isRegularFile)
                .mapToLong(path -> {
                    try {
                        return Math.max(0L, Files.size(path));
                    } catch (IOException ignored) {
                        return 0L;
                    }
                })
                .reduce(0L, this::saturatedAdd);
        } catch (IOException exception) {
            LOGGER.debug("Could not sample Workshop download directory", exception);
            return -1L;
        }
    }

    private long saturatedAdd(long left, long right) {
        if (right > Long.MAX_VALUE - left) {
            return Long.MAX_VALUE;
        }
        return left + right;
    }

    private DetectedPackage downloadWorkshopByFileUrl(
            Long jobId, WorkshopMetadataProvider.WorkshopMetadata workshopMeta, String workshopItemId) {
        String fileUrl = readString(workshopMeta.fileUrl(), "");
        if (!StringUtils.hasText(fileUrl)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Workshop file_url is unavailable");
        }
        URI uri;
        try {
            uri = URI.create(fileUrl);
        } catch (IllegalArgumentException exception) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Workshop file_url is invalid");
        }
        String scheme = readString(uri.getScheme(), "").toLowerCase(Locale.ROOT);
        if (!"https".equals(scheme) && !"http".equals(scheme)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Workshop file_url protocol is unsupported");
        }

        try {
            HttpRequest request = outboundClient.request(fileUrl, WORKSHOP_DIRECT_DOWNLOAD_TIMEOUT)
                .header("Accept", "*/*")
                .GET()
                .build();
            HttpResponse<InputStream> response = outboundClient.send(
                request, HttpResponse.BodyHandlers.ofInputStream());
            if (response.statusCode() < 200 || response.statusCode() >= 300) {
                closeQuietly(response.body());
                throw new BusinessException(ErrorCode.BAD_REQUEST, "Workshop file_url download failed");
            }
            long maxBytes = mediaStorageProperties.getMaxUploadSize();
            long contentLength = response.headers().firstValueAsLong("Content-Length").orElse(-1L);
            if (contentLength > maxBytes) {
                closeQuietly(response.body());
                throw new BusinessException(ErrorCode.BAD_REQUEST, "Workshop file is too large");
            }
            Long totalBytes = contentLength > 0L ? contentLength : null;
            updateDownloadBytes(jobId, 0L, totalBytes);
            String contentType = response.headers().firstValue("Content-Type").orElse("");
            try (InputStream inputStream = response.body()) {
                byte[] bytes = readWorkshopDownloadBytes(
                    jobId, inputStream, maxBytes, "Workshop file is too large", totalBytes);
                return detectFromFileBytes(resolveWorkshopDownloadFileName(workshopItemId, uri, contentType), bytes);
            }
        } catch (BusinessException exception) {
            throw exception;
        } catch (IOException exception) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Download workshop file_url failed");
        }
    }

    private void closeQuietly(InputStream inputStream) {
        if (inputStream == null) {
            return;
        }
        try {
            inputStream.close();
        } catch (IOException ignored) {
            // The upstream response is already unusable; cleanup failure is non-actionable.
        }
    }

    private DetectedPackage detectFromFileBytes(String fileName, byte[] bytes) {
        String safeName = readString(fileName, "workshop.bin");
        String extension = extensionByFileName(safeName);
        if (bytes == null || bytes.length <= 0 || bytes.length > mediaStorageProperties.getMaxUploadSize()) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Workshop file size is invalid");
        }

        if ("zip".equals(extension)) {
            L2dValidationResult l2dValidation = tryValidateL2d(bytes);
            if (l2dValidation != null) {
                return new DetectedPackage(
                    WallpaperSceneTypeEnum.L2D,
                    new DetectedAsset(safeName, "application/zip", AssetKindEnum.LIVE2D_PACKAGE, bytes),
                    null,
                    null,
                    l2dValidation
                );
            }
            return detectFromZipEntries(safeName, bytes, true);
        }

        if (isWorkshopPresentationFileName(safeName)) {
            throw new BusinessException(
                ErrorCode.BAD_REQUEST,
                "Workshop file_url resolved to a presentation preview instead of a wallpaper resource"
            );
        }

        AssetKindEnum visualKind = classifyVisualKindByExtension(extension);
        if (visualKind == null) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Unsupported workshop file type");
        }
        WallpaperSceneTypeEnum sceneType = visualKind == AssetKindEnum.ANIMATED_IMAGE
            ? WallpaperSceneTypeEnum.DYNAMIC
            : WallpaperSceneTypeEnum.STATIC;
        return new DetectedPackage(
            sceneType,
            new DetectedAsset(safeName, contentTypeByExtension(extension, visualKind), visualKind, bytes),
            null,
            null,
            null
        );
    }

    private String resolveWorkshopDownloadFileName(String workshopItemId, URI uri, String contentType) {
        String path = uri == null ? "" : readString(uri.getPath(), "");
        String name = sanitizeZipFileName(path);
        if (StringUtils.hasText(name) && !"resource.bin".equals(name) && !"bin".equals(extensionByFileName(name))) {
            return name;
        }
        return "workshop-" + workshopItemId + "." + extensionByContentType(contentType);
    }

    private String extensionByContentType(String contentType) {
        String normalized = readString(contentType, "").toLowerCase(Locale.ROOT);
        int semicolonIndex = normalized.indexOf(';');
        if (semicolonIndex >= 0) {
            normalized = normalized.substring(0, semicolonIndex).trim();
        }
        return switch (normalized) {
            case "application/zip", "application/x-zip-compressed" -> "zip";
            case "image/png" -> "png";
            case "image/jpeg" -> "jpg";
            case "image/webp" -> "webp";
            case "image/gif" -> "gif";
            case "image/apng" -> "apng";
            case "image/avif" -> "avif";
            case "video/mp4" -> "mp4";
            case "video/webm" -> "webm";
            case "video/quicktime" -> "mov";
            default -> "bin";
        };
    }

    private List<WallpaperProfileResponse> toWallpaperResponses(List<MediaWallpaperProfileEntity> profiles,
                                                                LoginUser loginUser,
                                                                boolean includePrivateWhenAllowed) {
        if (profiles == null || profiles.isEmpty()) {
            return List.of();
        }

        Map<Long, MediaAssetEntity> assetMap = loadAssetMap(profiles);
        Map<Long, String> l2dMap = loadL2dEntryMap(profiles);
        Long loginUserId = loginUser == null ? null : loginUser.getUserId();

        List<WallpaperProfileResponse> result = new ArrayList<>();
        for (MediaWallpaperProfileEntity profile : profiles) {
            MediaAssetEntity visual = assetMap.get(profile.getVisualAssetId());
            if (visual == null) {
                continue;
            }
            boolean mine = loginUserId != null && loginUserId.equals(profile.getOwnerUserId());
            String visualUrl = resolveAssetUrl(visual, profile, loginUser, includePrivateWhenAllowed);
            if (!StringUtils.hasText(visualUrl)) {
                continue;
            }

            MediaAssetEntity bgm = profile.getEmbeddedBgmAssetId() == null
                ? null
                : assetMap.get(profile.getEmbeddedBgmAssetId());
            MediaAssetEntity bgv = profile.getEmbeddedBgvAssetId() == null
                ? null
                : assetMap.get(profile.getEmbeddedBgvAssetId());

            result.add(new WallpaperProfileResponse(
                profile.getId(),
                readString(profile.getTitleText(), "壁纸"),
                readString(profile.getSceneType(), WallpaperSceneTypeEnum.STATIC.name()),
                AssetVisibilityEnum.fromCode(profile.getVisibilityCode()).name(),
                readString(profile.getAuditStatus(), AssetAuditStatusEnum.PENDING_AUDIT.name()),
                profile.getOwnerUserId(),
                profile.getVisualAssetId(),
                visualUrl,
                visualUrl,
                profile.getEmbeddedBgmAssetId(),
                resolveEmbeddedUrl(bgm, profile, loginUser, includePrivateWhenAllowed),
                profile.getEmbeddedBgvAssetId(),
                resolveEmbeddedUrl(bgv, profile, loginUser, includePrivateWhenAllowed),
                l2dMap.get(profile.getVisualAssetId()),
                profile.getDefaultMasterVolume() == null ? BigDecimal.ONE : profile.getDefaultMasterVolume(),
                profile.getDefaultBgmVolume() == null ? BigDecimal.ONE : profile.getDefaultBgmVolume(),
                profile.getDefaultBgvVolume() == null ? BigDecimal.ONE : profile.getDefaultBgvVolume(),
                readJsonMap(profile.getCustomSchemaJson()),
                readJsonMap(profile.getCustomDefaultsJson()),
                readString(profile.getImportSource(), WallpaperImportSourceEnum.PACKAGE.name()),
                readString(profile.getWorkshopItemId(), ""),
                mine
            ));
        }
        return result;
    }

    private WallpaperProfileResponse fetchWallpaperResponse(Long wallpaperId, LoginUser loginUser) {
        MediaWallpaperProfileEntity profile = wallpaperProfileMapper.selectById(wallpaperId);
        if (profile == null) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "Wallpaper not found");
        }
        List<WallpaperProfileResponse> responses = toWallpaperResponses(List.of(profile), loginUser, true);
        if (responses.isEmpty()) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "Wallpaper not found");
        }
        return responses.get(0);
    }

    private Map<Long, MediaAssetEntity> loadAssetMap(List<MediaWallpaperProfileEntity> profiles) {
        Set<Long> ids = new LinkedHashSet<>();
        for (MediaWallpaperProfileEntity profile : profiles) {
            if (profile.getVisualAssetId() != null) {
                ids.add(profile.getVisualAssetId());
            }
            if (profile.getEmbeddedBgmAssetId() != null) {
                ids.add(profile.getEmbeddedBgmAssetId());
            }
            if (profile.getEmbeddedBgvAssetId() != null) {
                ids.add(profile.getEmbeddedBgvAssetId());
            }
        }
        if (ids.isEmpty()) {
            return Map.of();
        }
        List<MediaAssetEntity> list = mediaAssetMapper.selectList(
            new LambdaQueryWrapper<MediaAssetEntity>().in(MediaAssetEntity::getId, ids)
        );
        Map<Long, MediaAssetEntity> map = new LinkedHashMap<>();
        for (MediaAssetEntity asset : list) {
            map.put(asset.getId(), asset);
        }
        return map;
    }

    private Map<Long, String> loadL2dEntryMap(List<MediaWallpaperProfileEntity> profiles) {
        Set<Long> visualAssetIds = new LinkedHashSet<>();
        for (MediaWallpaperProfileEntity profile : profiles) {
            if (WallpaperSceneTypeEnum.L2D.name().equalsIgnoreCase(readString(profile.getSceneType(), ""))
                && profile.getVisualAssetId() != null) {
                visualAssetIds.add(profile.getVisualAssetId());
            }
        }
        if (visualAssetIds.isEmpty()) {
            return Map.of();
        }
        List<MediaL2dPackageEntity> list = mediaL2dPackageMapper.selectList(
            new LambdaQueryWrapper<MediaL2dPackageEntity>().in(MediaL2dPackageEntity::getAssetId, visualAssetIds)
        );
        Map<Long, String> map = new LinkedHashMap<>();
        for (MediaL2dPackageEntity entity : list) {
            map.put(entity.getAssetId(), entity.getEntryModelJson());
        }
        return map;
    }

    private String resolveAssetUrl(MediaAssetEntity asset,
                                   MediaWallpaperProfileEntity profile,
                                   LoginUser loginUser,
                                   boolean includePrivateWhenAllowed) {
        if (asset == null) {
            return "";
        }
        AssetVisibilityEnum visibility = AssetVisibilityEnum.fromCode(
            profile.getVisibilityCode() == null ? AssetVisibilityEnum.PRIVATE.getCode() : profile.getVisibilityCode()
        );
        String auditStatus = readString(profile.getAuditStatus(), AssetAuditStatusEnum.PENDING_AUDIT.name());
        if (visibility == AssetVisibilityEnum.PUBLIC && AssetAuditStatusEnum.APPROVED.name().equalsIgnoreCase(auditStatus)) {
            return buildPublicUrl(asset.getBucketName(), asset.getObjectKey());
        }
        if (!includePrivateWhenAllowed) {
            return "";
        }
        if (loginUser == null) {
            return "";
        }
        if (!profile.getOwnerUserId().equals(loginUser.getUserId()) && !isAdmin(loginUser)) {
            return "";
        }
        return objectStorageClient.generateGetUrl(asset.getBucketName(), asset.getObjectKey(), mediaStorageProperties.getSignExpireSeconds());
    }

    private String resolveEmbeddedUrl(MediaAssetEntity asset,
                                      MediaWallpaperProfileEntity profile,
                                      LoginUser loginUser,
                                      boolean includePrivateWhenAllowed) {
        if (asset == null) {
            return "";
        }
        return resolveAssetUrl(asset, profile, loginUser, includePrivateWhenAllowed);
    }

    private void migrateWallpaperAssets(MediaWallpaperProfileEntity profile,
                                        AssetVisibilityEnum targetVisibility,
                                        String targetAuditStatus,
                                        Long ownerUserId) {
        migrateAsset(profile.getVisualAssetId(), ownerUserId, targetVisibility, targetAuditStatus);
        if (profile.getEmbeddedBgmAssetId() != null) {
            migrateAsset(profile.getEmbeddedBgmAssetId(), ownerUserId, targetVisibility, targetAuditStatus);
        }
        if (profile.getEmbeddedBgvAssetId() != null) {
            migrateAsset(profile.getEmbeddedBgvAssetId(), ownerUserId, targetVisibility, targetAuditStatus);
        }
    }

    private void migrateAsset(Long assetId,
                              Long ownerUserId,
                              AssetVisibilityEnum targetVisibility,
                              String targetAuditStatus) {
        if (assetId == null) {
            return;
        }
        MediaAssetEntity asset = mediaAssetMapper.selectById(assetId);
        if (asset == null) {
            return;
        }
        String targetBucket = bucketByVisibility(targetVisibility);
        if (!targetBucket.equals(readString(asset.getBucketName(), ""))) {
            StorageObjectMetadata metadata = objectStorageClient.getObjectMetadata(asset.getBucketName(), asset.getObjectKey());
            String extension = extensionByFileName(asset.getObjectKey());
            String newKey = OssKeyBuilder.build("assets", "user-" + ownerUserId, ownerUserId, extension);
            try (InputStream inputStream = objectStorageClient.getObjectStream(asset.getBucketName(), asset.getObjectKey())) {
                objectStorageClient.putObject(targetBucket, newKey, inputStream, metadata);
            } catch (IOException exception) {
                throw new BusinessException(ErrorCode.INTERNAL_ERROR, "Migrate asset visibility failed");
            }
            asset.setBucketName(targetBucket);
            asset.setObjectKey(newKey);
        }
        asset.setVisibilityCode(targetVisibility.getCode());
        asset.setAuditStatus(targetAuditStatus);
        asset.setUpdatedAt(LocalDateTime.now());
        mediaAssetMapper.updateById(asset);
    }

    private void ensureAssetExists(Long assetId) {
        if (assetId == null || assetId <= 0) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Asset id is invalid");
        }
        MediaAssetEntity asset = mediaAssetMapper.selectById(assetId);
        if (asset == null) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Asset does not exist");
        }
    }

    private void deleteWallpaperManagedAsset(Long assetId) {
        if (assetId == null) {
            return;
        }
        MediaAssetEntity asset = mediaAssetMapper.selectById(assetId);
        if (asset == null || !isWallpaperManagedAsset(asset)) {
            return;
        }
        if (AssetKindEnum.LIVE2D_PACKAGE.getCode() == (asset.getAssetKindCode() == null ? -1 : asset.getAssetKindCode())) {
            mediaL2dPackageMapper.delete(
                new LambdaQueryWrapper<MediaL2dPackageEntity>().eq(MediaL2dPackageEntity::getAssetId, assetId)
            );
        }
        deleteStoredObjectQuietly(asset.getBucketName(), asset.getObjectKey());
        mediaAssetMapper.deleteById(assetId);
    }

    private boolean isWallpaperManagedAsset(MediaAssetEntity asset) {
        if (asset == null) {
            return false;
        }
        Map<String, Object> metadata = readJsonMap(asset.getMetadataJson());
        String source = String.valueOf(metadata.getOrDefault("source", "")).trim();
        boolean wallpaperAsset = Boolean.parseBoolean(String.valueOf(metadata.getOrDefault("wallpaper", false)));
        return wallpaperAsset || "wallpaper_import".equalsIgnoreCase(source);
    }

    private void deleteStoredObjectQuietly(String bucket, String key) {
        String normalizedBucket = readString(bucket, "").trim();
        String normalizedKey = readString(key, "").trim();
        if (!StringUtils.hasText(normalizedBucket) || !StringUtils.hasText(normalizedKey)) {
            return;
        }
        try {
            objectStorageClient.deleteObject(normalizedBucket, normalizedKey);
        } catch (Exception ignored) {
            // ignore cleanup failures
        }
    }

    private BigDecimal clampVolume(BigDecimal input) {
        BigDecimal safe = input == null ? BigDecimal.ONE : input;
        if (safe.compareTo(BigDecimal.ZERO) < 0) {
            return BigDecimal.ZERO;
        }
        if (safe.compareTo(BigDecimal.ONE) > 0) {
            return BigDecimal.ONE;
        }
        return safe;
    }

    private String resolveAuditStatus(AssetVisibilityEnum visibility, boolean forceApproved) {
        if (visibility == AssetVisibilityEnum.PUBLIC) {
            return forceApproved ? AssetAuditStatusEnum.APPROVED.name() : AssetAuditStatusEnum.PENDING_AUDIT.name();
        }
        return AssetAuditStatusEnum.APPROVED.name();
    }

    private String bucketByVisibility(AssetVisibilityEnum visibility) {
        if (visibility == AssetVisibilityEnum.PUBLIC) {
            return mediaStorageProperties.getPublicBucket();
        }
        return mediaStorageProperties.getPrivateBucket();
    }

    private String buildPublicUrl(String bucket, String key) {
        if (StringUtils.hasText(mediaStorageProperties.getPublicBaseUrl())) {
            String baseUrl = mediaStorageProperties.getPublicBaseUrl();
            if (baseUrl.endsWith("/")) {
                baseUrl = baseUrl.substring(0, baseUrl.length() - 1);
            }
            return baseUrl + "/" + key;
        }

        URI endpoint = URI.create(readString(ossProperties.getEndpoint(), "https://oss-cn-hangzhou.aliyuncs.com"));
        String scheme = StringUtils.hasText(endpoint.getScheme()) ? endpoint.getScheme() : "https";
        String host = endpoint.getHost();
        if (!StringUtils.hasText(host)) {
            throw new BusinessException(ErrorCode.INTERNAL_ERROR, "Invalid OSS endpoint for public url");
        }
        if (host.startsWith(bucket + ".")) {
            return scheme + "://" + host + "/" + key;
        }
        return scheme + "://" + bucket + "." + host + "/" + key;
    }

    private Long requireLoginUserId() {
        LoginUser user = currentLoginUser();
        if (user == null || user.getUserId() == null || user.getUserId() <= 0) {
            throw new BusinessException(ErrorCode.UNAUTHORIZED, "Login required");
        }
        return user.getUserId();
    }

    private LoginUser currentLoginUser() {
        return LoginUserContext.get().orElse(null);
    }

    private boolean isAdmin(LoginUser loginUser) {
        if (loginUser == null || loginUser.getGroups() == null) {
            return false;
        }
        return loginUser.getGroups().stream().anyMatch(group -> "ADMIN".equalsIgnoreCase(group));
    }

    private String writeJson(Object value) {
        try {
            return objectMapper.writeValueAsString(value == null ? Map.of() : value);
        } catch (JsonProcessingException exception) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "JSON serialization failed");
        }
    }

    private Map<String, Object> readJsonMap(String json) {
        String raw = readString(json, "");
        if (!StringUtils.hasText(raw)) {
            return new LinkedHashMap<>();
        }
        try {
            return objectMapper.readValue(raw, new TypeReference<Map<String, Object>>() {
            });
        } catch (Exception exception) {
            return new LinkedHashMap<>();
        }
    }

    private String readString(String value, String fallback) {
        if (!StringUtils.hasText(value)) {
            return fallback;
        }
        return value.trim();
    }

    private String defaultTitleByFileName(String fileName, WallpaperSceneTypeEnum sceneType) {
        String source = readString(fileName, "");
        if (!StringUtils.hasText(source)) {
            return "壁纸-" + sceneType.name().toLowerCase(Locale.ROOT);
        }
        int dotIndex = source.lastIndexOf('.');
        String title = dotIndex > 0 ? source.substring(0, dotIndex) : source;
        return StringUtils.hasText(title) ? title : "壁纸-" + sceneType.name().toLowerCase(Locale.ROOT);
    }

    private String extensionByFileName(String fileName) {
        String source = readString(fileName, "");
        int slash = Math.max(source.lastIndexOf('/'), source.lastIndexOf('\\'));
        if (slash >= 0 && slash + 1 < source.length()) {
            source = source.substring(slash + 1);
        }
        int dot = source.lastIndexOf('.');
        if (dot < 0 || dot == source.length() - 1) {
            return "bin";
        }
        return source.substring(dot + 1).toLowerCase(Locale.ROOT);
    }

    private AssetKindEnum classifyVisualKindByExtension(String extension) {
        if (!StringUtils.hasText(extension)) {
            return null;
        }
        String ext = extension.toLowerCase(Locale.ROOT);
        if (STATIC_EXTENSIONS.contains(ext)) {
            return AssetKindEnum.STATIC_IMAGE;
        }
        if (DYNAMIC_EXTENSIONS.contains(ext)) {
            return AssetKindEnum.ANIMATED_IMAGE;
        }
        return null;
    }

    private boolean shouldReplaceVisual(DetectedAsset current, AssetKindEnum candidateKind) {
        if (current == null) {
            return true;
        }
        return visualPriority(candidateKind) > visualPriority(current.assetKind());
    }

    private int visualPriority(AssetKindEnum kind) {
        if (kind == AssetKindEnum.ANIMATED_IMAGE) {
            return 2;
        }
        if (kind == AssetKindEnum.STATIC_IMAGE) {
            return 1;
        }
        return 0;
    }

    private String contentTypeByExtension(String extension, AssetKindEnum assetKind) {
        String ext = readString(extension, "").toLowerCase(Locale.ROOT);
        return switch (ext) {
            case "png" -> "image/png";
            case "jpg", "jpeg" -> "image/jpeg";
            case "webp" -> "image/webp";
            case "gif" -> "image/gif";
            case "apng" -> "image/apng";
            case "avif" -> "image/avif";
            case "mp4" -> "video/mp4";
            case "webm" -> "video/webm";
            case "mov" -> "video/quicktime";
            case "mp3" -> "audio/mpeg";
            case "wav" -> "audio/wav";
            case "ogg" -> assetKind == AssetKindEnum.AUDIO ? "audio/ogg" : "video/ogg";
            case "flac" -> "audio/flac";
            case "aac" -> "audio/aac";
            case "m4a" -> "audio/mp4";
            case "zip" -> "application/zip";
            default -> switch (assetKind) {
                case STATIC_IMAGE -> "image/png";
                case ANIMATED_IMAGE -> "video/mp4";
                case LIVE2D_PACKAGE -> "application/zip";
                case AUDIO -> "audio/mpeg";
            };
        };
    }

    private byte[] readZipEntryBytes(ZipInputStream inputStream, long maxBytes) throws IOException {
        return readInputBytes(inputStream, maxBytes, "Zip entry is too large");
    }

    private byte[] readInputBytes(InputStream inputStream, long maxBytes, String tooLargeMessage) throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        byte[] buffer = new byte[8192];
        long readTotal = 0L;
        int read;
        while ((read = inputStream.read(buffer)) != -1) {
            readTotal += read;
            if (readTotal > maxBytes) {
                throw new BusinessException(ErrorCode.BAD_REQUEST, tooLargeMessage);
            }
            out.write(buffer, 0, read);
        }
        return out.toByteArray();
    }

    private byte[] readWorkshopDownloadBytes(Long jobId,
                                             InputStream inputStream,
                                             long maxBytes,
                                             String tooLargeMessage,
                                             Long totalBytes) throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        byte[] buffer = new byte[8192];
        long readTotal = 0L;
        long lastPersistedBytes = 0L;
        long lastPersistNanos = System.nanoTime();
        try {
            int read;
            while ((read = inputStream.read(buffer)) != -1) {
                readTotal = saturatedAdd(readTotal, read);
                if (readTotal > maxBytes) {
                    throw new BusinessException(ErrorCode.BAD_REQUEST, tooLargeMessage);
                }
                out.write(buffer, 0, read);
                long now = System.nanoTime();
                if (readTotal - lastPersistedBytes >= DOWNLOAD_PROGRESS_PERSIST_BYTES
                    || now - lastPersistNanos >= DOWNLOAD_PROGRESS_PERSIST_NANOS) {
                    updateDownloadBytes(jobId, readTotal, totalBytes);
                    lastPersistedBytes = readTotal;
                    lastPersistNanos = now;
                }
            }
            return out.toByteArray();
        } finally {
            updateDownloadBytes(jobId, readTotal, totalBytes);
        }
    }

    private String sanitizeZipFileName(String entryName) {
        String normalized = readString(entryName, "resource.bin").replace('\\', '/');
        int slash = normalized.lastIndexOf('/');
        if (slash >= 0 && slash + 1 < normalized.length()) {
            normalized = normalized.substring(slash + 1);
        }
        if (!StringUtils.hasText(normalized)) {
            return "resource.bin";
        }
        return normalized;
    }

    private byte[] zipDirectory(Path dir) {
        try {
            Path temp = Files.createTempFile("workshop-l2d-", ".zip");
            try (java.util.zip.ZipOutputStream zipOutputStream = new java.util.zip.ZipOutputStream(Files.newOutputStream(temp))) {
                List<Path> files = Files.walk(dir)
                    .filter(Files::isRegularFile)
                    .sorted(Comparator.comparing(Path::toString))
                    .toList();
                for (Path file : files) {
                    String entry = dir.relativize(file).toString().replace('\\', '/');
                    zipOutputStream.putNextEntry(new ZipEntry(entry));
                    zipOutputStream.write(Files.readAllBytes(file));
                    zipOutputStream.closeEntry();
                }
            }
            byte[] bytes = Files.readAllBytes(temp);
            Files.deleteIfExists(temp);
            return bytes;
        } catch (IOException exception) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Zip workshop files failed");
        }
    }

    private WallpaperImportJobResponse toJobResponse(MediaWallpaperImportJobEntity job) {
        WallpaperImportStatusEnum status = parseImportStatus(job.getStatusText());
        WallpaperImportProgressStageEnum progressStage = resolveProgressStage(job, status);
        return new WallpaperImportJobResponse(
            job.getId(),
            readString(job.getSourceType(), WallpaperImportSourceEnum.PACKAGE.name()),
            status.name(),
            AssetVisibilityEnum.fromCode(job.getVisibilityCode()).name(),
            job.getWallpaperId(),
            readString(job.getErrorMessage(), ""),
            readString(job.getFallbackHint(), ""),
            progressStage.name(),
            resolveProgressPercent(job.getProgressPercent(), progressStage),
            Math.max(0L, job.getDownloadedBytes() == null ? 0L : job.getDownloadedBytes()),
            job.getTotalBytes() != null && job.getTotalBytes() > 0L ? job.getTotalBytes() : null
        );
    }

    private WallpaperImportStatusEnum parseImportStatus(String rawStatus) {
        try {
            return WallpaperImportStatusEnum.valueOf(
                readString(rawStatus, WallpaperImportStatusEnum.PENDING.name()).toUpperCase(Locale.ROOT)
            );
        } catch (IllegalArgumentException exception) {
            return WallpaperImportStatusEnum.PENDING;
        }
    }

    private WallpaperImportProgressStageEnum resolveProgressStage(MediaWallpaperImportJobEntity job,
                                                                    WallpaperImportStatusEnum status) {
        if (status == WallpaperImportStatusEnum.SUCCEEDED
            || status == WallpaperImportStatusEnum.FALLBACK_REQUIRED
            || status == WallpaperImportStatusEnum.FAILED) {
            return terminalProgressStage(status);
        }
        try {
            return WallpaperImportProgressStageEnum.valueOf(readString(
                job.getProgressStage(),
                WallpaperImportProgressStageEnum.QUEUED.name()
            ));
        } catch (IllegalArgumentException exception) {
            return status == WallpaperImportStatusEnum.RUNNING
                ? WallpaperImportProgressStageEnum.RESOLVING
                : WallpaperImportProgressStageEnum.QUEUED;
        }
    }

    private int resolveProgressPercent(Integer rawPercent, WallpaperImportProgressStageEnum progressStage) {
        if (progressStage.getPercent() == 100) {
            return 100;
        }
        int percent = rawPercent == null ? progressStage.getPercent() : rawPercent;
        return Math.max(0, Math.min(99, percent));
    }

    private WallpaperImportProgressStageEnum terminalProgressStage(WallpaperImportStatusEnum status) {
        return switch (status) {
            case SUCCEEDED -> WallpaperImportProgressStageEnum.COMPLETED;
            case FALLBACK_REQUIRED -> WallpaperImportProgressStageEnum.FALLBACK_REQUIRED;
            case FAILED -> WallpaperImportProgressStageEnum.FAILED;
            case PENDING, RUNNING -> WallpaperImportProgressStageEnum.QUEUED;
        };
    }

    record DetectedAsset(String fileName,
                         String contentType,
                         AssetKindEnum assetKind,
                         byte[] bytes,
                         Path sourcePath) {
        DetectedAsset(String fileName, String contentType, AssetKindEnum assetKind, byte[] bytes) {
            this(fileName, contentType, assetKind, bytes, null);
        }

        long contentLength() throws IOException {
            return sourcePath == null ? bytes.length : Files.size(sourcePath);
        }

        InputStream openStream() throws IOException {
            return sourcePath == null ? new ByteArrayInputStream(bytes) : Files.newInputStream(sourcePath);
        }
    }

    record DetectedPackage(WallpaperSceneTypeEnum sceneType,
                           DetectedAsset visual,
                           DetectedAsset bgm,
                           DetectedAsset bgv,
                           L2dValidationResult l2dValidation) {
    }

    private record ImportedWallpaper(Long wallpaperId) {
    }

}
