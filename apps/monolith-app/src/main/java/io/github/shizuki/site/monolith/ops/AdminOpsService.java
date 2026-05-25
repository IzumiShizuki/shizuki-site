package io.github.shizuki.site.monolith.ops;

import io.github.shizuki.site.admin.response.AdminOpsContainerActionResponse;
import io.github.shizuki.site.admin.response.AdminOpsContainerResponse;
import io.github.shizuki.site.admin.response.AdminOpsOverviewResponse;
import java.util.List;

public interface AdminOpsService {

    AdminOpsOverviewResponse getOverview();

    List<AdminOpsContainerResponse> listContainers();

    AdminOpsContainerActionResponse actionContainer(String containerId, String action);
}
