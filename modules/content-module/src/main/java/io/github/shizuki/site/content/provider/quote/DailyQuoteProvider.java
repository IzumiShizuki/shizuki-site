package io.github.shizuki.site.content.provider.quote;

import io.github.shizuki.site.content.provider.ProviderAttribution;

/** 每日语录上游适配边界。访客读取和“换一句”不得直接调用它。 */
public interface DailyQuoteProvider {

    String providerCode();

    ProviderAttribution attribution();

    NormalizedDailyQuote fetch();
}
