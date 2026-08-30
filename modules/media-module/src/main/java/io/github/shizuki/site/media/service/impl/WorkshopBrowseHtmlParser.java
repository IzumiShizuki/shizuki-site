package io.github.shizuki.site.media.service.impl;

import io.github.shizuki.site.media.response.WorkshopSearchItemResponse;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * steamcommunity 创意工坊浏览页 HTML 的容错解析器。
 * 仅依赖条目锚点（data-publishedfileid / filedetails?id=）与就近的预览图、标题，
 * 页面小改版时也尽量能解析出可用结果。
 */
final class WorkshopBrowseHtmlParser {

    private static final Pattern ITEM_ANCHOR_PATTERN = Pattern.compile(
            "data-publishedfileid=\"(\\d{3,20})\"|filedetails/\\?id=(\\d{3,20})");
    private static final Pattern PREVIEW_IMG_PATTERN = Pattern.compile(
            "<img[^>]+class=\"[^\"]*workshopItemPreviewImage[^\"]*\"[^>]+src=\"([^\"]+)\"|<img[^>]+src=\"([^\"]+)\"[^>]+class=\"[^\"]*workshopItemPreviewImage[^\"]*\"");
    private static final Pattern TITLE_PATTERN = Pattern.compile(
            "class=\"[^\"]*workshopItemTitle[^\"]*\"[^>]*>(.*?)</div>", Pattern.DOTALL);
    private static final Pattern IMAGE_TAG_PATTERN = Pattern.compile("<img\\b[^>]*>",
            Pattern.CASE_INSENSITIVE | Pattern.DOTALL);
    private static final Pattern SRC_ATTRIBUTE_PATTERN = Pattern.compile(
            "\\bsrc\\s*=\\s*([\"'])(.*?)\\1", Pattern.CASE_INSENSITIVE | Pattern.DOTALL);
    private static final Pattern ALT_ATTRIBUTE_PATTERN = Pattern.compile(
            "\\balt\\s*=\\s*([\"'])(.*?)\\1", Pattern.CASE_INSENSITIVE | Pattern.DOTALL);
    private static final Pattern NUMERIC_ENTITY_PATTERN = Pattern.compile("&#(x[0-9a-fA-F]+|\\d+);");

    private WorkshopBrowseHtmlParser() {
    }

    static List<WorkshopSearchItemResponse> parse(String html, String detailUrlBase) {
        List<WorkshopSearchItemResponse> items = new ArrayList<>();
        if (html == null || html.isBlank()) {
            return items;
        }
        Set<String> seenIds = new LinkedHashSet<>();
        List<int[]> anchors = new ArrayList<>();
        List<String> anchorIds = new ArrayList<>();
        Matcher anchorMatcher = ITEM_ANCHOR_PATTERN.matcher(html);
        while (anchorMatcher.find()) {
            String itemId = anchorMatcher.group(1) != null ? anchorMatcher.group(1) : anchorMatcher.group(2);
            if (itemId == null || !seenIds.add(itemId)) {
                continue;
            }
            anchors.add(new int[]{anchorMatcher.start(), anchorMatcher.end()});
            anchorIds.add(itemId);
        }
        for (int i = 0; i < anchorIds.size(); i++) {
            int blockStart = anchors.get(i)[0];
            int blockEnd = i + 1 < anchors.size() ? anchors.get(i + 1)[0] : Math.min(html.length(), blockStart + 4000);
            if (blockEnd <= blockStart) {
                blockEnd = Math.min(html.length(), blockStart + 4000);
            }
            String block = html.substring(blockStart, blockEnd);
            String previewUrl = firstNonBlankGroup(PREVIEW_IMG_PATTERN.matcher(block));
            String title = firstNonBlankGroup(TITLE_PATTERN.matcher(block));
            Matcher imageMatcher = IMAGE_TAG_PATTERN.matcher(block);
            if (imageMatcher.find()) {
                String imageTag = imageMatcher.group();
                if (previewUrl == null || previewUrl.isBlank()) {
                    previewUrl = readAttribute(imageTag, SRC_ATTRIBUTE_PATTERN);
                }
                if (title == null || title.isBlank()) {
                    title = readAttribute(imageTag, ALT_ATTRIBUTE_PATTERN);
                }
            }
            String itemId = anchorIds.get(i);
            String normalizedTitle = unescapeHtml(stripTags(title));
            if (normalizedTitle.isBlank()) {
                normalizedTitle = "Workshop #" + itemId;
            }
            items.add(new WorkshopSearchItemResponse(
                    itemId,
                    normalizedTitle,
                    previewUrl == null ? "" : unescapeHtml(previewUrl),
                    detailUrlBase + itemId
            ));
        }
        return items;
    }

    private static String readAttribute(String tag, Pattern attributePattern) {
        Matcher matcher = attributePattern.matcher(tag);
        return matcher.find() ? matcher.group(2).trim() : "";
    }

    private static String firstNonBlankGroup(Matcher matcher) {
        if (!matcher.find()) {
            return null;
        }
        for (int group = 1; group <= matcher.groupCount(); group++) {
            String value = matcher.group(group);
            if (value != null && !value.isBlank()) {
                return value.trim();
            }
        }
        return null;
    }

    private static String stripTags(String value) {
        if (value == null) {
            return "";
        }
        return value.replaceAll("<[^>]*>", " ").replaceAll("\\s+", " ").trim();
    }

    static String unescapeHtml(String value) {
        if (value == null) {
            return "";
        }
        String namedEntities = value
                .replace("&amp;", "&")
                .replace("&quot;", "\"")
                .replace("&#39;", "'")
                .replace("&#x27;", "'")
                .replace("&lt;", "<")
                .replace("&gt;", ">")
                .replace("&nbsp;", " ");
        Matcher matcher = NUMERIC_ENTITY_PATTERN.matcher(namedEntities);
        StringBuffer decoded = new StringBuffer(namedEntities.length());
        while (matcher.find()) {
            String rawCodePoint = matcher.group(1);
            try {
                int radix = rawCodePoint.startsWith("x") ? 16 : 10;
                int codePoint = Integer.parseInt(rawCodePoint.substring(radix == 16 ? 1 : 0), radix);
                String replacement = Character.isValidCodePoint(codePoint)
                        ? new String(Character.toChars(codePoint))
                        : matcher.group();
                matcher.appendReplacement(decoded, Matcher.quoteReplacement(replacement));
            } catch (IllegalArgumentException exception) {
                matcher.appendReplacement(decoded, Matcher.quoteReplacement(matcher.group()));
            }
        }
        matcher.appendTail(decoded);
        return decoded.toString();
    }
}
