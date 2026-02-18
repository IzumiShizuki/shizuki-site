package io.github.shizuki.site.media.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.github.shizuki.common.core.model.BaseEntity;

/**
 * L2D 资源扩展实体（一对一关联 MDA_ASSET）。
 */
@TableName("MDA_L2D_PACKAGE")
public class MediaL2dPackageEntity extends BaseEntity {

    /**
     * 对应资产 ID（唯一）。
     */
    @TableField("asset_id")
    private Long assetId;

    /**
     * 入口 model3.json 路径。
     */
    @TableField("entry_model_json")
    private String entryModelJson;

    /**
     * Moc 文件路径。
     */
    @TableField("moc_path")
    private String mocPath;

    /**
     * 纹理数量。
     */
    @TableField("texture_count")
    private Integer textureCount;

    /**
     * 动作分组数量。
     */
    @TableField("motion_group_count")
    private Integer motionGroupCount;

    /**
     * 表情数量。
     */
    @TableField("expression_count")
    private Integer expressionCount;

    /**
     * 是否包含 Physics 文件。
     */
    @TableField("has_physics_flag")
    private Boolean hasPhysicsFlag;

    /**
     * 是否包含 Pose 文件。
     */
    @TableField("has_pose_flag")
    private Boolean hasPoseFlag;

    /**
     * 引用文件清单 JSON。
     */
    @TableField("references_json")
    private String referencesJson;

    /**
     * 校验状态码（1=PASSED,2=FAILED）。
     */
    @TableField("validation_code")
    private Integer validationCode;

    public Long getAssetId() {
        return assetId;
    }

    public void setAssetId(Long assetId) {
        this.assetId = assetId;
    }

    public String getEntryModelJson() {
        return entryModelJson;
    }

    public void setEntryModelJson(String entryModelJson) {
        this.entryModelJson = entryModelJson;
    }

    public String getMocPath() {
        return mocPath;
    }

    public void setMocPath(String mocPath) {
        this.mocPath = mocPath;
    }

    public Integer getTextureCount() {
        return textureCount;
    }

    public void setTextureCount(Integer textureCount) {
        this.textureCount = textureCount;
    }

    public Integer getMotionGroupCount() {
        return motionGroupCount;
    }

    public void setMotionGroupCount(Integer motionGroupCount) {
        this.motionGroupCount = motionGroupCount;
    }

    public Integer getExpressionCount() {
        return expressionCount;
    }

    public void setExpressionCount(Integer expressionCount) {
        this.expressionCount = expressionCount;
    }

    public Boolean getHasPhysicsFlag() {
        return hasPhysicsFlag;
    }

    public void setHasPhysicsFlag(Boolean hasPhysicsFlag) {
        this.hasPhysicsFlag = hasPhysicsFlag;
    }

    public Boolean getHasPoseFlag() {
        return hasPoseFlag;
    }

    public void setHasPoseFlag(Boolean hasPoseFlag) {
        this.hasPoseFlag = hasPoseFlag;
    }

    public String getReferencesJson() {
        return referencesJson;
    }

    public void setReferencesJson(String referencesJson) {
        this.referencesJson = referencesJson;
    }

    public Integer getValidationCode() {
        return validationCode;
    }

    public void setValidationCode(Integer validationCode) {
        this.validationCode = validationCode;
    }
}
