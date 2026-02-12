package io.github.shizuki.common.oauth.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GitHub 用户信息响应模型。
 */
public class GitHubUserResponse {

    /**
     * GitHub 用户主键 ID。
     */
    private Long id;

    /**
     * GitHub 登录名。
     */
    private String login;

    /**
     * 公开邮箱（可能为空）。
     */
    private String email;

    /**
     * 头像 URL。
     */
    @JsonProperty("avatar_url")
    private String avatarUrl;

    /**
     * 获取 GitHub 用户 ID。
     *
     * @return GitHub 用户 ID
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置 GitHub 用户 ID。
     *
     * @param id GitHub 用户 ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取 GitHub 登录名。
     *
     * @return GitHub 登录名
     */
    public String getLogin() {
        return login;
    }

    /**
     * 设置 GitHub 登录名。
     *
     * @param login GitHub 登录名
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * 获取公开邮箱。
     *
     * @return 公开邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置公开邮箱。
     *
     * @param email 公开邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取头像 URL。
     *
     * @return 头像 URL
     */
    public String getAvatarUrl() {
        return avatarUrl;
    }

    /**
     * 设置头像 URL。
     *
     * @param avatarUrl 头像 URL
     */
    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }
}
