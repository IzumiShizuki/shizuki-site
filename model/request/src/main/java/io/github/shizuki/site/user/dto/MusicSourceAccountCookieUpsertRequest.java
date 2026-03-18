package io.github.shizuki.site.user.dto;

import jakarta.validation.constraints.NotBlank;

/**
 * 绑定/更新音乐源账号 Cookie 请求体。
 */
public class MusicSourceAccountCookieUpsertRequest {

    /**
     * 登录态 Cookie 明文。
     */
    @NotBlank
    private String cookie;

    public String getCookie() {
        return cookie;
    }

    public void setCookie(String cookie) {
        this.cookie = cookie;
    }
}
