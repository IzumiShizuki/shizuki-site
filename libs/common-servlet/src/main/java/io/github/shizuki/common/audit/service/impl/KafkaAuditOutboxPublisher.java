package io.github.shizuki.common.audit.service.impl;

import io.github.shizuki.common.audit.config.AuditPublisherProperties;
import io.github.shizuki.common.audit.model.AuditOutboxEvent;
import io.github.shizuki.common.audit.service.AuditOutboxPublisher;
import java.util.concurrent.TimeUnit;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Component;

@Component
public class KafkaAuditOutboxPublisher implements AuditOutboxPublisher {

    private final AuditPublisherProperties properties;
    private final ObjectProvider<KafkaTemplate<String, String>> kafkaTemplateProvider;

    public KafkaAuditOutboxPublisher(AuditPublisherProperties properties,
                                     ObjectProvider<KafkaTemplate<String, String>> kafkaTemplateProvider) {
        this.properties = properties;
        this.kafkaTemplateProvider = kafkaTemplateProvider;
    }

    @Override
    public String type() {
        return "kafka";
    }

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
            Thread.currentThread().interrupt();
            throw new IllegalStateException("Kafka publish interrupted", ex);
        } catch (Exception ex) {
            // 具体重试交给 outbox 调度，不在 publisher 内部重试，避免双重退避。
            throw new IllegalStateException("Kafka publish failed", ex);
        }
    }

    private String buildKey(AuditOutboxEvent event) {
        return event.eventType() + ":" + event.id();
    }
}
