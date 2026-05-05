package io.github.shizuki.site.content.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.github.shizuki.common.core.model.BaseEntity;
import java.time.LocalDateTime;

@TableName("CTN_LA_TASK_NOTION_SYNC_CURSOR")
public class LightAppTaskNotionSyncCursorEntity extends BaseEntity {

    @TableField("sync_scope_code")
    private String syncScopeCode;

    @TableField("data_source_id")
    private String dataSourceId;

    @TableField("cursor_value")
    private String cursorValue;

    @TableField("status_code")
    private String statusCode;

    @TableField("error_text")
    private String errorText;

    @TableField("last_synced_time")
    private LocalDateTime lastSyncedTime;

    public String getSyncScopeCode() {
        return syncScopeCode;
    }

    public void setSyncScopeCode(String syncScopeCode) {
        this.syncScopeCode = syncScopeCode;
    }

    public String getDataSourceId() {
        return dataSourceId;
    }

    public void setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
    }

    public String getCursorValue() {
        return cursorValue;
    }

    public void setCursorValue(String cursorValue) {
        this.cursorValue = cursorValue;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getErrorText() {
        return errorText;
    }

    public void setErrorText(String errorText) {
        this.errorText = errorText;
    }

    public LocalDateTime getLastSyncedTime() {
        return lastSyncedTime;
    }

    public void setLastSyncedTime(LocalDateTime lastSyncedTime) {
        this.lastSyncedTime = lastSyncedTime;
    }
}
