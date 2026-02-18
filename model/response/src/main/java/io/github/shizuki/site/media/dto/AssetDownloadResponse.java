package io.github.shizuki.site.media.dto;

/**
 * 资源下载响应。
 *
 * @param assetId 资源 ID
 * @param assetKind 资源类别
 * @param isPublic 是否公开资源
 * @param publicUrl 公开链接（公开资源场景）
 * @param downloadUrl 签名下载链接（私有资源场景）
 * @param expireSeconds 签名链接有效期秒数（私有资源场景）
 */
public record AssetDownloadResponse(Long assetId,
                                    String assetKind,
                                    boolean isPublic,
                                    String publicUrl,
                                    String downloadUrl,
                                    Long expireSeconds) {
}
