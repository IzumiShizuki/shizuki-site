package io.github.shizuki.site.media.task;

import io.github.shizuki.common.storage.client.ObjectStorageClient;
import io.github.shizuki.site.media.config.MusicListenCacheProperties;
import io.github.shizuki.site.media.entity.MusicTrackCacheEntity;
import io.github.shizuki.site.media.mapper.MusicTrackCacheMapper;
import io.github.shizuki.site.media.util.MusicTrackCacheObjectCodes;
import java.time.LocalDateTime;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;

class MusicListenCacheCleanupTaskTest {

    @Test
    void shouldSkipOssDeleteForSourceOnlyPlaceholderRecord() {
        MusicTrackCacheMapper mapper = Mockito.mock(MusicTrackCacheMapper.class);
        ObjectStorageClient objectStorageClient = Mockito.mock(ObjectStorageClient.class);
        MusicListenCacheProperties properties = new MusicListenCacheProperties();
        properties.setEnabled(true);
        properties.setRetentionDays(30);

        MusicTrackCacheEntity row = new MusicTrackCacheEntity();
        row.setId(1L);
        row.setProviderCode("netease");
        row.setTrackId("1001");
        row.setBucketCode("music-public");
        row.setObjectCode(MusicTrackCacheObjectCodes.SOURCE_ONLY_OBJECT_CODE);
        row.setLastListenTime(LocalDateTime.now().minusDays(31));

        Mockito.when(mapper.selectList(ArgumentMatchers.any()))
            .thenReturn(List.of(row))
            .thenReturn(List.of());

        MusicListenCacheCleanupTask task = new MusicListenCacheCleanupTask(mapper, objectStorageClient, properties);
        task.cleanupExpiredListenCache();

        Mockito.verify(objectStorageClient, Mockito.never())
            .deleteObject(ArgumentMatchers.anyString(), ArgumentMatchers.anyString());
        Mockito.verify(mapper, Mockito.times(1)).deleteById(1L);
    }

    @Test
    void shouldDeleteOssObjectForNormalCacheRecord() {
        MusicTrackCacheMapper mapper = Mockito.mock(MusicTrackCacheMapper.class);
        ObjectStorageClient objectStorageClient = Mockito.mock(ObjectStorageClient.class);
        MusicListenCacheProperties properties = new MusicListenCacheProperties();
        properties.setEnabled(true);
        properties.setRetentionDays(30);

        MusicTrackCacheEntity row = new MusicTrackCacheEntity();
        row.setId(2L);
        row.setProviderCode("qq");
        row.setTrackId("2002");
        row.setBucketCode("music-public");
        row.setObjectCode("music-cache/qq/2002/demo.mp3");
        row.setLastListenTime(LocalDateTime.now().minusDays(31));

        Mockito.when(mapper.selectList(ArgumentMatchers.any()))
            .thenReturn(List.of(row))
            .thenReturn(List.of());

        MusicListenCacheCleanupTask task = new MusicListenCacheCleanupTask(mapper, objectStorageClient, properties);
        task.cleanupExpiredListenCache();

        Mockito.verify(objectStorageClient, Mockito.times(1))
            .deleteObject("music-public", "music-cache/qq/2002/demo.mp3");
        Mockito.verify(mapper, Mockito.times(1)).deleteById(2L);
    }
}
