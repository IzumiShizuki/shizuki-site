package io.github.shizuki.site.media.service.security;

/**
 * 访客派生对象经独立完整解码与元数据复检后的安全事实。
 */
public record DerivativeOutputInspection(String sha256, int width, int height, int frameCount) {

    public DerivativeOutputInspection {
        if (sha256 == null || !sha256.matches("[0-9a-f]{64}")) {
            throw new IllegalArgumentException("sha256 must be lowercase hexadecimal");
        }
        if (width <= 0 || height <= 0 || frameCount <= 0) {
            throw new IllegalArgumentException("inspected derivative dimensions and frames must be positive");
        }
    }
}
