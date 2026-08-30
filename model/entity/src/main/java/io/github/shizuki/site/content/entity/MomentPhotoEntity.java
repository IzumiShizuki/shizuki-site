package io.github.shizuki.site.content.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.github.shizuki.common.core.model.BaseEntity;
import io.github.shizuki.site.common.mybatis.SmallIntBooleanTypeHandler;

/** Ordered, association-scoped moment photo configuration. */
@TableName(value = "CTN_MOMENT_PHOTO", autoResultMap = true)
public class MomentPhotoEntity extends BaseEntity {

    @TableField("moment_id")
    private Long momentId;

    @TableField("photo_id")
    private Long photoId;

    @TableField("media_ref_id")
    private String mediaRefId;

    @TableField("sort_num")
    private Integer sortNum;

    @TableField(value = "delivery_revoked_flag", typeHandler = SmallIntBooleanTypeHandler.class)
    private Boolean deliveryRevoked;

    public Long getMomentId() {
        return momentId;
    }

    public void setMomentId(Long momentId) {
        this.momentId = momentId;
    }

    public Long getPhotoId() {
        return photoId;
    }

    public void setPhotoId(Long photoId) {
        this.photoId = photoId;
    }

    public String getMediaRefId() {
        return mediaRefId;
    }

    public void setMediaRefId(String mediaRefId) {
        this.mediaRefId = mediaRefId;
    }

    public Integer getSortNum() {
        return sortNum;
    }

    public void setSortNum(Integer sortNum) {
        this.sortNum = sortNum;
    }

    public Boolean getDeliveryRevoked() {
        return deliveryRevoked;
    }

    public void setDeliveryRevoked(Boolean deliveryRevoked) {
        this.deliveryRevoked = deliveryRevoked;
    }
}
