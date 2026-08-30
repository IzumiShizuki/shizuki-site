package io.github.shizuki.site.content.request;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public record QuoteReviewRequest(
    @Min(0) int expectedVersion,
    @NotBlank String approvalStatus,
    boolean enabled
) {
}
