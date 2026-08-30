package io.github.shizuki.site.content.task;

import static org.assertj.core.api.Assertions.assertThatCode;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import io.github.shizuki.site.content.service.widget.DailyQuoteSnapshotCoordinator;
import org.junit.jupiter.api.Test;

class DailyQuoteSnapshotTaskTest {

    @Test
    void delegatesScheduledResolutionAndContainsFailures() {
        DailyQuoteSnapshotCoordinator coordinator = org.mockito.Mockito.mock(DailyQuoteSnapshotCoordinator.class);
        DailyQuoteSnapshotTask task = new DailyQuoteSnapshotTask(coordinator);
        when(coordinator.refreshMissingCurrentDate()).thenThrow(new IllegalStateException("temporary"));

        assertThatCode(task::refreshMissingSnapshot).doesNotThrowAnyException();
        verify(coordinator).refreshMissingCurrentDate();
    }
}
