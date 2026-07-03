package io.github.shizuki.site.content.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.github.shizuki.common.core.model.BaseEntity;
import java.time.LocalDateTime;

@TableName("CTN_LA_BAL_BIND_SESSION")
public class LightAppBalanceBindSessionEntity extends BaseEntity {

    @TableField("user_id")
    private Long userId;

    @TableField("provider_code")
    private String providerCode;

    @TableField("target_account_id")
    private Long targetAccountId;

    @TableField("session_code")
    private String sessionCode;

    @TableField("status_code")
    private String statusCode;

    @TableField("qr_code_payload_text")
    private String qrCodePayload;

    @TableField("qr_code_image_url_text")
    private String qrCodeImageDataUrl;

    @TableField("login_url_text")
    private String loginUrl;

    @TableField("expires_datetime")
    private LocalDateTime expiresAt;

    @TableField("completed_datetime")
    private LocalDateTime completedAt;

    @TableField("failure_reason_text")
    private String failureReason;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getProviderCode() {
        return providerCode;
    }

    public void setProviderCode(String providerCode) {
        this.providerCode = providerCode;
    }

    public Long getTargetAccountId() {
        return targetAccountId;
    }

    public void setTargetAccountId(Long targetAccountId) {
        this.targetAccountId = targetAccountId;
    }

    public String getSessionCode() {
        return sessionCode;
    }

    public void setSessionCode(String sessionCode) {
        this.sessionCode = sessionCode;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getQrCodePayload() {
        return qrCodePayload;
    }

    public void setQrCodePayload(String qrCodePayload) {
        this.qrCodePayload = qrCodePayload;
    }

    public String getQrCodeImageDataUrl() {
        return qrCodeImageDataUrl;
    }

    public void setQrCodeImageDataUrl(String qrCodeImageDataUrl) {
        this.qrCodeImageDataUrl = qrCodeImageDataUrl;
    }

    public String getLoginUrl() {
        return loginUrl;
    }

    public void setLoginUrl(String loginUrl) {
        this.loginUrl = loginUrl;
    }

    public LocalDateTime getExpiresAt() {
        return expiresAt;
    }

    public void setExpiresAt(LocalDateTime expiresAt) {
        this.expiresAt = expiresAt;
    }

    public LocalDateTime getCompletedAt() {
        return completedAt;
    }

    public void setCompletedAt(LocalDateTime completedAt) {
        this.completedAt = completedAt;
    }

    public String getFailureReason() {
        return failureReason;
    }

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }
}
