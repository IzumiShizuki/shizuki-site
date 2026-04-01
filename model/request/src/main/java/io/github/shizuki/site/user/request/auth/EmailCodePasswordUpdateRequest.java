package io.github.shizuki.site.user.request.auth;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;

@Schema(description = "邮箱验证码修改密码请求")
public class EmailCodePasswordUpdateRequest {

    @Email
    @Schema(description = "邮箱", example = "user@example.com")
    private String email;

    @Schema(description = "邮箱验证码", example = "123456")
    private String emailCode;

    @Schema(description = "新密码", example = "P@ssw0rd123")
    private String newPassword;

    @Schema(description = "确认新密码", example = "P@ssw0rd123")
    private String confirmPassword;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmailCode() {
        return emailCode;
    }

    public void setEmailCode(String emailCode) {
        this.emailCode = emailCode;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
}
