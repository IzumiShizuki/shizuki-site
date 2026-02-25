package io.github.shizuki.site.media.service.impl;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.common.security.context.LoginUserContext;
import io.github.shizuki.common.security.model.LoginUser;
import io.github.shizuki.common.storage.client.ObjectStorageClient;
import io.github.shizuki.common.storage.config.OssProperties;
import io.github.shizuki.site.media.integration.SpotifyMusicProvider;
import io.github.shizuki.site.media.integration.UserMusicGateway;
import io.github.shizuki.site.media.config.MediaStorageProperties;
import io.github.shizuki.site.media.dto.AdminMusicDefaultPlaylistBundleReplaceRequest;
import io.github.shizuki.site.media.dto.AdminMusicPlaylistProfileUpsertRequest;
import io.github.shizuki.site.media.dto.AdminMusicTrackUpsertRequest;
import io.github.shizuki.site.media.dto.AssetDownloadResponse;
import io.github.shizuki.site.media.dto.UploadRelayResponse;
import io.github.shizuki.site.media.entity.MediaAssetEntity;
import io.github.shizuki.site.media.entity.MediaAssetGroupAclEntity;
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
import io.github.shizuki.site.media.model.AssetVisibilityEnum;
import io.github.shizuki.site.media.service.l2d.L2dZipValidator;
import io.github.shizuki.site.media.service.security.AssetInspectionResult;
import io.github.shizuki.site.media.service.security.AssetSecurityInspector;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
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

class MediaServiceImplTest {

    private ObjectStorageClient objectStorageClient;
    private MediaAssetMapper mediaAssetMapper;
    private MediaAssetGroupAclMapper mediaAssetGroupAclMapper;
    private MediaAssetReportMapper mediaAssetReportMapper;
    private MediaL2dPackageMapper mediaL2dPackageMapper;
    private MusicPlaylistMapper musicPlaylistMapper;
    private MusicPlaylistProfileMapper musicPlaylistProfileMapper;
    private MusicPickUsageMapper musicPickUsageMapper;
    private MusicProviderConfigMapper musicProviderConfigMapper;
    private MusicProviderGuideMapper musicProviderGuideMapper;
    private MusicUploadUsageMapper musicUploadUsageMapper;
    private MusicTrackCacheMapper musicTrackCacheMapper;
    private UserMusicPlaylistMapper userMusicPlaylistMapper;
    private UserMusicPlaylistTrackMapper userMusicPlaylistTrackMapper;
    private UserMusicPlaylistCollectMapper userMusicPlaylistCollectMapper;
    private L2dZipValidator l2dZipValidator;
    private AssetSecurityInspector assetSecurityInspector;
    private UserMusicGateway userMusicClient;
    private SpotifyMusicProvider spotifyMusicClient;
    private MediaServiceImpl mediaService;

