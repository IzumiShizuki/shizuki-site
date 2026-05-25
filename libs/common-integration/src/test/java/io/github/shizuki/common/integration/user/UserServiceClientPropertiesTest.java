package io.github.shizuki.common.integration.user;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * {@link UserServiceClientProperties} 配置约束测试。
 *
 * <p>验证 backoff / maxBackoff 之间的单调关系约束（继承自原 AiUserServiceProperties）。
 */
class UserServiceClientPropertiesTest {

    @Test
    void shouldAutoRaiseMaxBackoffWhenBackoffBecomesLarger() {
        UserServiceClientProperties properties = new UserServiceClientProperties();
        properties.setQuotaResolveRetryBackoffMs(50L);
        properties.setQuotaResolveRetryMaxBackoffMs(200L);

        properties.setQuotaResolveRetryBackoffMs(500L);

        assertEquals(500L, properties.getQuotaResolveRetryBackoffMs());
        assertTrue(
            properties.getQuotaResolveRetryMaxBackoffMs() >= properties.getQuotaResolveRetryBackoffMs(),
            "max backoff should track backoff when backoff grows past max"
        );
    }

    @Test
    void shouldKeepBackoffAndMaxBackoffConsistentRegardlessOfSetterOrder() {
        UserServiceClientProperties properties = new UserServiceClientProperties();
        properties.setQuotaResolveRetryBackoffMs(700L);
        properties.setQuotaResolveRetryMaxBackoffMs(300L);

        assertEquals(700L, properties.getQuotaResolveRetryBackoffMs());
        assertTrue(
            properties.getQuotaResolveRetryMaxBackoffMs() >= properties.getQuotaResolveRetryBackoffMs(),
            "max backoff must not be set below backoff"
        );
    }

    @Test
    void shouldClampMinimumValuesOnConstruction() {
        UserServiceClientProperties properties = new UserServiceClientProperties();
        // Defaults must be sane
        assertTrue(properties.getTimeoutMs() >= 200L);
        assertTrue(properties.getQuotaResolveConnectTimeoutMs() >= 100L);
        assertTrue(properties.getQuotaResolveTimeoutMs() >= 200L);
        assertTrue(properties.getQuotaResolveRetryCount() >= 0);

        // Setter clamps
        properties.setTimeoutMs(50L);
        assertEquals(200L, properties.getTimeoutMs());

        properties.setQuotaResolveRetryCount(-3);
        assertEquals(0, properties.getQuotaResolveRetryCount());
    }
}
