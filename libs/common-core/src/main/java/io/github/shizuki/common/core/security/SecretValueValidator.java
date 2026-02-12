package io.github.shizuki.common.core.security;

import java.util.Locale;
import java.util.Set;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

/**
 * 密钥占位值校验器。
 */
@Component
public class SecretValueValidator {

    /**
     * 常见无效占位值集合。
     */
    private static final Set<String> PLACEHOLDER_VALUES = Set.of(
        "replace_me",
        "changeme",
        "change_me",
        "your_secret",
        "your-secret",
        "your_key",
        "your-key",
        "example",
        "example_secret",
        "test",
        "null"
    );

    /**
     * 判断密钥值是否无效。
     *
     * @param value 待校验值
     * @return true 表示无效
     */
    public boolean isInvalid(String value) {
        if (!StringUtils.hasText(value)) {
            return true;
        }

        String trimmed = value.trim();
        if (trimmed.startsWith("ENC(") && trimmed.endsWith(")")) {
            return false;
        }

        // 支持加密占位形式，例如 ENC(xxx)。
        String normalized = trimmed.toLowerCase(Locale.ROOT);
        return PLACEHOLDER_VALUES.contains(normalized)
            || normalized.contains("replace_me")
            || normalized.contains("change_me")
            || normalized.contains("your_secret");
    }
}
