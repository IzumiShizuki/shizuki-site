package io.github.shizuki.site.content.response;

public record PublicMomentDetailResponse(
    PublicMomentResponse moment,
    boolean unlisted,
    boolean noindex
) {
    public PublicMomentDetailResponse {
        if (moment == null || unlisted != noindex) {
            throw new IllegalArgumentException("unlisted moment detail must carry matching noindex state");
        }
    }
}
