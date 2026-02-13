package io.github.shizuki.site.content.model;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import java.util.Arrays;

public enum ContentVisibilityEnum {
    PUBLIC,
    PRIVATE,
    GROUP;

    public static ContentVisibilityEnum from(String raw) {
        if (raw == null || raw.isBlank()) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Visibility is required");
        }
        return Arrays.stream(values())
            .filter(value -> value.name().equalsIgnoreCase(raw.trim()))
            .findFirst()
            .orElseThrow(() -> new BusinessException(ErrorCode.BAD_REQUEST, "Unsupported visibility: " + raw));
    }
}
