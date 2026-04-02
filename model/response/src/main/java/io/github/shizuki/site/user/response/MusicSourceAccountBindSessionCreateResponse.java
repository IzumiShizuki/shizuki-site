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
    private LocalDateTime expiresAt;

    public MusicSourceAccountBindSessionCreateResponse() {
    }

    public MusicSourceAccountBindSessionCreateResponse(String provider,
                                                       String sessionId,
                                                       String bindToken,
                                                       String status,
                                                       String loginUrl,
                                                       LocalDateTime expiresAt) {
        this.provider = provider;
        this.sessionId = sessionId;
        this.bindToken = bindToken;
        this.status = status;
        this.loginUrl = loginUrl;
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

    public LocalDateTime getExpiresAt() {
        return expiresAt;
    }

    public void setExpiresAt(LocalDateTime expiresAt) {
        this.expiresAt = expiresAt;
    }
}
