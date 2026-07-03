package io.github.shizuki.site.content.task;

import io.github.shizuki.site.content.service.LightAppBalanceBillSyncService;
import io.github.shizuki.site.content.support.LightAppBalanceBillSyncProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class LightAppBalanceBillSyncNightlyTask {

    private static final Logger LOGGER = LoggerFactory.getLogger(LightAppBalanceBillSyncNightlyTask.class);

    private final LightAppBalanceBillSyncService billSyncService;
    private final LightAppBalanceBillSyncProperties properties;

    public LightAppBalanceBillSyncNightlyTask(LightAppBalanceBillSyncService billSyncService,
                                              LightAppBalanceBillSyncProperties properties) {
        this.billSyncService = billSyncService;
        this.properties = properties;
    }

    @Scheduled(
        cron = "${shizuki.light-app.balance.bill-sync.nightly-cron:0 0 0 * * *}",
        zone = "${shizuki.light-app.balance.bill-sync.timezone:Asia/Shanghai}"
    )
    public void runNightlySync() {
        if (!properties.isConfigured()) {
            return;
        }
        try {
            billSyncService.runNightlySync();
        } catch (Exception exception) {
            LOGGER.warn("BALANCE_BILL_SYNC_NIGHTLY_FAIL reason={}", exception.getMessage());
        }
    }
}
