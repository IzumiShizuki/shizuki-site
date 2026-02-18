package io.github.shizuki.site.user.controller;

import io.github.shizuki.common.audit.annotation.AuditLog;
import io.github.shizuki.common.core.response.ApiResponse;
import io.github.shizuki.common.security.annotation.RequireGroup;
import io.github.shizuki.site.user.dto.GroupPermissionsResponse;
import io.github.shizuki.site.user.dto.GroupPermissionsUpdateRequest;
import io.github.shizuki.site.user.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 管理员分组权限管理接口。
 */
@RestController
@RequestMapping("/api/v1/admin/groups")
@RequireGroup("ADMIN")
@Tag(name = "Admin Group Permission", description = "管理员分组权限管理接口")
public class AdminGroupPermissionController {

    private final UserService userService;

    public AdminGroupPermissionController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/permissions")
    @Operation(summary = "查询全部分组权限", description = "按分组编码返回全部权限配置")
    public ApiResponse<List<GroupPermissionsResponse>> listAllGroupPermissions() {
        return ApiResponse.success(userService.listGroupPermissions());
    }

    @GetMapping("/{group_code}/permissions")
    @Operation(summary = "查询单个分组权限", description = "按 group_code 查询权限配置")
    public ApiResponse<GroupPermissionsResponse> getGroupPermissions(@PathVariable("group_code") String groupCode) {
        return ApiResponse.success(userService.getGroupPermissions(groupCode));
    }

    @PutMapping("/{group_code}/permissions")
    @AuditLog(action = "group.permission.update", resource = "group_permission")
    @Operation(summary = "更新分组权限", description = "按 group_code 全量覆盖权限集合")
    public ApiResponse<GroupPermissionsResponse> replaceGroupPermissions(@PathVariable("group_code") String groupCode,
                                                                         @Valid @RequestBody GroupPermissionsUpdateRequest request) {
        return ApiResponse.success(userService.replaceGroupPermissions(groupCode, request.getPermissions()));
    }
}
