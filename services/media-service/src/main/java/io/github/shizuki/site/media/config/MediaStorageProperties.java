package io.github.shizuki.site.media.config;

import java.util.HashSet;
import java.util.Set;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "shizuki.media.storage")
public class MediaStorageProperties {

    private String privateBucket = "shizuki-private";
    private String publicBucket = "shizuki-public";
    private long signExpireSeconds = 600L;
    private long maxUploadSize = 50 * 1024 * 1024L;
    private Set<String> allowedContentTypes = new HashSet<>();

    public String getPrivateBucket() {
        return privateBucket;
    }

    public void setPrivateBucket(String privateBucket) {
        this.privateBucket = privateBucket;
    }

    public String getPublicBucket() {
        return publicBucket;
    }

    public void setPublicBucket(String publicBucket) {
        this.publicBucket = publicBucket;
    }

    public long getSignExpireSeconds() {
        return signExpireSeconds;
    }

    public void setSignExpireSeconds(long signExpireSeconds) {
        this.signExpireSeconds = signExpireSeconds;
    }

    public long getMaxUploadSize() {
        return maxUploadSize;
    }

    public void setMaxUploadSize(long maxUploadSize) {
        this.maxUploadSize = maxUploadSize;
    }

    public Set<String> getAllowedContentTypes() {
        return allowedContentTypes;
    }

    public void setAllowedContentTypes(Set<String> allowedContentTypes) {
        this.allowedContentTypes = allowedContentTypes;
    }
}
