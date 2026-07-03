package io.github.shizuki.site.content.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.github.shizuki.common.core.model.BaseEntity;
import io.github.shizuki.site.common.mybatis.SmallIntBooleanTypeHandler;

@TableName(value = "CTN_LA_TASK_COLUMN", autoResultMap = true)
public class LightAppTaskColumnEntity extends BaseEntity {

    @TableField("user_id")
    private Long userId;

    @TableField("column_code")
    private String columnCode;

    @TableField("title_text")
    private String title;

    @TableField("sort_num")
    private Integer sortNum;

    @TableField(value = "enabled_flag", typeHandler = SmallIntBooleanTypeHandler.class)
    private Boolean enabled;

    @TableField("notion_status_option_id")
    private String notionStatusOptionId;

    @TableField(value = "notion_managed_flag", typeHandler = SmallIntBooleanTypeHandler.class)
    private Boolean notionManaged;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getColumnCode() {
        return columnCode;
    }

    public void setColumnCode(String columnCode) {
        this.columnCode = columnCode;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getSortNum() {
        return sortNum;
    }

    public void setSortNum(Integer sortNum) {
        this.sortNum = sortNum;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public String getNotionStatusOptionId() {
        return notionStatusOptionId;
    }

    public void setNotionStatusOptionId(String notionStatusOptionId) {
        this.notionStatusOptionId = notionStatusOptionId;
    }

    public Boolean getNotionManaged() {
        return notionManaged;
    }

    public void setNotionManaged(Boolean notionManaged) {
        this.notionManaged = notionManaged;
    }
}
