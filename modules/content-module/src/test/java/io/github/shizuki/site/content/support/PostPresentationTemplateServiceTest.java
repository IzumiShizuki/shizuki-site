package io.github.shizuki.site.content.support;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import io.github.shizuki.site.content.entity.PostEntity;
import java.time.LocalDateTime;
import org.junit.jupiter.api.Test;

class PostPresentationTemplateServiceTest {

    private final PostPresentationTemplateService service = new PostPresentationTemplateService();

    @Test
    void shouldBuildDeckWithCoverIntroAndSectionSlides() {
        PostEntity post = new PostEntity();
        post.setId(12L);
        post.setUserId(7L);
        post.setTitle("演示测试");
        post.setSummary("这是摘要");
        post.setCategoryCode("dev");

        String markdown = """
            引言内容

            # 第一章

            章节概述

            ## 第二节

            - 要点一
            - 要点二
            """;

        PostPresentationTemplateService.PresentationDeck deck =
            service.build(post, markdown, LocalDateTime.of(2026, 3, 24, 10, 0));

        assertTrue(deck.slideCount() >= 4);
        assertTrue(deck.slidevMarkdown().contains("# 演示测试"));
        assertTrue(deck.slidevMarkdown().contains("`dev` · `2026-03-24`"));
        assertTrue(deck.slidevMarkdown().contains("layout: section"));
        assertTrue(deck.slidevMarkdown().contains("## 概览"));
    }

    @Test
    void shouldTruncateLongCodeFenceAndKeepHint() {
        PostEntity post = new PostEntity();
        post.setTitle("代码截断");
        post.setSummary("summary");
        post.setCategoryCode("game");

        StringBuilder markdown = new StringBuilder("# 代码\n\n```java\n");
        for (int index = 1; index <= 40; index += 1) {
            markdown.append("System.out.println(").append(index).append(");\n");
        }
        markdown.append("```\n");

        PostPresentationTemplateService.PresentationDeck deck =
            service.build(post, markdown.toString(), null);

        assertTrue(deck.slidevMarkdown().contains("> 代码过长，已截断，请查看原文。"));
        assertTrue(deck.slidevMarkdown().contains("..."));
    }

    @Test
    void shouldUseFallbackWhenMarkdownIsEmpty() {
        PostEntity post = new PostEntity();
        post.setTitle("空正文");
        post.setSummary("暂无内容");
        post.setCategoryCode("life");

        PostPresentationTemplateService.PresentationDeck deck = service.build(post, "", null);

        assertEquals(1, deck.slideCount());
        assertTrue(deck.slidevMarkdown().contains("# 空正文"));
        assertTrue(deck.slidevMarkdown().contains("暂无内容"));
    }
}
