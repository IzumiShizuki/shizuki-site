package io.github.shizuki.site.media.service.security;

import java.util.Arrays;

/**
 * 仅供服务端图片处理阶段使用的受保护上下文。
 *
 * <p>原始 EXIF 字节没有公共读取方法，避免控制器、响应 DTO 或通用资产 metadata 无意暴露。
 * 同包的可信派生处理器可以取得防御性副本完成方向校正或管理员审核，之后应立即丢弃。
 */
public final class ProtectedPhotoProcessingContext {

    private final ImageUploadDraftMetadata draftMetadata;
    private final byte[] originalExifPayload;

    ProtectedPhotoProcessingContext(ImageUploadDraftMetadata draftMetadata, byte[] originalExifPayload) {
        this.draftMetadata = draftMetadata;
        this.originalExifPayload = originalExifPayload == null
            ? new byte[0]
            : Arrays.copyOf(originalExifPayload, originalExifPayload.length);
    }

    /**
     * 返回允许持久化的非敏感草稿摘要。
     */
    public ImageUploadDraftMetadata draftMetadata() {
        return draftMetadata;
    }

    /**
     * 表示受保护上下文中是否存在原始 EXIF。
     */
    public boolean hasProtectedExif() {
        return originalExifPayload.length > 0;
    }

    /**
     * 只对同包可信派生处理器开放原始 EXIF 的防御性副本。
     */
    byte[] originalExifPayloadForProcessing() {
        return Arrays.copyOf(originalExifPayload, originalExifPayload.length);
    }
}
