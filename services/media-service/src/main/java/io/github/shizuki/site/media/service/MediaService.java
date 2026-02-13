package io.github.shizuki.site.media.service;

import io.github.shizuki.site.media.dto.AdminAssetUpdateRequest;
import io.github.shizuki.site.media.dto.AdminAssetAuditResponse;
import io.github.shizuki.site.media.dto.AssetCreateRequest;
import io.github.shizuki.site.media.dto.AssetCreateResponse;
import io.github.shizuki.site.media.dto.AssetDownloadResponse;
import io.github.shizuki.site.media.dto.AssetReportResponse;
import io.github.shizuki.site.media.dto.PublicHomeRoleResponse;
import io.github.shizuki.site.media.dto.UploadPolicyRequest;
import io.github.shizuki.site.media.dto.UploadPolicyResponse;
import java.util.List;

public interface MediaService {

    /**
     * 创建客户端上传策略（直传 OSS）。
     *
     * @param request 上传策略请求，包含资源类型、可见性与 content-type
     * @return 直传策略（bucket/key/签名 URL 等）
     */
    UploadPolicyResponse createUploadPolicy(UploadPolicyRequest request);

    /**
     * 创建资源元数据记录。
     *
     * @param request 资产创建请求
     * @return 资产创建结果（资产 ID、审核状态、类型等）
     */
    AssetCreateResponse createAsset(AssetCreateRequest request);

    /**
     * 生成资源下载地址。
     *
     * @param assetId 资源主键
     * @return 公开直链或私有签名下载链接
     */
    AssetDownloadResponse createDownloadUrl(Long assetId);

    /**
     * 举报资源。
     *
     * @param assetId 资源主键
     * @return 举报单创建结果
     */
    AssetReportResponse reportAsset(Long assetId);

    /**
     * 审核资源状态。
     *
     * @param assetId 资源主键
     * @param request 审核更新参数
     * @return 审核更新结果
     */
    AdminAssetAuditResponse auditAsset(Long assetId, AdminAssetUpdateRequest request);

    /**
     * 查询首页公开角色池。
     *
     * @return 公开角色列表（游客可访问）
     */
    List<PublicHomeRoleResponse> listPublicHomeRoles();
}
