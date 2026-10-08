package io.github.shizuki.site.user.controller;

import io.github.shizuki.site.user.service.PixivClient;
import org.junit.jupiter.api.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

class DailyArtPreviewControllerTest {
    private static final String URL = "/api/v1/daily-art/pixiv/artworks/123/preview";
    private final PixivClient client = mock(PixivClient.class);
    private final MockMvc mvc = MockMvcBuilders.standaloneSetup(new DailyArtPreviewController(client)).build();

    @Test void matchingValidatorSkipsResponseBodyAfterValidatingArtwork() throws Exception {
        when(client.preview("123")).thenReturn(new PixivClient.Preview(new byte[] {1, 2, 3}, "image/jpeg"));
        var first = mvc.perform(get(URL)).andExpect(status().isOk())
                .andExpect(header().string("Cache-Control", "max-age=1800, public"))
                .andExpect(header().string("X-Content-Type-Options", "nosniff"))
                .andExpect(content().bytes(new byte[] {1, 2, 3})).andReturn().getResponse();
        String validator = first.getHeader("ETag");
        assertThat(validator).isNotBlank();
        mvc.perform(get(URL).header("If-None-Match", validator)).andExpect(status().isNotModified())
                .andExpect(header().string("ETag", validator)).andExpect(content().bytes(new byte[0]));
        verify(client, times(2)).preview("123");
    }

    @Test void changedImageReturnsNewBytesAndValidator() throws Exception {
        when(client.preview("123")).thenReturn(new PixivClient.Preview(new byte[] {1}, "image/png"),
                new PixivClient.Preview(new byte[] {2}, "image/png"));
        String previous = mvc.perform(get(URL)).andReturn().getResponse().getHeader("ETag");
        var changed = mvc.perform(get(URL).header("If-None-Match", previous)).andExpect(status().isOk())
                .andExpect(content().bytes(new byte[] {2})).andReturn().getResponse();
        assertThat(changed.getHeader("ETag")).isNotEqualTo(previous);
    }

    @Test void conditionalRequestsCannotConvertFailedVerificationIntoNotModified() throws Exception {
        when(client.preview("123")).thenReturn(new PixivClient.Preview(new byte[] {1}, "image/jpeg"));
        String previous = mvc.perform(get(URL)).andReturn().getResponse().getHeader("ETag");
        when(client.preview("123")).thenThrow(new IllegalArgumentException("作品不属于全年龄内容"));
        assertThatThrownBy(() -> mvc.perform(get(URL).header("If-None-Match", previous)))
                .hasRootCauseMessage("作品不属于全年龄内容");
        verify(client, times(2)).preview("123");
    }
}
