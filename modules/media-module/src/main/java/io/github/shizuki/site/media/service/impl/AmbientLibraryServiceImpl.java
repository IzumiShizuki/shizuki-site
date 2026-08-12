package io.github.shizuki.site.media.service.impl;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.common.security.context.LoginUserContext;
import io.github.shizuki.common.storage.client.ObjectStorageClient;
import io.github.shizuki.common.storage.model.StorageObjectMetadata;
import io.github.shizuki.common.storage.util.OssKeyBuilder;
import io.github.shizuki.site.media.config.FreesoundProperties;
import io.github.shizuki.site.media.config.MediaStorageProperties;
import io.github.shizuki.site.media.entity.AmbientSourceAssetEntity;
import io.github.shizuki.site.media.integration.FreesoundPreviewDownloader;
import io.github.shizuki.site.media.integration.FreesoundProvider;
import io.github.shizuki.site.media.mapper.AmbientSourceAssetMapper;
import io.github.shizuki.site.media.request.AssetCreateRequest;
import io.github.shizuki.site.media.response.AmbientSoundImportResponse;
import io.github.shizuki.site.media.response.AssetCreateResponse;
import io.github.shizuki.site.media.response.AssetDownloadResponse;
import io.github.shizuki.site.media.response.FreesoundTrackResponse;
import io.github.shizuki.site.media.service.AmbientLibraryService;
import io.github.shizuki.site.media.service.MediaService;
import java.io.ByteArrayInputStream;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.support.TransactionTemplate;

/**
 * Freesound 环境音导入实现。
 */
@Service
public class AmbientLibraryServiceImpl implements AmbientLibraryService {

    private static final String PROVIDER = "freesound";
    private static final String READY = "READY";
    private static final String IMPORTING = "IMPORTING";
    private static final Duration IMPORT_RESERVATION_TTL = Duration.ofMinutes(10);

    private final FreesoundProvider freesoundProvider;
    private final FreesoundPreviewDownloader previewDownloader;
    private final AmbientSourceAssetMapper ambientSourceAssetMapper;
    private final ObjectStorageClient objectStorageClient;
    private final MediaStorageProperties mediaStorageProperties;
    private final FreesoundProperties freesoundProperties;
    private final MediaService mediaService;
    private final TransactionTemplate transactionTemplate;

    public AmbientLibraryServiceImpl(FreesoundProvider freesoundProvider,
                                     FreesoundPreviewDownloader previewDownloader,
                                     AmbientSourceAssetMapper ambientSourceAssetMapper,
                                     ObjectStorageClient objectStorageClient,
                                     MediaStorageProperties mediaStorageProperties,
                                     FreesoundProperties freesoundProperties,
                                     MediaService mediaService,
                                     TransactionTemplate transactionTemplate) {
        this.freesoundProvider = freesoundProvider;
        this.previewDownloader = previewDownloader;
        this.ambientSourceAssetMapper = ambientSourceAssetMapper;
        this.objectStorageClient = objectStorageClient;
        this.mediaStorageProperties = mediaStorageProperties;
        this.freesoundProperties = freesoundProperties;
        this.mediaService = mediaService;
        this.transactionTemplate = transactionTemplate;
    }

    @Override
    public AmbientSoundImportResponse importSound(String soundId) {
        Long userId = requireLoginUserId();
        String normalizedSoundId = normalizeSoundId(soundId);

        AmbientSourceAssetEntity existing = ambientSourceAssetMapper.findActive(userId, PROVIDER, normalizedSoundId);
        if (isStaleReservation(existing)) {
            ambientSourceAssetMapper.deleteImportReservation(existing.getId());
            existing = null;
        }
        if (existing != null) {
            return resolveExisting(existing);
        }

        FreesoundTrackResponse track = freesoundProvider.resolveAmbient(normalizedSoundId);
        AmbientSourceAssetEntity reservation = buildReservation(userId, track);
        try {
            ambientSourceAssetMapper.insert(reservation);
        } catch (DuplicateKeyException ex) {
            AmbientSourceAssetEntity concurrent = ambientSourceAssetMapper.findActive(
                userId, PROVIDER, normalizedSoundId);
            if (concurrent != null) {
                return resolveExisting(concurrent);
            }
            throw ex;
        }

        String bucket = mediaStorageProperties.getPrivateBucket();
        String objectKey = OssKeyBuilder.build("ambient", "user", userId, ".mp3");
        boolean objectStored = false;
        try {
            FreesoundPreviewDownloader.DownloadedPreview preview = previewDownloader.download(
                track.previewUrl(), Math.min(
                    freesoundProperties.getMaxImportBytes(), mediaStorageProperties.getMaxUploadSize()));
            StorageObjectMetadata storageMetadata = new StorageObjectMetadata();
            storageMetadata.setContentType(preview.contentType());
            storageMetadata.setContentLength(preview.bytes().length);
            objectStorageClient.putObject(
                bucket,
                objectKey,
                new ByteArrayInputStream(preview.bytes()),
                storageMetadata
            );
            objectStored = true;

            AssetCreateResponse asset = transactionTemplate.execute(status -> {
                AssetCreateResponse created = mediaService.createAsset(
                    buildAssetRequest(bucket, objectKey, preview, track));
                if (ambientSourceAssetMapper.markReady(reservation.getId(), created.assetId()) != 1) {
                    throw new BusinessException(ErrorCode.INTERNAL_ERROR, "Complete ambient import failed",
                        Map.of("ambient_error_code", "AMBIENT_IMPORT_MAPPING_FAILED"));
                }
                return created;
            });
            if (asset == null) {
                throw new BusinessException(ErrorCode.INTERNAL_ERROR, "Create ambient asset failed");
            }
            AssetDownloadResponse download = mediaService.createDownloadUrl(asset.assetId());
            return buildResponse(track, asset.assetId(), download, false);
        } catch (RuntimeException ex) {
            AmbientSourceAssetEntity current = ambientSourceAssetMapper.findActive(userId, PROVIDER, normalizedSoundId);
            boolean ready = current != null && READY.equals(current.getImportStatus()) && current.getAssetId() != null;
            if (!ready) {
                ambientSourceAssetMapper.deleteImportReservation(reservation.getId());
            }
            if (objectStored && !ready) {
                objectStorageClient.deleteObject(bucket, objectKey);
            }
            throw ex;
        }
    }

