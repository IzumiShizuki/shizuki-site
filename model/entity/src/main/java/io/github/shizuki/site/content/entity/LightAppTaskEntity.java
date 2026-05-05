package io.github.shizuki.site.content.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.github.shizuki.common.core.model.BaseEntity;
import java.time.LocalDateTime;

@TableName("CTN_LA_TASK")
public class LightAppTaskEntity extends BaseEntity {

    @TableField("user_id")
    private Long userId;

    @TableField("project_id")
    private Long projectId;

    @TableField("recurring_rule_id")
    private Long recurringRuleId;

    @TableField("column_code")
    private String columnCode;

    @TableField("title_text")
    private String title;

    @TableField("detail_text")
    private String detail;

    @TableField("due_datetime")
    private LocalDateTime dueAt;

    @TableField("show_on_calendar_flag")
    private Boolean showOnCalendar;

    @TableField("time_precision_code")
    private String timePrecisionCode;

    @TableField("timing_mode_code")
    private String timingModeCode;

    @TableField("range_start_datetime")
    private LocalDateTime rangeStartAt;

    @TableField("reminder_enabled_flag")
    private Boolean reminderEnabled;

    @TableField("start_remind_value")
    private Integer startRemindValue;

    @TableField("start_remind_unit_code")
    private String startRemindUnitCode;

    @TableField("deadline_remind_value")
    private Integer deadlineRemindValue;

    @TableField("deadline_remind_unit_code")
    private String deadlineRemindUnitCode;

    @TableField("recurring_instance_datetime")
    private LocalDateTime recurringInstanceAt;

    @TableField("sort_num")
    private Integer sortNum;

    @TableField("notion_page_id")
    private String notionPageId;

    @TableField("notion_last_edited_time")
    private LocalDateTime notionLastEditedTime;

    @TableField("sync_status_code")
    private String syncStatusCode;

    @TableField("sync_error_text")
    private String syncErrorText;

    @TableField("last_remote_pull_time")
    private LocalDateTime lastRemotePullTime;

    @TableField("last_remote_push_time")
    private LocalDateTime lastRemotePushTime;

    @TableField("sync_hash")
    private String syncHash;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    public Long getRecurringRuleId() {
        return recurringRuleId;
    }

    public void setRecurringRuleId(Long recurringRuleId) {
        this.recurringRuleId = recurringRuleId;
    }

    public String getColumnCode() {
        return columnCode;
    }

    public void setColumnCode(String columnCode) {
        this.columnCode = columnCode;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public LocalDateTime getDueAt() {
        return dueAt;
    }

    public void setDueAt(LocalDateTime dueAt) {
        this.dueAt = dueAt;
    }

    public Boolean getShowOnCalendar() {
        return showOnCalendar;
    }

    public void setShowOnCalendar(Boolean showOnCalendar) {
        this.showOnCalendar = showOnCalendar;
    }

    public String getTimePrecisionCode() {
        return timePrecisionCode;
    }

    public void setTimePrecisionCode(String timePrecisionCode) {
        this.timePrecisionCode = timePrecisionCode;
    }

    public String getTimingModeCode() {
        return timingModeCode;
    }

    public void setTimingModeCode(String timingModeCode) {
        this.timingModeCode = timingModeCode;
    }

    public LocalDateTime getRangeStartAt() {
        return rangeStartAt;
    }

    public void setRangeStartAt(LocalDateTime rangeStartAt) {
        this.rangeStartAt = rangeStartAt;
    }

    public Boolean getReminderEnabled() {
        return reminderEnabled;
    }

    public void setReminderEnabled(Boolean reminderEnabled) {
        this.reminderEnabled = reminderEnabled;
    }

    public Integer getStartRemindValue() {
        return startRemindValue;
    }

    public void setStartRemindValue(Integer startRemindValue) {
        this.startRemindValue = startRemindValue;
    }

    public String getStartRemindUnitCode() {
        return startRemindUnitCode;
    }

    public void setStartRemindUnitCode(String startRemindUnitCode) {
        this.startRemindUnitCode = startRemindUnitCode;
    }

    public Integer getDeadlineRemindValue() {
        return deadlineRemindValue;
    }

    public void setDeadlineRemindValue(Integer deadlineRemindValue) {
        this.deadlineRemindValue = deadlineRemindValue;
    }

    public String getDeadlineRemindUnitCode() {
        return deadlineRemindUnitCode;
    }

    public void setDeadlineRemindUnitCode(String deadlineRemindUnitCode) {
        this.deadlineRemindUnitCode = deadlineRemindUnitCode;
    }

    public LocalDateTime getRecurringInstanceAt() {
        return recurringInstanceAt;
    }

    public void setRecurringInstanceAt(LocalDateTime recurringInstanceAt) {
        this.recurringInstanceAt = recurringInstanceAt;
    }

    public Integer getSortNum() {
        return sortNum;
    }

    public void setSortNum(Integer sortNum) {
        this.sortNum = sortNum;
    }

    public String getNotionPageId() {
        return notionPageId;
    }

    public void setNotionPageId(String notionPageId) {
        this.notionPageId = notionPageId;
    }

    public LocalDateTime getNotionLastEditedTime() {
        return notionLastEditedTime;
    }

    public void setNotionLastEditedTime(LocalDateTime notionLastEditedTime) {
        this.notionLastEditedTime = notionLastEditedTime;
    }

    public String getSyncStatusCode() {
        return syncStatusCode;
    }

    public void setSyncStatusCode(String syncStatusCode) {
        this.syncStatusCode = syncStatusCode;
    }

    public String getSyncErrorText() {
        return syncErrorText;
    }

    public void setSyncErrorText(String syncErrorText) {
        this.syncErrorText = syncErrorText;
    }

    public LocalDateTime getLastRemotePullTime() {
        return lastRemotePullTime;
    }

    public void setLastRemotePullTime(LocalDateTime lastRemotePullTime) {
        this.lastRemotePullTime = lastRemotePullTime;
    }

    public LocalDateTime getLastRemotePushTime() {
        return lastRemotePushTime;
    }

    public void setLastRemotePushTime(LocalDateTime lastRemotePushTime) {
        this.lastRemotePushTime = lastRemotePushTime;
    }

    public String getSyncHash() {
        return syncHash;
    }

    public void setSyncHash(String syncHash) {
        this.syncHash = syncHash;
    }
}
