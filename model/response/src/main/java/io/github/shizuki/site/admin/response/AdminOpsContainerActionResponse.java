package io.github.shizuki.site.admin.response;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Admin ops container action response")
public record AdminOpsContainerActionResponse(
    @Schema(description = "Container id") String containerId,
    @Schema(description = "Container name") String containerName,
    @Schema(description = "Action", example = "restart") String action,
    @Schema(description = "Action status", example = "ACCEPTED") String status,
    @Schema(description = "Message") String message
) {
}
