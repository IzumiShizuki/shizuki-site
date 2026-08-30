package io.github.shizuki.site.content.life;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.shizuki.site.life.model.LifeContentLifecycleEnum;
import io.github.shizuki.site.life.model.LifeContentVisibilityEnum;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class LifeContentVisibilityPolicyTest {

    private final LifeContentVisibilityPolicy policy = new LifeContentVisibilityPolicy();

    @ParameterizedTest(name = "{0}/{1}")
    @MethodSource("visitorMatrix")
    void appliesVisitorDiscoveryDetailSearchSitemapAndMediaMatrix(
        LifeContentLifecycleEnum lifecycle,
        LifeContentVisibilityEnum visibility,
        boolean listed,
        boolean direct,
        boolean media,
        boolean noIndex,
        boolean privateNoStore
    ) {
        LifeContentAccess access = policy.evaluate(lifecycle, visibility, false);

        assertThat(access.publicListEligible()).isEqualTo(listed);
        assertThat(access.visitorDetailEligible()).isEqualTo(direct);
        assertThat(access.searchEligible()).isEqualTo(listed);
        assertThat(access.sitemapEligible()).isEqualTo(listed);
        assertThat(access.visitorMediaEligible()).isEqualTo(media);
        assertThat(access.adminPreviewEligible()).isFalse();
        assertThat(access.adminMediaEligible()).isFalse();
        assertThat(access.noIndex()).isEqualTo(noIndex);
        assertThat(access.privateNoStore()).isEqualTo(privateNoStore);
    }

    @ParameterizedTest
    @MethodSource("allStates")
    void authorizedAdministratorCanPreviewAndResolveMediaForEveryQueryableBusinessState(
        LifeContentLifecycleEnum lifecycle,
        LifeContentVisibilityEnum visibility
    ) {
        LifeContentAccess access = policy.evaluate(lifecycle, visibility, true);

        assertThat(access.adminPreviewEligible()).isTrue();
        assertThat(access.adminMediaEligible()).isTrue();
    }

    private static Stream<Arguments> visitorMatrix() {
        return allStates().map(arguments -> {
            Object[] values = arguments.get();
            LifeContentLifecycleEnum lifecycle = (LifeContentLifecycleEnum) values[0];
            LifeContentVisibilityEnum visibility = (LifeContentVisibilityEnum) values[1];
            boolean published = lifecycle == LifeContentLifecycleEnum.PUBLISHED;
            boolean publicVisibility = visibility == LifeContentVisibilityEnum.PUBLIC;
            boolean unlistedVisibility = visibility == LifeContentVisibilityEnum.UNLISTED;
            boolean listed = published && publicVisibility;
            boolean direct = published && (publicVisibility || unlistedVisibility);
            return Arguments.of(lifecycle, visibility, listed, direct, direct, !listed, !listed);
        });
    }

    private static Stream<Arguments> allStates() {
        return Stream.of(LifeContentLifecycleEnum.values())
            .flatMap(lifecycle -> Stream.of(LifeContentVisibilityEnum.values())
                .map(visibility -> Arguments.of(lifecycle, visibility)));
    }
}
