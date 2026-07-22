package io.github.shizuki.site.monolith.controller;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.common.core.response.ApiResponse;
import io.github.shizuki.common.security.annotation.RequireGroup;
import io.github.shizuki.common.security.context.LoginUserContext;
import io.github.shizuki.common.security.model.LoginUser;
import io.github.shizuki.site.admin.request.MeguriPromptCacheMetricsRequest;
import io.github.shizuki.site.admin.response.AdminPromptCacheMetricsResponse;
import io.github.shizuki.site.admin.response.MeguriPromptCacheIngestResponse;
import io.github.shizuki.site.monolith.ops.MeguriPromptCacheMetricsService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Tag(name = "Meguri Prompt Cache Metrics", description = "Internal ingest and admin-only cache telemetry")
public class MeguriPromptCacheMetricsController {
    private final MeguriPromptCacheMetricsService metricsService;

    public MeguriPromptCacheMetricsController(MeguriPromptCacheMetricsService metricsService) {
        this.metricsService = metricsService;
    }

    @PostMapping("/api/v1/internal/meguri/prompt-cache")
    @Operation(summary = "Ingest one authenticated Meguri metrics snapshot")
    public ApiResponse<MeguriPromptCacheIngestResponse> ingest(
        @RequestHeader(value = "X-Meguri-Metrics-Token", required = false) String token,
        @Valid @RequestBody MeguriPromptCacheMetricsRequest request) {
        return ApiResponse.success(metricsService.ingest(request, token));
    }

    @GetMapping("/api/v1/admin/ops/meguri/prompt-cache")
    @RequireGroup("ADMIN")
    @Operation(summary = "Read the latest Meguri prompt-cache snapshot")
    public ApiResponse<AdminPromptCacheMetricsResponse> latest() {
        requireAdminContext();
        return ApiResponse.success(metricsService.latest());
    }

    private void requireAdminContext() {
        LoginUser loginUser = LoginUserContext.get().orElse(null);
        if (loginUser == null || loginUser.getUserId() == null) {
            throw new BusinessException(ErrorCode.UNAUTHORIZED, "Login required");
        }
        boolean admin = loginUser.getGroups().stream().anyMatch(group -> "ADMIN".equalsIgnoreCase(group));
        if (!admin) {
            throw new BusinessException(ErrorCode.FORBIDDEN, "Group required: ADMIN");
        }
    }
}
