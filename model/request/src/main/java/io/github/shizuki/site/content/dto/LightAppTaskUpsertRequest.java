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

    public Integer getSortNum() {
        return sortNum;
    }

    public void setSortNum(Integer sortNum) {
        this.sortNum = sortNum;
    }
}
