package io.github.shizuki.site.media.response;

/**
 * 管理员审核壁纸结果。
 */
public record AdminWallpaperAuditResponse(Long wallpaperId,
                                          String auditStatus,
                                          String visibility,
                                          String sceneType,
                                          boolean enabled) {
}
