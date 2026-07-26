package io.github.shizuki.site.admin.response;

import java.util.List;

public record AdminOpsContainerLogsResponse(String containerId,
                                            String containerName,
                                            int tailLines,
                                            List<String> lines) {
}
