package io.github.shizuki.site.content.controller.photo;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import java.time.LocalDateTime;

public record AdminManagedPhotoRequest(
    @Positive Long assetId,
    @NotBlank @Size(max = 256) String title,
    @Size(max = 512) String altText,
    LocalDateTime capturedAtDraft,
    @Size(max = 256) String publishedLocationLabel,
    boolean locationReviewAcknowledged
) {
}
