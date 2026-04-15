package io.github.shizuki.site.media.config;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

/**
 * ASMR（Kikoeru/asmr.one）接口配置。
 */
@Component
@ConfigurationProperties(prefix = "shizuki.music.asmr")
public class AsmrMusicProperties {

    private static final List<String> DEFAULT_BASE_URLS = List.of(
        "https://api.asmr.one",
        "https://api.asmr-100.com",
        "https://api.asmr-200.com",
        "https://api.asmr-300.com"
    );

    /**
     * 主服务地址（仿 Kikoeru: 默认 asmr-300）。
     */
    private String server = "https://api.asmr-300.com";

    /**
     * 兼容旧配置：单一 base-url。
     */
    private String baseUrl = "https://api.asmr.one";
    /**
     * 备选服务地址列表。
     */
    private List<String> baseUrls = new ArrayList<>(DEFAULT_BASE_URLS);
    private String defaultOrder = "release";
    private String defaultSort = "desc";
    private long connectTimeoutMs = 1000L;
    private long readTimeoutMs = 5000L;

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = normalizeBaseUrl(server);
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = normalizeBaseUrl(baseUrl);
    }

    public List<String> getBaseUrls() {
        return List.copyOf(baseUrls);
    }

    public void setBaseUrls(List<String> baseUrls) {
        List<String> normalized = sanitizeBaseUrlList(baseUrls);
        if (normalized.isEmpty()) {
            this.baseUrls = new ArrayList<>(DEFAULT_BASE_URLS);
            return;
        }
        this.baseUrls = normalized;
    }

    public List<String> defaultBaseUrls() {
        return DEFAULT_BASE_URLS;
    }

    public String getDefaultOrder() {
        return defaultOrder;
    }

    public void setDefaultOrder(String defaultOrder) {
        this.defaultOrder = defaultOrder == null ? "release" : defaultOrder.trim();
    }

    public String getDefaultSort() {
        return defaultSort;
    }

    public void setDefaultSort(String defaultSort) {
        this.defaultSort = defaultSort == null ? "desc" : defaultSort.trim();
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

    private List<String> sanitizeBaseUrlList(List<String> rawUrls) {
        if (rawUrls == null || rawUrls.isEmpty()) {
            return List.of();
        }
        LinkedHashSet<String> unique = new LinkedHashSet<>();
        for (String item : rawUrls) {
            String normalized = normalizeBaseUrl(item);
            if (StringUtils.hasText(normalized)) {
                unique.add(normalized);
            }
        }
        return new ArrayList<>(unique);
    }

    private String normalizeBaseUrl(String baseUrl) {
        if (!StringUtils.hasText(baseUrl)) {
            return "";
        }
        String normalized = baseUrl.trim();
        while (normalized.endsWith("/")) {
            normalized = normalized.substring(0, normalized.length() - 1);
        }
        return normalized;
    }
}
