package io.github.shizuki.common.security.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 管理员二次权限码验证配置。
 */
@Component
@ConfigurationProperties(prefix = "shizuki.admin.privilege")
public class AdminPrivilegeProperties {

    /**
     * 二次验证解锁有效期（秒）。
     */
    private long unlockTtlSeconds = 1800L;

    /**
     * 权限码哈希值（推荐 BCrypt）。
     */
    private String codeHash = "";

    /**
     * 权限码明文（仅开发兜底）。
     */
    private String codePlain = "";

    public long getUnlockTtlSeconds() {
        return unlockTtlSeconds;
    }

    public void setUnlockTtlSeconds(long unlockTtlSeconds) {
        this.unlockTtlSeconds = Math.max(60L, unlockTtlSeconds);
    }

    public String getCodeHash() {
        return codeHash;
    }

    public void setCodeHash(String codeHash) {
        this.codeHash = codeHash == null ? "" : codeHash.trim();
    }

    public String getCodePlain() {
        return codePlain;
    }

    public void setCodePlain(String codePlain) {
        this.codePlain = codePlain == null ? "" : codePlain;
    }
}
