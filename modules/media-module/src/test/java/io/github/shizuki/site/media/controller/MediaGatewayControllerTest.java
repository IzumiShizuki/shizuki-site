package io.github.shizuki.site.media.controller;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.asyncDispatch;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.header;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.request;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import io.github.shizuki.site.media.model.ImageVariantTypeEnum;
import io.github.shizuki.site.media.service.gateway.MediaGatewayService;
import io.github.shizuki.site.media.service.gateway.MediaGatewayStream;
import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

class MediaGatewayControllerTest {

    private MediaGatewayService gatewayService;
    private MockMvc mockMvc;

    @BeforeEach
    void setUp() {
        gatewayService = Mockito.mock(MediaGatewayService.class);
        mockMvc = MockMvcBuilders.standaloneSetup(new MediaGatewayController(gatewayService)).build();
    }

    @Test
    void browserResponseIsSiteOwnedStreamWithNoRedirectOrUpstreamHeaders() throws Exception {
        byte[] bytes = "browser-safe-image".getBytes(StandardCharsets.UTF_8);
        String mediaRef = "med_012345678901234567890123456";
        when(gatewayService.open(mediaRef, ImageVariantTypeEnum.DISPLAY_WEBP, null))
            .thenReturn(new MediaGatewayStream(
                new ByteArrayInputStream(bytes),
                "image/webp",
                bytes.length,
                "public, max-age=60, must-revalidate",
                "\"mgw-safe\""
            ));

        MvcResult started = mockMvc.perform(get(
                "/api/v1/media/{media_ref}/variants/{variant}",
                mediaRef,
                "display_webp"
            ))
            .andExpect(request().asyncStarted())
            .andReturn();

        MvcResult completed = mockMvc.perform(asyncDispatch(started))
            .andExpect(status().isOk())
            .andExpect(header().string("Content-Type", "image/webp"))
            .andExpect(header().string("Cache-Control", "public, max-age=60, must-revalidate"))
            .andExpect(header().string("ETag", "\"mgw-safe\""))
            .andExpect(header().doesNotExist("Location"))
            .andExpect(header().doesNotExist("X-Oss-Request-Id"))
            .andReturn();

        assertThat(completed.getResponse().getContentAsByteArray()).isEqualTo(bytes);
        assertThat(completed.getResponse().getHeaderNames())
            .allSatisfy(headerName -> assertThat(headerName.toLowerCase())
                .doesNotContain("x-oss", "bucket", "object-key", "signature"));
    }
}
