package io.github.shizuki.site.media.controller;

import io.github.shizuki.common.audit.annotation.AuditLog;
import io.github.shizuki.common.core.response.ApiResponse;
import io.github.shizuki.common.security.annotation.RequireGroup;
import io.github.shizuki.site.media.service.MediaService;
import java.util.Map;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/admin/assets")
@RequireGroup("ADMIN")
public class AdminAssetController {

    private final MediaService mediaFacade;

    public AdminAssetController(MediaService mediaFacade) {
        this.mediaFacade = mediaFacade;
    }

    @PutMapping("/{asset_id}/audit-status")
    @AuditLog(action = "asset.audit", resource = "asset")
    public ApiResponse<Map<String, Object>> audit(@PathVariable("asset_id") Long assetId,
                                                  @RequestParam("audit_status") String auditStatus) {
        return ApiResponse.success(mediaFacade.auditAsset(assetId, auditStatus));
    }
}
