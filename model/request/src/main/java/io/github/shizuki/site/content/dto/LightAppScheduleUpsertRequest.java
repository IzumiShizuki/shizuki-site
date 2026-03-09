package io.github.shizuki.site.content.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.time.LocalDateTime;

@Schema(description = "轻应用日程创建/更新请求")
public class LightAppScheduleUpsertRequest {

    @Schema(description = "关联项目ID")
    private Long projectId;

    @NotBlank
    @Size(max = 200)
    @Schema(description = "日程标题")
    private String title;

    @Size(max = 2000)
    @Schema(description = "日程详情")
    private String detail;

    @NotNull
    @Schema(description = "开始时间")
    private LocalDateTime startAt;

    @Schema(description = "结束时间")
    private LocalDateTime endAt;

    @Schema(description = "是否全天")
    private Boolean allDay;

    @Size(max = 255)
    @Schema(description = "地点")
    private String location;

    @Schema(description = "状态 ACTIVE/CANCELLED")
    private String status;

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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getSortNum() {
        return sortNum;
    }

    public void setSortNum(Integer sortNum) {
        this.sortNum = sortNum;
    }
}
