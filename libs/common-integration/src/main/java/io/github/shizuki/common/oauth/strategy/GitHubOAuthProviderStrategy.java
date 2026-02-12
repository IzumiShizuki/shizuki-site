package io.github.shizuki.common.oauth.strategy;

import io.github.shizuki.common.core.resilience.SpringRetryExecutor;
import io.github.shizuki.common.oauth.config.OAuthProviderProperties;
import io.github.shizuki.common.oauth.model.OAuthIdentity;
import java.util.Map;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.client.RestClient;

/**
 * GitHub OAuth provider 策略实现。
 */
@Component
public class GitHubOAuthProviderStrategy extends AbstractOAuthProviderStrategy {

    /**
     * 构造 GitHub provider 策略。
     *
     * @param properties OAuth 通用配置
     * @param restClientBuilder RestClient 构造器
     * @param retryExecutor 重试执行器
     */
    public GitHubOAuthProviderStrategy(OAuthProviderProperties properties,
                                       RestClient.Builder restClientBuilder,
                                       SpringRetryExecutor retryExecutor) {
        super(properties, restClientBuilder, retryExecutor);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String providerCode() {
        return "github";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected OAuthIdentity mapIdentity(Map<String, Object> userInfo) {
        String providerUserId = firstNonBlank(readString(userInfo, "id"), readString(userInfo, "node_id"));
        if (!StringUtils.hasText(providerUserId)) {
            throw new NonRetryableOAuthException("GitHub user response missing id");
        }
        String login = readString(userInfo, "login");
        String nickname = firstNonBlank(readString(userInfo, "name"), login);
        return new OAuthIdentity(
            providerCode(),
            providerUserId,
            login,
            readString(userInfo, "email"),
            nickname,
            readString(userInfo, "avatar_url")
        );
    }
}
