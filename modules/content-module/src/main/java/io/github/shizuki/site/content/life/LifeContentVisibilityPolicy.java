package io.github.shizuki.site.content.life;

import io.github.shizuki.site.life.model.LifeContentLifecycleEnum;
import io.github.shizuki.site.life.model.LifeContentVisibilityEnum;
import java.util.Objects;
import org.springframework.stereotype.Component;

/**
 * 个人内容生命周期与访客可见性的统一资格矩阵。
 */
@Component
public class LifeContentVisibilityPolicy {

    /**
     * 计算列表、直达、管理预览、搜索、站点地图与媒体资格。
     *
     * @param lifecycle 生命周期
     * @param visibility 可见性
     * @param authorizedAdmin 是否为已授权管理员
     * @return 访问资格
     */
    public LifeContentAccess evaluate(
        LifeContentLifecycleEnum lifecycle,
        LifeContentVisibilityEnum visibility,
        boolean authorizedAdmin
    ) {
        Objects.requireNonNull(lifecycle, "lifecycle");
        Objects.requireNonNull(visibility, "visibility");

        boolean published = lifecycle == LifeContentLifecycleEnum.PUBLISHED;
        boolean publicAudience = visibility == LifeContentVisibilityEnum.PUBLIC;
        boolean unlistedAudience = visibility == LifeContentVisibilityEnum.UNLISTED;
        boolean publicListEligible = published && publicAudience;
        boolean visitorDetailEligible = published && (publicAudience || unlistedAudience);

        return new LifeContentAccess(
            publicListEligible,
            visitorDetailEligible,
            authorizedAdmin,
            publicListEligible,
            publicListEligible,
            visitorDetailEligible,
            authorizedAdmin,
            !publicListEligible,
            !publicListEligible
        );
    }
}
