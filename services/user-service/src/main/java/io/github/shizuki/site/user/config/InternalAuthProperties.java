package io.github.shizuki.site.user.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 服务间内部鉴权配置。
 */
@Component
@ConfigurationProperties(prefix = "shizuki.internal.auth")
public class InternalAuthProperties {

    /**
     * 服务间共享签名密钥。
     */
    private String sharedSecret = "";

    /**
     * 时间戳允许偏差（秒）。
     */
    private long clockSkewSeconds = 300L;

    /**
     * nonce 过期时间（秒）。
     */
    private long nonceTtlSeconds = 300L;

    public String getSharedSecret() {
        return sharedSecret;
    }

    public void setSharedSecret(String sharedSecret) {
        this.sharedSecret = sharedSecret;
    }

    public long getClockSkewSeconds() {
        return clockSkewSeconds;
    }

    public void setClockSkewSeconds(long clockSkewSeconds) {
        this.clockSkewSeconds = Math.max(30L, clockSkewSeconds);
    }

    public long getNonceTtlSeconds() {
        return nonceTtlSeconds;
    }

    public void setNonceTtlSeconds(long nonceTtlSeconds) {
        this.nonceTtlSeconds = Math.max(30L, nonceTtlSeconds);
    }
}
