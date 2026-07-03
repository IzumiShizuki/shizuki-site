package io.github.shizuki.site.user.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.github.shizuki.common.core.model.BaseEntity;
import io.github.shizuki.site.common.mybatis.JsonStringTypeHandler;
import org.apache.ibatis.type.JdbcType;

@TableName("USR_PREFERENCE")
public class UserPreferenceEntity extends BaseEntity {

    @TableField("user_id")
    private Long userId;

    @TableField(value = "preference_json", typeHandler = JsonStringTypeHandler.class, jdbcType = JdbcType.OTHER)
    private String preferenceJson;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getPreferenceJson() {
        return preferenceJson;
    }

    public void setPreferenceJson(String preferenceJson) {
        this.preferenceJson = preferenceJson;
    }

}
