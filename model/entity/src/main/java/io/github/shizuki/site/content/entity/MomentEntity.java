package io.github.shizuki.site.content.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.github.shizuki.common.core.model.BaseEntity;
import io.github.shizuki.site.common.mybatis.SmallIntBooleanTypeHandler;
import java.time.LocalDateTime;

/** Life moment aggregate. RECYCLED remains queryable until permanent purge. */
@TableName(value = "CTN_MOMENT", autoResultMap = true)
public class MomentEntity extends BaseEntity {

    @TableField("public_id")
    private String publicId;

    @TableField("body_text")
    private String body;

    @TableField("lifecycle_status")
    private String lifecycleStatus;

    @TableField("visibility_status")
    private String visibilityStatus;

    @TableField(value = "featured_flag", typeHandler = SmallIntBooleanTypeHandler.class)
    private Boolean featured;

    @TableField(value = "pinned_flag", typeHandler = SmallIntBooleanTypeHandler.class)
    private Boolean pinned;

    @TableField("publish_time")
    private LocalDateTime publishTime;

    @TableField("restore_lifecycle_status")
    private String restoreLifecycleStatus;

    @TableField("recycle_time")
    private LocalDateTime recycleTime;

    @TableField("purge_after")
    private LocalDateTime purgeAfter;

    public String getPublicId() {
        return publicId;
    }

    public void setPublicId(String publicId) {
        this.publicId = publicId;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
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

    public Boolean getPinned() {
        return pinned;
    }

    public void setPinned(Boolean pinned) {
        this.pinned = pinned;
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
