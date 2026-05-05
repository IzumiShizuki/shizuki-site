package io.github.shizuki.site.content.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.github.shizuki.common.core.model.BaseEntity;
import java.time.LocalDateTime;

@TableName("CTN_NOTION_SYNC_JOB")
public class NotionSyncJobEntity extends BaseEntity {

    @TableField("trigger_type")
    private String triggerType;

    @TableField("direction_code")
    private String directionCode;

    @TableField("target_type_code")
    private String targetTypeCode;

    @TableField("post_id")
    private Long postId;

    @TableField("owner_user_id")
    private Long ownerUserId;

    @TableField("status_code")
    private String statusCode;

    @TableField("result_count")
    private Integer resultCount;

    @TableField("error_count")
    private Integer errorCount;

    @TableField("skipped_count")
    private Integer skippedCount;

    @TableField("conflict_count")
    private Integer conflictCount;

    @TableField("error_text")
    private String errorText;

    @TableField("started_time")
    private LocalDateTime startedTime;

    @TableField("finished_time")
    private LocalDateTime finishedTime;

    public String getTriggerType() {
        return triggerType;
    }

    public void setTriggerType(String triggerType) {
        this.triggerType = triggerType;
    }

    public String getDirectionCode() {
        return directionCode;
    }

    public void setDirectionCode(String directionCode) {
        this.directionCode = directionCode;
    }

    public String getTargetTypeCode() {
        return targetTypeCode;
    }

    public void setTargetTypeCode(String targetTypeCode) {
        this.targetTypeCode = targetTypeCode;
    }

    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }

    public Long getOwnerUserId() {
        return ownerUserId;
    }

    public void setOwnerUserId(Long ownerUserId) {
        this.ownerUserId = ownerUserId;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public Integer getResultCount() {
        return resultCount;
    }

    public void setResultCount(Integer resultCount) {
        this.resultCount = resultCount;
    }

    public Integer getErrorCount() {
        return errorCount;
    }

    public void setErrorCount(Integer errorCount) {
        this.errorCount = errorCount;
    }

    public Integer getSkippedCount() {
        return skippedCount;
    }

    public void setSkippedCount(Integer skippedCount) {
        this.skippedCount = skippedCount;
    }

    public Integer getConflictCount() {
        return conflictCount;
    }

    public void setConflictCount(Integer conflictCount) {
        this.conflictCount = conflictCount;
    }

    public String getErrorText() {
        return errorText;
    }

    public void setErrorText(String errorText) {
        this.errorText = errorText;
    }

    public LocalDateTime getStartedTime() {
        return startedTime;
    }

    public void setStartedTime(LocalDateTime startedTime) {
        this.startedTime = startedTime;
    }

    public LocalDateTime getFinishedTime() {
        return finishedTime;
    }

    public void setFinishedTime(LocalDateTime finishedTime) {
        this.finishedTime = finishedTime;
    }
}
