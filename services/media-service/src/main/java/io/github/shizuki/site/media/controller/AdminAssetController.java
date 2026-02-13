package io.github.shizuki.site.media.controller;

import io.github.shizuki.common.audit.annotation.AuditLog;
import io.github.shizuki.common.core.response.ApiResponse;
import io.github.shizuki.common.ratelimit.annotation.RateLimit;
import io.github.shizuki.common.security.annotation.RequireGroup;
import io.github.shizuki.site.media.dto.AdminAssetAuditResponse;
import io.github.shizuki.site.media.dto.AdminAssetUpdateRequest;
import io.github.shizuki.site.media.service.MediaService;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/admin/assets")
@RequireGroup("ADMIN")
@Tag(name = "Admin Asset", description = "管理员资源审核接口")
public class AdminAssetController {

    /**
     * 媒体域服务，负责审核状态、可见性和首页展示位管理。
     */
    private final MediaService mediaService;

    /**
     * 构造管理员资源控制器。
     *
     * @param mediaService 媒体域服务
     */
    public AdminAssetController(MediaService mediaService) {
        this.mediaService = mediaService;
    }

    /**
     * 更新资源审核与展示配置。
     *
     * @param assetId 资源 ID
     * @param request 审核请求体，支持审核状态、首页展示开关与排序
     * @return 更新后的关键状态字段
     */
    @PutMapping("/{asset_id}/audit-status")
    @RateLimit(key = "admin.assets.audit-status", limit = 30, windowSeconds = 60)
    @AuditLog(action = "asset.audit", resource = "asset")
    @Operation(summary = "审核资源状态", description = "将资源状态更新为通过/拒绝等审核态")
    @ApiResponses({
        @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "200", description = "审核状态更新成功"),
        @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "400", description = "请求参数错误",
            content = @Content(schema = @Schema(implementation = ProblemDetail.class))),
        @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "401", description = "未登录",
            content = @Content(schema = @Schema(implementation = ProblemDetail.class))),
        @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "403", description = "无管理员权限",
            content = @Content(schema = @Schema(implementation = ProblemDetail.class))),
        @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "404", description = "资源不存在",
            content = @Content(schema = @Schema(implementation = ProblemDetail.class))),
        @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "429", description = "请求频率超限",
            content = @Content(schema = @Schema(implementation = ProblemDetail.class)))
    })
    public ApiResponse<AdminAssetAuditResponse> audit(@PathVariable("asset_id") Long assetId,
                                                      @Valid @RequestBody AdminAssetUpdateRequest request) {
        return ApiResponse.success(mediaService.auditAsset(assetId, request));
    }
}
