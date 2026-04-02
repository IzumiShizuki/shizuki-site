package io.github.shizuki.site.ai.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import java.util.List;

@Schema(description = "创建 AI 会话请求")
public class CreateSessionRequest {

    @NotBlank
    @Schema(description = "会话标题", example = "算法面试训练")
    private String title;

    @Size(max = 32)
    @Schema(description = "会话模式", example = "normal")
    private String mode;

    @Positive
    @Schema(description = "绑定角色 ID", example = "1001")
    private Long characterId;

    @Size(max = 20)
    @Schema(description = "绑定世界书 ID 列表")
    private List<@Positive Long> worldbookIds;

    @Size(max = 4000)
    @Schema(description = "场景设定文本", example = "深夜的图书馆，窗外在下雨。")
    private String scenePrompt;

    @Size(max = 64)
    @Schema(description = "AI 小镇房间编码", example = "library")
    private String townRoomCode;

    @Size(max = 64)
    @Schema(description = "交互对象编码", example = "librarian")
    private String actorCode;

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

    public List<Long> getWorldbookIds() {
        return worldbookIds;
    }

    public void setWorldbookIds(List<Long> worldbookIds) {
        this.worldbookIds = worldbookIds;
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
