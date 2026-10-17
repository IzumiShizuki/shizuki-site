package io.github.shizuki.site.content.service.discovery;

public record PublicContentPage(String title, String description, String path, String appPath,
                                String image, String publishedAt, String schemaType,
                                String bodyHtml, boolean noIndex) {
}
