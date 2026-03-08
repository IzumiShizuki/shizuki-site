package io.github.shizuki.site.media.dto;

/**
 * 壁纸导入任务响应。
 *
 * @param jobId 任务ID
 * @param sourceType 来源类型 PACKAGE/WORKSHOP
 * @param status 导入状态
 * @param visibility 可见性
 * @param wallpaperId 成功后壁纸ID
 * @param errorMessage 错误信息
 * @param fallbackHint 降级提示
 */
public record WallpaperImportJobResponse(Long jobId,
                                         String sourceType,
                                         String status,
                                         String visibility,
                                         Long wallpaperId,
                                         String errorMessage,
                                         String fallbackHint) {
}
