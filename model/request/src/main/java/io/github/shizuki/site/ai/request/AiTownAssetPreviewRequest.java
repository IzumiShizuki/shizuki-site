package io.github.shizuki.site.ai.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Size;

@Schema(description = "AI 小镇 RPGMaker 资产预览请求")
public class AiTownAssetPreviewRequest {

    @Size(max = 64)
    @Schema(description = "资产导入编码", example = "rpg-a1b2c3")
    private String assetCode;

    @Size(max = 64)
    @Schema(description = "场景编码，可用于读取已挂接场景的最近资产", example = "library")
    private String sceneCode;

    public String getAssetCode() {
        return assetCode;
    }

    public void setAssetCode(String assetCode) {
        this.assetCode = assetCode;
    }

    public String getSceneCode() {
        return sceneCode;
    }

    public void setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
    }
}
