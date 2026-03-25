package io.github.shizuki.site.ai.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.github.shizuki.common.core.model.BaseEntity;

@TableName("AI_WORLDBOOK_ENTRY")
public class AiWorldbookEntryEntity extends BaseEntity {

    @TableField("worldbook_id")
    private Long worldbookId;

    @TableField("keyword_json")
    private String keywordJson;

    @TableField("content_text")
    private String content;

    @TableField("priority_num")
    private Integer priorityNum;

    @TableField("enabled_flag")
    private Integer enabled;

    public Long getWorldbookId() {
        return worldbookId;
    }

    public void setWorldbookId(Long worldbookId) {
        this.worldbookId = worldbookId;
    }

    public String getKeywordJson() {
        return keywordJson;
    }

    public void setKeywordJson(String keywordJson) {
        this.keywordJson = keywordJson;
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

    public Integer getEnabled() {
        return enabled;
    }

    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }
}
