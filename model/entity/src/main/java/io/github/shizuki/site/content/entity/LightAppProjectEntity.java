package io.github.shizuki.site.content.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.github.shizuki.common.core.model.BaseEntity;
import io.github.shizuki.site.common.mybatis.SmallIntBooleanTypeHandler;

@TableName(value = "CTN_LA_PROJECT", autoResultMap = true)
public class LightAppProjectEntity extends BaseEntity {

    @TableField("user_id")
    private Long userId;

    @TableField("project_code")
    private String projectCode;

    @TableField("name_text")
    private String name;

    @TableField("description_text")
    private String description;

    @TableField("color_text")
    private String color;

    @TableField(value = "archived_flag", typeHandler = SmallIntBooleanTypeHandler.class)
    private Boolean archived;

    @TableField("sort_num")
    private Integer sortNum;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getProjectCode() {
        return projectCode;
    }

    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getArchived() {
        return archived;
    }

    public void setArchived(Boolean archived) {
        this.archived = archived;
    }

    public Integer getSortNum() {
        return sortNum;
    }

    public void setSortNum(Integer sortNum) {
        this.sortNum = sortNum;
    }
}
