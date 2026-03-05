package io.github.shizuki.site.media.task;

import io.github.shizuki.site.media.cache.MusicLibraryHomeCacheStore;
import io.github.shizuki.site.media.dto.MusicLibraryHomeResponse;
import io.github.shizuki.site.media.service.impl.MediaServiceImpl;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class MusicLibraryHomeCacheRefreshTaskTest {

    @Test
    void shouldSkipRefreshWhenCacheDisabled() {
        MediaServiceImpl mediaService = Mockito.mock(MediaServiceImpl.class);
        MusicLibraryHomeCacheStore cacheStore = Mockito.mock(MusicLibraryHomeCacheStore.class);
        Mockito.when(cacheStore.isEnabled()).thenReturn(false);
        MusicLibraryHomeCacheRefreshTask task = new MusicLibraryHomeCacheRefreshTask(mediaService, cacheStore);

        task.refreshMusicLibraryHomeCacheAtMidnight();

        Mockito.verify(mediaService, Mockito.never()).rebuildMusicLibraryHomeCache();
    }

    @Test
    void shouldRefreshWhenCacheEnabled() {
        MediaServiceImpl mediaService = Mockito.mock(MediaServiceImpl.class);
        MusicLibraryHomeCacheStore cacheStore = Mockito.mock(MusicLibraryHomeCacheStore.class);
        Mockito.when(cacheStore.isEnabled()).thenReturn(true);
        Mockito.when(mediaService.rebuildMusicLibraryHomeCache())
            .thenReturn(new MusicLibraryHomeResponse(List.of(), List.of()));
        MusicLibraryHomeCacheRefreshTask task = new MusicLibraryHomeCacheRefreshTask(mediaService, cacheStore);

        task.refreshMusicLibraryHomeCacheAtMidnight();

        Mockito.verify(mediaService).rebuildMusicLibraryHomeCache();
    }
}