    @BeforeEach
    void setUp() {
        objectStorageClient = Mockito.mock(ObjectStorageClient.class);
        mediaAssetMapper = Mockito.mock(MediaAssetMapper.class);
        mediaAssetGroupAclMapper = Mockito.mock(MediaAssetGroupAclMapper.class);
        mediaAssetReportMapper = Mockito.mock(MediaAssetReportMapper.class);
        mediaL2dPackageMapper = Mockito.mock(MediaL2dPackageMapper.class);
        musicPlaylistMapper = Mockito.mock(MusicPlaylistMapper.class);
        musicPlaylistProfileMapper = Mockito.mock(MusicPlaylistProfileMapper.class);
        musicPickUsageMapper = Mockito.mock(MusicPickUsageMapper.class);
        musicProviderConfigMapper = Mockito.mock(MusicProviderConfigMapper.class);
        musicProviderGuideMapper = Mockito.mock(MusicProviderGuideMapper.class);
        musicUploadUsageMapper = Mockito.mock(MusicUploadUsageMapper.class);
        musicTrackCacheMapper = Mockito.mock(MusicTrackCacheMapper.class);
        userMusicPlaylistMapper = Mockito.mock(UserMusicPlaylistMapper.class);
        userMusicPlaylistTrackMapper = Mockito.mock(UserMusicPlaylistTrackMapper.class);
        userMusicPlaylistCollectMapper = Mockito.mock(UserMusicPlaylistCollectMapper.class);
        l2dZipValidator = Mockito.mock(L2dZipValidator.class);
        assetSecurityInspector = Mockito.mock(AssetSecurityInspector.class);
        userMusicClient = Mockito.mock(UserMusicGateway.class);
        spotifyMusicClient = Mockito.mock(SpotifyMusicProvider.class);
        Mockito.when(assetSecurityInspector.inspect(
                Mockito.anyLong(),
                Mockito.anyString(),
                Mockito.anyString(),
                Mockito.any(),
                Mockito.anyString(),
                Mockito.any()))
            .thenReturn(new AssetInspectionResult(
                "test-hash",
                "BYPASSED",
                "SECURITY_SCAN_BYPASSED",
                100L,
                "image/png"
            ));

        MediaStorageProperties mediaStorageProperties = new MediaStorageProperties();
        mediaStorageProperties.setPublicBucket("shizuki-public");
        mediaStorageProperties.setPrivateBucket("shizuki-private");
        mediaStorageProperties.setPublicBaseUrl("https://cdn.example.com");
        mediaStorageProperties.setSignExpireSeconds(600L);
        mediaStorageProperties.setAllowedContentTypes(Set.of(
            "image/png",
            "image/jpeg",
            "image/webp",
            "image/gif",
            "image/apng",
            "application/zip",
            "application/x-zip-compressed",
            "audio/mpeg",
            "audio/wav",
            "audio/ogg"
        ));

        OssProperties ossProperties = new OssProperties();
        ossProperties.setEndpoint("https://oss-cn-hangzhou.aliyuncs.com");

        mediaService = new MediaServiceImpl(
            objectStorageClient,
            mediaStorageProperties,
            ossProperties,
            mediaAssetMapper,
            mediaAssetGroupAclMapper,
            mediaAssetReportMapper,
            mediaL2dPackageMapper,
            musicPlaylistMapper,
            musicPlaylistProfileMapper,
            musicPickUsageMapper,
            musicProviderConfigMapper,
            musicProviderGuideMapper,
            musicUploadUsageMapper,
            musicTrackCacheMapper,
            userMusicPlaylistMapper,
            userMusicPlaylistTrackMapper,
            userMusicPlaylistCollectMapper,
            l2dZipValidator,
            assetSecurityInspector,
            userMusicClient,
            spotifyMusicClient,
            new com.fasterxml.jackson.databind.ObjectMapper(),
            new TransactionTemplate(new NoOpTransactionManager())
        );
    }

    @AfterEach
    void tearDown() {
        LoginUserContext.clear();
    }

    @Test
    void shouldAllowPublicApprovedDownloadWithoutLogin() {
        MediaAssetEntity asset = buildAsset(100L, 1L, AssetVisibilityEnum.PUBLIC.getCode(), "APPROVED");
        Mockito.when(mediaAssetMapper.selectById(100L)).thenReturn(asset);

        AssetDownloadResponse response = mediaService.createDownloadUrl(100L);

        Assertions.assertTrue(response.isPublic());
        Assertions.assertEquals("https://cdn.example.com/test/file.png", response.publicUrl());
        Assertions.assertNull(response.downloadUrl());
    }

    @Test
    void shouldRejectGuestWhenPublicAssetNotApproved() {
        MediaAssetEntity asset = buildAsset(101L, 1L, AssetVisibilityEnum.PUBLIC.getCode(), "PENDING_AUDIT");
        Mockito.when(mediaAssetMapper.selectById(101L)).thenReturn(asset);

        BusinessException exception = Assertions.assertThrows(BusinessException.class, () -> mediaService.createDownloadUrl(101L));
        Assertions.assertEquals(ErrorCode.FORBIDDEN, exception.getErrorCode());
    }

    @Test
    void shouldAllowOwnerToDownloadPrivateAsset() {
        MediaAssetEntity asset = buildAsset(102L, 9L, AssetVisibilityEnum.PRIVATE.getCode(), "PENDING_AUDIT");
        Mockito.when(mediaAssetMapper.selectById(102L)).thenReturn(asset);
        Mockito.when(objectStorageClient.generateGetUrl("shizuki-private", "test/file.png", 600L))
            .thenReturn("https://signed.example.com/private");
        LoginUserContext.set(new LoginUser(9L, Set.of("USER"), Set.of()));

        AssetDownloadResponse response = mediaService.createDownloadUrl(102L);

        Assertions.assertFalse(response.isPublic());
        Assertions.assertEquals("https://signed.example.com/private", response.downloadUrl());
    }

    @Test
    void shouldAllowAdminToDownloadPrivateAsset() {
        MediaAssetEntity asset = buildAsset(103L, 8L, AssetVisibilityEnum.PRIVATE.getCode(), "PENDING_AUDIT");
        Mockito.when(mediaAssetMapper.selectById(103L)).thenReturn(asset);
        Mockito.when(objectStorageClient.generateGetUrl("shizuki-private", "test/file.png", 600L))
            .thenReturn("https://signed.example.com/admin");
        LoginUserContext.set(new LoginUser(99L, Set.of("ADMIN"), Set.of()));

        AssetDownloadResponse response = mediaService.createDownloadUrl(103L);

        Assertions.assertFalse(response.isPublic());
        Assertions.assertEquals("https://signed.example.com/admin", response.downloadUrl());
    }

