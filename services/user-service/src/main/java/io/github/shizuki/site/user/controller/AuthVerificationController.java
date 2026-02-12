package io.github.shizuki.site.user.controller;

import io.github.shizuki.common.core.response.ApiResponse;
import io.github.shizuki.common.ratelimit.annotation.RateLimit;
import io.github.shizuki.site.user.dto.auth.EmailVerificationSendRequest;
import io.github.shizuki.site.user.dto.auth.EmailVerificationSendResponse;
import io.github.shizuki.site.user.dto.auth.ImageCaptchaResponse;
import io.github.shizuki.site.user.dto.auth.OAuthAuthorizeRequest;
import io.github.shizuki.site.user.dto.auth.OAuthAuthorizeResponse;
import io.github.shizuki.site.user.service.AuthService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 认证前置验证控制器。
 *
 * <p>覆盖图形验证码、邮箱验证码发送和 OAuth 授权事务创建等“登录前”动作。
 */
@RestController
@RequestMapping("/api/v1/auth")
@Tag(name = "Auth Verify", description = "验证码与 OAuth 授权入口接口")
public class AuthVerificationController {

    /**
     * 认证服务，负责验证码生成/校验与 OAuth 授权事务创建。
     */
    private final AuthService authService;

    /**
     * 构造认证前置验证控制器。
     *
     * @param authService 认证服务
     */
    public AuthVerificationController(AuthService authService) {
        this.authService = authService;
    }

    /**
     * 生成 SVG 算术图形验证码。
     *
     * @return 验证码 ID、SVG 内容和过期时间
     */
    @GetMapping("/captchas/image")
    @Operation(summary = "获取图形验证码", description = "生成 SVG 算术验证码")
    public ApiResponse<ImageCaptchaResponse> createImageCaptcha() {
        return ApiResponse.success(authService.createImageCaptcha());
    }

    /**
     * 发送邮箱验证码。
     *
     * @param request 请求体，包含邮箱、业务用途、图形验证码 ID 与答案
     * @return 发送状态及冷却时间
     */
    @PostMapping("/verifications/email/send")
    @RateLimit(key = "auth-email-verify-send", limit = 10, windowSeconds = 60)
    @Operation(summary = "发送邮箱验证码", description = "先校验图形验证码，再发送邮箱验证码")
    public ApiResponse<EmailVerificationSendResponse> sendEmailVerification(@Valid @RequestBody EmailVerificationSendRequest request) {
        return ApiResponse.success(authService.sendEmailVerification(request));
    }

    /**
     * 创建 OAuth 授权事务。
     *
     * @param request 请求体，包含 provider、redirect_uri、scene
     * @return 授权事务 ID、OAuth provider 跳转 URL 与 state
     */
    @PostMapping("/oauth/authorizations")
    @RateLimit(key = "auth-oauth-authorizations", limit = 20, windowSeconds = 60)
    @Operation(summary = "创建 OAuth 授权事务", description = "创建 oauth_login_id、state 和授权跳转 URL")
    public ApiResponse<OAuthAuthorizeResponse> createAuthorization(@Valid @RequestBody OAuthAuthorizeRequest request) {
        return ApiResponse.success(authService.createOAuthAuthorization(request));
    }
}
