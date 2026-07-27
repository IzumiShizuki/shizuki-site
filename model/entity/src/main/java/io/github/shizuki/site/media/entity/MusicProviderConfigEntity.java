package io.github.shizuki.site.media.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.github.shizuki.common.core.model.BaseEntity;
import io.github.shizuki.site.common.mybatis.SmallIntBooleanTypeHandler;

/**
 * 音乐 provider 配置实体。
 *
 * <p>enabled_flag / visible_flag 在 PostgreSQL 中以 smallint 持久化，
 * 必须通过 {@link SmallIntBooleanTypeHandler} 显式映射，否则 MyBatis 会以
 * boolean 表达式写入并触发 "column is of type smallint but expression is of
 * type boolean" 错误。
 */
@TableName(value = "MDA_MUSIC_PROVIDER_CONFIG", autoResultMap = true)
public class MusicProviderConfigEntity extends BaseEntity {

    @TableField("provider_code")
    private String providerCode;

    @TableField(value = "enabled_flag", typeHandler = SmallIntBooleanTypeHandler.class)
    private Boolean enabledFlag;

    @TableField(value = "visible_flag", typeHandler = SmallIntBooleanTypeHandler.class)
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
