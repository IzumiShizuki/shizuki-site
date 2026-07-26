package io.github.shizuki.site.content.support;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/** 激活 Web Toolbox 翻译代理的配置绑定。 */
@Configuration(proxyBeanMethods = false)
@EnableConfigurationProperties(TranslateToolProperties.class)
public class TranslateToolConfiguration {
}
