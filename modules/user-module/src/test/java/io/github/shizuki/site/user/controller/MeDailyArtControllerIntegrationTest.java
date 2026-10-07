package io.github.shizuki.site.user.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.shizuki.site.user.service.DailyArtService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import java.util.List;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(MeDailyArtController.class)
class MeDailyArtControllerIntegrationTest {
    @Autowired private MockMvc mvc;
    @Autowired private ObjectMapper mapper;
    @MockBean private DailyArtService service;

    @Test void requiresAuthenticationAndDoesNotTrustBodyUserId() throws Exception {
        mvc.perform(get("/api/v1/me/daily-art/settings")).andExpect(status().isUnauthorized());
        verifyNoInteractions(service);
        when(service.connect(7L, "42", "42_abcdefghijklmnop")).thenReturn(mapper.createObjectNode().put("connected", true));
        mvc.perform(put("/api/v1/me/daily-art/pixiv").header("X-User-Id", "7")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"account_id\":\"42\",\"session\":\"42_abcdefghijklmnop\",\"user_id\":99}"))
                .andExpect(status().isOk()).andExpect(jsonPath("$.data.connected").value(true));
        verify(service).connect(7L, "42", "42_abcdefghijklmnop");
    }

    @Test void validatesArtistInputsAndSupportsSnakeCaseContract() throws Exception {
        mvc.perform(put("/api/v1/me/daily-art/artists").header("X-User-Id", "7")
                .contentType(MediaType.APPLICATION_JSON).content("{\"artist_ids\":null}"))
                .andExpect(status().isBadRequest());
        var response = mapper.createObjectNode();
        response.putArray("manual_artists").add("42");
        when(service.saveArtists(7L, List.of("42"))).thenReturn(response);
        mvc.perform(put("/api/v1/me/daily-art/artists").header("X-User-Id", "7")
                .contentType(MediaType.APPLICATION_JSON).content("{\"artist_ids\":[\"42\"]}"))
                .andExpect(status().isOk());
        verify(service).saveArtists(7L, List.of("42"));
    }
}
