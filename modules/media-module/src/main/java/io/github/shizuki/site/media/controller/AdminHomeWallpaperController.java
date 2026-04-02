package io.github.shizuki.site.media.controller;

import io.github.shizuki.common.audit.annotation.AuditLog;
import io.github.shizuki.common.core.response.ApiResponse;
import io.github.shizuki.common.security.annotation.RequireGroup;
import io.github.shizuki.site.media.request.AdminWallpaperAuditRequest;
import io.github.shizuki.site.media.response.AdminWallpaperAuditResponse;
import io.github.shizuki.site.media.response.WallpaperProfileResponse;
import io.github.shizuki.site.media.service.WallpaperService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/admin/home-wallpapers")
@RequireGroup("ADMIN")
@Tag(name = "Admin Home Wallpaper", description = "管理员壁纸审核")
public class AdminHomeWallpaperController {

    private final WallpaperService wallpaperService;

    public AdminHomeWallpaperController(WallpaperService wallpaperService) {
        this.wallpaperService = wallpaperService;
    }

    @GetMapping("/pending")
    @Operation(summary = "查询待审核壁纸")
    public ApiResponse<List<WallpaperProfileResponse>> listPending() {
        return ApiResponse.success(wallpaperService.listPendingWallpapers());
    }

    @PutMapping("/{wallpaper_id}/audit-status")
    @AuditLog(action = "home.wallpaper.audit.update", resource = "home_wallpaper")
    @Operation(summary = "审核壁纸状态")
    public ApiResponse<AdminWallpaperAuditResponse> audit(@PathVariable("wallpaper_id") Long wallpaperId,
                                                          @Valid @RequestBody AdminWallpaperAuditRequest request) {
        return ApiResponse.success(wallpaperService.auditWallpaper(wallpaperId, request));
    }
}
