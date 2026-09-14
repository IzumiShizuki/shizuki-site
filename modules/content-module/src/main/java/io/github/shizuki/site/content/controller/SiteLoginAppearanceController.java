package io.github.shizuki.site.content.controller;

import io.github.shizuki.common.core.response.ApiResponse;
import io.github.shizuki.site.content.response.LoginAppearanceResponse;
import io.github.shizuki.site.content.service.LoginAppearanceService;
import org.springframework.http.CacheControl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 公开登录页外观配置接口。
 *
 * <p>无认证读取站点级登录页主题与二次元图片配置；未配置时返回 {@code null}。
 */
@RestController
@RequestMapping("/api/v1/site/login-appearance")
public class SiteLoginAppearanceController {

    private final LoginAppearanceService appearanceService;

    public SiteLoginAppearanceController(LoginAppearanceService appearanceService) {
        this.appearanceService = appearanceService;
    }

    @GetMapping
    public ResponseEntity<ApiResponse<LoginAppearanceResponse>> appearance() {
        return ResponseEntity.ok()
            .cacheControl(CacheControl.noStore())
            .body(ApiResponse.success(appearanceService.publicSnapshot()));
    }
}
