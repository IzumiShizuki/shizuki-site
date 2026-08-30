package io.github.shizuki.site.media.controller;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.common.core.response.ApiResponse;
import io.github.shizuki.common.ratelimit.annotation.RateLimit;
import io.github.shizuki.site.media.response.OriginalDownloadCapabilityResponse;
import io.github.shizuki.site.media.service.download.MediaOriginalDownloadService;
import io.github.shizuki.site.media.service.download.OriginalDownloadAuthorizationService;
import io.github.shizuki.site.media.service.gateway.MediaGatewayStream;
import java.io.IOException;
import java.io.InputStream;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.StreamingResponseBody;

/**
 * 原图下载使用先领短时 capability、再服务端流式下载的两步链路。
 */
@RestController
@RequestMapping("/api/v1/media")
public class MediaOriginalDownloadController {

    private final OriginalDownloadAuthorizationService authorizationService;
    private final MediaOriginalDownloadService downloadService;

    public MediaOriginalDownloadController(OriginalDownloadAuthorizationService authorizationService,
                                           MediaOriginalDownloadService downloadService) {
        this.authorizationService = authorizationService;
        this.downloadService = downloadService;
    }

    @PostMapping("/{media_ref}/original-download-capabilities")
    @RateLimit(key = "media.original.capability", limit = 20, windowSeconds = 60)
    public ResponseEntity<ApiResponse<OriginalDownloadCapabilityResponse>> issueCapability(
        @PathVariable("media_ref") String mediaRef,
        @RequestHeader(value = MediaGatewayController.CAPABILITY_HEADER, required = false)
        String presentationCapability
    ) {
        OriginalDownloadCapabilityResponse capability = authorizationService
            .issue(mediaRef, presentationCapability)
            .orElseThrow(() -> new BusinessException(ErrorCode.NOT_FOUND, "Media is unavailable"));
        return ResponseEntity.ok()
            .header(HttpHeaders.CACHE_CONTROL, "private, no-store, max-age=0")
            .header(HttpHeaders.PRAGMA, "no-cache")
            .body(ApiResponse.success(capability));
    }

    @GetMapping("/{media_ref}/original")
    @RateLimit(key = "media.original.download", limit = 30, windowSeconds = 60)
    public ResponseEntity<StreamingResponseBody> download(
        @PathVariable("media_ref") String mediaRef,
        @RequestHeader(MediaGatewayController.CAPABILITY_HEADER) String capability
    ) {
        MediaGatewayStream media = downloadService.open(mediaRef, capability);
        StreamingResponseBody body = output -> {
            try (InputStream input = media.inputStream()) {
                input.transferTo(output);
            } catch (IOException | RuntimeException exception) {
                throw new IOException("original media stream interrupted");
            }
        };
        return ResponseEntity.ok()
            .contentType(MediaType.parseMediaType(media.contentType()))
            .contentLength(media.contentLength())
            .header(HttpHeaders.CACHE_CONTROL, media.cacheControl())
            .header(HttpHeaders.PRAGMA, "no-cache")
            .header(HttpHeaders.ETAG, media.siteEtag())
            .header(HttpHeaders.CONTENT_DISPOSITION, contentDisposition(media.contentType()))
            .header(HttpHeaders.VARY, MediaGatewayController.CAPABILITY_HEADER + ", Authorization")
            .header("X-Content-Type-Options", "nosniff")
            .header("Cross-Origin-Resource-Policy", "same-site")
            .header("Content-Security-Policy", "default-src 'none'; sandbox")
            .body(body);
    }

    private String contentDisposition(String contentType) {
        String extension = switch (contentType) {
            case "image/jpeg" -> "jpg";
            case "image/png" -> "png";
            case "image/webp" -> "webp";
            case "image/gif" -> "gif";
            case "image/apng" -> "apng";
            default -> "bin";
        };
        return "attachment; filename=\"photo-original." + extension + "\"";
    }
}
