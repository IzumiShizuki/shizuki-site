package io.github.shizuki.common.audit.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 审计发布器配置属性。
 *
 * <p>对应配置前缀：{@code shizuki.audit.publisher}。
 */
@Component
@ConfigurationProperties(prefix = "shizuki.audit.publisher")
public class AuditPublisherProperties {

    /**
     * 发布器类型（noop / kafka / elk）。
     */
    private String type = "noop";
    /**
     * Kafka 目标 topic。
     */
    private String kafkaTopic = "shizuki.audit.log";
    /**
     * Kafka 发送超时毫秒数。
     */
    private long kafkaSendTimeoutMs = 3000L;

    /**
     * 获取发布器类型。
     *
     * @return 发布器类型
     */
    public String getType() {
        return type;
    }

    /**
     * 设置发布器类型。
     *
     * @param type 发布器类型
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取 Kafka topic。
     *
     * @return Kafka topic
     */
    public String getKafkaTopic() {
        return kafkaTopic;
    }

    /**
     * 设置 Kafka topic。
     *
     * @param kafkaTopic Kafka topic
     */
    public void setKafkaTopic(String kafkaTopic) {
        this.kafkaTopic = kafkaTopic;
    }

    /**
     * 获取 Kafka 发送超时毫秒数。
     *
     * @return 发送超时毫秒数
     */
    public long getKafkaSendTimeoutMs() {
        return kafkaSendTimeoutMs;
    }

    /**
     * 设置 Kafka 发送超时毫秒数。
     *
     * @param kafkaSendTimeoutMs 发送超时毫秒数
     */
    public void setKafkaSendTimeoutMs(long kafkaSendTimeoutMs) {
        this.kafkaSendTimeoutMs = Math.max(500L, kafkaSendTimeoutMs);
    }
}
