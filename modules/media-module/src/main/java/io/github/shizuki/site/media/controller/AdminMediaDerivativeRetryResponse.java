package io.github.shizuki.site.media.controller;

import io.github.shizuki.site.media.model.ImageDerivativeStatusEnum;
import io.github.shizuki.site.media.model.ImageVariantTypeEnum;

public record AdminMediaDerivativeRetryResponse(
    String mediaRef,
    ImageVariantTypeEnum variant,
    ImageDerivativeStatusEnum status,
    int version,
    String etag
) {
}
