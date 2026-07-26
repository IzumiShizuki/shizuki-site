package io.github.shizuki.site.content.support;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.shizuki.site.content.support.NotionBlockCodec.DecodeResult;
import io.github.shizuki.site.content.support.NotionBlockCodec.EncodeResult;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;

class NotionBlockCodecTest {

    private final NotionBlockCodec codec = new NotionBlockCodec(new ObjectMapper());

    @SuppressWarnings("unchecked")
    private static Map<String, Object> payload(Map<String, Object> block) {
        return (Map<String, Object>) block.get(block.get("type"));
    }

    private static Map<String, Object> findBlock(List<Map<String, Object>> blocks, String type) {
        return blocks.stream()
            .filter(block -> type.equals(block.get("type")))
            .findFirst()
            .orElse(null);
    }

    @Test
    void shouldRoundTripBasicBlocks() {
        String markdown = """
            # 标题

            正文段落

            - 列表项
            - [x] 已完成任务

            > 引用内容

            ---""";

        EncodeResult encoded = codec.encodeMarkdown(markdown);
        DecodeResult decoded = codec.decodeBlocks(encoded.blocks());

        assertEquals(markdown, decoded.markdownCache());
        assertFalse(decoded.unsupportedBlock());
    }

    @Test
    void shouldEncodeCalloutContainerAsNotionCallout() {
        String markdown = """
            :::warning 部署须知
            先备份数据库。

            - [ ] 备份完成
            :::""";

        EncodeResult encoded = codec.encodeMarkdown(markdown);
        Map<String, Object> callout = findBlock(encoded.blocks(), "callout");

        assertNotNull(callout);
        Map<String, Object> calloutPayload = payload(callout);
        assertEquals("yellow_background", calloutPayload.get("color"));
        assertEquals(Map.of("type", "emoji", "emoji", "⚠️"), calloutPayload.get("icon"));

        @SuppressWarnings("unchecked")
        List<Map<String, Object>> children = (List<Map<String, Object>>) calloutPayload.get("children");
        assertNotNull(children);
        assertEquals("paragraph", children.get(0).get("type"));
        assertNotNull(findBlock(children, "to_do"));
    }

    @Test
    void shouldEncodeDetailsContainerAsNotionToggle() {
        String markdown = """
            :::details 展开查看日志
            ```js
            console.log(1)
            ```
            :::""";

        EncodeResult encoded = codec.encodeMarkdown(markdown);
        Map<String, Object> toggle = findBlock(encoded.blocks(), "toggle");

        assertNotNull(toggle);
        @SuppressWarnings("unchecked")
        List<Map<String, Object>> children = (List<Map<String, Object>>) payload(toggle).get("children");
        assertNotNull(children);
        Map<String, Object> code = findBlock(children, "code");
        assertNotNull(code);
        assertEquals("js", payload(code).get("language"));
    }

    @Test
    void shouldRoundTripCalloutAndToggleContainers() {
        String markdown = """
            :::info 提示
            提示内容

            - 第一步
            :::

            :::details 展开查看
            折叠内容
            :::""";

        EncodeResult encoded = codec.encodeMarkdown(markdown);
        DecodeResult decoded = codec.decodeBlocks(encoded.blocks());

        assertEquals(markdown, decoded.markdownCache());
        assertFalse(decoded.unsupportedBlock());
    }

    @Test
    void shouldEncodeBareUrlsAsMediaBlocks() {
        String markdown = """
            https://www.youtube.com/watch?v=dQw4w9WgXcQ

            https://www.bilibili.com/video/BV1xx411c7mD?p=2

            https://example.com/some/page""";

        EncodeResult encoded = codec.encodeMarkdown(markdown);

        Map<String, Object> video = findBlock(encoded.blocks(), "video");
        assertNotNull(video);
        assertEquals("external", payload(video).get("type"));

        Map<String, Object> embed = findBlock(encoded.blocks(), "embed");
        assertNotNull(embed);
        assertEquals("https://www.bilibili.com/video/BV1xx411c7mD?p=2", payload(embed).get("url"));

        Map<String, Object> bookmark = findBlock(encoded.blocks(), "bookmark");
        assertNotNull(bookmark);
        assertEquals("https://example.com/some/page", payload(bookmark).get("url"));

        DecodeResult decoded = codec.decodeBlocks(encoded.blocks());
        assertEquals(markdown, decoded.markdownCache());
        assertFalse(decoded.unsupportedBlock());
    }

    @Test
    void shouldRoundTripImageLines() {
        String markdown = "![架构图](https://cdn.example.com/arch.png)";

        EncodeResult encoded = codec.encodeMarkdown(markdown);
        Map<String, Object> image = findBlock(encoded.blocks(), "image");
        assertNotNull(image);

        DecodeResult decoded = codec.decodeBlocks(encoded.blocks());
        assertEquals(markdown, decoded.markdownCache());
        assertFalse(decoded.unsupportedBlock());
    }

