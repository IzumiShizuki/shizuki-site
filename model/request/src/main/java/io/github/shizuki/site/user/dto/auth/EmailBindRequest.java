package io.github.shizuki.site.user.dto.auth;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

@Schema(description = "绑定邮箱凭据请求")
public class EmailBindRequest {

    @Email
    @NotBlank
    @Schema(description = "邮箱", example = "user@example.com")
    private String email;

    @NotBlank
    @Schema(description = "密码", example = "P@ssw0rd")
    private String password;

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

    public String getEmailCode() {
        return emailCode;
    }

    public void setEmailCode(String emailCode) {
        this.emailCode = emailCode;
    }
}

