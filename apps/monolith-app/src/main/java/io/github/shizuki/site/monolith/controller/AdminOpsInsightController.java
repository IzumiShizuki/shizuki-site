package io.github.shizuki.site.monolith.controller;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.common.core.response.ApiResponse;
import io.github.shizuki.common.security.annotation.RequireGroup;
import io.github.shizuki.common.security.context.LoginUserContext;
import io.github.shizuki.common.security.model.LoginUser;
import io.github.shizuki.site.admin.response.AdminOpsContainerLogsResponse;
import io.github.shizuki.site.admin.response.AdminOpsMeguriStatusResponse;
import io.github.shizuki.site.admin.response.AdminOpsServiceHealthResponse;
import io.github.shizuki.site.monolith.ops.AdminOpsInsightService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/admin/ops")
@RequireGroup("ADMIN")
@Tag(name = "Admin Ops Insight", description = "Read-only server insight: container logs, service health and Meguri Pet status")
public class AdminOpsInsightController {

    private final AdminOpsInsightService insightService;

    public AdminOpsInsightController(AdminOpsInsightService insightService) {
        this.insightService = insightService;
    }

    @GetMapping("/containers/{containerId}/logs")
    @Operation(summary = "Read the recent logs of one visible container")
    public ApiResponse<AdminOpsContainerLogsResponse> containerLogs(
        @PathVariable("containerId") String containerId,
        @RequestParam(value = "tail", required = false) Integer tail) {
        requireAdminContext();
        return ApiResponse.success(insightService.getContainerLogs(containerId, tail));
    }

    @GetMapping("/services/health")
    @Operation(summary = "Probe the configured server services and sidecars")
    public ApiResponse<List<AdminOpsServiceHealthResponse>> servicesHealth() {
        requireAdminContext();
        return ApiResponse.success(insightService.checkServiceHealth());
    }

    @GetMapping("/meguri/status")
    @Operation(summary = "Summarize the Meguri Pet container, telemetry freshness and health")
    public ApiResponse<AdminOpsMeguriStatusResponse> meguriStatus() {
        requireAdminContext();
        return ApiResponse.success(insightService.getMeguriStatus());
    }

    private void requireAdminContext() {
        LoginUser loginUser = LoginUserContext.get().orElse(null);
        if (loginUser == null || loginUser.getUserId() == null) {
            throw new BusinessException(ErrorCode.UNAUTHORIZED, "Login required");
        }
        boolean admin = loginUser.getGroups().stream().anyMatch(group -> "ADMIN".equalsIgnoreCase(group));
        if (!admin) {
            throw new BusinessException(ErrorCode.FORBIDDEN, "Group required: ADMIN");
        }
    }
}
