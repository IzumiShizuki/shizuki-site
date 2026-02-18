package io.github.shizuki.site.media.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.github.shizuki.common.core.model.BaseEntity;

/**
 * 媒体资产主实体。
 */
@TableName("MDA_ASSET")
public class MediaAssetEntity extends BaseEntity {

    @TableField("asset_num")
    private Long assetNum;

    @TableField("user_id")
    private Long userId;

    @TableField("bucket_code")
    private String bucketName;

    @TableField("object_code")
    private String objectKey;

    @TableField("asset_type")
    private String assetType;

    /**
     * 资源类型码（tinyint）：1 静态图，2 动态图，3 L2D 包。
     */
    @TableField("asset_kind_code")
    private Integer assetKindCode;

    /**
     * 可见性类型码（tinyint）：1 私有，2 公开。
     */
    @TableField("visibility_code")
    private Integer visibilityCode;

    /**
     * 是否加入首页角色池。
     */
    @TableField("home_enabled_flag")
    private Boolean homeEnabledFlag;

    /**
     * 首页排序值，数值越小越靠前。
     */
    @TableField("home_sort_num")
    private Integer homeSortNum;

    /**
     * 原始 MIME 类型。
     */
    @TableField("content_type_text")
    private String contentTypeText;

    /**
     * 对象内容指纹（由存储侧 ETag 归一化得到），用于快速去重检索。
     */
    @TableField("object_hash")
    private String objectHash;

    /**
     * 扩展元数据 JSON（尺寸、帧数等）。
     */
    @TableField("metadata_json")
    private String metadataJson;

    @TableField("audit_status")
    private String auditStatus;

    public Long getAssetNum() {
        return assetNum;
    }

    public void setAssetNum(Long assetNum) {
        this.assetNum = assetNum;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getBucketName() {
        return bucketName;
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getObjectKey() {
        return objectKey;
    }

    public void setObjectKey(String objectKey) {
        this.objectKey = objectKey;
    }

    public String getAssetType() {
        return assetType;
    }

    public void setAssetType(String assetType) {
        this.assetType = assetType;
    }

    public String getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus;
    }

    public Integer getAssetKindCode() {
        return assetKindCode;
    }

    public void setAssetKindCode(Integer assetKindCode) {
        this.assetKindCode = assetKindCode;
    }

    public Integer getVisibilityCode() {
        return visibilityCode;
    }

    public void setVisibilityCode(Integer visibilityCode) {
        this.visibilityCode = visibilityCode;
    }

    public Boolean getHomeEnabledFlag() {
        return homeEnabledFlag;
    }

    public void setHomeEnabledFlag(Boolean homeEnabledFlag) {
        this.homeEnabledFlag = homeEnabledFlag;
    }

    public Integer getHomeSortNum() {
        return homeSortNum;
    }

    public void setHomeSortNum(Integer homeSortNum) {
        this.homeSortNum = homeSortNum;
    }

    public String getContentTypeText() {
        return contentTypeText;
    }

    public void setContentTypeText(String contentTypeText) {
        this.contentTypeText = contentTypeText;
    }

    public String getMetadataJson() {
        return metadataJson;
    }

    public void setMetadataJson(String metadataJson) {
        this.metadataJson = metadataJson;
    }

    public String getObjectHash() {
        return objectHash;
    }

    public void setObjectHash(String objectHash) {
        this.objectHash = objectHash;
    }

}
