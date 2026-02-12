package io.github.shizuki.common.audit.service;

import io.github.shizuki.common.audit.config.AuditPublisherProperties;
import io.github.shizuki.common.audit.model.AuditOutboxEvent;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * 审计发布器路由器。
 *
 * <p>根据配置中的 publisher 类型路由到对应实现，未知类型回退 noop。
 */
@Service
public class AuditOutboxPublisherRouter {

    /**
     * 日志组件。
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(AuditOutboxPublisherRouter.class);

    /**
     * 发布器配置。
     */
    private final AuditPublisherProperties properties;
    /**
     * 发布器映射表。
     */
    private final Map<String, AuditOutboxPublisher> publisherByType;
    /**
     * 默认发布器（优先 noop）。
     */
    private final AuditOutboxPublisher defaultPublisher;

    /**
     * 构造发布器路由器。
     *
     * @param properties 发布器配置
     * @param publishers Spring 注入的发布器实现列表
     */
    public AuditOutboxPublisherRouter(AuditPublisherProperties properties,
                                      List<AuditOutboxPublisher> publishers) {
        this.properties = properties;
        this.publisherByType = new HashMap<>();
        for (AuditOutboxPublisher publisher : publishers) {
            publisherByType.put(normalizeType(publisher.type()), publisher);
        }
        this.defaultPublisher = publisherByType.getOrDefault("noop", publishers.get(0));
    }

    /**
     * 路由并发布 outbox 事件。
     *
     * @param event outbox 事件
     */
    public void publish(AuditOutboxEvent event) {
        String configuredType = normalizeType(properties.getType());
        AuditOutboxPublisher publisher = publisherByType.get(configuredType);
        if (publisher == null) {
            LOGGER.warn("Unknown audit publisher type={}, fallback to noop", configuredType);
            publisher = defaultPublisher;
        }
        publisher.publish(event);
    }

    /**
     * 类型值归一化。
     *
     * @param value 原始类型值
     * @return 小写类型值，空值返回 noop
     */
    private String normalizeType(String value) {
        return StringUtils.hasText(value) ? value.trim().toLowerCase(Locale.ROOT) : "noop";
    }
}
