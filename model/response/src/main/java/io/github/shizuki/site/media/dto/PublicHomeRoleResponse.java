package io.github.shizuki.site.media.dto;

/**
 * 首页公开角色响应项。
 *
 * @param assetId 资源 ID
 * @param assetKind 资源类别
 * @param coverUrl 封面链接
 * @param downloadUrl 下载链接
 * @param l2dEntryModelJson L2D 入口 model3.json 路径（仅 L2D）
 * @param sortNum 排序号
 */
public record PublicHomeRoleResponse(Long assetId,
                                     String assetKind,
                                     String coverUrl,
                                     String downloadUrl,
                                     String l2dEntryModelJson,
                                     Integer sortNum) {
}
