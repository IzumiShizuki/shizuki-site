package io.github.shizuki.site.media.dto;

/**
 * 创建资源响应。
 *
 * @param assetId 资源 ID
 * @param bucket bucket 名称
 * @param key 对象 key
 * @param assetKind 资源类别
 * @param visibility 可见性
 * @param auditStatus 审核状态
 * @param status 创建状态
 * @param l2dValidation L2D 校验摘要（仅 L2D 包时返回）
 */
public record AssetCreateResponse(Long assetId,
                                  String bucket,
                                  String key,
                                  String assetKind,
                                  String visibility,
                                  String auditStatus,
                                  String status,
                                  L2dValidationResponse l2dValidation) {
}
