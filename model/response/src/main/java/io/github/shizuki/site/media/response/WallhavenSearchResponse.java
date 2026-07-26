package io.github.shizuki.site.media.response;

import java.util.List;

public record WallhavenSearchResponse(
        List<WallhavenSearchItemResponse> items,
        int page,
        int lastPage,
        long total
) {
}
