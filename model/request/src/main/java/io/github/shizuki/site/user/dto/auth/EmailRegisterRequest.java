package io.github.shizuki.site.user.dto.auth;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

@Schema(description = "邮箱注册请求")
public class EmailRegisterRequest {

    @Email
    @NotBlank
    @Schema(description = "邮箱", example = "user@example.com")
    private String email;

    @NotBlank
    @Schema(description = "密码", example = "P@ssw0rd")
    private String password;

    @Schema(description = "昵称（可选）", example = "Shizuki")
    private String nickname;

    @NotBlank
    @Schema(description = "邮箱验证码", example = "123456")
    private String emailCode;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getEmailCode() {
        return emailCode;
    }

    public void setEmailCode(String emailCode) {
        this.emailCode = emailCode;
    }
}

