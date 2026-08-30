package io.github.shizuki.site.content.model;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import java.time.Instant;
import org.junit.jupiter.api.Test;

class PublicContentCursorCodecTest {

    private final OpaquePublicIdentifierGenerator identifierGenerator = new OpaquePublicIdentifierGenerator();
    private final PublicContentCursorCodec codec = new PublicContentCursorCodec(testKey());

    @Test
    void roundTripsAllStableSortFieldsWithoutExposingThem() {
        String publicId = identifierGenerator.generate(PublicContentType.ALBUM);
        PublicContentCursorKey key = new PublicContentCursorKey(
            Instant.parse("2026-08-27T12:34:56.123456789Z"),
            4_294_967_297L,
            publicId
        );

        String token = codec.encode(PublicContentType.ALBUM, key);

        assertThat(token).startsWith("pc1.");
        assertThat(token).doesNotContain(publicId).doesNotContain("4294967297").doesNotContain("2026-08-27");
        assertThat(codec.decode(PublicContentType.ALBUM, token)).isEqualTo(key);
    }

    @Test
    void rejectsAuthenticatedPayloadTampering() {
        PublicContentCursorKey key = new PublicContentCursorKey(
            Instant.parse("2026-08-27T12:34:56Z"),
            42L,
            identifierGenerator.generate(PublicContentType.MOMENT)
        );
        String token = codec.encode(PublicContentType.MOMENT, key);
        int changedIndex = token.length() / 2;
        char replacement = token.charAt(changedIndex) == 'A' ? 'B' : 'A';
        String tampered = token.substring(0, changedIndex) + replacement + token.substring(changedIndex + 1);

        assertInvalidCursor(() -> codec.decode(PublicContentType.MOMENT, tampered));
    }

    @Test
    void rejectsCursorCreatedForAnotherPublicContentType() {
        PublicContentCursorKey key = new PublicContentCursorKey(
            Instant.parse("2026-08-27T12:34:56Z"),
            42L,
            identifierGenerator.generate(PublicContentType.ALBUM)
        );
        String token = codec.encode(PublicContentType.ALBUM, key);

        assertInvalidCursor(() -> codec.decode(PublicContentType.MOMENT, token));
    }

    @Test
    void rejectsMalformedOrUnversionedTokens() {
        assertInvalidCursor(() -> codec.decode(PublicContentType.ALBUM, ""));
        assertInvalidCursor(() -> codec.decode(PublicContentType.ALBUM, "pc0.not-a-current-cursor"));
        assertInvalidCursor(() -> codec.decode(PublicContentType.ALBUM, "pc1.not-base64!"));
    }

    private static void assertInvalidCursor(Runnable action) {
        assertThatThrownBy(action::run)
            .isInstanceOf(BusinessException.class)
            .extracting(exception -> ((BusinessException) exception).getErrorCode())
            .isEqualTo(ErrorCode.INVALID_CURSOR);
    }

    private static byte[] testKey() {
        byte[] key = new byte[32];
        for (int index = 0; index < key.length; index++) {
            key[index] = (byte) (index + 1);
        }
        return key;
    }
}
