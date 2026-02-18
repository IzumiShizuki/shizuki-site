package io.github.shizuki.site.media.controller;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.site.media.dto.AdminAssetAuditResponse;
import io.github.shizuki.site.media.dto.AdminAssetUpdateRequest;
import io.github.shizuki.site.media.service.MediaService;
import io.github.shizuki.site.media.support.ApiErrorAssertions;
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

@WebMvcTest(AdminAssetController.class)
class AdminAssetControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private MediaService mediaService;

    @Test
    void shouldUpdateAuditStatusSuccessfully() throws Exception {
        Mockito.when(mediaService.auditAsset(ArgumentMatchers.eq(1001L), ArgumentMatchers.any(AdminAssetUpdateRequest.class)))
            .thenReturn(new AdminAssetAuditResponse(
                1001L,
                "APPROVED",
                true,
                10,
                "PUBLIC",
                "LIVE2D_PACKAGE"
            ));

        mockMvc.perform(MockMvcRequestBuilders.put("/api/v1/admin/assets/1001/audit-status")
                .contentType(MediaType.APPLICATION_JSON)
                .content("""
                    {
                      "audit_status": "APPROVED",
                      "home_enabled": true,
                      "home_sort_num": 10,
                      "visibility": "PUBLIC"
                    }
                    """))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.asset_id").value(1001))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.audit_status").value("APPROVED"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.home_enabled").value(true))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.home_sort_num").value(10))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.visibility").value("PUBLIC"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.asset_kind").value("LIVE2D_PACKAGE"));
    }

    @Test
    void shouldReturnNotFoundWhenAssetMissing() throws Exception {
        Mockito.when(mediaService.auditAsset(ArgumentMatchers.eq(404L), ArgumentMatchers.any(AdminAssetUpdateRequest.class)))
            .thenThrow(new BusinessException(ErrorCode.NOT_FOUND, "Asset not found"));

        mockMvc.perform(MockMvcRequestBuilders.put("/api/v1/admin/assets/404/audit-status")
                .contentType(MediaType.APPLICATION_JSON)
                .content("""
                    {
                      "audit_status": "APPROVED"
                    }
                    """))
            .andExpect(ApiErrorAssertions.hasProblem(404, "NOT_FOUND"));
    }
}
