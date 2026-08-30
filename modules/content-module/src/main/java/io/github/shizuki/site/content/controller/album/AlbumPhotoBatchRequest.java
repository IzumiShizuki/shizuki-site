package io.github.shizuki.site.content.controller.album;

import io.github.shizuki.site.life.model.PhotoDownloadModeEnum;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import java.util.List;

public record AlbumPhotoBatchRequest(
    @NotEmpty @Size(max = 200) List<@Valid Item> photos
) {
    public record Item(
        @Positive long photoId,
        @Size(max = 4_000) String caption,
        @NotNull PhotoDownloadModeEnum downloadMode
    ) {
    }
}
