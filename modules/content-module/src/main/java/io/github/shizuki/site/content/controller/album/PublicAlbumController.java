package io.github.shizuki.site.content.controller.album;

import io.github.shizuki.common.core.response.ApiResponse;
import io.github.shizuki.site.common.response.CursorPageResponse;
import io.github.shizuki.site.content.service.album.PublicAlbumQueryService;
import io.github.shizuki.site.life.model.LifeContentVisibilityEnum;
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
@RequestMapping("/api/v1/albums")
public class PublicAlbumController {

    private static final CacheControl PUBLIC_CACHE = CacheControl.maxAge(Duration.ofSeconds(45))
        .cachePublic();

    private final PublicAlbumQueryService queryService;

    public PublicAlbumController(PublicAlbumQueryService queryService) {
        this.queryService = queryService;
    }

    @GetMapping
    public ResponseEntity<ApiResponse<CursorPageResponse<PublicAlbumSummaryResponse>>> list(
        @RequestParam(name = "cursor", required = false) String cursor,
        @RequestParam(name = "limit", required = false) Integer limit
    ) {
        return ResponseEntity.ok()
            .cacheControl(PUBLIC_CACHE)
            .body(ApiResponse.success(queryService.list(cursor, limit)));
    }

    @GetMapping("/featured")
    public ResponseEntity<ApiResponse<List<PublicAlbumSummaryResponse>>> featured(
        @RequestParam(name = "limit", required = false) Integer limit
    ) {
        return ResponseEntity.ok()
            .cacheControl(PUBLIC_CACHE)
            .body(ApiResponse.success(queryService.featured(limit)));
    }

    @GetMapping("/{public_slug}")
    public ResponseEntity<ApiResponse<PublicAlbumDetailResponse>> detail(
        @PathVariable("public_slug") String publicSlug
    ) {
        PublicAlbumDetailResponse detail = queryService.detail(publicSlug);
        if (detail.visibility() == LifeContentVisibilityEnum.UNLISTED) {
            return ResponseEntity.ok()
                .header(HttpHeaders.CACHE_CONTROL, "private, no-store, max-age=0")
                .header(HttpHeaders.PRAGMA, "no-cache")
                .header("X-Robots-Tag", "noindex, nofollow, noarchive")
                .body(ApiResponse.success(detail));
        }
        return ResponseEntity.ok()
            .cacheControl(PUBLIC_CACHE)
            .body(ApiResponse.success(detail));
    }
}
