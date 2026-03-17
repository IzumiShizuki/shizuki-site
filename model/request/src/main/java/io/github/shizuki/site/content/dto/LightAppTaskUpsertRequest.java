package io.github.shizuki.site.content.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import java.time.LocalDateTime;

@Schema(description = "轻应用任务创建/更新请求")
public class LightAppTaskUpsertRequest {

    @Schema(description = "关联项目ID")
    private Long projectId;

    @NotBlank
    @Size(max = 200)
    @Schema(description = "任务标题")
    private String title;

    @Size(max = 2000)
    @Schema(description = "任务详情")
    private String detail;

    @Schema(description = "列编码", example = "todo")
    private String columnCode;

    @Schema(description = "截止时间")
    private LocalDateTime dueAt;

    @Schema(description = "是否显示在日历")
    private Boolean showOnCalendar;

    @Schema(description = "时间精度 DAY/MINUTE", example = "MINUTE")
    private String timePrecision;

    @Schema(description = "时间模式 DEADLINE/RANGE", example = "DEADLINE")
    private String timingMode;

    @Schema(description = "范围开始时间")
    private LocalDateTime rangeStartAt;

    @Schema(description = "是否启用提醒")
    private Boolean reminderEnabled;

    @Schema(description = "开始提醒提前量")
    private Integer startRemindValue;

    @Schema(description = "开始提醒单位 MINUTE/DAY")
    private String startRemindUnit;

    @Schema(description = "截止提醒提前量")
    private Integer deadlineRemindValue;

    @Schema(description = "截止提醒单位 MINUTE/DAY")
    private String deadlineRemindUnit;

    @Schema(description = "排序值")
    private Integer sortNum;

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
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

    public String getColumnCode() {
        return columnCode;
    }

    public void setColumnCode(String columnCode) {
        this.columnCode = columnCode;
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

    public String getTimePrecision() {
        return timePrecision;
    }

    public void setTimePrecision(String timePrecision) {
        this.timePrecision = timePrecision;
    }

    public String getTimingMode() {
        return timingMode;
    }

    public void setTimingMode(String timingMode) {
        this.timingMode = timingMode;
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

    public String getStartRemindUnit() {
        return startRemindUnit;
    }

    public void setStartRemindUnit(String startRemindUnit) {
        this.startRemindUnit = startRemindUnit;
    }

    public Integer getDeadlineRemindValue() {
        return deadlineRemindValue;
    }

    public void setDeadlineRemindValue(Integer deadlineRemindValue) {
        this.deadlineRemindValue = deadlineRemindValue;
    }

    public String getDeadlineRemindUnit() {
        return deadlineRemindUnit;
    }

    public void setDeadlineRemindUnit(String deadlineRemindUnit) {
        this.deadlineRemindUnit = deadlineRemindUnit;
    }

    public Integer getSortNum() {
        return sortNum;
    }

    public void setSortNum(Integer sortNum) {
        this.sortNum = sortNum;
    }
}
