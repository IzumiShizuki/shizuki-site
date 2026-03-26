package io.github.shizuki.site.media.config;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import io.github.shizuki.common.storage.client.ObjectStorageClient;
import io.github.shizuki.common.storage.model.StorageObjectMetadata;
import io.github.shizuki.site.media.entity.MediaAssetEntity;
import io.github.shizuki.site.media.entity.MediaWallpaperProfileEntity;
import io.github.shizuki.site.media.mapper.MediaAssetMapper;
import io.github.shizuki.site.media.mapper.MediaWallpaperProfileMapper;
import io.github.shizuki.site.media.model.AssetAuditStatusEnum;
import io.github.shizuki.site.media.model.AssetKindEnum;
import io.github.shizuki.site.media.model.AssetVisibilityEnum;
import io.github.shizuki.site.media.model.WallpaperSceneTypeEnum;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.Base64;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

/**
 * 壁纸库冷启动自举：当公共壁纸为空时，自动补齐一张默认首图。
 */
@Component("wallpaperBootstrapInitializer")
public class WallpaperBootstrapInitializer implements ApplicationRunner {

    private static final Logger LOGGER = LoggerFactory.getLogger(WallpaperBootstrapInitializer.class);

    private static final String DEFAULT_WALLPAPER_TITLE = "默认首图";
    private static final String DEFAULT_OBJECT_KEY = "wallpaper/bootstrap/default-first.png";
    private static final String DEFAULT_IMPORT_SOURCE = "PACKAGE";
    private static final String DEFAULT_CUSTOM_SCHEMA_JSON = "{}";
    private static final String DEFAULT_CUSTOM_DEFAULTS_JSON = "{\"bgmEnabled\":false,\"bgvEnabled\":false}";
    private static final BigDecimal DEFAULT_VOLUME = new BigDecimal("1.00");
    private static final String DEFAULT_ASSET_METADATA_JSON =
        "{\"fileName\":\"default-first.png\",\"wallpaper\":true,\"source\":\"wallpaper_bootstrap\"}";

    private static final Path LOCAL_FIRST_IMAGE_PATH =
        Paths.get("fronted", "vue3-merged", "public", "images", "original-bg.png");
    private static final byte[] FALLBACK_PNG_BYTES = Base64.getDecoder().decode(
        "iVBORw0KGgoAAAANSUhEUgAAAAEAAAABCAQAAAC1HAwCAAAAC0lEQVR42mP8/w8AAgMBgJ4L7nUAAAAASUVORK5CYII="
    );

    private final ObjectStorageClient objectStorageClient;
    private final MediaStorageProperties mediaStorageProperties;
    private final MediaAssetMapper mediaAssetMapper;
    private final MediaWallpaperProfileMapper wallpaperProfileMapper;

    private final boolean enabled;
    private final Long ownerUserId;

    public WallpaperBootstrapInitializer(ObjectStorageClient objectStorageClient,
                                         MediaStorageProperties mediaStorageProperties,
                                         MediaAssetMapper mediaAssetMapper,
                                         MediaWallpaperProfileMapper wallpaperProfileMapper,
                                         @Value("${shizuki.media.wallpaper.bootstrap.enabled:true}") boolean enabled,
                                         @Value("${shizuki.media.wallpaper.bootstrap.owner-user-id:1}") Long ownerUserId) {
        this.objectStorageClient = objectStorageClient;
        this.mediaStorageProperties = mediaStorageProperties;
        this.mediaAssetMapper = mediaAssetMapper;
        this.wallpaperProfileMapper = wallpaperProfileMapper;
        this.enabled = enabled;
        this.ownerUserId = ownerUserId == null || ownerUserId <= 0 ? 1L : ownerUserId;
    }

    @Override
    public void run(ApplicationArguments args) {
        if (!enabled) {
            return;
        }
        try {
            if (hasPublicWallpaper()) {
                return;
            }
            WallpaperBinary binary = loadDefaultBinary();
            MediaAssetEntity asset = upsertDefaultAsset(binary);
            upsertDefaultWallpaperProfile(asset.getId());
            LOGGER.info("WALLPAPER_BOOTSTRAP_DONE owner_user_id={} asset_id={}", ownerUserId, asset.getId());
        } catch (Exception exception) {
            LOGGER.warn("WALLPAPER_BOOTSTRAP_SKIP reason={}", exception.getMessage());
            LOGGER.debug("WALLPAPER_BOOTSTRAP_SKIP_DETAIL", exception);
        }
    }

    private boolean hasPublicWallpaper() {
        Long count = wallpaperProfileMapper.selectCount(
            new LambdaQueryWrapper<MediaWallpaperProfileEntity>()
                .eq(MediaWallpaperProfileEntity::getEnabledFlag, true)
                .eq(MediaWallpaperProfileEntity::getVisibilityCode, AssetVisibilityEnum.PUBLIC.getCode())
                .eq(MediaWallpaperProfileEntity::getAuditStatus, AssetAuditStatusEnum.APPROVED.name())
        );
        return count != null && count > 0;
    }

