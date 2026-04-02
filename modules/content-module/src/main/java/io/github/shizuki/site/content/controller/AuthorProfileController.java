package io.github.shizuki.site.content.controller;

import io.github.shizuki.common.core.response.ApiResponse;
import io.github.shizuki.site.content.response.AuthorProfileResponse;
import io.github.shizuki.site.content.service.ContentService;
import io.github.shizuki.site.content.support.AuthorProfileHttpCacheSupport;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import java.time.Duration;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.CacheControl;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/author/profile")
@Tag(name = "Author Profile", description = "作者主页公开资料接口")
public class AuthorProfileController {

    private final ContentService contentService;

    @Value("${shizuki.content.author-profile.cache.public-max-age-seconds:60}")
    private long publicMaxAgeSeconds;

    @Value("${shizuki.content.author-profile.cache.stale-while-revalidate-seconds:300}")
    private long staleWhileRevalidateSeconds;

    public AuthorProfileController(ContentService contentService) {
        this.contentService = contentService;
    }

    @GetMapping
    @Operation(summary = "获取作者主页资料", description = "返回作者主页展示所需资料")
    public ResponseEntity<ApiResponse<AuthorProfileResponse>> getProfile(
        @RequestHeader(value = HttpHeaders.IF_NONE_MATCH, required = false) String ifNoneMatch
    ) {
        AuthorProfileResponse response = contentService.getAuthorProfile();
        String etag = AuthorProfileHttpCacheSupport.buildWeakEtag(response);
        long fallbackEpochMillis = System.currentTimeMillis();
        long lastModifiedEpochMillis = AuthorProfileHttpCacheSupport.resolveLastModifiedEpochMillis(response, fallbackEpochMillis);
        CacheControl cacheControl = CacheControl.maxAge(Duration.ofSeconds(Math.max(1L, publicMaxAgeSeconds)))
            .cachePublic()
            .staleWhileRevalidate(Duration.ofSeconds(Math.max(0L, staleWhileRevalidateSeconds)));

        if (AuthorProfileHttpCacheSupport.matchesIfNoneMatch(ifNoneMatch, etag)) {
            return ResponseEntity.status(HttpStatus.NOT_MODIFIED)
                .cacheControl(cacheControl)
                .eTag(etag)
                .lastModified(lastModifiedEpochMillis)
                .build();
        }

        return ResponseEntity.ok()
            .cacheControl(cacheControl)
            .eTag(etag)
            .lastModified(lastModifiedEpochMillis)
            .body(ApiResponse.success(response));
    }
}
