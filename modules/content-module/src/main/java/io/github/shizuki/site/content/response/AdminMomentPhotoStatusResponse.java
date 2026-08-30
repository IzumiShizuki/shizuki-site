package io.github.shizuki.site.content.response;

import java.util.List;

public record AdminMomentPhotoStatusResponse(
    long photoId,
    String mediaRef,
    int sort,
    String title,
    String altText,
    String publishedLocationLabel,
    String processingStatus,
    List<AdminMomentDerivativeStatusResponse> derivatives
) {
    public AdminMomentPhotoStatusResponse {
        derivatives = derivatives == null ? List.of() : List.copyOf(derivatives);
    }
}
