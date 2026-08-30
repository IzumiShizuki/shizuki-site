package io.github.shizuki.site.content.response;

/** Safe association identity for the studio; contains no source asset or object-storage identity. */
public record AdminMomentPhotoReferenceResponse(
    long photoId,
    String mediaRef,
    int sort
) {
}
