package io.github.shizuki.site.content.support;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.shizuki.site.content.config.PublicSiteProperties;
import io.github.shizuki.site.content.service.discovery.PublicContentPage;
import io.github.shizuki.site.content.service.discovery.PublicDiscoveryLink;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;
import org.springframework.web.util.HtmlUtils;

/** Renders the same HTML for readers and crawlers; it never performs user-agent detection. */
@Component
public class PublicContentHtmlRenderer {

    public static final int SITEMAP_PAGE_SIZE = 50_000;
    private final PublicSiteProperties site;
    private final ObjectMapper mapper;
    private final String css;

    public PublicContentHtmlRenderer(PublicSiteProperties site, ObjectMapper mapper) {
        this.site = site;
        this.mapper = mapper;
        try (var input = new ClassPathResource("public-reader.css").getInputStream()) {
            css = new String(input.readAllBytes(), StandardCharsets.UTF_8);
        } catch (IOException exception) {
            throw new IllegalStateException("Public reader stylesheet is missing", exception);
        }
    }

    public String page(PublicContentPage page) {
        String canonical = page.path() == null ? null : site.url(page.path());
        String image = site.image(page.image());
        if (image == null) image = site.url("/images/boot-bg-dark.webp");
        StringBuilder html = new StringBuilder("<!doctype html><html lang=\"zh-CN\"><head><meta charset=\"utf-8\">")
            .append("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, viewport-fit=cover\">")
            .append("<meta name=\"color-scheme\" content=\"light dark\"><title>").append(escape(page.title()))
            .append(" · Shizuki</title>")
            .append(meta("name", "description", page.description()))
            .append(meta("name", "robots", page.noIndex() ? "noindex, nofollow, noarchive" : "index, follow"))
            .append(meta("property", "og:site_name", "Shizuki"))
            .append(meta("property", "og:locale", "zh_CN"))
            .append(meta("property", "og:type", "BlogPosting".equals(page.schemaType()) ? "article" : "website"))
            .append(meta("property", "og:title", page.title()))
            .append(meta("property", "og:description", page.description()))
            .append(meta("property", "og:image", image))
            .append(meta("property", "og:image:alt", page.title()))
            .append(meta("name", "twitter:card", "summary_large_image"))
            .append(meta("name", "twitter:title", page.title()))
            .append(meta("name", "twitter:description", page.description()))
            .append(meta("name", "twitter:image", image));
        if (canonical != null) {
            html.append("<link rel=\"canonical\" href=\"").append(escape(canonical)).append("\">")
                .append(meta("property", "og:url", canonical));
        }
        if (page.publishedAt() != null) html.append(meta("property", "article:published_time", page.publishedAt()));
        if (canonical != null && page.schemaType() != null) {
            Map<String, Object> structured = new LinkedHashMap<>();
            structured.put("@context", "https://schema.org");
            structured.put("@type", page.schemaType());
            structured.put("headline", page.title());
            structured.put("description", page.description());
            structured.put("url", canonical);
            structured.put("mainEntityOfPage", canonical);
            structured.put("image", image);
            structured.put("inLanguage", "zh-CN");
            if ("BlogPosting".equals(page.schemaType()) || "SocialMediaPosting".equals(page.schemaType())) {
                structured.put("author", Map.of("@type", "Person", "name", "Shizuki", "url", site.url("/#/author")));
            }
            if (page.publishedAt() != null) structured.put("datePublished", page.publishedAt());
            html.append("<script type=\"application/ld+json\">").append(json(structured)).append("</script>");
        }
        html.append("<style>").append(css).append("</style></head><body><a class=\"skip-link\" href=\"#content\">跳到正文</a>")
            .append("<header class=\"reader-top\"><a class=\"brand\" href=\"").append(escape(site.url("/read/")))
            .append("\">Shizuki<span>文字 · 影像 · 日常</span></a><a href=\"").append(escape(site.url("/#/blog")))
            .append("\">浏览站内内容 <span aria-hidden=\"true\">↗</span></a></header><main id=\"content\">")
            .append("<div class=\"article-heading\"><p class=\"reader-label\">Shizuki 的公开内容</p><h1>")
            .append(escape(page.title())).append("</h1>");
        if (page.publishedAt() != null) {
            html.append("<time datetime=\"").append(escape(page.publishedAt())).append("\">")
                .append(escape(page.publishedAt().substring(0, Math.min(10, page.publishedAt().length())))).append("</time>");
        }
        if (page.noIndex()) html.append("<p class=\"reader-note\">此内容仅通过链接访问。</p>");
        html.append("</div><article class=\"reader-body\">").append(page.bodyHtml()).append("</article>");
        if (page.appPath() != null) {
            html.append("<nav class=\"reader-actions\" aria-label=\"阅读操作\"><a class=\"primary-link\" href=\"")
                .append(escape(site.url("/#" + page.appPath()))).append("\">在站内继续浏览 <span aria-hidden=\"true\">↗</span></a>")
                .append("<a href=\"").append(escape(site.url("/read/"))).append("\">更多公开内容</a></nav>");
        }
        return html.append("</main><footer>Shizuki · 留下值得记录的片刻</footer></body></html>").toString();
    }

