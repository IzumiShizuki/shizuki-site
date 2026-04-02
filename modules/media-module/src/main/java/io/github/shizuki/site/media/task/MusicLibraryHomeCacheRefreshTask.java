package io.github.shizuki.site.media.task;

import io.github.shizuki.site.media.cache.MusicLibraryHomeCacheStore;
import io.github.shizuki.site.media.response.MusicLibraryHomeResponse;
import io.github.shizuki.site.media.service.impl.MediaServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * 音乐库首页缓存定时刷新任务（每天 0 点）。
 */
@Component
public class MusicLibraryHomeCacheRefreshTask {

    private static final Logger LOGGER = LoggerFactory.getLogger(MusicLibraryHomeCacheRefreshTask.class);

    private final MediaServiceImpl mediaService;
    private final MusicLibraryHomeCacheStore cacheStore;

    public MusicLibraryHomeCacheRefreshTask(MediaServiceImpl mediaService, MusicLibraryHomeCacheStore cacheStore) {
        this.mediaService = mediaService;
        this.cacheStore = cacheStore;
    }

    @Scheduled(
        cron = "${shizuki.music.library-home-cache.refresh-cron:0 0 0 * * *}",
        zone = "${shizuki.music.library-home-cache.refresh-zone:Asia/Shanghai}"
    )
    public void refreshMusicLibraryHomeCacheAtMidnight() {
        if (!cacheStore.isEnabled()) {
            return;
        }
        long start = System.currentTimeMillis();
        try {
            MusicLibraryHomeResponse response = mediaService.rebuildMusicLibraryHomeCache();
            long costMs = Math.max(0L, System.currentTimeMillis() - start);
            LOGGER.info(
                "MUSIC_LIBRARY_HOME_CACHE_SCHEDULED_REFRESH_DONE playlists={} tracks={} durationMs={}",
                response.featuredPlaylists() == null ? 0 : response.featuredPlaylists().size(),
                response.featuredTracks() == null ? 0 : response.featuredTracks().size(),
                costMs
            );
        } catch (Exception ex) {
            LOGGER.warn("MUSIC_LIBRARY_HOME_CACHE_SCHEDULED_REFRESH_FAIL reason={}", ex.getMessage());
        }
    }
}
