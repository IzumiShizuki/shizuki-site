package io.github.shizuki.site.ai.request;

import com.fasterxml.jackson.annotation.JsonAlias;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

@Schema(description = "导入 AI 角色卡请求")
public class AiCharacterImportRequest {

    @JsonAlias({"displayName", "display_name", "name", "title", "character_name", "characterName", "nickname"})
    @NotBlank
    @Size(max = 128)
    @Schema(description = "角色显示名", example = "馆长 Haru")
    private String displayName;

    @JsonAlias({"rawCardJson", "raw_card_json"})
    @NotBlank
    @Size(max = 4000)
    @Schema(description = "角色卡原始 JSON / 元数据", example = "{\"name\":\"馆长 Haru\"}")
    private String rawCardJson;

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

    public String getRawCardJson() {
        return rawCardJson;
    }

    public void setRawCardJson(String rawCardJson) {
        this.rawCardJson = rawCardJson;
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
