package io.github.shizuki.site.media.service.impl;

import com.fasterxml.jackson.databind.JsonNode;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/** Only source resolution tags are accepted; thumbnail dimensions are never inspected. */
final class WorkshopResolution {
    private static final Pattern PIXELS = Pattern.compile("^(\\d{3,5})\\s*[x×]\\s*(\\d{3,5})$",
            Pattern.CASE_INSENSITIVE);
    private static final Pattern PAGE_RESOLUTION = Pattern.compile(
            "(?:Resolution|分辨率)\\s*:\\s*(?:<[^>]+>\\s*)*([^<\\r\\n]+)", Pattern.CASE_INSENSITIVE);

    private WorkshopResolution() { }

    static String fromTags(JsonNode tags) {
        for (JsonNode tag : tags) {
            String value = normalize(tag.isTextual() ? tag.asText() : tag.path("tag").asText(""));
            if (!value.isEmpty()) return value;
        }
        return "";
    }

    static String fromPage(String html) {
        Matcher matcher = PAGE_RESOLUTION.matcher(WorkshopBrowseHtmlParser.unescapeHtml(html));
        while (matcher.find()) {
            String value = normalize(matcher.group(1));
            if (!value.isEmpty()) return value;
        }
        return "";
    }

    private static String normalize(String raw) {
        String value = raw == null ? "" : raw.trim();
        if (value.equalsIgnoreCase("Dynamic Resolution") || value.equals("动态分辨率")) {
            return "Dynamic Resolution";
        }
        Matcher matcher = PIXELS.matcher(value);
        return matcher.matches() ? matcher.group(1) + "x" + matcher.group(2) : "";
    }
}
