package io.github.shizuki.site.life.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * 单个内容-照片关联上的下载策略。
 */
public enum PhotoDownloadModeEnum {
    NONE,
    SANITIZED,
    ORIGINAL;

    @JsonValue
    public String jsonValue() {
        return name();
    }

    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    public static PhotoDownloadModeEnum fromJson(String raw) {
        return LifeContractEnumParser.parse(PhotoDownloadModeEnum.class, raw);
    }
}
