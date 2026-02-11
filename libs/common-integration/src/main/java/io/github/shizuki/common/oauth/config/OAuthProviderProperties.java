package io.github.shizuki.common.oauth.config;

import java.util.HashMap;
import java.util.Map;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.util.StringUtils;

@ConfigurationProperties(prefix = "shizuki.oauth")
public class OAuthProviderProperties {

    private int retryCount = 1;
    private long retryBackoffMs = 120L;
    private long retryMaxBackoffMs = 1000L;
    private long connectTimeoutMs = 500L;
    private long readTimeoutMs = 1200L;
    private Map<String, ProviderProperties> providers = new HashMap<>();

    public int getRetryCount() {
        return retryCount;
    }

    public void setRetryCount(int retryCount) {
        this.retryCount = Math.max(0, retryCount);
    }

    public long getRetryBackoffMs() {
        return retryBackoffMs;
    }

    public void setRetryBackoffMs(long retryBackoffMs) {
        this.retryBackoffMs = Math.max(50L, retryBackoffMs);
    }

    public long getRetryMaxBackoffMs() {
        return retryMaxBackoffMs;
    }

    public void setRetryMaxBackoffMs(long retryMaxBackoffMs) {
        this.retryMaxBackoffMs = Math.max(this.retryBackoffMs, retryMaxBackoffMs);
    }

    public long getConnectTimeoutMs() {
        return connectTimeoutMs;
    }

    public void setConnectTimeoutMs(long connectTimeoutMs) {
        this.connectTimeoutMs = Math.max(100L, connectTimeoutMs);
    }

    public long getReadTimeoutMs() {
        return readTimeoutMs;
    }

    public void setReadTimeoutMs(long readTimeoutMs) {
        this.readTimeoutMs = Math.max(200L, readTimeoutMs);
    }

    public Map<String, ProviderProperties> getProviders() {
        return providers;
    }

    public void setProviders(Map<String, ProviderProperties> providers) {
        this.providers = providers == null ? new HashMap<>() : providers;
    }

    public ProviderProperties requireProvider(String providerCode) {
        if (!StringUtils.hasText(providerCode)) {
            return null;
        }
        return providers.get(providerCode.toLowerCase());
    }

    public static class ProviderProperties {

        private String clientId;
        private String clientSecret;
        private String authorizeUrl;
        private String tokenUrl;
        private String userApiUrl;
        private String scope;

        public String getClientId() {
            return clientId;
        }

        public void setClientId(String clientId) {
            this.clientId = clientId;
        }

        public String getClientSecret() {
            return clientSecret;
        }

        public void setClientSecret(String clientSecret) {
            this.clientSecret = clientSecret;
        }

        public String getAuthorizeUrl() {
            return authorizeUrl;
        }

        public void setAuthorizeUrl(String authorizeUrl) {
            this.authorizeUrl = authorizeUrl;
        }

        public String getTokenUrl() {
            return tokenUrl;
        }

        public void setTokenUrl(String tokenUrl) {
            this.tokenUrl = tokenUrl;
        }

        public String getUserApiUrl() {
            return userApiUrl;
        }

        public void setUserApiUrl(String userApiUrl) {
            this.userApiUrl = userApiUrl;
        }

        public String getScope() {
            return scope;
        }

        public void setScope(String scope) {
            this.scope = scope;
        }
    }
}

