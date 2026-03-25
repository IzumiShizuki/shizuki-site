package io.github.shizuki.site.user.dto;

import java.time.LocalDateTime;

/**
 * 音乐源账号绑定会话状态响应。
 */
public class MusicSourceAccountBindSessionStatusResponse {

    private String provider;
    private String sessionId;
    private String status;
    private LocalDateTime expiresAt;
    private LocalDateTime completedAt;
    private String failureReason;

    public MusicSourceAccountBindSessionStatusResponse() {
    }

    public MusicSourceAccountBindSessionStatusResponse(String provider,
                                                       String sessionId,
                                                       String status,
                                                       LocalDateTime expiresAt,
                                                       LocalDateTime completedAt,
                                                       String failureReason) {
        this.provider = provider;
        this.sessionId = sessionId;
        this.status = status;
        this.expiresAt = expiresAt;
        this.completedAt = completedAt;
        this.failureReason = failureReason;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