    @Test
    void shouldRejectOtherUserForPrivateAsset() {
        MediaAssetEntity asset = buildAsset(104L, 7L, AssetVisibilityEnum.PRIVATE.getCode(), "PENDING_AUDIT");
        Mockito.when(mediaAssetMapper.selectById(104L)).thenReturn(asset);
        LoginUserContext.set(new LoginUser(10L, Set.of("USER"), Set.of()));

        BusinessException exception = Assertions.assertThrows(BusinessException.class, () -> mediaService.createDownloadUrl(104L));
        Assertions.assertEquals(ErrorCode.FORBIDDEN, exception.getErrorCode());
    }

    @Test
    void shouldAllowGroupMemberToDownloadGroupAsset() {
        MediaAssetEntity asset = buildAsset(105L, 8L, AssetVisibilityEnum.GROUP.getCode(), "PENDING_AUDIT");
        Mockito.when(mediaAssetMapper.selectById(105L)).thenReturn(asset);
        MediaAssetGroupAclEntity acl = new MediaAssetGroupAclEntity();
        acl.setAssetId(105L);
        acl.setGroupCode("FAMILY");
        Mockito.when(mediaAssetGroupAclMapper.selectList(ArgumentMatchers.any())).thenReturn(List.of(acl));
        Mockito.when(objectStorageClient.generateGetUrl("shizuki-private", "test/file.png", 600L))
            .thenReturn("https://signed.example.com/group");
        LoginUserContext.set(new LoginUser(12L, Set.of("FAMILY"), Set.of()));

        AssetDownloadResponse response = mediaService.createDownloadUrl(105L);

        Assertions.assertFalse(response.isPublic());
        Assertions.assertEquals("https://signed.example.com/group", response.downloadUrl());
    }

    @Test
    void shouldRejectNonMemberForGroupAsset() {
        MediaAssetEntity asset = buildAsset(106L, 8L, AssetVisibilityEnum.GROUP.getCode(), "PENDING_AUDIT");
        Mockito.when(mediaAssetMapper.selectById(106L)).thenReturn(asset);
        MediaAssetGroupAclEntity acl = new MediaAssetGroupAclEntity();
        acl.setAssetId(106L);
        acl.setGroupCode("FAMILY");
        Mockito.when(mediaAssetGroupAclMapper.selectList(ArgumentMatchers.any())).thenReturn(List.of(acl));
        LoginUserContext.set(new LoginUser(13L, Set.of("FRIEND"), Set.of()));

        BusinessException exception = Assertions.assertThrows(BusinessException.class, () -> mediaService.createDownloadUrl(106L));
        Assertions.assertEquals(ErrorCode.FORBIDDEN, exception.getErrorCode());
    }

    @Test
    void shouldUploadRelayImageSuccessfully() {
        LoginUserContext.set(new LoginUser(3L, Set.of("USER"), Set.of()));
        MockMultipartFile file = new MockMultipartFile("file", "avatar.png", "image/png", new byte[] {1, 2, 3, 4});

        UploadRelayResponse response = mediaService.uploadRelay(file, "STATIC_IMAGE", "PUBLIC");

        Assertions.assertEquals("shizuki-public", response.bucket());
        Assertions.assertEquals("image/png", response.contentType());
        Assertions.assertEquals("STATIC_IMAGE", response.assetKind());
        Assertions.assertEquals("RELAY_OSS", response.uploadStrategy());
        Mockito.verify(objectStorageClient, Mockito.times(1))
            .putObject(Mockito.eq("shizuki-public"), Mockito.anyString(), Mockito.any(), Mockito.any());
    }

    @Test
    void shouldRejectRelayUploadWhenContentTypeInvalid() {
        LoginUserContext.set(new LoginUser(3L, Set.of("USER"), Set.of()));
        MockMultipartFile file = new MockMultipartFile("file", "avatar.bmp", "image/bmp", new byte[] {1, 2, 3, 4});

        BusinessException exception = Assertions.assertThrows(
            BusinessException.class,
            () -> mediaService.uploadRelay(file, "STATIC_IMAGE", "PUBLIC")
        );

        Assertions.assertEquals(ErrorCode.BAD_REQUEST, exception.getErrorCode());
    }

