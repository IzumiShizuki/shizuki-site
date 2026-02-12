package io.github.shizuki.site.user.controller;

import io.github.shizuki.common.core.response.ApiResponse;
import io.github.shizuki.site.user.dto.auth.AuthTokenResponse;
import io.github.shizuki.site.user.dto.auth.EmailRegisterRequest;
import io.github.shizuki.site.user.service.AuthService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 认证注册控制器。
 *
 * <p>当前聚焦邮箱注册能力，校验验证码后直接签发登录 token。
 */
@RestController
@RequestMapping("/api/v1/auth/register")
@Tag(name = "Auth Register", description = "注册相关接口")
public class AuthRegistrationController {

    /**
     * 认证服务，负责注册与 token 签发流程。
     */
    private final AuthService authService;

    /**
     * 构造认证注册控制器。
     *
     * @param authService 认证服务
     */
    public AuthRegistrationController(AuthService authService) {
        this.authService = authService;
    }

    /**
     * 邮箱注册并直接登录。
     *
     * @param request 注册请求，包含邮箱、密码、昵称（可选）和邮箱验证码
     * @return 注册成功后的 access/refresh token
     */
    @PostMapping("/email")
    @Operation(summary = "邮箱注册", description = "通过邮箱验证码注册并直接签发 token")
    public ApiResponse<AuthTokenResponse> registerByEmail(@Valid @RequestBody EmailRegisterRequest request) {
        return ApiResponse.success(authService.registerByEmail(request));
    }
}
