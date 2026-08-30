package io.github.shizuki.site.content.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.github.shizuki.common.core.model.BaseEntity;
import java.time.LocalDateTime;

/** Managed personal photo backed by a private original asset. */
@TableName("CTN_PHOTO")
public class PhotoEntity extends BaseEntity {

    @TableField("original_asset_id")
    private Long originalAssetId;

    @TableField("title_text")
    private String title;

    @TableField("alt_text")
    private String altText;

    @TableField("captured_at_draft")
    private LocalDateTime capturedAtDraft;

    @TableField("published_location_label")
    private String publishedLocationLabel;

    @TableField("processing_status")
    private String processingStatus;

    @TableField("recycle_time")
    private LocalDateTime recycleTime;

    @TableField("purge_after")
    private LocalDateTime purgeAfter;

    public Long getOriginalAssetId() {
        return originalAssetId;
    }

    public void setOriginalAssetId(Long originalAssetId) {
        this.originalAssetId = originalAssetId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAltText() {
        return altText;
    }

    public void setAltText(String altText) {
        this.altText = altText;
    }

    public LocalDateTime getCapturedAtDraft() {
        return capturedAtDraft;
    }

    public void setCapturedAtDraft(LocalDateTime capturedAtDraft) {
        this.capturedAtDraft = capturedAtDraft;
    }

    public String getPublishedLocationLabel() {
        return publishedLocationLabel;
    }

    public void setPublishedLocationLabel(String publishedLocationLabel) {
        this.publishedLocationLabel = publishedLocationLabel;
    }

    public String getProcessingStatus() {
        return processingStatus;
    }

    public void setProcessingStatus(String processingStatus) {
        this.processingStatus = processingStatus;
    }

    public LocalDateTime getRecycleTime() {
        return recycleTime;
    }

    public void setRecycleTime(LocalDateTime recycleTime) {
        this.recycleTime = recycleTime;
    }

    public LocalDateTime getPurgeAfter() {
        return purgeAfter;
    }

    public void setPurgeAfter(LocalDateTime purgeAfter) {
        this.purgeAfter = purgeAfter;
    }
}
