package io.github.shizuki.site.media.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * 个人照片允许生成的有限派生集合。
 */
public enum ImageVariantTypeEnum {
    THUMB_WEBP,
    DISPLAY_WEBP,
    DISPLAY_AVIF,
    FULL_SANITIZED;

    @JsonValue
    public String jsonValue() {
        return name();
    }

    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    public static ImageVariantTypeEnum fromJson(String raw) {
        return MediaContractEnumParser.parse(ImageVariantTypeEnum.class, raw);
    }
}