    @Test
    void shouldRejectRelayUploadWhenFileTooLarge() {
        LoginUserContext.set(new LoginUser(3L, Set.of("USER"), Set.of()));
        byte[] oversized = new byte[2048];
        MockMultipartFile file = new MockMultipartFile("file", "avatar.png", "image/png", oversized);

        MediaStorageProperties tinyLimitProperties = new MediaStorageProperties();
        tinyLimitProperties.setPublicBucket("shizuki-public");
        tinyLimitProperties.setPrivateBucket("shizuki-private");
        tinyLimitProperties.setPublicBaseUrl("https://cdn.example.com");
        tinyLimitProperties.setSignExpireSeconds(600L);
        tinyLimitProperties.setMaxUploadSize(10L);
        tinyLimitProperties.setAllowedContentTypes(Set.of("image/png"));

        OssProperties tinyLimitOss = new OssProperties();
        tinyLimitOss.setEndpoint("https://oss-cn-hangzhou.aliyuncs.com");

        MediaServiceImpl tinyLimitService = new MediaServiceImpl(
            objectStorageClient,
            tinyLimitProperties,
            tinyLimitOss,
            mediaAssetMapper,
            mediaAssetGroupAclMapper,
            mediaAssetReportMapper,
            mediaL2dPackageMapper,
            musicPlaylistMapper,
            musicPlaylistProfileMapper,
            musicPickUsageMapper,
            musicProviderConfigMapper,
            musicProviderGuideMapper,
            musicUploadUsageMapper,
            musicTrackCacheMapper,
            userMusicPlaylistMapper,
            userMusicPlaylistTrackMapper,
            userMusicPlaylistCollectMapper,
            l2dZipValidator,
            assetSecurityInspector,
            userMusicClient,
            spotifyMusicClient,
            new com.fasterxml.jackson.databind.ObjectMapper(),
            new TransactionTemplate(new NoOpTransactionManager())
        );

        BusinessException exception = Assertions.assertThrows(
            BusinessException.class,
            () -> tinyLimitService.uploadRelay(file, "STATIC_IMAGE", "PUBLIC")
        );

        Assertions.assertEquals(ErrorCode.BAD_REQUEST, exception.getErrorCode());
    }

    @Test
    void shouldRejectBundleReplaceWhenProfileCoverUrlNotHttp() {
        AdminMusicPlaylistProfileUpsertRequest profile = new AdminMusicPlaylistProfileUpsertRequest();
        profile.setPlaylistCode("default_public");
        profile.setName("默认歌单");
        profile.setDescription("简介");
        profile.setCover("ftp://invalid-cover.example.com/a.png");

        AdminMusicDefaultPlaylistBundleReplaceRequest request = new AdminMusicDefaultPlaylistBundleReplaceRequest();
        request.setProfile(profile);
        request.setTracks(new ArrayList<>());

        BusinessException exception = Assertions.assertThrows(
            BusinessException.class,
            () -> mediaService.replaceAdminDefaultPlaylistBundle(request)
        );

        Assertions.assertEquals(ErrorCode.BAD_REQUEST, exception.getErrorCode());
    }

    @Test
    void shouldRejectBundleReplaceWhenTrackAudioUrlNotHttp() {
        AdminMusicTrackUpsertRequest track = new AdminMusicTrackUpsertRequest();
        track.setTrackId("track-1");
        track.setProvider("local");
        track.setTitle("Rain");
        track.setArtist("Shizuki");
        track.setCover("https://cdn.example.com/cover.png");
        track.setAudio("ftp://invalid-audio.example.com/rain.mp3");
        track.setLyric("https://cdn.example.com/rain.lrc");
        track.setSort(1);
        track.setEnabled(true);

        AdminMusicDefaultPlaylistBundleReplaceRequest request = new AdminMusicDefaultPlaylistBundleReplaceRequest();
        request.setTracks(List.of(track));

        Mockito.when(musicPlaylistMapper.selectList(ArgumentMatchers.any())).thenReturn(List.of());

        BusinessException exception = Assertions.assertThrows(
            BusinessException.class,
            () -> mediaService.replaceAdminDefaultPlaylistBundle(request)
        );

        Assertions.assertEquals(ErrorCode.BAD_REQUEST, exception.getErrorCode());
    }

    private MediaAssetEntity buildAsset(Long id, Long userId, Integer visibilityCode, String auditStatus) {
        MediaAssetEntity entity = new MediaAssetEntity();
        entity.setId(id);
        entity.setUserId(userId);
        entity.setBucketName(visibilityCode.equals(AssetVisibilityEnum.PUBLIC.getCode()) ? "shizuki-public" : "shizuki-private");
        entity.setObjectKey("test/file.png");
        entity.setAssetKindCode(1);
        entity.setVisibilityCode(visibilityCode);
        entity.setAuditStatus(auditStatus);
        return entity;
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
