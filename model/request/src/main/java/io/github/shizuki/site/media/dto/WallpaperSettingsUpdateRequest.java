package io.github.shizuki.site.media.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import java.util.Map;

@Schema(description = "壁纸播放与自定义设置更新请求")
public class WallpaperSettingsUpdateRequest {

    @Schema(description = "内嵌BGM资源ID")
    private Long embeddedBgmAssetId;

    @Schema(description = "内嵌BGV资源ID")
    private Long embeddedBgvAssetId;

    @Schema(description = "默认总音量 0~1", example = "1")
    private BigDecimal defaultMasterVolume;

    @Schema(description = "默认BGM音量 0~1", example = "0.8")
    private BigDecimal defaultBgmVolume;

    @Schema(description = "默认BGV音量 0~1", example = "0.5")
    private BigDecimal defaultBgvVolume;

    @Schema(description = "动态设置Schema")
    private Map<String, Object> customSchema;

    @Schema(description = "动态设置默认值")
    private Map<String, Object> customDefaults;

    @Schema(description = "是否默认启用BGM", example = "true")
    private Boolean bgmEnabled;

    @Schema(description = "是否默认启用BGV", example = "true")
    private Boolean bgvEnabled;

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

    public Map<String, Object> getCustomSchema() {
        return customSchema;
    }

    public void setCustomSchema(Map<String, Object> customSchema) {
        this.customSchema = customSchema;
    }

    public Map<String, Object> getCustomDefaults() {
        return customDefaults;
    }

    public void setCustomDefaults(Map<String, Object> customDefaults) {
        this.customDefaults = customDefaults;
    }

    public Boolean getBgmEnabled() {
        return bgmEnabled;
    }

    public void setBgmEnabled(Boolean bgmEnabled) {
        this.bgmEnabled = bgmEnabled;
    }

    public Boolean getBgvEnabled() {
        return bgvEnabled;
    }

    public void setBgvEnabled(Boolean bgvEnabled) {
        this.bgvEnabled = bgvEnabled;
    }
}
