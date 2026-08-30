package io.github.shizuki.site.content.model;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.Test;

class PublicContentCursorWindowTest {

    private final OpaquePublicIdentifierGenerator identifierGenerator = new OpaquePublicIdentifierGenerator();

    @Test
    void usesEveryDescendingSortFieldAsAStrictKeysetBoundary() {
        Instant publishedAt = Instant.parse("2026-08-27T00:00:00Z");
        PublicContentCursorKey cursor = new PublicContentCursorKey(publishedAt, 20L, "cursor_b");

        assertThat(PublicContentCursorWindow.isInNextPage(
            new PublicContentCursorKey(publishedAt.minusSeconds(1), 999L, "newer_z"),
            cursor
        )).isTrue();
        assertThat(PublicContentCursorWindow.isInNextPage(
            new PublicContentCursorKey(publishedAt, 19L, "newer_z"),
            cursor
        )).isTrue();
        assertThat(PublicContentCursorWindow.isInNextPage(
            new PublicContentCursorKey(publishedAt, 20L, "cursor_a"),
            cursor
        )).isTrue();
        assertThat(PublicContentCursorWindow.isInNextPage(cursor, cursor)).isFalse();
        assertThat(PublicContentCursorWindow.isInNextPage(
            new PublicContentCursorKey(publishedAt, 21L, "cursor_a"),
            cursor
        )).isFalse();
    }

    @Test
    void concurrentNewRowsDoNotRepeatOrSkipRowsThatExistedWhenPagingStarted() {
        Instant newest = Instant.parse("2026-08-27T12:00:00Z");
        List<Row> originalRows = new ArrayList<>();
        for (int index = 0; index < 17; index++) {
            originalRows.add(row("original-" + index, newest.minus(index, ChronoUnit.MINUTES), 100L - index));
        }

        List<Row> firstPage = PublicContentCursorWindow.nextPage(
            originalRows,
            Row::cursorKey,
            null,
            5
        );
        PublicContentCursorKey cursor = firstPage.get(firstPage.size() - 1).cursorKey();

        List<Row> rowsAfterConcurrentPublish = new ArrayList<>(originalRows);
        rowsAfterConcurrentPublish.add(row("concurrent-new-1", newest.plusSeconds(2), 102L));
        rowsAfterConcurrentPublish.add(row("concurrent-new-2", newest.plusSeconds(1), 101L));
        rowsAfterConcurrentPublish.add(row("concurrent-new-same-time", newest, 103L));

        List<String> observedIds = new ArrayList<>(firstPage.stream().map(Row::id).toList());
        while (true) {
            List<Row> nextPage = PublicContentCursorWindow.nextPage(
                rowsAfterConcurrentPublish,
                Row::cursorKey,
                cursor,
                5
            );
            if (nextPage.isEmpty()) {
                break;
            }
            observedIds.addAll(nextPage.stream().map(Row::id).toList());
            cursor = nextPage.get(nextPage.size() - 1).cursorKey();
        }

        Set<String> originalIds = new HashSet<>(originalRows.stream().map(Row::id).toList());
        assertThat(observedIds).doesNotHaveDuplicates();
        assertThat(observedIds).containsAll(originalIds);
        assertThat(observedIds).doesNotContain(
            "concurrent-new-1",
            "concurrent-new-2",
            "concurrent-new-same-time"
        );
    }

    private Row row(String id, Instant publishedAt, long stableSortKey) {
        return new Row(
            id,
            new PublicContentCursorKey(
                publishedAt,
                stableSortKey,
                identifierGenerator.generate(PublicContentType.MOMENT)
            )
        );
    }

    private record Row(String id, PublicContentCursorKey cursorKey) {
    }
}
