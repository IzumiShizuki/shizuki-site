package io.github.shizuki.site.content.request;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.util.List;

public record AdminMomentPhotoIdsRequest(
    @NotNull @Size(max = 24) List<Long> photoIds
) {
    public AdminMomentPhotoIdsRequest {
        photoIds = photoIds == null ? null : List.copyOf(photoIds);
    }
}
