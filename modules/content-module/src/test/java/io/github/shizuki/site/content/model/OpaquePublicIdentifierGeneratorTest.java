package io.github.shizuki.site.content.model;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.Test;

class OpaquePublicIdentifierGeneratorTest {

    @Test
    void generatedIdentifiersAreTypeScopedUniqueAndCarry160RandomBits() {
        OpaquePublicIdentifierGenerator generator = new OpaquePublicIdentifierGenerator();
        Set<String> identifiers = new HashSet<>();

        for (int index = 0; index < 10_000; index++) {
            String identifier = generator.generate(PublicContentType.ALBUM);
            assertThat(OpaquePublicIdentifierGenerator.isValidFor(PublicContentType.ALBUM, identifier)).isTrue();
            assertThat(OpaquePublicIdentifierGenerator.isValidFor(PublicContentType.MOMENT, identifier)).isFalse();
            identifiers.add(identifier);
        }

        assertThat(identifiers).hasSize(10_000);
        assertThat(OpaquePublicIdentifierGenerator.entropyBits()).isEqualTo(160);
    }

    @Test
    void rejectsMalformedOrNonCanonicalIdentifiers() {
        assertThat(OpaquePublicIdentifierGenerator.isValidFor(PublicContentType.ALBUM, null)).isFalse();
        assertThat(OpaquePublicIdentifierGenerator.isValidFor(PublicContentType.ALBUM, "alb_123")).isFalse();
        assertThat(OpaquePublicIdentifierGenerator.isValidFor(
            PublicContentType.ALBUM,
            "alb_!!!!!!!!!!!!!!!!!!!!!!!!!!!"
        )).isFalse();
        assertThat(OpaquePublicIdentifierGenerator.isValidFor(
            PublicContentType.ALBUM,
            "mom_AAAAAAAAAAAAAAAAAAAAAAAAAAA"
        )).isFalse();
    }
}
