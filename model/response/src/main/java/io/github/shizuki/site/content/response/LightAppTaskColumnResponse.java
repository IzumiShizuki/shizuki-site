package io.github.shizuki.site.content.response;

public record LightAppTaskColumnResponse(
    String columnCode,
    String title,
    int sortNum,
    boolean enabled
) {
}
