package io.github.shizuki.site.media.response;

import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.site.media.model.ImageDerivativeStatusEnum;
import io.github.shizuki.site.media.model.ImageVariantTypeEnum;
import java.util.Locale;

/**
 * 单个安全媒体派生的公开处理状态；不携带 asset、bucket 或 object key。
 */
public record MediaVariantProcessingResponse(
    ImageVariantTypeEnum variant,
    ImageDerivativeStatusEnum status,
    Integer width,
    Integer height,
    String format,
    ErrorCode errorCode
) {

    public MediaVariantProcessingResponse {
        if (variant == null || status == null) {
            throw new IllegalArgumentException("variant and status are required");
        }
        if (width != null && width <= 0) {
            throw new IllegalArgumentException("width must be positive");
        }
        if (height != null && height <= 0) {
            throw new IllegalArgumentException("height must be positive");
        }
        format = format == null ? null : format.trim().toLowerCase(Locale.ROOT);
        if (status == ImageDerivativeStatusEnum.FAILED && errorCode == null) {
            errorCode = ErrorCode.MEDIA_NOT_READY;
        }
        if (status != ImageDerivativeStatusEnum.FAILED) {
            errorCode = null;
        }
    }
}
