package io.github.shizuki.site.content.support;

import java.util.List;
import org.commonmark.ext.gfm.tables.TablesExtension;
import org.commonmark.parser.Parser;
import org.commonmark.renderer.html.HtmlRenderer;
import org.commonmark.renderer.text.TextContentRenderer;

/** Safe, script-free presentation of the same Markdown used by the interactive reader. */
public final class PublicMarkdown {

    private static final List<org.commonmark.Extension> EXTENSIONS = List.of(TablesExtension.create());
    private static final Parser PARSER = Parser.builder().extensions(EXTENSIONS).build();
    private static final HtmlRenderer HTML = HtmlRenderer.builder().extensions(EXTENSIONS)
        .escapeHtml(true).sanitizeUrls(true).build();
    private static final TextContentRenderer TEXT = TextContentRenderer.builder().extensions(EXTENSIONS).build();

    private PublicMarkdown() {
    }

    public static String html(String markdown) {
        return HTML.render(PARSER.parse(markdown == null ? "" : markdown));
    }

    public static String text(String markdown) {
        return TEXT.render(PARSER.parse(markdown == null ? "" : markdown))
            .replaceAll("<[^>]*>", " ").replaceAll("(?U)\\s+", " ").trim();
    }
}
