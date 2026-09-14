package io.github.shizuki.site.content.response;

/**
 * 登录页外观配置快照（管理员与公开接口共用）。
 *
 * @param themePreset    主题预设标识
 * @param bgImageUrl     背景图片 URL（未配置为空字符串）
 * @param mascotImageUrl 看板娘图片 URL（未配置为空字符串）
 * @param version        当前版本号
 */
public record LoginAppearanceResponse(
    String themePreset,
    String bgImageUrl,
    String mascotImageUrl,
    int version
) {
}
