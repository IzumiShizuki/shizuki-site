package io.github.shizuki.site.life.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * 个人内容的访客可见性，与发布生命周期相互独立。
 */
public enum LifeContentVisibilityEnum {
    PUBLIC,
    UNLISTED,
    PRIVATE;

    @JsonValue
    public String jsonValue() {
        return name();
    }

    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    public static LifeContentVisibilityEnum fromJson(String raw) {
        return LifeContractEnumParser.parse(LifeContentVisibilityEnum.class, raw);
    }
}
