package io.github.shizuki.site.content.task;

import io.github.shizuki.site.content.entity.LightAppTaskNotionSyncJobEntity;
import io.github.shizuki.site.content.support.LightAppTaskNotionProperties;
import io.github.shizuki.site.content.support.LightAppTaskNotionSyncService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class LightAppTaskNotionNightlySyncTask {

    private static final Logger LOGGER = LoggerFactory.getLogger(LightAppTaskNotionNightlySyncTask.class);

    private final LightAppTaskNotionProperties notionProperties;
    private final LightAppTaskNotionSyncService notionSyncService;

    public LightAppTaskNotionNightlySyncTask(LightAppTaskNotionProperties notionProperties,
                                             LightAppTaskNotionSyncService notionSyncService) {
        this.notionProperties = notionProperties;
        this.notionSyncService = notionSyncService;
    }

    @Scheduled(
        cron = "${shizuki.light-app.task.notion.nightly-cron:0 0 3 * * *}",
        zone = "${shizuki.light-app.task.notion.timezone:Asia/Shanghai}"
    )
    public void runNightlySync() {
        if (!notionProperties.isConfigured()) {
            return;
        }
        try {
            LightAppTaskNotionSyncJobEntity job = notionSyncService.createJob(
                LightAppTaskNotionSyncService.JOB_TRIGGER_NIGHTLY,
                LightAppTaskNotionSyncService.DIRECTION_BOTH,
                LightAppTaskNotionSyncService.TARGET_ALL,
                null,
                notionProperties.getOwnerUserId()
            );
            notionSyncService.executeJob(job.getId());
        } catch (Exception exception) {
            LOGGER.warn("TASK_NOTION_NIGHTLY_SYNC_FAIL reason={}", exception.getMessage());
        }
    }
}
