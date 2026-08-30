package io.github.shizuki.site.media.config;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 照片回收保留策略。首期明确禁止自动物理清理。
 */
@Component
@ConfigurationProperties(prefix = "shizuki.media.photo-retention")
public class PhotoRetentionProperties implements InitializingBean {

    private int retentionDays = 30;
    private boolean automaticCleanupEnabled = false;

    public int getRetentionDays() {
        return retentionDays;
    }

    public void setRetentionDays(int retentionDays) {
        this.retentionDays = retentionDays;
    }

    public boolean isAutomaticCleanupEnabled() {
        return automaticCleanupEnabled;
    }

    public void setAutomaticCleanupEnabled(boolean automaticCleanupEnabled) {
        this.automaticCleanupEnabled = automaticCleanupEnabled;
    }

    @Override
    public void afterPropertiesSet() {
        if (retentionDays < 1 || retentionDays > 3650) {
            throw new IllegalStateException("photo retention-days must be between 1 and 3650");
        }
        if (automaticCleanupEnabled) {
            throw new IllegalStateException("automatic photo cleanup is not available in the first release");
        }
    }
}
