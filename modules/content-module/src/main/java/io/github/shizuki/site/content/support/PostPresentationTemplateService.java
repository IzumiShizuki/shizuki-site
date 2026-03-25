package io.github.shizuki.site.content.support;

import io.github.shizuki.site.content.entity.PostEntity;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
public class PostPresentationTemplateService {

    public static final String TEMPLATE_VERSION = "v1";

    private static final Pattern HEADING_PATTERN = Pattern.compile("^\\s{0,3}(#{1,6})\\s+(.+?)\\s*$");
    private static final Pattern FRONT_MATTER_PATTERN = Pattern.compile("(?s)^---\\R.*?\\R---\\R?");
    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    private static final int MAX_BODY_LINES_PER_SLIDE = 14;
    private static final int MAX_BLOCKS_PER_SLIDE = 4;
    private static final int MAX_CODE_LINES = 24;

    public PresentationDeck build(PostEntity post, String markdown, LocalDateTime publishedAt) {
        String normalizedMarkdown = normalizeMarkdown(markdown);
        List<String> slides = new ArrayList<>();
        slides.add(buildCoverSlide(post, publishedAt));

        MarkdownSections sections = splitSections(normalizedMarkdown);
        if (StringUtils.hasText(sections.introduction())) {
            slides.add(buildBodySlide("概览", sections.introduction(), 2));
        }

        for (SectionBlock block : sections.blocks()) {
            if (block.level() == 1) {
                slides.add(buildSectionDivider(block.title()));
                appendBodySlides(slides, block.title(), block.body(), Math.min(2, block.level() + 1));
            } else {
                appendBodySlides(slides, block.title(), block.body(), Math.min(6, block.level()));
            }
        }

        String deck = buildFrontMatter(post) + String.join("\n\n---\n\n", slides) + "\n";
        return new PresentationDeck(deck, slides.size());
    }

    private String buildFrontMatter(PostEntity post) {
        String title = sanitizeInline(readString(post.getTitle(), "未命名文章"));
        return """
            ---
            theme: default
            title: "%s"
            mdc: true
            layout: cover
            ---

            """.formatted(title);
    }

    private String buildCoverSlide(PostEntity post, LocalDateTime publishedAt) {
        String title = sanitizeInline(readString(post.getTitle(), "未命名文章"));
        String summary = sanitizeBlock(readString(post.getSummary(), "暂无摘要"));
        String category = sanitizeInline(readString(post.getCategoryCode(), "uncategorized"));
        String dateText = publishedAt == null ? "-" : DATE_FORMATTER.format(publishedAt);
        return """
            # %s

            %s

            `%s` · `%s`
            """.formatted(title, summary, category, dateText);
    }

    private String buildSectionDivider(String title) {
        return """
            layout: section

            # %s
            """.formatted(sanitizeInline(title));
    }

    private void appendBodySlides(List<String> slides, String title, String body, int headingLevel) {
        String normalizedBody = truncateLargeCodeFences(normalizeMarkdown(body)).trim();
        if (!StringUtils.hasText(normalizedBody)) {
            slides.add(buildBodySlide(title, "", headingLevel));
            return;
        }

        List<String> blocks = splitContentBlocks(normalizedBody);
        List<String> currentBlocks = new ArrayList<>();
        int currentLineBudget = 0;

        for (String block : blocks) {
            int blockLines = countVisualLines(block);
            boolean shouldFlush = !currentBlocks.isEmpty()
                && (currentBlocks.size() >= MAX_BLOCKS_PER_SLIDE || currentLineBudget + blockLines > MAX_BODY_LINES_PER_SLIDE);
            if (shouldFlush) {
                slides.add(buildBodySlide(title, String.join("\n\n", currentBlocks), headingLevel));
                currentBlocks = new ArrayList<>();
                currentLineBudget = 0;
            }
            currentBlocks.add(block);
            currentLineBudget += blockLines;
        }

        if (!currentBlocks.isEmpty()) {
            slides.add(buildBodySlide(title, String.join("\n\n", currentBlocks), headingLevel));
        }
    }

