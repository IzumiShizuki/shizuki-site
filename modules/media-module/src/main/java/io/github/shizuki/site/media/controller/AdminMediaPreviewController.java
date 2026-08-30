package io.github.shizuki.site.media.controller;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.common.ratelimit.annotation.RateLimit;
import io.github.shizuki.common.security.annotation.RequireGroup;
import io.github.shizuki.common.security.annotation.RequirePermission;
import io.github.shizuki.site.content.annotation.RequirePersonalContentStudio;
import io.github.shizuki.site.media.model.ImageVariantTypeEnum;
import io.github.shizuki.site.media.service.gateway.AdminMediaPreviewService;
import io.github.shizuki.site.media.service.gateway.MediaGatewayStream;
import java.io.IOException;
import java.io.InputStream;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.StreamingResponseBody;

@RestController
@RequestMapping("/api/v1/admin/life/media-associations")
@RequirePersonalContentStudio
@RequireGroup("ADMIN")
@RequirePermission("life.content.manage")
public class AdminMediaPreviewController {

    private final AdminMediaPreviewService previewService;

    public AdminMediaPreviewController(AdminMediaPreviewService previewService) {
        this.previewService = previewService;
    }

    @GetMapping("/{media_ref}/preview/{variant}")
    @RateLimit(key = "admin.life.media.preview", limit = 240, windowSeconds = 60)
    public ResponseEntity<StreamingResponseBody> preview(
        @PathVariable("media_ref") String mediaRef,
        @PathVariable("variant") String variantCode
    ) {
        ImageVariantTypeEnum variant = parseVariant(variantCode);
        MediaGatewayStream media = previewService.open(mediaRef, variant);
        StreamingResponseBody body = output -> {
            try (InputStream input = media.inputStream()) {
                input.transferTo(output);
            } catch (IOException | RuntimeException exception) {
                throw new IOException("admin media preview stream interrupted");
            }
        };
        return ResponseEntity.ok()
            .contentType(MediaType.parseMediaType(media.contentType()))
            .contentLength(media.contentLength())
            .header(HttpHeaders.CACHE_CONTROL, "private, no-store, max-age=0")
            .header(HttpHeaders.PRAGMA, "no-cache")
            .header(HttpHeaders.ETAG, media.siteEtag())
            .header(HttpHeaders.VARY, HttpHeaders.AUTHORIZATION)
            .header(HttpHeaders.CONTENT_DISPOSITION, "inline")
            .header("X-Robots-Tag", "noindex, nofollow, noarchive")
            .header("X-Content-Type-Options", "nosniff")
            .header("Cross-Origin-Resource-Policy", "same-site")
            .header("Content-Security-Policy", "default-src 'none'; sandbox")
            .body(body);
    }

    private ImageVariantTypeEnum parseVariant(String value) {
        try {
            return ImageVariantTypeEnum.fromJson(value);
        } catch (RuntimeException exception) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "Album preview media is unavailable");
        }
    }
}
