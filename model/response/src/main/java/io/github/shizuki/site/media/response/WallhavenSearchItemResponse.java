package io.github.shizuki.site.media.response;

import java.util.List;

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
        String category,
        long views,
        long favorites,
        String createdAt,
        List<String> colors,
        String sourceUrl
) {
}
