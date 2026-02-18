package io.github.shizuki.site.user.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.github.shizuki.common.core.model.BaseEntity;

/**
 * 用户第三方 provider 密钥实体。
 *
 * <p>仅保存密文与掩码，明文仅在业务运行时短暂存在内存。
 */
@TableName("USR_PROVIDER_SECRET")
public class UserProviderSecretEntity extends BaseEntity {

    /**
     * 归属用户 ID。
     */
    @TableField("user_id")
    private Long userId;

    /**
     * provider 编码。
     */
    @TableField("provider_code")
    private String providerCode;

    /**
     * API Key 密文（AES-GCM + Base64）。
     */
    @TableField("cipher_text")
    private String cipherText;

    /**
     * API Key 掩码（供前端展示）。
     */
    @TableField("key_mask")
    private String keyMask;

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

    public String getCipherText() {
        return cipherText;
    }

    public void setCipherText(String cipherText) {
        this.cipherText = cipherText;
    }

    public String getKeyMask() {
        return keyMask;
    }

    public void setKeyMask(String keyMask) {
        this.keyMask = keyMask;
    }
}
