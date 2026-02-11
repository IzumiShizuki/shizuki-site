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

@RestController
@RequestMapping("/api/v1/me/bindings")
@Tag(name = "Auth Binding", description = "登录用户账号绑定接口")
public class AuthBindingController {

    private final AuthService authService;

    public AuthBindingController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/email")
    @AuditLog(action = "auth.bind.email", resource = "usr_account")
    @Operation(summary = "绑定邮箱凭据", description = "为登录用户绑定邮箱和密码凭据")
    public ApiResponse<Map<String, String>> bindEmail(@Valid @RequestBody EmailBindRequest request) {
        authService.bindEmail(requireLoginUserId(), request);
        return ApiResponse.success(Map.of("status", "OK"));
    }

    @PostMapping("/oauth")
    @AuditLog(action = "auth.bind.oauth", resource = "oau_binding")
    @Operation(summary = "绑定 OAuth 账号", description = "为登录用户绑定 GitHub/LinuxDo OAuth 账号")
    public ApiResponse<Map<String, String>> bindOAuth(@Valid @RequestBody OAuthBindRequest request) {
        authService.bindOAuth(requireLoginUserId(), request);
        return ApiResponse.success(Map.of("status", "OK"));
    }

    private Long requireLoginUserId() {
        return LoginUserContext.get()
            .map(user -> user.getUserId())
            .filter(userId -> userId > 0)
            .orElseThrow(() -> new BusinessException(ErrorCode.UNAUTHORIZED, "Login required"));
    }
}

