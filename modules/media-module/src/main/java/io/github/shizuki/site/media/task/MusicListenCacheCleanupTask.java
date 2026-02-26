package io.github.shizuki.site.media.task;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import io.github.shizuki.common.storage.client.ObjectStorageClient;
import io.github.shizuki.site.media.config.MusicListenCacheProperties;
import io.github.shizuki.site.media.entity.MusicTrackCacheEntity;
import io.github.shizuki.site.media.mapper.MusicTrackCacheMapper;
import java.time.LocalDateTime;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

/**
 * 过期音乐收听缓存清理任务。
 */
@Component
public class MusicListenCacheCleanupTask {

    private static final Logger LOGGER = LoggerFactory.getLogger(MusicListenCacheCleanupTask.class);
    private static final int BATCH_SIZE = 200;

    private final MusicTrackCacheMapper musicTrackCacheMapper;
    private final ObjectStorageClient objectStorageClient;
    private final MusicListenCacheProperties properties;

    public MusicListenCacheCleanupTask(MusicTrackCacheMapper musicTrackCacheMapper,
                                       ObjectStorageClient objectStorageClient,
                                       MusicListenCacheProperties properties) {
        this.musicTrackCacheMapper = musicTrackCacheMapper;
        this.objectStorageClient = objectStorageClient;
        this.properties = properties;
    }

    @Scheduled(fixedDelayString = "${shizuki.music.listen-cache.cleanup-interval-ms:3600000}")
    public void cleanupExpiredListenCache() {
        if (!properties.isEnabled()) {
            return;
        }

        long start = System.currentTimeMillis();
        LocalDateTime cutoff = LocalDateTime.now().minusDays(Math.max(1, properties.getRetentionDays()));
        int totalRows = 0;
        int ossDeleteSuccess = 0;
        int ossDeleteFailed = 0;

        while (true) {
            List<MusicTrackCacheEntity> rows = musicTrackCacheMapper.selectList(
                new LambdaQueryWrapper<MusicTrackCacheEntity>()
                    .isNotNull(MusicTrackCacheEntity::getLastListenTime)
                    .lt(MusicTrackCacheEntity::getLastListenTime, cutoff)
                    .orderByAsc(MusicTrackCacheEntity::getLastListenTime)
                    .orderByAsc(MusicTrackCacheEntity::getId)
                    .last("LIMIT " + BATCH_SIZE)
            );
            if (rows == null || rows.isEmpty()) {
                break;
            }

            for (MusicTrackCacheEntity row : rows) {
                totalRows += 1;
                try {
                    if (StringUtils.hasText(row.getBucketCode()) && StringUtils.hasText(row.getObjectCode())) {
                        objectStorageClient.deleteObject(row.getBucketCode(), row.getObjectCode());
                        ossDeleteSuccess += 1;
                    }
                } catch (Exception ex) {
                    ossDeleteFailed += 1;
                    LOGGER.warn(
                        "MUSIC_LISTEN_CACHE_CLEANUP_OSS_DELETE_FAIL id={} provider={} trackId={} reason={}",
                        row.getId(),
                        row.getProviderCode(),
                        row.getTrackId(),
                        ex.getMessage()
                    );
                } finally {
                    musicTrackCacheMapper.deleteById(row.getId());
                }
            }

            if (rows.size() < BATCH_SIZE) {
                break;
            }
        }

        long costMs = Math.max(0L, System.currentTimeMillis() - start);
        LOGGER.info(
            "MUSIC_LISTEN_CACHE_CLEANUP_DONE retentionDays={} totalRows={} ossDeleteSuccess={} ossDeleteFailed={} durationMs={}",
            Math.max(1, properties.getRetentionDays()),
            totalRows,
            ossDeleteSuccess,
            ossDeleteFailed,
            costMs
        );
    }
}
