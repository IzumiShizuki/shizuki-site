package io.github.shizuki.site.content.task;

import io.github.shizuki.site.content.support.NotionProperties;
import io.github.shizuki.site.content.support.PostNotionSyncService;
import io.github.shizuki.site.content.entity.NotionSyncJobEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class PostNotionNightlySyncTask {

    private static final Logger LOGGER = LoggerFactory.getLogger(PostNotionNightlySyncTask.class);

    private final NotionProperties notionProperties;
    private final PostNotionSyncService postNotionSyncService;

    public PostNotionNightlySyncTask(NotionProperties notionProperties,
                                     PostNotionSyncService postNotionSyncService) {
        this.notionProperties = notionProperties;
        this.postNotionSyncService = postNotionSyncService;
    }

    @Scheduled(
        cron = "${shizuki.blog.notion.nightly-cron:0 0 3 * * *}",
        zone = "${shizuki.blog.notion.timezone:Asia/Shanghai}"
    )
    public void runNightlySync() {
        if (!notionProperties.isConfigured()) {
            return;
        }
        try {
            NotionSyncJobEntity job = postNotionSyncService.createJob(
                PostNotionSyncService.JOB_TRIGGER_NIGHTLY,
                PostNotionSyncService.DIRECTION_BOTH,
                PostNotionSyncService.TARGET_ALL,
                null,
                notionProperties.getOwnerUserId()
            );
            postNotionSyncService.executeJob(job.getId());
        } catch (Exception exception) {
            LOGGER.warn("POST_NOTION_NIGHTLY_SYNC_FAIL reason={}", exception.getMessage());
        }
    }
}
