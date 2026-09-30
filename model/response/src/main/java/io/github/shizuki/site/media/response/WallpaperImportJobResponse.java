package io.github.shizuki.site.media.response;

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
 * @param progressStage 当前导入阶段
 * @param progressPercent 当前导入进度，范围为0-100
 * @param downloadedBytes 已读取或获取的下载字节数
 * @param totalBytes 已知时的下载总字节数
 */
public record WallpaperImportJobResponse(Long jobId,
                                         String sourceType,
                                         String status,
                                         String visibility,
                                         Long wallpaperId,
                                         String errorMessage,
                                         String fallbackHint,
                                         String progressStage,
                                         Integer progressPercent,
                                         Long downloadedBytes,
                                         Long totalBytes) {

    public WallpaperImportJobResponse(Long jobId,
                                      String sourceType,
                                      String status,
                                      String visibility,
                                      Long wallpaperId,
                                      String errorMessage,
                                      String fallbackHint,
                                      String progressStage,
                                      Integer progressPercent) {
        this(jobId, sourceType, status, visibility, wallpaperId, errorMessage, fallbackHint,
            progressStage, progressPercent, 0L, null);
    }
}
