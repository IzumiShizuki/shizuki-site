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

/**
 * 当前用户信息控制器。
 *
 * <p>提供“我是谁”和“我的偏好配置”读写能力。
 */
@RestController
@RequestMapping("/api/v1/me")
@Tag(name = "Me", description = "当前登录用户相关接口")
public class MeController {

    /**
     * 用户域服务，封装用户信息查询与偏好配置持久化。
     */
    private final UserService userService;

    /**
     * 构造当前用户控制器。
     *
     * @param userService 用户域服务
     */
    public MeController(UserService userService) {
        this.userService = userService;
    }

    /**
     * 查询当前登录用户信息。
     *
     * @return 当前登录用户的基础资料、分组和权限
     */
    @GetMapping
    @Operation(summary = "获取当前用户信息", description = "返回 userId、昵称、分组和权限")
    public ApiResponse<MeResponse> me() {
        return ApiResponse.success(userService.currentUser());
    }

    /**
     * 更新当前用户偏好配置。
     *
     * @param request 偏好请求体，承载前端透传的偏好 JSON
     * @return 空响应体，表示更新完成
     */
    @PutMapping("/preferences")
    @AuditLog(action = "user.preference.update", resource = "user_preference")
    @Operation(summary = "更新用户偏好", description = "保存首页布局、主题、组件等偏好 JSON")
    public ApiResponse<Void> updatePreference(@Valid @RequestBody PreferenceUpdateRequest request) {
        // 兼容测试或边缘场景下的空上下文：未拿到登录态时回落为 0，交给 service 层决定是否允许持久化。
        Long userId = LoginUserContext.get().map(user -> user.getUserId()).orElse(0L);
        userService.savePreference(userId, request.getPreferenceJson());
        return ApiResponse.success(null);
    }
}
