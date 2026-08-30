package io.github.shizuki.site.content.response;

import io.github.shizuki.site.admin.response.OptimisticVersionResponse;
import java.util.List;

public record AdminMomentPhotoOrderResponse(
    OptimisticVersionResponse version,
    List<AdminMomentPhotoReferenceResponse> photos
) {
    public AdminMomentPhotoOrderResponse {
        photos = photos == null ? List.of() : List.copyOf(photos);
    }
}
