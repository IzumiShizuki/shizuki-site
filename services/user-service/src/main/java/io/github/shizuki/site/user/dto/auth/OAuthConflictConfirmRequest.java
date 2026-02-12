package io.github.shizuki.site.user.dto.auth;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

/**
 * OAuth 冲突绑定确认请求 DTO。
 *
 * <p>用于接收前端在冲突绑定确认页提交的 bind_ticket 与邮箱凭据。
 */
@Schema(description = "OAuth 冲突绑定确认请求")
public class OAuthConflictConfirmRequest {

    /**
     * 绑定确认票据（由 OAuth 冲突场景返回的一次性凭证）。
     */
    @NotBlank
    @Schema(description = "绑定确认票据", example = "9f318bf0-6d26-4f3f-982b-c6d5778cbfd0")
    private String bindTicket;

    /**
     * 冲突邮箱账号。
     */
    @Email
    @NotBlank
    @Schema(description = "冲突邮箱账号", example = "user@example.com")
    private String email;

    /**
     * 冲突邮箱账号密码。
     */
    @NotBlank
    @Schema(description = "冲突邮箱账号密码", example = "P@ssw0rd")
    private String password;

    /**
     * 获取绑定确认票据。
     *
     * @return bind_ticket
     */
    public String getBindTicket() {
        return bindTicket;
    }

    /**
     * 设置绑定确认票据。
     *
     * @param bindTicket bind_ticket
     */
    public void setBindTicket(String bindTicket) {
        this.bindTicket = bindTicket;
    }

    /**
     * 获取邮箱。
     *
     * @return 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置邮箱。
     *
     * @param email 邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取密码。
     *
     * @return 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码。
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }
}
