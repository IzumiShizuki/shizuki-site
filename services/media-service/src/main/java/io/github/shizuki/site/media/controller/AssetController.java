package io.github.shizuki.site.media.controller;

import io.github.shizuki.common.audit.annotation.AuditLog;
import io.github.shizuki.common.core.response.ApiResponse;
import io.github.shizuki.site.media.dto.AssetCreateRequest;
import io.github.shizuki.site.media.dto.UploadPolicyRequest;
import io.github.shizuki.site.media.dto.UploadPolicyResponse;
import io.github.shizuki.site.media.service.MediaService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
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
@Tag(name = "Asset", description = "媒体资源上传、下载与举报接口")
public class AssetController {

    private final MediaService mediaFacade;

    public AssetController(MediaService mediaFacade) {
        this.mediaFacade = mediaFacade;
    }

    @PostMapping("/upload-policies")
    @Operation(summary = "生成上传策略", description = "生成前端直传 OSS 所需的 bucket/key/签名")
    public ApiResponse<UploadPolicyResponse> createUploadPolicy(@Valid @RequestBody UploadPolicyRequest request) {
        return ApiResponse.success(mediaFacade.createUploadPolicy(request));
    }

    @PostMapping
    @AuditLog(action = "asset.create", resource = "asset")
    @Operation(summary = "创建资源记录", description = "上传完成后写入资源元数据")
    public ApiResponse<Map<String, Object>> createAsset(@Valid @RequestBody AssetCreateRequest request) {
        return ApiResponse.success(mediaFacade.createAsset(request));
    }

    @GetMapping("/{asset_id}/download-url")
    @Operation(summary = "生成下载地址", description = "根据资源 ID 生成带时效的下载 URL")
    public ApiResponse<Map<String, Object>> downloadUrl(@PathVariable("asset_id") Long assetId) {
        return ApiResponse.success(mediaFacade.createDownloadUrl(assetId));
    }

    @PostMapping("/{asset_id}/reports")
    @Operation(summary = "举报资源", description = "提交资源违规举报工单")
    public ApiResponse<Map<String, Object>> report(@PathVariable("asset_id") Long assetId) {
        return ApiResponse.success(mediaFacade.reportAsset(assetId));
    }

}
