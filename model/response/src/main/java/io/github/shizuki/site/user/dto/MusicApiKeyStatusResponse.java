package io.github.shizuki.site.user.dto;

import java.time.LocalDateTime;

/**
 * 音乐 provider API Key 绑定状态响应。
 *
 * <p>仅返回掩码和更新时间，不返回明文 key。
 */
public class MusicApiKeyStatusResponse {

    /**
     * provider 编码（如 tunehub / spotify）。
     */
    private String provider;
    /**
     * 是否已绑定 key。
     */
    private boolean keyBound;
    /**
     * key 掩码（如 sk-****abcd）。
     */
    private String keyMask;
    /**
     * 最近更新时间。
     */
    private LocalDateTime updatedAt;

    public MusicApiKeyStatusResponse() {
    }

    public MusicApiKeyStatusResponse(String provider, boolean keyBound, String keyMask, LocalDateTime updatedAt) {
        this.provider = provider;
        this.keyBound = keyBound;
        this.keyMask = keyMask;
        this.updatedAt = updatedAt;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public boolean isKeyBound() {
        return keyBound;
    }

    public void setKeyBound(boolean keyBound) {
        this.keyBound = keyBound;
    }

    public String getKeyMask() {
        return keyMask;
    }

    public void setKeyMask(String keyMask) {
        this.keyMask = keyMask;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}
