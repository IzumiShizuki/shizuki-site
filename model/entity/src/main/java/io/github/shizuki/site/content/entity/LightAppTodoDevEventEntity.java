package io.github.shizuki.site.content.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;

@TableName("CTN_LA_TODO_DEV_EVENT")
public class LightAppTodoDevEventEntity {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("todo_id")
    private Long todoId;

    @TableField("request_id")
    private String requestId;

    @TableField("request_hash")
    private String requestHash;

    @TableField("event_type")
    private String eventType;

    @TableField("stage_code")
    private String stageCode;

    @TableField("status_code")
    private String statusCode;

    @TableField("source_code")
    private String source;

    @TableField("summary_text")
    private String summary;

    @TableField("artifacts_json")
    private String artifactsJson;

    @TableField("resulting_version_num")
    private Integer resultingVersion;

    @TableField("create_time")
    private LocalDateTime createdAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTodoId() {
        return todoId;
    }

    public void setTodoId(Long todoId) {
        this.todoId = todoId;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getRequestHash() {
        return requestHash;
    }

    public void setRequestHash(String requestHash) {
        this.requestHash = requestHash;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getStageCode() {
        return stageCode;
    }

    public void setStageCode(String stageCode) {
        this.stageCode = stageCode;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getArtifactsJson() {
        return artifactsJson;
    }

    public void setArtifactsJson(String artifactsJson) {
        this.artifactsJson = artifactsJson;
    }

    public Integer getResultingVersion() {
        return resultingVersion;
    }

    public void setResultingVersion(Integer resultingVersion) {
        this.resultingVersion = resultingVersion;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
