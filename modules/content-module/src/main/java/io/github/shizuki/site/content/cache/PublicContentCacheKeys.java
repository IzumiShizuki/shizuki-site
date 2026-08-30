package io.github.shizuki.site.content.cache;

import io.github.shizuki.site.content.model.PublicContentType;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HexFormat;
import java.util.Locale;
import java.util.Objects;
import java.util.regex.Pattern;

/** Key contract containing only type, opaque identifiers, generations and query digests. */
final class PublicContentCacheKeys {

    private static final String PREFIX = "site:public-content:v1";
    private static final Pattern OPAQUE_IDENTIFIER = Pattern.compile("[A-Za-z0-9_-]{8,128}");

    private PublicContentCacheKeys() {
    }

    static String listGeneration(PublicContentType type) {
        return namespace(type) + ":list-generation";
    }

    static String list(PublicContentType type, long generation, String cursor, int limit) {
        requireGeneration(generation);
        requireLimit(limit);
        String normalizedCursor = cursor == null || cursor.isBlank() ? "first" : cursor.trim();
        return namespace(type) + ":list:g" + generation + ":q" + digest(normalizedCursor + "\n" + limit);
    }

    static String featured(PublicContentType type, long generation, int limit) {
        requireGeneration(generation);
        requireLimit(limit);
        return namespace(type) + ":featured:g" + generation + ":limit" + limit;
    }

    static String detail(PublicContentType type, String opaqueIdentifier) {
        return namespace(type) + ":detail:" + requireOpaqueIdentifier(opaqueIdentifier);
    }

    static String detailGeneration(PublicContentType type, String opaqueIdentifier) {
        return namespace(type) + ":detail-generation:" + requireOpaqueIdentifier(opaqueIdentifier);
    }

    static String requireOpaqueIdentifier(String value) {
        String normalized = Objects.requireNonNull(value, "opaqueIdentifier").trim();
        if (!OPAQUE_IDENTIFIER.matcher(normalized).matches()) {
            throw new IllegalArgumentException("opaqueIdentifier must be a URL-safe opaque value");
        }
        return normalized;
    }

    private static String namespace(PublicContentType type) {
        return PREFIX + ":" + Objects.requireNonNull(type, "type").name().toLowerCase(Locale.ROOT);
    }

    private static void requireGeneration(long generation) {
        if (generation < 0) {
            throw new IllegalArgumentException("generation must not be negative");
        }
    }

    private static void requireLimit(int limit) {
        if (limit <= 0) {
            throw new IllegalArgumentException("limit must be positive");
        }
    }

    private static String digest(String value) {
        try {
            byte[] bytes = MessageDigest.getInstance("SHA-256")
                .digest(value.getBytes(StandardCharsets.UTF_8));
            return HexFormat.of().formatHex(bytes);
        } catch (NoSuchAlgorithmException exception) {
            throw new IllegalStateException("SHA-256 is unavailable", exception);
        }
    }
}
