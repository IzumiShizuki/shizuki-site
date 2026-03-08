package io.github.shizuki.site.media.controller;

import io.github.shizuki.common.audit.annotation.AuditLog;
import io.github.shizuki.common.core.response.ApiResponse;
import io.github.shizuki.common.ratelimit.annotation.RateLimit;
import io.github.shizuki.site.media.dto.WallpaperImportJobResponse;
import io.github.shizuki.site.media.dto.WallpaperProfileResponse;
import io.github.shizuki.site.media.dto.WallpaperSettingsUpdateRequest;
import io.github.shizuki.site.media.dto.WallpaperVisibilityUpdateRequest;
import io.github.shizuki.site.media.dto.WorkshopImportCreateRequest;
import io.github.shizuki.site.media.service.WallpaperService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import java.util.List;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/v1/home-wallpapers")
@Tag(name = "Home Wallpaper", description = "主页壁纸导入、设置与查询")
public class HomeWallpaperController {

    private final WallpaperService wallpaperService;

    public HomeWallpaperController(WallpaperService wallpaperService) {
        this.wallpaperService = wallpaperService;
    }

    @PostMapping(value = "/imports/package", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    @RateLimit(key = "home.wallpapers.import.package", limit = 10, windowSeconds = 60)
    @AuditLog(action = "home.wallpaper.import.package", resource = "home_wallpaper")
    @Operation(summary = "本地包导入壁纸", description = "上传资源包后自动校验可用性、分类并落库")
    public ApiResponse<WallpaperImportJobResponse> importPackage(@RequestPart("file") MultipartFile file,
                                                                 @RequestParam(value = "visibility", required = false) String visibility,
                                                                 @RequestParam(value = "title", required = false) String title) {
        return ApiResponse.success(wallpaperService.importPackage(file, visibility, title));
    }

    @PostMapping("/imports/workshop")
    @RateLimit(key = "home.wallpapers.import.workshop", limit = 8, windowSeconds = 60)
    @AuditLog(action = "home.wallpaper.import.workshop", resource = "home_wallpaper")
    @Operation(summary = "创建 Workshop 导入任务", description = "支持 SteamCMD 半直连下载，失败自动降级本地导入")
    public ApiResponse<WallpaperImportJobResponse> importWorkshop(@Valid @RequestBody WorkshopImportCreateRequest request) {
        return ApiResponse.success(wallpaperService.importWorkshop(request));
    }

    @GetMapping("/imports/{job_id}")
    @Operation(summary = "查询导入任务状态")
    public ApiResponse<WallpaperImportJobResponse> getImportJob(@PathVariable("job_id") Long jobId) {
        return ApiResponse.success(wallpaperService.getImportJob(jobId));
    }

    @GetMapping("/library")
    @Operation(summary = "查询壁纸资源库", description = "scope 可选 my/public/all")
    public ApiResponse<List<WallpaperProfileResponse>> listLibrary(@RequestParam(value = "scope", required = false) String scope) {
        return ApiResponse.success(wallpaperService.listLibrary(scope));
    }

    @PutMapping("/{wallpaper_id}/settings")
    @AuditLog(action = "home.wallpaper.settings.update", resource = "home_wallpaper")
    @Operation(summary = "更新壁纸设置", description = "更新内置BGM/BGV与自定义参数")
    public ApiResponse<WallpaperProfileResponse> updateSettings(@PathVariable("wallpaper_id") Long wallpaperId,
                                                                @Valid @RequestBody WallpaperSettingsUpdateRequest request) {
        return ApiResponse.success(wallpaperService.updateWallpaperSettings(wallpaperId, request));
    }

    @PutMapping("/{wallpaper_id}/visibility")
    @AuditLog(action = "home.wallpaper.visibility.update", resource = "home_wallpaper")
    @Operation(summary = "更新壁纸可见性", description = "用户提交公开时自动转审核态")
    public ApiResponse<WallpaperProfileResponse> updateVisibility(@PathVariable("wallpaper_id") Long wallpaperId,
                                                                  @Valid @RequestBody WallpaperVisibilityUpdateRequest request) {
        return ApiResponse.success(wallpaperService.updateWallpaperVisibility(wallpaperId, request));
    }

    @GetMapping("/public")
    @RateLimit(key = "home.wallpapers.public", limit = 60, windowSeconds = 60)
    @Operation(summary = "查询公开可用壁纸", description = "仅返回 PUBLIC + APPROVED + enabled 的资源")
    public ApiResponse<List<WallpaperProfileResponse>> listPublic() {
        return ApiResponse.success(wallpaperService.listPublicWallpapers());
    }
}
