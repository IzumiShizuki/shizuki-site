package io.github.shizuki.site.media.model;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import java.util.Arrays;

/**
 * 资源可见性枚举。
 */
public enum AssetVisibilityEnum {
    /**
     * 私有资源，仅签名地址可访问。
     */
    PRIVATE(1),
    /**
     * 公开资源，可生成公共直链。
     */
    PUBLIC(2),
    /**
     * 分组可见资源，命中任一授权组可访问。
     */
    GROUP(3);

    private final int code;

    AssetVisibilityEnum(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    /**
     * 按 code 解析可见性。
     */
    public static AssetVisibilityEnum fromCode(Integer code) {
        if (code == null) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Visibility code is required");
        }
        return Arrays.stream(values())
            .filter(value -> value.code == code)
            .findFirst()
            .orElseThrow(() -> new BusinessException(ErrorCode.BAD_REQUEST, "Unsupported visibility code: " + code));
    }

    /**
     * 按名称解析可见性；若输入为空则返回默认值。
     */
    public static AssetVisibilityEnum fromName(String raw, AssetVisibilityEnum defaultValue) {
        if (raw == null || raw.isBlank()) {
            return defaultValue;
        }
        return Arrays.stream(values())
            .filter(value -> value.name().equalsIgnoreCase(raw.trim()))
            .findFirst()
            .orElseThrow(() -> new BusinessException(ErrorCode.BAD_REQUEST, "Unsupported visibility: " + raw));
    }
}
