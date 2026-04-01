package io.github.shizuki.site.user.controller;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.common.core.response.ApiResponse;
import io.github.shizuki.common.security.annotation.RequireGroup;
import io.github.shizuki.common.security.context.LoginUserContext;
import io.github.shizuki.common.security.model.LoginUser;
import io.github.shizuki.common.security.service.AdminPrivilegeService;
import io.github.shizuki.site.user.request.AdminPrivilegeUnlockRequest;
import io.github.shizuki.site.user.dto.AdminPrivilegeUnlockResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 管理员敏感操作二次验证接口。
 */
@RestController
@RequestMapping("/api/v1/admin/privileges")
@RequireGroup("ADMIN")
@Tag(name = "Admin Privilege", description = "管理员敏感操作二次验证接口")
public class AdminPrivilegeController {

    private final AdminPrivilegeService adminPrivilegeService;

    public AdminPrivilegeController(AdminPrivilegeService adminPrivilegeService) {
        this.adminPrivilegeService = adminPrivilegeService;
    }

    @PostMapping("/unlock")
    @Operation(summary = "验证管理员权限码并解锁敏感操作", description = "验证成功后在 Redis 写入 30 分钟解锁状态")
    public ApiResponse<AdminPrivilegeUnlockResponse> unlock(@Valid @RequestBody AdminPrivilegeUnlockRequest request,
                                                            @RequestHeader(value = HttpHeaders.AUTHORIZATION, required = false)
                                                            String authorizationHeader) {
        LoginUser loginUser = LoginUserContext.get().orElse(null);
        if (loginUser == null) {
            throw new BusinessException(ErrorCode.UNAUTHORIZED, "Login required");
        }

        adminPrivilegeService.verifyAndUnlock(loginUser, authorizationHeader, request.getCode());
        return ApiResponse.success(new AdminPrivilegeUnlockResponse(
            "UNLOCKED",
            adminPrivilegeService.getUnlockTtlSeconds()
        ));
    }
}
