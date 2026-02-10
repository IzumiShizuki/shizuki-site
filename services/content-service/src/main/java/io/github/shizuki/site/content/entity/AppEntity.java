package io.github.shizuki.site.content.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.github.shizuki.common.core.model.BaseEntity;

@TableName("CTN_APP")
public class AppEntity extends BaseEntity {

    @TableField("app_num")
    private Long appNum;

    @TableField("name_text")
    private String name;

    @TableField("category_type")
    private String category;

    @TableField("pin_flag")
    private Boolean pinAble;

    @TableField("like_value")
    private Long likeCount;

    public Long getAppNum() {
        return appNum;
    }

    public void setAppNum(Long appNum) {
        this.appNum = appNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Boolean getPinAble() {
        return pinAble;
    }

    public void setPinAble(Boolean pinAble) {
        this.pinAble = pinAble;
    }

    public Long getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(Long likeCount) {
        this.likeCount = likeCount;
    }

}
