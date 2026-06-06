package io.github.shizuki.site.content.support;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
@ConfigurationProperties(prefix = "shizuki.blog.video")
public class PostVideoProperties {

    private static final List<String> DEFAULT_ALLOWED_DOMAINS = List.of(
        "youtube.com",
        "youtu.be",
        "bilibili.com",
        "b23.tv"
    );

    private String converterBaseUrl = "";
    private long connectTimeoutMs = 2_000L;
    private long readTimeoutMs = 900_000L;
    private int maxKeyframes = 12;
    private boolean allowLocalFiles = false;
    private List<String> allowedDomains = new ArrayList<>(DEFAULT_ALLOWED_DOMAINS);

    public String getConverterBaseUrl() {
        return converterBaseUrl;
    }

    public void setConverterBaseUrl(String converterBaseUrl) {
        this.converterBaseUrl = normalizeBaseUrl(converterBaseUrl);
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
        this.readTimeoutMs = Math.max(1_000L, readTimeoutMs);
    }

    public int getMaxKeyframes() {
        return maxKeyframes;
    }

    public void setMaxKeyframes(int maxKeyframes) {
        this.maxKeyframes = Math.max(1, Math.min(maxKeyframes, 48));
    }

    public boolean isAllowLocalFiles() {
        return allowLocalFiles;
    }

    public void setAllowLocalFiles(boolean allowLocalFiles) {
        this.allowLocalFiles = allowLocalFiles;
    }

    public List<String> getAllowedDomains() {
        return List.copyOf(allowedDomains);
    }

    public void setAllowedDomains(List<String> allowedDomains) {
        LinkedHashSet<String> normalized = new LinkedHashSet<>();
        if (allowedDomains != null) {
            for (String item : allowedDomains) {
                String domain = normalizeDomain(item);
                if (StringUtils.hasText(domain)) {
                    normalized.add(domain);
                }
            }
        }
        this.allowedDomains = normalized.isEmpty()
            ? new ArrayList<>(DEFAULT_ALLOWED_DOMAINS)
            : new ArrayList<>(normalized);
    }

    private String normalizeBaseUrl(String raw) {
        if (!StringUtils.hasText(raw)) {
            return "";
        }
        String normalized = raw.trim();
        while (normalized.endsWith("/")) {
            normalized = normalized.substring(0, normalized.length() - 1);
        }
        return normalized;
    }

    private String normalizeDomain(String raw) {
        String normalized = raw == null ? "" : raw.trim().toLowerCase();
        while (normalized.startsWith(".")) {
            normalized = normalized.substring(1);
        }
        return normalized;
    }
}
