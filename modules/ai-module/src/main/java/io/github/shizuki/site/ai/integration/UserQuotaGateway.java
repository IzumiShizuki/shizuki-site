package io.github.shizuki.site.ai.integration;

import io.github.shizuki.site.user.service.UserService;
import java.util.Set;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class UserQuotaGateway {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserQuotaGateway.class);

    private final UserService userService;

    public UserQuotaGateway(UserService userService) {
        this.userService = userService;
    }

    public Long resolveQuota(String quotaCode, Set<String> groupCodes, Long defaultValue) {
        Long fallback = defaultValue == null ? 5L : defaultValue;
        try {
            return userService.resolveQuota(quotaCode, groupCodes, fallback);
        } catch (Exception ex) {
            LOGGER.warn("Resolve quota fallback in monolith mode. quotaCode={} groups={} fallback={}",
                quotaCode, groupCodes, fallback, ex);
            return fallback;
        }
    }
}
