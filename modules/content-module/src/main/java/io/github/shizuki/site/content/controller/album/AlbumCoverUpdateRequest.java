package io.github.shizuki.site.content.controller.album;

import jakarta.validation.constraints.Positive;

public record AlbumCoverUpdateRequest(@Positive long photoId) {
}
