package io.github.shizuki.site.media.dto;

/**
 * L2D 资源校验摘要。
 *
 * @param status 校验状态
 * @param entryModelJson 入口 model3.json 路径
 * @param textureCount 纹理数量
 */
public record L2dValidationResponse(String status, String entryModelJson, int textureCount) {
}
