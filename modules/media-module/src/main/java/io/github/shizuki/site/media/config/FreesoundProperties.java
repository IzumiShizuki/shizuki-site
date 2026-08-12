package io.github.shizuki.site.media.config;

import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Freesound 环境音库配置。
 */
@Component
@ConfigurationProperties(prefix = "shizuki.music.freesound")
public class FreesoundProperties {

    /**
     * Freesound API Token，留空表示未启用在线音源库。
     */
    private String apiKey = "";

    private String searchUrl = "https://freesound.org/apiv2/search/";

    /**
     * 单个音频详情接口。导入时由服务端重新读取元数据，前端不能提交任意下载地址。
     */
    private String soundsUrl = "https://freesound.org/apiv2/sounds/";

    /**
     * 单个在线环境音预览允许下载的最大体积。默认比通用上传上限更保守。
     */
    private long maxImportBytes = 20L * 1024L * 1024L;

    /**
     * 允许服务端抓取预览的精确主机名。默认仅信任 Freesound 官方站点和 CDN。
     */
    private Set<String> previewHosts = new LinkedHashSet<>(Set.of("freesound.org", "cdn.freesound.org"));

    private long connectTimeoutMs = 1200L;

    private long readTimeoutMs = 4000L;

    /**
     * 音频预览下载读取超时。下载比元数据查询更耗时，因此单独配置。
     */
    private long importReadTimeoutMs = 20000L;

    private int retryCount = 1;

    private long retryBackoffMs = 120L;

    private long retryMaxBackoffMs = 800L;

    /**
     * 单页返回条数上限。
     */
    private int maxPageSize = 48;

    /**
     * 只返回时长在该区间内的音频，避免搜到一秒钟的碎音效。
     */
    private int minDurationSeconds = 15;

    private int maxDurationSeconds = 600;

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey == null ? "" : apiKey.trim();
    }

    public String getSearchUrl() {
        return searchUrl;
    }

    public void setSearchUrl(String searchUrl) {
        this.searchUrl = searchUrl == null ? "" : searchUrl.trim();
    }

    public String getSoundsUrl() {
        return soundsUrl;
    }

    public void setSoundsUrl(String soundsUrl) {
        this.soundsUrl = soundsUrl == null ? "" : soundsUrl.trim();
    }

    public long getMaxImportBytes() {
        return maxImportBytes;
    }

    public void setMaxImportBytes(long maxImportBytes) {
        this.maxImportBytes = Math.max(1024L, maxImportBytes);
    }

    public Set<String> getPreviewHosts() {
        return Set.copyOf(previewHosts);
    }

    public void setPreviewHosts(Set<String> previewHosts) {
        LinkedHashSet<String> normalized = new LinkedHashSet<>();
        if (previewHosts != null) {
            previewHosts.stream()
                .filter(value -> value != null && !value.isBlank())
                .map(value -> value.trim().toLowerCase(Locale.ROOT))
                .forEach(normalized::add);
        }
        this.previewHosts = normalized;
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

    public long getImportReadTimeoutMs() {
        return importReadTimeoutMs;
    }

    public void setImportReadTimeoutMs(long importReadTimeoutMs) {
        this.importReadTimeoutMs = Math.max(1000L, importReadTimeoutMs);
    }

    public int getRetryCount() {
        return retryCount;
    }

    public void setRetryCount(int retryCount) {
        this.retryCount = Math.max(0, Math.min(5, retryCount));
    }

    public long getRetryBackoffMs() {
        return retryBackoffMs;
    }

    public void setRetryBackoffMs(long retryBackoffMs) {
        this.retryBackoffMs = Math.max(1L, retryBackoffMs);
    }

    public long getRetryMaxBackoffMs() {
        return retryMaxBackoffMs;
    }

    public void setRetryMaxBackoffMs(long retryMaxBackoffMs) {
        this.retryMaxBackoffMs = Math.max(1L, retryMaxBackoffMs);
    }

    public int getMaxPageSize() {
        return maxPageSize;
    }

    public void setMaxPageSize(int maxPageSize) {
        this.maxPageSize = Math.max(1, Math.min(150, maxPageSize));
    }

    public int getMinDurationSeconds() {
        return minDurationSeconds;
    }

    public void setMinDurationSeconds(int minDurationSeconds) {
        this.minDurationSeconds = Math.max(0, minDurationSeconds);
    }

    public int getMaxDurationSeconds() {
        return maxDurationSeconds;
    }

    public void setMaxDurationSeconds(int maxDurationSeconds) {
        this.maxDurationSeconds = Math.max(1, maxDurationSeconds);
    }

    /**
     * 是否已配置可用的 API Token。
     */
    public boolean isEnabled() {
        return !apiKey.isBlank() && !searchUrl.isBlank() && !soundsUrl.isBlank();
    }
}
