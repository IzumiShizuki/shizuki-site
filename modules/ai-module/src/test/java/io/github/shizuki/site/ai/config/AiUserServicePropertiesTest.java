package io.github.shizuki.site.ai.config;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 * {@link AiUserServiceProperties} 配置约束测试。
 *
 * <p>验证 backoff / maxBackoff 之间的单调关系约束。
 */
class AiUserServicePropertiesTest {

    /**
     * 场景：先设置较小 maxBackoff，再设置更大 backoff。
     * 期望：maxBackoff 自动抬升，保持 maxBackoff >= backoff。
     */
    @Test
    void shouldAutoRaiseMaxBackoffWhenBackoffBecomesLarger() {
        AiUserServiceProperties properties = new AiUserServiceProperties();
        properties.setQuotaResolveRetryMaxBackoffMs(200L);

        properties.setQuotaResolveRetryBackoffMs(600L);

        assertThat(properties.getQuotaResolveRetryBackoffMs()).isEqualTo(600L);
        assertThat(properties.getQuotaResolveRetryMaxBackoffMs()).isEqualTo(600L);
    }

    /**
     * 场景：先设置 backoff，再设置更小 maxBackoff。
     * 期望：setter 顺序不影响约束结果，最终仍满足 maxBackoff >= backoff。
     */
    @Test
    void shouldKeepBackoffAndMaxBackoffConsistentRegardlessOfSetterOrder() {
        AiUserServiceProperties properties = new AiUserServiceProperties();
        properties.setQuotaResolveRetryBackoffMs(700L);
        properties.setQuotaResolveRetryMaxBackoffMs(300L);

        assertThat(properties.getQuotaResolveRetryBackoffMs()).isEqualTo(700L);
        assertThat(properties.getQuotaResolveRetryMaxBackoffMs()).isEqualTo(700L);
    }
}
