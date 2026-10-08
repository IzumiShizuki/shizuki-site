package io.github.shizuki.site.media.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.site.media.config.MediaStorageProperties;
import io.github.shizuki.site.media.config.WallpaperDiscoveryProperties;
import io.github.shizuki.site.media.config.WallpaperWorkshopProperties;
import io.github.shizuki.site.media.request.WallhavenImportCreateRequest;
import io.github.shizuki.site.media.response.WallhavenSearchItemResponse;
import io.github.shizuki.site.media.service.WallpaperService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import org.springframework.web.multipart.MultipartFile;

import java.io.ByteArrayInputStream;
import java.net.InetSocketAddress;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;

class WallpaperDiscoveryServiceImplTest {

    @Test
    void aggregatesWallhavenBatchesAndHandlesFinalPartialPage() throws Exception {
        HttpClient client = Mockito.mock(HttpClient.class);
        Mockito.doAnswer(invocation -> {
            java.net.http.HttpRequest request = invocation.getArgument(0);
            var matcher = java.util.regex.Pattern.compile("(?:^|&)page=(\\d+)")
                    .matcher(request.uri().getRawQuery());
            assertTrue(matcher.find());
            int sourcePage = Integer.parseInt(matcher.group(1));
            StringBuilder body = new StringBuilder("{\"data\":[");
            for (int i = 0; i < 24; i++) {
                if (i > 0) body.append(',');
                body.append("{\"id\":\"w").append(sourcePage).append(String.format("%04d", i)).append("\"}");
            }
            body.append("],\"meta\":{\"last_page\":7,\"total\":168,\"seed\":\"fixture-seed\"}}");
            assertTrue(request.uri().getRawQuery().contains("categories=110"));
            if (sourcePage == 2 || sourcePage == 3) {
                assertTrue(request.uri().getRawQuery().contains("seed=fixture-seed"));
            }
            return successfulResponse(body.toString());
        }).when(client).send(any(), any());
        var service = discoveryService(client, Mockito.mock(WallpaperService.class));
        var first = service.searchWallhaven("", 1, "110", "100", "random", "", "", "desc");
        var second = service.searchWallhaven("", 2, "110", "100", "random", "", "", "desc");
        var last = service.searchWallhaven("", 3, "110", "100", "random", "", "", "desc");
        assertEquals(72, first.items().size());
        assertEquals(72, second.items().size());
        assertEquals("w10000", first.items().get(0).id());
        assertEquals("w40000", second.items().get(0).id());
        assertEquals(3, first.lastPage());
        assertEquals(24, last.items().size());
        assertEquals(3, last.page());
    }

    @Test
    void enrichesAndCachesWallhavenDetailNames() throws Exception {
        HttpClient client = Mockito.mock(HttpClient.class);
        Mockito.doReturn(successfulResponse("""
                {"data":{"id":"pomle9","tags":[{"name":"Japan"},{"name":"Tokyo"},{"name":"architecture"}]}}
                """)).when(client).send(any(), any());
        var service = discoveryService(client, Mockito.mock(WallpaperService.class));
        assertEquals("Japan · Tokyo · architecture", service.getWallhavenItem("pomle9").title());
        assertEquals(0, service.getWallhavenItem("pomle9").retryAfterSeconds());
        verify(client, Mockito.times(1)).send(any(), any());
    }

    @Test
    void aggregatesSteamCappedPagesWithoutSkippingPartialPageRemainders() throws Exception {
        HttpClient client = Mockito.mock(HttpClient.class);
        Mockito.doAnswer(invocation -> {
            java.net.http.HttpRequest request = invocation.getArgument(0);
            if (request.method().equals("POST")) {
                return successfulResponse("{\"response\":{\"publishedfiledetails\":[]}}");
            }
            var matcher = java.util.regex.Pattern.compile("(?:^|&)p=(\\d+)")
                    .matcher(request.uri().getRawQuery());
            assertTrue(matcher.find());
            int sourcePage = Integer.parseInt(matcher.group(1));
            StringBuilder html = new StringBuilder();
            for (int i = 0; i < 30; i++) {
                html.append("<a data-publishedfileid=\"").append(sourcePage * 1000 + i)
                        .append("\"><img src=\"https://cdn.example/preview.jpg\" alt=\"Wallpaper\"></a>");
            }
            return successfulResponse(html.toString());
        }).when(client).send(any(), any());
        var service = discoveryService(client, Mockito.mock(WallpaperService.class));
        var first = service.searchWorkshop("", 1, "trend", "");
        var second = service.searchWorkshop("", 2, "trend", "");
        assertEquals(72, first.items().size());
        assertEquals("3011", first.items().get(71).itemId());
        assertEquals("3012", second.items().get(0).itemId());
        assertEquals("5023", second.items().get(71).itemId());
        assertTrue(second.hasMore());
    }

