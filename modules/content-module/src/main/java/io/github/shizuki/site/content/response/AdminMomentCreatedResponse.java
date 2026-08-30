package io.github.shizuki.site.content.response;

import io.github.shizuki.site.admin.response.OptimisticVersionResponse;

public record AdminMomentCreatedResponse(
    long id,
    String publicId,
    String lifecycle,
    String visibility,
    OptimisticVersionResponse version
) {
}
