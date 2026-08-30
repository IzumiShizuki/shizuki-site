package io.github.shizuki.site.content.service.widget;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.common.security.context.LoginUserContext;
import io.github.shizuki.common.security.model.LoginUser;
import io.github.shizuki.site.content.entity.DailyQuoteSnapshotEntity;
import org.springframework.stereotype.Service;

/** Manual refresh only fills a missing current date through the immutable coordinator. */
@Service
public class DailyQuoteAdminService {

    private static final String MANAGE_PERMISSION = "site.widgets.manage";

    private final DailyQuoteSnapshotCoordinator coordinator;

    public DailyQuoteAdminService(DailyQuoteSnapshotCoordinator coordinator) {
        this.coordinator = coordinator;
    }

    public DailyQuoteSnapshotEntity refreshMissingToday() {
        LoginUser user = LoginUserContext.get().orElse(null);
        boolean admin = user != null && user.getGroups().stream().anyMatch("ADMIN"::equalsIgnoreCase);
        if (!admin || !user.hasPermission(MANAGE_PERMISSION)) {
            throw new BusinessException(ErrorCode.FORBIDDEN, "site widget management permission is required");
        }
        return coordinator.refreshMissingCurrentDate();
    }
}
