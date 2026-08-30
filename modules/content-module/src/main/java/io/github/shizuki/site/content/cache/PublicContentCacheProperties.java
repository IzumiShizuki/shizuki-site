package io.github.shizuki.site.content.cache;

import java.time.Duration;
import java.util.Objects;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/** Short-lived Redis TTLs for visitor-safe Album and Moment presentations. */
@Component
@ConfigurationProperties(prefix = "shizuki.content.public-cache")
public class PublicContentCacheProperties {

    private static final Duration MAX_TTL = Duration.ofMinutes(5);

    private Duration listTtl = Duration.ofSeconds(30);
    private Duration featuredTtl = Duration.ofSeconds(30);
    private Duration detailTtl = Duration.ofSeconds(45);

    public Duration getListTtl() {
        return listTtl;
    }

    public void setListTtl(Duration listTtl) {
        this.listTtl = requireShortTtl(listTtl, "listTtl");
    }

    public Duration getFeaturedTtl() {
        return featuredTtl;
    }

    public void setFeaturedTtl(Duration featuredTtl) {
        this.featuredTtl = requireShortTtl(featuredTtl, "featuredTtl");
    }

    public Duration getDetailTtl() {
        return detailTtl;
    }

    public void setDetailTtl(Duration detailTtl) {
        this.detailTtl = requireShortTtl(detailTtl, "detailTtl");
    }

    private static Duration requireShortTtl(Duration value, String name) {
        Duration ttl = Objects.requireNonNull(value, name);
        if (ttl.isZero() || ttl.isNegative() || ttl.compareTo(MAX_TTL) > 0) {
            throw new IllegalArgumentException(name + " must be between 1 millisecond and 5 minutes");
        }
        return ttl;
    }
}
