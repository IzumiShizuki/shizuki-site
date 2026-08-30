package io.github.shizuki.site.content.provider;

import java.net.URI;
import java.time.Duration;
import java.util.Set;

/** 固定的天气与语录 provider 网络边界。 */
public final class ExternalWidgetProviderPolicies {

    public static final ProviderHttpPolicy OPEN_METEO = new ProviderHttpPolicy(
        "OPEN_METEO",
        URI.create("https://api.open-meteo.com"),
        Set.of("api.open-meteo.com"),
        Duration.ofSeconds(2),
        Duration.ofSeconds(5),
        128 * 1024
    );

    public static final ProviderHttpPolicy HITOKOTO = new ProviderHttpPolicy(
        "HITOKOTO",
        URI.create("https://v1.hitokoto.cn"),
        Set.of("v1.hitokoto.cn"),
        Duration.ofSeconds(2),
        Duration.ofSeconds(4),
        32 * 1024
    );

    private ExternalWidgetProviderPolicies() {
    }
}
