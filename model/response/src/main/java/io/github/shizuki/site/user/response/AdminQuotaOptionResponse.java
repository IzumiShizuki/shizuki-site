package io.github.shizuki.site.user.response;

/**
 * 管理后台配额目录项：带展示标签、描述与单位，供配额面板直接渲染。
 *
 * @param code        配额编码（如 {@code ai_round_total}）
 * @param label       展示名称
 * @param description 用途说明
 * @param unit        数值单位（{@code count} 次数 / {@code bytes} 字节）
 * @param builtIn     是否内置配额项
 */
public record AdminQuotaOptionResponse(String code,
                                       String label,
                                       String description,
                                       String unit,
                                       boolean builtIn) {
}
