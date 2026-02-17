package io.github.shizuki.site.media.model;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import java.util.Arrays;

/**
 * 资源类别枚举。
 *
 * <p>数据库以 tinyint 存储 code；接口统一返回枚举 name 字符串。
 */
public enum AssetKindEnum {
    /**
     * 静态图片。
     */
    STATIC_IMAGE(1),
    /**
     * 动态图片（GIF/WebP/APNG）。
     */
    ANIMATED_IMAGE(2),
    /**
     * Live2D ZIP 包。
     */
    LIVE2D_PACKAGE(3),
    /**
     * 音频文件。
     */
    AUDIO(4);

    private final int code;

    AssetKindEnum(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    /**
     * 按数据库 code 解析枚举。
     */
    public static AssetKindEnum fromCode(Integer code) {
        if (code == null) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Asset kind code is required");
        }
        return Arrays.stream(values())
            .filter(value -> value.code == code)
            .findFirst()
            .orElseThrow(() -> new BusinessException(ErrorCode.BAD_REQUEST, "Unsupported asset kind code: " + code));
    }

    /**
     * 按字符串（大小写不敏感）解析枚举。
     */
    public static AssetKindEnum fromName(String raw) {
        if (raw == null || raw.isBlank()) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Asset kind is required");
        }
        return Arrays.stream(values())
            .filter(value -> value.name().equalsIgnoreCase(raw.trim()))
            .findFirst()
            .orElseThrow(() -> new BusinessException(ErrorCode.BAD_REQUEST, "Unsupported asset kind: " + raw));
    }
}
