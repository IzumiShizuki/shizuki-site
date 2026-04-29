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

    private final ObjectMapper objectMapper;

    public NotionBlockCodec(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public EncodeResult encodeMarkdown(String markdown) {
        String safeMarkdown = normalizeMarkdown(markdown);
        List<Map<String, Object>> blocks = new ArrayList<>();
        String[] lines = safeMarkdown.split("\\R", -1);
        boolean inCode = false;
        String codeLanguage = "plain text";
        StringBuilder codeBuffer = new StringBuilder();
        for (String line : lines) {
            if (line.startsWith("```")) {
                if (inCode) {
                    blocks.add(block("code", Map.of(
                        "rich_text", richText(codeBuffer.toString().replaceFirst("\\n$", "")),
                        "language", codeLanguage
                    )));
                    codeBuffer.setLength(0);
                    inCode = false;
                    codeLanguage = "plain text";
                } else {
                    inCode = true;
                    String rawLanguage = line.substring(3).trim();
                    codeLanguage = StringUtils.hasText(rawLanguage) ? rawLanguage : "plain text";
                }
                continue;
            }
            if (inCode) {
                codeBuffer.append(line).append('\n');
                continue;
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

            blocks.add(block("paragraph", Map.of("rich_text", richText(line))));
        }
        if (inCode) {
            blocks.add(block("code", Map.of(
                "rich_text", richText(codeBuffer.toString().replaceFirst("\\n$", "")),
                "language", codeLanguage
            )));
        }
        return new EncodeResult(blocks, safeMarkdown, hashContent(safeMarkdown));
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
        boolean unsupported = false;
        for (Map<String, Object> block : blocks) {
            String type = asString(block.get("type"));
            Map<String, Object> payload = castMap(block.get(type));
            switch (type) {
                case "paragraph" -> lines.add(joinPlainText(payload.get("rich_text")));
                case "heading_1" -> lines.add("# " + joinPlainText(payload.get("rich_text")));
                case "heading_2" -> lines.add("## " + joinPlainText(payload.get("rich_text")));
                case "heading_3" -> lines.add("### " + joinPlainText(payload.get("rich_text")));
                case "bulleted_list_item" -> lines.add("- " + joinPlainText(payload.get("rich_text")));
                case "numbered_list_item" -> lines.add("1. " + joinPlainText(payload.get("rich_text")));
                case "quote" -> lines.add("> " + joinPlainText(payload.get("rich_text")));
                case "to_do" -> {
                    boolean checked = Boolean.TRUE.equals(payload.get("checked"));
                    lines.add("- [" + (checked ? "x" : " ") + "] " + joinPlainText(payload.get("rich_text")));
                }
                case "code" -> {
                    String language = asString(payload.get("language"));
                    lines.add("```" + (StringUtils.hasText(language) ? language : ""));
                    lines.add(joinPlainText(payload.get("rich_text")));
                    lines.add("```");
                }
                case "divider" -> lines.add("---");
                default -> {
                    unsupported = true;
                    lines.add("[Unsupported Notion block: " + type + "]");
                }
            }
        }
        String markdown = normalizeMarkdown(String.join("\n", lines));
        return new DecodeResult(markdown, unsupported, hashContent(markdown));
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
        return List.of(Map.of(
            "type", "text",
            "text", Map.of("content", safeContent)
        ));
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

    public record EncodeResult(List<Map<String, Object>> blocks, String markdownCache, String contentHash) {
    }

    public record DecodeResult(String markdownCache, boolean unsupportedBlock, String contentHash) {
    }
}
