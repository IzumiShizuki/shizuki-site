package io.github.shizuki.site.content.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.github.shizuki.common.core.model.BaseEntity;
import io.github.shizuki.site.common.mybatis.SmallIntBooleanTypeHandler;
import java.time.LocalDateTime;

@TableName(value = "CTN_LA_BAL_SOURCE_ACCOUNT", autoResultMap = true)
public class LightAppBalanceSourceAccountEntity extends BaseEntity {

    @TableField("user_id")
    private Long userId;

    @TableField("provider_code")
    private String providerCode;

    @TableField("status_code")
    private String statusCode;

    @TableField("target_account_id")
    private Long targetAccountId;

    @TableField(value = "nightly_enabled_flag", typeHandler = SmallIntBooleanTypeHandler.class)
    private Boolean nightlyEnabled;

    @TableField("last_verified_datetime")
    private LocalDateTime lastVerifiedAt;

    @TableField("last_synced_datetime")
    private LocalDateTime lastSyncedAt;

    @TableField("last_sync_status_code")
    private String lastSyncStatusCode;

    @TableField("last_sync_error_text")
    private String lastSyncErrorText;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getProviderCode() {
        return providerCode;
    }

    public void setProviderCode(String providerCode) {
        this.providerCode = providerCode;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public Long getTargetAccountId() {
        return targetAccountId;
    }

    public void setTargetAccountId(Long targetAccountId) {
        this.targetAccountId = targetAccountId;
    }

    public Boolean getNightlyEnabled() {
        return nightlyEnabled;
    }

    public void setNightlyEnabled(Boolean nightlyEnabled) {
        this.nightlyEnabled = nightlyEnabled;
    }

    public LocalDateTime getLastVerifiedAt() {
        return lastVerifiedAt;
    }

    public void setLastVerifiedAt(LocalDateTime lastVerifiedAt) {
        this.lastVerifiedAt = lastVerifiedAt;
    }

    public LocalDateTime getLastSyncedAt() {
        return lastSyncedAt;
    }

    public void setLastSyncedAt(LocalDateTime lastSyncedAt) {
        this.lastSyncedAt = lastSyncedAt;
    }

    public String getLastSyncStatusCode() {
        return lastSyncStatusCode;
    }

    public void setLastSyncStatusCode(String lastSyncStatusCode) {
        this.lastSyncStatusCode = lastSyncStatusCode;
    }

    public String getLastSyncErrorText() {
        return lastSyncErrorText;
    }

    public void setLastSyncErrorText(String lastSyncErrorText) {
        this.lastSyncErrorText = lastSyncErrorText;
    }
}
