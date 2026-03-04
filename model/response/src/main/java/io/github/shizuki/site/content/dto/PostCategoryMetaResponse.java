package io.github.shizuki.site.content.dto;

public record PostCategoryMetaResponse(
    String categoryCode,
    String displayName,
    String coverImageUrl,
    Integer sortNum,
    boolean enabled
) {
}
