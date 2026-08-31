package io.github.shizuki.site.media.service.impl;

import io.github.shizuki.site.media.config.WallpaperDiscoveryProperties;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.net.InetSocketAddress;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;

class WallpaperOutboundClientTest {

    @Test
    @SuppressWarnings("unchecked")
    void sendsWallpaperRequestsThroughTheClientConfiguredForAuthenticatedProxy() throws Exception {
        WallpaperDiscoveryProperties properties = new WallpaperDiscoveryProperties();
        properties.setProxyUrl("http://wallpaper:secret@127.0.0.1:7890");
        HttpClient rawClient = Mockito.mock(HttpClient.class);
        HttpResponse<String> recordedResponse = Mockito.mock(HttpResponse.class);
        Mockito.when(recordedResponse.statusCode()).thenReturn(200);
        Mockito.when(recordedResponse.body()).thenReturn("proxied");
        Mockito.doReturn(recordedResponse).when(rawClient).send(any(), any());
        WallpaperOutboundClient client = new WallpaperOutboundClient(properties, rawClient);
        HttpRequest request = client.request("http://upstream.invalid/workshop").GET().build();

        HttpResponse<String> response = client.send(
                request, HttpResponse.BodyHandlers.ofString(StandardCharsets.UTF_8));

        assertEquals(200, response.statusCode());
        assertEquals("proxied", response.body());
        assertEquals(InetSocketAddress.createUnresolved("127.0.0.1", 7890), client.proxyAddress());
        assertTrue(client.hasProxyAuthentication());
        verify(rawClient).send(any(), any());
    }
}
