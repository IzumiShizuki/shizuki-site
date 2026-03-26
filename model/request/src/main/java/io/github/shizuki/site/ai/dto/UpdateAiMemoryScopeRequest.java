package io.github.shizuki.site.ai.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;

@Schema(description = "更新管理员记忆 scope 请求")
public class UpdateAiMemoryScopeRequest {

    @Schema(description = "是否启用该 scope 的记忆注入", example = "true")
    private Boolean enabled;

    @Size(max = 500)
    @Schema(description = "管理员备注", example = "图书馆馆长作用域，保持独立")
    private String note;

    @Schema(description = "是否在响应中附带最新快照", example = "true")
    private Boolean includeSnapshot;

    @Size(max = 240)
    @Schema(description = "用于检索最近记忆快照的查询词", example = "上次在图书馆聊到的偏好")
    private String query;

    @Min(0)
    @Max(20)
    @Schema(description = "附带最近 journal 条数", example = "5")
    private Integer journalLimit;

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Boolean getIncludeSnapshot() {
        return includeSnapshot;
    }

    public void setIncludeSnapshot(Boolean includeSnapshot) {
        this.includeSnapshot = includeSnapshot;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public Integer getJournalLimit() {
        return journalLimit;
    }

    public void setJournalLimit(Integer journalLimit) {
        this.journalLimit = journalLimit;
    }
}
