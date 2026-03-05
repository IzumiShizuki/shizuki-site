package io.github.shizuki.site.content.support;

import io.github.shizuki.site.content.dto.AuthorProfileResponse;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

public final class AuthorProfileHttpCacheSupport {

    private static final ZoneId LAST_MODIFIED_ZONE = ZoneId.systemDefault();

    private AuthorProfileHttpCacheSupport() {
    }

    public static String buildWeakEtag(AuthorProfileResponse response) {
        String seed = canonicalize(response);
        byte[] digest = sha256(seed.getBytes(StandardCharsets.UTF_8));
        return "W/\"author-profile-" + toHex(digest).substring(0, 24) + "\"";
    }

    public static long resolveLastModifiedEpochMillis(AuthorProfileResponse response, long fallbackEpochMillis) {
        if (response == null || response.updatedAt() == null) {
            return Math.max(0L, fallbackEpochMillis);
        }
        return response.updatedAt().atZone(LAST_MODIFIED_ZONE).toInstant().toEpochMilli();
    }

    public static boolean matchesIfNoneMatch(String ifNoneMatchHeader, String targetEtag) {
        String target = normalizeEtag(targetEtag);
        if (target.isEmpty()) {
            return false;
        }
        if (ifNoneMatchHeader == null) {
            return false;
        }

        String header = ifNoneMatchHeader.trim();
        if (header.isEmpty()) {
            return false;
        }
        if ("*".equals(header)) {
            return true;
        }

        String[] tokens = header.split(",");
        for (String token : tokens) {
            String normalized = normalizeEtag(token);
            if (!normalized.isEmpty() && Objects.equals(normalized, target)) {
                return true;
            }
        }
        return false;
    }

    private static String canonicalize(AuthorProfileResponse response) {
        if (response == null) {
            return "";
        }
        StringBuilder builder = new StringBuilder(512);
        builder.append(normalizeString(response.authorCode()))
            .append('|')
            .append(response.enabled())
            .append('|')
            .append(normalizeDateTime(response.updatedAt()))
            .append('|');
        appendCanonicalValue(builder, response.profileJson());
        return builder.toString();
    }

    private static String normalizeDateTime(LocalDateTime value) {
        return value == null ? "" : value.toString();
    }

    private static String normalizeString(String value) {
        return value == null ? "" : value.trim().toLowerCase(Locale.ROOT);
    }

    private static void appendCanonicalValue(StringBuilder builder, Object value) {
        if (value == null) {
            builder.append("null");
            return;
        }
        if (value instanceof Map<?, ?> rawMap) {
            builder.append('{');
            List<String> keys = new ArrayList<>();
            for (Object rawKey : rawMap.keySet()) {
                keys.add(String.valueOf(rawKey));
            }
            keys.sort(Comparator.naturalOrder());
            boolean first = true;
            for (String key : keys) {
                if (!first) {
                    builder.append(',');
                }
                first = false;
                builder.append(key).append(':');
                appendCanonicalValue(builder, rawMap.get(key));
            }
            builder.append('}');
            return;
        }
        if (value instanceof List<?> list) {
            builder.append('[');
            for (int index = 0; index < list.size(); index += 1) {
                if (index > 0) {
                    builder.append(',');
                }
                appendCanonicalValue(builder, list.get(index));
            }
            builder.append(']');
            return;
        }
        if (value instanceof Number || value instanceof Boolean) {
            builder.append(value);
            return;
        }
        builder.append('"')
            .append(String.valueOf(value).trim())
            .append('"');
    }

    private static String normalizeEtag(String etag) {
        if (etag == null) {
            return "";
        }
        String normalized = etag.trim();
        if (normalized.isEmpty()) {
            return "";
        }
        if (normalized.regionMatches(true, 0, "W/", 0, 2)) {
            normalized = normalized.substring(2).trim();
        }
        if (normalized.startsWith("\"") && normalized.endsWith("\"") && normalized.length() >= 2) {
            normalized = normalized.substring(1, normalized.length() - 1);
        }
        return normalized;
    }

    private static byte[] sha256(byte[] source) {
        try {
            return MessageDigest.getInstance("SHA-256").digest(source);
        } catch (NoSuchAlgorithmException ex) {
            throw new IllegalStateException("SHA-256 not supported", ex);
        }
    }

    private static String toHex(byte[] digest) {
        StringBuilder builder = new StringBuilder(digest.length * 2);
        for (byte item : digest) {
            builder.append(Character.forDigit((item >>> 4) & 0x0F, 16));
            builder.append(Character.forDigit(item & 0x0F, 16));
        }
        return builder.toString();
    }
}