    @Test
    void shouldRoundTripWhiteboardFenceThroughTaggedCodeBlock() {
        String whiteboardJson = "{\"version\":1,\"title\":\"架构白板\",\"encoding\":\"deflate-raw+base64\",\"chunks\":[\"AAAA\",\"BBBB\"]}";
        String markdown = "```whiteboard\n" + whiteboardJson + "\n```";

        EncodeResult encoded = codec.encodeMarkdown(markdown);
        Map<String, Object> code = findBlock(encoded.blocks(), "code");
        assertNotNull(code);
        assertEquals("json", payload(code).get("language"));
        assertTrue(String.valueOf(payload(code).get("caption")).contains("shizuki:whiteboard"));

        DecodeResult decoded = codec.decodeBlocks(encoded.blocks());
        assertEquals(markdown, decoded.markdownCache());
        assertFalse(decoded.unsupportedBlock());
    }

    @Test
    void shouldDecodeNotionAuthoredBlocksIntoContainerMarkdown() {
        List<Map<String, Object>> blocks = List.of(
            Map.of(
                "object", "block",
                "type", "callout",
                "callout", Map.of(
                    "rich_text", List.of(Map.of("plain_text", "注意事项")),
                    "color", "blue_background",
                    "icon", Map.of("type", "emoji", "emoji", "ℹ️"),
                    "children", List.of(Map.of(
                        "object", "block",
                        "type", "paragraph",
                        "paragraph", Map.of("rich_text", List.of(Map.of("plain_text", "内部说明")))
                    ))
                )
            ),
            Map.of(
                "object", "block",
                "type", "toggle",
                "toggle", Map.of(
                    "rich_text", List.of(Map.of("plain_text", "更多细节")),
                    "children", List.of(Map.of(
                        "object", "block",
                        "type", "paragraph",
                        "paragraph", Map.of("rich_text", List.of(Map.of("plain_text", "折叠正文")))
                    ))
                )
            ),
            Map.of(
                "object", "block",
                "type", "video",
                "video", Map.of("type", "external", "external", Map.of("url", "https://youtu.be/dQw4w9WgXcQ"))
            ),
            Map.of(
                "object", "block",
                "type", "bookmark",
                "bookmark", Map.of("url", "https://example.com")
            )
        );

        DecodeResult decoded = codec.decodeBlocks(blocks);

        assertFalse(decoded.unsupportedBlock());
        assertTrue(decoded.markdownCache().contains(":::info 注意事项"));
        assertTrue(decoded.markdownCache().contains("内部说明"));
        assertTrue(decoded.markdownCache().contains(":::details 更多细节"));
        assertTrue(decoded.markdownCache().contains("https://youtu.be/dQw4w9WgXcQ"));
        assertTrue(decoded.markdownCache().contains("https://example.com"));
    }

    @Test
    void shouldChunkLongRichTextUnderNotionLimit() {
        String longLine = "x".repeat(5000);
        String markdown = "```text\n" + longLine + "\n```";

        EncodeResult encoded = codec.encodeMarkdown(markdown);
        Map<String, Object> code = findBlock(encoded.blocks(), "code");
        assertNotNull(code);

        @SuppressWarnings("unchecked")
        List<Map<String, Object>> richText = (List<Map<String, Object>>) payload(code).get("rich_text");
        assertTrue(richText.size() >= 3);
        for (Map<String, Object> part : richText) {
            @SuppressWarnings("unchecked")
            Map<String, Object> text = (Map<String, Object>) part.get("text");
            assertTrue(String.valueOf(text.get("content")).length() <= 2000);
        }

        DecodeResult decoded = codec.decodeBlocks(encoded.blocks());
        assertEquals(markdown, decoded.markdownCache());
    }

    @Test
    void shouldStillFlagTrulyUnsupportedBlocks() {
        List<Map<String, Object>> blocks = List.of(
            Map.of(
                "object", "block",
                "type", "synced_block",
                "synced_block", Map.of()
            ),
            Map.of(
                "object", "block",
                "type", "image",
                "image", Map.of("type", "file", "file", Map.of("url", "https://s3.example.com/expiring.png"))
            )
        );

        DecodeResult decoded = codec.decodeBlocks(blocks);

        assertTrue(decoded.unsupportedBlock());
        assertTrue(decoded.markdownCache().contains("[Unsupported Notion block: synced_block]"));
        assertTrue(decoded.markdownCache().contains("[Unsupported Notion block: image]"));
    }

    @Test
    void shouldKeepInlineUrlsAsParagraphs() {
        String markdown = "前往 https://example.com 查看详情";

        EncodeResult encoded = codec.encodeMarkdown(markdown);

        assertEquals(1, encoded.blocks().size());
        assertEquals("paragraph", encoded.blocks().get(0).get("type"));
    }
}
