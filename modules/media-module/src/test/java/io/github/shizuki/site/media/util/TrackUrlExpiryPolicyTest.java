package io.github.shizuki.site.media.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TrackUrlExpiryPolicyTest {

    @Test
    void shouldReturnFalseWhenNoExpiryFound() {
        boolean fallback = TrackUrlExpiryPolicy.shouldFallbackToOss(
            "https://cdn.example.com/audio/track.mp3",
            86_400L,
            1_700_000_000L
        );
        boolean expired = TrackUrlExpiryPolicy.isExpired(
            "https://cdn.example.com/audio/track.mp3",
            1_700_000_000L
        );

        Assertions.assertFalse(fallback);
        Assertions.assertFalse(expired);
    }

    @Test
    void shouldFallbackWhenExpiryInsideThreshold() {
        long now = 1_700_000_000L;
        long expiry = now + 3_600L;
        String url = "https://cdn.example.com/audio/track.mp3?expires=" + expiry;

        boolean fallback = TrackUrlExpiryPolicy.shouldFallbackToOss(url, 86_400L, now);

        Assertions.assertTrue(fallback);
    }

    @Test
    void shouldNotFallbackWhenExpiryOutsideThreshold() {
        long now = 1_700_000_000L;
        long expiry = now + 3 * 24 * 3_600L;
        String url = "https://cdn.example.com/audio/track.mp3?expires=" + expiry;

        boolean fallback = TrackUrlExpiryPolicy.shouldFallbackToOss(url, 86_400L, now);

        Assertions.assertFalse(fallback);
    }

    @Test
    void shouldResolveAwsSignatureExpiry() {
        String url = "https://bucket.oss-cn-hangzhou.aliyuncs.com/audio.mp3"
            + "?X-Amz-Date=20260302T000000Z"
            + "&X-Amz-Expires=3600";
        long now = 1_772_377_100L; // 2026-03-02 00:45:00 UTC

        boolean fallback = TrackUrlExpiryPolicy.shouldFallbackToOss(url, 86_400L, now);
        boolean expired = TrackUrlExpiryPolicy.isExpired(url, now);

        Assertions.assertTrue(fallback);
        Assertions.assertFalse(expired);
    }

    @Test
    void shouldReportExpiredWhenExpiryPast() {
        long now = 1_700_000_000L;
        String url = "https://cdn.example.com/audio/track.mp3?exp=" + (now - 10);

        boolean expired = TrackUrlExpiryPolicy.isExpired(url, now);

        Assertions.assertTrue(expired);
    }
}
