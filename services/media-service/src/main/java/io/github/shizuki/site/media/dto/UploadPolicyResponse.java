package io.github.shizuki.site.media.dto;

/**
 * 直传策略响应。
 *
 * @param bucket 目标 bucket
 * @param key 对象 key
 * @param uploadUrl 预签名上传地址
 * @param expireSeconds 地址有效期（秒）
 * @param assetKind 资源类别字符串
 * @param assetKindCode 资源类别码（tinyint 映射值）
 * @param uploadStrategy 上传策略标识（当前固定 DIRECT_OSS）
 */
public record UploadPolicyResponse(String bucket,
                                   String key,
                                   String uploadUrl,
                                   long expireSeconds,
                                   String assetKind,
                                   int assetKindCode,
                                   String uploadStrategy) {
}
