package io.github.shizuki.site.media.integration;

import io.github.shizuki.site.user.dto.MusicApiKeyStatusResponse;
import io.github.shizuki.site.user.dto.MeAccountResponse;
import io.github.shizuki.site.user.dto.MusicSourceAccountStatusResponse;
import io.github.shizuki.site.user.dto.OAuthBindingView;
import io.github.shizuki.site.user.service.UserService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
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

    public Map<String, Object> getPreference(Long userId) {
        if (userId == null || userId <= 0) {
            return Collections.emptyMap();
        }
        try {
            Map<String, Object> payload = userService.getPreference(userId);
            return payload == null ? Collections.emptyMap() : payload;
        } catch (Exception ex) {
            LOGGER.warn("Get preference fallback in monolith mode, userId={}", userId, ex);
            return Collections.emptyMap();
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

    public List<SourceAccountStatus> listSourceAccountStatus(Long userId) {
        if (userId == null || userId <= 0) {
            return List.of();
        }
        try {
            List<MusicSourceAccountStatusResponse> rows = userService.listMusicSourceAccountStatus(userId);
            List<SourceAccountStatus> result = new ArrayList<>();
            for (MusicSourceAccountStatusResponse item : rows) {
                if (item == null) {
                    continue;
                }
                result.add(new SourceAccountStatus(
                    item.getProvider(),
                    item.getAuthType(),
                    item.isBound(),
                    item.getMask(),
                    item.getStatus()
                ));
            }
            return result;
        } catch (Exception ex) {
            LOGGER.warn("Get source account status fallback in monolith mode, userId={}", userId, ex);
            return List.of();
        }
    }

    public SourceAccountStatus getSourceAccountStatus(Long userId, String provider) {
        String normalizedProvider = provider == null ? "" : provider.trim().toLowerCase();
        if (userId == null || userId <= 0 || normalizedProvider.isEmpty()) {
            return new SourceAccountStatus(normalizedProvider, "cookie", false, "", "UNBOUND");
        }
        try {
            MusicSourceAccountStatusResponse item = userService.getMusicSourceAccountCookieStatus(userId, normalizedProvider);
            if (item == null) {
                return new SourceAccountStatus(normalizedProvider, "cookie", false, "", "UNBOUND");
            }
            return new SourceAccountStatus(
                item.getProvider(),
                item.getAuthType(),
                item.isBound(),
                item.getMask(),
                item.getStatus()
            );
        } catch (Exception ex) {
            LOGGER.warn(
                "Get source account status fallback in monolith mode, userId={}, provider={}",
                userId,
                normalizedProvider,
                ex
            );
            return new SourceAccountStatus(normalizedProvider, "cookie", false, "", "UNBOUND");
        }
    }

    public String getSourceAccountCookiePlaintext(Long userId, String provider) {
        String normalizedProvider = provider == null ? "" : provider.trim().toLowerCase();
        if (userId == null || userId <= 0 || normalizedProvider.isEmpty()) {
            return "";
        }
        try {
            return userService.getMusicSourceAccountCookiePlaintext(userId, normalizedProvider);
        } catch (Exception ex) {
            LOGGER.warn(
                "Get source account cookie fallback in monolith mode, userId={}, provider={}",
                userId,
                normalizedProvider,
                ex
            );
            return "";
        }
    }

    public boolean hasOAuthBinding(Long userId, String provider) {
        String normalizedProvider = provider == null ? "" : provider.trim().toLowerCase();
        if (userId == null || userId <= 0 || normalizedProvider.isEmpty()) {
            return false;
        }
        try {
            MeAccountResponse account = userService.getAccountProfile(userId);
            return account.oauthBindings().stream()
                .map(OAuthBindingView::provider)
                .anyMatch(code -> normalizedProvider.equals(String.valueOf(code).trim().toLowerCase()));
        } catch (Exception ex) {
            LOGGER.warn("Get oauth binding fallback in monolith mode, userId={}, provider={}",
                userId, normalizedProvider, ex);
            return false;
        }
    }

    public record ApiKeyStatus(String provider, boolean keyBound, String keyMask) {
    }

    public record SourceAccountStatus(String provider,
                                      String authType,
                                      boolean bound,
                                      String mask,
                                      String status) {
    }
}
