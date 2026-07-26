package io.github.shizuki.site.media.response;

public record WallhavenSearchItemResponse(
        String id,
        String thumbUrl,
        String fullUrl,
        String detailUrl,
        String resolution,
        String ratio,
        long fileSizeBytes,
        String fileType,
        String purity,
        String category
) {
}
