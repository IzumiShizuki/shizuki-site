package io.github.shizuki.site.media.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.site.media.config.WallpaperDiscoveryProperties;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

class WorkshopMetadataProviderTest {

    @Test
    @SuppressWarnings("unchecked")
    void fallsBackToPublicPageWhenSteamApiRejectsExistingItem() throws Exception {
        HttpResponse<String> apiResponse = Mockito.mock(HttpResponse.class);
        Mockito.when(apiResponse.statusCode()).thenReturn(200);
        Mockito.when(apiResponse.body()).thenReturn(
                "{\"response\":{\"publishedfiledetails\":["
                        + "{\"publishedfileid\":\"3789790717\",\"result\":9}]}}");
        HttpResponse<String> pageResponse = Mockito.mock(HttpResponse.class);
        Mockito.when(pageResponse.statusCode()).thenReturn(200);
        Mockito.when(pageResponse.body()).thenReturn(
                "<html><head>"
                        + "<meta property=\"og:title\" content=\"Recovered &amp; Wallpaper\">"
                        + "<meta property=\"og:image\" content=\"https://cdn.example.test/preview.jpg\">"
                        + "</head><body></body></html>");
        HttpClient rawClient = Mockito.mock(HttpClient.class);
        Mockito.doReturn(apiResponse, pageResponse).when(rawClient).send(any(), any());
        WallpaperDiscoveryProperties properties = new WallpaperDiscoveryProperties();
        properties.setSteamApiBaseUrl("https://api.example.test");
        properties.setWorkshopBrowseBaseUrl("https://community.example.test");
        WallpaperOutboundClient client = new WallpaperOutboundClient(properties, rawClient);
        WorkshopMetadataProvider provider = new WorkshopMetadataProvider(properties, new ObjectMapper(), client);

        WorkshopMetadataProvider.WorkshopMetadata metadata = provider.resolve("3789790717");

        assertEquals("3789790717", metadata.itemId());
        assertEquals("Recovered & Wallpaper", metadata.title());
        assertEquals("https://cdn.example.test/preview.jpg", metadata.previewUrl());
        assertEquals("page", metadata.source());
        assertFalse(metadata.hasDirectDownload());
        ArgumentCaptor<HttpRequest> requests = ArgumentCaptor.forClass(HttpRequest.class);
        verify(rawClient, times(2)).send(requests.capture(), any());
        List<HttpRequest> recorded = requests.getAllValues();
        assertEquals("/ISteamRemoteStorage/GetPublishedFileDetails/v1/", recorded.get(0).uri().getPath());
        assertEquals("/sharedfiles/filedetails/", recorded.get(1).uri().getPath());
    }

    @Test
    @SuppressWarnings("unchecked")
    void returnsSafeErrorWhenBothMetadataSourcesFail() throws Exception {
        HttpResponse<String> apiResponse = Mockito.mock(HttpResponse.class);
        Mockito.when(apiResponse.statusCode()).thenReturn(403);
        HttpResponse<String> pageResponse = Mockito.mock(HttpResponse.class);
        Mockito.when(pageResponse.statusCode()).thenReturn(502);
        HttpClient rawClient = Mockito.mock(HttpClient.class);
        Mockito.doReturn(apiResponse, pageResponse).when(rawClient).send(any(), any());
        WallpaperDiscoveryProperties properties = new WallpaperDiscoveryProperties();
        properties.setSteamApiBaseUrl("https://api.example.test");
        properties.setWorkshopBrowseBaseUrl("https://community.example.test");
        WallpaperOutboundClient client = new WallpaperOutboundClient(properties, rawClient);
        WorkshopMetadataProvider provider = new WorkshopMetadataProvider(properties, new ObjectMapper(), client);

        BusinessException exception = assertThrows(
                BusinessException.class,
                () -> provider.resolve("3789790717"));

        assertEquals("Workshop metadata is temporarily unavailable", exception.getMessage());
        verify(rawClient, times(2)).send(any(), any());
    }
}
