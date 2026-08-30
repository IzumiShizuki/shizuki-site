package io.github.shizuki.site.content.task;

import io.github.shizuki.site.content.service.widget.DailyQuoteSnapshotCoordinator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/** Polls across time zones; the coordinator computes the configured site-local date and commits only if missing. */
@Component
public class DailyQuoteSnapshotTask {

    private static final Logger LOGGER = LoggerFactory.getLogger(DailyQuoteSnapshotTask.class);

    private final DailyQuoteSnapshotCoordinator coordinator;

    public DailyQuoteSnapshotTask(DailyQuoteSnapshotCoordinator coordinator) {
        this.coordinator = coordinator;
    }

    @Scheduled(cron = "${shizuki.site.daily-quote.refresh-cron:0 */15 * * * *}", zone = "UTC")
    public void refreshMissingSnapshot() {
        try {
            coordinator.refreshMissingCurrentDate();
        } catch (RuntimeException exception) {
            LOGGER.warn("DAILY_QUOTE_SNAPSHOT_TASK_FAIL reason={}", exception.getClass().getSimpleName());
        }
    }
}
