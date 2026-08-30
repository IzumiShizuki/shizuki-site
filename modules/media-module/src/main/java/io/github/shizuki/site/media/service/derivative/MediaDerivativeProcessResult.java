package io.github.shizuki.site.media.service.derivative;

/**
 * 一个派生对象完成处理后的持久化结果。
 *
 * @param variantAssetId 已登记到 MDA_ASSET 的派生资产 ID
 * @param width          解码复检后的宽度
 * @param height         解码复检后的高度
 */
public record MediaDerivativeProcessResult(Long variantAssetId, Integer width, Integer height) {

    public MediaDerivativeProcessResult {
        if (variantAssetId == null || variantAssetId <= 0) {
            throw new IllegalArgumentException("variantAssetId must be positive");
        }
        if (width != null && width <= 0) {
            throw new IllegalArgumentException("width must be positive when present");
        }
        if (height != null && height <= 0) {
            throw new IllegalArgumentException("height must be positive when present");
        }
    }
}
