package io.github.shizuki.site.content.controller.photo;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import java.time.LocalDateTime;

public record AdminManagedPhotoUpdateRequest(
    @NotBlank @Size(max = 256) String title,
    @Size(max = 512) String altText,
    LocalDateTime capturedAtDraft,
    @Size(max = 256) String publishedLocationLabel,
    boolean locationReviewAcknowledged
) {
}
