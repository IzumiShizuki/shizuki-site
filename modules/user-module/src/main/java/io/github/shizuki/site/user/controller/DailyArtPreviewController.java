package io.github.shizuki.site.user.controller;

import io.github.shizuki.common.ratelimit.annotation.RateLimit;
import io.github.shizuki.site.user.service.PixivClient;
import org.springframework.http.CacheControl;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.time.Duration;

@RestController
public class DailyArtPreviewController {
    private final PixivClient pixiv;
    public DailyArtPreviewController(PixivClient pixiv) { this.pixiv = pixiv; }

    @GetMapping("/api/v1/daily-art/pixiv/artworks/{artwork_id}/preview")
    @RateLimit(key = "daily-art.preview", limit = 120, windowSeconds = 60)
    public ResponseEntity<byte[]> preview(@PathVariable("artwork_id") String artworkId) {
        PixivClient.Preview preview = pixiv.preview(artworkId);
        return ResponseEntity.ok().contentType(MediaType.parseMediaType(preview.contentType()))
                // Spring MVC evaluates If-None-Match only after the freshly verified preview is returned.
                .eTag(DigestUtils.md5DigestAsHex(preview.bytes()))
                .cacheControl(CacheControl.maxAge(Duration.ofMinutes(30)).cachePublic())
                .header("X-Content-Type-Options", "nosniff").body(preview.bytes());
    }
}
