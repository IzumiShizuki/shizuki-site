package io.github.shizuki.site.life.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * 天气与今日一言等外部组件对访客公开的新鲜度状态。
 */
public enum WidgetFreshnessEnum {
    FRESH,
    STALE,
    UNAVAILABLE;

    @JsonValue
    public String jsonValue() {
        return name();
    }

    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    public static WidgetFreshnessEnum fromJson(String raw) {
        return LifeContractEnumParser.parse(WidgetFreshnessEnum.class, raw);
    }
}
