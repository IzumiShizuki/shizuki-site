package io.github.shizuki.site.ai.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import java.util.List;

@Schema(description = "新增或更新世界书条目请求")
public class UpsertWorldbookEntryRequest {

    @Size(max = 12)
    @Schema(description = "触发关键词列表")
    private List<@NotBlank @Size(max = 64) String> keywords;

    @NotBlank
    @Size(max = 4000)
    @Schema(description = "条目内容", example = "图书馆一层主要收录通识资料。")
    private String content;

    @Schema(description = "优先级", example = "10")
    private Integer priorityNum;

    @Schema(description = "是否启用", example = "true")
    private Boolean enabled;

    public List<String> getKeywords() {
        return keywords;
    }

    public void setKeywords(List<String> keywords) {
        this.keywords = keywords;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getPriorityNum() {
        return priorityNum;
    }

    public void setPriorityNum(Integer priorityNum) {
        this.priorityNum = priorityNum;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
}
