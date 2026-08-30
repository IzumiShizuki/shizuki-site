package io.github.shizuki.common.core.concurrency;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

class ManagementCommandVersionGuardTest {

    @ParameterizedTest
    @MethodSource("validStrongEtags")
    void acceptsCanonicalStrongVersionEtag(String ifMatch, long expectedVersion) {
        assertThat(ManagementCommandVersionGuard.parseRequiredIfMatch(ifMatch))
            .isEqualTo(expectedVersion);
        assertThat(ManagementCommandVersionGuard.requireMatch(ifMatch, expectedVersion))
            .isEqualTo(expectedVersion);
    }

    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = {" ", "\t"})
    void rejectsMissingIfMatch(String ifMatch) {
        assertBadRequest(ifMatch, "required");
    }

    @ParameterizedTest
    @ValueSource(strings = {
        "W/\"v17\"",
        "w/\"v17\"",
        "*",
        "\"v17\", \"v18\"",
        "v17",
        "\"17\"",
        "\"v-1\"",
        "\"v01\"",
        "\"v+1\"",
        "\"v9223372036854775808\"",
        "\"v17",
        "\"v17\" trailing"
    })
    void rejectsWeakWildcardListAndMalformedIfMatch(String ifMatch) {
        assertBadRequest(ifMatch, "If-Match");
    }

    @Test
    void staleConcurrentWriterReceivesCurrentVersionAndEtag() {
        AtomicLong persistedVersion = new AtomicLong(41L);
        long firstExpectedVersion = ManagementCommandVersionGuard.parseRequiredIfMatch("\"v41\"");
        long secondExpectedVersion = ManagementCommandVersionGuard.parseRequiredIfMatch("\"v41\"");

        boolean firstUpdated = persistedVersion.compareAndSet(firstExpectedVersion, firstExpectedVersion + 1L);
        ManagementCommandVersionGuard.requireSingleRowUpdated(firstUpdated ? 1 : 0, persistedVersion::get);

        boolean secondUpdated = persistedVersion.compareAndSet(secondExpectedVersion, secondExpectedVersion + 1L);
        assertThat(secondUpdated).isFalse();
        assertThatThrownBy(() -> ManagementCommandVersionGuard.requireSingleRowUpdated(
            secondUpdated ? 1 : 0,
            persistedVersion::get
        ))
            .isInstanceOfSatisfying(BusinessException.class, exception -> {
                assertThat(exception.getErrorCode()).isEqualTo(ErrorCode.CONFLICT);
                assertThat(exception.getDetails())
                    .containsEntry("currentVersion", 42L)
                    .containsEntry("currentEtag", "\"v42\"");
            });
        assertThat(persistedVersion).hasValue(42L);
    }

    @Test
    void preflightRejectsAnOldVersionWithTheSameStructuredConflict() {
        assertThatThrownBy(() -> ManagementCommandVersionGuard.requireMatch("\"v7\"", 8L))
            .isInstanceOfSatisfying(BusinessException.class, exception -> {
                assertThat(exception.getErrorCode()).isEqualTo(ErrorCode.CONFLICT);
                assertThat(exception.getDetails())
                    .containsEntry("currentVersion", 8L)
                    .containsEntry("currentEtag", "\"v8\"");
            });
    }

    @Test
    void rejectsImpossibleUpdateCountsAndInvalidPersistedVersions() {
        assertThatThrownBy(() -> ManagementCommandVersionGuard.requireSingleRowUpdated(2, () -> 1L))
            .isInstanceOf(IllegalStateException.class);
        assertThatThrownBy(() -> ManagementCommandVersionGuard.requireMatch("\"v0\"", -1L))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessageContaining("currentVersion");
        assertThatThrownBy(() -> ManagementCommandVersionGuard.toStrongEtag(-1L))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessageContaining("version");
    }

    private static Stream<Arguments> validStrongEtags() {
        return Stream.of(
            Arguments.of("\"v0\"", 0L),
            Arguments.of("\"v1\"", 1L),
            Arguments.of("  \"v17\"  ", 17L),
            Arguments.of("\"v9223372036854775807\"", Long.MAX_VALUE)
        );
    }

    private static void assertBadRequest(String ifMatch, String messageFragment) {
        assertThatThrownBy(() -> ManagementCommandVersionGuard.parseRequiredIfMatch(ifMatch))
            .isInstanceOfSatisfying(BusinessException.class, exception -> {
                assertThat(exception.getErrorCode()).isEqualTo(ErrorCode.BAD_REQUEST);
                assertThat(exception.getMessage()).contains(messageFragment);
                assertThat(exception.getDetails()).isEmpty();
            });
    }
}
