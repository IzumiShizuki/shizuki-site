package io.github.shizuki.site.content.controller.album;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import java.util.List;

public record AlbumPhotoIdsRequest(
    @NotNull @Size(max = 200) List<@Positive Long> photoIds
) {
}
