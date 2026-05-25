package io.github.shizuki.site.media.config;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

/**
 * Meting sidecar 音乐接口配置。
 */
@Component
@ConfigurationProperties(prefix = "shizuki.music.meting")
public class MetingMusicProperties {

    private String baseUrl = "http://meting-api";
    private String defaultApiKey = "meting-system";
    private String defaultQuality = "128k";
    private List<String> defaultPlatformOrder = new ArrayList<>(List.of("netease", "kuwo", "qq"));
    private int defaultBitrateKbps = 128;
    private long connectTimeoutMs = 1200L;
    private long readTimeoutMs = 5000L;
    private Map<String, String> defaultPlaylistIds = new LinkedHashMap<>();

    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl == null ? "" : trimTrailingSlash(baseUrl.trim());
    }

    public List<String> getDefaultPlatformOrder() {
        return defaultPlatformOrder;
    }

    public void setDefaultPlatformOrder(List<String> defaultPlatformOrder) {
        if (defaultPlatformOrder == null || defaultPlatformOrder.isEmpty()) {
            this.defaultPlatformOrder = new ArrayList<>(List.of("netease", "kuwo", "qq"));
            return;
        }
        List<String> result = new ArrayList<>();
        for (String item : defaultPlatformOrder) {
            String normalized = normalizeProviderCode(item);
            if (!StringUtils.hasText(normalized) || result.contains(normalized)) {
                continue;
            }
            result.add(normalized);
        }
        this.defaultPlatformOrder = result.isEmpty() ? new ArrayList<>(List.of("netease", "kuwo", "qq")) : result;
    }

    public int getDefaultBitrateKbps() {
        return defaultBitrateKbps;
    }

    public void setDefaultBitrateKbps(int defaultBitrateKbps) {
        this.defaultBitrateKbps = Math.max(64, Math.min(320, defaultBitrateKbps));
    }

    public String getDefaultApiKey() {
        return defaultApiKey;
    }

    public void setDefaultApiKey(String defaultApiKey) {
        this.defaultApiKey = defaultApiKey == null ? "meting-system" : defaultApiKey.trim();
    }

    public String getDefaultQuality() {
        return defaultQuality;
    }

    public void setDefaultQuality(String defaultQuality) {
        this.defaultQuality = defaultQuality == null ? "128k" : defaultQuality.trim();
    }

    public long getConnectTimeoutMs() {
        return connectTimeoutMs;
    }

    public void setConnectTimeoutMs(long connectTimeoutMs) {
        this.connectTimeoutMs = Math.max(200L, connectTimeoutMs);
    }

    public long getReadTimeoutMs() {
        return readTimeoutMs;
    }

    public void setReadTimeoutMs(long readTimeoutMs) {
        this.readTimeoutMs = Math.max(500L, readTimeoutMs);
    }

    public Map<String, String> getDefaultPlaylistIds() {
        return defaultPlaylistIds;
    }

    public void setDefaultPlaylistIds(Map<String, String> defaultPlaylistIds) {
        this.defaultPlaylistIds = new LinkedHashMap<>();
        if (defaultPlaylistIds == null || defaultPlaylistIds.isEmpty()) {
            return;
        }
        for (Map.Entry<String, String> entry : defaultPlaylistIds.entrySet()) {
            String provider = normalizeProviderCode(entry.getKey());
            String playlistId = entry.getValue() == null ? "" : entry.getValue().trim();
            if (!StringUtils.hasText(provider) || !StringUtils.hasText(playlistId)) {
                continue;
            }
            this.defaultPlaylistIds.put(provider, playlistId);
        }
    }

    public String findDefaultPlaylistId(String provider) {
        String normalized = normalizeProviderCode(provider);
        if (!StringUtils.hasText(normalized)) {
            return "";
        }
        return defaultPlaylistIds.getOrDefault(normalized, "");
    }

    private String normalizeProviderCode(String provider) {
        String normalized = provider == null ? "" : provider.trim().toLowerCase(Locale.ROOT);
        if ("tencent".equals(normalized) || "qqmusic".equals(normalized)) {
            return "qq";
        }
        if ("netease".equals(normalized) || "kuwo".equals(normalized) || "qq".equals(normalized)) {
            return normalized;
        }
        return "";
    }

    private String trimTrailingSlash(String value) {
        String result = value;
        while (result.endsWith("/")) {
            result = result.substring(0, result.length() - 1);
        }
        return result;
    }
}
