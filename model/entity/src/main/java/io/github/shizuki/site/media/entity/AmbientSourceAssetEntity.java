package io.github.shizuki.site.media.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.github.shizuki.common.core.model.BaseEntity;

/**
 * 在线环境音来源与用户私有资产的幂等映射。
 */
@TableName("MDA_AMBIENT_SOURCE_ASSET")
public class AmbientSourceAssetEntity extends BaseEntity {

    @TableField("user_id")
    private Long userId;

    @TableField("provider_code")
    private String providerCode;

    @TableField("source_sound_id")
    private String sourceSoundId;

    @TableField("asset_id")
    private Long assetId;

    @TableField("import_status")
    private String importStatus;

    @TableField("title_text")
    private String titleText;

    @TableField("author_text")
    private String authorText;

    @TableField("license_code")
    private String licenseCode;

    @TableField("license_name")
    private String licenseName;

    @TableField("source_page_url")
    private String sourcePageUrl;

    @TableField("duration_value")
    private Double durationValue;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getProviderCode() {
        return providerCode;
    }

    public void setProviderCode(String providerCode) {
        this.providerCode = providerCode;
    }

    public String getSourceSoundId() {
        return sourceSoundId;
    }

    public void setSourceSoundId(String sourceSoundId) {
        this.sourceSoundId = sourceSoundId;
    }

    public Long getAssetId() {
        return assetId;
    }

    public void setAssetId(Long assetId) {
        this.assetId = assetId;
    }

    public String getImportStatus() {
        return importStatus;
    }

    public void setImportStatus(String importStatus) {
        this.importStatus = importStatus;
    }

    public String getTitleText() {
        return titleText;
    }

    public void setTitleText(String titleText) {
        this.titleText = titleText;
    }

    public String getAuthorText() {
        return authorText;
    }

    public void setAuthorText(String authorText) {
        this.authorText = authorText;
    }

    public String getLicenseCode() {
        return licenseCode;
    }

    public void setLicenseCode(String licenseCode) {
        this.licenseCode = licenseCode;
    }

    public String getLicenseName() {
        return licenseName;
    }

    public void setLicenseName(String licenseName) {
        this.licenseName = licenseName;
    }

    public String getSourcePageUrl() {
        return sourcePageUrl;
    }

    public void setSourcePageUrl(String sourcePageUrl) {
        this.sourcePageUrl = sourcePageUrl;
    }

    public Double getDurationValue() {
        return durationValue;
    }

    public void setDurationValue(Double durationValue) {
        this.durationValue = durationValue;
    }
}
