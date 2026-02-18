package io.github.shizuki.site.content.controller;

import io.github.shizuki.site.content.dto.ContentVisibilityResponse;
import io.github.shizuki.site.content.service.ContentService;
import java.util.Set;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@WebMvcTest(AdminContentVisibilityController.class)
class AdminContentVisibilityControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ContentService contentService;

    @Test
    void shouldGetPostVisibilitySuccessfully() throws Exception {
        Mockito.when(contentService.getPostVisibility(ArgumentMatchers.eq(1001L)))
            .thenReturn(new ContentVisibilityResponse(1001L, "GROUP", Set.of("FAMILY")));

        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/admin/posts/1001/visibility"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.target_id").value(1001))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.visibility").value("GROUP"));
    }

    @Test
    void shouldUpdateAppVisibilitySuccessfully() throws Exception {
        Mockito.when(contentService.updateAppVisibility(ArgumentMatchers.eq(2001L), ArgumentMatchers.any()))
            .thenReturn(new ContentVisibilityResponse(2001L, "PRIVATE", Set.of()));

        mockMvc.perform(MockMvcRequestBuilders.put("/api/v1/admin/apps/2001/visibility")
                .contentType(MediaType.APPLICATION_JSON)
                .content("""
                    {
                      "visibility": "PRIVATE",
                      "allowed_group_codes": []
                    }
                    """))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.target_id").value(2001))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.visibility").value("PRIVATE"));
    }
}
