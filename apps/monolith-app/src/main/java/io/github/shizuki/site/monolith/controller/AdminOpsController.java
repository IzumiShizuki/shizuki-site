package io.github.shizuki.site.monolith.controller;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.common.core.response.ApiResponse;
import io.github.shizuki.common.security.annotation.RequireAdminPrivilege;
import io.github.shizuki.common.security.annotation.RequireGroup;
import io.github.shizuki.common.security.context.LoginUserContext;
import io.github.shizuki.common.security.model.LoginUser;
import io.github.shizuki.common.security.service.AdminPrivilegeService;
import io.github.shizuki.site.admin.request.AdminOpsContainerActionRequest;
import io.github.shizuki.site.admin.response.AdminOpsContainerActionResponse;
import io.github.shizuki.site.admin.response.AdminOpsContainerResponse;
import io.github.shizuki.site.admin.response.AdminOpsOverviewResponse;
import io.github.shizuki.site.monolith.ops.AdminOpsService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import java.util.List;
import java.util.Map;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/admin/ops")
@RequireGroup("ADMIN")
@Tag(name = "Admin Ops", description = "Admin server ops endpoints")
public class AdminOpsController {

    private final AdminOpsService adminOpsService;
    private final AdminPrivilegeService adminPrivilegeService;

    public AdminOpsController(AdminOpsService adminOpsService,
                              AdminPrivilegeService adminPrivilegeService) {
        this.adminOpsService = adminOpsService;
        this.adminPrivilegeService = adminPrivilegeService;
    }

    @GetMapping("/overview")
    @Operation(summary = "Get ops overview")
    public ApiResponse<AdminOpsOverviewResponse> overview() {
        requireAdminContext();
        return ApiResponse.success(adminOpsService.getOverview());
    }

    @GetMapping("/containers")
    @Operation(summary = "List manageable containers")
    public ApiResponse<List<AdminOpsContainerResponse>> listContainers() {
        requireAdminContext();
        return ApiResponse.success(adminOpsService.listContainers());
    }

    @PostMapping("/containers/{containerId}/actions")
    @RequireAdminPrivilege
    @Operation(summary = "Operate a container", description = "Allowed actions: start|stop|restart")
    public ApiResponse<AdminOpsContainerActionResponse> actionContainer(@PathVariable("containerId") String containerId,
                                                                        @Valid @RequestBody AdminOpsContainerActionRequest request,
                                                                        HttpServletRequest servletRequest) {
        LoginUser loginUser = requireAdminContext();
        requireAdminPrivilegeUnlocked(loginUser, servletRequest);
        return ApiResponse.success(adminOpsService.actionContainer(containerId, request.getAction()));
    }

    private LoginUser requireAdminContext() {
        LoginUser loginUser = LoginUserContext.get().orElse(null);
        if (loginUser == null || loginUser.getUserId() == null) {
            throw new BusinessException(ErrorCode.UNAUTHORIZED, "Login required");
        }
        boolean admin = loginUser.getGroups().stream().anyMatch(group -> "ADMIN".equalsIgnoreCase(group));
        if (!admin) {
            throw new BusinessException(ErrorCode.FORBIDDEN, "Group required: ADMIN");
        }
        return loginUser;
    }

    private void requireAdminPrivilegeUnlocked(LoginUser loginUser, HttpServletRequest request) {
        String authorizationHeader = request == null ? "" : request.getHeader(HttpHeaders.AUTHORIZATION);
        if (authorizationHeader == null) {
            authorizationHeader = "";
        }
        if (adminPrivilegeService.isUnlocked(loginUser, authorizationHeader)) {
            return;
        }
        throw new BusinessException(
            ErrorCode.FORBIDDEN,
            "Admin privilege verification required",
            Map.of(
                "reason", "ADMIN_PRIVILEGE_REQUIRED",
                "privilege_ttl_seconds", adminPrivilegeService.getUnlockTtlSeconds()
            )
        );
    }
}
