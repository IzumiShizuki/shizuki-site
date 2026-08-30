package io.github.shizuki.site.content.life;

import io.github.shizuki.site.life.model.LifeContentLifecycleEnum;
import io.github.shizuki.site.life.model.LifeContentVisibilityEnum;
import java.time.Instant;
import java.util.Objects;

/**
 * 相册与动态共用的生命周期快照。
 *
 * <p>{@code RECYCLED} 是可查询的业务状态；永久清理 tombstone 不由该快照表达。
 */
public record LifeContentState(
    LifeContentLifecycleEnum lifecycle,
    LifeContentVisibilityEnum visibility,
    LifeContentLifecycleEnum restoreLifecycle,
    Instant recycledAt,
    Instant purgeAfter
) {

    /**
     * 校验生命周期元数据的一致性。
     */
    public LifeContentState {
        Objects.requireNonNull(lifecycle, "lifecycle");
        Objects.requireNonNull(visibility, "visibility");
        if (lifecycle == LifeContentLifecycleEnum.RECYCLED) {
            if (restoreLifecycle != LifeContentLifecycleEnum.DRAFT
                && restoreLifecycle != LifeContentLifecycleEnum.ARCHIVED) {
                throw new IllegalArgumentException("recycled content requires a safe DRAFT/ARCHIVED restore target");
            }
            Objects.requireNonNull(recycledAt, "recycledAt");
            Objects.requireNonNull(purgeAfter, "purgeAfter");
            if (purgeAfter.isBefore(recycledAt)) {
                throw new IllegalArgumentException("purgeAfter must not precede recycledAt");
            }
        } else if (restoreLifecycle != null || recycledAt != null || purgeAfter != null) {
            throw new IllegalArgumentException("only recycled content may carry recycle metadata");
        }
    }

    /**
     * 创建没有回收元数据的内容状态。
     *
     * @param lifecycle 生命周期
     * @param visibility 可见性
     * @return 内容状态
     */
    public static LifeContentState active(
        LifeContentLifecycleEnum lifecycle,
        LifeContentVisibilityEnum visibility
    ) {
        if (lifecycle == LifeContentLifecycleEnum.RECYCLED) {
            throw new IllegalArgumentException("use recycled state with explicit restore metadata");
        }
        return new LifeContentState(lifecycle, visibility, null, null, null);
    }
}
