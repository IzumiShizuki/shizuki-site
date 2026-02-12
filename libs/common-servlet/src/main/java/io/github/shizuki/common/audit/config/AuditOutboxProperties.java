package io.github.shizuki.common.audit.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 审计 outbox 调度配置属性。
 *
 * <p>对应配置前缀：{@code shizuki.audit.outbox}。
 */
@Component
@ConfigurationProperties(prefix = "shizuki.audit.outbox")
public class AuditOutboxProperties {

    /**
     * 是否启用 outbox 任务。
     */
    private boolean enabled = true;
    /**
     * 每次扫描批量大小。
     */
    private int batchSize = 100;
    /**
     * 扫描间隔毫秒数。
     */
    private long pollInterval = 5000L;
    /**
     * 最大重试次数。
     */
    private int maxRetries = 5;
    /**
     * 指数退避基础秒数。
     */
    private int retryBaseSeconds = 5;
    /**
     * 指数退避最大秒数。
     */
    private int retryMaxSeconds = 300;
    /**
     * PROCESSING 状态超时回收阈值（秒）。
     */
    private int processingTimeoutSeconds = 300;

    /**
     * 是否启用 outbox。
     *
     * @return true 表示启用
     */
    public boolean isEnabled() {
        return enabled;
    }

    /**
     * 设置是否启用 outbox。
     *
     * @param enabled 启用标记
     */
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * 获取批量大小。
     *
     * @return 批量大小
     */
    public int getBatchSize() {
        return batchSize;
    }

    /**
     * 设置批量大小。
     *
     * @param batchSize 批量大小
     */
    public void setBatchSize(int batchSize) {
        this.batchSize = Math.max(batchSize, 1);
    }

    /**
     * 获取轮询间隔毫秒数。
     *
     * @return 轮询间隔
     */
    public long getPollInterval() {
        return pollInterval;
    }

    /**
     * 设置轮询间隔毫秒数。
     *
     * @param pollInterval 轮询间隔
     */
    public void setPollInterval(long pollInterval) {
        this.pollInterval = Math.max(pollInterval, 1000L);
    }

    /**
     * 获取最大重试次数。
     *
     * @return 最大重试次数
     */
    public int getMaxRetries() {
        return maxRetries;
    }

    /**
     * 设置最大重试次数。
     *
     * @param maxRetries 最大重试次数
     */
    public void setMaxRetries(int maxRetries) {
        this.maxRetries = Math.max(maxRetries, 1);
    }

    /**
     * 获取基础退避秒数。
     *
     * @return 基础退避秒数
     */
    public int getRetryBaseSeconds() {
        return retryBaseSeconds;
    }

    /**
     * 设置基础退避秒数。
     *
     * @param retryBaseSeconds 基础退避秒数
     */
    public void setRetryBaseSeconds(int retryBaseSeconds) {
        this.retryBaseSeconds = Math.max(retryBaseSeconds, 1);
    }

    /**
     * 获取最大退避秒数。
     *
     * @return 最大退避秒数
     */
    public int getRetryMaxSeconds() {
        return retryMaxSeconds;
    }

    /**
     * 设置最大退避秒数。
     *
     * @param retryMaxSeconds 最大退避秒数
     */
    public void setRetryMaxSeconds(int retryMaxSeconds) {
        this.retryMaxSeconds = Math.max(retryMaxSeconds, 1);
    }

    /**
     * 获取 PROCESSING 状态超时回收阈值（秒）。
     *
     * @return 超时回收阈值（秒）
     */
    public int getProcessingTimeoutSeconds() {
        return processingTimeoutSeconds;
    }

    /**
     * 设置 PROCESSING 状态超时回收阈值（秒）。
     *
     * @param processingTimeoutSeconds 超时回收阈值（秒）
     */
    public void setProcessingTimeoutSeconds(int processingTimeoutSeconds) {
        this.processingTimeoutSeconds = Math.max(processingTimeoutSeconds, 30);
    }
}
