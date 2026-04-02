package io.github.shizuki.site.media.response;

import java.math.BigDecimal;
import java.util.Map;

/**
 * 壁纸资源视图。
 */
public record WallpaperProfileResponse(Long wallpaperId,
                                       String title,
                                       String sceneType,
                                       String visibility,
                                       String auditStatus,
                                       Long ownerUserId,
                                       Long visualAssetId,
                                       String visualUrl,
                                       String previewUrl,
                                       Long embeddedBgmAssetId,
                                       String embeddedBgmUrl,
                                       Long embeddedBgvAssetId,
                                       String embeddedBgvUrl,
                                       String l2dEntryModelJson,
                                       BigDecimal defaultMasterVolume,
                                       BigDecimal defaultBgmVolume,
                                       BigDecimal defaultBgvVolume,
                                       Map<String, Object> customSchema,
                                       Map<String, Object> customDefaults,
                                       String importSource,
                                       String workshopItemId,
                                       boolean mine) {
}
