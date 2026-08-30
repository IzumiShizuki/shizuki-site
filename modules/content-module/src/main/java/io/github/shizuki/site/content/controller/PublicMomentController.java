package io.github.shizuki.site.content.controller;

import io.github.shizuki.common.core.response.ApiResponse;
import io.github.shizuki.site.common.response.CursorPageResponse;
import io.github.shizuki.site.content.response.PublicMomentDetailResponse;
import io.github.shizuki.site.content.response.PublicMomentResponse;
import io.github.shizuki.site.content.service.moment.PublicMomentQueryService;
import java.time.Duration;
import java.util.List;
import org.springframework.http.CacheControl;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/moments")
public class PublicMomentController {

    private static final CacheControl PUBLIC_CACHE = CacheControl.maxAge(Duration.ofSeconds(45))
        .cachePublic();

    private final PublicMomentQueryService queryService;

    public PublicMomentController(PublicMomentQueryService queryService) {
        this.queryService = queryService;
    }

    @GetMapping
    public ResponseEntity<ApiResponse<CursorPageResponse<PublicMomentResponse>>> feed(
        @RequestParam(name = "cursor", required = false) String cursor,
        @RequestParam(name = "limit", required = false) Integer limit
    ) {
        return ResponseEntity.ok()
            .cacheControl(PUBLIC_CACHE)
            .body(ApiResponse.success(queryService.feed(cursor, limit)));
    }

    @GetMapping("/featured")
    public ResponseEntity<ApiResponse<List<PublicMomentResponse>>> featured(
        @RequestParam(name = "limit", required = false) Integer limit
    ) {
        return ResponseEntity.ok()
            .cacheControl(PUBLIC_CACHE)
            .body(ApiResponse.success(queryService.featured(limit)));
    }

    @GetMapping("/{public_id}")
    public ResponseEntity<ApiResponse<PublicMomentDetailResponse>> detail(
        @PathVariable("public_id") String publicId
    ) {
        PublicMomentDetailResponse result = queryService.detail(publicId);
        if (result.unlisted()) {
            return ResponseEntity.ok()
                .header(HttpHeaders.CACHE_CONTROL, "private, no-store, max-age=0")
                .header(HttpHeaders.PRAGMA, "no-cache")
                .header("X-Robots-Tag", "noindex, nofollow, noarchive")
                .body(ApiResponse.success(result));
        }
        return ResponseEntity.ok()
            .cacheControl(PUBLIC_CACHE)
            .body(ApiResponse.success(result));
    }
}
