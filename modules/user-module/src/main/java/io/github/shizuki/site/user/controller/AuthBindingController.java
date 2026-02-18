package io.github.shizuki.site.user.controller;

import io.github.shizuki.common.audit.annotation.AuditLog;
import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.common.core.response.ApiResponse;
import io.github.shizuki.common.security.context.LoginUserContext;
import io.github.shizuki.site.user.dto.auth.EmailBindRequest;
import io.github.shizuki.site.user.dto.auth.OAuthBindRequest;
import io.github.shizuki.site.user.service.AuthService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import java.util.Map;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 登录态账号绑定控制器。
 *
 * <p>用于已登录用户补绑邮箱凭据或第三方 OAuth 账号，确保账号身份可以多凭据登录。
 */
@RestController
@RequestMapping("/api/v1/me/bindings")
@Tag(name = "Auth Binding", description = "登录用户账号绑定接口")
public class AuthBindingController {

    /**
     * 认证服务，负责执行绑定校验与绑定落库逻辑。
     */
    private final AuthService authService;

    /**
     * 构造账号绑定控制器。
     *
     * @param authService 认证服务
     */
    public AuthBindingController(AuthService authService) {
        this.authService = authService;
    }

    /**
     * 给当前登录用户绑定邮箱和密码凭据。
     *
     * @param request 邮箱绑定请求，包含邮箱地址、密码以及邮箱验证码
     * @return 统一成功响应，状态字段固定为 {@code OK}
     */
    @PostMapping("/email")
    @AuditLog(action = "auth.bind.email", resource = "usr_account")
    @Operation(summary = "绑定邮箱凭据", description = "为登录用户绑定邮箱和密码凭据")
    public ApiResponse<Map<String, String>> bindEmail(@Valid @RequestBody EmailBindRequest request) {
        authService.bindEmail(requireLoginUserId(), request);
        return ApiResponse.success(Map.of("status", "OK"));
    }

    /**
     * 给当前登录用户绑定 OAuth 账号（GitHub / LinuxDo）。
     *
     * @param request OAuth 绑定请求，包含 provider、oauth_login_id、code、state
     * @return 统一成功响应，状态字段固定为 {@code OK}
     */
    @PostMapping("/oauth")
    @AuditLog(action = "auth.bind.oauth", resource = "oau_binding")
    @Operation(summary = "绑定 OAuth 账号", description = "为登录用户绑定 GitHub/LinuxDo OAuth 账号")
    public ApiResponse<Map<String, String>> bindOAuth(@Valid @RequestBody OAuthBindRequest request) {
        authService.bindOAuth(requireLoginUserId(), request);
        return ApiResponse.success(Map.of("status", "OK"));
    }

    /**
     * 提取当前请求上下文中的用户 ID。
     *
     * <p>绑定接口必须在登录态下调用；这里把未登录、游客 ID（<=0）都统一收敛为 401，
     * 避免 controller 层继续执行绑定流程。
     *
     * @return 已登录用户 ID
     */
    private Long requireLoginUserId() {
        // LoginUserContext 由网关透传身份头并在服务入口解析后写入，controller 只做读取与兜底。
        return LoginUserContext.get()
            .map(user -> user.getUserId())
            .filter(userId -> userId > 0)
            .orElseThrow(() -> new BusinessException(ErrorCode.UNAUTHORIZED, "Login required"));
    }
}