    private MediaAssetEntity upsertDefaultAsset(WallpaperBinary binary) {
        String bucket = readRequiredBucket();
        MediaAssetEntity existing = mediaAssetMapper.selectOne(
            new LambdaQueryWrapper<MediaAssetEntity>()
                .eq(MediaAssetEntity::getBucketName, bucket)
                .eq(MediaAssetEntity::getObjectKey, DEFAULT_OBJECT_KEY)
                .last("LIMIT 1")
        );

        if (!objectStorageClient.objectExists(bucket, DEFAULT_OBJECT_KEY)) {
            StorageObjectMetadata metadata = new StorageObjectMetadata();
            metadata.setContentType(binary.contentType());
            metadata.setContentLength(binary.bytes().length);
            objectStorageClient.putObject(
                bucket,
                DEFAULT_OBJECT_KEY,
                new ByteArrayInputStream(binary.bytes()),
                metadata
            );
            LOGGER.info("WALLPAPER_BOOTSTRAP_OSS_UPLOADED bucket={} key={} source={}", bucket, DEFAULT_OBJECT_KEY, binary.sourceTag());
        }

        if (existing == null) {
            MediaAssetEntity created = new MediaAssetEntity();
            applyAssetBaseline(created, bucket, binary.contentType());
            created.setCreatedAt(LocalDateTime.now());
            created.setUpdatedAt(LocalDateTime.now());
            mediaAssetMapper.insert(created);
            return created;
        }

        boolean changed = false;
        changed |= ensureEquals(existing.getUserId(), ownerUserId, existing::setUserId);
        changed |= ensureEquals(existing.getAssetType(), AssetKindEnum.STATIC_IMAGE.name(), existing::setAssetType);
        changed |= ensureEquals(existing.getAssetKindCode(), AssetKindEnum.STATIC_IMAGE.getCode(), existing::setAssetKindCode);
        changed |= ensureEquals(existing.getVisibilityCode(), AssetVisibilityEnum.PUBLIC.getCode(), existing::setVisibilityCode);
        changed |= ensureEquals(existing.getAuditStatus(), AssetAuditStatusEnum.APPROVED.name(), existing::setAuditStatus);
        changed |= ensureEquals(existing.getContentTypeText(), binary.contentType(), existing::setContentTypeText);
        changed |= ensureEquals(existing.getMetadataJson(), DEFAULT_ASSET_METADATA_JSON, existing::setMetadataJson);
        changed |= ensureEquals(existing.getHomeEnabledFlag(), false, existing::setHomeEnabledFlag);
        changed |= ensureEquals(existing.getHomeSortNum(), 0, existing::setHomeSortNum);
        if (changed) {
            existing.setUpdatedAt(LocalDateTime.now());
            mediaAssetMapper.updateById(existing);
        }
        return existing;
    }

    private void upsertDefaultWallpaperProfile(Long visualAssetId) {
        MediaWallpaperProfileEntity existing = wallpaperProfileMapper.selectOne(
            new LambdaQueryWrapper<MediaWallpaperProfileEntity>()
                .eq(MediaWallpaperProfileEntity::getOwnerUserId, ownerUserId)
                .eq(MediaWallpaperProfileEntity::getTitleText, DEFAULT_WALLPAPER_TITLE)
                .eq(MediaWallpaperProfileEntity::getImportSource, DEFAULT_IMPORT_SOURCE)
                .last("LIMIT 1")
        );

        if (existing == null) {
            MediaWallpaperProfileEntity created = new MediaWallpaperProfileEntity();
            applyWallpaperBaseline(created, visualAssetId);
            created.setCreatedAt(LocalDateTime.now());
            created.setUpdatedAt(LocalDateTime.now());
            wallpaperProfileMapper.insert(created);
            return;
        }

        boolean changed = false;
        changed |= ensureEquals(existing.getVisualAssetId(), visualAssetId, existing::setVisualAssetId);
        changed |= ensureEquals(existing.getOwnerUserId(), ownerUserId, existing::setOwnerUserId);
        changed |= ensureEquals(existing.getTitleText(), DEFAULT_WALLPAPER_TITLE, existing::setTitleText);
        changed |= ensureEquals(existing.getSceneType(), WallpaperSceneTypeEnum.STATIC.name(), existing::setSceneType);
        changed |= ensureEquals(existing.getEmbeddedBgmAssetId(), null, existing::setEmbeddedBgmAssetId);
        changed |= ensureEquals(existing.getEmbeddedBgvAssetId(), null, existing::setEmbeddedBgvAssetId);
        changed |= ensureEquals(existing.getDefaultMasterVolume(), DEFAULT_VOLUME, existing::setDefaultMasterVolume);
        changed |= ensureEquals(existing.getDefaultBgmVolume(), DEFAULT_VOLUME, existing::setDefaultBgmVolume);
        changed |= ensureEquals(existing.getDefaultBgvVolume(), DEFAULT_VOLUME, existing::setDefaultBgvVolume);
        changed |= ensureEquals(existing.getCustomSchemaJson(), DEFAULT_CUSTOM_SCHEMA_JSON, existing::setCustomSchemaJson);
        changed |= ensureEquals(existing.getCustomDefaultsJson(), DEFAULT_CUSTOM_DEFAULTS_JSON, existing::setCustomDefaultsJson);
        changed |= ensureEquals(existing.getVisibilityCode(), AssetVisibilityEnum.PUBLIC.getCode(), existing::setVisibilityCode);
        changed |= ensureEquals(existing.getAuditStatus(), AssetAuditStatusEnum.APPROVED.name(), existing::setAuditStatus);
        changed |= ensureEquals(existing.getImportSource(), DEFAULT_IMPORT_SOURCE, existing::setImportSource);
        changed |= ensureEquals(existing.getWorkshopItemId(), null, existing::setWorkshopItemId);
        changed |= ensureEquals(existing.getEnabledFlag(), true, existing::setEnabledFlag);
        if (changed) {
            existing.setUpdatedAt(LocalDateTime.now());
            wallpaperProfileMapper.updateById(existing);
        }
    }

