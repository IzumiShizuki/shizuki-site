package io.github.shizuki.site.admin.request;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record AdminPurgeConfirmationRequest(
    @Min(0) int expectedVersion,
    @NotBlank @Size(max = 256) String capability,
    @NotBlank @Size(max = 128) String confirmation
) {
}
