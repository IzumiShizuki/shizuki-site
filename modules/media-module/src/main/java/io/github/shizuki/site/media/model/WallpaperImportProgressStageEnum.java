package io.github.shizuki.site.media.model;

/**
 * 持久化的壁纸导入执行阶段。
 */
public enum WallpaperImportProgressStageEnum {
    QUEUED(5),
    RESOLVING(15),
    DOWNLOADING(55),
    INSPECTING(75),
    PERSISTING(90),
    COMPLETED(100),
    FALLBACK_REQUIRED(100),
    FAILED(100);

    private final int percent;

    WallpaperImportProgressStageEnum(int percent) {
        this.percent = percent;
    }

    public int getPercent() {
        return percent;
    }
}
