package io.github.shizuki.common.audit.util;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;

/**
 * 敏感字段脱敏工具。
 */
public final class SensitiveMasker {

    /**
     * 统一脱敏占位符。
     */
    public static final String REDACTED = "[REDACTED]";

    private static final Pattern EXACT_COORDINATE_PAIR = Pattern.compile(
        "(?<![\\d.])[-+]?\\d{1,3}\\.\\d{3,}\\s*[,;/]\\s*[-+]?\\d{1,3}\\.\\d{3,}(?![\\d.])"
    );
    private static final Pattern STORAGE_IDENTITY_MATERIAL = Pattern.compile(
        "(?i)\\b(?:bucket(?:name|[_-]?(?:code|id))?|object[_-]?(?:key|code)|storage[_-]?(?:key|bucket))\\b"
    );

    /**
     * 工具类禁止实例化。
     */
    private SensitiveMasker() {
    }

    /**
     * 对 map 中敏感键执行掩码。
     *
     * @param raw 原始键值对
     * @return 脱敏后的键值对
     */
    public static Map<String, Object> mask(Map<String, ?> raw) {
        if (raw == null || raw.isEmpty()) {
            return Map.of();
        }
        Map<String, Object> masked = new LinkedHashMap<>();
        raw.forEach((key, value) -> masked.put(
            key,
            isSensitive(key) ? REDACTED : maskValue(value)
        ));
        return masked;
    }

    /**
     * 对可能承载签名地址或精确坐标的自由文本脱敏。
     *
     * @param raw 原始文本
     * @return 安全文本
     */
    public static String maskText(String raw) {
        if (raw == null) {
            return null;
        }
        String lower = raw.toLowerCase(Locale.ROOT);
        if (containsSignedUrlMaterial(lower)
            || EXACT_COORDINATE_PAIR.matcher(raw).find()
            || STORAGE_IDENTITY_MATERIAL.matcher(raw).find()) {
            return REDACTED;
        }
        return raw;
    }

    private static Object maskValue(Object value) {
        if (value instanceof Map<?, ?> mapValue) {
            Map<String, Object> normalized = new LinkedHashMap<>();
            mapValue.forEach((key, nestedValue) -> normalized.put(String.valueOf(key), nestedValue));
            return mask(normalized);
        }
        if (value instanceof Collection<?> collection) {
            List<Object> masked = new ArrayList<>(collection.size());
            collection.forEach(item -> masked.add(maskValue(item)));
            return masked;
        }
        if (value != null && value.getClass().isArray()) {
            List<Object> masked = new ArrayList<>(Array.getLength(value));
            for (int index = 0; index < Array.getLength(value); index++) {
                masked.add(maskValue(Array.get(value, index)));
            }
            return masked;
        }
        if (value instanceof String text) {
            return maskText(text);
        }
        return value;
    }

    /**
     * 判断是否为敏感键。
     *
     * @param key 字段名
     * @return true 表示敏感
     */
    private static boolean isSensitive(String key) {
        if (key == null) {
            return false;
        }
        String normalized = key.toLowerCase(Locale.ROOT).replaceAll("[^a-z0-9]", "");
        return normalized.contains("token")
            || normalized.contains("password")
            || normalized.contains("secret")
            || normalized.contains("apikey")
            || normalized.contains("accesskey")
            || normalized.contains("credential")
            || normalized.contains("capability")
            || normalized.contains("authorization")
            || normalized.contains("cookie")
            || normalized.contains("signature")
            || normalized.contains("signedurl")
            || normalized.contains("presignedurl")
            || normalized.contains("objectkey")
            || normalized.contains("bucketname")
            || normalized.equals("latitude")
            || normalized.equals("longitude")
            || normalized.equals("lat")
            || normalized.equals("lng")
            || normalized.equals("lon")
            || normalized.contains("coordinates")
            || normalized.contains("rawcoordinate");
    }

    private static boolean containsSignedUrlMaterial(String lower) {
        return lower.contains("x-amz-signature=")
            || lower.contains("x-oss-signature=")
            || lower.contains("x-goog-signature=")
            || lower.contains("signature=")
            || lower.contains("security-token=")
            || lower.contains("credential=");
    }
}
