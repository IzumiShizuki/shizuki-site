package io.github.shizuki.site.content.support;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
public class NotionBlockCodec {

    private static final Pattern HEADING_PATTERN = Pattern.compile("^(#{1,3})\\s+(.*)$");
    private static final Pattern BULLET_PATTERN = Pattern.compile("^[-*]\\s+(.*)$");
    private static final Pattern NUMBER_PATTERN = Pattern.compile("^\\d+\\.\\s+(.*)$");
    private static final Pattern QUOTE_PATTERN = Pattern.compile("^>\\s?(.*)$");
    private static final Pattern TODO_PATTERN = Pattern.compile("^[-*]\\s+\\[( |x|X)]\\s+(.*)$");
    private static final Pattern CONTAINER_OPEN_PATTERN = Pattern.compile("^\\s{0,3}:{3}\\s*([A-Za-z][\\w-]*)\\s*(.*?)\\s*$");
    private static final Pattern CONTAINER_CLOSE_PATTERN = Pattern.compile("^\\s{0,3}:{3}\\s*$");
    private static final Pattern CODE_FENCE_PATTERN = Pattern.compile("^\\s*```.*$");
    private static final Pattern BARE_URL_PATTERN = Pattern.compile("^https?://\\S+$", Pattern.CASE_INSENSITIVE);
    private static final Pattern IMAGE_LINE_PATTERN = Pattern.compile("^!\\[([^\\]]*)]\\((https?://[^)\\s]+)(?:\\s+\"[^\"]*\")?\\)$");
    private static final Pattern YOUTUBE_URL_PATTERN = Pattern.compile("(?:youtu\\.be/|youtube\\.com/(?:watch\\?(?:[^#]*&)?v=|shorts/|embed/))[A-Za-z0-9_-]{6,20}");
    private static final Pattern BILIBILI_URL_PATTERN = Pattern.compile("bilibili\\.com/video/BV[0-9A-Za-z]+", Pattern.CASE_INSENSITIVE);

    private static final String CONTAINER_TYPE_DETAILS = "details";
    private static final String CONTAINER_TYPE_TOGGLE = "toggle";
    private static final String WHITEBOARD_FENCE_LANG = "whiteboard";
    private static final String WHITEBOARD_CODE_MARKER = "shizuki:whiteboard";
    private static final int RICH_TEXT_CHUNK_LENGTH = 1900;
    private static final int MAX_CODE_CONTENT_LENGTH = 180_000;

    private static final Map<String, CalloutStyle> CALLOUT_STYLES = buildCalloutStyles();

    private final ObjectMapper objectMapper;

