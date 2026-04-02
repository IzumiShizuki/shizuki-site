package io.github.shizuki.site.content.response;

public record PostCategoryMetaResponse(
    String categoryCode,
    String displayName,
    String coverImageUrl,
    Integer sortNum,
    boolean enabled
) {
}
