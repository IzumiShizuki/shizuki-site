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

/**
 * OAuth provider 通用策略基类。
 *
 * <p>封装授权 URL 构建、授权码交换、重试策略、异常分类和基础字段读取逻辑。
 */
public abstract class AbstractOAuthProviderStrategy implements OAuthProviderStrategy {

    /**
     * 可重试异常集合（仅瞬时故障）。
     */
    private static final Set<Class<? extends Throwable>> RETRYABLE_EXCEPTIONS =
        Set.of(TransientOAuthException.class);

    /**
     * OAuth 配置属性。
     */
    private final OAuthProviderProperties properties;
    /**
     * HTTP 客户端。
     */
    private final RestClient restClient;
    /**
     * 统一重试执行器。
     */
    private final SpringRetryExecutor retryExecutor;

    /**
     * 构造 OAuth provider 通用基类。
     *
     * @param properties OAuth 通用配置
     * @param restClientBuilder RestClient 构造器
     * @param retryExecutor 统一重试执行器
     */
    protected AbstractOAuthProviderStrategy(OAuthProviderProperties properties,
                                            RestClient.Builder restClientBuilder,
                                            SpringRetryExecutor retryExecutor) {
        this.properties = properties;
        this.retryExecutor = retryExecutor;
        // 连接超时和读超时由统一配置驱动，避免 provider 调用长期阻塞。
        HttpClient httpClient = HttpClient.newBuilder()
            .connectTimeout(Duration.ofMillis(properties.getConnectTimeoutMs()))
            .build();
        JdkClientHttpRequestFactory requestFactory = new JdkClientHttpRequestFactory(httpClient);
        requestFactory.setReadTimeout(Duration.ofMillis(properties.getReadTimeoutMs()));
        this.restClient = restClientBuilder.requestFactory(requestFactory).build();
    }

    /**
     * {@inheritDoc}
     */
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

    /**
     * {@inheritDoc}
     */
    @Override
    public OAuthIdentity exchangeCode(String code, String redirectUri) {
        RetrySpec retrySpec = RetrySpec.exponentialJitter(
            properties.getRetryCount() + 1,
            properties.getRetryBackoffMs(),
            properties.getRetryMaxBackoffMs()
        );
        // 关键策略：仅对瞬时异常重试，业务/参数类错误直接失败。
        return retryExecutor.execute(
            retrySpec,
            RETRYABLE_EXCEPTIONS,
            () -> exchangeCodeOnce(code, redirectUri)
        );
    }

    /**
     * 执行单次 OAuth code 交换。
     *
     * @param code 授权码
     * @param redirectUri 回调地址
     * @return 标准化身份
     */
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

            // provider 具体字段映射在子类实现。
            return mapIdentity(userInfo);
        } catch (RestClientResponseException ex) {
            if (ex.getStatusCode().is5xxServerError()) {
                // 5xx 归类为瞬时错误，允许重试。
                throw new TransientOAuthException("oauth_upstream_5xx", ex);
            }
            // 4xx 通常为授权码无效或请求参数问题，不重试。
            throw new NonRetryableOAuthException("OAuth upstream rejected request", ex);
        } catch (ResourceAccessException ex) {
            // 网络错误归类为瞬时错误，允许重试。
            throw new TransientOAuthException("oauth_network", ex);
        }
    }

    /**
     * 将 provider 用户信息映射为标准身份结构。
     *
     * @param userInfo provider 用户信息
     * @return 标准化身份
     */
    protected abstract OAuthIdentity mapIdentity(Map<String, Object> userInfo);

    /**
     * 读取并校验 provider 配置。
     *
     * @return provider 配置
     */
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

    /**
     * 从 map 读取字符串字段。
     *
     * @param payload 原始 map
     * @param key 字段名
     * @return 文本值（空白视为 null）
     */
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

    /**
     * 返回首个非空白字符串。
     *
     * @param values 候选值
     * @return 首个有效值，没有则返回 null
     */
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

    /**
     * 可重试 OAuth 异常（网络/超时/上游 5xx）。
     */
    public static class TransientOAuthException extends RuntimeException {

        /**
         * 构造可重试异常。
         *
         * @param message 异常消息
         * @param cause 根因异常
         */
        public TransientOAuthException(String message, Throwable cause) {
            super(message, cause);
        }
    }

    /**
     * 不可重试 OAuth 异常（参数/配置/上游 4xx）。
     */
    public static class NonRetryableOAuthException extends RuntimeException {

        /**
         * 构造不可重试异常。
         *
         * @param message 异常消息
         */
        public NonRetryableOAuthException(String message) {
            super(message);
        }

        /**
         * 构造不可重试异常。
         *
         * @param message 异常消息
         * @param cause 根因异常
         */
        public NonRetryableOAuthException(String message, Throwable cause) {
            super(message, cause);
        }
    }
}
