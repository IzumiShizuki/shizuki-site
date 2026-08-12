package io.github.shizuki.site.media.service.impl;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.security.context.LoginUserContext;
import io.github.shizuki.common.security.model.LoginUser;
import io.github.shizuki.common.storage.client.ObjectStorageClient;
import io.github.shizuki.site.media.config.MediaStorageProperties;
import io.github.shizuki.site.media.config.FreesoundProperties;
import io.github.shizuki.site.media.entity.AmbientSourceAssetEntity;
import io.github.shizuki.site.media.integration.FreesoundPreviewDownloader;
import io.github.shizuki.site.media.integration.FreesoundProvider;
import io.github.shizuki.site.media.mapper.AmbientSourceAssetMapper;
import io.github.shizuki.site.media.request.AssetCreateRequest;
import io.github.shizuki.site.media.response.AmbientSoundImportResponse;
import io.github.shizuki.site.media.response.AssetCreateResponse;
import io.github.shizuki.site.media.response.AssetDownloadResponse;
import io.github.shizuki.site.media.response.FreesoundTrackResponse;
import io.github.shizuki.site.media.service.MediaService;
import java.util.Set;
import java.time.LocalDateTime;
import java.util.concurrent.atomic.AtomicReference;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.support.AbstractPlatformTransactionManager;
import org.springframework.transaction.support.DefaultTransactionStatus;
import org.springframework.transaction.support.TransactionTemplate;

class AmbientLibraryServiceImplTest {

    private FreesoundProvider provider;
    private FreesoundPreviewDownloader downloader;
    private AmbientSourceAssetMapper sourceMapper;
    private ObjectStorageClient storageClient;
    private MediaService mediaService;
    private AmbientLibraryServiceImpl service;

    @BeforeEach
    void setUp() {
        provider = Mockito.mock(FreesoundProvider.class);
        downloader = Mockito.mock(FreesoundPreviewDownloader.class);
        sourceMapper = Mockito.mock(AmbientSourceAssetMapper.class);
        storageClient = Mockito.mock(ObjectStorageClient.class);
        mediaService = Mockito.mock(MediaService.class);
        MediaStorageProperties storageProperties = new MediaStorageProperties();
        storageProperties.setPrivateBucket("private-audio");
        storageProperties.setMaxUploadSize(1024L);
        FreesoundProperties freesoundProperties = new FreesoundProperties();
        freesoundProperties.setMaxImportBytes(1024L);
        service = new AmbientLibraryServiceImpl(
            provider,
            downloader,
            sourceMapper,
            storageClient,
            storageProperties,
            freesoundProperties,
            mediaService,
            new TransactionTemplate(new NoOpTransactionManager())
        );
        LoginUserContext.set(new LoginUser(42L, Set.of("USER"), Set.of()));
    }

    @AfterEach
    void tearDown() {
        LoginUserContext.clear();
    }

    @Test
    void shouldDownloadPersistAndReuseImportedSound() {
        FreesoundTrackResponse track = track("123456");
        AtomicReference<AmbientSourceAssetEntity> mapping = new AtomicReference<>();
        when(sourceMapper.findActive(42L, "freesound", "123456")).thenAnswer(invocation -> mapping.get());
        Mockito.doAnswer(invocation -> {
            AmbientSourceAssetEntity entity = invocation.getArgument(0);
            entity.setId(88L);
            mapping.set(entity);
            return 1;
        }).when(sourceMapper).insert(any(AmbientSourceAssetEntity.class));
        Mockito.doAnswer(invocation -> {
            mapping.get().setAssetId(invocation.getArgument(1));
            mapping.get().setImportStatus("READY");
            return 1;
        }).when(sourceMapper).markReady(88L, 9001L);
        when(provider.resolveAmbient("123456")).thenReturn(track);
        when(downloader.download(track.previewUrl(), 1024L))
            .thenReturn(new FreesoundPreviewDownloader.DownloadedPreview(new byte[] {1, 2, 3}, "audio/mpeg"));
        when(mediaService.createAsset(any(AssetCreateRequest.class)))
            .thenReturn(new AssetCreateResponse(9001L, "private-audio", "key", "AUDIO", "PRIVATE", "PENDING_AUDIT", "CREATED", null));
        when(mediaService.createDownloadUrl(9001L))
            .thenReturn(new AssetDownloadResponse(9001L, "AUDIO", false, null, "https://signed.example/audio", 600L));

        AmbientSoundImportResponse first = service.importSound("123456");
        AmbientSoundImportResponse second = service.importSound("123456");

        assertThat(first.assetId()).isEqualTo(9001L);
        assertThat(first.alreadyImported()).isFalse();
        assertThat(second.assetId()).isEqualTo(9001L);
        assertThat(second.alreadyImported()).isTrue();
        verify(downloader, times(1)).download(track.previewUrl(), 1024L);
        verify(storageClient, times(1)).putObject(anyString(), anyString(), any(), any());
        ArgumentCaptor<AssetCreateRequest> requestCaptor = ArgumentCaptor.forClass(AssetCreateRequest.class);
        verify(mediaService).createAsset(requestCaptor.capture());
        assertThat(requestCaptor.getValue().getVisibility()).isEqualTo("PRIVATE");
        assertThat(requestCaptor.getValue().getMetadata())
            .containsEntry("source_provider", "freesound")
            .containsEntry("source_sound_id", "123456");
    }

