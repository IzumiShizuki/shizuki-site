package io.github.shizuki.site.user.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 音乐安全配置。
 *
 * <p>当前仅包含用户 provider API Key 的加密主密钥。
 */
@Component
@ConfigurationProperties(prefix = "shizuki.music.security")
public class MusicSecurityProperties {

    /**
     * Base64 编码的 32 字节主密钥（AES-256）。
     */
    private String keyEncryptionMasterKey = "";

    public String getKeyEncryptionMasterKey() {
        return keyEncryptionMasterKey;
    }

    public void setKeyEncryptionMasterKey(String keyEncryptionMasterKey) {
        this.keyEncryptionMasterKey = keyEncryptionMasterKey;
    }
}
