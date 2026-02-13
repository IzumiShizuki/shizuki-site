package io.github.shizuki.site.media.dto;

/**
 * 管理员审核更新响应。
 *
 * @param assetId 资源 ID
 * @param auditStatus 审核状态
 * @param homeEnabled 是否加入首页角色池
 * @param homeSortNum 首页排序号
 * @param visibility 可见性
 * @param assetKind 资源类别
 */
public record AdminAssetAuditResponse(Long assetId,
                                      String auditStatus,
                                      boolean homeEnabled,
                                      Integer homeSortNum,
                                      String visibility,
                                      String assetKind) {
}