    public String index(List<PublicDiscoveryLink> links) {
        StringBuilder body = new StringBuilder("<p>最近公开的文字、相册与日常。也可以进入站内浏览音乐和更多内容。</p><ul class=\"content-index\">");
        for (PublicDiscoveryLink link : links) {
            body.append("<li><a href=\"").append(escape(site.url(link.path()))).append("\">").append(escape(link.title()))
                .append("</a>");
            if (link.publishedAt() != null) body.append("<time>").append(escape(link.publishedAt().substring(0, 10))).append("</time>");
            body.append("</li>");
        }
        if (links.isEmpty()) body.append("<li>新的内容正在整理中，可以先到站内看看。</li>");
        body.append("</ul>");
        return page(new PublicContentPage("公开内容", "Shizuki 的文章、相册与生活动态", "/read/", "/blog",
            null, null, "CollectionPage", body.toString(), false));
    }

    public String sitemap(List<PublicDiscoveryLink> links, Integer requestedPage) {
        int pages = Math.max(1, (links.size() + SITEMAP_PAGE_SIZE - 1) / SITEMAP_PAGE_SIZE);
        if (requestedPage == null && pages > 1) {
            StringBuilder xml = new StringBuilder("<?xml version=\"1.0\" encoding=\"UTF-8\"?><sitemapindex xmlns=\"http://www.sitemaps.org/schemas/sitemap/0.9\">");
            for (int page = 1; page <= pages; page++) {
                xml.append("<sitemap><loc>").append(escape(site.url("/sitemap.xml?page=" + page))).append("</loc></sitemap>");
            }
            return xml.append("</sitemapindex>").toString();
        }
        int page = requestedPage == null ? 1 : requestedPage;
        if (page < 1 || page > pages) throw new IllegalArgumentException("Invalid sitemap page");
        StringBuilder xml = new StringBuilder("<?xml version=\"1.0\" encoding=\"UTF-8\"?><urlset xmlns=\"http://www.sitemaps.org/schemas/sitemap/0.9\">");
        // The index is included in the catalog passed by the controller, so the 50,000 limit stays exact.
        for (PublicDiscoveryLink link : links.subList((page - 1) * SITEMAP_PAGE_SIZE, Math.min(page * SITEMAP_PAGE_SIZE, links.size()))) {
            xml.append("<url><loc>").append(escape(site.url(link.path()))).append("</loc>");
            if (link.publishedAt() != null) xml.append("<lastmod>").append(escape(link.publishedAt())).append("</lastmod>");
            xml.append("</url>");
        }
        return xml.append("</urlset>").toString();
    }

    public String robots() {
        return "User-agent: *\nAllow: /read/\nDisallow: /api/\nDisallow: /actuator/\nSitemap: " + site.url("/sitemap.xml") + "\n";
    }

    private String json(Map<String, Object> value) {
        try {
            return mapper.writeValueAsString(value).replace("<", "\\u003c").replace(">", "\\u003e")
                .replace("&", "\\u0026").replace("\u2028", "\\u2028").replace("\u2029", "\\u2029");
        } catch (JsonProcessingException exception) {
            throw new IllegalStateException("Cannot render public structured data", exception);
        }
    }

    private static String meta(String attribute, String name, String value) {
        return "<meta " + attribute + "=\"" + name + "\" content=\"" + escape(value) + "\">";
    }

    private static String escape(String value) {
        return HtmlUtils.htmlEscape(value == null ? "" : value, "UTF-8");
    }
}
