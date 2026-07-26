package io.github.shizuki.site.media.response;

import java.util.List;

public record WorkshopSearchResponse(
        List<WorkshopSearchItemResponse> items,
        int page,
        int pageSize,
        boolean hasMore,
        long total,
        String source
) {
}
