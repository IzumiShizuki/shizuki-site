package io.github.shizuki.site.media.service;

import io.github.shizuki.site.media.dto.AssetCreateRequest;
import io.github.shizuki.site.media.dto.UploadPolicyRequest;
import io.github.shizuki.site.media.dto.UploadPolicyResponse;
import java.util.Map;

public interface MediaService {

    /**
     * 创建客户端上传策略（直传 OSS）。
     */
    UploadPolicyResponse createUploadPolicy(UploadPolicyRequest request);

    /**
     * 创建资源元数据记录。
     */
    Map<String, Object> createAsset(AssetCreateRequest request);

    /**
     * 生成资源下载地址。
     */
    Map<String, Object> createDownloadUrl(Long assetId);

    /**
     * 举报资源。
     */
    Map<String, Object> reportAsset(Long assetId);

    /**
     * 审核资源状态。
     */
    Map<String, Object> auditAsset(Long assetId, String auditStatus);
}
