package io.github.shizuki.site.user.controller;

import io.github.shizuki.common.core.response.ApiResponse;
import io.github.shizuki.common.security.annotation.RequireGroup;
import io.github.shizuki.site.user.dto.AdminOptionsResponse;
import io.github.shizuki.site.user.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 管理员后台配置选项接口。
 */
@RestController
@RequestMapping("/api/v1/admin/options")
@RequireGroup("ADMIN")
@Tag(name = "Admin Options", description = "管理员后台配置选项接口")
public class AdminOptionsController {

    private final UserService userService;

    public AdminOptionsController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    @Operation(summary = "获取管理员配置选项", description = "返回分组目录、权限目录、配额目录")
    public ApiResponse<AdminOptionsResponse> getAdminOptions() {
        return ApiResponse.success(userService.getAdminOptions());
    }
}
