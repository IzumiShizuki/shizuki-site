package io.github.shizuki.site.media.service.security;

import io.github.shizuki.site.media.model.AssetKindEnum;
import java.io.InputStream;

/**
 * 私有图片原件的上传草稿安全校验边界。
 */
public interface PhotoUploadDraftValidator {

    /**
     * 完整读取并验证一个已上传对象。调用方负责关闭输入流。
     *
     * @param inputStream 私有对象内容
     * @param storageSizeBytes 存储元数据声明的对象大小，未知时可为 {@code 0}
     * @param declaredContentType 请求声明 MIME
     * @param assetKind 静态或动态图片类型
     * @return 受保护处理上下文
     */
    ProtectedPhotoProcessingContext validate(
        InputStream inputStream,
        long storageSizeBytes,
        String declaredContentType,
        AssetKindEnum assetKind
    );
}
