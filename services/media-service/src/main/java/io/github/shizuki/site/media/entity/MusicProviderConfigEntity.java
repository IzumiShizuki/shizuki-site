package io.github.shizuki.site.media.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.github.shizuki.common.core.model.BaseEntity;

/**
 * 音乐 provider 配置实体。
 */
@TableName("MDA_MUSIC_PROVIDER_CONFIG")
public class MusicProviderConfigEntity extends BaseEntity {

    @TableField("provider_code")
    private String providerCode;

    @TableField("enabled_flag")
    private Boolean enabledFlag;

    @TableField("visible_flag")
    private Boolean visibleFlag;

    @TableField("sort_num")
    private Integer sortNum;

    public String getProviderCode() {
        return providerCode;
    }

    public void setProviderCode(String providerCode) {
        this.providerCode = providerCode;
    }

    public Boolean getEnabledFlag() {
        return enabledFlag;
    }

    public void setEnabledFlag(Boolean enabledFlag) {
        this.enabledFlag = enabledFlag;
    }

    public Boolean getVisibleFlag() {
        return visibleFlag;
    }

    public void setVisibleFlag(Boolean visibleFlag) {
        this.visibleFlag = visibleFlag;
    }

    public Integer getSortNum() {
        return sortNum;
    }

    public void setSortNum(Integer sortNum) {
        this.sortNum = sortNum;
    }
}
