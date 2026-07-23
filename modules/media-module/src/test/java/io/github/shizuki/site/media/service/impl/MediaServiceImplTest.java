package io.github.shizuki.site.media.service.impl;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.common.security.context.LoginUserContext;
import io.github.shizuki.common.security.model.LoginUser;
import io.github.shizuki.common.storage.client.ObjectStorageClient;
import io.github.shizuki.common.storage.config.OssProperties;
import io.github.shizuki.site.media.config.MetingMusicProperties;
import io.github.shizuki.site.media.config.MusicListenCacheProperties;
import io.github.shizuki.site.media.integration.AsmrMusicProvider;
import io.github.shizuki.site.media.integration.MetingMusicProvider;
import io.github.shizuki.site.media.integration.NeteaseCookieProvider;
import io.github.shizuki.site.media.integration.SpotifyMusicProvider;
import io.github.shizuki.site.media.integration.UserMusicGateway;
import io.github.shizuki.site.media.config.MediaStorageProperties;
import io.github.shizuki.site.media.request.AdminMusicDefaultPlaylistBundleReplaceRequest;
import io.github.shizuki.site.media.request.AdminMusicPlaylistProfileUpsertRequest;
import io.github.shizuki.site.media.request.AdminMusicTrackUpsertRequest;
import io.github.shizuki.site.media.response.AssetDownloadResponse;
import io.github.shizuki.site.media.response.MusicPlaylistBundleResponse;
import io.github.shizuki.site.media.request.MusicResolvePlaybackRequest;
import io.github.shizuki.site.media.response.MusicSearchResponse;
import io.github.shizuki.site.media.response.MusicSourcePlaylistImportResponse;
import io.github.shizuki.site.media.response.MusicTrackResponse;
import io.github.shizuki.site.media.response.MusicVoiceWorkBundleResponse;
import io.github.shizuki.site.media.response.MusicVoiceWorksResponse;
import io.github.shizuki.site.media.response.UploadRelayResponse;
import io.github.shizuki.site.media.entity.MediaAssetEntity;
import io.github.shizuki.site.media.entity.MediaAssetGroupAclEntity;
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
import io.github.shizuki.site.media.model.AssetVisibilityEnum;
import io.github.shizuki.site.media.mq.MusicTrackCacheUploadPublisher;
import io.github.shizuki.site.media.service.l2d.L2dZipValidator;
import io.github.shizuki.site.media.service.security.AssetInspectionResult;
import io.github.shizuki.site.media.service.security.AssetSecurityInspector;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.ArgumentMatchers;
import org.mockito.InOrder;
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
    private NeteaseCookieProvider neteaseCookieProvider;
    private MetingMusicProvider metingMusicProvider;
    private AsmrMusicProvider asmrMusicProvider;
    private MusicTrackCacheUploadPublisher musicTrackCacheUploadPublisher;
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
        neteaseCookieProvider = Mockito.mock(NeteaseCookieProvider.class);
        metingMusicProvider = Mockito.mock(MetingMusicProvider.class);
        asmrMusicProvider = Mockito.mock(AsmrMusicProvider.class);
        musicTrackCacheUploadPublisher = Mockito.mock(MusicTrackCacheUploadPublisher.class);
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

        mediaService = buildMediaService("th_test_default_key");
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
        MetingMusicProperties metingMusicProperties = new MetingMusicProperties();
        MusicListenCacheProperties listenCacheProperties = new MusicListenCacheProperties();

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
            neteaseCookieProvider,
            asmrMusicProvider,
            musicTrackCacheUploadPublisher,
            metingMusicProvider,
            metingMusicProperties,
            listenCacheProperties,
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

    @Test
    void shouldUpsertDefaultPlaylistTrackAndEnqueueWhenAudioProvided() {
        AdminMusicTrackUpsertRequest request = new AdminMusicTrackUpsertRequest();
        request.setTrackId("487527929");
        request.setProvider("netease");
        request.setTitle("雨夜");
        request.setArtist("Izumi");
        request.setAudio("https://music.example.com/a.mp3");
        request.setEnabled(true);

        Mockito.when(musicPlaylistMapper.selectOne(ArgumentMatchers.any())).thenReturn(null);
        Mockito.when(musicTrackCacheMapper.selectOne(ArgumentMatchers.any())).thenReturn(null);
        Mockito.when(musicTrackCacheUploadPublisher.publish(
            Mockito.anyString(),
            Mockito.anyString(),
            Mockito.anyString(),
            Mockito.anyString(),
            Mockito.anyString()
        )).thenReturn(true);

        mediaService.upsertAdminDefaultPlaylistTrack(request);

        Mockito.verify(musicPlaylistMapper).insert(ArgumentMatchers.<io.github.shizuki.site.media.entity.MusicPlaylistEntity>any());
        Mockito.verify(musicTrackCacheUploadPublisher).publish(
            Mockito.eq("netease"),
            Mockito.eq("487527929"),
            Mockito.eq("https://music.example.com/a.mp3"),
            Mockito.eq("雨夜"),
            Mockito.eq("Izumi")
        );
    }

    @Test
    void shouldParseAndEnqueueWhenDefaultTrackAudioMissing() {
        AdminMusicTrackUpsertRequest request = new AdminMusicTrackUpsertRequest();
        request.setTrackId("1367153990");
        request.setProvider("netease");
        request.setTitle("Need Parse");
        request.setArtist("Shizuki");
        request.setAudio("");
        request.setEnabled(true);

        Mockito.when(musicPlaylistMapper.selectOne(ArgumentMatchers.any())).thenReturn(null);
        Mockito.when(musicTrackCacheMapper.selectOne(ArgumentMatchers.any())).thenReturn(null);
        Mockito.when(metingMusicProvider.parseSingleTrack(
            Mockito.eq("th_test_default_key"),
            Mockito.eq("netease"),
            Mockito.eq("1367153990"),
            Mockito.anyString()
        )).thenReturn(new MetingMusicProvider.ParseTrackResult(
            "1367153990",
            "Need Parse",
            "Shizuki",
            "",
            "https://music.example.com/parsed.mp3",
            "",
            "",
            "",
            ""
        ));
        Mockito.when(musicTrackCacheUploadPublisher.publish(
            Mockito.anyString(),
            Mockito.anyString(),
            Mockito.anyString(),
            Mockito.anyString(),
            Mockito.anyString()
        )).thenReturn(true);

        mediaService.upsertAdminDefaultPlaylistTrack(request);

        Mockito.verify(metingMusicProvider).parseSingleTrack(
            Mockito.eq("th_test_default_key"),
            Mockito.eq("netease"),
            Mockito.eq("1367153990"),
            Mockito.anyString()
        );
        Mockito.verify(musicTrackCacheUploadPublisher).publish(
            Mockito.eq("netease"),
            Mockito.eq("1367153990"),
            Mockito.eq("https://music.example.com/parsed.mp3"),
            Mockito.eq("Need Parse"),
            Mockito.eq("Shizuki")
        );
    }

    @Test
    void shouldNotBlockDefaultTrackUpsertWhenParseFails() {
        AdminMusicTrackUpsertRequest request = new AdminMusicTrackUpsertRequest();
        request.setTrackId("1367153990");
        request.setProvider("netease");
        request.setTitle("Need Parse");
        request.setArtist("Shizuki");
        request.setAudio("");
        request.setEnabled(true);

        Mockito.when(musicPlaylistMapper.selectOne(ArgumentMatchers.any())).thenReturn(null);
        Mockito.when(metingMusicProvider.parseSingleTrack(
            Mockito.eq("th_test_default_key"),
            Mockito.eq("netease"),
            Mockito.eq("1367153990"),
            Mockito.anyString()
        )).thenThrow(new RuntimeException("upstream failed"));

        Assertions.assertDoesNotThrow(() -> mediaService.upsertAdminDefaultPlaylistTrack(request));
        Mockito.verify(musicPlaylistMapper).insert(ArgumentMatchers.<io.github.shizuki.site.media.entity.MusicPlaylistEntity>any());
        Mockito.verify(musicTrackCacheUploadPublisher, Mockito.never()).publish(
            Mockito.anyString(),
            Mockito.anyString(),
            Mockito.anyString(),
            Mockito.anyString(),
            Mockito.anyString()
        );
    }

    @Test
    void shouldAggregateMetingSearchTracksSuccessfully() {
        Mockito.when(metingMusicProvider.searchTracks("th_test_default_key", "netease", "零之", 1, 24))
            .thenReturn(
                List.of(
                    new MetingMusicProvider.SearchTrackResult(
                        "1366570351",
                        "netease",
                        "Sweet",
                        "Bren Joy",
                        "Twenties",
                        "https://cover.example/netease.png",
                        226
                    )
                )
            );
        Mockito.when(metingMusicProvider.searchTracks("th_test_default_key", "kuwo", "零之", 1, 24))
            .thenReturn(
                List.of(
                    new MetingMusicProvider.SearchTrackResult(
                        "168060593",
                        "kuwo",
                        "Sweet",
                        "Bren Joy",
                        "Twenties",
                        "https://cover.example/kuwo.png",
                        226
                    )
                )
            );

        MusicSearchResponse response = mediaService.searchMusic("零之", "track", "netease,kuwo", 1, 24);

        Assertions.assertFalse(response.partial());
        Assertions.assertEquals(2, response.tracks().size());
        Assertions.assertEquals("netease", response.tracks().get(0).provider());
        Assertions.assertEquals("kuwo", response.tracks().get(1).provider());
    }

    @Test
    void shouldReturnPartialWhenOneProviderSearchFails() {
        Mockito.when(metingMusicProvider.searchTracks("th_test_default_key", "netease", "sweet", 1, 24))
            .thenThrow(new RuntimeException("netease upstream error"));
        Mockito.when(metingMusicProvider.searchTracks("th_test_default_key", "kuwo", "sweet", 1, 24))
            .thenReturn(
                List.of(
                    new MetingMusicProvider.SearchTrackResult(
                        "168060593",
                        "kuwo",
                        "Sweet",
                        "Bren Joy",
                        "Twenties",
                        "",
                        226
                    )
                )
            );

        MusicSearchResponse response = mediaService.searchMusic("sweet", "track", "netease,kuwo", 1, 24);

        Assertions.assertTrue(response.partial());
        Assertions.assertEquals(1, response.tracks().size());
        Assertions.assertEquals(List.of("netease"), response.failedProviders());
        Assertions.assertEquals("kuwo", response.tracks().get(0).provider());
    }

    @Test
    void shouldReturnRealPlaylistWhenTypeIsPlaylist() {
        List<MetingMusicProvider.SearchTrackResult> neteasePreview = List.of(
            new MetingMusicProvider.SearchTrackResult(
                "28712251",
                "netease",
                "WHITE ALBUM",
                "平野绫",
                "WHITE ALBUM",
                "https://p1.music.126.net/cover.jpg",
                275
            )
        );
        Mockito.when(metingMusicProvider.searchTracks("th_test_default_key", "netease", "白色相簿", 1, 1))
            .thenReturn(neteasePreview);
        Mockito.when(metingMusicProvider.buildSearchPlaylists("netease", "白色相簿", neteasePreview))
            .thenReturn(
                List.of(
                    new MetingMusicProvider.VirtualPlaylistSummary(
                        "netease",
                        "playlist",
                        "2400142669",
                        "白色相簿2全人声曲",
                        "测试歌单",
                        "https://p1.music.126.net/cover.jpg",
                        "vh_tunehub_netease_playlist_2400142669",
                        80
                    )
                )
            );
        Mockito.when(metingMusicProvider.searchTracks("th_test_default_key", "kuwo", "白色相簿", 1, 1))
            .thenReturn(List.of());
        Mockito.when(metingMusicProvider.buildSearchPlaylists("kuwo", "白色相簿", List.of()))
            .thenReturn(List.of());
        Mockito.when(userMusicPlaylistMapper.selectList(ArgumentMatchers.any())).thenReturn(List.of());

        MusicSearchResponse response = mediaService.searchMusic("白色相簿", "playlist", "netease,kuwo", 1, 24);

        Assertions.assertFalse(response.partial());
        Assertions.assertTrue(response.tracks().isEmpty());
        // R6.1: legacy vh_tunehub_ playlist code should round-trip without rewrite.
        var playlist = response.playlists().stream()
            .filter(item -> "vh_tunehub_netease_playlist_2400142669".equals(item.playlistCode()))
            .findFirst()
            .orElseThrow();
        Assertions.assertEquals("https://p1.music.126.net/cover.jpg", playlist.cover());
        Assertions.assertEquals(80, playlist.trackCount());
        Assertions.assertTrue(response.playlists().stream().noneMatch(item ->
            String.valueOf(item.playlistCode()).contains("_search_")
        ));
        Mockito.verify(metingMusicProvider)
            .searchTracks("th_test_default_key", "netease", "白色相簿", 1, 1);
        Mockito.verify(metingMusicProvider)
            .searchTracks("th_test_default_key", "kuwo", "白色相簿", 1, 1);
    }

    @Test
    void shouldReuseTrackSearchForVirtualPlaylistPreviewWhenTypeIsAll() {
        List<MetingMusicProvider.SearchTrackResult> preview = List.of(
            new MetingMusicProvider.SearchTrackResult(
                "1859245776",
                "netease",
                "夜曲",
                "周杰伦",
                "十一月的萧邦",
                "https://cover.example/nocturne.png",
                226
            )
        );
        Mockito.when(metingMusicProvider.searchTracks("th_test_default_key", "netease", "夜曲", 1, 24))
            .thenReturn(preview);
        Mockito.when(metingMusicProvider.buildSearchPlaylists("netease", "夜曲", preview))
            .thenReturn(
                List.of(
                    new MetingMusicProvider.VirtualPlaylistSummary(
                        "netease",
                        "search",
                        "5aSc5puy",
                        "网易云 搜索: 夜曲",
                        "Meting 搜索虚拟歌单",
                        "https://cover.example/nocturne.png",
                        "vh_meting_netease_search_5aSc5puy",
                        null
                    )
                )
            );

        MusicSearchResponse response = mediaService.searchMusic("夜曲", "all", "netease", 1, 24);

        Assertions.assertEquals(1, response.tracks().size());
        Assertions.assertEquals(1, response.playlists().size());
        Assertions.assertEquals("https://cover.example/nocturne.png", response.playlists().get(0).cover());
        Assertions.assertEquals(0, response.playlists().get(0).trackCount());
        Mockito.verify(metingMusicProvider, Mockito.times(1))
            .searchTracks("th_test_default_key", "netease", "夜曲", 1, 24);
        Mockito.verify(metingMusicProvider, Mockito.never())
            .searchTracks("th_test_default_key", "netease", "夜曲", 1, 1);
    }

    @Test
    void shouldRejectAsmrSearchWhenPermissionMissing() {
        LoginUserContext.set(new LoginUser(7L, Set.of("USER"), Set.of()));

        BusinessException exception = Assertions.assertThrows(
            BusinessException.class,
            () -> mediaService.searchMusic("耳语", "track", "asmr", 1, 24)
        );

        Assertions.assertEquals(ErrorCode.FORBIDDEN, exception.getErrorCode());
        Assertions.assertEquals("music.asmr.access", exception.getDetails().get("permission"));
    }

    @Test
    void shouldSearchVoiceWorksWithTagAndFilter() {
        LoginUserContext.set(new LoginUser(8L, Set.of("FRIEND"), Set.of("music.asmr.access")));
        AsmrMusicProvider.WorkSummary work1 = buildAsmrWorkSummary(
            1001L,
            "夜色耳语",
            List.of(new AsmrMusicProvider.TagSummary(11L, "耳搔"), new AsmrMusicProvider.TagSummary(22L, "低语")),
            List.of(new AsmrMusicProvider.VoiceActorSummary("va-1", "白樺玲奈"))
        );
        AsmrMusicProvider.WorkSummary work2 = buildAsmrWorkSummary(
            1002L,
            "午后助眠",
            List.of(new AsmrMusicProvider.TagSummary(22L, "低语")),
            List.of(new AsmrMusicProvider.VoiceActorSummary("va-2", "星野葵"))
        );
        Mockito.when(asmrMusicProvider.listWorks(1, 30, "release", "desc"))
            .thenReturn(new AsmrMusicProvider.SearchResult(List.of(work1, work2), 1, 30, 2));

        MusicVoiceWorksResponse response = mediaService.searchVoiceWorks("", 1, 24, "release", "desc", "11,22");

        Assertions.assertEquals(1, response.items().size());
        Assertions.assertEquals(1001L, response.items().get(0).workId());
        Assertions.assertFalse(response.availableTags().isEmpty());
        Assertions.assertTrue(response.availableTags().stream().anyMatch(tag -> tag.tagId() == 11L));
    }

    @Test
    void shouldBuildVoiceWorkBundleSuccessfully() {
        LoginUserContext.set(new LoginUser(9L, Set.of("ADMIN"), Set.of("music.asmr.access")));
        AsmrMusicProvider.WorkSummary work = buildAsmrWorkSummary(
            2001L,
            "白噪声治愈室",
            List.of(new AsmrMusicProvider.TagSummary(31L, "雨声")),
            List.of(new AsmrMusicProvider.VoiceActorSummary("va-3", "青山千夜"))
        );
        AsmrMusicProvider.TrackNode rootNode = new AsmrMusicProvider.TrackNode(
            "folder",
            "本篇",
            "",
            "",
            "",
            "",
            null,
            List.of(
                new AsmrMusicProvider.TrackNode(
                    "audio",
                    "track-1.mp3",
                    "2001/1",
                    "https://api.asmr-300.com/api/media/stream/2001/1",
                    "",
                    "",
                    180.0,
                    List.of()
                )
            )
        );
        AsmrMusicProvider.AudioTrack audioTrack = new AsmrMusicProvider.AudioTrack(
            "2001/1",
            "track-1.mp3",
            "https://api.asmr-300.com/api/media/stream/2001/1",
            "",
            "",
            "https://raw.kiko-play-niptan.one/media/2001/1.mp3",
            "https://raw.kiko-play-niptan.one/media/2001/1.lrc",
            180,
            "本篇/track-1.mp3"
        );
        Mockito.when(asmrMusicProvider.getWork(2001L)).thenReturn(work);
        Mockito.when(asmrMusicProvider.listTrackTree(2001L)).thenReturn(List.of(rootNode));
        Mockito.when(asmrMusicProvider.listAudioTracks(2001L)).thenReturn(List.of(audioTrack));

        MusicVoiceWorkBundleResponse bundle = mediaService.getVoiceWorkBundle(2001L);

        Assertions.assertEquals(2001L, bundle.work().workId());
        Assertions.assertEquals("白噪声治愈室", bundle.work().title());
        Assertions.assertEquals(1, bundle.trackTree().size());
        Assertions.assertEquals(1, bundle.playableTracks().size());
        Assertions.assertEquals("2001|2001/1", bundle.playableTracks().get(0).trackId());
    }

    @Test
    void shouldLoadVirtualPlaylistBundleWithPlaylistSourceSummary() {
        // R6.1: legacy vh_tunehub_ playlist code must still resolve via the legacy compat regex.
        Mockito.when(metingMusicProvider.loadVirtualPlaylistTracks("th_test_default_key", "netease", "playlist", "2400142669"))
            .thenReturn(
                List.of(
                    new MusicTrackResponse(
                        "28712251",
                        "netease",
                        "WHITE ALBUM",
                        "平野綾",
                        "https://cover.example/track.png",
                        "",
                        "",
                        1,
                        true,
                        ""
                    )
                )
            );
        Mockito.when(metingMusicProvider.loadPlaylistSummary("th_test_default_key", "netease", "playlist", "2400142669"))
            .thenReturn(
                new MetingMusicProvider.VirtualPlaylistSummary(
                    "netease",
                    "playlist",
                    "2400142669",
                    "白色相簿2全人声曲",
                    "测试歌单",
                    "https://cover.example/playlist.png",
                    "vh_tunehub_netease_playlist_2400142669",
                    80
                )
            );

        MusicPlaylistBundleResponse bundle = mediaService.getMusicPlaylistBundle("vh_tunehub_netease_playlist_2400142669");

        Assertions.assertNotNull(bundle);
        // R6.4: the legacy code is preserved verbatim instead of being rewritten to vh_meting_*.
        Assertions.assertEquals("vh_tunehub_netease_playlist_2400142669", bundle.profile().playlistCode());
        Assertions.assertEquals("白色相簿2全人声曲", bundle.profile().name());
        Assertions.assertEquals("https://cover.example/playlist.png", bundle.profile().cover());
        Assertions.assertEquals(1, bundle.tracks().size());
    }

    @Test
    void shouldUseFirstTrackCoverForVirtualSearchPlaylistBundle() {
        Mockito.when(metingMusicProvider.loadVirtualPlaylistTracks("th_test_default_key", "netease", "search", "5asc5puy"))
            .thenReturn(
                List.of(
                    new MusicTrackResponse(
                        "1859245776",
                        "netease",
                        "夜曲",
                        "周杰伦",
                        "https://cover.example/nocturne.png",
                        "",
                        "",
                        1,
                        true,
                        ""
                    )
                )
            );

        MusicPlaylistBundleResponse bundle =
            mediaService.getMusicPlaylistBundle("vh_meting_netease_search_5aSc5puy");

        Assertions.assertNotNull(bundle);
        Assertions.assertEquals("https://cover.example/nocturne.png", bundle.profile().cover());
        Assertions.assertEquals(1, bundle.profile().trackCount());
    }

    @Test
    void shouldFallbackOnVhTunehubLegacyCode() {
        // R6.1 / R6.2: parse should accept both vh_meting_ (preferred) and vh_tunehub_ (legacy)
        // playlist codes during the compatibility window. This test pins the legacy path.
        Mockito.when(metingMusicProvider.loadVirtualPlaylistTracks("th_test_default_key", "kuwo", "playlist", "9999"))
            .thenReturn(List.of());
        Mockito.when(metingMusicProvider.loadPlaylistSummary("th_test_default_key", "kuwo", "playlist", "9999"))
            .thenReturn(
                new MetingMusicProvider.VirtualPlaylistSummary(
                    "kuwo",
                    "playlist",
                    "9999",
                    "Legacy",
                    "Legacy compat",
                    "",
                    "vh_tunehub_kuwo_playlist_9999",
                    0
                )
            );

        MusicPlaylistBundleResponse bundle = mediaService.getMusicPlaylistBundle("vh_tunehub_kuwo_playlist_9999");

        Assertions.assertNotNull(bundle);
        // R6.4: returned playlistCode preserves the legacy prefix.
        Assertions.assertEquals("vh_tunehub_kuwo_playlist_9999", bundle.profile().playlistCode());
    }

    @Test
    void shouldRouteSearchTracksToMetingProvider() {
        // R2.1: searchMusic must route to metingMusicProvider.searchTracks (TuneHub provider has been deleted).
        Mockito.when(metingMusicProvider.searchTracks(
            Mockito.eq("th_test_default_key"),
            Mockito.eq("netease"),
            Mockito.eq("樱花"),
            Mockito.anyInt(),
            Mockito.anyInt()
        )).thenReturn(
            List.of(
                new MetingMusicProvider.SearchTrackResult(
                    "track-sakura-1",
                    "netease",
                    "樱花樱花想见你",
                    "Aimer",
                    "Album",
                    "https://cover.example/sakura.png",
                    240
                )
            )
        );

        MusicSearchResponse response = mediaService.searchMusic("樱花", "track", "netease", 1, 24);

        Assertions.assertFalse(response.partial());
        Assertions.assertEquals(1, response.tracks().size());
        Assertions.assertEquals("netease", response.tracks().get(0).provider());
        Mockito.verify(metingMusicProvider, Mockito.atLeastOnce()).searchTracks(
            Mockito.eq("th_test_default_key"),
            Mockito.eq("netease"),
            Mockito.eq("樱花"),
            Mockito.anyInt(),
            Mockito.anyInt()
        );
    }

    @Test
    void shouldNormalizeLegacySourceModeOnRead() throws Exception {
        // R5.2 / R5.3 backend mirror: normalizeSourceModeForRead must coerce legacy tunehub_*
        // values to meting_* during the compatibility window, and fall back invalid input to
        // account_first per design §3.2.6.
        java.lang.reflect.Method method = MediaServiceImpl.class.getDeclaredMethod("normalizeSourceModeForRead", String.class);
        method.setAccessible(true);

        Assertions.assertEquals("meting_first", method.invoke(null, "tunehub_first"));
        Assertions.assertEquals("meting_only", method.invoke(null, "tunehub_only"));
        Assertions.assertEquals("meting_first", method.invoke(null, "TUNEHUB_FIRST"));
        Assertions.assertEquals("meting_only", method.invoke(null, "Tunehub_Only"));
        Assertions.assertEquals("meting_first", method.invoke(null, "meting_first"));
        Assertions.assertEquals("account_only", method.invoke(null, "account_only"));
        Assertions.assertEquals("account_first", method.invoke(null, new Object[]{null}));
        Assertions.assertEquals("account_first", method.invoke(null, "garbage"));
    }

    @Test
    void shouldImportSourcePlaylistAtomicallyAndExposeSourceProvider() {
        LoginUserContext.set(new LoginUser(9L, Set.of("USER"), Set.of()));
        NoOpTransactionManager transactionManager = new NoOpTransactionManager();
        mediaService = buildMediaService(
            "th_test_default_key",
            new TransactionTemplate(transactionManager)
        );
        NeteaseCookieProvider.PlaylistSummary sourcePlaylist = new NeteaseCookieProvider.PlaylistSummary(
            "playlist-1",
            "同步歌单",
            "来自网易云",
            "https://cover.example.com/playlist.jpg",
            2
        );
        List<NeteaseCookieProvider.TrackSummary> sourceTracks = List.of(
            new NeteaseCookieProvider.TrackSummary(
                "track-1",
                "第一首",
                "歌手甲",
                "https://cover.example.com/track-1.jpg",
                180,
                "专辑甲"
            ),
            new NeteaseCookieProvider.TrackSummary(
                "track-2",
                "第二首",
                "歌手乙",
                "https://cover.example.com/track-2.jpg",
                240,
                "专辑乙"
            )
        );
        Mockito.when(userMusicClient.getSourceAccountCookiePlaintext(9L, "netease"))
            .thenReturn("MUSIC_U=9; token=test");
        Mockito.when(neteaseCookieProvider.listUserPlaylists("MUSIC_U=9; token=test", 300))
            .thenReturn(List.of(sourcePlaylist));
        Mockito.when(neteaseCookieProvider.listPlaylistTracks("playlist-1", "MUSIC_U=9; token=test", 1000))
            .thenReturn(sourceTracks);

        MusicSourcePlaylistImportResponse response = mediaService.importSourceAccountPlaylists("netease");

        Assertions.assertEquals(1, response.importedPlaylists());
        Assertions.assertEquals(2, response.importedTracks());
        Assertions.assertEquals(0, response.failedPlaylists());
        Assertions.assertEquals(1, transactionManager.beginCount);
        Assertions.assertEquals(1, transactionManager.commitCount);
        Assertions.assertEquals(0, transactionManager.rollbackCount);

        InOrder order = Mockito.inOrder(neteaseCookieProvider, userMusicPlaylistMapper);
        order.verify(neteaseCookieProvider).listUserPlaylists("MUSIC_U=9; token=test", 300);
        order.verify(neteaseCookieProvider).listPlaylistTracks("playlist-1", "MUSIC_U=9; token=test", 1000);
        order.verify(userMusicPlaylistMapper, Mockito.times(2)).selectOne(ArgumentMatchers.any());

        ArgumentCaptor<UserMusicPlaylistEntity> playlistCaptor = ArgumentCaptor.forClass(UserMusicPlaylistEntity.class);
        Mockito.verify(userMusicPlaylistMapper).insert(playlistCaptor.capture());
        UserMusicPlaylistEntity importedPlaylist = playlistCaptor.getValue();
        Assertions.assertTrue(importedPlaylist.getMetadataJson().contains("\"sourceProvider\":\"netease\""));

        Mockito.when(userMusicPlaylistMapper.selectOne(ArgumentMatchers.any())).thenReturn(importedPlaylist);
        Mockito.when(userMusicPlaylistTrackMapper.selectList(ArgumentMatchers.any())).thenReturn(List.of());
        MusicPlaylistBundleResponse bundle = mediaService.getMusicPlaylistBundle(importedPlaylist.getPlaylistCode());

        Assertions.assertEquals("netease", bundle.profile().sourceProvider());
    }

    @Test
    void shouldRollbackFirstSourcePlaylistAndContinueWithSecond() {
        LoginUserContext.set(new LoginUser(9L, Set.of("USER"), Set.of()));
        NoOpTransactionManager transactionManager = new NoOpTransactionManager();
        mediaService = buildMediaService(
            "th_test_default_key",
            new TransactionTemplate(transactionManager)
        );
        NeteaseCookieProvider.PlaylistSummary firstPlaylist = new NeteaseCookieProvider.PlaylistSummary(
            "playlist-fail",
            "失败歌单",
            "",
            "",
            1
        );
        NeteaseCookieProvider.PlaylistSummary secondPlaylist = new NeteaseCookieProvider.PlaylistSummary(
            "playlist-ok",
            "成功歌单",
            "",
            "",
            1
        );
        NeteaseCookieProvider.TrackSummary firstTrack = new NeteaseCookieProvider.TrackSummary(
            "track-fail",
            "失败曲目",
            "歌手甲",
            "",
            180,
            ""
        );
        NeteaseCookieProvider.TrackSummary secondTrack = new NeteaseCookieProvider.TrackSummary(
            "track-ok",
            "成功曲目",
            "歌手乙",
            "",
            200,
            ""
        );
        Mockito.when(userMusicClient.getSourceAccountCookiePlaintext(9L, "netease"))
            .thenReturn("MUSIC_U=9; token=test");
        Mockito.when(neteaseCookieProvider.listUserPlaylists("MUSIC_U=9; token=test", 300))
            .thenReturn(List.of(firstPlaylist, secondPlaylist));
        Mockito.when(neteaseCookieProvider.listPlaylistTracks("playlist-fail", "MUSIC_U=9; token=test", 1000))
            .thenReturn(List.of(firstTrack));
        Mockito.when(neteaseCookieProvider.listPlaylistTracks("playlist-ok", "MUSIC_U=9; token=test", 1000))
            .thenReturn(List.of(secondTrack));
        Mockito.when(userMusicPlaylistMapper.insert(ArgumentMatchers.any(UserMusicPlaylistEntity.class)))
            .thenThrow(new IllegalStateException("first playlist insert failed"))
            .thenReturn(1);

        MusicSourcePlaylistImportResponse response = mediaService.importSourceAccountPlaylists("netease");

        Assertions.assertEquals(1, response.importedPlaylists());
        Assertions.assertEquals(1, response.importedTracks());
        Assertions.assertEquals(1, response.failedPlaylists());
        Assertions.assertEquals(2, transactionManager.beginCount);
        Assertions.assertEquals(1, transactionManager.commitCount);
        Assertions.assertEquals(1, transactionManager.rollbackCount);
        Mockito.verify(neteaseCookieProvider).listPlaylistTracks("playlist-ok", "MUSIC_U=9; token=test", 1000);
        Mockito.verify(userMusicPlaylistMapper, Mockito.times(2))
            .insert(ArgumentMatchers.any(UserMusicPlaylistEntity.class));
        Mockito.verify(userMusicPlaylistTrackMapper, Mockito.times(1)).delete(ArgumentMatchers.any());
        Mockito.verify(userMusicPlaylistTrackMapper, Mockito.times(1))
            .insert(ArgumentMatchers.<UserMusicPlaylistTrackEntity>argThat(
                track -> "track-ok".equals(track.getTrackId())
            ));
    }

    @Test
    void shouldRejectEmptySourcePlaylistResult() {
        LoginUserContext.set(new LoginUser(9L, Set.of("USER"), Set.of()));
        NoOpTransactionManager transactionManager = new NoOpTransactionManager();
        mediaService = buildMediaService(
            "th_test_default_key",
            new TransactionTemplate(transactionManager)
        );
        Mockito.when(userMusicClient.getSourceAccountCookiePlaintext(9L, "netease"))
            .thenReturn("MUSIC_U=9; token=test");
        Mockito.when(neteaseCookieProvider.listUserPlaylists("MUSIC_U=9; token=test", 300))
            .thenReturn(List.of());

        BusinessException exception = Assertions.assertThrows(
            BusinessException.class,
            () -> mediaService.importSourceAccountPlaylists("netease")
        );

        Assertions.assertEquals(ErrorCode.BAD_REQUEST, exception.getErrorCode());
        Assertions.assertEquals(
            "网易云没有返回可同步歌单，请重新绑定账号后重试",
            exception.getMessage()
        );
        Assertions.assertEquals(0, transactionManager.beginCount);
        Mockito.verifyNoInteractions(userMusicPlaylistMapper, userMusicPlaylistTrackMapper);
    }

    @Test
    void shouldPreserveExistingPlaylistWhenSourceTracksUnexpectedlyEmpty() {
        LoginUserContext.set(new LoginUser(9L, Set.of("USER"), Set.of()));
        NoOpTransactionManager transactionManager = new NoOpTransactionManager();
        mediaService = buildMediaService(
            "th_test_default_key",
            new TransactionTemplate(transactionManager)
        );
        NeteaseCookieProvider.PlaylistSummary sourcePlaylist = new NeteaseCookieProvider.PlaylistSummary(
            "playlist-empty-tracks",
            "曲目异常歌单",
            "",
            "",
            3
        );
        Mockito.when(userMusicClient.getSourceAccountCookiePlaintext(9L, "netease"))
            .thenReturn("MUSIC_U=9; token=test");
        Mockito.when(neteaseCookieProvider.listUserPlaylists("MUSIC_U=9; token=test", 300))
            .thenReturn(List.of(sourcePlaylist));
        Mockito.when(neteaseCookieProvider.listPlaylistTracks(
            "playlist-empty-tracks",
            "MUSIC_U=9; token=test",
            1000
        )).thenReturn(List.of());

        MusicSourcePlaylistImportResponse response = mediaService.importSourceAccountPlaylists("netease");

        Assertions.assertEquals(0, response.importedPlaylists());
        Assertions.assertEquals(0, response.importedTracks());
        Assertions.assertEquals(1, response.failedPlaylists());
        Assertions.assertEquals(0, transactionManager.beginCount);
        Assertions.assertEquals(0, transactionManager.commitCount);
        Assertions.assertEquals(0, transactionManager.rollbackCount);
        Mockito.verifyNoInteractions(userMusicPlaylistMapper, userMusicPlaylistTrackMapper);
    }

    @Test
    void shouldReturnCoverAndLyricTextWhenResolvePlaybackUsesParseResult() {
        MusicResolvePlaybackRequest request = new MusicResolvePlaybackRequest();
        request.setProvider("netease");
        request.setTrackId("448316816");
        request.setTitle("测试歌曲");
        request.setArtist("测试歌手");
        request.setResolveLyric(true);

        Mockito.when(metingMusicProvider.parseSingleTrack(
            Mockito.eq("th_test_default_key"),
            Mockito.eq("netease"),
            Mockito.eq("448316816"),
            Mockito.any()
        ))
            .thenReturn(
                new MetingMusicProvider.ParseTrackResult(
                    "448316816",
                    "测试歌曲",
                    "测试歌手",
                    "",
                    "https://audio.example.com/track.mp3",
                    "https://cover.example.com/cover.jpg",
                    "[00:01.00]line1\n[00:03.00]line2",
                    "[00:01.00]翻译1\n[00:03.00]翻译2",
                    "[00:01.00]furigana1\n[00:03.00]furigana2"
                )
            );

        MusicTrackResponse response = mediaService.resolvePlaybackTrack(request);

        Assertions.assertEquals("https://cover.example.com/cover.jpg", response.cover());
        Assertions.assertEquals("[00:01.00]line1\n[00:03.00]line2", response.lyricText());
        Assertions.assertEquals("https://audio.example.com/track.mp3", response.audio());
        Assertions.assertTrue(response.metadata().containsKey("lyricTracks"));
    }

    private AsmrMusicProvider.WorkSummary buildAsmrWorkSummary(long workId,
                                                               String title,
                                                               List<AsmrMusicProvider.TagSummary> tags,
                                                               List<AsmrMusicProvider.VoiceActorSummary> vas) {
        return new AsmrMusicProvider.WorkSummary(
            workId,
            title,
            "白噪研究社",
            "https://cdn.example.com/voice-cover.png",
            3600,
            "RJ000" + workId,
            "https://www.dlsite.com/home/work/=/product_id/RJ000" + workId + ".html",
            "2026-03-01",
            12345,
            88,
            100,
            4.8,
            true,
            "18+",
            tags == null ? List.of() : tags,
            vas == null ? List.of() : vas,
            List.of(Map.of("lang", "zh-cn")),
            Map.of("rank", 1),
            "RJ000" + workId,
            "简介",
            Map.of("source_type", "DLSITE")
        );
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

    private MediaServiceImpl buildMediaService(String defaultApiKey) {
        return buildMediaService(
            defaultApiKey,
            new TransactionTemplate(new NoOpTransactionManager())
        );
    }

    private MediaServiceImpl buildMediaService(String defaultApiKey, TransactionTemplate transactionTemplate) {
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
        MetingMusicProperties metingMusicProperties = new MetingMusicProperties();
        metingMusicProperties.setDefaultApiKey(defaultApiKey);
        MusicListenCacheProperties listenCacheProperties = new MusicListenCacheProperties();

        return new MediaServiceImpl(
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
            neteaseCookieProvider,
            asmrMusicProvider,
            musicTrackCacheUploadPublisher,
            metingMusicProvider,
            metingMusicProperties,
            listenCacheProperties,
            new com.fasterxml.jackson.databind.ObjectMapper(),
            transactionTemplate
        );
    }

    private static class NoOpTransactionManager extends AbstractPlatformTransactionManager {

        private int beginCount;
        private int commitCount;
        private int rollbackCount;

        @Override
        protected Object doGetTransaction() {
            return new Object();
        }

        @Override
        protected void doBegin(Object transaction, TransactionDefinition definition) {
            beginCount += 1;
        }

        @Override
        protected void doCommit(DefaultTransactionStatus status) {
            commitCount += 1;
        }

        @Override
        protected void doRollback(DefaultTransactionStatus status) {
            rollbackCount += 1;
        }
    }
}
