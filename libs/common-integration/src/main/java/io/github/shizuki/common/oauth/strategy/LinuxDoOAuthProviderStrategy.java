package io.github.shizuki.common.oauth.strategy;

import io.github.shizuki.common.core.resilience.SpringRetryExecutor;
import io.github.shizuki.common.oauth.config.OAuthProviderProperties;
import io.github.shizuki.common.oauth.model.OAuthIdentity;
import java.util.Map;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.client.RestClient;

@Component
public class LinuxDoOAuthProviderStrategy extends AbstractOAuthProviderStrategy {

    public LinuxDoOAuthProviderStrategy(OAuthProviderProperties properties,
                                        RestClient.Builder restClientBuilder,
                                        SpringRetryExecutor retryExecutor) {
        super(properties, restClientBuilder, retryExecutor);
    }

    @Override
    public String providerCode() {
        return "linuxdo";
    }

    @Override
    protected OAuthIdentity mapIdentity(Map<String, Object> userInfo) {
        String providerUserId = firstNonBlank(
            readString(userInfo, "sub"),
            readString(userInfo, "id"),
            readString(userInfo, "user_id")
        );
        if (!StringUtils.hasText(providerUserId)) {
            throw new NonRetryableOAuthException("LinuxDo user response missing id");
        }
        String login = firstNonBlank(
            readString(userInfo, "preferred_username"),
            readString(userInfo, "username"),
            readString(userInfo, "login")
        );
        String nickname = firstNonBlank(
            readString(userInfo, "name"),
            readString(userInfo, "nickname"),
            login
        );
        return new OAuthIdentity(
            providerCode(),
            providerUserId,
            login,
            readString(userInfo, "email"),
            nickname,
            firstNonBlank(readString(userInfo, "picture"), readString(userInfo, "avatar_url"))
        );
    }
}

