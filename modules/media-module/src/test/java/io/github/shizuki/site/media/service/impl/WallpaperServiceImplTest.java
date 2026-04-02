package io.github.shizuki.site.media.service.impl;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.security.context.LoginUserContext;
import io.github.shizuki.common.security.model.LoginUser;
import io.github.shizuki.common.storage.client.ObjectStorageClient;
import io.github.shizuki.common.storage.config.OssProperties;
import io.github.shizuki.site.media.config.MediaStorageProperties;
import io.github.shizuki.site.media.config.WallpaperWorkshopProperties;
import io.github.shizuki.site.media.response.WallpaperImportJobResponse;
import io.github.shizuki.site.media.request.WallpaperSettingsUpdateRequest;
import io.github.shizuki.site.media.entity.MediaAssetEntity;
import io.github.shizuki.site.media.entity.MediaWallpaperImportJobEntity;
import io.github.shizuki.site.media.entity.MediaWallpaperProfileEntity;
import io.github.shizuki.site.media.mapper.MediaAssetMapper;
import io.github.shizuki.site.media.mapper.MediaL2dPackageMapper;
import io.github.shizuki.site.media.mapper.MediaWallpaperImportJobMapper;
import io.github.shizuki.site.media.mapper.MediaWallpaperProfileMapper;
import io.github.shizuki.site.media.model.AssetAuditStatusEnum;
import io.github.shizuki.site.media.model.AssetKindEnum;
import io.github.shizuki.site.media.model.AssetVisibilityEnum;
import io.github.shizuki.site.media.model.WallpaperSceneTypeEnum;
import io.github.shizuki.site.media.service.l2d.L2dValidationResult;
import io.github.shizuki.site.media.service.l2d.L2dZipValidator;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.support.AbstractPlatformTransactionManager;
import org.springframework.transaction.support.DefaultTransactionStatus;
import org.springframework.transaction.support.TransactionTemplate;

class WallpaperServiceImplTest {

    private ObjectStorageClient objectStorageClient;
    private MediaAssetMapper mediaAssetMapper;
    private MediaL2dPackageMapper mediaL2dPackageMapper;
    private MediaWallpaperProfileMapper wallpaperProfileMapper;
    private MediaWallpaperImportJobMapper wallpaperImportJobMapper;
    private L2dZipValidator l2dZipValidator;

    private final Map<Long, MediaAssetEntity> assetStore = new LinkedHashMap<>();
    private final Map<Long, MediaWallpaperProfileEntity> profileStore = new LinkedHashMap<>();
    private final Map<Long, MediaWallpaperImportJobEntity> jobStore = new LinkedHashMap<>();
    private final AtomicLong assetIdSeq = new AtomicLong(1000);
    private final AtomicLong profileIdSeq = new AtomicLong(3000);
    private final AtomicLong jobIdSeq = new AtomicLong(5000);

    private WallpaperServiceImpl wallpaperService;

