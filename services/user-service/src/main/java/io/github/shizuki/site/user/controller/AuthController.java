package io.github.shizuki.site.user.controller;

import io.github.shizuki.common.core.response.ApiResponse;
import io.github.shizuki.site.user.dto.auth.AuthGrantRequest;
import io.github.shizuki.site.user.dto.auth.AuthIntrospectResponse;
import io.github.shizuki.site.user.dto.auth.AuthLogoutRequest;
import io.github.shizuki.site.user.dto.auth.AuthTokenResponse;
import io.github.shizuki.site.user.dto.auth.OAuthConflictConfirmRequest;
import io.github.shizuki.site.user.service.AuthService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 认证主控制器。
 *
 * <p>提供统一 token 颁发、冲突绑定确认、登出和网关 introspect 能力。
 */
@RestController
@RequestMapping("/api/v1/auth")
@Tag(name = "Auth", description = "认证与登录态相关接口")
public class AuthController {

    /**
     * 认证应用服务，封装策略分发、token 签发与登录态管理。
     */
    private final AuthService authService;

    /**
     * 构造认证主控制器。
     *
     * @param authService 认证应用服务
     */
    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    /**
     * 统一登录入口。
     *
     * @param request 授权请求体，基于 {@code grant_type} 选择邮箱密码、OAuth 授权码或 refresh token 流程
     * @return token 响应；当 OAuth 触发邮箱冲突时可能返回 {@code BIND_REQUIRED}
     */
    @PostMapping("/tokens")
    @Operation(summary = "统一 token 颁发", description = "按 grant_type 分发登录策略并返回 access token + refresh token")
    public ApiResponse<AuthTokenResponse> issueToken(@Valid @RequestBody AuthGrantRequest request) {
        return ApiResponse.success(authService.issueToken(request));
    }

    /**
     * 显式确认 OAuth 邮箱冲突绑定。
     *
     * @param request 冲突确认请求，包含 bind_ticket、邮箱与密码凭据
     * @return 绑定成功后返回新的 access/refresh token
     */
    @PostMapping("/bindings/confirm")
    @Operation(summary = "确认 OAuth 冲突绑定", description = "使用 bind_ticket 与邮箱凭据确认绑定并签发 token")
    public ApiResponse<AuthTokenResponse> confirmConflictBinding(@Valid @RequestBody OAuthConflictConfirmRequest request) {
        return ApiResponse.success(authService.confirmConflictBinding(request));
    }

    /**
     * 退出登录。
     *
     * @param request 登出请求，可选传入 refresh token 以失效对应会话，支持 logout_all 全端登出
     * @return 统一成功响应，状态字段固定为 {@code OK}
     */
    @PostMapping("/logout")
    @Operation(summary = "退出登录", description = "使当前登录态失效")
    public ApiResponse<Map<String, String>> logout(@RequestBody(required = false) AuthLogoutRequest request) {
        authService.logout(request);
        return ApiResponse.success(Map.of("status", "OK"));
    }

    /**
     * 解析 access token 对应身份信息。
     *
     * @return 当前 token 对应的用户 ID、分组与权限，供网关鉴权透传
     */
    @GetMapping("/introspect")
    @Operation(summary = "校验登录态", description = "网关调用该接口解析 token 对应用户信息")
    public ApiResponse<AuthIntrospectResponse> introspect() {
        return ApiResponse.success(authService.introspect());
    }
}
