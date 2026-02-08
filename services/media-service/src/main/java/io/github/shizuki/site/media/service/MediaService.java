package io.github.shizuki.site.media.service;

import io.github.shizuki.site.media.dto.AssetCreateRequest;
import io.github.shizuki.site.media.dto.UploadPolicyRequest;
import io.github.shizuki.site.media.dto.UploadPolicyResponse;
import java.util.Map;

public interface MediaService {

    UploadPolicyResponse createUploadPolicy(UploadPolicyRequest request);

    Map<String, Object> createAsset(AssetCreateRequest request);

    Map<String, Object> createDownloadUrl(Long assetId);

    Map<String, Object> reportAsset(Long assetId);

    Map<String, Object> auditAsset(Long assetId, String auditStatus);
}
