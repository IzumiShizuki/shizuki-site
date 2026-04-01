package io.github.shizuki.site.user.controller;

import io.github.shizuki.common.audit.annotation.AuditLog;
import io.github.shizuki.common.core.response.ApiResponse;
import io.github.shizuki.common.security.annotation.RequireAdminPrivilege;
import io.github.shizuki.common.security.annotation.RequireGroup;
import io.github.shizuki.common.security.service.AdminPrivilegeService;
import io.github.shizuki.site.user.dto.AdminGroupCreateRequest;
import io.github.shizuki.site.user.dto.AdminGroupDeleteRequest;
import io.github.shizuki.site.user.dto.AdminGroupDeleteResponse;
import io.github.shizuki.site.user.dto.AdminGroupItemResponse;
import io.github.shizuki.site.user.dto.AdminGroupPageResponse;
import io.github.shizuki.site.user.dto.AdminGroupUpdateRequest;
import io.github.shizuki.site.user.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 管理员分组目录管理接口。
 */
@RestController
@RequestMapping("/api/v1/admin/groups")
@RequireGroup("ADMIN")
@Tag(name = "Admin Group Catalog", description = "管理员分组目录管理接口")
public class AdminGroupCatalogController {

    private final UserService userService;
    private final AdminPrivilegeService adminPrivilegeService;

    public AdminGroupCatalogController(UserService userService, AdminPrivilegeService adminPrivilegeService) {
        this.userService = userService;
        this.adminPrivilegeService = adminPrivilegeService;
    }

    @GetMapping
    @Operation(summary = "分页查询分组目录", description = "按关键字和状态查询分组目录列表")
    public ApiResponse<AdminGroupPageResponse> listGroups(@RequestParam(value = "page", required = false) Integer page,
                                                          @RequestParam(value = "page_size", required = false) Integer pageSize,
                                                          @RequestParam(value = "keyword", required = false) String keyword,
                                                          @RequestParam(value = "status", required = false) String status) {
        return ApiResponse.success(userService.listAdminGroups(page, pageSize, keyword, status));
    }

    @PostMapping
    @RequireAdminPrivilege
    @AuditLog(action = "group.catalog.create", resource = "group_catalog")
    @Operation(summary = "创建分组目录项", description = "仅需输入展示名，后端自动生成 group_code")
    public ApiResponse<AdminGroupItemResponse> createGroup(@Valid @RequestBody AdminGroupCreateRequest request) {
        return ApiResponse.success(userService.createAdminGroup(request));
    }

    @PutMapping("/{group_code}")
    @RequireAdminPrivilege
    @AuditLog(action = "group.catalog.update", resource = "group_catalog")
    @Operation(summary = "更新分组目录项", description = "可更新 display_name/description/status，group_code 不可改")
    public ApiResponse<AdminGroupItemResponse> updateGroup(@PathVariable("group_code") String groupCode,
                                                           @Valid @RequestBody AdminGroupUpdateRequest request) {
        return ApiResponse.success(userService.updateAdminGroup(groupCode, request));
    }

    @PostMapping("/{group_code}/delete")
    @AuditLog(action = "group.catalog.delete", resource = "group_catalog")
    @Operation(summary = "删除分组目录项", description = "必须再次提交管理员权限码，成功后级联清理关联配置")
    public ApiResponse<AdminGroupDeleteResponse> deleteGroup(@PathVariable("group_code") String groupCode,
                                                             @Valid @RequestBody AdminGroupDeleteRequest request) {
        adminPrivilegeService.verifyCode(request.getPrivilegeCode());
        userService.deleteAdminGroup(groupCode);
        return ApiResponse.success(new AdminGroupDeleteResponse("DELETED", groupCode));
    }
}
