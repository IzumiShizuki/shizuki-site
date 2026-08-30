package io.github.shizuki.site.content.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.github.shizuki.common.core.model.BaseEntity;
import io.github.shizuki.site.common.mybatis.SmallIntBooleanTypeHandler;
import java.time.LocalDateTime;

/** Album aggregate. RECYCLED is a queryable lifecycle state, not a logic delete. */
@TableName(value = "CTN_ALBUM", autoResultMap = true)
public class AlbumEntity extends BaseEntity {

    @TableField("public_slug")
    private String publicSlug;

    @TableField("title_text")
    private String title;

    @TableField("summary_text")
    private String summary;

    @TableField("cover_photo_id")
    private Long coverPhotoId;

    @TableField("lifecycle_status")
    private String lifecycleStatus;

    @TableField("visibility_status")
    private String visibilityStatus;

    @TableField(value = "featured_flag", typeHandler = SmallIntBooleanTypeHandler.class)
    private Boolean featured;

    @TableField("sort_num")
    private Integer sortNum;

    @TableField("publish_time")
    private LocalDateTime publishTime;

    @TableField("restore_lifecycle_status")
    private String restoreLifecycleStatus;

    @TableField("recycle_time")
    private LocalDateTime recycleTime;

    @TableField("purge_after")
    private LocalDateTime purgeAfter;

    public String getPublicSlug() {
        return publicSlug;
    }

    public void setPublicSlug(String publicSlug) {
        this.publicSlug = publicSlug;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Long getCoverPhotoId() {
        return coverPhotoId;
    }

    public void setCoverPhotoId(Long coverPhotoId) {
        this.coverPhotoId = coverPhotoId;
    }

    public String getLifecycleStatus() {
        return lifecycleStatus;
    }

    public void setLifecycleStatus(String lifecycleStatus) {
        this.lifecycleStatus = lifecycleStatus;
    }

    public String getVisibilityStatus() {
        return visibilityStatus;
    }

    public void setVisibilityStatus(String visibilityStatus) {
        this.visibilityStatus = visibilityStatus;
    }

    public Boolean getFeatured() {
        return featured;
    }

    public void setFeatured(Boolean featured) {
        this.featured = featured;
    }

    public Integer getSortNum() {
        return sortNum;
    }

    public void setSortNum(Integer sortNum) {
        this.sortNum = sortNum;
    }

    public LocalDateTime getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(LocalDateTime publishTime) {
        this.publishTime = publishTime;
    }

    public String getRestoreLifecycleStatus() {
        return restoreLifecycleStatus;
    }

    public void setRestoreLifecycleStatus(String restoreLifecycleStatus) {
        this.restoreLifecycleStatus = restoreLifecycleStatus;
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
