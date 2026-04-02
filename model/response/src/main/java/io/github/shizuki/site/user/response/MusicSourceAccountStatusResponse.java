package io.github.shizuki.site.user.response;

import java.time.LocalDateTime;

/**
 * 音乐源账号绑定状态响应。
 */
public class MusicSourceAccountStatusResponse {

    private String provider;
    private String authType;
    private boolean bound;
    private String mask;
    private String status;
    private LocalDateTime updatedAt;
    private LocalDateTime lastVerifiedAt;
    private LocalDateTime expireAt;

    public MusicSourceAccountStatusResponse() {
    }

    public MusicSourceAccountStatusResponse(String provider,
                                            String authType,
                                            boolean bound,
                                            String mask,
                                            String status,
                                            LocalDateTime updatedAt,
                                            LocalDateTime lastVerifiedAt,
                                            LocalDateTime expireAt) {
        this.provider = provider;
        this.authType = authType;
        this.bound = bound;
        this.mask = mask;
        this.status = status;
        this.updatedAt = updatedAt;
        this.lastVerifiedAt = lastVerifiedAt;
        this.expireAt = expireAt;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getAuthType() {
        return authType;
    }

    public void setAuthType(String authType) {
        this.authType = authType;
    }

    public boolean isBound() {
        return bound;
    }

    public void setBound(boolean bound) {
        this.bound = bound;
    }

    public String getMask() {
        return mask;
    }

    public void setMask(String mask) {
        this.mask = mask;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public LocalDateTime getLastVerifiedAt() {
        return lastVerifiedAt;
    }

    public void setLastVerifiedAt(LocalDateTime lastVerifiedAt) {
        this.lastVerifiedAt = lastVerifiedAt;
    }

    public LocalDateTime getExpireAt() {
        return expireAt;
    }

    public void setExpireAt(LocalDateTime expireAt) {
        this.expireAt = expireAt;
    }
}
