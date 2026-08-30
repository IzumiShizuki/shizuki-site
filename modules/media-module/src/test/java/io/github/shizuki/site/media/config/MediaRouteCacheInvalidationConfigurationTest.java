package io.github.shizuki.site.media.config;

import static org.assertj.core.api.Assertions.assertThatCode;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import io.github.shizuki.site.media.service.revocation.MediaRouteCacheInvalidator;
import java.util.List;
import org.junit.jupiter.api.Test;

class MediaRouteCacheInvalidationConfigurationTest {

    @Test
    void originRevalidationModeIsSafeOnlyWithZeroFreshness() {
        MediaGatewayProperties properties = properties(0);
        MediaRouteCacheInvalidator invalidator = new MediaRouteCacheInvalidationConfiguration()
            .originRevalidationMediaRouteCacheInvalidator(properties);

        assertThatCode(() -> invalidator.invalidate(List.of(
            "/api/v1/media/med_012345678901234567890123456/variants/DISPLAY_WEBP"
        ))).doesNotThrowAnyException();

        assertThatThrownBy(() -> new MediaRouteCacheInvalidationConfiguration()
            .originRevalidationMediaRouteCacheInvalidator(properties(60)))
            .isInstanceOf(IllegalStateException.class)
            .hasMessageContaining("real CDN invalidator");
    }

    private MediaGatewayProperties properties(long maxAge) {
        MediaGatewayProperties properties = new MediaGatewayProperties();
        properties.setCapabilitySecret("test-media-gateway-capability-secret-1234567890");
        properties.setPublicMaxAgeSeconds(maxAge);
        properties.afterPropertiesSet();
        return properties;
    }
}
