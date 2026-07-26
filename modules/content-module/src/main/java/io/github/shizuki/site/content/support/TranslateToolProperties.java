package io.github.shizuki.site.content.support;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Web Toolbox 文本翻译代理配置。
 *
 * <p>密钥只保存在服务端（环境变量 / application.yml），浏览器一律通过
 * {@code /api/v1/tools/translate} 走站内代理，不会接触任何 API Key。</p>
 */
@ConfigurationProperties(prefix = "shizuki.tools.translate")
public class TranslateToolProperties {

    /** 翻译代理总开关。 */
    private boolean enabled = true;

    /** 客户端未指定引擎时使用的默认引擎：baidu / deepl。 */
    private String defaultProvider = "baidu";

    /** 单次请求允许的最大字符数。 */
    private int maxTextLength = 3000;

    /** 建立连接超时（毫秒）。 */
    private int connectTimeoutMs = 3000;

    /** 上游响应超时（毫秒）。 */
    private int readTimeoutMs = 10000;

    /** 每个客户端 IP 每分钟允许的请求数。 */
    private int rateLimitPerMinute = 10;

    /** 全站每日（UTC 日界）代理的总字符预算，0 表示不限制。 */
    private long dailyCharBudget = 100000L;

    private final Baidu baidu = new Baidu();

    private final Deepl deepl = new Deepl();

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getDefaultProvider() {
        return defaultProvider;
    }

    public void setDefaultProvider(String defaultProvider) {
        this.defaultProvider = defaultProvider == null ? "" : defaultProvider.trim();
    }

    public int getMaxTextLength() {
        return maxTextLength;
    }

    public void setMaxTextLength(int maxTextLength) {
        this.maxTextLength = maxTextLength;
    }

    public int getConnectTimeoutMs() {
        return connectTimeoutMs;
    }

    public void setConnectTimeoutMs(int connectTimeoutMs) {
        this.connectTimeoutMs = connectTimeoutMs;
    }

    public int getReadTimeoutMs() {
        return readTimeoutMs;
    }

    public void setReadTimeoutMs(int readTimeoutMs) {
        this.readTimeoutMs = readTimeoutMs;
    }

    public int getRateLimitPerMinute() {
        return rateLimitPerMinute;
    }

    public void setRateLimitPerMinute(int rateLimitPerMinute) {
        this.rateLimitPerMinute = rateLimitPerMinute;
    }

    public long getDailyCharBudget() {
        return dailyCharBudget;
    }

    public void setDailyCharBudget(long dailyCharBudget) {
        this.dailyCharBudget = dailyCharBudget;
    }

    public Baidu getBaidu() {
        return baidu;
    }

    public Deepl getDeepl() {
        return deepl;
    }

    /** 百度翻译开放平台（通用文本翻译）。 */
    public static class Baidu {

        /** 百度翻译开放平台 APP ID。 */
        private String appId = "";

        /** 百度翻译开放平台密钥。 */
        private String appSecret = "";

        private String endpoint = "https://fanyi-api.baidu.com/api/trans/vip/translate";

        public String getAppId() {
            return appId;
        }

        public void setAppId(String appId) {
            this.appId = appId == null ? "" : appId.trim();
        }

        public String getAppSecret() {
            return appSecret;
        }

        public void setAppSecret(String appSecret) {
            this.appSecret = appSecret == null ? "" : appSecret.trim();
        }

        public String getEndpoint() {
            return endpoint;
        }

        public void setEndpoint(String endpoint) {
            this.endpoint = endpoint == null ? "" : endpoint.trim();
        }

        public boolean isConfigured() {
            return !appId.isEmpty() && !appSecret.isEmpty() && !endpoint.isEmpty();
        }
    }

    /** DeepL API（Free / Pro 均可）。 */
    public static class Deepl {

        /** DeepL Auth Key，Free 版密钥以 {@code :fx} 结尾。 */
        private String authKey = "";

        /** 留空时自动按密钥后缀选择 api-free.deepl.com 或 api.deepl.com。 */
        private String endpoint = "";

        public String getAuthKey() {
            return authKey;
        }

        public void setAuthKey(String authKey) {
            this.authKey = authKey == null ? "" : authKey.trim();
        }

        public String getEndpoint() {
            return endpoint;
        }

        public void setEndpoint(String endpoint) {
            this.endpoint = endpoint == null ? "" : endpoint.trim();
        }

        public boolean isConfigured() {
            return !authKey.isEmpty();
        }
    }
}
