package io.github.shizuki.site.user.controller;

import io.github.shizuki.common.core.response.ApiResponse;
import io.github.shizuki.site.user.dto.auth.AuthGrantRequest;
import io.github.shizuki.site.user.dto.auth.AuthIntrospectResponse;
import io.github.shizuki.site.user.dto.auth.AuthLogoutRequest;
import io.github.shizuki.site.user.dto.auth.AuthTokenResponse;
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

@RestController
@RequestMapping("/api/v1/auth")
@Tag(name = "Auth", description = "认证与登录态相关接口")
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/tokens")
    @Operation(summary = "统一 token 颁发", description = "按 grant_type 分发登录策略并返回 access token + refresh token")
    public ApiResponse<AuthTokenResponse> issueToken(@Valid @RequestBody AuthGrantRequest request) {
        return ApiResponse.success(authService.issueToken(request));
    }

    @PostMapping("/logout")
    @Operation(summary = "退出登录", description = "使当前登录态失效")
    public ApiResponse<Map<String, String>> logout(@RequestBody(required = false) AuthLogoutRequest request) {
        authService.logout(request);
        return ApiResponse.success(Map.of("status", "OK"));
    }

    @GetMapping("/introspect")
    @Operation(summary = "校验登录态", description = "网关调用该接口解析 token 对应用户信息")
    public ApiResponse<AuthIntrospectResponse> introspect() {
        return ApiResponse.success(authService.introspect());
    }
}
