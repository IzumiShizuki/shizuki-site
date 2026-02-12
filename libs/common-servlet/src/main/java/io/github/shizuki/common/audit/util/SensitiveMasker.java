package io.github.shizuki.common.audit.util;

import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 敏感字段脱敏工具。
 */
public final class SensitiveMasker {

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
    public static Map<String, Object> mask(Map<String, Object> raw) {
        return raw.entrySet().stream().collect(Collectors.toMap(
            Map.Entry::getKey,
            entry -> isSensitive(entry.getKey()) ? "***" : entry.getValue()
        ));
    }

    /**
     * 判断是否为敏感键。
     *
     * @param key 字段名
     * @return true 表示敏感
     */
    private static boolean isSensitive(String key) {
        String lowerKey = key.toLowerCase(Locale.ROOT);
        return lowerKey.contains("token")
            || lowerKey.contains("password")
            || lowerKey.contains("secret")
            || lowerKey.contains("api_key")
            || lowerKey.contains("signature");
    }
}
