package io.github.shizuki.site.media.controller;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.asyncDispatch;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.header;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.request;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import io.github.shizuki.site.media.response.OriginalDownloadCapabilityResponse;
import io.github.shizuki.site.media.service.download.MediaOriginalDownloadService;
import io.github.shizuki.site.media.service.download.OriginalDownloadAuthorizationService;
import io.github.shizuki.site.media.service.gateway.MediaGatewayStream;
import java.io.ByteArrayInputStream;
import java.time.Instant;
import java.util.Optional;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

class MediaOriginalDownloadControllerTest {

    private OriginalDownloadAuthorizationService authorizationService;
    private MediaOriginalDownloadService downloadService;
    private MockMvc mockMvc;

    @BeforeEach
    void setUp() {
        authorizationService = Mockito.mock(OriginalDownloadAuthorizationService.class);
        downloadService = Mockito.mock(MediaOriginalDownloadService.class);
        mockMvc = MockMvcBuilders.standaloneSetup(
            new MediaOriginalDownloadController(authorizationService, downloadService)
        ).build();
    }

    @Test
    void capabilityResponseIsPrivateNoStoreAndContainsNoUpstreamAddress() throws Exception {
        when(authorizationService.issue("media-ref", null)).thenReturn(Optional.of(
            new OriginalDownloadCapabilityResponse("opaque-original-capability", Instant.parse("2026-08-28T12:00:00Z"))
        ));

        MvcResult result = mockMvc.perform(post(
                "/api/v1/media/{media_ref}/original-download-capabilities",
                "media-ref"
            ))
            .andExpect(status().isOk())
            .andExpect(header().string("Cache-Control", "private, no-store, max-age=0"))
            .andExpect(header().doesNotExist("Location"))
            .andReturn();

        assertThat(result.getResponse().getContentAsString().toLowerCase())
            .contains("opaque-original-capability")
            .doesNotContain("bucket", "object_key", "x-oss", "http://", "https://");
    }

    @Test
    void originalDownloadIsAttachmentStreamWithNoStoreAndNoRedirect() throws Exception {
        byte[] bytes = new byte[] {1, 2, 3, 4};
        when(downloadService.open("media-ref", "original-capability")).thenReturn(
            new MediaGatewayStream(
                new ByteArrayInputStream(bytes),
                "image/jpeg",
                bytes.length,
                "private, no-store, max-age=0",
                "\"mgw-original\""
            )
        );

        MvcResult started = mockMvc.perform(get(
                "/api/v1/media/{media_ref}/original",
                "media-ref"
            ).header(MediaGatewayController.CAPABILITY_HEADER, "original-capability"))
            .andExpect(request().asyncStarted())
            .andReturn();

        MvcResult completed = mockMvc.perform(asyncDispatch(started))
            .andExpect(status().isOk())
            .andExpect(header().string("Content-Type", "image/jpeg"))
            .andExpect(header().string("Cache-Control", "private, no-store, max-age=0"))
            .andExpect(header().string("Content-Disposition", "attachment; filename=\"photo-original.jpg\""))
            .andExpect(header().doesNotExist("Location"))
            .andReturn();

        assertThat(completed.getResponse().getContentAsByteArray()).isEqualTo(bytes);
    }
}
