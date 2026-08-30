package io.github.shizuki.site.media.service.retention;

import static org.assertj.core.api.Assertions.assertThat;

import java.lang.reflect.Method;
import org.junit.jupiter.api.Test;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.transaction.annotation.Transactional;

class PhotoRetentionTransactionContractTest {

    @Test
    void recycleAndRestoreAreTransactionalWhileDryRunIsReadOnly() throws Exception {
        Method recycle = PhotoRetentionService.class.getMethod("recycle", long.class, int.class);
        Method restore = PhotoRetentionService.class.getMethod("restore", long.class, int.class);
        Method dryRun = PhotoRetentionService.class.getMethod("dryRunPurge", long.class, int.class);

        assertThat(recycle.getAnnotation(Transactional.class)).isNotNull();
        assertThat(restore.getAnnotation(Transactional.class)).isNotNull();
        assertThat(dryRun.getAnnotation(Transactional.class))
            .isNotNull()
            .extracting(Transactional::readOnly)
            .isEqualTo(true);
    }

    @Test
    void firstReleaseRetentionServiceHasNoAutomaticCleanupSchedule() {
        assertThat(PhotoRetentionService.class.getDeclaredMethods())
            .noneMatch(method -> method.isAnnotationPresent(Scheduled.class));
    }
}