    @BeforeEach
    void setUp() {
        objectStorageClient = Mockito.mock(ObjectStorageClient.class);
        mediaAssetMapper = Mockito.mock(MediaAssetMapper.class);
        mediaL2dPackageMapper = Mockito.mock(MediaL2dPackageMapper.class);
        wallpaperProfileMapper = Mockito.mock(MediaWallpaperProfileMapper.class);
        wallpaperImportJobMapper = Mockito.mock(MediaWallpaperImportJobMapper.class);
        l2dZipValidator = Mockito.mock(L2dZipValidator.class);
        WorkshopImportWorker workshopImportWorker = Mockito.mock(WorkshopImportWorker.class);

        MediaStorageProperties mediaStorageProperties = new MediaStorageProperties();
        mediaStorageProperties.setPrivateBucket("shizuki-private");
        mediaStorageProperties.setPublicBucket("shizuki-public");
        mediaStorageProperties.setPublicBaseUrl("https://cdn.example.com");
        mediaStorageProperties.setSignExpireSeconds(600L);
        mediaStorageProperties.setMaxUploadSize(30L * 1024L * 1024L);

        OssProperties ossProperties = new OssProperties();
        ossProperties.setEndpoint("https://oss-cn-hangzhou.aliyuncs.com");

        WallpaperWorkshopProperties workshopProperties = new WallpaperWorkshopProperties();

        Mockito.when(objectStorageClient.generateGetUrl(
                ArgumentMatchers.anyString(),
                ArgumentMatchers.anyString(),
                ArgumentMatchers.anyLong()))
            .thenAnswer(invocation -> "https://signed.example.com/" + invocation.getArgument(1, String.class));

        Mockito.doAnswer(invocation -> {
            MediaAssetEntity entity = invocation.getArgument(0);
            if (entity.getId() == null) {
                entity.setId(assetIdSeq.incrementAndGet());
            }
            assetStore.put(entity.getId(), entity);
            return 1;
        }).when(mediaAssetMapper).insert(ArgumentMatchers.any(MediaAssetEntity.class));
        Mockito.when(mediaAssetMapper.selectById(ArgumentMatchers.anyLong())).thenAnswer(invocation -> assetStore.get(invocation.getArgument(0)));
        Mockito.when(mediaAssetMapper.selectList(ArgumentMatchers.any()))
            .thenAnswer(invocation -> new java.util.ArrayList<>(assetStore.values()));
        Mockito.doAnswer(invocation -> {
            Long assetId = invocation.getArgument(0);
            assetStore.remove(assetId);
            return 1;
        }).when(mediaAssetMapper).deleteById(ArgumentMatchers.anyLong());

        Mockito.doAnswer(invocation -> {
            MediaWallpaperProfileEntity entity = invocation.getArgument(0);
            if (entity.getId() == null) {
                entity.setId(profileIdSeq.incrementAndGet());
            }
            profileStore.put(entity.getId(), entity);
            return 1;
        }).when(wallpaperProfileMapper).insert(ArgumentMatchers.any(MediaWallpaperProfileEntity.class));
        Mockito.when(wallpaperProfileMapper.selectById(ArgumentMatchers.anyLong()))
            .thenAnswer(invocation -> profileStore.get(invocation.getArgument(0)));
        Mockito.doAnswer(invocation -> {
            MediaWallpaperProfileEntity entity = invocation.getArgument(0);
            if (entity != null && entity.getId() != null) {
                profileStore.put(entity.getId(), entity);
            }
            return 1;
        }).when(wallpaperProfileMapper).updateById(ArgumentMatchers.any(MediaWallpaperProfileEntity.class));
        Mockito.doAnswer(invocation -> {
            Long profileId = invocation.getArgument(0);
            profileStore.remove(profileId);
            return 1;
        }).when(wallpaperProfileMapper).deleteById(ArgumentMatchers.anyLong());

        Mockito.doAnswer(invocation -> {
            MediaWallpaperImportJobEntity entity = invocation.getArgument(0);
            if (entity.getId() == null) {
                entity.setId(jobIdSeq.incrementAndGet());
            }
            jobStore.put(entity.getId(), entity);
            return 1;
        }).when(wallpaperImportJobMapper).insert(ArgumentMatchers.any(MediaWallpaperImportJobEntity.class));
        Mockito.when(wallpaperImportJobMapper.selectById(ArgumentMatchers.anyLong()))
            .thenAnswer(invocation -> jobStore.get(invocation.getArgument(0)));
        Mockito.doAnswer(invocation -> {
            MediaWallpaperImportJobEntity entity = invocation.getArgument(0);
            if (entity != null && entity.getId() != null) {
                jobStore.put(entity.getId(), entity);
            }
            return 1;
        }).when(wallpaperImportJobMapper).updateById(ArgumentMatchers.any(MediaWallpaperImportJobEntity.class));

        wallpaperService = new WallpaperServiceImpl(
            objectStorageClient,
            mediaStorageProperties,
            ossProperties,
            workshopProperties,
            mediaAssetMapper,
            mediaL2dPackageMapper,
            wallpaperProfileMapper,
            wallpaperImportJobMapper,
            l2dZipValidator,
            new com.fasterxml.jackson.databind.ObjectMapper(),
            new TransactionTemplate(new NoOpTransactionManager()),
            workshopImportWorker
        );
    }

    @AfterEach
    void tearDown() {
        LoginUserContext.clear();
    }

    @Test
    void shouldPreferDynamicVisualOverStaticWhenImportZip() {
        LoginUserContext.set(new LoginUser(11L, Set.of("USER"), Set.of()));
        Mockito.when(l2dZipValidator.validate(ArgumentMatchers.any())).thenThrow(new RuntimeException("not l2d"));

        Map<String, byte[]> entries = new LinkedHashMap<>();
        entries.put("cover.jpg", new byte[] {1, 2, 3});
        entries.put("loop.mp4", new byte[] {4, 5, 6});
        entries.put("bgm.mp3", new byte[] {7, 8, 9});
        byte[] zip = zipOf(entries);

        MockMultipartFile file = new MockMultipartFile("file", "mixed.zip", "application/zip", zip);
        WallpaperImportJobResponse response = wallpaperService.importPackage(file, "PRIVATE", "");

        Assertions.assertEquals("SUCCEEDED", response.status());
        Assertions.assertNotNull(response.wallpaperId());

        MediaWallpaperProfileEntity profile = profileStore.get(response.wallpaperId());
        Assertions.assertNotNull(profile);
        Assertions.assertEquals(WallpaperSceneTypeEnum.DYNAMIC.name(), profile.getSceneType());
        Assertions.assertNotNull(profile.getEmbeddedBgmAssetId());

        MediaAssetEntity visual = assetStore.get(profile.getVisualAssetId());
        Assertions.assertNotNull(visual);
        Assertions.assertEquals(AssetKindEnum.ANIMATED_IMAGE.getCode(), visual.getAssetKindCode());
    }

