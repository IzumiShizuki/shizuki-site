package io.github.shizuki.site.contract;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.shizuki.site.media.model.OpaqueMediaReference;
import java.security.SecureRandom;
import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.Test;

class OpaqueMediaReferenceTest {

    @Test
    void generatesCanonicalAssociationReferencesWithAtLeast160BitsOfEntropy() {
        Set<String> generated = new HashSet<>();
        SecureRandom secureRandom = new SecureRandom();
        for (int index = 0; index < 512; index++) {
            String mediaRef = OpaqueMediaReference.generate(secureRandom);
            assertThat(OpaqueMediaReference.isValid(mediaRef)).isTrue();
            generated.add(mediaRef);
        }

        assertThat(OpaqueMediaReference.entropyBits()).isGreaterThanOrEqualTo(160);
        assertThat(generated).hasSize(512);
    }

    @Test
    void rejectsSequentialAndNonCanonicalReferences() {
        assertThat(OpaqueMediaReference.isValid("1")).isFalse();
        assertThat(OpaqueMediaReference.isValid("med_1")).isFalse();
        assertThat(OpaqueMediaReference.isValid("alb_AAAAAAAAAAAAAAAAAAAAAAAAAAA")).isFalse();
        assertThat(OpaqueMediaReference.isValid("med_AAAAAAAAAAAAAAAAAAAAAAAAAA+")).isFalse();
    }
}
