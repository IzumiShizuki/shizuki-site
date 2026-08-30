package io.github.shizuki.site.content.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record LocalQuoteRequest(
    @NotBlank @Size(max = 1000) String text,
    @Size(max = 256) String author,
    @Size(max = 256) String sourceTitle,
    @Size(max = 64) String categoryCode,
    @Size(max = 32) String providerCode,
    @Size(max = 128) String providerUuid,
    @Size(max = 1024) String sourceUrl
) {
}
