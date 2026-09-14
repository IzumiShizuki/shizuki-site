package io.github.shizuki.site.content.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

/**
 * 管理员保存登录页外观配置的请求。
 *
 * @param expectedVersion 当前版本号，用于乐观并发控制
 * @param themePreset     主题预设标识（milkshake/blueberry/peach/matcha/mint/galaxy）
 * @param bgImageUrl      全站登录页背景图片 URL（可空）
 * @param mascotImageUrl  全站登录页看板娘图片 URL（可空）
 */
public record LoginAppearanceSaveRequest(
    int expectedVersion,

    @NotBlank(message = "themePreset is required")
    @Size(max = 32, message = "themePreset too long")
    String themePreset,

    @Size(max = 4096, message = "bgImageUrl too long")
    String bgImageUrl,

    @Size(max = 4096, message = "mascotImageUrl too long")
    String mascotImageUrl
) {
}
