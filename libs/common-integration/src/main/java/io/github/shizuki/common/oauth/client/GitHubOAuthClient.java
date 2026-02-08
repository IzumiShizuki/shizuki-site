package io.github.shizuki.common.oauth.client;

import io.github.shizuki.common.oauth.config.OAuthProperties;
import io.github.shizuki.common.oauth.model.GitHubTokenResponse;
import io.github.shizuki.common.oauth.model.GitHubUserResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

@Component
public class GitHubOAuthClient {

    private final OAuthProperties properties;
    private final RestClient restClient;

    public GitHubOAuthClient(OAuthProperties properties) {
        this.properties = properties;
        this.restClient = RestClient.builder().build();
    }

    public GitHubTokenResponse exchangeCode(String code, String redirectUri) {
        return restClient.post()
            .uri(properties.getTokenUrl())
            .header("Accept", "application/json")
            .body(new TokenRequest(properties.getClientId(), properties.getClientSecret(), code, redirectUri))
            .retrieve()
            .body(GitHubTokenResponse.class);
    }

    public GitHubUserResponse fetchUser(String accessToken) {
        return restClient.get()
            .uri(properties.getUserApiUrl())
            .header("Authorization", "Bearer " + accessToken)
            .header("Accept", "application/json")
            .retrieve()
            .body(GitHubUserResponse.class);
    }

    private record TokenRequest(String client_id, String client_secret, String code, String redirect_uri) {
    }
}