    @Test
    void parsesAuthenticatedHttpProxy() {
        WallpaperOutboundClient.ProxyEndpoint proxy =
                WallpaperOutboundClient.parseProxyEndpoint("http://wallpaper%2Dproxy:pass%3Aword@host.docker.internal:7890");

        assertEquals(InetSocketAddress.createUnresolved("host.docker.internal", 7890), proxy.address());
        assertEquals("wallpaper-proxy", proxy.username());
        assertArrayEquals("pass:word".toCharArray(), proxy.password());
        assertTrue(proxy.hasCredentials());
    }

    @Test
    void continuesSparseSteamPagesWithoutDuplicatingNextBatchRemainder() throws Exception {
        HttpClient client = Mockito.mock(HttpClient.class);
        Mockito.doAnswer(invocation -> {
            java.net.http.HttpRequest request = invocation.getArgument(0);
            if (request.method().equals("POST")) {
                return successfulResponse("{\"response\":{\"publishedfiledetails\":[]}}");
            }
            var matcher = java.util.regex.Pattern.compile("(?:^|&)p=(\\d+)")
                    .matcher(request.uri().getRawQuery());
            assertTrue(matcher.find());
            int sourcePage = Integer.parseInt(matcher.group(1));
            StringBuilder html = new StringBuilder("<script>\\\"total_pages\\\":1000</script>");
            int count = sourcePage == 2 ? 28 : 30;
            for (int i = 0; i < count; i++) {
                html.append("<a data-publishedfileid=\"").append(sourcePage * 1000 + i)
                        .append("\"><img src=\"https://cdn.example/preview.jpg\" alt=\"Wallpaper\"></a>");
            }
            return successfulResponse(html.toString());
        }).when(client).send(any(), any());
        var service = discoveryService(client, Mockito.mock(WallpaperService.class));
        var first = service.searchWorkshop("", 1, "trend", "");
        var second = service.searchWorkshop("", 2, "trend", "");
        assertEquals(70, first.items().size());
        assertEquals("3011", first.items().get(69).itemId());
        assertTrue(first.hasMore());
        assertEquals(72, second.items().size());
        assertEquals("3012", second.items().get(0).itemId());
        var firstIds = first.items().stream().map(item -> item.itemId()).toList();
        assertTrue(second.items().stream().noneMatch(item -> firstIds.contains(item.itemId())));
    }

    @Test
    void parsesUnauthenticatedHttpProxyWithDefaultPort() {
        WallpaperOutboundClient.ProxyEndpoint proxy =
                WallpaperOutboundClient.parseProxyEndpoint("http://127.0.0.1");

        assertEquals(InetSocketAddress.createUnresolved("127.0.0.1", 80), proxy.address());
        assertFalse(proxy.hasCredentials());
    }

    @Test
    void leavesBlankProxyConfigurationDisabled() {
        assertNull(WallpaperOutboundClient.parseProxyEndpoint("  "));
    }

