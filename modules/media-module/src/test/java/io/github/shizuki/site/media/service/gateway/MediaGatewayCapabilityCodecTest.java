package io.github.shizuki.site.media.service.gateway;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.shizuki.site.media.config.MediaGatewayProperties;
import io.github.shizuki.site.media.model.ImageVariantTypeEnum;
import io.github.shizuki.site.media.model.OpaqueMediaReference;
import java.security.SecureRandom;
import java.time.Instant;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MediaGatewayCapabilityCodecTest {

    private MediaGatewayCapabilityCodec codec;
    private String mediaRef;

    @BeforeEach
    void setUp() {
        MediaGatewayProperties properties = new MediaGatewayProperties();
        properties.setCapabilitySecret("test-media-gateway-capability-secret-1234567890");
        properties.afterPropertiesSet();
        codec = new MediaGatewayCapabilityCodec(properties);
        mediaRef = OpaqueMediaReference.generate(new SecureRandom());
    }

    @Test
    void authenticatesClaimsWithoutEmbeddingStorageCoordinates() {
        long expiry = Instant.now().plusSeconds(60).getEpochSecond();
        MediaGatewayCapabilityClaims claims = claims(expiry);

        String token = codec.issue(claims);

        assertThat(codec.verify(token, Instant.ofEpochSecond(expiry - 1)))
            .contains(claims);
        assertThat(token.toLowerCase())
            .doesNotContain("bucket", "object", "oss", "http", "signature");
    }

    @Test
    void rejectsTamperingAndExpiry() {
        long expiry = Instant.now().plusSeconds(60).getEpochSecond();
        String token = codec.issue(claims(expiry));
        char replacement = token.charAt(token.length() - 1) == 'A' ? 'B' : 'A';
        String tampered = token.substring(0, token.length() - 1) + replacement;

        assertThat(codec.verify(tampered, Instant.now())).isEmpty();
        assertThat(codec.verify(token, Instant.ofEpochSecond(expiry + 1))).isEmpty();
    }

    @Test
    void rejectsNonCanonicalBase64UrlEncoding() {
        long expiry = Instant.now().plusSeconds(60).getEpochSecond();
        String token = codec.issue(claims(expiry));
        int paddingLength = (4 - token.length() % 4) % 4;

        assertThat(paddingLength).isGreaterThan(0);
        assertThat(codec.verify(token + "=".repeat(paddingLength), Instant.now())).isEmpty();
    }

    private MediaGatewayCapabilityClaims claims(long expiry) {
        return new MediaGatewayCapabilityClaims(
            mediaRef,
            "ALBUM",
            7L,
            ImageVariantTypeEnum.DISPLAY_WEBP,
            MediaGatewayActorScope.UNLISTED_LINK,
            0L,
            3,
            2,
            expiry
        );
    }
}
