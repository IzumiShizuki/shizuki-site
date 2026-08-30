package io.github.shizuki.site.content.service.widget;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.shizuki.site.content.provider.ProviderAttribution;
import java.net.URI;
import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.List;
import org.junit.jupiter.api.Test;

class NearbyWeatherCacheTest {

    @Test
    void boundsDistinctCellsCoalescesSameCellAndExpiresEntries() {
        NearbyWeatherProperties properties = new NearbyWeatherProperties();
        properties.setMaxCacheEntries(16);
        properties.afterPropertiesSet();
        MutableClock clock = new MutableClock(Instant.parse("2026-08-28T12:00:00Z"));
        NearbyWeatherCache cache = new NearbyWeatherCache(properties, clock);

        assertThat(cache.lookupOrReserve("cell-0").state()).isEqualTo(NearbyWeatherCache.State.RESERVED);
        assertThat(cache.lookupOrReserve("cell-0").state()).isEqualTo(NearbyWeatherCache.State.BUSY);
        cache.complete("cell-0", snapshot());
        assertThat(cache.lookupOrReserve("cell-0").state()).isEqualTo(NearbyWeatherCache.State.HIT);
        for (int index = 1; index < 16; index++) {
            assertThat(cache.lookupOrReserve("cell-" + index).state())
                .isEqualTo(NearbyWeatherCache.State.RESERVED);
        }
        assertThat(cache.lookupOrReserve("cell-overflow").state())
            .isEqualTo(NearbyWeatherCache.State.FULL);

        clock.advanceSeconds(301);
        assertThat(cache.lookupOrReserve("cell-overflow").state())
            .isEqualTo(NearbyWeatherCache.State.RESERVED);
    }

    private SiteWeatherSnapshot snapshot() {
        return new SiteWeatherSnapshot(
            "你的位置附近",
            28.5,
            31.2,
            73,
            3,
            11.4,
            List.of(),
            Instant.parse("2026-08-28T11:59:00Z"),
            Instant.parse("2026-08-28T12:00:00Z"),
            SiteWeatherFreshness.FRESH,
            new ProviderAttribution("Open-Meteo", URI.create("https://open-meteo.com"))
        );
    }

    private static final class MutableClock extends Clock {
        private Instant instant;

        private MutableClock(Instant instant) {
            this.instant = instant;
        }

        private void advanceSeconds(long seconds) {
            instant = instant.plusSeconds(seconds);
        }

        @Override
        public ZoneId getZone() {
            return ZoneOffset.UTC;
        }

        @Override
        public Clock withZone(ZoneId zone) {
            return this;
        }

        @Override
        public Instant instant() {
            return instant;
        }
    }
}
