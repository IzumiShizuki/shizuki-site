package io.github.shizuki.site.media.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.github.shizuki.common.core.model.BaseEntity;

/**
 * 音乐曲目 OSS 缓存索引实体。
 */
@TableName("MDA_MUSIC_TRACK_CACHE")
public class MusicTrackCacheEntity extends BaseEntity {

    @TableField("provider_code")
    private String providerCode;

    @TableField("track_id")
    private String trackId;

    @TableField("bucket_code")
    private String bucketCode;

    @TableField("object_code")
    private String objectCode;

    @TableField("public_url")
    private String publicUrl;

    @TableField("source_url")
    private String sourceUrl;

    public String getProviderCode() {
        return providerCode;
    }

    public void setProviderCode(String providerCode) {
        this.providerCode = providerCode;
    }

    public String getTrackId() {
        return trackId;
    }

    public void setTrackId(String trackId) {
        this.trackId = trackId;
    }

    public String getBucketCode() {
        return bucketCode;
    }

    public void setBucketCode(String bucketCode) {
        this.bucketCode = bucketCode;
    }

    public String getObjectCode() {
        return objectCode;
    }

    public void setObjectCode(String objectCode) {
        this.objectCode = objectCode;
    }

    public String getPublicUrl() {
        return publicUrl;
    }

    public void setPublicUrl(String publicUrl) {
        this.publicUrl = publicUrl;
    }

    public String getSourceUrl() {
        return sourceUrl;
    }

    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }
}
