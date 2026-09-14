package io.github.shizuki.site.content.controller;

import io.github.shizuki.common.audit.annotation.AuditLog;
import io.github.shizuki.common.core.response.ApiResponse;
import io.github.shizuki.common.ratelimit.annotation.RateLimit;
import io.github.shizuki.common.security.annotation.RequireGroup;
import io.github.shizuki.common.security.annotation.RequirePermission;
import io.github.shizuki.site.content.request.LoginAppearanceSaveRequest;
import io.github.shizuki.site.content.response.LoginAppearanceResponse;
import io.github.shizuki.site.content.service.LoginAppearanceService;
import jakarta.validation.Valid;
import org.springframework.http.CacheControl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 管理员维护站点级登录页外观配置（主题预设 + 背景/看板娘图片）。
 */
@RestController
@RequestMapping("/api/v1/admin/login-appearance")
@RequireGroup("ADMIN")
@RequirePermission("site.login_appearance.manage")
public class AdminLoginAppearanceController {

    private final LoginAppearanceService appearanceService;

    public AdminLoginAppearanceController(LoginAppearanceService appearanceService) {
        this.appearanceService = appearanceService;
    }

    @GetMapping
    public ResponseEntity<ApiResponse<LoginAppearanceResponse>> appearance() {
        return noStore(appearanceService.getAdminSnapshot());
    }

    @PutMapping
    @RateLimit(key = "admin.login-appearance.save", limit = 20, windowSeconds = 60)
    @AuditLog(action = "site.login_appearance.update", resource = "login_appearance")
    public ResponseEntity<ApiResponse<LoginAppearanceResponse>> saveAppearance(
        @Valid @RequestBody LoginAppearanceSaveRequest request
    ) {
        return noStore(appearanceService.save(request));
    }

    private <T> ResponseEntity<ApiResponse<T>> noStore(T value) {
        return ResponseEntity.ok()
            .cacheControl(CacheControl.noStore())
            .body(ApiResponse.success(value));
    }
}
