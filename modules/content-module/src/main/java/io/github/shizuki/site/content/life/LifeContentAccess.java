package io.github.shizuki.site.content.life;

/**
 * 生命周期与可见性矩阵计算出的访问资格。
 */
public record LifeContentAccess(
    boolean publicListEligible,
    boolean visitorDetailEligible,
    boolean adminPreviewEligible,
    boolean searchEligible,
    boolean sitemapEligible,
    boolean visitorMediaEligible,
    boolean adminMediaEligible,
    boolean noIndex,
    boolean privateNoStore
) {
}
