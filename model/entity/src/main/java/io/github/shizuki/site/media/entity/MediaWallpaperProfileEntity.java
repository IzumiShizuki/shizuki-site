package io.github.shizuki.site.media.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.github.shizuki.common.core.model.BaseEntity;
import java.math.BigDecimal;

/**
 * 主页壁纸配置实体。
 */
@TableName("MDA_WALLPAPER_PROFILE")
public class MediaWallpaperProfileEntity extends BaseEntity {

    @TableField("owner_user_id")
    private Long ownerUserId;

    @TableField("title_text")
    private String titleText;

    @TableField("visual_asset_id")
    private Long visualAssetId;

    @TableField("scene_type")
    private String sceneType;

    @TableField("embedded_bgm_asset_id")
    private Long embeddedBgmAssetId;

    @TableField("embedded_bgv_asset_id")
    private Long embeddedBgvAssetId;

    @TableField("default_master_volume")
    private BigDecimal defaultMasterVolume;

    @TableField("default_bgm_volume")
    private BigDecimal defaultBgmVolume;

    @TableField("default_bgv_volume")
    private BigDecimal defaultBgvVolume;

    @TableField("custom_schema_json")
    private String customSchemaJson;

    @TableField("custom_defaults_json")
    private String customDefaultsJson;

    @TableField("visibility_code")
    private Integer visibilityCode;

    @TableField("audit_status")
    private String auditStatus;

    @TableField("import_source")
    private String importSource;

    @TableField("workshop_item_id")
    private String workshopItemId;

    @TableField("enabled_flag")
    private Boolean enabledFlag;

    public Long getOwnerUserId() {
        return ownerUserId;
    }

    public void setOwnerUserId(Long ownerUserId) {
        this.ownerUserId = ownerUserId;
    }

    public String getTitleText() {
        return titleText;
    }

    public void setTitleText(String titleText) {
        this.titleText = titleText;
    }

    public Long getVisualAssetId() {
        return visualAssetId;
    }

    public void setVisualAssetId(Long visualAssetId) {
        this.visualAssetId = visualAssetId;
    }

    public String getSceneType() {
        return sceneType;
    }

    public void setSceneType(String sceneType) {
        this.sceneType = sceneType;
    }

    public Long getEmbeddedBgmAssetId() {
        return embeddedBgmAssetId;
    }

    public void setEmbeddedBgmAssetId(Long embeddedBgmAssetId) {
        this.embeddedBgmAssetId = embeddedBgmAssetId;
    }

    public Long getEmbeddedBgvAssetId() {
        return embeddedBgvAssetId;
    }

    public void setEmbeddedBgvAssetId(Long embeddedBgvAssetId) {
        this.embeddedBgvAssetId = embeddedBgvAssetId;
    }

    public BigDecimal getDefaultMasterVolume() {
        return defaultMasterVolume;
    }

    public void setDefaultMasterVolume(BigDecimal defaultMasterVolume) {
        this.defaultMasterVolume = defaultMasterVolume;
    }

    public BigDecimal getDefaultBgmVolume() {
        return defaultBgmVolume;
    }

    public void setDefaultBgmVolume(BigDecimal defaultBgmVolume) {
        this.defaultBgmVolume = defaultBgmVolume;
    }

    public BigDecimal getDefaultBgvVolume() {
        return defaultBgvVolume;
    }

    public void setDefaultBgvVolume(BigDecimal defaultBgvVolume) {
        this.defaultBgvVolume = defaultBgvVolume;
    }

    public String getCustomSchemaJson() {
        return customSchemaJson;
    }

    public void setCustomSchemaJson(String customSchemaJson) {
        this.customSchemaJson = customSchemaJson;
    }

    public String getCustomDefaultsJson() {
        return customDefaultsJson;
    }

    public void setCustomDefaultsJson(String customDefaultsJson) {
        this.customDefaultsJson = customDefaultsJson;
    }

    public Integer getVisibilityCode() {
        return visibilityCode;
    }

    public void setVisibilityCode(Integer visibilityCode) {
        this.visibilityCode = visibilityCode;
    }

    public String getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus;
    }

    public String getImportSource() {
        return importSource;
    }

    public void setImportSource(String importSource) {
        this.importSource = importSource;
    }

    public String getWorkshopItemId() {
        return workshopItemId;
    }

    public void setWorkshopItemId(String workshopItemId) {
        this.workshopItemId = workshopItemId;
    }

    public Boolean getEnabledFlag() {
        return enabledFlag;
    }

    public void setEnabledFlag(Boolean enabledFlag) {
        this.enabledFlag = enabledFlag;
    }
}
