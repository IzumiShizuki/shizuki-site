package io.github.shizuki.site.media.dto;

/**
 * 服务端中转上传响应。
 *
 * @param bucket 目标 bucket
 * @param key 对象 key
 * @param contentType 实际写入 content-type
 * @param assetKind 资源类别字符串
 * @param uploadStrategy 上传策略标识（当前固定 RELAY_OSS）
 */
public record UploadRelayResponse(String bucket,
                                  String key,
                                  String contentType,
                                  String assetKind,
                                  String uploadStrategy) {
}
