package io.github.shizuki.site.ai.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.github.shizuki.common.core.model.BaseEntity;

@TableName("AI_COMPANION_PROFILE")
public class AiCompanionProfileEntity extends BaseEntity {

    @TableField("owner_user_id")
    private Long ownerUserId;

    @TableField("companion_code")
    private String companionCode;

    @TableField("display_name")
    private String displayName;

    @TableField("persona_json")
    private String personaJson;

    @TableField("avatar_asset_id")
    private Long avatarAssetId;

    @TableField("memory_enabled_flag")
    private Integer memoryEnabled;

    @TableField("bound_worldbook_json")
    private String boundWorldbookJson;

    @TableField("scene_prompt_text")
    private String scenePrompt;

    public Long getOwnerUserId() {
        return ownerUserId;
    }

    public void setOwnerUserId(Long ownerUserId) {
        this.ownerUserId = ownerUserId;
    }

    public String getCompanionCode() {
        return companionCode;
    }

    public void setCompanionCode(String companionCode) {
        this.companionCode = companionCode;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getPersonaJson() {
        return personaJson;
    }

    public void setPersonaJson(String personaJson) {
        this.personaJson = personaJson;
    }

    public Long getAvatarAssetId() {
        return avatarAssetId;
    }

    public void setAvatarAssetId(Long avatarAssetId) {
        this.avatarAssetId = avatarAssetId;
    }

    public Integer getMemoryEnabled() {
        return memoryEnabled;
    }

    public void setMemoryEnabled(Integer memoryEnabled) {
        this.memoryEnabled = memoryEnabled;
    }

    public String getBoundWorldbookJson() {
        return boundWorldbookJson;
    }

    public void setBoundWorldbookJson(String boundWorldbookJson) {
        this.boundWorldbookJson = boundWorldbookJson;
    }

    public String getScenePrompt() {
        return scenePrompt;
    }

    public void setScenePrompt(String scenePrompt) {
        this.scenePrompt = scenePrompt;
    }
}
