package io.github.shizuki.site.ai.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.github.shizuki.common.core.model.BaseEntity;

@TableName("AI_SESSION")
public class AiSessionEntity extends BaseEntity {

    @TableField("session_code")
    private String sessionId;

    @TableField("user_id")
    private Long userId;

    @TableField("title_text")
    private String title;

    @TableField("session_mode")
    private String mode;

    @TableField("character_id")
    private Long characterId;

    @TableField("bound_worldbook_json")
    private String boundWorldbookJson;

    @TableField("scene_prompt_text")
    private String scenePrompt;

    @TableField("town_room_code")
    private String townRoomCode;

    @TableField("actor_code")
    private String actorCode;

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public Long getCharacterId() {
        return characterId;
    }

    public void setCharacterId(Long characterId) {
        this.characterId = characterId;
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

    public String getTownRoomCode() {
        return townRoomCode;
    }

    public void setTownRoomCode(String townRoomCode) {
        this.townRoomCode = townRoomCode;
    }

    public String getActorCode() {
        return actorCode;
    }

    public void setActorCode(String actorCode) {
        this.actorCode = actorCode;
    }

}