    private String buildBodySlide(String title, String body, int headingLevel) {
        int normalizedLevel = Math.max(1, Math.min(6, headingLevel));
        String headingPrefix = "#".repeat(normalizedLevel);
        if (!StringUtils.hasText(body)) {
            return "%s %s".formatted(headingPrefix, sanitizeInline(title));
        }
        return """
            %s %s

            %s
            """.formatted(headingPrefix, sanitizeInline(title), body.trim());
    }

    private MarkdownSections splitSections(String markdown) {
        String safeMarkdown = FRONT_MATTER_PATTERN.matcher(readString(markdown, "")).replaceFirst("");
        List<String> introLines = new ArrayList<>();
        List<SectionBlock> blocks = new ArrayList<>();
        SectionBuilder current = null;

        for (String line : safeMarkdown.split("\\R", -1)) {
            Matcher matcher = HEADING_PATTERN.matcher(line);
            if (matcher.matches()) {
                if (current != null) {
                    blocks.add(current.build());
                }
                current = new SectionBuilder(matcher.group(2).replaceAll("\\s+#+\\s*$", "").trim(), matcher.group(1).length());
                continue;
            }
            if (current == null) {
                introLines.add(line);
            } else {
                current.addLine(line);
            }
        }

        if (current != null) {
            blocks.add(current.build());
        }

        return new MarkdownSections(String.join("\n", introLines).trim(), blocks);
    }

    private List<String> splitContentBlocks(String body) {
        List<String> blocks = new ArrayList<>();
        List<String> current = new ArrayList<>();
        for (String line : body.split("\\R", -1)) {
            if (!StringUtils.hasText(line)) {
                if (!current.isEmpty()) {
                    blocks.add(String.join("\n", current).trim());
                    current = new ArrayList<>();
                }
                continue;
            }
            current.add(line);
        }
        if (!current.isEmpty()) {
            blocks.add(String.join("\n", current).trim());
        }
        return blocks;
    }

    private int countVisualLines(String block) {
        if (!StringUtils.hasText(block)) {
            return 0;
        }
        return Math.max(1, block.split("\\R", -1).length);
    }

    private String truncateLargeCodeFences(String markdown) {
        List<String> lines = List.of(readString(markdown, "").split("\\R", -1));
        List<String> output = new ArrayList<>();
        boolean inCodeFence = false;
        int currentCodeLines = 0;
        boolean codeTruncated = false;
        for (String line : lines) {
            boolean isFence = line.trim().startsWith("```");
            if (isFence) {
                if (!inCodeFence) {
                    inCodeFence = true;
                    currentCodeLines = 0;
                    codeTruncated = false;
                    output.add(line);
                } else {
                    if (codeTruncated) {
                        output.add("...");
                    }
                    output.add(line);
                    if (codeTruncated) {
                        output.add("> 代码过长，已截断，请查看原文。");
                    }
                    inCodeFence = false;
                }
                continue;
            }

            if (!inCodeFence) {
                output.add(line);
                continue;
            }

            currentCodeLines += 1;
            if (currentCodeLines <= MAX_CODE_LINES) {
                output.add(line);
            } else {
                codeTruncated = true;
            }
        }
        return String.join("\n", output).trim();
    }

    private String normalizeMarkdown(String markdown) {
        return readString(markdown, "")
            .replace("\r\n", "\n")
            .replace('\r', '\n')
            .trim();
    }

    private String readString(String value, String fallback) {
        return value == null ? fallback : value;
    }

    private String sanitizeInline(String value) {
        return readString(value, "")
            .replace("\"", "\\\"")
            .replace("\n", " ")
            .trim();
    }

    private String sanitizeBlock(String value) {
        return readString(value, "")
            .replace("\r\n", "\n")
            .replace('\r', '\n')
            .trim();
    }

    public record PresentationDeck(
        String slidevMarkdown,
        int slideCount
    ) {
    }

    private record MarkdownSections(
        String introduction,
        List<SectionBlock> blocks
    ) {
    }

    private record SectionBlock(
        String title,
        int level,
        String body
    ) {
    }

    private static final class SectionBuilder {
        private final String title;
        private final int level;
        private final List<String> lines = new ArrayList<>();

        private SectionBuilder(String title, int level) {
            this.title = title;
            this.level = level;
        }

        private void addLine(String line) {
            lines.add(line);
        }

        private SectionBlock build() {
            return new SectionBlock(title, level, String.join("\n", lines).trim());
        }
    }
}
