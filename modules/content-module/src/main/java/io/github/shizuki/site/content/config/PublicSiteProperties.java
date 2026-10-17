package io.github.shizuki.site.content.config;

import java.net.URI;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "shizuki.content")
public class PublicSiteProperties {

    private String publicSiteUrl = "https://site.shizuki.online";

    public String getPublicSiteUrl() {
        return publicSiteUrl;
    }

    public void setPublicSiteUrl(String value) {
        URI uri = URI.create(value == null ? "" : value.trim());
        if (!isWeb(uri) || uri.getRawUserInfo() != null || uri.getRawQuery() != null
            || uri.getRawFragment() != null || (uri.getPath() != null && !uri.getPath().matches("/?"))) {
            throw new IllegalArgumentException("public-site-url must be an HTTP(S) origin without credentials or a path");
        }
        publicSiteUrl = uri.toString().replaceAll("/+$", "");
    }

    public String url(String path) {
        if (path == null || !path.startsWith("/") || path.startsWith("//")) {
            throw new IllegalArgumentException("A site-owned absolute path is required");
        }
        return publicSiteUrl + path;
    }

    public String image(String value) {
        if (value == null || value.isBlank()) return null;
        try {
            URI uri = URI.create(value.trim());
            if (!uri.isAbsolute() && value.startsWith("/") && !value.startsWith("//")) uri = URI.create(url(value));
            if (!isWeb(uri) || uri.getRawUserInfo() != null || uri.getRawQuery() != null
                || uri.getRawFragment() != null) return null;
            return uri.toASCIIString();
        } catch (IllegalArgumentException exception) {
            return null;
        }
    }

    private static boolean isWeb(URI uri) {
        return uri.getHost() != null && ("https".equalsIgnoreCase(uri.getScheme()) || "http".equalsIgnoreCase(uri.getScheme()));
    }
}
