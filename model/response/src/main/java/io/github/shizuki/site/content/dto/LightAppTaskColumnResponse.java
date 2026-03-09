package io.github.shizuki.site.content.dto;

public record LightAppTaskColumnResponse(
    String columnCode,
    String title,
    int sortNum,
    boolean enabled
) {
}
