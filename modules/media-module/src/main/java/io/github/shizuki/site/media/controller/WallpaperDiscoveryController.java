package io.github.shizuki.site.media.controller;

import io.github.shizuki.common.audit.annotation.AuditLog;
import io.github.shizuki.common.core.response.ApiResponse;
import io.github.shizuki.common.ratelimit.annotation.RateLimit;
import io.github.shizuki.site.media.request.WallhavenImportCreateRequest;
import io.github.shizuki.site.media.response.WallhavenSearchResponse;
import io.github.shizuki.site.media.response.WallpaperImportJobResponse;
import io.github.shizuki.site.media.response.WorkshopItemDetailResponse;
import io.github.shizuki.site.media.response.WorkshopSearchResponse;
import io.github.shizuki.site.media.service.WallpaperDiscoveryService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/home-wallpapers/discovery")
@Tag(name = "Home Wallpaper Discovery", description = "「获取壁纸」内嵌浏览：创意工坊 / Wallhaven 搜索代理与拉取")
public class WallpaperDiscoveryController {

    private final WallpaperDiscoveryService wallpaperDiscoveryService;

    public WallpaperDiscoveryController(WallpaperDiscoveryService wallpaperDiscoveryService) {
        this.wallpaperDiscoveryService = wallpaperDiscoveryService;
    }

    @GetMapping("/workshop/search")
    @RateLimit(key = "home.wallpapers.discovery.workshop.search", limit = 30, windowSeconds = 60)
    @Operation(summary = "搜索创意工坊壁纸", description = "服务端代理搜索：配置 Steam Web API Key 时走官方接口，否则抓取浏览页")
    public ApiResponse<WorkshopSearchResponse> searchWorkshop(
            @RequestParam(value = "query", required = false) String query,
            @RequestParam(value = "page", required = false, defaultValue = "1") Integer page,
            @RequestParam(value = "sort", required = false) String sort) {
        return ApiResponse.success(wallpaperDiscoveryService.searchWorkshop(query, page == null ? 1 : page, sort));
    }

    @GetMapping("/workshop/items/{item_id}")
    @RateLimit(key = "home.wallpapers.discovery.workshop.item", limit = 60, windowSeconds = 60)
    @Operation(summary = "查询创意工坊条目详情", description = "返回标题、预览图，以及是否存在可直接下载的公开直链")
    public ApiResponse<WorkshopItemDetailResponse> getWorkshopItem(@PathVariable("item_id") String itemId) {
        return ApiResponse.success(wallpaperDiscoveryService.getWorkshopItem(itemId));
    }

    @GetMapping("/wallhaven/search")
    @RateLimit(key = "home.wallpapers.discovery.wallhaven.search", limit = 30, windowSeconds = 60)
    @Operation(summary = "搜索 Wallhaven 壁纸", description = "服务端代理 Wallhaven 公开 API，未配置 API Key 时强制 SFW")
    public ApiResponse<WallhavenSearchResponse> searchWallhaven(
            @RequestParam(value = "query", required = false) String query,
            @RequestParam(value = "page", required = false, defaultValue = "1") Integer page,
            @RequestParam(value = "categories", required = false) String categories,
            @RequestParam(value = "purity", required = false) String purity,
            @RequestParam(value = "sorting", required = false) String sorting,
            @RequestParam(value = "atleast", required = false) String atleast,
            @RequestParam(value = "ratios", required = false) String ratios) {
        return ApiResponse.success(wallpaperDiscoveryService.searchWallhaven(
                query, page == null ? 1 : page, categories, purity, sorting, atleast, ratios));
    }

    @PostMapping("/imports/wallhaven")
    @RateLimit(key = "home.wallpapers.discovery.wallhaven.import", limit = 10, windowSeconds = 60)
    @AuditLog(action = "home.wallpaper.import.wallhaven", resource = "home_wallpaper")
    @Operation(summary = "拉取 Wallhaven 壁纸", description = "服务端下载原图后复用本地包导入管线，同步返回导入结果")
    public ApiResponse<WallpaperImportJobResponse> importWallhaven(@Valid @RequestBody WallhavenImportCreateRequest request) {
        return ApiResponse.success(wallpaperDiscoveryService.importWallhaven(request));
    }
}
