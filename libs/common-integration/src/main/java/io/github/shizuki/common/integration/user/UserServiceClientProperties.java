package io.github.shizuki.common.integration.user;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 配额客户端访问 user-module 的共享配置（前缀 {@code shizuki.user}）。
 *
 * <p>历史上 ai-module 与 media-module 各自维护了 {@code AiUserServiceProperties} /
 * {@code MediaUserServiceProperties}，前缀都是 {@code shizuki.user}，形成跨模块的
 * 隐式耦合（评审 finding {@code 3a980dada098}）。此处统一归并到
 * {@code libs/common-integration}。
 *
 * <p>当前单体模式下大部分字段未被实际注入，是为"未来微服务拆分"预留的客户端配置：
 * 当 user-module 拆为独立进程时，{@link UserServicePortAdapter} 将被替换为基于这些
 * 字段的 HTTP / gRPC 客户端。
 */
@Component
@ConfigurationProperties(prefix = "shizuki.user")
public class UserServiceClientProperties {

    /** user-service 的 base URL（单体模式下不使用）。 */
    private String serviceUri = "http://localhost:8081";

    /** 通用调用超时（毫秒）。 */
    private long timeoutMs = 1200L;

    /** 配额解析连接超时（毫秒）。 */
    private long quotaResolveConnectTimeoutMs = 500L;

    /** 配额解析整体超时（毫秒）。 */
    private long quotaResolveTimeoutMs = 1200L;

    /** 配额解析重试次数。 */
    private int quotaResolveRetryCount = 1;

    /** 配额解析重试初始 backoff（毫秒）。 */
    private long quotaResolveRetryBackoffMs = 120L;

    /** 配额解析重试最大 backoff（毫秒）。 */
    private long quotaResolveRetryMaxBackoffMs = 1000L;

    public String getServiceUri() {
        return serviceUri;
    }

    public void setServiceUri(String serviceUri) {
        this.serviceUri = serviceUri;
    }

    public long getTimeoutMs() {
        return timeoutMs;
    }

    public void setTimeoutMs(long timeoutMs) {
        this.timeoutMs = Math.max(200L, timeoutMs);
    }

    public long getQuotaResolveConnectTimeoutMs() {
        return quotaResolveConnectTimeoutMs;
    }

    public void setQuotaResolveConnectTimeoutMs(long quotaResolveConnectTimeoutMs) {
        this.quotaResolveConnectTimeoutMs = Math.max(100L, quotaResolveConnectTimeoutMs);
    }

    public long getQuotaResolveTimeoutMs() {
        return quotaResolveTimeoutMs;
    }

    public void setQuotaResolveTimeoutMs(long quotaResolveTimeoutMs) {
        this.quotaResolveTimeoutMs = Math.max(200L, quotaResolveTimeoutMs);
    }

    public int getQuotaResolveRetryCount() {
        return quotaResolveRetryCount;
    }

    public void setQuotaResolveRetryCount(int quotaResolveRetryCount) {
        this.quotaResolveRetryCount = Math.max(0, quotaResolveRetryCount);
    }

    public long getQuotaResolveRetryBackoffMs() {
        return quotaResolveRetryBackoffMs;
    }

    public void setQuotaResolveRetryBackoffMs(long quotaResolveRetryBackoffMs) {
        long val = Math.max(20L, quotaResolveRetryBackoffMs);
        this.quotaResolveRetryBackoffMs = val;
        if (val > this.quotaResolveRetryMaxBackoffMs) {
            this.quotaResolveRetryMaxBackoffMs = val;
        }
    }

    public long getQuotaResolveRetryMaxBackoffMs() {
        return quotaResolveRetryMaxBackoffMs;
    }

    public void setQuotaResolveRetryMaxBackoffMs(long quotaResolveRetryMaxBackoffMs) {
        long val = Math.max(this.quotaResolveRetryBackoffMs, quotaResolveRetryMaxBackoffMs);
        this.quotaResolveRetryMaxBackoffMs = val;
    }
}
