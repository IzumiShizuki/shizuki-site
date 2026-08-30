package io.github.shizuki.site.content.request;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.math.BigDecimal;

public record SiteWidgetConfigurationRequest(
    @Min(0) int expectedVersion,
    @NotBlank @Size(max = 128) String displayName,
    @NotNull BigDecimal latitude,
    @NotNull BigDecimal longitude,
    @NotBlank @Size(max = 64) String timezone,
    boolean weatherEnabled,
    @Min(15) @Max(10_080) int weatherMaxStaleMinutes,
    @NotBlank String quoteSourceMode,
    boolean hitokotoEnabled
) {
}
