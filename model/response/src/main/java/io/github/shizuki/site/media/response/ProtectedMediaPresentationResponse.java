package io.github.shizuki.site.media.response;

import io.github.shizuki.site.media.model.OpaqueMediaReference;
import java.util.List;

/** Media presentation whose routes require short-lived, association-bound site capabilities. */
public record ProtectedMediaPresentationResponse(
    String mediaRef,
    String altText,
    List<ProtectedMediaVariantRouteResponse> variants
) {

    public ProtectedMediaPresentationResponse {
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
