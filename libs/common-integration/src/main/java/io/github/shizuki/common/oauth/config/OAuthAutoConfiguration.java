package io.github.shizuki.common.oauth.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * OAuth 自动配置入口。
 *
 * <p>启用 OAuth 基础配置与 provider map 配置属性绑定，供业务服务按需注入使用。
 */
@Configuration
@EnableConfigurationProperties({OAuthProperties.class, OAuthProviderProperties.class})
public class OAuthAutoConfiguration {
}
