package io.github.shizuki.site.user.response;

import java.time.LocalDateTime;

/**
 * 音乐源账号绑定会话创建响应。
 */
public class MusicSourceAccountBindSessionCreateResponse {

    private String provider;
    private String sessionId;
    private String bindToken;
    private String status;
    private String loginUrl;
    private String loginMode;
    private String qrUrl;
    private String qrImage;
    private String qrStatus;
    private String qrMessage;
    private Integer pollIntervalMs;
    private LocalDateTime expiresAt;

    public MusicSourceAccountBindSessionCreateResponse() {
    }

    public MusicSourceAccountBindSessionCreateResponse(String provider,
                                                       String sessionId,
                                                       String bindToken,
                                                       String status,
                                                       String loginUrl,
                                                       String loginMode,
                                                       String qrUrl,
                                                       String qrImage,
                                                       String qrStatus,
                                                       String qrMessage,
                                                       Integer pollIntervalMs,
                                                       LocalDateTime expiresAt) {
        this.provider = provider;
        this.sessionId = sessionId;
        this.bindToken = bindToken;
        this.status = status;
        this.loginUrl = loginUrl;
        this.loginMode = loginMode;
        this.qrUrl = qrUrl;
        this.qrImage = qrImage;
        this.qrStatus = qrStatus;
        this.qrMessage = qrMessage;
        this.pollIntervalMs = pollIntervalMs;
        this.expiresAt = expiresAt;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getBindToken() {
        return bindToken;
    }

    public void setBindToken(String bindToken) {
        this.bindToken = bindToken;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLoginUrl() {
        return loginUrl;
    }

    public void setLoginUrl(String loginUrl) {
        this.loginUrl = loginUrl;
    }

    public String getLoginMode() {
        return loginMode;
    }

    public void setLoginMode(String loginMode) {
        this.loginMode = loginMode;
    }

    public String getQrUrl() {
        return qrUrl;
    }

    public void setQrUrl(String qrUrl) {
        this.qrUrl = qrUrl;
    }

    public String getQrImage() {
        return qrImage;
    }

    public void setQrImage(String qrImage) {
        this.qrImage = qrImage;
    }

    public String getQrStatus() {
        return qrStatus;
    }

    public void setQrStatus(String qrStatus) {
        this.qrStatus = qrStatus;
    }

    public String getQrMessage() {
        return qrMessage;
    }

    public void setQrMessage(String qrMessage) {
        this.qrMessage = qrMessage;
    }

    public Integer getPollIntervalMs() {
        return pollIntervalMs;
    }

    public void setPollIntervalMs(Integer pollIntervalMs) {
        this.pollIntervalMs = pollIntervalMs;
    }

    public LocalDateTime getExpiresAt() {
        return expiresAt;
    }

    public void setExpiresAt(LocalDateTime expiresAt) {
        this.expiresAt = expiresAt;
    }
}
