package io.github.shizuki.common.audit.util;

import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

public final class SensitiveMasker {

    private SensitiveMasker() {
    }

    public static Map<String, Object> mask(Map<String, Object> raw) {
        return raw.entrySet().stream().collect(Collectors.toMap(
            Map.Entry::getKey,
            entry -> isSensitive(entry.getKey()) ? "***" : entry.getValue()
        ));
    }

    private static boolean isSensitive(String key) {
        String lowerKey = key.toLowerCase(Locale.ROOT);
        return lowerKey.contains("token")
            || lowerKey.contains("password")
            || lowerKey.contains("secret")
            || lowerKey.contains("api_key")
            || lowerKey.contains("signature");
    }
}