    @Test
    void rejectsUnsupportedOrIncompleteProxyUrls() {
        assertThrows(IllegalArgumentException.class,
                () -> WallpaperOutboundClient.parseProxyEndpoint("https://proxy.example.test:7890"));
        assertThrows(IllegalArgumentException.class,
                () -> WallpaperOutboundClient.parseProxyEndpoint("http://proxy.example.test:7890/path"));
        assertThrows(IllegalArgumentException.class,
                () -> WallpaperOutboundClient.parseProxyEndpoint("http://username@proxy.example.test:7890"));
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

    @Test
    void returnsDescriptiveWallhavenSourceTitles() throws Exception {
        String responseBody = """
                {"data":[
                  {"id":"jel1jq","category":"general",
                   "source":"https://www.behance.net/gallery/234567/Robot-Dave?tracking=fixture"},
                  {"id":"abc123","title":"  Original artwork  ",
                   "source":"https://example.test/Other-Name"},
                  {"id":"def456","source":"https://www.artstation.com/artwork/xYZ123",
                   "tags":[{"name":"artwork"},{"name":"robot"},{"name":"robot"},{"name":"interior"}]},
                  {"id":"ghi789","source":"https://www.pixiv.net/artworks/123456789",
                   "tags":[{"name":"wallpaper"}]},
                  {"id":"jkl123","source":"https://images.example.test/image.png",
                   "tags":[{"name":"ocean"}]},
                  {"id":"zxc123","source":"https://example.test/Moon%20Garden/"}
                ],"meta":{"current_page":1,"last_page":1,"total":6}}
                """;
        HttpClient rawClient = Mockito.mock(HttpClient.class);
        Mockito.doReturn(successfulResponse(responseBody)).when(rawClient).send(any(), any());
        WallpaperDiscoveryServiceImpl service = discoveryService(rawClient, Mockito.mock(WallpaperService.class));

        var response = service.searchWallhaven("", 1, "111", "100", "toplist", "", "", "desc");

        assertEquals(List.of("Robot Dave", "Original artwork", "robot · interior",
                        "未命名壁纸", "ocean", "Moon Garden"),
                response.items().stream().map(WallhavenSearchItemResponse::title).toList());
        assertEquals("general", response.items().get(0).category());
    }

    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = {"综合壁纸 - jel1jq", "综合壁纸 · jel1jq", "动漫壁纸—jel1jq", "Wallhaven #jel1jq"})
    void importsSourceNameForMissingOrLegacyTitle(String requestedTitle) throws Exception {
        assertImportedWallhavenTitle(requestedTitle, "Robot Dave");
    }

    @Test
    void preservesCustomWallhavenImportTitle() throws Exception {
        assertImportedWallhavenTitle("我的自定义标题", "我的自定义标题");
    }

    private void assertImportedWallhavenTitle(String requestedTitle, String expectedTitle) throws Exception {
        HttpClient rawClient = Mockito.mock(HttpClient.class);
        Mockito.doReturn(
                successfulResponse("""
                        {"data":{"id":"jel1jq","source":"https://www.behance.net/gallery/234567/Robot-Dave",
                         "path":"https://w.wallhaven.cc/full/je/wallhaven-jel1jq.png",
                         "file_size":4,"file_type":"image/png"}}
                        """),
                successfulResponse(new ByteArrayInputStream(new byte[] {1, 2, 3, 4})))
                .when(rawClient).send(any(), any());
        WallpaperService wallpapers = Mockito.mock(WallpaperService.class);
        WallpaperDiscoveryServiceImpl service = discoveryService(rawClient, wallpapers);
        WallhavenImportCreateRequest request = new WallhavenImportCreateRequest();
        request.setWallhavenId("jel1jq");
        request.setVisibility("PRIVATE");
        request.setTitle(requestedTitle);

        service.importWallhaven(request);

        ArgumentCaptor<MultipartFile> file = ArgumentCaptor.forClass(MultipartFile.class);
        verify(wallpapers).importPackage(file.capture(), eq("PRIVATE"), eq(expectedTitle));
        assertEquals("wallhaven-jel1jq.png", file.getValue().getOriginalFilename());
        assertArrayEquals(new byte[] {1, 2, 3, 4}, file.getValue().getBytes());
    }

    private WallpaperDiscoveryServiceImpl discoveryService(HttpClient rawClient, WallpaperService wallpapers) {
        WallpaperDiscoveryProperties discovery = new WallpaperDiscoveryProperties();
        WallpaperWorkshopProperties workshop = new WallpaperWorkshopProperties();
        ObjectMapper mapper = new ObjectMapper();
        WallpaperOutboundClient client = new WallpaperOutboundClient(discovery, rawClient);
        return new WallpaperDiscoveryServiceImpl(discovery, workshop, new MediaStorageProperties(), wallpapers,
                mapper, client, new WorkshopMetadataProvider(discovery, mapper, client),
                new WorkshopDownloadChannelResolver(workshop));
    }

    @SuppressWarnings("unchecked")
    private <T> HttpResponse<T> successfulResponse(T body) {
        HttpResponse<T> response = Mockito.mock(HttpResponse.class);
        Mockito.when(response.statusCode()).thenReturn(200);
        Mockito.when(response.body()).thenReturn(body);
        Mockito.when(response.headers()).thenReturn(HttpHeaders.of(Map.of(), (name, value) -> true));
        return response;
    }
}
