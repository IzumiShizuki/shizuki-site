package io.github.shizuki.site.ai.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.github.shizuki.common.core.model.BaseEntity;

@TableName("AI_TOWN_ASSET_IMPORT")
public class AiTownAssetImportEntity extends BaseEntity {

    @TableField("asset_code")
    private String assetCode;

    @TableField("owner_user_id")
    private Long ownerUserId;

    @TableField("source_name")
    private String sourceName;

    @TableField("asset_type")
    private String assetType;

    @TableField("parser_status")
    private String parserStatus;

    @TableField("attached_scene_code")
    private String attachedSceneCode;

    @TableField("raw_size_bytes")
    private Long rawSizeBytes;

    @TableField("metadata_json")
    private String metadataJson;

    @TableField("preview_json")
    private String previewJson;

    public String getAssetCode() {
        return assetCode;
    }

    public void setAssetCode(String assetCode) {
        this.assetCode = assetCode;
    }

    public Long getOwnerUserId() {
        return ownerUserId;
    }

    public void setOwnerUserId(Long ownerUserId) {
        this.ownerUserId = ownerUserId;
    }

    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    public String getAssetType() {
        return assetType;
    }

    public void setAssetType(String assetType) {
        this.assetType = assetType;
    }

    public String getParserStatus() {
        return parserStatus;
    }

    public void setParserStatus(String parserStatus) {
        this.parserStatus = parserStatus;
    }

    public String getAttachedSceneCode() {
        return attachedSceneCode;
    }

    public void setAttachedSceneCode(String attachedSceneCode) {
        this.attachedSceneCode = attachedSceneCode;
    }

    public Long getRawSizeBytes() {
        return rawSizeBytes;
    }

    public void setRawSizeBytes(Long rawSizeBytes) {
        this.rawSizeBytes = rawSizeBytes;
    }

    public String getMetadataJson() {
        return metadataJson;
    }

    public void setMetadataJson(String metadataJson) {
        this.metadataJson = metadataJson;
    }

    public String getPreviewJson() {
        return previewJson;
    }

    public void setPreviewJson(String previewJson) {
        this.previewJson = previewJson;
    }
}
