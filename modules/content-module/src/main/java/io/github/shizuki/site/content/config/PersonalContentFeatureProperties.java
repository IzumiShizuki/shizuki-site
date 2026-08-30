package io.github.shizuki.site.content.config;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 相册与生活动态的分阶段发布开关。
 */
@Component
@ConfigurationProperties(prefix = "shizuki.site.personal-content")
public class PersonalContentFeatureProperties implements InitializingBean {

    private boolean enabled = false;
    private boolean publicApiEnabled = false;
    private boolean studioEnabled = false;
    private int defaultPageSize = 20;
    private int maxPageSize = 50;

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public boolean isPublicApiEnabled() {
        return publicApiEnabled;
    }

    public void setPublicApiEnabled(boolean publicApiEnabled) {
        this.publicApiEnabled = publicApiEnabled;
    }

    public boolean isStudioEnabled() {
        return studioEnabled;
    }

    public void setStudioEnabled(boolean studioEnabled) {
        this.studioEnabled = studioEnabled;
    }

    public int getDefaultPageSize() {
        return defaultPageSize;
    }

    public void setDefaultPageSize(int defaultPageSize) {
        this.defaultPageSize = defaultPageSize;
    }

    public int getMaxPageSize() {
        return maxPageSize;
    }

    public void setMaxPageSize(int maxPageSize) {
        this.maxPageSize = maxPageSize;
    }

    public boolean isPublicApiAvailable() {
        return enabled && publicApiEnabled;
    }

    public boolean isStudioAvailable() {
        return enabled && studioEnabled;
    }

    @Override
    public void afterPropertiesSet() {
        if (!enabled && (publicApiEnabled || studioEnabled)) {
            throw new IllegalStateException(
                "shizuki.site.personal-content.enabled must be true before child surfaces are enabled"
            );
        }
        if (defaultPageSize < 1 || maxPageSize < 1 || maxPageSize > 100 || defaultPageSize > maxPageSize) {
            throw new IllegalStateException(
                "personal content page sizes must satisfy 1 <= default-page-size <= max-page-size <= 100"
            );
        }
    }
}
