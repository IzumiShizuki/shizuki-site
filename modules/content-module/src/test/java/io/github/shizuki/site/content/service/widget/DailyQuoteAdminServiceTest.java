package io.github.shizuki.site.content.service.widget;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.common.security.context.LoginUserContext;
import io.github.shizuki.common.security.model.LoginUser;
import io.github.shizuki.site.content.entity.DailyQuoteSnapshotEntity;
import java.util.Set;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

class DailyQuoteAdminServiceTest {

    @AfterEach
    void tearDown() {
        LoginUserContext.clear();
    }

    @Test
    void authorizedManualRefreshDelegatesOnlyToImmutableMissingDateCoordinator() {
        DailyQuoteSnapshotCoordinator coordinator = org.mockito.Mockito.mock(DailyQuoteSnapshotCoordinator.class);
        DailyQuoteSnapshotEntity existing = new DailyQuoteSnapshotEntity();
        existing.setId(91L);
        when(coordinator.refreshMissingCurrentDate()).thenReturn(existing);
        LoginUserContext.set(new LoginUser(7L, Set.of("ADMIN"), Set.of("site.widgets.manage")));

        assertThat(new DailyQuoteAdminService(coordinator).refreshMissingToday()).isSameAs(existing);
        verify(coordinator).refreshMissingCurrentDate();
    }

    @Test
    void nonAdminCannotTriggerAnyRefresh() {
        DailyQuoteSnapshotCoordinator coordinator = org.mockito.Mockito.mock(DailyQuoteSnapshotCoordinator.class);
        LoginUserContext.set(new LoginUser(8L, Set.of("USER"), Set.of("site.widgets.manage")));

        assertThatThrownBy(() -> new DailyQuoteAdminService(coordinator).refreshMissingToday())
            .isInstanceOfSatisfying(BusinessException.class, exception ->
                assertThat(exception.getErrorCode()).isEqualTo(ErrorCode.FORBIDDEN));
        verify(coordinator, never()).refreshMissingCurrentDate();
    }
}
