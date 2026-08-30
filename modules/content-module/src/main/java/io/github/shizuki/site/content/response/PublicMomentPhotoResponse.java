package io.github.shizuki.site.content.response;

import io.github.shizuki.site.media.response.ProtectedMediaVariantRouteResponse;
import io.github.shizuki.site.media.response.PublicMediaVariantRouteResponse;
import java.util.List;

/** Association-scoped media presentation with mutually exclusive public/protected variants. */
public record PublicMomentPhotoResponse(
    String mediaRef,
    String altText,
    String publishedLocationLabel,
    List<PublicMediaVariantRouteResponse> variants,
    List<ProtectedMediaVariantRouteResponse> protectedVariants
) {
    public PublicMomentPhotoResponse {
        variants = variants == null ? List.of() : List.copyOf(variants);
        protectedVariants = protectedVariants == null ? List.of() : List.copyOf(protectedVariants);
        if (mediaRef == null || mediaRef.isBlank() || (variants.isEmpty() == protectedVariants.isEmpty())) {
            throw new IllegalArgumentException("moment photo must expose exactly one authorized variant mode");
        }
        altText = altText == null ? "" : altText.trim();
        publishedLocationLabel = publishedLocationLabel == null ? null : publishedLocationLabel.trim();
    }
}
