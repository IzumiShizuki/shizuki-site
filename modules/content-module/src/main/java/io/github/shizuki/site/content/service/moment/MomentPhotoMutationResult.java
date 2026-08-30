package io.github.shizuki.site.content.service.moment;

import io.github.shizuki.site.admin.response.OptimisticVersionResponse;
import io.github.shizuki.site.content.entity.MomentPhotoEntity;
import java.util.List;

/** Current moment version and complete photo order after one composition command. */
public record MomentPhotoMutationResult(
    OptimisticVersionResponse version,
    List<MomentPhotoEntity> photos
) {
    public MomentPhotoMutationResult {
        photos = photos == null ? List.of() : List.copyOf(photos);
    }
}
