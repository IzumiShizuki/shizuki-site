package io.github.shizuki.site.user.dto.auth;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

@Schema(description = "发送邮箱验证码请求")
public class EmailVerificationSendRequest {

    @Email
    @NotBlank
    @Schema(description = "邮箱", example = "user@example.com")
    private String email;

    @NotBlank
    @Schema(description = "用途：register|bind|reset_password", example = "register")
    private String purpose;

    @NotBlank
    @Schema(description = "图形验证码 ID", example = "captcha-001")
    private String captchaId;

    @NotBlank
    @Schema(description = "图形验证码答案", example = "12")
    private String captchaAnswer;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getCaptchaId() {
        return captchaId;
    }

    public void setCaptchaId(String captchaId) {
        this.captchaId = captchaId;
    }

    public String getCaptchaAnswer() {
        return captchaAnswer;
    }

    public void setCaptchaAnswer(String captchaAnswer) {
        this.captchaAnswer = captchaAnswer;
    }
}