    @Test
    void shouldClassifyAsL2dWhenZipValidatorPasses() {
        LoginUserContext.set(new LoginUser(12L, Set.of("USER"), Set.of()));
        L2dValidationResult result = new L2dValidationResult();
        result.setEntryModelJson("haru/haru.model3.json");
        result.setMocPath("haru/haru.moc3");
        result.setTextureCount(2);
        result.setMotionGroupCount(1);
        result.setExpressionCount(1);
        result.setHasPhysics(true);
        result.setHasPose(false);

        Mockito.when(l2dZipValidator.validate(ArgumentMatchers.any())).thenReturn(result);

        Map<String, byte[]> entries = new LinkedHashMap<>();
        entries.put("haru/haru.model3.json", "{}".getBytes(StandardCharsets.UTF_8));
        byte[] zip = zipOf(entries);
        MockMultipartFile file = new MockMultipartFile("file", "haru.zip", "application/zip", zip);
        WallpaperImportJobResponse response = wallpaperService.importPackage(file, "PRIVATE", "春日");

        Assertions.assertEquals("SUCCEEDED", response.status());
        MediaWallpaperProfileEntity profile = profileStore.get(response.wallpaperId());
        Assertions.assertEquals(WallpaperSceneTypeEnum.L2D.name(), profile.getSceneType());

        MediaAssetEntity visual = assetStore.get(profile.getVisualAssetId());
        Assertions.assertEquals(AssetKindEnum.LIVE2D_PACKAGE.getCode(), visual.getAssetKindCode());
        Mockito.verify(mediaL2dPackageMapper, Mockito.times(1))
            .insert(ArgumentMatchers.any(io.github.shizuki.site.media.entity.MediaL2dPackageEntity.class));
    }

    @Test
    void shouldSetPendingAuditWhenUserImportsPublicVisibility() {
        LoginUserContext.set(new LoginUser(21L, Set.of("USER"), Set.of()));
        MockMultipartFile file = new MockMultipartFile("file", "sky.png", "image/png", new byte[] {1, 2, 3});

        WallpaperImportJobResponse response = wallpaperService.importPackage(file, "PUBLIC", "公开图片");
        MediaWallpaperProfileEntity profile = profileStore.get(response.wallpaperId());
        MediaAssetEntity visual = assetStore.get(profile.getVisualAssetId());

        Assertions.assertEquals(AssetVisibilityEnum.PUBLIC.getCode(), profile.getVisibilityCode());
        Assertions.assertEquals(AssetAuditStatusEnum.PENDING_AUDIT.name(), profile.getAuditStatus());
        Assertions.assertEquals(AssetAuditStatusEnum.PENDING_AUDIT.name(), visual.getAuditStatus());
        Assertions.assertEquals("shizuki-public", visual.getBucketName());
    }

    @Test
    void shouldApprovePublicVisibilityWhenAdminImportsPackage() {
        LoginUserContext.set(new LoginUser(22L, Set.of("ADMIN"), Set.of()));
        MockMultipartFile file = new MockMultipartFile("file", "city.png", "image/png", new byte[] {4, 5, 6});

        WallpaperImportJobResponse response = wallpaperService.importPackage(file, "PUBLIC", "管理员公开");
        MediaWallpaperProfileEntity profile = profileStore.get(response.wallpaperId());

        Assertions.assertEquals(AssetVisibilityEnum.PUBLIC.getCode(), profile.getVisibilityCode());
        Assertions.assertEquals(AssetAuditStatusEnum.APPROVED.name(), profile.getAuditStatus());
    }

