package io.github.shizuki.site.media.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.shizuki.site.media.config.MediaStorageProperties;
import io.github.shizuki.site.media.config.WallpaperDiscoveryProperties;
import io.github.shizuki.site.media.config.WallpaperWorkshopProperties;
import io.github.shizuki.site.media.response.WorkshopSearchResponse;
import io.github.shizuki.site.media.service.WallpaperDiscoveryService;
import io.github.shizuki.site.media.service.WallpaperService;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.when;

class WallpaperDiscoveryPreviewCacheTest {

    private static final String ITEM_ID = "3810145248";
    private static final String PREVIEW_URL = "https://steamuserimages-a.akamaihd.net/preview.jpg";

    @Test
    @SuppressWarnings("unchecked")
    void previewForSearchResultUsesKnownMetadataWithoutDetailLookup() throws Exception {
        WallpaperDiscoveryProperties properties = new WallpaperDiscoveryProperties();
        properties.setSteamApiKey("configured-key");
        WallpaperWorkshopProperties workshopProperties = new WallpaperWorkshopProperties();
        HttpClient httpClient = mock(HttpClient.class);
        WallpaperOutboundClient outboundClient = new WallpaperOutboundClient(properties, httpClient);
        WorkshopMetadataProvider metadataProvider = new WorkshopMetadataProvider(properties, new ObjectMapper(), outboundClient);
        AtomicInteger upstreamRequests = mockResponses(httpClient, PREVIEW_URL);

        WallpaperDiscoveryServiceImpl service = new WallpaperDiscoveryServiceImpl(
                properties,
                workshopProperties,
                new MediaStorageProperties(),
                mock(WallpaperService.class),
                new ObjectMapper(),
                outboundClient,
                metadataProvider,
                new WorkshopDownloadChannelResolver(workshopProperties));

        WorkshopSearchResponse search = service.searchWorkshop("", 1, "trend", "");
        assertEquals(1, search.items().size());
        WallpaperDiscoveryService.WallpaperPreview preview = service.fetchPreview("workshop", ITEM_ID);

        assertArrayEquals(new byte[] {(byte) 0xff, (byte) 0xd8, (byte) 0xff}, preview.bytes());
        assertEquals(2, upstreamRequests.get(), "one search request plus one image request; no item-detail request");
    }

    @Test
    void rejectsUntrustedSearchPreviewAndResolvesTrustedMetadataOnCacheMiss() throws Exception {
        WallpaperDiscoveryProperties properties = new WallpaperDiscoveryProperties();
        properties.setSteamApiKey("configured-key");
        WallpaperWorkshopProperties workshopProperties = new WallpaperWorkshopProperties();
        HttpClient httpClient = mock(HttpClient.class);
        WallpaperOutboundClient outboundClient = new WallpaperOutboundClient(properties, httpClient);
        WorkshopMetadataProvider metadataProvider = new WorkshopMetadataProvider(properties, new ObjectMapper(), outboundClient);
        AtomicInteger upstreamRequests = mockResponses(httpClient, "https://attacker.example.test/preview.jpg");
        WallpaperDiscoveryServiceImpl service = new WallpaperDiscoveryServiceImpl(
                properties,
                workshopProperties,
                new MediaStorageProperties(),
                mock(WallpaperService.class),
                new ObjectMapper(),
                outboundClient,
                metadataProvider,
                new WorkshopDownloadChannelResolver(workshopProperties));

        service.searchWorkshop("", 1, "trend", "");
        WallpaperDiscoveryService.WallpaperPreview preview = service.fetchPreview("workshop", ITEM_ID);

        assertArrayEquals(new byte[] {(byte) 0xff, (byte) 0xd8, (byte) 0xff}, preview.bytes());
        assertEquals(3, upstreamRequests.get(), "search, trusted item detail, then trusted image request");
    }

    @SuppressWarnings({"unchecked", "rawtypes"})
    private AtomicInteger mockResponses(HttpClient httpClient, String searchPreviewUrl) throws Exception {
        AtomicInteger requests = new AtomicInteger();
        HttpResponse<String> searchResponse = mock(HttpResponse.class);
        when(searchResponse.statusCode()).thenReturn(200);
        when(searchResponse.body()).thenReturn("""
                {"response":{"total":1,"publishedfiledetails":[
                  {"publishedfileid":"3810145248","title":"Wallpaper","preview_url":"%s"}
                ]}}
                """.formatted(searchPreviewUrl));
        HttpResponse<String> detailResponse = mock(HttpResponse.class);
        when(detailResponse.statusCode()).thenReturn(200);
        when(detailResponse.body()).thenReturn("""
                {"response":{"publishedfiledetails":[
                  {"result":1,"publishedfileid":"3810145248","title":"Wallpaper",
                   "preview_url":"%s","file_url":"","file_size":0,"time_updated":0}
                ]}}
                """.formatted(PREVIEW_URL));
        HttpResponse<java.io.InputStream> imageResponse = mock(HttpResponse.class);
        when(imageResponse.statusCode()).thenReturn(200);
        when(imageResponse.uri()).thenReturn(URI.create(PREVIEW_URL));
        when(imageResponse.headers()).thenReturn(HttpHeaders.of(Map.of(
                "Content-Type", List.of("image/jpeg")), (name, value) -> true));
        when(imageResponse.body()).thenReturn(new ByteArrayInputStream(new byte[] {(byte) 0xff, (byte) 0xd8, (byte) 0xff}));
        doAnswer(invocation -> {
            requests.incrementAndGet();
            HttpRequest request = invocation.getArgument(0);
            String path = request.uri().getPath();
            if (path.contains("QueryFiles")) {
                return searchResponse;
            }
            if (path.contains("GetPublishedFileDetails")) {
                return detailResponse;
            }
            return imageResponse;
        }).when(httpClient).send(any(), any());
        return requests;
    }
}
