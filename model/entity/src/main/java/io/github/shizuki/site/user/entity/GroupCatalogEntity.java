package io.github.shizuki.site.user.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.github.shizuki.common.core.model.BaseEntity;

@TableName("USR_GROUP")
public class GroupCatalogEntity extends BaseEntity {

    @TableField("group_code")
    private String groupCode;

    @TableField("display_name")
    private String displayName;

    @TableField("description_text")
    private String descriptionText;

    @TableField("status_code")
    private String statusCode;

    @TableField("built_in_flag")
    private Integer builtInFlag;

    @TableField("sort_num")
    private Integer sortNum;

    public String getGroupCode() {
        return groupCode;
    }

    public void setGroupCode(String groupCode) {
        this.groupCode = groupCode;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getDescriptionText() {
        return descriptionText;
    }

    public void setDescriptionText(String descriptionText) {
        this.descriptionText = descriptionText;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public Integer getBuiltInFlag() {
        return builtInFlag;
    }

    public void setBuiltInFlag(Integer builtInFlag) {
        this.builtInFlag = builtInFlag;
    }

    public Integer getSortNum() {
        return sortNum;
    }

    public void setSortNum(Integer sortNum) {
        this.sortNum = sortNum;
    }
}
