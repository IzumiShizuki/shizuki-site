package io.github.shizuki.site.content.request;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "轻应用 Task Notion 同步任务创建请求")
public class LightAppTaskNotionSyncJobCreateRequest {

    @Schema(description = "同步方向 PULL/PUSH/BOTH", example = "PULL")
    private String direction;

    @Schema(description = "同步目标 TASK/ALL", example = "ALL")
    private String targetType;

    @Schema(description = "目标任务ID，target_type=TASK 时必填")
    private Long taskId;

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getTargetType() {
        return targetType;
    }

    public void setTargetType(String targetType) {
        this.targetType = targetType;
    }

    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }
}