    private AmbientSoundImportResponse resolveExisting(AmbientSourceAssetEntity existing) {
        if (!READY.equals(existing.getImportStatus()) || existing.getAssetId() == null) {
            throw new BusinessException(ErrorCode.CONFLICT, "Ambient sound import is already in progress",
                Map.of("ambient_error_code", "AMBIENT_IMPORT_IN_PROGRESS"));
        }
        AssetDownloadResponse download = mediaService.createDownloadUrl(existing.getAssetId());
        FreesoundTrackResponse track = new FreesoundTrackResponse(
            existing.getSourceSoundId(),
            existing.getTitleText(),
            existing.getAuthorText(),
            "",
            existing.getLicenseCode(),
            existing.getLicenseName(),
            !"cc0".equals(existing.getLicenseCode()),
            existing.getSourcePageUrl(),
            existing.getDurationValue() == null ? 0d : existing.getDurationValue()
        );
        return buildResponse(track, existing.getAssetId(), download, true);
    }

    private AmbientSourceAssetEntity buildReservation(Long userId, FreesoundTrackResponse track) {
        AmbientSourceAssetEntity entity = new AmbientSourceAssetEntity();
        entity.setUserId(userId);
        entity.setProviderCode(PROVIDER);
        entity.setSourceSoundId(track.soundId());
        entity.setImportStatus(IMPORTING);
        entity.setTitleText(limit(track.title(), 256));
        entity.setAuthorText(limit(track.author(), 256));
        entity.setLicenseCode(limit(track.license(), 32));
        entity.setLicenseName(limit(track.licenseName(), 128));
        entity.setSourcePageUrl(limit(track.pageUrl(), 1024));
        entity.setDurationValue(track.duration());
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        entity.setDeleted(0);
        entity.setVersion(0);
        return entity;
    }

    private AssetCreateRequest buildAssetRequest(String bucket,
                                                 String objectKey,
                                                 FreesoundPreviewDownloader.DownloadedPreview preview,
                                                 FreesoundTrackResponse track) {
        Map<String, Object> metadata = new LinkedHashMap<>();
        metadata.put("usage", "ambient_sound");
        metadata.put("source_provider", PROVIDER);
        metadata.put("source_sound_id", track.soundId());
        metadata.put("source_title", track.title());
        metadata.put("source_author", track.author());
        metadata.put("source_license", track.license());
        metadata.put("source_license_name", track.licenseName());
        metadata.put("source_page_url", track.pageUrl());
        metadata.put("source_duration", track.duration());
        metadata.put("source_preview_url", track.previewUrl());
        metadata.put("source_preview_quality", "hq-mp3");

        AssetCreateRequest request = new AssetCreateRequest();
        request.setBucket(bucket);
        request.setKey(objectKey);
        request.setAssetType("ambient_sound");
        request.setAssetKind("AUDIO");
        request.setContentType(preview.contentType());
        request.setVisibility("PRIVATE");
        request.setMetadata(metadata);
        return request;
    }

    private AmbientSoundImportResponse buildResponse(FreesoundTrackResponse track,
                                                     Long assetId,
                                                     AssetDownloadResponse download,
                                                     boolean alreadyImported) {
        String playbackUrl = download.downloadUrl() == null ? download.publicUrl() : download.downloadUrl();
        return new AmbientSoundImportResponse(
            PROVIDER,
            track.soundId(),
            assetId,
            track.title(),
            track.author(),
            track.license(),
            track.licenseName(),
            track.attributionRequired(),
            track.pageUrl(),
            track.duration(),
            playbackUrl,
            download.expireSeconds(),
            alreadyImported
        );
    }

    private Long requireLoginUserId() {
        Long userId = LoginUserContext.get().map(user -> user.getUserId()).orElse(null);
        if (userId == null || userId <= 0L) {
            throw new BusinessException(ErrorCode.UNAUTHORIZED, "Login required to import ambient sounds");
        }
        return userId;
    }

    private String normalizeSoundId(String soundId) {
        String normalized = soundId == null ? "" : soundId.trim();
        if (!normalized.matches("[1-9]\\d{0,19}")) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Invalid Freesound sound id");
        }
        return normalized;
    }

    private boolean isStaleReservation(AmbientSourceAssetEntity entity) {
        return entity != null
            && IMPORTING.equals(entity.getImportStatus())
            && entity.getCreatedAt() != null
            && entity.getCreatedAt().isBefore(LocalDateTime.now().minus(IMPORT_RESERVATION_TTL));
    }

    private String limit(String value, int maxLength) {
        String normalized = value == null ? "" : value.trim();
        return normalized.length() <= maxLength ? normalized : normalized.substring(0, maxLength);
    }
}
