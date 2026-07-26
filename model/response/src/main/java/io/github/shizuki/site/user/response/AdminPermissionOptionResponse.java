package io.github.shizuki.site.user.response;

/**
 * 管理后台权限目录项：带展示标签与描述，供权限选择器直接渲染。
 *
 * @param code        权限编码（如 {@code music.asmr.access}）
 * @param label       展示名称
 * @param description 用途说明
 * @param category    所属模块分类（如 {@code 音乐}、{@code 后台管理}）
 * @param builtIn     是否内置权限（false 表示自定义/仅存在于数据库的权限码）
 */
public record AdminPermissionOptionResponse(String code,
                                            String label,
                                            String description,
                                            String category,
                                            boolean builtIn) {
}
