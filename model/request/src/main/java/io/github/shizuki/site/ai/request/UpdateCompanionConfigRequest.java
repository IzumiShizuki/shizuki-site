package io.github.shizuki.site.ai.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import java.util.List;

@Schema(description = "更新自宅 companion 配置请求")
public class UpdateCompanionConfigRequest {

    @Size(max = 64)
    @Schema(description = "companion 编码", example = "my_home_ai")
    private String companionCode;

    @NotBlank
    @Size(max = 128)
    @Schema(description = "companion 显示名", example = "小春")
    private String displayName;

    @Size(max = 4000)
    @Schema(description = "人格设定文本", example = "温柔、可靠，会记得我的习惯。")
    private String personaPrompt;

    @Positive
    @Schema(description = "角色形象资源 ID", example = "20001")
    private Long avatarAssetId;

    @Size(max = 20)
    @Schema(description = "绑定世界书 ID 列表")
    private List<@Positive Long> worldbookIds;

    @Schema(description = "是否启用记忆", example = "true")
    private Boolean memoryEnabled;

    @Size(max = 2000)
    @Schema(description = "自宅场景补充提示", example = "房间里有落地灯和书桌。")
    private String scenePrompt;

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

    public String getPersonaPrompt() {
        return personaPrompt;
    }

    public void setPersonaPrompt(String personaPrompt) {
        this.personaPrompt = personaPrompt;
    }

    public Long getAvatarAssetId() {
        return avatarAssetId;
    }

    public void setAvatarAssetId(Long avatarAssetId) {
        this.avatarAssetId = avatarAssetId;
    }

    public List<Long> getWorldbookIds() {
        return worldbookIds;
    }

    public void setWorldbookIds(List<Long> worldbookIds) {
        this.worldbookIds = worldbookIds;
    }

    public Boolean getMemoryEnabled() {
        return memoryEnabled;
    }

    public void setMemoryEnabled(Boolean memoryEnabled) {
        this.memoryEnabled = memoryEnabled;
    }

    public String getScenePrompt() {
        return scenePrompt;
    }

    public void setScenePrompt(String scenePrompt) {
        this.scenePrompt = scenePrompt;
    }
}
