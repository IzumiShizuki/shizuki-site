package io.github.shizuki.site.media.service.download;

/**
 * 原图网关内部授权结果；sourceAssetId 不得进入响应或日志。
 */
public record AuthorizedOriginalDownload(
    String mediaRef,
    long sourceAssetId,
    int contentVersion,
    int associationVersion
) {
}
