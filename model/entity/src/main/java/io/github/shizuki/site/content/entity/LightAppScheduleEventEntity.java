package io.github.shizuki.site.content.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.github.shizuki.common.core.model.BaseEntity;
import java.time.LocalDateTime;

@TableName("CTN_LA_SCHEDULE_EVENT")
public class LightAppScheduleEventEntity extends BaseEntity {

    @TableField("user_id")
    private Long userId;

    @TableField("project_id")
    private Long projectId;

    @TableField("recurring_rule_id")
    private Long recurringRuleId;

    @TableField("title_text")
    private String title;

    @TableField("detail_text")
    private String detail;

    @TableField("start_datetime")
    private LocalDateTime startAt;

    @TableField("end_datetime")
    private LocalDateTime endAt;

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

    @TableField("all_day_flag")
    private Boolean allDay;

    @TableField("location_text")
    private String location;

    @TableField("status_code")
    private String statusCode;

    @TableField("sort_num")
    private Integer sortNum;

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

    public LocalDateTime getStartAt() {
        return startAt;
    }

    public void setStartAt(LocalDateTime startAt) {
        this.startAt = startAt;
    }

    public LocalDateTime getEndAt() {
        return endAt;
    }

    public void setEndAt(LocalDateTime endAt) {
        this.endAt = endAt;
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

    public Boolean getAllDay() {
        return allDay;
    }

    public void setAllDay(Boolean allDay) {
        this.allDay = allDay;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public Integer getSortNum() {
        return sortNum;
    }

    public void setSortNum(Integer sortNum) {
        this.sortNum = sortNum;
    }
}
