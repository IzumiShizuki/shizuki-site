package io.github.shizuki.site.media.service.security;

/**
 * 图片上传完成安全校验后的可持久化草稿摘要。
 *
 * <p>该摘要只包含派生处理需要的非敏感事实。原始 EXIF 不属于该类型，也不能进入资产的通用
 * {@code metadata_json}。上传草稿在可信访客派生完成前始终不可发布。
 *
 * @param sha256 完整对象字节的 SHA-256（小写十六进制）
 * @param detectedContentType 根据魔数和容器识别的实际 MIME
 * @param encodedSizeBytes 完整编码对象大小
 * @param width 首帧宽度
 * @param height 首帧高度
 * @param frameCount 完整解码帧数
 * @param originalMetadataPresent 原图是否携带受保护元数据
 * @param publishable 是否可直接发布；上传草稿必须为 {@code false}
 */
public record ImageUploadDraftMetadata(
    String sha256,
    String detectedContentType,
    long encodedSizeBytes,
    int width,
    int height,
    int frameCount,
    boolean originalMetadataPresent,
    boolean publishable
) {

    public ImageUploadDraftMetadata {
        if (sha256 == null || !sha256.matches("[0-9a-f]{64}")) {
            throw new IllegalArgumentException("sha256 must be lowercase hexadecimal");
        }
        if (detectedContentType == null || detectedContentType.isBlank()) {
            throw new IllegalArgumentException("detectedContentType is required");
        }
        if (encodedSizeBytes <= 0L || width <= 0 || height <= 0 || frameCount <= 0) {
            throw new IllegalArgumentException("validated image dimensions, frames and bytes must be positive");
        }
        if (publishable) {
            throw new IllegalArgumentException("an upload draft cannot be publishable");
        }
    }
}
