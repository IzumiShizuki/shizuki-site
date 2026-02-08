package io.github.shizuki.common.core.security;

import java.util.Locale;
import java.util.Set;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
public class SecretValueValidator {

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

    public boolean isInvalid(String value) {
        if (!StringUtils.hasText(value)) {
            return true;
        }

        String trimmed = value.trim();
        if (trimmed.startsWith("ENC(") && trimmed.endsWith(")")) {
            return false;
        }

        String normalized = trimmed.toLowerCase(Locale.ROOT);
        return PLACEHOLDER_VALUES.contains(normalized)
            || normalized.contains("replace_me")
            || normalized.contains("change_me")
            || normalized.contains("your_secret");
    }
}
