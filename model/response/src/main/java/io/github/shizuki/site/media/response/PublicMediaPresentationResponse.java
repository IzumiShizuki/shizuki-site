package io.github.shizuki.site.media.response;

import io.github.shizuki.site.media.model.OpaqueMediaReference;
import java.util.List;

/**
 * 一个内容关联的访客媒体投影；只公开 opaque 引用和站内变体路由。
 */
public record PublicMediaPresentationResponse(
    String mediaRef,
    String altText,
    List<PublicMediaVariantRouteResponse> variants
) {

    public PublicMediaPresentationResponse {
        if (!OpaqueMediaReference.isValid(mediaRef)) {
            throw new IllegalArgumentException("mediaRef must be a canonical opaque association reference");
        }
        altText = altText == null ? "" : altText.trim();
        variants = variants == null ? List.of() : List.copyOf(variants);
        if (variants.isEmpty()) {
            throw new IllegalArgumentException("at least one authorized media variant is required");
        }
    }
}
