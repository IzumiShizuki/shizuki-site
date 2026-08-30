package io.github.shizuki.site.content.provider;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import io.github.shizuki.site.content.provider.quote.NormalizedDailyQuote;
import io.github.shizuki.site.content.provider.weather.NormalizedWeather;
import io.github.shizuki.site.content.provider.weather.NormalizedWeatherDay;
import io.github.shizuki.site.content.provider.weather.WeatherProviderRequest;
import java.math.BigDecimal;
import java.net.URI;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;
import org.junit.jupiter.api.Test;

class NormalizedProviderModelTest {

    private static final ProviderAttribution ATTRIBUTION = new ProviderAttribution(
        "Open-Meteo",
        URI.create("https://open-meteo.com")
    );

    @Test
    void weatherRequestAndFactsRejectOutOfRangeOrFabricatedValues() {
        assertThatThrownBy(() -> new WeatherProviderRequest(
            BigDecimal.valueOf(90.01),
            BigDecimal.ZERO,
            ZoneId.of("Asia/Shanghai"),
            "site"
        )).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> new NormalizedWeather(
            "OPEN_METEO",
            "site",
            Double.NaN,
            18,
            55,
            1,
            2,
            Instant.now(),
            List.of(),
            ATTRIBUTION
        )).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> new NormalizedWeatherDay(
            LocalDate.now(),
            20,
            10,
            1,
            101
        )).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void quoteFactsRequireStableIdentityProvenanceAndHttpsSource() {
        assertThatThrownBy(() -> new NormalizedDailyQuote(
            "HITOKOTO",
            "",
            "text",
            "a",
            null,
            null,
            URI.create("https://hitokoto.cn"),
            Instant.now(),
            new ProviderAttribution("Hitokoto", URI.create("https://hitokoto.cn"))
        )).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> new NormalizedDailyQuote(
            "HITOKOTO",
            "id",
            "text",
            "a",
            null,
            null,
            URI.create("http://hitokoto.cn"),
            Instant.now(),
            new ProviderAttribution("Hitokoto", URI.create("https://hitokoto.cn"))
        )).isInstanceOf(IllegalArgumentException.class);
    }
}
