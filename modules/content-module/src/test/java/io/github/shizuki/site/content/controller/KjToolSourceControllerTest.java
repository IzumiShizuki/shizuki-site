package io.github.shizuki.site.content.controller;

import io.github.shizuki.site.content.support.KjToolSourceService;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@WebMvcTest(KjToolSourceController.class)
class KjToolSourceControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private KjToolSourceService kjToolSourceService;

    @Test
    void returnsCatalogEnvelopeAndForwardsRefresh() throws Exception {
        KjToolSourceService.ToolSummaryView tool = new KjToolSourceService.ToolSummaryView(
            "drawing-1", "画板", "desc", "KJ author", "efficiency", "code", "fas fa-brush", "#187aff",
            "1.0.0", 12, "2026-08-20", true, "document", "");
        Mockito.when(kjToolSourceService.catalog(true)).thenReturn(new KjToolSourceService.CatalogView(
            true,
            "KJ 应用社区",
            "https://kj.sgguo.com/",
            List.of(new KjToolSourceService.CategoryView("efficiency", "效率工具", "fa-bolt")),
            List.of(tool)));

        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/tools/kj-source/catalog").param("refresh", "true"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.enabled").value(true))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.tools[0].id").value("drawing-1"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.tools[0].launch_mode").value("document"));
        Mockito.verify(kjToolSourceService).catalog(true);
    }

    @Test
    void returnsToolDetail() throws Exception {
        Mockito.when(kjToolSourceService.toolDetail("drawing-1")).thenReturn(new KjToolSourceService.ToolDetailView(
            "drawing-1", "画板", "desc", "author", "efficiency", "code", "", "#187aff", "1.0.0", 12,
            "2026-08-20", true, "document", "", "<main>draw</main>", "", "", "",
            "https://kj.sgguo.com/"));

        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/tools/kj-source/tools/drawing-1"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.id").value("drawing-1"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.html").value("<main>draw</main>"));
    }

    @Test
    void returnsStableProblemResponse() throws Exception {
        Mockito.when(kjToolSourceService.toolDetail("missing-1"))
            .thenThrow(new KjToolSourceService.KjToolSourceException(
                404,
                "KJ_TOOL_NOT_FOUND",
                "该 KJ 工具不存在或已下架"));

        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/tools/kj-source/tools/missing-1"))
            .andExpect(MockMvcResultMatchers.status().isNotFound())
            .andExpect(MockMvcResultMatchers.content().contentType("application/problem+json"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("KJ_TOOL_NOT_FOUND"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.detail").value("该 KJ 工具不存在或已下架"));
    }
}
