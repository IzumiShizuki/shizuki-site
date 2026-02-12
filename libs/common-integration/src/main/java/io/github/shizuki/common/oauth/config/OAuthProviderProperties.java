package io.github.shizuki.common.oauth.config;

import java.util.HashMap;
import java.util.Map;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.util.StringUtils;

/**
 * OAuth provider 通用配置属性。
 *
 * <p>支持多 provider map、超时、重试参数等配置，前缀 {@code shizuki.oauth}。
 */
@ConfigurationProperties(prefix = "shizuki.oauth")
public class OAuthProviderProperties {

    /**
     * 最大重试次数（不含首次调用）。
     */
    private int retryCount = 1;
    /**
     * 初始退避时长（毫秒）。
     */
    private long retryBackoffMs = 120L;
    /**
     * 最大退避上限（毫秒）。
     */
    private long retryMaxBackoffMs = 1000L;
    /**
     * 连接超时（毫秒）。
     */
    private long connectTimeoutMs = 500L;
    /**
     * 读取超时（毫秒）。
     */
    private long readTimeoutMs = 1200L;
    /**
     * provider 配置映射，key 为 provider code（如 github / linuxdo）。
     */
    private Map<String, ProviderProperties> providers = new HashMap<>();

    /**
     * 获取最大重试次数（不含首次调用）。
     *
     * @return 最大重试次数
     */
    public int getRetryCount() {
        return retryCount;
    }

    /**
     * 设置最大重试次数（不含首次调用）。
     *
     * @param retryCount 最大重试次数
     */
    public void setRetryCount(int retryCount) {
        this.retryCount = Math.max(0, retryCount);
    }

    /**
     * 获取初始退避时长（毫秒）。
     *
     * @return 初始退避时长
     */
    public long getRetryBackoffMs() {
        return retryBackoffMs;
    }

    /**
     * 设置初始退避时长（毫秒）。
     *
     * @param retryBackoffMs 初始退避时长
     */
    public void setRetryBackoffMs(long retryBackoffMs) {
        // 保护下限，避免过小退避导致瞬时高频重试。
        this.retryBackoffMs = Math.max(50L, retryBackoffMs);
    }

    /**
     * 获取最大退避上限（毫秒）。
     *
     * @return 最大退避上限
     */
    public long getRetryMaxBackoffMs() {
        return retryMaxBackoffMs;
    }

    /**
     * 设置最大退避上限（毫秒）。
     *
     * @param retryMaxBackoffMs 最大退避上限
     */
    public void setRetryMaxBackoffMs(long retryMaxBackoffMs) {
        // 上限至少不小于初始退避，避免配置反转。
        this.retryMaxBackoffMs = Math.max(this.retryBackoffMs, retryMaxBackoffMs);
    }

    /**
     * 获取连接超时（毫秒）。
     *
     * @return 连接超时
     */
    public long getConnectTimeoutMs() {
        return connectTimeoutMs;
    }

    /**
     * 设置连接超时（毫秒）。
     *
     * @param connectTimeoutMs 连接超时
     */
    public void setConnectTimeoutMs(long connectTimeoutMs) {
        this.connectTimeoutMs = Math.max(100L, connectTimeoutMs);
    }

    /**
     * 获取读取超时（毫秒）。
     *
     * @return 读取超时
     */
    public long getReadTimeoutMs() {
        return readTimeoutMs;
    }

    /**
     * 设置读取超时（毫秒）。
     *
     * @param readTimeoutMs 读取超时
     */
    public void setReadTimeoutMs(long readTimeoutMs) {
        this.readTimeoutMs = Math.max(200L, readTimeoutMs);
    }

    /**
     * 获取 provider 配置映射。
     *
     * @return provider 配置映射
     */
    public Map<String, ProviderProperties> getProviders() {
        return providers;
    }

    /**
     * 设置 provider 配置映射。
     *
     * @param providers provider 配置映射
     */
    public void setProviders(Map<String, ProviderProperties> providers) {
        this.providers = providers == null ? new HashMap<>() : providers;
    }

    /**
     * 按 providerCode 获取配置。
     *
     * @param providerCode provider 编码
     * @return provider 配置，不存在时返回 null
     */
    public ProviderProperties requireProvider(String providerCode) {
        if (!StringUtils.hasText(providerCode)) {
            return null;
        }
        return providers.get(providerCode.toLowerCase());
    }

    /**
     * 单个 provider 的 OAuth 端点与凭据配置。
     */
    public static class ProviderProperties {

        /**
         * client id。
         */
        private String clientId;
        /**
         * client secret。
         */
        private String clientSecret;
        /**
         * authorize endpoint。
         */
        private String authorizeUrl;
        /**
         * token endpoint。
         */
        private String tokenUrl;
        /**
         * user info endpoint。
         */
        private String userApiUrl;
        /**
         * OAuth scope。
         */
        private String scope;

        /**
         * 获取 client id。
         *
         * @return client id
         */
        public String getClientId() {
            return clientId;
        }

        /**
         * 设置 client id。
         *
         * @param clientId client id
         */
        public void setClientId(String clientId) {
            this.clientId = clientId;
        }

        /**
         * 获取 client secret。
         *
         * @return client secret
         */
        public String getClientSecret() {
            return clientSecret;
        }

        /**
         * 设置 client secret。
         *
         * @param clientSecret client secret
         */
        public void setClientSecret(String clientSecret) {
            this.clientSecret = clientSecret;
        }

        /**
         * 获取授权端点地址。
         *
         * @return 授权端点地址
         */
        public String getAuthorizeUrl() {
            return authorizeUrl;
        }

        /**
         * 设置授权端点地址。
         *
         * @param authorizeUrl 授权端点地址
         */
        public void setAuthorizeUrl(String authorizeUrl) {
            this.authorizeUrl = authorizeUrl;
        }

        /**
         * 获取 token 端点地址。
         *
         * @return token 端点地址
         */
        public String getTokenUrl() {
            return tokenUrl;
        }

        /**
         * 设置 token 端点地址。
         *
         * @param tokenUrl token 端点地址
         */
        public void setTokenUrl(String tokenUrl) {
            this.tokenUrl = tokenUrl;
        }

        /**
         * 获取用户信息端点地址。
         *
         * @return 用户信息端点地址
         */
        public String getUserApiUrl() {
            return userApiUrl;
        }

        /**
         * 设置用户信息端点地址。
         *
         * @param userApiUrl 用户信息端点地址
         */
        public void setUserApiUrl(String userApiUrl) {
            this.userApiUrl = userApiUrl;
        }

        /**
         * 获取 OAuth scope。
         *
         * @return OAuth scope
         */
        public String getScope() {
            return scope;
        }

        /**
         * 设置 OAuth scope。
         *
         * @param scope OAuth scope
         */
        public void setScope(String scope) {
            this.scope = scope;
        }
    }
}
