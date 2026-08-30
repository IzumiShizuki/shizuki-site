package io.github.shizuki.site.media.response;

import io.github.shizuki.site.media.model.ImageDerivativeStatusEnum;
import java.util.List;

/**
 * 照片处理的聚合状态响应。
 *
 * @param status 聚合状态
 * @param readyForPublication 必需派生及安全检查是否均允许发布
 * @param variants 有限派生集合的状态
 */
public record MediaProcessingStatusResponse(
    ImageDerivativeStatusEnum status,
    boolean readyForPublication,
    List<MediaVariantProcessingResponse> variants
) {

    public MediaProcessingStatusResponse {
        if (status == null) {
            throw new IllegalArgumentException("status is required");
        }
        variants = variants == null ? List.of() : List.copyOf(variants);
        if (readyForPublication && status != ImageDerivativeStatusEnum.READY) {
            throw new IllegalArgumentException("publishable media must be ready");
        }
    }
}
