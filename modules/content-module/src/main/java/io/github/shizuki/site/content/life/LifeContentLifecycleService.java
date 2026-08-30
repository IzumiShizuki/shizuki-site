package io.github.shizuki.site.content.life;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.site.life.model.LifeContentLifecycleEnum;
import java.time.Duration;
import java.time.Instant;
import java.util.Map;
import java.util.Objects;
import org.springframework.stereotype.Service;

/**
 * 相册与动态共用的显式生命周期规则。
 */
@Service
public class LifeContentLifecycleService {

    /**
     * 发布草稿或显式重新发布已归档内容。
     *
     * @param state 当前状态
     * @return 已发布状态
     */
    public LifeContentState publish(LifeContentState state) {
        requireFrom(state, LifeContentLifecycleEnum.DRAFT, LifeContentLifecycleEnum.ARCHIVED);
        return activeWithLifecycle(state, LifeContentLifecycleEnum.PUBLISHED);
    }

    /**
     * 归档已发布内容。
     *
     * @param state 当前状态
     * @return 已归档状态
     */
    public LifeContentState archive(LifeContentState state) {
        requireFrom(state, LifeContentLifecycleEnum.PUBLISHED);
        return activeWithLifecycle(state, LifeContentLifecycleEnum.ARCHIVED);
    }

    /**
     * 将内容移入回收站并记录保留期和安全恢复目标。
     *
     * @param state 当前状态
     * @param recycledAt 回收时间
     * @param retention 保留期
     * @return 回收状态
     */
    public LifeContentState recycle(LifeContentState state, Instant recycledAt, Duration retention) {
        Objects.requireNonNull(state, "state");
        Objects.requireNonNull(recycledAt, "recycledAt");
        if (retention == null || retention.isNegative() || retention.isZero()) {
            throw new IllegalArgumentException("retention must be positive");
        }
        if (state.lifecycle() == LifeContentLifecycleEnum.RECYCLED) {
            throw invalidTransition(state.lifecycle(), LifeContentLifecycleEnum.RECYCLED);
        }
        LifeContentLifecycleEnum restoreTarget = state.lifecycle() == LifeContentLifecycleEnum.DRAFT
            ? LifeContentLifecycleEnum.DRAFT
            : LifeContentLifecycleEnum.ARCHIVED;
        return new LifeContentState(
            LifeContentLifecycleEnum.RECYCLED,
            state.visibility(),
            restoreTarget,
            recycledAt,
            recycledAt.plus(retention)
        );
    }

    /**
     * 从回收站恢复到预先记录的安全状态，永不自动发布。
     *
     * @param state 当前状态
     * @return 安全恢复状态
     */
    public LifeContentState restore(LifeContentState state) {
        requireFrom(state, LifeContentLifecycleEnum.RECYCLED);
        if (state.restoreLifecycle() == LifeContentLifecycleEnum.PUBLISHED) {
            throw invalidTransition(state.lifecycle(), LifeContentLifecycleEnum.PUBLISHED);
        }
        return activeWithLifecycle(state, state.restoreLifecycle());
    }

    private LifeContentState activeWithLifecycle(
        LifeContentState state,
        LifeContentLifecycleEnum target
    ) {
        return LifeContentState.active(target, state.visibility());
    }

    private void requireFrom(LifeContentState state, LifeContentLifecycleEnum... allowed) {
        Objects.requireNonNull(state, "state");
        for (LifeContentLifecycleEnum candidate : allowed) {
            if (state.lifecycle() == candidate) {
                return;
            }
        }
        LifeContentLifecycleEnum target = allowed.length == 1
            ? allowed[0]
            : LifeContentLifecycleEnum.PUBLISHED;
        throw invalidTransition(state.lifecycle(), target);
    }

    private BusinessException invalidTransition(
        LifeContentLifecycleEnum from,
        LifeContentLifecycleEnum to
    ) {
        return new BusinessException(
            ErrorCode.CONFLICT,
            "Illegal life-content lifecycle transition",
            Map.of("from", from.name(), "to", to.name())
        );
    }
}
