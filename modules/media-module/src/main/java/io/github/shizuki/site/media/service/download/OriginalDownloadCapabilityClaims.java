package io.github.shizuki.site.media.service.download;

/**
 * 原图下载 capability 的关联级事实，不含 asset、bucket 或 object key。
 */
public record OriginalDownloadCapabilityClaims(
    String mediaRef,
    String associationType,
    long associationId,
    int contentVersion,
    int associationVersion,
    long expiresAtEpochSecond
) {
}
