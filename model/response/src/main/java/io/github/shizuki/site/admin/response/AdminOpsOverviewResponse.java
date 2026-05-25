package io.github.shizuki.site.admin.response;

import io.github.shizuki.site.media.response.MusicMetingStatusResponse;
import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Admin ops overview response")
public record AdminOpsOverviewResponse(
    @Schema(description = "Ops portal url") String portalUrl,
    @Schema(description = "Meting status") MusicMetingStatusResponse meting,
    @Schema(description = "Whether Portainer is reachable") boolean portainerReachable,
    @Schema(description = "Portainer status message") String portainerMessage,
    @Schema(description = "Total managed containers") int containerTotal,
    @Schema(description = "Running managed containers") int containerRunning,
    @Schema(description = "Stopped managed containers") int containerStopped
) {
}
