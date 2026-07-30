package io.github.shizuki.site.media.service.impl;

import org.junit.jupiter.api.Test;

import java.net.InetSocketAddress;

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
}
