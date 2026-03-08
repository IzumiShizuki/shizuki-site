package io.github.shizuki.site.media.service;

import io.github.shizuki.site.media.dto.AdminWallpaperAuditRequest;
import io.github.shizuki.site.media.dto.AdminWallpaperAuditResponse;
import io.github.shizuki.site.media.dto.WallpaperImportJobResponse;
import io.github.shizuki.site.media.dto.WallpaperProfileResponse;
import io.github.shizuki.site.media.dto.WallpaperSettingsUpdateRequest;
import io.github.shizuki.site.media.dto.WallpaperVisibilityUpdateRequest;
import io.github.shizuki.site.media.dto.WorkshopImportCreateRequest;
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

    List<WallpaperProfileResponse> listPendingWallpapers();

    AdminWallpaperAuditResponse auditWallpaper(Long wallpaperId, AdminWallpaperAuditRequest request);
}
