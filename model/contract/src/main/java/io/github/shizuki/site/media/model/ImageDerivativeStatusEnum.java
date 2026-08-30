package io.github.shizuki.site.media.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * 单个图片派生任务的持久化处理状态。
 */
public enum ImageDerivativeStatusEnum {
    PENDING,
    PROCESSING,
    READY,
    REVOKING,
    REVOKED,
    FAILED;

    @JsonValue
    public String jsonValue() {
        return name();
    }

    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    public static ImageDerivativeStatusEnum fromJson(String raw) {
        return MediaContractEnumParser.parse(ImageDerivativeStatusEnum.class, raw);
    }
}
