package io.github.shizuki.common.oauth.strategy;

import io.github.shizuki.common.core.resilience.RetrySpec;
import io.github.shizuki.common.core.resilience.SpringRetryExecutor;
import io.github.shizuki.common.oauth.config.OAuthProviderProperties;
import io.github.shizuki.common.oauth.model.OAuthIdentity;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.MediaType;
import org.springframework.http.client.JdkClientHttpRequestFactory;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.util.StringUtils;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.RestClientResponseException;

public abstract class AbstractOAuthProviderStrategy implements OAuthProviderStrategy {

    private static final Set<Class<? extends Throwable>> RETRYABLE_EXCEPTIONS =
        Set.of(TransientOAuthException.class);

    private final OAuthProviderProperties properties;
    private final RestClient restClient;
    private final SpringRetryExecutor retryExecutor;

    protected AbstractOAuthProviderStrategy(OAuthProviderProperties properties,
                                            RestClient.Builder restClientBuilder,
                                            SpringRetryExecutor retryExecutor) {
        this.properties = properties;
        this.retryExecutor = retryExecutor;
        HttpClient httpClient = HttpClient.newBuilder()
            .connectTimeout(Duration.ofMillis(properties.getConnectTimeoutMs()))
            .build();
        JdkClientHttpRequestFactory requestFactory = new JdkClientHttpRequestFactory(httpClient);
        requestFactory.setReadTimeout(Duration.ofMillis(properties.getReadTimeoutMs()));
        this.restClient = restClientBuilder.requestFactory(requestFactory).build();
    }

    @Override
    public String buildAuthorizeUrl(String state, String redirectUri) {
        OAuthProviderProperties.ProviderProperties provider = requireProvider();
        Map<String, String> query = new LinkedHashMap<>();
        query.put("client_id", provider.getClientId());
        query.put("state", state);
        query.put("redirect_uri", redirectUri);
        query.put("response_type", "code");
        if (StringUtils.hasText(provider.getScope())) {
            query.put("scope", provider.getScope());
        }
        StringBuilder builder = new StringBuilder(provider.getAuthorizeUrl());
        builder.append("?");
        boolean first = true;
        for (Map.Entry<String, String> entry : query.entrySet()) {
            if (!first) {
                builder.append("&");
            }
            first = false;
            builder.append(entry.getKey())
                .append("=")
                .append(URLEncoder.encode(entry.getValue(), StandardCharsets.UTF_8));
        }
        return builder.toString();
    }

    @Override
    public OAuthIdentity exchangeCode(String code, String redirectUri) {
        RetrySpec retrySpec = RetrySpec.exponentialJitter(
            properties.getRetryCount() + 1,
            properties.getRetryBackoffMs(),
            properties.getRetryMaxBackoffMs()
        );
        return retryExecutor.execute(
            retrySpec,
            RETRYABLE_EXCEPTIONS,
            () -> exchangeCodeOnce(code, redirectUri)
        );
    }

    private OAuthIdentity exchangeCodeOnce(String code, String redirectUri) {
        OAuthProviderProperties.ProviderProperties provider = requireProvider();
        MultiValueMap<String, String> tokenRequest = new LinkedMultiValueMap<>();
        tokenRequest.add("grant_type", "authorization_code");
        tokenRequest.add("client_id", provider.getClientId());
        tokenRequest.add("client_secret", provider.getClientSecret());
        tokenRequest.add("code", code);
        tokenRequest.add("redirect_uri", redirectUri);
        try {
            Map<String, Object> tokenResponse = restClient.post()
                .uri(provider.getTokenUrl())
                .contentType(MediaType.APPLICATION_FORM_URLENCODED)
                .accept(MediaType.APPLICATION_JSON)
                .body(tokenRequest)
                .retrieve()
                .body(new ParameterizedTypeReference<Map<String, Object>>() {
                });
            String accessToken = readString(tokenResponse, "access_token");
            if (!StringUtils.hasText(accessToken)) {
                throw new NonRetryableOAuthException("OAuth token response missing access_token");
            }

            Map<String, Object> userInfo = restClient.get()
                .uri(provider.getUserApiUrl())
                .header("Authorization", "Bearer " + accessToken)
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .body(new ParameterizedTypeReference<Map<String, Object>>() {
                });

            return mapIdentity(userInfo);
        } catch (RestClientResponseException ex) {
            if (ex.getStatusCode().is5xxServerError()) {
                throw new TransientOAuthException("oauth_upstream_5xx", ex);
            }
            throw new NonRetryableOAuthException("OAuth upstream rejected request", ex);
        } catch (ResourceAccessException ex) {
            throw new TransientOAuthException("oauth_network", ex);
        }
    }

    protected abstract OAuthIdentity mapIdentity(Map<String, Object> userInfo);

    protected OAuthProviderProperties.ProviderProperties requireProvider() {
        OAuthProviderProperties.ProviderProperties provider = properties.requireProvider(providerCode());
        if (provider == null) {
            throw new NonRetryableOAuthException("OAuth provider config not found: " + providerCode());
        }
        if (!StringUtils.hasText(provider.getClientId())
            || !StringUtils.hasText(provider.getClientSecret())
            || !StringUtils.hasText(provider.getAuthorizeUrl())
            || !StringUtils.hasText(provider.getTokenUrl())
            || !StringUtils.hasText(provider.getUserApiUrl())) {
            throw new NonRetryableOAuthException("OAuth provider config incomplete: " + providerCode());
        }
        return provider;
    }

    protected String readString(Map<String, Object> payload, String key) {
        if (payload == null) {
            return null;
        }
        Object value = payload.get(key);
        if (value == null) {
            return null;
        }
        String text = String.valueOf(value);
        return StringUtils.hasText(text) ? text : null;
    }

    protected String firstNonBlank(String... values) {
        if (values == null) {
            return null;
        }
        for (String value : values) {
            if (StringUtils.hasText(value)) {
                return value;
            }
        }
        return null;
    }

    public static class TransientOAuthException extends RuntimeException {

        public TransientOAuthException(String message, Throwable cause) {
            super(message, cause);
        }
    }

    public static class NonRetryableOAuthException extends RuntimeException {

        public NonRetryableOAuthException(String message) {
            super(message);
        }

        public NonRetryableOAuthException(String message, Throwable cause) {
            super(message, cause);
        }
    }
}
