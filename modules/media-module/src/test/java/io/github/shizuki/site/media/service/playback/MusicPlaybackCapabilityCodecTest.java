package io.github.shizuki.site.media.service.playback;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.shizuki.site.media.config.MediaGatewayProperties;
import io.github.shizuki.site.media.config.MusicPlaybackGatewayProperties;
import java.time.Instant;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MusicPlaybackCapabilityCodecTest {

    private MusicPlaybackCapabilityCodec codec;
    private MusicPlaybackGatewayProperties properties;

    @BeforeEach
    void setUp() {
        MediaGatewayProperties mediaGatewayProperties = new MediaGatewayProperties();
        mediaGatewayProperties.setCapabilitySecret("test-media-gateway-capability-secret-1234567890");
        mediaGatewayProperties.afterPropertiesSet();
        properties = new MusicPlaybackGatewayProperties();
        properties.setTokenTtlSeconds(300L);
        properties.afterPropertiesSet();
        codec = new MusicPlaybackCapabilityCodec(mediaGatewayProperties, properties);
    }

    @Test
    void roundTripsSourceUrlWithoutExposingItInToken() {
        Instant issuedAt = Instant.parse("2026-09-15T12:00:00Z");
        String sourceUrl = "https://audio.example.com/song.mp3?token=private";

        String token = codec.issue(sourceUrl, issuedAt);

        assertThat(codec.verify(token, issuedAt.plusSeconds(1)))
            .contains(new MusicPlaybackCapabilityCodec.Claims(
                sourceUrl,
                issuedAt.getEpochSecond() + properties.getTokenTtlSeconds()
            ));
        assertThat(token).doesNotContain("audio", "example", "private");
    }

    @Test
    void rejectsTamperingExpiryAndNonCanonicalEncoding() {
        Instant issuedAt = Instant.parse("2026-09-15T12:00:00Z");
        String token = codec.issue("https://audio.example.com/song.mp3", issuedAt);
        int index = token.length() / 2;
        char replacement = token.charAt(index) == 'A' ? 'B' : 'A';
        String tampered = token.substring(0, index) + replacement + token.substring(index + 1);

        assertThat(codec.verify(tampered, issuedAt.plusSeconds(1))).isEmpty();
        assertThat(codec.verify(token, issuedAt.plusSeconds(properties.getTokenTtlSeconds()))).isEmpty();
        assertThat(codec.verify(token + "=", issuedAt.plusSeconds(1))).isEmpty();
    }
}
