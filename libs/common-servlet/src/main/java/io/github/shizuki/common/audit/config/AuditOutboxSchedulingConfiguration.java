package io.github.shizuki.common.audit.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * 审计 outbox 调度开关配置。
 *
 * <p>启用 Spring Scheduling，以驱动 outbox 定时重试任务。
 */
@Configuration
@EnableScheduling
public class AuditOutboxSchedulingConfiguration {
}
