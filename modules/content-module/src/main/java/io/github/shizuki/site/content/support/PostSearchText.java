package io.github.shizuki.site.content.support;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

/** Request-scoped search text: no persistent index that could outlive a visibility change. */
public final class PostSearchText {

    private static final int EXCERPT_LENGTH = 220;
    private static final int EXCERPT_LEADING_CONTEXT = 60;

    private PostSearchText() {
    }

    public static List<String> terms(String query) {
        if (query == null || query.isBlank()) return List.of();
        return Arrays.stream(query.toLowerCase(Locale.ROOT).strip().split("(?U)\\s+"))
            .filter(term -> !term.isBlank()).distinct().toList();
    }

    public static boolean matches(List<String> terms, String... fields) {
        String searchable = Arrays.stream(fields).map(value -> value == null ? "" : value)
            .collect(Collectors.joining("\n")).toLowerCase(Locale.ROOT);
        return terms.stream().allMatch(searchable::contains);
    }

    public static String excerpt(String text, List<String> terms) {
        String source = text == null ? "" : text.replaceAll("(?U)\\s+", " ").trim();
        if (source.isBlank() || terms.isEmpty()) return null;
        String normalized = source.toLowerCase(Locale.ROOT);
        int match = terms.stream().mapToInt(normalized::indexOf).filter(index -> index >= 0).min().orElse(0);
        int start = Math.max(0, match - EXCERPT_LEADING_CONTEXT);
        if (start > 0 && Character.isLowSurrogate(source.charAt(start))) start--;
        int end = Math.min(source.length(), start + EXCERPT_LENGTH);
        if (end < source.length() && Character.isLowSurrogate(source.charAt(end))) end--;
        return (start > 0 ? "…" : "") + source.substring(start, end) + (end < source.length() ? "…" : "");
    }
}
