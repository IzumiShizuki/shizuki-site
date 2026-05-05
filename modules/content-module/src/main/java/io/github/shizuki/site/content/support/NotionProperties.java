package io.github.shizuki.site.content.support;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "shizuki.blog.notion")
public class NotionProperties {

    private boolean enabled = false;
    private String token = "";
    private String dataSourceId = "";
    private Long ownerUserId = 1L;
    private String version = "2026-03-11";
    private String apiBaseUrl = "https://api.notion.com/v1";
    private int rateLimitPerSecond = 2;
    private long connectTimeoutMs = 1500L;
    private long readTimeoutMs = 4000L;
    private int retryCount = 2;
    private long retryBackoffMs = 250L;
    private long retryMaxBackoffMs = 2000L;
    private String nightlyCron = "0 0 3 * * *";
    private String timezone = "Asia/Shanghai";
    private final PropertyMapping properties = new PropertyMapping();

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getDataSourceId() {
        return dataSourceId;
    }

    public void setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
    }

    public Long getOwnerUserId() {
        return ownerUserId;
    }

    public void setOwnerUserId(Long ownerUserId) {
        this.ownerUserId = ownerUserId == null || ownerUserId <= 0 ? 1L : ownerUserId;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getApiBaseUrl() {
        return apiBaseUrl;
    }

    public void setApiBaseUrl(String apiBaseUrl) {
        this.apiBaseUrl = apiBaseUrl;
    }

    public int getRateLimitPerSecond() {
        return rateLimitPerSecond;
    }

    public void setRateLimitPerSecond(int rateLimitPerSecond) {
        this.rateLimitPerSecond = Math.max(1, rateLimitPerSecond);
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
        this.retryMaxBackoffMs = Math.max(retryBackoffMs, retryMaxBackoffMs);
    }

    public String getNightlyCron() {
        return nightlyCron;
    }

    public void setNightlyCron(String nightlyCron) {
        this.nightlyCron = nightlyCron;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public PropertyMapping getProperties() {
        return properties;
    }

    public boolean isConfigured() {
        return enabled
            && token != null
            && !token.trim().isEmpty()
            && dataSourceId != null
            && !dataSourceId.trim().isEmpty();
    }

    public static class PropertyMapping {
        private String title = "Name";
        private String summary = "Summary";
        private String category = "Category";
        private String slug = "Slug";
        private String tags = "Tags";
        private String visibility = "Visibility";
        private String status = "Status";
        private String coverImageUrl = "CoverImageUrl";
        private String authorUserId = "AuthorUserId";
        private String publishedAt = "PublishedAt";
        private String allowedGroups = "AllowedGroups";

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getSummary() {
            return summary;
        }

        public void setSummary(String summary) {
            this.summary = summary;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public String getSlug() {
            return slug;
        }

        public void setSlug(String slug) {
            this.slug = slug;
        }

        public String getTags() {
            return tags;
        }

        public void setTags(String tags) {
            this.tags = tags;
        }

        public String getVisibility() {
            return visibility;
        }

        public void setVisibility(String visibility) {
            this.visibility = visibility;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getCoverImageUrl() {
            return coverImageUrl;
        }

        public void setCoverImageUrl(String coverImageUrl) {
            this.coverImageUrl = coverImageUrl;
        }

        public String getAuthorUserId() {
            return authorUserId;
        }

        public void setAuthorUserId(String authorUserId) {
            this.authorUserId = authorUserId;
        }

        public String getPublishedAt() {
            return publishedAt;
        }

        public void setPublishedAt(String publishedAt) {
            this.publishedAt = publishedAt;
        }

        public String getAllowedGroups() {
            return allowedGroups;
        }

        public void setAllowedGroups(String allowedGroups) {
            this.allowedGroups = allowedGroups;
        }
    }
}
