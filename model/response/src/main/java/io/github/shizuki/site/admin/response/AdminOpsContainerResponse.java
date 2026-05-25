package io.github.shizuki.site.admin.response;

import io.swagger.v3.oas.annotations.media.Schema;
import java.util.List;

@Schema(description = "Admin ops container snapshot")
public record AdminOpsContainerResponse(
    @Schema(description = "Container id") String containerId,
    @Schema(description = "Container name") String containerName,
    @Schema(description = "Container image") String image,
    @Schema(description = "Container state", example = "running") String state,
    @Schema(description = "Container status text") String status,
    @Schema(description = "Container ports") List<String> ports,
    @Schema(description = "Whether this container is running") boolean running,
    @Schema(description = "Whether this container can be managed in admin ops") boolean manageable
) {
}
