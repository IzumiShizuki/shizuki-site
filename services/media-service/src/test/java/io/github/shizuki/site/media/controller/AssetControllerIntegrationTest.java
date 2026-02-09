package io.github.shizuki.site.media.controller;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.site.media.dto.AssetCreateRequest;
import io.github.shizuki.site.media.dto.UploadPolicyRequest;
import io.github.shizuki.site.media.dto.UploadPolicyResponse;
import io.github.shizuki.site.media.service.MediaService;
import io.github.shizuki.site.media.support.ApiErrorAssertions;
import java.util.Map;
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

@WebMvcTest(AssetController.class)
class AssetControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private MediaService mediaService;

    @Test
    void shouldCreateUploadPolicySuccessfully() throws Exception {
        Mockito.when(mediaService.createUploadPolicy(ArgumentMatchers.any(UploadPolicyRequest.class)))
            .thenReturn(new UploadPolicyResponse(
                "shizuki-private",
                "user/1/avatar/test.png",
                "https://example.oss-cn-hangzhou.aliyuncs.com",
                300
            ));

        mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/assets/upload-policies")
                .contentType(MediaType.APPLICATION_JSON)
                .content("""
                    {
                      "file_name": "avatar.png",
                      "content_type": "image/png"
                    }
                    """))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.bucket").value("shizuki-private"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.expire_seconds").value(300));
    }

    @Test
    void shouldCreateAssetSuccessfully() throws Exception {
        Mockito.when(mediaService.createAsset(ArgumentMatchers.any(AssetCreateRequest.class)))
            .thenReturn(Map.of("asset_id", 1001, "status", "CREATED"));

        mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/assets")
                .contentType(MediaType.APPLICATION_JSON)
                .content("""
                    {
                      "bucket": "shizuki-private",
                      "key": "user/1/avatar/test.png",
                      "asset_type": "image"
                    }
                    """))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.asset_id").value(1001))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.status").value("CREATED"));
    }

    @Test
    void shouldCreateDownloadUrlSuccessfully() throws Exception {
        Mockito.when(mediaService.createDownloadUrl(ArgumentMatchers.eq(1001L)))
            .thenReturn(Map.of("download_url", "https://download.example.com/file", "expire_seconds", 300));

        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/assets/1001/download-url"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.download_url").value("https://download.example.com/file"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.expire_seconds").value(300));
    }

    @Test
    void shouldReportAssetSuccessfully() throws Exception {
        Mockito.when(mediaService.reportAsset(ArgumentMatchers.eq(1001L)))
            .thenReturn(Map.of("status", "CREATED"));

        mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/assets/1001/reports"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.status").value("CREATED"));
    }

    @Test
    void shouldReturnBadRequestWhenUploadPolicyFilenameBlank() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/assets/upload-policies")
                .contentType(MediaType.APPLICATION_JSON)
                .content("""
                    {
                      "file_name": "",
                      "content_type": "image/png"
                    }
                    """))
            .andExpect(ApiErrorAssertions.hasProblem(400, "BAD_REQUEST"));
    }

    @Test
    void shouldReturnBadRequestWhenAssetRequestMissingKey() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/assets")
                .contentType(MediaType.APPLICATION_JSON)
                .content("""
                    {
                      "bucket": "shizuki-private",
                      "asset_type": "image"
                    }
                    """))
            .andExpect(ApiErrorAssertions.hasProblem(400, "BAD_REQUEST"));
    }

    @Test
    void shouldReturnNotFoundWhenDownloadUrlAssetMissing() throws Exception {
        Mockito.when(mediaService.createDownloadUrl(ArgumentMatchers.eq(404L)))
            .thenThrow(new BusinessException(ErrorCode.NOT_FOUND, "Asset not found"));

        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/assets/404/download-url"))
            .andExpect(ApiErrorAssertions.hasProblem(404, "NOT_FOUND"));
    }

    @Test
    void shouldReturnNotFoundWhenReportAssetMissing() throws Exception {
        Mockito.when(mediaService.reportAsset(ArgumentMatchers.eq(404L)))
            .thenThrow(new BusinessException(ErrorCode.NOT_FOUND, "Asset not found"));

        mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/assets/404/reports"))
            .andExpect(ApiErrorAssertions.hasProblem(404, "NOT_FOUND"));
    }
}
