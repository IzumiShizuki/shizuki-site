package io.github.shizuki.common.audit.service.impl;

import io.github.shizuki.common.audit.config.AuditPublisherProperties;
import io.github.shizuki.common.audit.model.AuditOutboxEvent;
import io.github.shizuki.common.audit.service.AuditOutboxPublisher;
import java.util.concurrent.TimeUnit;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Component;

/**
 * Kafka 审计发布器实现。
 */
@Component
public class KafkaAuditOutboxPublisher implements AuditOutboxPublisher {

    /**
     * 发布器配置属性。
     */
    private final AuditPublisherProperties properties;
    /**
     * KafkaTemplate 延迟提供者。
     */
    private final ObjectProvider<KafkaTemplate<String, String>> kafkaTemplateProvider;

    /**
     * 构造 Kafka 审计发布器。
     *
     * @param properties 发布器配置
     * @param kafkaTemplateProvider KafkaTemplate 延迟提供者
     */
    public KafkaAuditOutboxPublisher(AuditPublisherProperties properties,
                                     ObjectProvider<KafkaTemplate<String, String>> kafkaTemplateProvider) {
        this.properties = properties;
        this.kafkaTemplateProvider = kafkaTemplateProvider;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String type() {
        return "kafka";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void publish(AuditOutboxEvent event) {
        KafkaTemplate<String, String> kafkaTemplate = kafkaTemplateProvider.getIfAvailable();
        if (kafkaTemplate == null) {
            throw new IllegalStateException("KafkaTemplate not configured");
        }

        try {
            SendResult<String, String> result = kafkaTemplate.send(
                properties.getKafkaTopic(),
                buildKey(event),
                event.payloadJson()
            ).get(properties.getKafkaSendTimeoutMs(), TimeUnit.MILLISECONDS);

            if (result == null || result.getRecordMetadata() == null) {
                throw new IllegalStateException("Kafka send result is empty");
            }
        } catch (InterruptedException ex) {
            // 线程中断状态要保留给上层调用链处理。
            Thread.currentThread().interrupt();
            throw new IllegalStateException("Kafka publish interrupted", ex);
        } catch (Exception ex) {
            // 具体重试交给 outbox 调度，不在 publisher 内部重试，避免双重退避。
            throw new IllegalStateException("Kafka publish failed", ex);
        }
    }

    /**
     * 生成 Kafka 消息键。
     *
     * @param event outbox 事件
     * @return 消息键
     */
    private String buildKey(AuditOutboxEvent event) {
        return event.eventType() + ":" + event.id();
    }
}
