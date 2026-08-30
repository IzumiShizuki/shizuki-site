package io.github.shizuki.site.media.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.github.shizuki.common.core.model.BaseEntity;

/** Versioned privacy-safe derivative of a managed media asset. */
@TableName("MDA_ASSET_VARIANT")
public class MediaAssetVariantEntity extends BaseEntity {

    @TableField("source_asset_id")
    private Long sourceAssetId;

    @TableField("variant_asset_id")
    private Long variantAssetId;

    @TableField("variant_code")
    private String variantCode;

    @TableField("delivery_scope")
    private String deliveryScope;

    @TableField("width_value")
    private Integer width;

    @TableField("height_value")
    private Integer height;

    @TableField("processor_version")
    private String processorVersion;

    @TableField("process_status")
    private String processStatus;

    @TableField("retry_count")
    private Integer retryCount;

    @TableField("last_error")
    private String lastError;

    public Long getSourceAssetId() {
        return sourceAssetId;
    }

    public void setSourceAssetId(Long sourceAssetId) {
        this.sourceAssetId = sourceAssetId;
    }

    public Long getVariantAssetId() {
        return variantAssetId;
    }

    public void setVariantAssetId(Long variantAssetId) {
        this.variantAssetId = variantAssetId;
    }

    public String getVariantCode() {
        return variantCode;
    }

    public void setVariantCode(String variantCode) {
        this.variantCode = variantCode;
    }

    public String getDeliveryScope() {
        return deliveryScope;
    }

    public void setDeliveryScope(String deliveryScope) {
        this.deliveryScope = deliveryScope;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public String getProcessorVersion() {
        return processorVersion;
    }

    public void setProcessorVersion(String processorVersion) {
        this.processorVersion = processorVersion;
    }

    public String getProcessStatus() {
        return processStatus;
    }

    public void setProcessStatus(String processStatus) {
        this.processStatus = processStatus;
    }

    public Integer getRetryCount() {
        return retryCount;
    }

    public void setRetryCount(Integer retryCount) {
        this.retryCount = retryCount;
    }

    public String getLastError() {
        return lastError;
    }

    public void setLastError(String lastError) {
        this.lastError = lastError;
    }
}
