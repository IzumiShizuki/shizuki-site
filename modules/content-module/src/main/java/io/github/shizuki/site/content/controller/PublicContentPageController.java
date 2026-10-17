package io.github.shizuki.site.content.controller;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.site.content.service.discovery.PublicContentDiscoveryService;
import io.github.shizuki.site.content.service.discovery.PublicContentPage;
import io.github.shizuki.site.content.service.discovery.PublicDiscoveryLink;
import io.github.shizuki.site.content.support.PublicContentHtmlRenderer;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

@RestController
public class PublicContentPageController {

    private static final Logger LOGGER = LoggerFactory.getLogger(PublicContentPageController.class);
    private static final String CSP = "default-src 'none'; img-src https: http:; style-src 'unsafe-inline'; "
        + "base-uri 'none'; form-action 'none'; frame-ancestors 'none'";
    private final PublicContentDiscoveryService discovery;
    private final PublicContentHtmlRenderer renderer;

    public PublicContentPageController(PublicContentDiscoveryService discovery, PublicContentHtmlRenderer renderer) {
        this.discovery = discovery;
        this.renderer = renderer;
    }

    @GetMapping(value = {"/read", "/read/"}, produces = MediaType.TEXT_HTML_VALUE)
    public ResponseEntity<String> index() {
        return response(renderer.index(discovery.catalog()), MediaType.TEXT_HTML, false, HttpStatus.OK);
    }

    @GetMapping(value = "/read/posts/{id}", produces = MediaType.TEXT_HTML_VALUE)
    public ResponseEntity<String> post(@PathVariable("id") Long id) {
        return page(discovery.post(id));
    }

    @GetMapping(value = "/read/albums/{slug}", produces = MediaType.TEXT_HTML_VALUE)
    public ResponseEntity<String> album(@PathVariable("slug") String slug) {
        return page(discovery.album(slug));
    }

    @GetMapping(value = "/read/moments/{id}", produces = MediaType.TEXT_HTML_VALUE)
    public ResponseEntity<String> moment(@PathVariable("id") String id) {
        return page(discovery.moment(id));
    }

    @GetMapping(value = "/sitemap.xml", produces = MediaType.APPLICATION_XML_VALUE)
    public ResponseEntity<String> sitemap(@RequestParam(name = "page", required = false) Integer page) {
        List<PublicDiscoveryLink> links = new ArrayList<>();
        links.add(new PublicDiscoveryLink("/read/", "公开内容", null));
        links.addAll(discovery.catalog());
        return response(renderer.sitemap(links, page), MediaType.APPLICATION_XML, false, HttpStatus.OK);
    }

    @GetMapping(value = "/robots.txt", produces = MediaType.TEXT_PLAIN_VALUE)
    public ResponseEntity<String> robots() {
        return response(renderer.robots(), MediaType.TEXT_PLAIN, false, HttpStatus.OK);
    }

    @ExceptionHandler({BusinessException.class, IllegalArgumentException.class, MethodArgumentTypeMismatchException.class})
    public ResponseEntity<String> unavailable(RuntimeException exception) {
        HttpStatus status = HttpStatus.NOT_FOUND;
        if (exception instanceof BusinessException business) {
            status = switch (business.getErrorCode()) {
                case BAD_REQUEST, INVALID_CURSOR -> HttpStatus.BAD_REQUEST;
                case UPSTREAM_UNAVAILABLE, INTERNAL_ERROR -> HttpStatus.SERVICE_UNAVAILABLE;
                default -> HttpStatus.NOT_FOUND;
            };
        } else {
            status = HttpStatus.BAD_REQUEST;
        }
        return error(status);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> failed(Exception exception) {
        LOGGER.error("Public reader request failed", exception);
        return error(HttpStatus.SERVICE_UNAVAILABLE);
    }

    private ResponseEntity<String> error(HttpStatus status) {
        String message = status.is5xxServerError() ? "内容暂时无法读取，请稍后重试。" : "此内容不存在，或尚未公开。";
        String html = renderer.page(new PublicContentPage("内容暂不可用", message, null, "/blog", null, null,
            null, "<p>" + message + "</p>", true));
        return response(html, MediaType.TEXT_HTML, true, status);
    }

    private ResponseEntity<String> page(PublicContentPage page) {
        return response(renderer.page(page), MediaType.TEXT_HTML, page.noIndex(), HttpStatus.OK);
    }

    private ResponseEntity<String> response(String body, MediaType type, boolean noIndex, HttpStatus status) {
        var builder = ResponseEntity.status(status)
            .contentType(new MediaType(type, java.nio.charset.StandardCharsets.UTF_8))
            .header(HttpHeaders.CACHE_CONTROL, noIndex ? "private, no-store, max-age=0" : "public, max-age=0, must-revalidate")
            .header("X-Content-Type-Options", "nosniff")
            .header("Referrer-Policy", "no-referrer")
            .header("Content-Security-Policy", CSP);
        if (noIndex) builder.header("X-Robots-Tag", "noindex, nofollow, noarchive").header(HttpHeaders.PRAGMA, "no-cache");
        return builder.body(body);
    }
}
