package io.github.shizuki.site.content.provider.weather;

import io.github.shizuki.site.content.provider.ProviderAttribution;

/** 站点天气上游适配边界。访客请求不得直接绕过快照/缓存服务调用它。 */
public interface WeatherProvider {

    String providerCode();

    ProviderAttribution attribution();

    NormalizedWeather fetch(WeatherProviderRequest request);
}
