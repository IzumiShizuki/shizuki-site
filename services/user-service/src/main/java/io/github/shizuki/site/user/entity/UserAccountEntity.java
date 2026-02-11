package io.github.shizuki.site.user.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.github.shizuki.common.core.model.BaseEntity;

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

    @TableField("groups_json")
    private String groupsJson;

    @TableField("permissions_json")
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
