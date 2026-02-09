package io.github.shizuki.site.user.controller;

import io.github.shizuki.common.audit.annotation.AuditLog;
import io.github.shizuki.common.core.response.ApiResponse;
import io.github.shizuki.common.security.context.LoginUserContext;
import io.github.shizuki.site.user.dto.MeResponse;
import io.github.shizuki.site.user.dto.PreferenceUpdateRequest;
import io.github.shizuki.site.user.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/me")
@Tag(name = "Me", description = "当前登录用户相关接口")
public class MeController {

    private final UserService userService;

    public MeController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    @Operation(summary = "获取当前用户信息", description = "返回 userId、昵称、分组和权限")
    public ApiResponse<MeResponse> me() {
        return ApiResponse.success(userService.currentUser());
    }

    @PutMapping("/preferences")
    @AuditLog(action = "user.preference.update", resource = "user_preference")
    @Operation(summary = "更新用户偏好", description = "保存首页布局、主题、组件等偏好 JSON")
    public ApiResponse<Void> updatePreference(@Valid @RequestBody PreferenceUpdateRequest request) {
        Long userId = LoginUserContext.get().map(user -> user.getUserId()).orElse(0L);
        userService.savePreference(userId, request.getPreferenceJson());
        return ApiResponse.success(null);
    }
}
