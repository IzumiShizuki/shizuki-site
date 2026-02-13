package io.github.shizuki.site.media.service.security;

/**
 * 资产安全检查结果。
 *
 * @param objectHash 对象内容指纹（优先使用 ETag）
 * @param scanStatus 安全扫描状态
 * @param scanMessage 安全扫描说明
 * @param objectSizeBytes 对象大小（字节）
 * @param storageContentType 对象存储侧记录的 content-type
 */
public record AssetInspectionResult(String objectHash,
                                    String scanStatus,
                                    String scanMessage,
                                    Long objectSizeBytes,
                                    String storageContentType) {
}
