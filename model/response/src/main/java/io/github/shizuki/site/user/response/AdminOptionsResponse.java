package io.github.shizuki.site.user.response;

import java.util.List;

/**
 * 管理后台配置选项聚合。
 *
 * <p>{@code permissionCatalog} / {@code quotaCatalog} 为纯编码列表（历史字段，保留兼容）；
 * {@code permissionOptions} / {@code quotaOptions} 为带标签、描述的完整目录，前端优先使用。
 */
public record AdminOptionsResponse(List<AdminGroupOptionResponse> groups,
                                   List<String> permissionCatalog,
                                   List<String> quotaCatalog,
                                   List<AdminPermissionOptionResponse> permissionOptions,
                                   List<AdminQuotaOptionResponse> quotaOptions) {

    /**
     * 兼容旧构造：仅有编码目录时，选项列表为空。
     */
    public AdminOptionsResponse(List<AdminGroupOptionResponse> groups,
                                List<String> permissionCatalog,
                                List<String> quotaCatalog) {
        this(groups, permissionCatalog, quotaCatalog, List.of(), List.of());
    }
}
