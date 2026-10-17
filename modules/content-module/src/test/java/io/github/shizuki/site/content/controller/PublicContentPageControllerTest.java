package io.github.shizuki.site.content.controller;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.site.content.config.PublicSiteProperties;
import io.github.shizuki.site.content.service.discovery.PublicContentDiscoveryService;
import io.github.shizuki.site.content.service.discovery.PublicContentPage;
import io.github.shizuki.site.content.service.discovery.PublicDiscoveryLink;
import io.github.shizuki.site.content.support.PublicContentHtmlRenderer;
import io.github.shizuki.site.content.support.PublicMarkdown;
import java.util.List;
import java.util.stream.IntStream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@ExtendWith(MockitoExtension.class)
class PublicContentPageControllerTest {

    @Mock private PublicContentDiscoveryService discovery;
    private PublicContentHtmlRenderer renderer;
    private MockMvc mvc;

    @BeforeEach
    void setup() {
        PublicSiteProperties site = new PublicSiteProperties();
        site.setPublicSiteUrl("https://site.example");
        renderer = new PublicContentHtmlRenderer(site, new ObjectMapper());
        mvc = MockMvcBuilders.standaloneSetup(new PublicContentPageController(discovery, renderer)).build();
    }

    @Test
    void returnsReadableInitialHtmlAndCanonicalMetadataWithoutTrustingHost() throws Exception {
        when(discovery.post(12L)).thenReturn(new PublicContentPage("摄影记录", "一段文章简介", "/read/posts/12", "/blog/12",
            "/images/cover.jpg", "2026-10-17T08:00:00+08:00", "BlogPosting", PublicMarkdown.html("## 星空\n\n正文里的星轨。"), false));

        var response = mvc.perform(get("/read/posts/12").header("Host", "attacker.example"))
            .andExpect(status().isOk()).andReturn().getResponse();
        assertThat(response.getContentAsString()).contains("<h1>摄影记录</h1>", "正文里的星轨。", "og:title", "twitter:card",
            "https://site.example/read/posts/12", "https://site.example/#/blog/12", "application/ld+json").doesNotContain("attacker.example");
        assertThat(response.getContentType()).contains("text/html", "UTF-8");
        assertThat(response.getHeader("X-Robots-Tag")).isNull();
    }

    @Test
    void escapesMarkupUrlsAndJsonScriptTerminators() {
        String hostile = "</script><img src=x onerror=alert(1)>";
        String html = renderer.page(new PublicContentPage(hostile, hostile, "/read/posts/1", "/blog/1",
            "javascript:alert(1)", null, "BlogPosting", PublicMarkdown.html("<script>alert('x')</script>\n\n[x](javascript:alert(1))"), false));

        assertThat(html).doesNotContain("<img src=x", "href=\"javascript:", "src=\"javascript:", "<script>alert")
            .contains("\\u003c/script\\u003e", "&lt;script&gt;", "/images/boot-bg-dark.webp");
    }

    @Test
    void missingAndPrivatePagesReturnNoindexAndNoSensitiveDetails() throws Exception {
        when(discovery.post(99L)).thenThrow(new BusinessException(ErrorCode.NOT_FOUND, "private title and secrets"));
        var response = mvc.perform(get("/read/posts/99")).andExpect(status().isNotFound()).andReturn().getResponse();
        assertThat(response.getHeader("X-Robots-Tag")).contains("noindex");
        assertThat(response.getHeader("Cache-Control")).contains("no-store");
        assertThat(response.getContentAsString()).doesNotContain("private title", "secrets").contains("内容暂不可用");
    }

    @Test
    void linkOnlyReaderPreservesNoindexAndPrivateNoStore() throws Exception {
        when(discovery.album("a_link")).thenReturn(new PublicContentPage("链接相册", "说明", "/read/albums/a_link",
            "/albums/a_link", null, null, "ImageGallery", "<p>站内查看照片</p>", true));
        var response = mvc.perform(get("/read/albums/a_link")).andExpect(status().isOk()).andReturn().getResponse();
        assertThat(response.getHeader("X-Robots-Tag")).contains("noindex");
        assertThat(response.getHeader("Cache-Control")).isEqualTo("private, no-store, max-age=0");
    }

    @Test
    void servesSitemapAndRobotsWithTheConfiguredOrigin() throws Exception {
        when(discovery.catalog()).thenReturn(List.of(new PublicDiscoveryLink("/read/posts/12", "文章", "2026-10-17T00:00:00Z")));
        var xml = mvc.perform(get("/sitemap.xml")).andExpect(status().isOk()).andReturn().getResponse();
        assertThat(xml.getContentAsString()).contains("https://site.example/read/", "https://site.example/read/posts/12", "<lastmod>");
        assertThat(xml.getContentType()).contains("application/xml");
        var robots = mvc.perform(get("/robots.txt")).andExpect(status().isOk()).andReturn().getResponse();
        assertThat(robots.getContentAsString()).contains("Disallow: /api/", "Sitemap: https://site.example/sitemap.xml");
    }

    @Test
    void malformedIdentifiersReturnBadRequestAndNoindex() throws Exception {
        var response = mvc.perform(get("/read/posts/not-a-number"))
            .andExpect(status().isBadRequest()).andReturn().getResponse();
        assertThat(response.getHeader("X-Robots-Tag")).contains("noindex");
    }

    @Test
    void robotsAllowsOnlyQueryFreeViewingVariantsInsideTheApi() throws Exception {
        String robots = mvc.perform(get("/robots.txt")).andExpect(status().isOk()).andReturn().getResponse().getContentAsString();
        assertThat(robots.lines().filter(line -> line.startsWith("Allow:")).toList()).containsExactly(
            "Allow: /read/",
            "Allow: /api/v1/media/med_*/variants/DISPLAY_WEBP$",
            "Allow: /api/v1/media/med_*/variants/DISPLAY_AVIF$",
            "Allow: /api/v1/media/med_*/variants/THUMB_WEBP$");
        assertThat(robots).contains("Disallow: /api/", "Disallow: /actuator/")
            .doesNotContain("FULL_SANITIZED", "Allow: /api/\n");
    }

    @Test
    void splitsLargeSitemapsWithoutDroppingRecords() {
        var entries = IntStream.rangeClosed(1, 50_001)
            .mapToObj(i -> new PublicDiscoveryLink("/read/posts/" + i, "文章", null)).toList();
        assertThat(renderer.sitemap(entries, null)).contains("<sitemapindex", "sitemap.xml?page=1", "sitemap.xml?page=2");
        assertThat(renderer.sitemap(entries, 1)).contains("/read/posts/50000</loc>").doesNotContain("/read/posts/50001</loc>");
        assertThat(renderer.sitemap(entries, 2)).contains("/read/posts/50001</loc>").doesNotContain("/read/posts/50000</loc>");
    }
}
