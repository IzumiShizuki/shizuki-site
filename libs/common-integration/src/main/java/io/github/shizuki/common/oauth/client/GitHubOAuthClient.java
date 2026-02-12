package io.github.shizuki.common.oauth.client;

import io.github.shizuki.common.oauth.config.OAuthProperties;
import io.github.shizuki.common.oauth.model.GitHubTokenResponse;
import io.github.shizuki.common.oauth.model.GitHubUserResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

/**
 * GitHub OAuth 客户端（旧版直接客户端实现）。
 *
 * <p>当前项目已引入 provider strategy 模式，本类主要用于兼容或渐进迁移场景。
 */
@Component
public class GitHubOAuthClient {

    /**
     * GitHub OAuth 配置属性。
     */
    private final OAuthProperties properties;
    /**
     * HTTP 客户端。
     */
    private final RestClient restClient;

    /**
     * 构造 GitHub OAuth 客户端。
     *
     * @param properties GitHub OAuth 配置
     */
    public GitHubOAuthClient(OAuthProperties properties) {
        this.properties = properties;
        this.restClient = RestClient.builder().build();
    }

    /**
     * 以授权码向 GitHub 换取 access token。
     *
     * @param code OAuth 授权码
     * @param redirectUri 回调地址
     * @return token 响应
     */
    public GitHubTokenResponse exchangeCode(String code, String redirectUri) {
        return restClient.post()
            .uri(properties.getTokenUrl())
            .header("Accept", "application/json")
            .body(new TokenRequest(properties.getClientId(), properties.getClientSecret(), code, redirectUri))
            .retrieve()
            .body(GitHubTokenResponse.class);
    }

    /**
     * 使用 access token 拉取 GitHub 用户信息。
     *
     * @param accessToken access token
     * @return 用户信息响应
     */
    public GitHubUserResponse fetchUser(String accessToken) {
        return restClient.get()
            .uri(properties.getUserApiUrl())
            .header("Authorization", "Bearer " + accessToken)
            .header("Accept", "application/json")
            .retrieve()
            .body(GitHubUserResponse.class);
    }

    /**
     * GitHub token 请求体。
     */
    private record TokenRequest(String client_id, String client_secret, String code, String redirect_uri) {
    }
}
