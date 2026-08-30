package io.github.shizuki.site.media.model;

import java.security.SecureRandom;
import java.util.Base64;

/**
 * 关联级媒体引用。每个引用包含 160 位随机量，只定位一个 album-photo 或 moment-photo 关联。
 */
public final class OpaqueMediaReference {

    private static final String PREFIX = "med_";
    private static final int RANDOM_BYTES = 20;
    private static final int ENCODED_LENGTH = 27;
    private static final Base64.Encoder ENCODER = Base64.getUrlEncoder().withoutPadding();
    private static final Base64.Decoder DECODER = Base64.getUrlDecoder();

    private OpaqueMediaReference() {
    }

    public static String generate(SecureRandom secureRandom) {
        if (secureRandom == null) {
            throw new IllegalArgumentException("secureRandom is required");
        }
        byte[] random = new byte[RANDOM_BYTES];
        secureRandom.nextBytes(random);
        return PREFIX + ENCODER.encodeToString(random);
    }

    public static boolean isValid(String value) {
        if (value == null || !value.startsWith(PREFIX)
            || value.length() != PREFIX.length() + ENCODED_LENGTH) {
            return false;
        }
        String encoded = value.substring(PREFIX.length());
        try {
            byte[] decoded = DECODER.decode(encoded);
            return decoded.length == RANDOM_BYTES && ENCODER.encodeToString(decoded).equals(encoded);
        } catch (IllegalArgumentException exception) {
            return false;
        }
    }

    public static int entropyBits() {
        return RANDOM_BYTES * Byte.SIZE;
    }
}
