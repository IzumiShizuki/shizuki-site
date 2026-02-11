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

@RestController
@RequestMapping("/api/v1/auth/register")
@Tag(name = "Auth Register", description = "注册相关接口")
public class AuthRegistrationController {

    private final AuthService authService;

    public AuthRegistrationController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/email")
    @Operation(summary = "邮箱注册", description = "通过邮箱验证码注册并直接签发 token")
    public ApiResponse<AuthTokenResponse> registerByEmail(@Valid @RequestBody EmailRegisterRequest request) {
        return ApiResponse.success(authService.registerByEmail(request));
    }
}

