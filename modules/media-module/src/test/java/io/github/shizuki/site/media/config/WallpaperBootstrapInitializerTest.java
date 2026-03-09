package io.github.shizuki.site.media.config;

import io.github.shizuki.common.storage.client.ObjectStorageClient;
import io.github.shizuki.site.media.entity.MediaAssetEntity;
import io.github.shizuki.site.media.entity.MediaWallpaperProfileEntity;
import io.github.shizuki.site.media.mapper.MediaAssetMapper;
import io.github.shizuki.site.media.mapper.MediaWallpaperProfileMapper;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;
import org.springframework.boot.DefaultApplicationArguments;

class WallpaperBootstrapInitializerTest {

    @Test
    void shouldSkipBootstrapWhenPublicWallpaperAlreadyExists() throws Exception {
        ObjectStorageClient objectStorageClient = Mockito.mock(ObjectStorageClient.class);
        MediaAssetMapper mediaAssetMapper = Mockito.mock(MediaAssetMapper.class);
        MediaWallpaperProfileMapper wallpaperProfileMapper = Mockito.mock(MediaWallpaperProfileMapper.class);

        MediaStorageProperties storageProperties = new MediaStorageProperties();
        storageProperties.setPublicBucket("shizuki-public");

        Mockito.when(wallpaperProfileMapper.selectCount(ArgumentMatchers.any())).thenReturn(1L);

        WallpaperBootstrapInitializer initializer = new WallpaperBootstrapInitializer(
            objectStorageClient,
            storageProperties,
            mediaAssetMapper,
            wallpaperProfileMapper,
            true,
            1L
        );

        initializer.run(new DefaultApplicationArguments(new String[0]));

        Mockito.verify(objectStorageClient, Mockito.never())
            .putObject(ArgumentMatchers.anyString(), ArgumentMatchers.anyString(), ArgumentMatchers.any(), ArgumentMatchers.any());
        Mockito.verify(mediaAssetMapper, Mockito.never()).insert(ArgumentMatchers.any(MediaAssetEntity.class));
        Mockito.verify(wallpaperProfileMapper, Mockito.never()).insert(ArgumentMatchers.any(MediaWallpaperProfileEntity.class));
    }

    @Test
    void shouldCreateDefaultWallpaperWhenPublicWallpaperMissing() throws Exception {
        ObjectStorageClient objectStorageClient = Mockito.mock(ObjectStorageClient.class);
        MediaAssetMapper mediaAssetMapper = Mockito.mock(MediaAssetMapper.class);
        MediaWallpaperProfileMapper wallpaperProfileMapper = Mockito.mock(MediaWallpaperProfileMapper.class);

        MediaStorageProperties storageProperties = new MediaStorageProperties();
        storageProperties.setPublicBucket("shizuki-public");

        Mockito.when(wallpaperProfileMapper.selectCount(ArgumentMatchers.any())).thenReturn(0L);
        Mockito.when(mediaAssetMapper.selectOne(ArgumentMatchers.any())).thenReturn(null);
        Mockito.when(wallpaperProfileMapper.selectOne(ArgumentMatchers.any())).thenReturn(null);
        Mockito.when(objectStorageClient.objectExists("shizuki-public", "wallpaper/bootstrap/default-first.png")).thenReturn(false);

        Mockito.doAnswer(invocation -> {
            MediaAssetEntity entity = invocation.getArgument(0);
            entity.setId(9901L);
            return 1;
        }).when(mediaAssetMapper).insert(ArgumentMatchers.any(MediaAssetEntity.class));

        WallpaperBootstrapInitializer initializer = new WallpaperBootstrapInitializer(
            objectStorageClient,
            storageProperties,
            mediaAssetMapper,
            wallpaperProfileMapper,
            true,
            1L
        );

        initializer.run(new DefaultApplicationArguments(new String[0]));

        Mockito.verify(objectStorageClient, Mockito.times(1))
            .putObject(ArgumentMatchers.eq("shizuki-public"), ArgumentMatchers.eq("wallpaper/bootstrap/default-first.png"), ArgumentMatchers.any(), ArgumentMatchers.any());
        Mockito.verify(mediaAssetMapper, Mockito.times(1)).insert(ArgumentMatchers.any(MediaAssetEntity.class));
        Mockito.verify(wallpaperProfileMapper, Mockito.times(1)).insert(ArgumentMatchers.any(MediaWallpaperProfileEntity.class));
    }
}
