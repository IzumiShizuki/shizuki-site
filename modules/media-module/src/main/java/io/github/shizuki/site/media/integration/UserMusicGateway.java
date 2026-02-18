package io.github.shizuki.site.media.integration;

import io.github.shizuki.site.user.dto.MusicApiKeyStatusResponse;
import io.github.shizuki.site.user.service.UserService;
import java.util.Set;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * 媒体服务访问用户域能力的本地客户端（单体模式）。
 */
@Component
public class UserMusicGateway {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserMusicGateway.class);

    private final UserService userService;

    public UserMusicGateway(UserService userService) {
        this.userService = userService;
    }

    public Long resolveQuota(String quotaCode, Set<String> groupCodes, Long fallback) {
        Long safeFallback = fallback == null ? 0L : fallback;
        try {
            return userService.resolveQuota(quotaCode, groupCodes, safeFallback);
        } catch (Exception ex) {
            LOGGER.warn("Resolve quota fallback in monolith mode, quotaCode={}, groups={}, fallback={}",
                quotaCode, groupCodes, safeFallback, ex);
            return safeFallback;
        }
    }

    public ApiKeyStatus getApiKeyStatus(Long userId, String provider) {
        String normalizedProvider = provider == null ? "" : provider.trim().toLowerCase();
        try {
            MusicApiKeyStatusResponse response = userService.getMusicApiKeyStatus(userId, normalizedProvider);
            return new ApiKeyStatus(response.getProvider(), response.isKeyBound(), response.getKeyMask());
        } catch (Exception ex) {
            LOGGER.warn("Get API key status fallback in monolith mode, userId={}, provider={}",
                userId, normalizedProvider, ex);
            return new ApiKeyStatus(normalizedProvider, false, null);
        }
    }

    public String getApiKeyPlaintext(Long userId, String provider) {
        String normalizedProvider = provider == null ? "" : provider.trim().toLowerCase();
        try {
            return userService.getMusicApiKeyPlaintext(userId, normalizedProvider);
        } catch (Exception ex) {
            LOGGER.warn("Get API key plaintext fallback in monolith mode, userId={}, provider={}",
                userId, normalizedProvider, ex);
            return "";
        }
    }

    public record ApiKeyStatus(String provider, boolean keyBound, String keyMask) {
    }
}