    @Test
    void shouldUpdateWallpaperTitleAndClearEmbeddedAssets() {
        LoginUserContext.set(new LoginUser(31L, Set.of("USER"), Set.of()));
        Mockito.when(l2dZipValidator.validate(ArgumentMatchers.any())).thenThrow(new RuntimeException("not l2d"));

        Map<String, byte[]> entries = new LinkedHashMap<>();
        entries.put("cover.jpg", new byte[] {1, 2, 3});
        entries.put("bgm.mp3", new byte[] {7, 8, 9});
        MockMultipartFile file = new MockMultipartFile("file", "mixed.zip", "application/zip", zipOf(entries));
        WallpaperImportJobResponse response = wallpaperService.importPackage(file, "PRIVATE", "旧标题");

        MediaWallpaperProfileEntity before = profileStore.get(response.wallpaperId());
        Assertions.assertNotNull(before);
        Assertions.assertNotNull(before.getEmbeddedBgmAssetId());

        WallpaperSettingsUpdateRequest request = new WallpaperSettingsUpdateRequest();
        request.setTitle("新标题");
        request.setEmbeddedBgmAssetId(0L);
        request.setEmbeddedBgvAssetId(0L);

        wallpaperService.updateWallpaperSettings(response.wallpaperId(), request);

        MediaWallpaperProfileEntity after = profileStore.get(response.wallpaperId());
        Assertions.assertNotNull(after);
        Assertions.assertEquals("新标题", after.getTitleText());
        Assertions.assertNull(after.getEmbeddedBgmAssetId());
        Assertions.assertNull(after.getEmbeddedBgvAssetId());
    }

    @Test
    void shouldDeleteWallpaperAndManagedAssets() {
        LoginUserContext.set(new LoginUser(32L, Set.of("USER"), Set.of()));
        Mockito.when(l2dZipValidator.validate(ArgumentMatchers.any())).thenThrow(new RuntimeException("not l2d"));

        Map<String, byte[]> entries = new LinkedHashMap<>();
        entries.put("cover.jpg", new byte[] {1, 2, 3});
        entries.put("bgm.mp3", new byte[] {7, 8, 9});
        MockMultipartFile file = new MockMultipartFile("file", "mixed.zip", "application/zip", zipOf(entries));
        WallpaperImportJobResponse response = wallpaperService.importPackage(file, "PRIVATE", "待删除");

        MediaWallpaperProfileEntity profile = profileStore.get(response.wallpaperId());
        Assertions.assertNotNull(profile);
        MediaAssetEntity visual = assetStore.get(profile.getVisualAssetId());
        MediaAssetEntity bgm = assetStore.get(profile.getEmbeddedBgmAssetId());
        Assertions.assertNotNull(visual);
        Assertions.assertNotNull(bgm);

        wallpaperService.deleteWallpaper(response.wallpaperId());

        Assertions.assertNull(profileStore.get(response.wallpaperId()));
        Assertions.assertNull(assetStore.get(visual.getId()));
        Assertions.assertNull(assetStore.get(bgm.getId()));
        Mockito.verify(objectStorageClient).deleteObject(visual.getBucketName(), visual.getObjectKey());
        Mockito.verify(objectStorageClient).deleteObject(bgm.getBucketName(), bgm.getObjectKey());
    }

    @Test
    void shouldRejectDeleteWallpaperWhenUserIsNotOwner() {
        LoginUserContext.set(new LoginUser(33L, Set.of("USER"), Set.of()));
        MockMultipartFile file = new MockMultipartFile("file", "sky.png", "image/png", new byte[] {1, 2, 3});
        WallpaperImportJobResponse response = wallpaperService.importPackage(file, "PRIVATE", "仅所有者可删");

        LoginUserContext.set(new LoginUser(34L, Set.of("USER"), Set.of()));

        BusinessException exception = Assertions.assertThrows(
            BusinessException.class,
            () -> wallpaperService.deleteWallpaper(response.wallpaperId())
        );

        Assertions.assertTrue(exception.getMessage().contains("No permission"));
        Assertions.assertNotNull(profileStore.get(response.wallpaperId()));
    }

    private byte[] zipOf(Map<String, byte[]> entries) {
        try {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            try (ZipOutputStream zipOutputStream = new ZipOutputStream(outputStream, StandardCharsets.UTF_8)) {
                for (Map.Entry<String, byte[]> entry : entries.entrySet()) {
                    zipOutputStream.putNextEntry(new ZipEntry(entry.getKey()));
                    zipOutputStream.write(entry.getValue());
                    zipOutputStream.closeEntry();
                }
            }
            return outputStream.toByteArray();
        } catch (IOException exception) {
            throw new IllegalStateException("build zip bytes failed", exception);
        }
    }

    private static class NoOpTransactionManager extends AbstractPlatformTransactionManager {

        @Override
        protected Object doGetTransaction() {
            return new Object();
        }

        @Override
        protected void doBegin(Object transaction, TransactionDefinition definition) {
        }

        @Override
        protected void doCommit(DefaultTransactionStatus status) {
        }

        @Override
        protected void doRollback(DefaultTransactionStatus status) {
        }
    }
}
