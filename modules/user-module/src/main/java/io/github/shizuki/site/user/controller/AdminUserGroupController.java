package io.github.shizuki.site.user.controller;

import io.github.shizuki.common.audit.annotation.AuditLog;
import io.github.shizuki.common.core.response.ApiResponse;
import io.github.shizuki.common.security.annotation.RequireAdminPrivilege;
import io.github.shizuki.common.security.annotation.RequireGroup;
import io.github.shizuki.site.user.response.AdminUserPageResponse;
import io.github.shizuki.site.user.response.UserGroupsResponse;
import io.github.shizuki.site.user.request.UserGroupsUpdateRequest;
import io.github.shizuki.site.user.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 管理员用户分组管理接口。
 */
@RestController
@RequestMapping("/api/v1/admin/users")
@RequireGroup("ADMIN")
@Tag(name = "Admin User Group", description = "管理员用户分组管理接口")
public class AdminUserGroupController {

    private final UserService userService;

    public AdminUserGroupController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    @Operation(summary = "分页查询用户", description = "按关键字搜索用户并返回分页结果")
    public ApiResponse<AdminUserPageResponse> listUsers(@RequestParam(value = "page", required = false) Integer page,
                                                        @RequestParam(value = "page_size", required = false) Integer pageSize,
                                                        @RequestParam(value = "keyword", required = false) String keyword) {
        return ApiResponse.success(userService.listAdminUsers(page, pageSize, keyword));
    }

    @GetMapping("/{user_id}/groups")
    @Operation(summary = "查询用户分组", description = "按用户 ID 查询当前分组集合")
    public ApiResponse<UserGroupsResponse> getUserGroups(@PathVariable("user_id") Long userId) {
        return ApiResponse.success(userService.getUserGroups(userId));
    }

    @PutMapping("/{user_id}/groups")
    @RequireAdminPrivilege
    @AuditLog(action = "user.group.update", resource = "user_group")
    @Operation(summary = "更新用户分组", description = "按用户 ID 全量覆盖分组集合")
    public ApiResponse<UserGroupsResponse> replaceUserGroups(@PathVariable("user_id") Long userId,
                                                             @Valid @RequestBody UserGroupsUpdateRequest request) {
        return ApiResponse.success(userService.replaceUserGroups(userId, request.getGroups()));
    }
}
