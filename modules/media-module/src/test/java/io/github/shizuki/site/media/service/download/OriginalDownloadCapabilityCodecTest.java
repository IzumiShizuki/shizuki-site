package io.github.shizuki.site.media.service.download;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.shizuki.site.media.config.MediaGatewayProperties;
import io.github.shizuki.site.media.model.OpaqueMediaReference;
import java.security.SecureRandom;
import java.time.Instant;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OriginalDownloadCapabilityCodecTest {

    private OriginalDownloadCapabilityCodec codec;

    @BeforeEach
    void setUp() {
        MediaGatewayProperties properties = new MediaGatewayProperties();
        properties.setCapabilitySecret("test-media-gateway-capability-secret-1234567890");
        properties.afterPropertiesSet();
        codec = new OriginalDownloadCapabilityCodec(properties);
    }

    @Test
    void tokenIsShortLivedOriginalOnlyAndContainsNoStorageCoordinates() {
        String mediaRef = OpaqueMediaReference.generate(new SecureRandom());
        IssuedOriginalDownloadCapability issued = codec.issue(mediaRef, "ALBUM", 7L, 3, 2);

        assertThat(codec.verify(issued.token())).get()
            .extracting(
                OriginalDownloadCapabilityClaims::mediaRef,
                OriginalDownloadCapabilityClaims::associationId,
                OriginalDownloadCapabilityClaims::contentVersion,
                OriginalDownloadCapabilityClaims::associationVersion
            ).containsExactly(mediaRef, 7L, 3, 2);
        assertThat(issued.token().toLowerCase())
            .doesNotContain("bucket", "object", "oss", "http", "signature");
    }

    @Test
    void tamperedOrExpiredTokenIsRejected() {
        String mediaRef = OpaqueMediaReference.generate(new SecureRandom());
        IssuedOriginalDownloadCapability issued = codec.issue(mediaRef, "ALBUM", 7L, 3, 2);
        int dot = issued.token().indexOf('.');
        String tampered = (issued.token().charAt(0) == 'A' ? "B" : "A") + issued.token().substring(1);

        assertThat(dot).isPositive();
        assertThat(codec.verify(tampered)).isEmpty();
        assertThat(codec.verify(issued.token(), issued.expiresAt().plusSeconds(1))).isEmpty();
    }
}
