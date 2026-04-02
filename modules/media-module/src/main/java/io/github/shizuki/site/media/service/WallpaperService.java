package io.github.shizuki.site.media.service;

import io.github.shizuki.site.media.request.AdminWallpaperAuditRequest;
import io.github.shizuki.site.media.response.AdminWallpaperAuditResponse;
import io.github.shizuki.site.media.response.WallpaperImportJobResponse;
import io.github.shizuki.site.media.response.WallpaperProfileResponse;
import io.github.shizuki.site.media.request.WallpaperSettingsUpdateRequest;
import io.github.shizuki.site.media.request.WallpaperVisibilityUpdateRequest;
import io.github.shizuki.site.media.request.WorkshopImportCreateRequest;
import java.util.List;
import org.springframework.web.multipart.MultipartFile;

public interface WallpaperService {

    WallpaperImportJobResponse importPackage(MultipartFile file, String visibility, String title);

    WallpaperImportJobResponse importWorkshop(WorkshopImportCreateRequest request);

    WallpaperImportJobResponse getImportJob(Long jobId);

    List<WallpaperProfileResponse> listLibrary(String scope);

    List<WallpaperProfileResponse> listPublicWallpapers();

    WallpaperProfileResponse updateWallpaperSettings(Long wallpaperId, WallpaperSettingsUpdateRequest request);

    WallpaperProfileResponse updateWallpaperVisibility(Long wallpaperId, WallpaperVisibilityUpdateRequest request);

    void deleteWallpaper(Long wallpaperId);

    List<WallpaperProfileResponse> listPendingWallpapers();

    AdminWallpaperAuditResponse auditWallpaper(Long wallpaperId, AdminWallpaperAuditRequest request);
}
