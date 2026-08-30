package io.github.shizuki.site.content.life;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.site.life.model.LifeContentLifecycleEnum;
import io.github.shizuki.site.life.model.LifeContentVisibilityEnum;
import java.time.Duration;
import java.time.Instant;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class LifeContentLifecycleServiceTest {

    private static final Instant RECYCLED_AT = Instant.parse("2026-08-27T09:00:00Z");
    private static final Duration RETENTION = Duration.ofDays(30);

    private final LifeContentLifecycleService service = new LifeContentLifecycleService();

    @ParameterizedTest
    @MethodSource("safeRestoreCases")
    void recycleRecordsSafeRestoreTargetAndRestoreNeverPublishes(
        LifeContentLifecycleEnum original,
        LifeContentLifecycleEnum expectedRestore
    ) {
        LifeContentState recycled = service.recycle(active(original), RECYCLED_AT, RETENTION);

        assertThat(recycled.lifecycle()).isEqualTo(LifeContentLifecycleEnum.RECYCLED);
        assertThat(recycled.restoreLifecycle()).isEqualTo(expectedRestore);
        assertThat(recycled.recycledAt()).isEqualTo(RECYCLED_AT);
        assertThat(recycled.purgeAfter()).isEqualTo(RECYCLED_AT.plus(RETENTION));
        assertThat(recycled.visibility()).isEqualTo(LifeContentVisibilityEnum.UNLISTED);

        LifeContentState restored = service.restore(recycled);
        assertThat(restored.lifecycle()).isEqualTo(expectedRestore);
        assertThat(restored.lifecycle()).isNotEqualTo(LifeContentLifecycleEnum.PUBLISHED);
        assertThat(restored.restoreLifecycle()).isNull();
        assertThat(restored.purgeAfter()).isNull();
    }

    @Test
    void supportsOnlyExplicitPublishArchiveAndRepublishTransitions() {
        LifeContentState published = service.publish(active(LifeContentLifecycleEnum.DRAFT));
        LifeContentState archived = service.archive(published);
        LifeContentState republished = service.publish(archived);

        assertThat(published.lifecycle()).isEqualTo(LifeContentLifecycleEnum.PUBLISHED);
        assertThat(archived.lifecycle()).isEqualTo(LifeContentLifecycleEnum.ARCHIVED);
        assertThat(republished.lifecycle()).isEqualTo(LifeContentLifecycleEnum.PUBLISHED);
        assertThat(republished.visibility()).isEqualTo(LifeContentVisibilityEnum.UNLISTED);
    }

    @Test
    void rejectsIllegalLifecycleTransitions() {
        assertConflict(() -> service.archive(active(LifeContentLifecycleEnum.DRAFT)));
        assertConflict(() -> service.publish(active(LifeContentLifecycleEnum.PUBLISHED)));
        assertConflict(() -> service.archive(active(LifeContentLifecycleEnum.ARCHIVED)));
        assertConflict(() -> service.restore(active(LifeContentLifecycleEnum.DRAFT)));

        LifeContentState recycled = service.recycle(
            active(LifeContentLifecycleEnum.DRAFT),
            RECYCLED_AT,
            RETENTION
        );
        assertConflict(() -> service.publish(recycled));
        assertConflict(() -> service.archive(recycled));
        assertConflict(() -> service.recycle(recycled, RECYCLED_AT, RETENTION));
    }

    private static Stream<Arguments> safeRestoreCases() {
        return Stream.of(
            Arguments.of(LifeContentLifecycleEnum.DRAFT, LifeContentLifecycleEnum.DRAFT),
            Arguments.of(LifeContentLifecycleEnum.PUBLISHED, LifeContentLifecycleEnum.ARCHIVED),
            Arguments.of(LifeContentLifecycleEnum.ARCHIVED, LifeContentLifecycleEnum.ARCHIVED)
        );
    }

    private LifeContentState active(LifeContentLifecycleEnum lifecycle) {
        return LifeContentState.active(lifecycle, LifeContentVisibilityEnum.UNLISTED);
    }

    private void assertConflict(Runnable operation) {
        assertThatThrownBy(operation::run)
            .isInstanceOfSatisfying(BusinessException.class, error ->
                assertThat(error.getErrorCode()).isEqualTo(ErrorCode.CONFLICT));
    }
}