    public NotionBlockCodec(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public EncodeResult encodeMarkdown(String markdown) {
        String safeMarkdown = normalizeMarkdown(markdown);
        List<Map<String, Object>> blocks = encodeLines(List.of(safeMarkdown.split("\\R", -1)), 0);
        return new EncodeResult(blocks, safeMarkdown, hashContent(safeMarkdown));
    }

    private List<Map<String, Object>> encodeLines(List<String> lines, int depth) {
        List<Map<String, Object>> blocks = new ArrayList<>();
        boolean inCode = false;
        boolean inWhiteboardCode = false;
        String codeLanguage = "plain text";
        StringBuilder codeBuffer = new StringBuilder();
        for (int index = 0; index < lines.size(); index++) {
            String line = lines.get(index);
            if (line.startsWith("```")) {
                if (inCode) {
                    String codeContent = codeBuffer.toString().replaceFirst("\\n$", "");
                    blocks.add(inWhiteboardCode ? whiteboardCodeBlock(codeContent) : codeBlock(codeContent, codeLanguage));
                    codeBuffer.setLength(0);
                    inCode = false;
                    inWhiteboardCode = false;
                    codeLanguage = "plain text";
                } else {
                    inCode = true;
                    String rawLanguage = line.substring(3).trim();
                    inWhiteboardCode = WHITEBOARD_FENCE_LANG.equalsIgnoreCase(rawLanguage);
                    codeLanguage = StringUtils.hasText(rawLanguage) ? rawLanguage : "plain text";
                }
                continue;
            }
            if (inCode) {
                codeBuffer.append(line).append('\n');
                continue;
            }

            if (depth == 0) {
                Matcher containerMatcher = CONTAINER_OPEN_PATTERN.matcher(line);
                if (containerMatcher.matches()) {
                    int closeIndex = findContainerClose(lines, index + 1);
                    List<String> innerLines = lines.subList(index + 1, Math.min(closeIndex, lines.size()));
                    blocks.add(containerBlock(
                        containerMatcher.group(1).toLowerCase(Locale.ROOT),
                        containerMatcher.group(2).trim(),
                        encodeLines(innerLines, depth + 1)
                    ));
                    index = Math.min(closeIndex, lines.size() - 1);
                    continue;
                }
            }

            if (!StringUtils.hasText(line.trim())) {
                blocks.add(block("paragraph", Map.of("rich_text", List.of())));
                continue;
            }
            if ("---".equals(line.trim()) || "***".equals(line.trim())) {
                blocks.add(block("divider", Map.of()));
                continue;
            }

            Matcher todoMatcher = TODO_PATTERN.matcher(line);
            if (todoMatcher.matches()) {
                blocks.add(block("to_do", Map.of(
                    "rich_text", richText(todoMatcher.group(2)),
                    "checked", !" ".equals(todoMatcher.group(1))
                )));
                continue;
            }

            Matcher headingMatcher = HEADING_PATTERN.matcher(line);
            if (headingMatcher.matches()) {
                String hashes = headingMatcher.group(1);
                String content = headingMatcher.group(2);
                String type = switch (hashes.length()) {
                    case 1 -> "heading_1";
                    case 2 -> "heading_2";
                    default -> "heading_3";
                };
                blocks.add(block(type, Map.of("rich_text", richText(content))));
                continue;
            }

            Matcher bulletMatcher = BULLET_PATTERN.matcher(line);
            if (bulletMatcher.matches()) {
                blocks.add(block("bulleted_list_item", Map.of("rich_text", richText(bulletMatcher.group(1)))));
                continue;
            }

            Matcher numberMatcher = NUMBER_PATTERN.matcher(line);
            if (numberMatcher.matches()) {
                blocks.add(block("numbered_list_item", Map.of("rich_text", richText(numberMatcher.group(1)))));
                continue;
            }

            Matcher quoteMatcher = QUOTE_PATTERN.matcher(line);
            if (quoteMatcher.matches()) {
                blocks.add(block("quote", Map.of("rich_text", richText(quoteMatcher.group(1)))));
                continue;
            }

            String trimmedLine = line.trim();
            if (BARE_URL_PATTERN.matcher(trimmedLine).matches()) {
                blocks.add(bareUrlBlock(trimmedLine));
                continue;
            }

            Matcher imageMatcher = IMAGE_LINE_PATTERN.matcher(trimmedLine);
            if (imageMatcher.matches()) {
                blocks.add(imageBlock(imageMatcher.group(2), imageMatcher.group(1)));
                continue;
            }

            blocks.add(block("paragraph", Map.of("rich_text", richText(line))));
        }
        if (inCode) {
            String codeContent = codeBuffer.toString().replaceFirst("\\n$", "");
            blocks.add(inWhiteboardCode ? whiteboardCodeBlock(codeContent) : codeBlock(codeContent, codeLanguage));
        }
        return blocks;
    }

    private int findContainerClose(List<String> lines, int fromIndex) {
        int nesting = 1;
        boolean innerFence = false;
        for (int cursor = fromIndex; cursor < lines.size(); cursor++) {
            String line = lines.get(cursor);
            if (CODE_FENCE_PATTERN.matcher(line).matches()) {
                innerFence = !innerFence;
                continue;
            }
            if (innerFence) {
                continue;
            }
            if (CONTAINER_OPEN_PATTERN.matcher(line).matches()) {
                nesting++;
            } else if (CONTAINER_CLOSE_PATTERN.matcher(line).matches()) {
                nesting--;
                if (nesting == 0) {
                    return cursor;
                }
            }
        }
        return lines.size();
    }

    private Map<String, Object> containerBlock(String containerType, String title, List<Map<String, Object>> children) {
        Map<String, Object> payload = new LinkedHashMap<>();
        payload.put("rich_text", richText(title));
        if (children != null && !children.isEmpty()) {
            payload.put("children", children);
        }
        if (CONTAINER_TYPE_DETAILS.equals(containerType) || CONTAINER_TYPE_TOGGLE.equals(containerType)) {
            return block("toggle", payload);
        }
        CalloutStyle style = resolveCalloutStyle(containerType);
        payload.put("icon", Map.of("type", "emoji", "emoji", style.emoji()));
        payload.put("color", style.color());
        return block("callout", payload);
    }

    private Map<String, Object> codeBlock(String content, String language) {
        return block("code", Map.of(
            "rich_text", richText(content),
            "language", language
        ));
    }

    private Map<String, Object> whiteboardCodeBlock(String content) {
        if (content.length() > MAX_CODE_CONTENT_LENGTH) {
            throw new BusinessException(ErrorCode.BAD_REQUEST,
                "Post contains an embedded whiteboard larger than the Notion sync limit; shrink or remove it before pushing");
        }
        return block("code", Map.of(
            "rich_text", richText(content),
            "language", "json",
            "caption", richText(WHITEBOARD_CODE_MARKER)
        ));
    }

    private Map<String, Object> bareUrlBlock(String url) {
        if (YOUTUBE_URL_PATTERN.matcher(url).find()) {
            return block("video", Map.of(
                "type", "external",
                "external", Map.of("url", url)
            ));
        }
        if (BILIBILI_URL_PATTERN.matcher(url).find()) {
            return block("embed", Map.of("url", url));
        }
        return block("bookmark", Map.of("url", url));
    }

    private Map<String, Object> imageBlock(String url, String alt) {
        Map<String, Object> payload = new LinkedHashMap<>();
        payload.put("type", "external");
        payload.put("external", Map.of("url", url));
        if (StringUtils.hasText(alt)) {
            payload.put("caption", richText(alt));
        }
        return block("image", payload);
    }

    public DecodeResult decodeBlocksJson(String blocksJson) {
        if (!StringUtils.hasText(blocksJson)) {
            return new DecodeResult("", false, hashContent(""));
        }
        try {
            List<Map<String, Object>> blocks = objectMapper.readValue(blocksJson, new TypeReference<List<Map<String, Object>>>() {
            });
            return decodeBlocks(blocks);
        } catch (JsonProcessingException exception) {
            throw new BusinessException(ErrorCode.INTERNAL_ERROR, "Invalid notion blocks json");
        }
    }

    public DecodeResult decodeBlocks(List<Map<String, Object>> blocks) {
        List<String> lines = new ArrayList<>();
        boolean unsupported = decodeInto(blocks, lines);
        String markdown = normalizeMarkdown(String.join("\n", lines));
        return new DecodeResult(markdown, unsupported, hashContent(markdown));
    }

    private boolean decodeInto(List<Map<String, Object>> blocks, List<String> lines) {
        boolean unsupported = false;
        for (Map<String, Object> block : blocks) {
            String type = asString(block.get("type"));
            Map<String, Object> payload = castMap(block.get(type));
            switch (type) {
                case "paragraph" -> {
                    lines.add(joinPlainText(payload.get("rich_text")));
                    unsupported |= decodeChildrenInto(payload, lines);
                }
                case "heading_1" -> lines.add("# " + joinPlainText(payload.get("rich_text")));
                case "heading_2" -> lines.add("## " + joinPlainText(payload.get("rich_text")));
                case "heading_3" -> lines.add("### " + joinPlainText(payload.get("rich_text")));
                case "bulleted_list_item" -> {
                    lines.add("- " + joinPlainText(payload.get("rich_text")));
                    unsupported |= decodeChildrenInto(payload, lines);
                }
                case "numbered_list_item" -> {
                    lines.add("1. " + joinPlainText(payload.get("rich_text")));
                    unsupported |= decodeChildrenInto(payload, lines);
                }
                case "quote" -> {
                    lines.add("> " + joinPlainText(payload.get("rich_text")));
                    unsupported |= decodeChildrenInto(payload, lines);
                }
                case "to_do" -> {
                    boolean checked = Boolean.TRUE.equals(payload.get("checked"));
                    lines.add("- [" + (checked ? "x" : " ") + "] " + joinPlainText(payload.get("rich_text")));
                    unsupported |= decodeChildrenInto(payload, lines);
                }
                case "toggle" -> {
                    String title = joinPlainText(payload.get("rich_text")).trim();
                    lines.add(StringUtils.hasText(title) ? ":::details " + title : ":::details");
                    unsupported |= decodeChildrenInto(payload, lines);
                    lines.add(":::");
                }
                case "callout" -> {
                    String calloutType = resolveCalloutType(payload);
                    String title = joinPlainText(payload.get("rich_text")).trim();
                    lines.add(StringUtils.hasText(title) ? ":::" + calloutType + " " + title : ":::" + calloutType);
                    unsupported |= decodeChildrenInto(payload, lines);
                    lines.add(":::");
                }
                case "code" -> {
                    String language = asString(payload.get("language"));
                    String content = joinPlainText(payload.get("rich_text"));
                    if (isWhiteboardCode(payload, content)) {
                        lines.add("```" + WHITEBOARD_FENCE_LANG);
                        lines.add(content);
                        lines.add("```");
                    } else {
                        lines.add("```" + (StringUtils.hasText(language) ? language : ""));
                        lines.add(content);
                        lines.add("```");
                    }
                }
                case "video" -> {
                    String url = extractExternalUrl(payload);
                    if (StringUtils.hasText(url)) {
                        lines.add(url);
                    } else {
                        unsupported = true;
                        lines.add("[Unsupported Notion block: video]");
                    }
                }
                case "embed", "bookmark", "link_preview" -> {
                    String url = asString(payload.get("url"));
                    if (StringUtils.hasText(url)) {
                        lines.add(url);
                    } else {
                        unsupported = true;
                        lines.add("[Unsupported Notion block: " + type + "]");
                    }
                }
                case "image" -> {
                    String url = extractExternalUrl(payload);
                    if (StringUtils.hasText(url)) {
                        String alt = joinPlainText(payload.get("caption")).trim();
                        lines.add("![" + (StringUtils.hasText(alt) ? alt : "image") + "](" + url + ")");
                    } else {
                        unsupported = true;
                        lines.add("[Unsupported Notion block: image]");
                    }
                }
                case "divider" -> lines.add("---");
                default -> {
                    unsupported = true;
                    lines.add("[Unsupported Notion block: " + type + "]");
                }
            }
        }
        return unsupported;
    }

    private boolean decodeChildrenInto(Map<String, Object> payload, List<String> lines) {
        Object childrenObject = payload.get("children");
        if (!(childrenObject instanceof List<?> childrenList) || childrenList.isEmpty()) {
            return false;
        }
        List<Map<String, Object>> children = new ArrayList<>();
        for (Object child : childrenList) {
            if (child instanceof Map<?, ?> childMap) {
                children.add(castMap(childMap));
            }
        }
        return decodeInto(children, lines);
    }

    private boolean isWhiteboardCode(Map<String, Object> payload, String content) {
        String caption = joinPlainText(payload.get("caption"));
        if (caption.contains(WHITEBOARD_CODE_MARKER)) {
            return true;
        }
        String trimmed = Objects.toString(content, "").trim();
        if (!trimmed.startsWith("{") || !trimmed.contains("\"chunks\"") || !trimmed.contains("\"encoding\"")) {
            return false;
        }
        try {
            Map<String, Object> parsed = objectMapper.readValue(trimmed, new TypeReference<Map<String, Object>>() {
            });
            return parsed.get("chunks") instanceof List<?> chunks && !chunks.isEmpty();
        } catch (JsonProcessingException exception) {
            return false;
        }
    }

    private String extractExternalUrl(Map<String, Object> payload) {
        String sourceType = asString(payload.get("type"));
        if ("external".equals(sourceType)) {
            return asString(castMap(payload.get("external")).get("url"));
        }
        return "";
    }

    private CalloutStyle resolveCalloutStyle(String containerType) {
        CalloutStyle style = CALLOUT_STYLES.get(containerType);
        return style != null ? style : CALLOUT_STYLES.get("note");
    }

    private String resolveCalloutType(Map<String, Object> payload) {
        String color = asString(payload.get("color")).toLowerCase(Locale.ROOT);
        if (color.startsWith("blue")) {
            return "info";
        }
        if (color.startsWith("green")) {
            return "tip";
        }
        if (color.startsWith("yellow") || color.startsWith("orange") || color.startsWith("brown")) {
            return "warning";
        }
        if (color.startsWith("red") || color.startsWith("pink")) {
            return "danger";
        }
        String emoji = asString(castMap(payload.get("icon")).get("emoji"));
        return switch (emoji) {
            case "ℹ️" -> "info";
            case "💡", "✅" -> "tip";
            case "⚠️" -> "warning";
            case "❗", "🚨" -> "danger";
            default -> "note";
        };
    }

    public String writeBlocksJson(List<Map<String, Object>> blocks) {
        try {
            return objectMapper.writeValueAsString(blocks == null ? List.of() : blocks);
        } catch (JsonProcessingException exception) {
            throw new BusinessException(ErrorCode.INTERNAL_ERROR, "Write notion blocks json failed");
        }
    }

    private Map<String, Object> block(String type, Map<String, Object> payload) {
        Map<String, Object> block = new LinkedHashMap<>();
        block.put("object", "block");
        block.put("type", type);
        block.put(type, payload);
        return block;
    }

    private List<Map<String, Object>> richText(String content) {
        String safeContent = Objects.toString(content, "");
        if (!StringUtils.hasText(safeContent)) {
            return List.of();
        }
        List<Map<String, Object>> parts = new ArrayList<>();
        int offset = 0;
        while (offset < safeContent.length()) {
            int end = Math.min(offset + RICH_TEXT_CHUNK_LENGTH, safeContent.length());
            if (end < safeContent.length() && Character.isHighSurrogate(safeContent.charAt(end - 1))) {
                end--;
            }
            parts.add(Map.of(
                "type", "text",
                "text", Map.of("content", safeContent.substring(offset, end))
            ));
            offset = end;
        }
        return List.copyOf(parts);
    }

    @SuppressWarnings("unchecked")
    private Map<String, Object> castMap(Object value) {
        if (value instanceof Map<?, ?> map) {
            return (Map<String, Object>) map;
        }
        return Map.of();
    }

    @SuppressWarnings("unchecked")
    private String joinPlainText(Object richTextObject) {
        if (!(richTextObject instanceof List<?> list)) {
            return "";
        }
        StringBuilder builder = new StringBuilder();
        for (Object item : list) {
            if (!(item instanceof Map<?, ?> map)) {
                continue;
            }
            Object plainText = ((Map<String, Object>) map).get("plain_text");
            if (plainText != null) {
                builder.append(plainText);
                continue;
            }
            Object text = ((Map<String, Object>) map).get("text");
            if (text instanceof Map<?, ?> textMap) {
                Object content = ((Map<String, Object>) textMap).get("content");
                if (content != null) {
                    builder.append(content);
                }
            }
        }
        return builder.toString();
    }

    private String asString(Object value) {
        return value == null ? "" : String.valueOf(value).trim();
    }

    private String normalizeMarkdown(String markdown) {
        String safeMarkdown = markdown == null ? "" : markdown.replace("\r\n", "\n").replace('\r', '\n');
        return safeMarkdown.stripTrailing();
    }

    private String hashContent(String markdown) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest((markdown == null ? "" : markdown).getBytes(StandardCharsets.UTF_8));
            return Base64.getUrlEncoder().withoutPadding().encodeToString(hash);
        } catch (NoSuchAlgorithmException exception) {
            throw new BusinessException(ErrorCode.INTERNAL_ERROR, "Hash algorithm missing");
        }
    }

    private static Map<String, CalloutStyle> buildCalloutStyles() {
        Map<String, CalloutStyle> styles = new LinkedHashMap<>();
        styles.put("info", new CalloutStyle("info", "ℹ️", "blue_background"));
        styles.put("tip", new CalloutStyle("tip", "💡", "green_background"));
        styles.put("success", new CalloutStyle("success", "✅", "green_background"));
        styles.put("warning", new CalloutStyle("warning", "⚠️", "yellow_background"));
        styles.put("caution", new CalloutStyle("caution", "⚠️", "yellow_background"));
        styles.put("danger", new CalloutStyle("danger", "❗", "red_background"));
        styles.put("error", new CalloutStyle("error", "❗", "red_background"));
        styles.put("note", new CalloutStyle("note", "📝", "gray_background"));
        styles.put("quote", new CalloutStyle("quote", "💬", "gray_background"));
        return Map.copyOf(styles);
    }

    public record EncodeResult(List<Map<String, Object>> blocks, String markdownCache, String contentHash) {
    }

    public record DecodeResult(String markdownCache, boolean unsupportedBlock, String contentHash) {
    }

    private record CalloutStyle(String type, String emoji, String color) {
    }
}
