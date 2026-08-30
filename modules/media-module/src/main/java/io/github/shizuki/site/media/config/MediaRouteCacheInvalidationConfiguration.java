package io.github.shizuki.site.media.config;

import io.github.shizuki.site.media.service.revocation.MediaRouteCacheInvalidator;
import java.util.List;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 首期安全回源策略：没有实际 CDN purge 适配器时，只允许零 freshness 的公共媒体缓存。
 */
@Configuration
public class MediaRouteCacheInvalidationConfiguration {

    @Bean
    @ConditionalOnMissingBean(MediaRouteCacheInvalidator.class)
    public MediaRouteCacheInvalidator originRevalidationMediaRouteCacheInvalidator(
        MediaGatewayProperties properties
    ) {
        if (properties.getPublicMaxAgeSeconds() != 0) {
            throw new IllegalStateException(
                "a real CDN invalidator is required before public media max-age can exceed zero"
            );
        }
        return sitePaths -> validateOriginRevalidationMode(properties, sitePaths);
    }

    private void validateOriginRevalidationMode(MediaGatewayProperties properties, List<String> sitePaths) {
        if (sitePaths == null || sitePaths.isEmpty()
            || sitePaths.stream().anyMatch(path -> path == null
                || !path.startsWith("/api/v1/media/")
                || path.contains("://")
                || path.contains("?"))) {
            throw new IllegalArgumentException("only canonical site media paths can be invalidated");
        }
        // max-age=0 + must-revalidate means there is no fresh edge/browser representation to purge.
    }
}
