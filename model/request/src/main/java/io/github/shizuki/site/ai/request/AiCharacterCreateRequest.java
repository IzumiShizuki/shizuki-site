package io.github.shizuki.site.ai.request;

import com.fasterxml.jackson.annotation.JsonAlias;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

@Schema(description = "创建 AI 角色请求")
public class AiCharacterCreateRequest {

    @JsonAlias({"displayName", "display_name", "name", "title", "character_name", "characterName", "nickname"})
    @NotBlank
    @Size(max = 128)
    @Schema(description = "角色显示名", example = "馆长 Haru")
    private String displayName;

    @Size(max = 1200)
    @Schema(description = "角色 persona 设定", example = "安静而可靠。")
    private String persona;

    @Size(max = 1200)
    @Schema(description = "角色补充描述", example = "负责整理馆藏与夜间借阅。")
    private String description;

    @JsonAlias({"visibilityType", "visibility_type"})
    @Size(max = 16)
    @Schema(description = "可见性类型", example = "PRIVATE")
    private String visibilityType;

    @JsonAlias({"coverAssetId", "cover_asset_id", "avatar_asset_id", "avatarAssetId"})
    @Positive
    @Schema(description = "封面资源 ID", example = "901")
    private Long coverAssetId;

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getPersona() {
        return persona;
    }

    public void setPersona(String persona) {
        this.persona = persona;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getVisibilityType() {
        return visibilityType;
    }

    public void setVisibilityType(String visibilityType) {
        this.visibilityType = visibilityType;
    }

    public Long getCoverAssetId() {
        return coverAssetId;
    }

    public void setCoverAssetId(Long coverAssetId) {
        this.coverAssetId = coverAssetId;
    }
}
