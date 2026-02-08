package io.github.shizuki.site.user.controller;

import io.github.shizuki.common.core.response.ApiResponse;
import io.github.shizuki.site.user.dto.auth.AuthIntrospectResponse;
import io.github.shizuki.site.user.dto.auth.AuthLoginRequest;
import io.github.shizuki.site.user.dto.auth.AuthLoginResponse;
import io.github.shizuki.site.user.service.UserService;
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

    private final UserService userFacade;

    public AuthController(UserService userFacade) {
        this.userFacade = userFacade;
    }

    @PostMapping("/login")
    @Operation(summary = "账号登录", description = "用户名密码登录并返回 Bearer Token")
    public ApiResponse<AuthLoginResponse> login(@Valid @RequestBody AuthLoginRequest request) {
        return ApiResponse.success(userFacade.login(request.getUsername(), request.getPassword()));
    }

    @PostMapping("/logout")
    @Operation(summary = "退出登录", description = "使当前登录态失效")
    public ApiResponse<Map<String, String>> logout() {
        userFacade.logout();
        return ApiResponse.success(Map.of("status", "OK"));
    }

    @GetMapping("/introspect")
    @Operation(summary = "校验登录态", description = "网关调用该接口解析 token 对应用户信息")
    public ApiResponse<AuthIntrospectResponse> introspect() {
        return ApiResponse.success(userFacade.introspect());
    }
}