    @Test
    void shouldRemoveReservationAndStoredObjectWhenAssetCreationFails() {
        FreesoundTrackResponse track = track("99");
        when(provider.resolveAmbient("99")).thenReturn(track);
        Mockito.doAnswer(invocation -> {
            AmbientSourceAssetEntity entity = invocation.getArgument(0);
            entity.setId(77L);
            return 1;
        }).when(sourceMapper).insert(any(AmbientSourceAssetEntity.class));
        when(downloader.download(track.previewUrl(), 1024L))
            .thenReturn(new FreesoundPreviewDownloader.DownloadedPreview(new byte[] {9}, "audio/mpeg"));
        when(mediaService.createAsset(any(AssetCreateRequest.class)))
            .thenThrow(new BusinessException(io.github.shizuki.common.core.error.ErrorCode.BAD_REQUEST, "inspection failed"));

        assertThatThrownBy(() -> service.importSound("99"))
            .isInstanceOf(BusinessException.class)
            .hasMessageContaining("inspection failed");

        verify(sourceMapper).deleteImportReservation(77L);
        verify(storageClient).deleteObject(anyString(), anyString());
        verify(sourceMapper, never()).markReady(anyLong(), anyLong());
    }

    @Test
    void shouldRequireLoginBeforeCallingProvider() {
        LoginUserContext.clear();

        assertThatThrownBy(() -> service.importSound("123456"))
            .isInstanceOf(BusinessException.class)
            .hasMessageContaining("Login required");

        verify(provider, never()).resolveAmbient(anyString());
    }

    @Test
    void shouldClearStaleReservationBeforeRetryingImport() {
        FreesoundTrackResponse track = track("55");
        AmbientSourceAssetEntity stale = new AmbientSourceAssetEntity();
        stale.setId(12L);
        stale.setImportStatus("IMPORTING");
        stale.setCreatedAt(LocalDateTime.now().minusMinutes(11));
        when(sourceMapper.findActive(42L, "freesound", "55")).thenReturn(stale).thenReturn(null);
        when(provider.resolveAmbient("55")).thenReturn(track);
        Mockito.doAnswer(invocation -> {
            AmbientSourceAssetEntity entity = invocation.getArgument(0);
            entity.setId(13L);
            return 1;
        }).when(sourceMapper).insert(any(AmbientSourceAssetEntity.class));
        when(downloader.download(track.previewUrl(), 1024L))
            .thenReturn(new FreesoundPreviewDownloader.DownloadedPreview(new byte[] {1}, "audio/mpeg"));
        when(mediaService.createAsset(any(AssetCreateRequest.class)))
            .thenReturn(new AssetCreateResponse(9002L, "private-audio", "key", "AUDIO", "PRIVATE", "PENDING_AUDIT", "CREATED", null));
        when(sourceMapper.markReady(13L, 9002L)).thenReturn(1);
        when(mediaService.createDownloadUrl(9002L))
            .thenReturn(new AssetDownloadResponse(9002L, "AUDIO", false, null, "https://signed.example/55", 600L));

        AmbientSoundImportResponse result = service.importSound("55");

        assertThat(result.assetId()).isEqualTo(9002L);
        verify(sourceMapper).deleteImportReservation(12L);
    }

    @Test
    void shouldRejectZeroAndLeadingZeroIds() {
        assertThatThrownBy(() -> service.importSound("0")).isInstanceOf(BusinessException.class);
        assertThatThrownBy(() -> service.importSound("00123")).isInstanceOf(BusinessException.class);
        verify(provider, never()).resolveAmbient(anyString());
    }

    private FreesoundTrackResponse track(String soundId) {
        return new FreesoundTrackResponse(
            soundId,
            "Forest Rain",
            "field-recorder",
            "https://cdn.freesound.org/previews/forest-rain.mp3",
            "cc0",
            "CC0 公有领域",
            false,
            "https://freesound.org/s/" + soundId + "/",
            82.5
        );
    }

    private static final class NoOpTransactionManager extends AbstractPlatformTransactionManager {

        @Override
        protected Object doGetTransaction() {
            return new Object();
        }

        @Override
        protected void doBegin(Object transaction, TransactionDefinition definition) {
            // Unit tests only need TransactionTemplate callback semantics.
        }

        @Override
        protected void doCommit(DefaultTransactionStatus status) {
            // no-op
        }

        @Override
        protected void doRollback(DefaultTransactionStatus status) {
            // no-op
        }
    }
}
