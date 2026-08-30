package io.github.shizuki.site.media.controller;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.common.ratelimit.annotation.RateLimit;
import io.github.shizuki.site.media.model.ImageVariantTypeEnum;
import io.github.shizuki.site.media.service.gateway.MediaGatewayService;
import io.github.shizuki.site.media.service.gateway.MediaGatewayStream;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import java.io.InputStream;
import java.io.IOException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.StreamingResponseBody;

/**
 * 站内 opaque 媒体交付入口。禁止用重定向或 JSON 暴露上游对象存储地址。
 */
@RestController
@RequestMapping("/api/v1/media")
@Tag(name = "Media Gateway", description = "站内照片派生授权与流式交付")
public class MediaGatewayController {

    public static final String CAPABILITY_HEADER = "X-Media-Capability";

    private final MediaGatewayService gatewayService;

    public MediaGatewayController(MediaGatewayService gatewayService) {
        this.gatewayService = gatewayService;
    }

    @GetMapping("/{media_ref}/variants/{variant}")
    @RateLimit(key = "media.gateway.variant", limit = 240, windowSeconds = 60)
    @Operation(summary = "读取站内照片派生", description = "逐次校验内容关联并由服务端流式代理对象存储")
    public ResponseEntity<StreamingResponseBody> readVariant(
        @PathVariable("media_ref") String mediaRef,
        @PathVariable("variant") String variantCode,
        @RequestHeader(value = CAPABILITY_HEADER, required = false) String capability
    ) {
        ImageVariantTypeEnum variant = parseVariant(variantCode);
        MediaGatewayStream media = gatewayService.open(mediaRef, variant, capability);
        StreamingResponseBody body = output -> {
            try (InputStream input = media.inputStream()) {
                input.transferTo(output);
            } catch (IOException | RuntimeException exception) {
                // 不把 OSS SDK 可能携带的 endpoint/object 信息传播到容器日志或客户端。
                throw new IOException("media gateway stream interrupted");
            }
        };
        return ResponseEntity.ok()
            .contentType(MediaType.parseMediaType(media.contentType()))
            .contentLength(media.contentLength())
            .header(HttpHeaders.CACHE_CONTROL, media.cacheControl())
            .header(HttpHeaders.ETAG, media.siteEtag())
            .header(HttpHeaders.VARY, CAPABILITY_HEADER + ", Authorization")
            .header(HttpHeaders.CONTENT_DISPOSITION, "inline")
            .header("X-Content-Type-Options", "nosniff")
            .header("Cross-Origin-Resource-Policy", "same-site")
            .header("Content-Security-Policy", "default-src 'none'; sandbox")
            .body(body);
    }

    private ImageVariantTypeEnum parseVariant(String raw) {
        try {
            return ImageVariantTypeEnum.fromJson(raw);
        } catch (RuntimeException exception) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "Media is unavailable");
        }
    }
}
