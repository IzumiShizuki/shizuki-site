package io.github.shizuki.site.content.support;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

class PostSearchTextTest {
    @Test
    void excerptRetainsMatchAfterExpandingUnicodeCaseMapping() {
        String body = "İ".repeat(500) + " 记住这个 NEEDLE 和后面的记录。";
        assertThat(PostSearchText.matches(PostSearchText.terms("needle"), body)).isTrue();
        assertThat(PostSearchText.excerpt(body, PostSearchText.terms("needle")))
            .contains("NEEDLE", "记住这个").hasSizeLessThanOrEqualTo(222);
    }

    @Test
    void excerptRetainsAnExpandingCharacterInsideTheQueryMatch() {
        String body = "前文".repeat(200) + " İSTANBUL 正文";
        var terms = PostSearchText.terms("İSTANBUL");
        assertThat(PostSearchText.matches(terms, body)).isTrue();
        assertThat(PostSearchText.excerpt(body, terms)).contains("İSTANBUL");
    }

    @Test
    void excerptTreatsRegexCharactersLiterallyAndUsesTheEarliestMatchingTerm() {
        String body = "前文".repeat(100) + " [a-z]+ 这里是第一处 " + "正文".repeat(100) + " second";
        assertThat(PostSearchText.excerpt(body, List.of("second", "[a-z]+")))
            .contains("[a-z]+", "第一处").doesNotContain("second");
    }

    @Test
    void excerptKeepsSupplementaryCharactersWholeAtItsBoundaries() {
        String excerpt = PostSearchText.excerpt("🙂".repeat(150) + " MATCH " + "🙂".repeat(150), List.of("match"));
        assertThat(excerpt).contains("MATCH").hasSizeLessThanOrEqualTo(222);
        for (int i = 0; i < excerpt.length(); i++) {
            char unit = excerpt.charAt(i);
            if (Character.isHighSurrogate(unit)) {
                assertThat(i + 1).isLessThan(excerpt.length());
                assertThat(Character.isLowSurrogate(excerpt.charAt(++i))).isTrue();
            } else {
                assertThat(Character.isLowSurrogate(unit)).isFalse();
            }
        }
    }
}
