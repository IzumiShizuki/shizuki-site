package io.github.shizuki.site.media.model;

/**
 * 资产安全扫描状态。
 *
 * <p>一期先提供可扩展状态位，后续可对接异步杀毒/风控流程。
 */
public enum AssetSecurityScanStatusEnum {
    /**
     * 未启用扫描钩子，直接放行。
     */
    BYPASSED,
    /**
     * 已进入扫描队列，等待外部系统回调。
     */
    PENDING,
    /**
     * 扫描通过。
     */
    PASSED,
    /**
     * 扫描拒绝。
     */
    REJECTED
}
