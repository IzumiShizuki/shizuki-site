package io.github.shizuki.site.content.dto;

import java.time.LocalDateTime;
import java.util.List;

public record PostSidebarResponse(
    List<LatestPostItem> latestPosts,
    List<CategoryStatItem> categories,
    List<TagStatItem> tags,
    List<ArchiveStatItem> archives
) {

    public record LatestPostItem(
        Long postId,
        String title,
        LocalDateTime publishedAt,
        String coverImageUrl
    ) {
    }

    public record CategoryStatItem(
        String categoryCode,
        Long count,
        String displayName,
        String coverImageUrl
    ) {
    }

    public record TagStatItem(
        String tagCode,
        Long count
    ) {
    }

    public record ArchiveStatItem(
        String month,
        Long count
    ) {
    }
}
