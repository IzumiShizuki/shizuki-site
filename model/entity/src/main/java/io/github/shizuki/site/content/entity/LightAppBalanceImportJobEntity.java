package io.github.shizuki.site.content.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.github.shizuki.common.core.model.BaseEntity;
import java.time.LocalDateTime;

@TableName("CTN_LA_BAL_IMPORT_JOB")
public class LightAppBalanceImportJobEntity extends BaseEntity {

    @TableField("user_id")
    private Long userId;

    @TableField("provider_code")
    private String providerCode;

    @TableField("source_account_id")
    private Long sourceAccountId;

    @TableField("target_account_id")
    private Long targetAccountId;

    @TableField("trigger_type")
    private String triggerType;

    @TableField("status_code")
    private String statusCode;

    @TableField("imported_count")
    private Integer importedCount;

    @TableField("duplicate_count")
    private Integer duplicateCount;

    @TableField("skipped_count")
    private Integer skippedCount;

    @TableField("error_text")
    private String errorText;

    @TableField("raw_file_path_text")
    private String rawFilePath;

    @TableField("request_from_datetime")
    private LocalDateTime requestFromAt;

    @TableField("request_to_datetime")
    private LocalDateTime requestToAt;

    @TableField("started_datetime")
    private LocalDateTime startedAt;

    @TableField("finished_datetime")
    private LocalDateTime finishedAt;

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

    public Long getSourceAccountId() {
        return sourceAccountId;
    }

    public void setSourceAccountId(Long sourceAccountId) {
        this.sourceAccountId = sourceAccountId;
    }

    public Long getTargetAccountId() {
        return targetAccountId;
    }

    public void setTargetAccountId(Long targetAccountId) {
        this.targetAccountId = targetAccountId;
    }

    public String getTriggerType() {
        return triggerType;
    }

    public void setTriggerType(String triggerType) {
        this.triggerType = triggerType;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public Integer getImportedCount() {
        return importedCount;
    }

    public void setImportedCount(Integer importedCount) {
        this.importedCount = importedCount;
    }

    public Integer getDuplicateCount() {
        return duplicateCount;
    }

    public void setDuplicateCount(Integer duplicateCount) {
        this.duplicateCount = duplicateCount;
    }

    public Integer getSkippedCount() {
        return skippedCount;
    }

    public void setSkippedCount(Integer skippedCount) {
        this.skippedCount = skippedCount;
    }

    public String getErrorText() {
        return errorText;
    }

    public void setErrorText(String errorText) {
        this.errorText = errorText;
    }

    public String getRawFilePath() {
        return rawFilePath;
    }

    public void setRawFilePath(String rawFilePath) {
        this.rawFilePath = rawFilePath;
    }

    public LocalDateTime getRequestFromAt() {
        return requestFromAt;
    }

    public void setRequestFromAt(LocalDateTime requestFromAt) {
        this.requestFromAt = requestFromAt;
    }

    public LocalDateTime getRequestToAt() {
        return requestToAt;
    }

    public void setRequestToAt(LocalDateTime requestToAt) {
        this.requestToAt = requestToAt;
    }

    public LocalDateTime getStartedAt() {
        return startedAt;
    }

    public void setStartedAt(LocalDateTime startedAt) {
        this.startedAt = startedAt;
    }

    public LocalDateTime getFinishedAt() {
        return finishedAt;
    }

    public void setFinishedAt(LocalDateTime finishedAt) {
        this.finishedAt = finishedAt;
    }
}
