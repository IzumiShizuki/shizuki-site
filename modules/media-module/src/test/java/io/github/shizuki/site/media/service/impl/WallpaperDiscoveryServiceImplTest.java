package io.github.shizuki.site.media.service.impl;

import io.github.shizuki.common.core.error.BusinessException;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class WallpaperDiscoveryServiceImplTest {

    @Test
    void parsesAuthenticatedHttpProxy() {
        WallpaperDiscoveryServiceImpl.ProxyEndpoint proxy =
                WallpaperDiscoveryServiceImpl.parseProxyEndpoint("http://wallpaper%2Dproxy:pass%3Aword@host.docker.internal:7890");

        assertEquals(InetSocketAddress.createUnresolved("host.docker.internal", 7890), proxy.address());
        assertEquals("wallpaper-proxy", proxy.username());
        assertArrayEquals("pass:word".toCharArray(), proxy.password());
        assertTrue(proxy.hasCredentials());
    }

    @Test
    void parsesUnauthenticatedHttpProxyWithDefaultPort() {
        WallpaperDiscoveryServiceImpl.ProxyEndpoint proxy =
                WallpaperDiscoveryServiceImpl.parseProxyEndpoint("http://127.0.0.1");

        assertEquals(InetSocketAddress.createUnresolved("127.0.0.1", 80), proxy.address());
        assertFalse(proxy.hasCredentials());
    }

    @Test
    void leavesBlankProxyConfigurationDisabled() {
        assertNull(WallpaperDiscoveryServiceImpl.parseProxyEndpoint("  "));
    }

    @Test
    void rejectsUnsupportedOrIncompleteProxyUrls() {
        assertThrows(IllegalArgumentException.class,
                () -> WallpaperDiscoveryServiceImpl.parseProxyEndpoint("https://proxy.example.test:7890"));
        assertThrows(IllegalArgumentException.class,
                () -> WallpaperDiscoveryServiceImpl.parseProxyEndpoint("http://proxy.example.test:7890/path"));
        assertThrows(IllegalArgumentException.class,
                () -> WallpaperDiscoveryServiceImpl.parseProxyEndpoint("http://username@proxy.example.test:7890"));
    }

    @Test
    void resolvesPreviewContentTypeFromResponseOrImageUrl() {
        assertEquals("image/webp", WallpaperDiscoveryServiceImpl.resolvePreviewContentType(
                "image/webp; charset=binary", "https://cdn.example.test/preview"));
        assertEquals("image/jpeg", WallpaperDiscoveryServiceImpl.resolvePreviewContentType(
                "", "https://cdn.example.test/preview.jpg?size=large"));
        assertEquals("", WallpaperDiscoveryServiceImpl.resolvePreviewContentType(
                "text/html", "https://cdn.example.test/error"));
    }

    @Test
    void recognizesCommonImagePayloadsAndRejectsHtml() {
        assertTrue(WallpaperDiscoveryServiceImpl.isLikelyImagePayload(
                new byte[] {(byte) 0xff, (byte) 0xd8, (byte) 0xff, 0x00}));
        assertTrue(WallpaperDiscoveryServiceImpl.isLikelyImagePayload(
                "<svg viewBox='0 0 1 1'></svg>".getBytes(StandardCharsets.UTF_8)));
        assertFalse(WallpaperDiscoveryServiceImpl.isLikelyImagePayload(
                "<!doctype html><html>error</html>".getBytes(StandardCharsets.UTF_8)));
    }

    @Test
    void enforcesPreviewResponseByteLimit() {
        assertThrows(BusinessException.class, () -> WallpaperDiscoveryServiceImpl.readInputBytes(
                new ByteArrayInputStream(new byte[] {1, 2, 3}), 2));
    }

    @Test
    void normalizesAndEncodesSupportedWorkshopTags() {
        List<String> tags = WallpaperDiscoveryServiceImpl.normalizeWorkshopTags(
                "Scene,Anime,1920 x 1080,Unsupported,Anime");

        assertEquals(List.of("Scene", "Anime", "1920 x 1080"), tags);
        assertEquals(
                "&requiredtags%5B0%5D=Scene&requiredtags%5B1%5D=Anime&requiredtags%5B2%5D=1920+x+1080",
                WallpaperDiscoveryServiceImpl.buildWorkshopRequiredTagsQuery(tags, true));
        assertEquals(
                "&requiredtags%5B%5D=Scene&requiredtags%5B%5D=Anime&requiredtags%5B%5D=1920+x+1080",
                WallpaperDiscoveryServiceImpl.buildWorkshopRequiredTagsQuery(tags, false));
    }

    @Test
    void preservesGuestSketchyPurityButRemovesNsfw() {
        assertEquals("110", WallpaperDiscoveryServiceImpl.normalizeWallhavenPurity("110", false));
        assertEquals("110", WallpaperDiscoveryServiceImpl.normalizeWallhavenPurity("111", false));
        assertEquals("100", WallpaperDiscoveryServiceImpl.normalizeWallhavenPurity("001", false));
        assertEquals("111", WallpaperDiscoveryServiceImpl.normalizeWallhavenPurity("111", true));
    }

    @Test
    void normalizesWallhavenOrder() {
        assertEquals("asc", WallpaperDiscoveryServiceImpl.normalizeWallhavenOrder("asc"));
        assertEquals("desc", WallpaperDiscoveryServiceImpl.normalizeWallhavenOrder("unsupported"));
    }
}
