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
            items.add(new WorkshopSearchItemResponse(
                    anchorIds.get(i),
                    unescapeHtml(stripTags(title)),
                    previewUrl == null ? "" : unescapeHtml(previewUrl),
                    detailUrlBase + anchorIds.get(i)
            ));
        }
        return items;
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

    private static String unescapeHtml(String value) {
        if (value == null) {
            return "";
        }
        return value
                .replace("&amp;", "&")
                .replace("&quot;", "\"")
                .replace("&#39;", "'")
                .replace("&#x27;", "'")
                .replace("&lt;", "<")
                .replace("&gt;", ">")
                .replace("&nbsp;", " ");
    }
}
