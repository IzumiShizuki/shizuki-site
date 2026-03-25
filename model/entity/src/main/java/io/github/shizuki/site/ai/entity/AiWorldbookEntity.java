package io.github.shizuki.site.ai.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.github.shizuki.common.core.model.BaseEntity;

@TableName("AI_WORLDBOOK")
public class AiWorldbookEntity extends BaseEntity {

    @TableField("worldbook_code")
    private String worldbookCode;

    @TableField("owner_user_id")
    private Long ownerUserId;

    @TableField("title_text")
    private String title;

    @TableField("visibility_type")
    private String visibilityType;

    @TableField("enabled_flag")
    private Integer enabled;

    public String getWorldbookCode() {
        return worldbookCode;
    }

    public void setWorldbookCode(String worldbookCode) {
        this.worldbookCode = worldbookCode;
    }

    public Long getOwnerUserId() {
        return ownerUserId;
    }

    public void setOwnerUserId(Long ownerUserId) {
        this.ownerUserId = ownerUserId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getVisibilityType() {
        return visibilityType;
    }

    public void setVisibilityType(String visibilityType) {
        this.visibilityType = visibilityType;
    }

    public Integer getEnabled() {
        return enabled;
    }

    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }
}
