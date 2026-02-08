package io.github.shizuki.site.media.controller;

import io.github.shizuki.common.audit.annotation.AuditLog;
import io.github.shizuki.common.core.response.ApiResponse;
import io.github.shizuki.site.media.dto.AssetCreateRequest;
import io.github.shizuki.site.media.dto.UploadPolicyRequest;
import io.github.shizuki.site.media.dto.UploadPolicyResponse;
import io.github.shizuki.site.media.service.MediaService;
import jakarta.validation.Valid;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/assets")
public class AssetController {

    private final MediaService mediaFacade;

    public AssetController(MediaService mediaFacade) {
        this.mediaFacade = mediaFacade;
    }

    @PostMapping("/upload-policies")
    public ApiResponse<UploadPolicyResponse> createUploadPolicy(@Valid @RequestBody UploadPolicyRequest request) {
        return ApiResponse.success(mediaFacade.createUploadPolicy(request));
    }

    @PostMapping
    @AuditLog(action = "asset.create", resource = "asset")
    public ApiResponse<Map<String, Object>> createAsset(@Valid @RequestBody AssetCreateRequest request) {
        return ApiResponse.success(mediaFacade.createAsset(request));
    }

    @GetMapping("/{asset_id}/download-url")
    public ApiResponse<Map<String, Object>> downloadUrl(@PathVariable("asset_id") Long assetId) {
        return ApiResponse.success(mediaFacade.createDownloadUrl(assetId));
    }

    @PostMapping("/{asset_id}/reports")
    public ApiResponse<Map<String, Object>> report(@PathVariable("asset_id") Long assetId) {
        return ApiResponse.success(mediaFacade.reportAsset(assetId));
    }

}
