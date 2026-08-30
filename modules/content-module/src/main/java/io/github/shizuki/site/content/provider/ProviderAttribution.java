package io.github.shizuki.site.content.provider;

import java.net.URI;

/** 访客界面必须可见的 provider 归属信息。 */
public record ProviderAttribution(String name, URI destination) {

    public ProviderAttribution {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("provider attribution name is required");
        }
        if (destination == null || !"https".equalsIgnoreCase(destination.getScheme())) {
            throw new IllegalArgumentException("provider attribution must use HTTPS");
        }
        name = name.trim();
    }
}
