package io.github.shizuki.site.content.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.github.shizuki.common.core.model.BaseEntity;
import io.github.shizuki.site.common.mybatis.SmallIntBooleanTypeHandler;

/** Ordered, association-scoped album photo configuration. */
@TableName(value = "CTN_ALBUM_PHOTO", autoResultMap = true)
public class AlbumPhotoEntity extends BaseEntity {

    @TableField("album_id")
    private Long albumId;

    @TableField("photo_id")
    private Long photoId;

    @TableField("media_ref_id")
    private String mediaRefId;

    @TableField("sort_num")
    private Integer sortNum;

    @TableField("caption_text")
    private String caption;

    @TableField("download_mode")
    private String downloadMode;

    @TableField(value = "delivery_revoked_flag", typeHandler = SmallIntBooleanTypeHandler.class)
    private Boolean deliveryRevoked;

    public Long getAlbumId() {
        return albumId;
    }

    public void setAlbumId(Long albumId) {
        this.albumId = albumId;
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

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getDownloadMode() {
        return downloadMode;
    }

    public void setDownloadMode(String downloadMode) {
        this.downloadMode = downloadMode;
    }

    public Boolean getDeliveryRevoked() {
        return deliveryRevoked;
    }

    public void setDeliveryRevoked(Boolean deliveryRevoked) {
        this.deliveryRevoked = deliveryRevoked;
    }
}
