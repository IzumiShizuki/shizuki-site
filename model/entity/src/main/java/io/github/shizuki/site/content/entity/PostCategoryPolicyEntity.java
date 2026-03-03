package io.github.shizuki.site.content.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.github.shizuki.common.core.model.BaseEntity;

@TableName("CTN_POST_CATEGORY_POLICY")
public class PostCategoryPolicyEntity extends BaseEntity {

    @TableField("category_code")
    private String categoryCode;

    @TableField("enabled_flag")
    private Integer enabledFlag;

    public String getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }

    public Integer getEnabledFlag() {
        return enabledFlag;
    }

    public void setEnabledFlag(Integer enabledFlag) {
        this.enabledFlag = enabledFlag;
    }
}
