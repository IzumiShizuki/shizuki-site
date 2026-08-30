package io.github.shizuki.site.life.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * 相册与生活动态共用的生命周期；受众可见性由独立枚举表达。
 */
public enum LifeContentLifecycleEnum {
    DRAFT,
    PUBLISHED,
    ARCHIVED,
    RECYCLED;

    @JsonValue
    public String jsonValue() {
        return name();
    }

    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    public static LifeContentLifecycleEnum fromJson(String raw) {
        return LifeContractEnumParser.parse(LifeContentLifecycleEnum.class, raw);
    }
}
