package io.github.shizuki.common.core.security;

import java.util.Locale;
import java.util.Set;
import java.util.regex.Pattern;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

/**
 * 密钥占位值校验器。
 */
@Component
public class SecretValueValidator {

    private static final Pattern ANGLE_BRACKET_PLACEHOLDER = Pattern.compile("^<[^<>]+>$");
    private static final Pattern SPRING_PLACEHOLDER = Pattern.compile("^\\$\\{[^{}]+}$");

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

        if (isStructuredPlaceholder(trimmed)) {
            return true;
        }

        String normalized = trimmed.toLowerCase(Locale.ROOT);
        return PLACEHOLDER_VALUES.contains(normalized)
            || normalized.contains("replace_me")
            || normalized.contains("change_me")
            || normalized.contains("your_secret");
    }

    /**
     * 判断是否为结构化占位值，例如 {@code <SECRET>} 或未解析的 {@code ${SECRET}}。
     *
     * @param value 待校验值
     * @return true 表示看起来仍是占位文本
     */
    public boolean isStructuredPlaceholder(String value) {
        if (!StringUtils.hasText(value)) {
            return false;
        }

        String trimmed = value.trim();
        if (trimmed.startsWith("ENC(") && trimmed.endsWith(")")) {
            return false;
        }

        return ANGLE_BRACKET_PLACEHOLDER.matcher(trimmed).matches()
            || SPRING_PLACEHOLDER.matcher(trimmed).matches();
    }
}
