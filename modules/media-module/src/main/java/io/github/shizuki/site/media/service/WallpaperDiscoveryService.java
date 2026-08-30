package io.github.shizuki.site.media.service;

import io.github.shizuki.site.media.request.WallhavenImportCreateRequest;
import io.github.shizuki.site.media.response.WallhavenSearchResponse;
import io.github.shizuki.site.media.response.WallpaperImportJobResponse;
import io.github.shizuki.site.media.response.WorkshopItemDetailResponse;
import io.github.shizuki.site.media.response.WorkshopSearchResponse;

/**
 * 壁纸在线发现服务：为「获取壁纸」弹窗提供内嵌浏览数据源。
 * 前端不再跳转新窗口，由服务端代理搜索并返回结构化列表。
 */
public interface WallpaperDiscoveryService {

    record WallpaperPreview(byte[] bytes, String contentType) {
    }

    WorkshopSearchResponse searchWorkshop(String query, int page, String sort, String tags);

    WorkshopItemDetailResponse getWorkshopItem(String itemId);

    WallpaperPreview fetchPreview(String source, String itemId);

    WallhavenSearchResponse searchWallhaven(String query, int page, String categories, String purity,
                                            String sorting, String atleast, String ratios, String order);

    WallpaperImportJobResponse importWallhaven(WallhavenImportCreateRequest request);
}
