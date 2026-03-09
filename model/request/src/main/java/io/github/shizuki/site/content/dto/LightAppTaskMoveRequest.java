package io.github.shizuki.site.content.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Schema(description = "轻应用任务移动请求")
public class LightAppTaskMoveRequest {

    @NotNull
    @Schema(description = "任务ID")
    private Long taskId;

    @NotBlank
    @Schema(description = "目标列编码")
    private String columnCode;

    @Schema(description = "目标排序值")
    private Integer sortNum;

    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public String getColumnCode() {
        return columnCode;
    }

    public void setColumnCode(String columnCode) {
        this.columnCode = columnCode;
    }

    public Integer getSortNum() {
        return sortNum;
    }

    public void setSortNum(Integer sortNum) {
        this.sortNum = sortNum;
    }
}
