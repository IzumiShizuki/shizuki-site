package io.github.shizuki.site.content.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import java.time.LocalDateTime;

@Schema(description = "轻应用待办创建/更新请求")
public class LightAppTodoUpsertRequest {

    @Schema(description = "关联项目ID")
    private Long projectId;

    @NotBlank
    @Size(max = 200)
    @Schema(description = "待办标题", example = "完成单词打卡")
    private String title;

    @Size(max = 2000)
    @Schema(description = "待办详情")
    private String detail;

    @Schema(description = "优先级 LOW/MEDIUM/HIGH", example = "MEDIUM")
    private String priority;

    @Schema(description = "完成标记")
    private Boolean done;

    @Schema(description = "截止时间")
    private LocalDateTime dueAt;

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

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public Boolean getDone() {
        return done;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }

    public LocalDateTime getDueAt() {
        return dueAt;
    }

    public void setDueAt(LocalDateTime dueAt) {
        this.dueAt = dueAt;
    }

    public Integer getSortNum() {
        return sortNum;
    }

    public void setSortNum(Integer sortNum) {
        this.sortNum = sortNum;
    }
}
