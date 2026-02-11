package io.github.shizuki.common.oauth.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties({OAuthProperties.class, OAuthProviderProperties.class})
public class OAuthAutoConfiguration {
}