    private void applyAssetBaseline(MediaAssetEntity asset, String bucket, String contentType) {
        asset.setUserId(ownerUserId);
        asset.setBucketName(bucket);
        asset.setObjectKey(DEFAULT_OBJECT_KEY);
        asset.setAssetType(AssetKindEnum.STATIC_IMAGE.name());
        asset.setAssetKindCode(AssetKindEnum.STATIC_IMAGE.getCode());
        asset.setVisibilityCode(AssetVisibilityEnum.PUBLIC.getCode());
        asset.setHomeEnabledFlag(false);
        asset.setHomeSortNum(0);
        asset.setContentTypeText(contentType);
        asset.setMetadataJson(DEFAULT_ASSET_METADATA_JSON);
        asset.setAuditStatus(AssetAuditStatusEnum.APPROVED.name());
    }

    private void applyWallpaperBaseline(MediaWallpaperProfileEntity profile, Long visualAssetId) {
        profile.setOwnerUserId(ownerUserId);
        profile.setTitleText(DEFAULT_WALLPAPER_TITLE);
        profile.setVisualAssetId(visualAssetId);
        profile.setSceneType(WallpaperSceneTypeEnum.STATIC.name());
        profile.setEmbeddedBgmAssetId(null);
        profile.setEmbeddedBgvAssetId(null);
        profile.setDefaultMasterVolume(DEFAULT_VOLUME);
        profile.setDefaultBgmVolume(DEFAULT_VOLUME);
        profile.setDefaultBgvVolume(DEFAULT_VOLUME);
        profile.setCustomSchemaJson(DEFAULT_CUSTOM_SCHEMA_JSON);
        profile.setCustomDefaultsJson(DEFAULT_CUSTOM_DEFAULTS_JSON);
        profile.setVisibilityCode(AssetVisibilityEnum.PUBLIC.getCode());
        profile.setAuditStatus(AssetAuditStatusEnum.APPROVED.name());
        profile.setImportSource(DEFAULT_IMPORT_SOURCE);
        profile.setWorkshopItemId(null);
        profile.setEnabledFlag(true);
    }

    private String readRequiredBucket() {
        String value = mediaStorageProperties.getPublicBucket();
        if (!StringUtils.hasText(value)) {
            throw new IllegalStateException("shizuki.media.storage.public-bucket is required");
        }
        return value.trim();
    }

    private WallpaperBinary loadDefaultBinary() {
        try {
            if (Files.isRegularFile(LOCAL_FIRST_IMAGE_PATH)) {
                byte[] bytes = Files.readAllBytes(LOCAL_FIRST_IMAGE_PATH);
                if (bytes.length > 0) {
                    return new WallpaperBinary(bytes, "image/png", "local_original_bg");
                }
            }
        } catch (IOException exception) {
            LOGGER.warn("WALLPAPER_BOOTSTRAP_LOCAL_READ_FAIL path={} reason={}", LOCAL_FIRST_IMAGE_PATH, exception.getMessage());
        }
        return new WallpaperBinary(FALLBACK_PNG_BYTES, "image/png", "embedded_fallback");
    }

    private <T> boolean ensureEquals(T current, T expected, java.util.function.Consumer<T> setter) {
        if (current == null && expected == null) {
            return false;
        }
        if (current != null && current.equals(expected)) {
            return false;
        }
        setter.accept(expected);
        return true;
    }

    private record WallpaperBinary(byte[] bytes,
                                   String contentType,
                                   String sourceTag) {
    }
}
