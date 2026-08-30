package io.github.shizuki.site.content.service.album;

import io.github.shizuki.site.admin.response.OptimisticVersionResponse;
import io.github.shizuki.site.content.entity.AlbumPhotoEntity;
import java.util.List;

/** Current album version and the complete persisted photo order after a composition command. */
public record AlbumPhotoMutationResult(
    OptimisticVersionResponse version,
    List<AlbumPhotoEntity> photos
) {
    public AlbumPhotoMutationResult {
        photos = photos == null ? List.of() : List.copyOf(photos);
    }
}
