package io.github.shizuki.common.xss.util;

public final class ExternalLinkRelRewriter {

    private ExternalLinkRelRewriter() {
    }

    public static String ensureSafeRel(String html) {
        if (html == null || html.isBlank()) {
            return html;
        }
        return html.replaceAll("<a(\\s+[^>]*?)?>", "<a$1 rel=\"noopener noreferrer\">");
    }
}
