package io.github.shizuki.site.media.service.retention;

import java.time.LocalDateTime;

/**
 * 回收服务内部照片投影，禁止直接进入 HTTP 响应。
 */
public class PhotoRetentionRow {

    private Long photoId;
    private Long originalAssetId;
    private LocalDateTime recycleTime;
    private LocalDateTime purgeAfter;
    private Integer version;

    public Long getPhotoId() {
        return photoId;
    }

    public void setPhotoId(Long photoId) {
        this.photoId = photoId;
    }

    public Long getOriginalAssetId() {
        return originalAssetId;
    }

    public void setOriginalAssetId(Long originalAssetId) {
        this.originalAssetId = originalAssetId;
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

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
}
