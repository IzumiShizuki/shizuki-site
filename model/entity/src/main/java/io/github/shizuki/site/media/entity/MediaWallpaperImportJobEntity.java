package io.github.shizuki.site.media.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.github.shizuki.common.core.model.BaseEntity;

/**
 * 主页壁纸导入任务实体。
 */
@TableName("MDA_WALLPAPER_IMPORT_JOB")
public class MediaWallpaperImportJobEntity extends BaseEntity {

    @TableField("owner_user_id")
    private Long ownerUserId;

    @TableField("source_type")
    private String sourceType;

    @TableField("workshop_url")
    private String workshopUrl;

    @TableField("workshop_item_id")
    private String workshopItemId;

    @TableField("status_text")
    private String statusText;

    @TableField("visibility_code")
    private Integer visibilityCode;

    @TableField("wallpaper_id")
    private Long wallpaperId;

    @TableField("error_message")
    private String errorMessage;

    @TableField("fallback_hint")
    private String fallbackHint;

    @TableField("payload_json")
    private String payloadJson;

    public Long getOwnerUserId() {
        return ownerUserId;
    }

    public void setOwnerUserId(Long ownerUserId) {
        this.ownerUserId = ownerUserId;
    }

    public String getSourceType() {
        return sourceType;
    }

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    public String getWorkshopUrl() {
        return workshopUrl;
    }

    public void setWorkshopUrl(String workshopUrl) {
        this.workshopUrl = workshopUrl;
    }

    public String getWorkshopItemId() {
        return workshopItemId;
    }

    public void setWorkshopItemId(String workshopItemId) {
        this.workshopItemId = workshopItemId;
    }

    public String getStatusText() {
        return statusText;
    }

    public void setStatusText(String statusText) {
        this.statusText = statusText;
    }

    public Integer getVisibilityCode() {
        return visibilityCode;
    }

    public void setVisibilityCode(Integer visibilityCode) {
        this.visibilityCode = visibilityCode;
    }

    public Long getWallpaperId() {
        return wallpaperId;
    }

    public void setWallpaperId(Long wallpaperId) {
        this.wallpaperId = wallpaperId;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getFallbackHint() {
        return fallbackHint;
    }

    public void setFallbackHint(String fallbackHint) {
        this.fallbackHint = fallbackHint;
    }

    public String getPayloadJson() {
        return payloadJson;
    }

    public void setPayloadJson(String payloadJson) {
        this.payloadJson = payloadJson;
    }
}
