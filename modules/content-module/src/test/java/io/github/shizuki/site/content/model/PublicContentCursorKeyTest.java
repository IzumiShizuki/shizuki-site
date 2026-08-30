package io.github.shizuki.site.content.model;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

class PublicContentCursorKeyTest {

    @Test
    void ordersNewestFirstAndUsesPublicIdAsDeterministicTieBreak() {
        Instant earlier = Instant.parse("2026-08-26T00:00:00Z");
        Instant later = Instant.parse("2026-08-27T00:00:00Z");
        PublicContentCursorKey newestLowId = new PublicContentCursorKey(later, "a-public-id");
        PublicContentCursorKey newestHighId = new PublicContentCursorKey(later, "z-public-id");
        PublicContentCursorKey old = new PublicContentCursorKey(earlier, "zz-old");
        List<PublicContentCursorKey> keys = new ArrayList<>(List.of(old, newestLowId, newestHighId));

        keys.sort(PublicContentCursorKey.NEWEST_FIRST);

        assertThat(keys).containsExactly(newestHighId, newestLowId, old);
    }
}
