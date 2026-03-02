package io.github.shizuki.site.media.util;

import java.net.URI;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.OptionalLong;
import org.springframework.util.StringUtils;

/**
 * 音频 URL 时效判定工具。
 */
public final class TrackUrlExpiryPolicy {

    private static final DateTimeFormatter AWS_DATE_FORMATTER = DateTimeFormatter.ofPattern("yyyyMMdd'T'HHmmss'Z'");

    private TrackUrlExpiryPolicy() {
    }

    public static boolean shouldFallbackToOss(String url, long ttlThresholdSeconds) {
        return shouldFallbackToOss(url, ttlThresholdSeconds, Instant.now().getEpochSecond());
    }

    public static boolean shouldFallbackToOss(String url, long ttlThresholdSeconds, long nowEpochSeconds) {
        OptionalLong expiryOptional = resolveExpiryEpochSeconds(url);
        if (expiryOptional.isEmpty()) {
            return false;
        }
        long threshold = Math.max(60L, ttlThresholdSeconds);
        long remain = expiryOptional.getAsLong() - nowEpochSeconds;
        return remain <= threshold;
    }

    public static boolean isExpired(String url) {
        return isExpired(url, Instant.now().getEpochSecond());
    }

    public static boolean isExpired(String url, long nowEpochSeconds) {
        OptionalLong expiryOptional = resolveExpiryEpochSeconds(url);
        return expiryOptional.isPresent() && expiryOptional.getAsLong() <= nowEpochSeconds;
    }

    public static OptionalLong resolveExpiryEpochSeconds(String url) {
        String normalized = readString(url);
        if (!StringUtils.hasText(normalized)) {
            return OptionalLong.empty();
        }
        Map<String, String> query = parseQueryParams(normalized);
        if (query.isEmpty()) {
            return OptionalLong.empty();
        }

        long nowEpochSeconds = Instant.now().getEpochSecond();
        OptionalLong awsExpiry = resolveAwsExpiryEpochSeconds(query);
        if (awsExpiry.isPresent()) {
            return awsExpiry;
        }

        String[] absoluteKeys = {
            "expires",
            "expire",
            "exp",
            "e",
            "wsexpires",
            "ws_expires",
            "x-oss-expires"
        };
        for (String key : absoluteKeys) {
            String value = firstNonEmpty(query, key);
            if (!StringUtils.hasText(value)) {
                continue;
            }
            OptionalLong parsed = parseEpochSeconds(value, nowEpochSeconds);
            if (parsed.isPresent()) {
                return parsed;
            }
        }

        return OptionalLong.empty();
    }

    private static OptionalLong resolveAwsExpiryEpochSeconds(Map<String, String> query) {
        String expiresRaw = firstNonEmpty(query, "x-amz-expires");
        String dateRaw = firstNonEmpty(query, "x-amz-date");
        if (!StringUtils.hasText(expiresRaw) || !StringUtils.hasText(dateRaw)) {
            return OptionalLong.empty();
        }
        try {
            long expireSeconds = Long.parseLong(expiresRaw.trim());
            if (expireSeconds <= 0) {
                return OptionalLong.empty();
            }
            LocalDateTime dateTime = LocalDateTime.parse(dateRaw.trim(), AWS_DATE_FORMATTER);
            long issueEpochSeconds = dateTime.toEpochSecond(ZoneOffset.UTC);
            return OptionalLong.of(issueEpochSeconds + expireSeconds);
        } catch (Exception ex) {
            return OptionalLong.empty();
        }
    }

    private static OptionalLong parseEpochSeconds(String raw, long nowEpochSeconds) {
        try {
            long value = Long.parseLong(raw.trim());
            if (value <= 0L) {
                return OptionalLong.empty();
            }
            long parsed = value;
            if (parsed > 10_000_000_000L) {
                parsed = parsed / 1000L;
            }
            if (parsed > nowEpochSeconds + 5L * 365 * 24 * 60 * 60) {
                return OptionalLong.empty();
            }
            return OptionalLong.of(parsed);
        } catch (Exception ex) {
            return OptionalLong.empty();
        }
    }

    private static Map<String, String> parseQueryParams(String url) {
        try {
            URI uri = URI.create(url);
            String rawQuery = readString(uri.getRawQuery());
            if (!StringUtils.hasText(rawQuery)) {
                return Map.of();
            }
            Map<String, String> result = new LinkedHashMap<>();
            String[] pairs = rawQuery.split("&");
            for (String pair : pairs) {
                if (!StringUtils.hasText(pair)) {
                    continue;
                }
                int idx = pair.indexOf('=');
                String keyRaw = idx >= 0 ? pair.substring(0, idx) : pair;
                String valueRaw = idx >= 0 ? pair.substring(idx + 1) : "";
                String key = decode(keyRaw).toLowerCase(Locale.ROOT);
                String value = decode(valueRaw);
                if (!StringUtils.hasText(key) || !StringUtils.hasText(value)) {
                    continue;
                }
                result.put(key, value);
            }
            return result;
        } catch (Exception ex) {
            return Map.of();
        }
    }

    private static String firstNonEmpty(Map<String, String> query, String key) {
        if (query == null || query.isEmpty()) {
            return "";
        }
        return readString(query.get(key));
    }

    private static String decode(String value) {
        try {
            return URLDecoder.decode(readString(value), StandardCharsets.UTF_8);
        } catch (Exception ex) {
            return readString(value);
        }
    }

    private static String readString(String raw) {
        if (raw == null) {
            return "";
        }
        String value = raw.trim();
        return value;
    }
}
