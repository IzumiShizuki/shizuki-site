package io.github.shizuki.site.user.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.github.shizuki.common.core.model.BaseEntity;
import io.github.shizuki.site.common.mybatis.JsonStringTypeHandler;
import org.apache.ibatis.type.JdbcType;

@TableName("USR_ACCOUNT")
public class UserAccountEntity extends BaseEntity {

    @TableField("username_code")
    private String username;

    @TableField("password_hash")
    private String password;

    @TableField("nickname_text")
    private String nickname;

    @TableField("email_text")
    private String email;

    @TableField("email_verified_flag")
    private Integer emailVerified;

    @TableField("avatar_url_text")
    private String avatarUrl;

    /**
     * PostgreSQL 的 jsonb 列必须使用 {@link JsonStringTypeHandler} 以 {@code Types.OTHER}
     * 写入参数，否则 MyBatis 会按 varchar 绑定导致 "column ... is of type jsonb but
     * expression is of type character varying"。
     */
    @TableField(value = "groups_json", typeHandler = JsonStringTypeHandler.class, jdbcType = JdbcType.OTHER)
    private String groupsJson;

    @TableField(value = "permissions_json", typeHandler = JsonStringTypeHandler.class, jdbcType = JdbcType.OTHER)
    private String permissionsJson;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getEmailVerified() {
        return emailVerified;
    }

    public void setEmailVerified(Integer emailVerified) {
        this.emailVerified = emailVerified;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getGroupsJson() {
        return groupsJson;
    }

    public void setGroupsJson(String groupsJson) {
        this.groupsJson = groupsJson;
    }

    public String getPermissionsJson() {
        return permissionsJson;
    }

    public void setPermissionsJson(String permissionsJson) {
        this.permissionsJson = permissionsJson;
    }

}
