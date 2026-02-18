package io.github.shizuki.site.media.controller;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.site.media.dto.AssetCreateRequest;
import io.github.shizuki.site.media.dto.AssetCreateResponse;
import io.github.shizuki.site.media.dto.AssetDownloadResponse;
import io.github.shizuki.site.media.dto.AssetReportResponse;
import io.github.shizuki.site.media.dto.PublicHomeRoleResponse;
import io.github.shizuki.site.media.dto.UploadPolicyRequest;
import io.github.shizuki.site.media.dto.UploadPolicyResponse;
import io.github.shizuki.site.media.service.MediaService;
import io.github.shizuki.site.media.support.ApiErrorAssertions;
import java.util.List;
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
                300,
                "STATIC_IMAGE",
                1,
                "DIRECT_OSS"
            ));

        mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/assets/upload-policies")
                .contentType(MediaType.APPLICATION_JSON)
                .content("""
                    {
                      "file_name": "avatar.png",
                      "content_type": "image/png",
                      "asset_kind": "STATIC_IMAGE"
                    }
                    """))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.bucket").value("shizuki-private"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.expire_seconds").value(300))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.asset_kind").value("STATIC_IMAGE"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.asset_kind_code").value(1));
    }

    @Test
    void shouldCreateAssetSuccessfully() throws Exception {
        Mockito.when(mediaService.createAsset(ArgumentMatchers.any(AssetCreateRequest.class)))
            .thenReturn(new AssetCreateResponse(
                1001L,
                "shizuki-private",
                "user/1/avatar/test.png",
                "STATIC_IMAGE",
                "PRIVATE",
                "PENDING_AUDIT",
                "CREATED",
                null
            ));

        mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/assets")
                .contentType(MediaType.APPLICATION_JSON)
                .content("""
                    {
                      "bucket": "shizuki-private",
                      "key": "user/1/avatar/test.png",
                      "asset_type": "image",
                      "asset_kind": "STATIC_IMAGE",
                      "content_type": "image/png",
                      "visibility": "PRIVATE",
                      "metadata": {
                        "width": 1200,
                        "height": 800
                      }
                    }
                    """))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.asset_id").value(1001))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.status").value("CREATED"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.asset_kind").value("STATIC_IMAGE"));
    }

    @Test
    void shouldCreateAssetWithoutAssetTypeForCompatibility() throws Exception {
        Mockito.when(mediaService.createAsset(ArgumentMatchers.any(AssetCreateRequest.class)))
            .thenReturn(new AssetCreateResponse(
                1002L,
                "shizuki-private",
                "user/1/avatar/test2.png",
                "STATIC_IMAGE",
                "PRIVATE",
                "PENDING_AUDIT",
                "CREATED",
                null
            ));

        mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/assets")
                .contentType(MediaType.APPLICATION_JSON)
                .content("""
                    {
                      "bucket": "shizuki-private",
                      "key": "user/1/avatar/test2.png",
                      "asset_kind": "STATIC_IMAGE",
                      "content_type": "image/png",
                      "visibility": "PRIVATE"
                    }
                    """))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.asset_id").value(1002))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.status").value("CREATED"));
    }

    @Test
    void shouldCreateDownloadUrlSuccessfully() throws Exception {
        Mockito.when(mediaService.createDownloadUrl(ArgumentMatchers.eq(1001L)))
            .thenReturn(new AssetDownloadResponse(
                1001L,
                "STATIC_IMAGE",
                false,
                null,
                "https://download.example.com/file",
                300L
            ));

        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/assets/1001/download-url"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.download_url").value("https://download.example.com/file"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.expire_seconds").value(300))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.asset_kind").value("STATIC_IMAGE"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.is_public").value(false));
    }

    @Test
    void shouldListPublicHomeRolesSuccessfully() throws Exception {
        Mockito.when(mediaService.listPublicHomeRoles()).thenReturn(List.of(
            new PublicHomeRoleResponse(
                101L,
                "LIVE2D_PACKAGE",
                "https://cdn.example.com/assets/1.zip",
                "https://cdn.example.com/assets/1.zip",
                "haru/haru.model3.json",
                1
            )
        ));

        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/assets/public/home-roles"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data[0].asset_id").value(101))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data[0].asset_kind").value("LIVE2D_PACKAGE"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data[0].l2d_entry_model_json").value("haru/haru.model3.json"));
    }

    @Test
    void shouldReportAssetSuccessfully() throws Exception {
        Mockito.when(mediaService.reportAsset(ArgumentMatchers.eq(1001L)))
            .thenReturn(new AssetReportResponse(1001L, 9001L, "CREATED"));

        mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/assets/1001/reports"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.asset_id").value(1001))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.report_id").value(9001))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.report_status").value("CREATED"));
    }

    @Test
    void shouldReturnBadRequestWhenUploadPolicyFilenameBlank() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/assets/upload-policies")
                .contentType(MediaType.APPLICATION_JSON)
                .content("""
                    {
                      "file_name": "",
                      "content_type": "image/png",
                      "asset_kind": "STATIC_IMAGE"
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
                      "asset_type": "image",
                      "asset_kind": "STATIC_IMAGE",
                      "content_type": "image/png",
                      "visibility": "PRIVATE"
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
