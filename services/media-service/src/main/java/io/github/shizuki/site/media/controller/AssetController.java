package io.github.shizuki.site.media.controller;

import io.github.shizuki.common.audit.annotation.AuditLog;
import io.github.shizuki.common.core.response.ApiResponse;
import io.github.shizuki.common.ratelimit.annotation.RateLimit;
import io.github.shizuki.site.media.dto.AssetCreateRequest;
import io.github.shizuki.site.media.dto.AssetCreateResponse;
import io.github.shizuki.site.media.dto.AssetDownloadResponse;
import io.github.shizuki.site.media.dto.AssetReportResponse;
import io.github.shizuki.site.media.dto.PublicHomeRoleResponse;
import io.github.shizuki.site.media.dto.UploadPolicyRequest;
import io.github.shizuki.site.media.dto.UploadPolicyResponse;
import io.github.shizuki.site.media.service.MediaService;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import java.util.List;
import org.springframework.http.ProblemDetail;
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

    /**
     * 媒体域服务，封装上传策略、资产落库、下载链接与公开角色池查询。
     */
    private final MediaService mediaService;

    /**
     * 构造媒体资源控制器。
     *
     * @param mediaService 媒体域服务
     */
    public AssetController(MediaService mediaService) {
        this.mediaService = mediaService;
    }

    /**
     * 生成前端直传策略。
     *
     * @param request 上传策略请求体，包含文件名、类型、资源类别与可见性
     * @return 包含 bucket/key/上传地址/过期时间 的策略对象
     */
    @PostMapping("/upload-policies")
    @RateLimit(key = "assets.upload-policy", limit = 30, windowSeconds = 60)
    @AuditLog(action = "asset.upload.policy.create", resource = "asset")
    @Operation(summary = "生成上传策略", description = "生成前端直传 OSS 所需的 bucket/key/签名")
    @ApiResponses({
        @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "200", description = "上传策略创建成功"),
        @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "400", description = "请求参数错误",
            content = @Content(schema = @Schema(implementation = ProblemDetail.class))),
        @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "401", description = "未登录",
            content = @Content(schema = @Schema(implementation = ProblemDetail.class))),
        @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "429", description = "请求频率超限",
            content = @Content(schema = @Schema(implementation = ProblemDetail.class)))
    })
    public ApiResponse<UploadPolicyResponse> createUploadPolicy(@Valid @RequestBody UploadPolicyRequest request) {
        return ApiResponse.success(mediaService.createUploadPolicy(request));
    }

    /**
     * 创建资产元数据记录。
     *
     * @param request 资产创建请求，要求客户端已完成对象存储上传
     * @return 资产主键与当前审核状态等信息
     */
    @PostMapping
    @RateLimit(key = "assets.create", limit = 20, windowSeconds = 60)
    @AuditLog(action = "asset.create", resource = "asset")
    @Operation(summary = "创建资源记录", description = "上传完成后写入资源元数据")
    @ApiResponses({
        @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "200", description = "资源创建成功"),
        @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "400", description = "请求参数错误或校验失败",
            content = @Content(schema = @Schema(implementation = ProblemDetail.class))),
        @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "401", description = "未登录",
            content = @Content(schema = @Schema(implementation = ProblemDetail.class))),
        @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "429", description = "请求频率超限",
            content = @Content(schema = @Schema(implementation = ProblemDetail.class)))
    })
    public ApiResponse<AssetCreateResponse> createAsset(@Valid @RequestBody AssetCreateRequest request) {
        return ApiResponse.success(mediaService.createAsset(request));
    }

    /**
     * 生成资源下载地址。
     *
     * @param assetId 资源 ID
     * @return 公开资源返回直链，私有资源返回带时效签名 URL
     */
    @GetMapping("/{asset_id}/download-url")
    @RateLimit(key = "assets.download-url", limit = 120, windowSeconds = 60)
    @Operation(summary = "生成下载地址", description = "根据资源 ID 生成带时效的下载 URL")
    @ApiResponses({
        @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "200", description = "下载地址生成成功"),
        @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "403", description = "无权限访问资源",
            content = @Content(schema = @Schema(implementation = ProblemDetail.class))),
        @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "404", description = "资源不存在",
            content = @Content(schema = @Schema(implementation = ProblemDetail.class))),
        @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "429", description = "请求频率超限",
            content = @Content(schema = @Schema(implementation = ProblemDetail.class)))
    })
    public ApiResponse<AssetDownloadResponse> downloadUrl(@PathVariable("asset_id") Long assetId) {
        return ApiResponse.success(mediaService.createDownloadUrl(assetId));
    }

    /**
     * 查询首页公开角色池（游客可访问）。
     *
     * @return 首页角色列表，包含资源类型、封面链接与排序号
     */
    @GetMapping("/public/home-roles")
    @RateLimit(key = "assets.public.home-roles", limit = 60, windowSeconds = 60)
    @Operation(summary = "查询首页公开角色池", description = "返回游客首页可用的公开角色资源")
    @ApiResponses({
        @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "200", description = "查询成功"),
        @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "429", description = "请求频率超限",
            content = @Content(schema = @Schema(implementation = ProblemDetail.class)))
    })
    public ApiResponse<List<PublicHomeRoleResponse>> listPublicHomeRoles() {
        return ApiResponse.success(mediaService.listPublicHomeRoles());
    }

    /**
     * 举报指定资源。
     *
     * @param assetId 资源 ID
     * @return 举报单创建结果
     */
    @PostMapping("/{asset_id}/reports")
    @RateLimit(key = "assets.report", limit = 20, windowSeconds = 60)
    @AuditLog(action = "asset.report.create", resource = "asset_report")
    @Operation(summary = "举报资源", description = "提交资源违规举报工单")
    @ApiResponses({
        @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "200", description = "举报创建成功"),
        @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "401", description = "未登录",
            content = @Content(schema = @Schema(implementation = ProblemDetail.class))),
        @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "404", description = "资源不存在",
            content = @Content(schema = @Schema(implementation = ProblemDetail.class))),
        @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "429", description = "请求频率超限",
            content = @Content(schema = @Schema(implementation = ProblemDetail.class)))
    })
    public ApiResponse<AssetReportResponse> report(@PathVariable("asset_id") Long assetId) {
        return ApiResponse.success(mediaService.reportAsset(assetId));
    }

}
