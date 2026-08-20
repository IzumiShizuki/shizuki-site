package io.github.shizuki.site.content.support;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/** Activates configuration binding for the KJ tool source. */
@Configuration(proxyBeanMethods = false)
@EnableConfigurationProperties(KjToolSourceProperties.class)
public class KjToolSourceConfiguration {
}
