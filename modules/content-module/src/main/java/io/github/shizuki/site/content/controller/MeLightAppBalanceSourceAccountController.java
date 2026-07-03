package io.github.shizuki.site.content.controller;

import io.github.shizuki.common.core.response.ApiResponse;
import io.github.shizuki.common.security.context.LoginUserContext;
import io.github.shizuki.site.content.request.LightAppBalanceLocalSyncUploadRequest;
import io.github.shizuki.site.content.request.LightAppBalanceSourceAccountUpsertRequest;
import io.github.shizuki.site.content.response.LightAppBalanceBindSessionCreateResponse;
import io.github.shizuki.site.content.response.LightAppBalanceBindSessionStatusResponse;
import io.github.shizuki.site.content.response.LightAppBalanceImportJobResponse;
import io.github.shizuki.site.content.response.LightAppBalanceSourceAccountStatusResponse;
import io.github.shizuki.site.content.service.LightAppBalanceBillSyncService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/me/balance")
@Tag(name = "Me LightApp Balance Source Account", description = "当前用户轻应用记账数据源与同步接口")
public class MeLightAppBalanceSourceAccountController {

    private final LightAppBalanceBillSyncService billSyncService;

    public MeLightAppBalanceSourceAccountController(LightAppBalanceBillSyncService billSyncService) {
        this.billSyncService = billSyncService;
    }

    @GetMapping("/source-accounts/status")
    @Operation(summary = "查询记账数据源状态")
    public ApiResponse<List<LightAppBalanceSourceAccountStatusResponse>> listSourceAccountsStatus() {
        return ApiResponse.success(billSyncService.listSourceAccountStatus(currentUserId()));
    }

    @PutMapping("/source-accounts/{provider}")
    @Operation(summary = "更新记账数据源配置")
    public ApiResponse<LightAppBalanceSourceAccountStatusResponse> updateSourceAccount(@PathVariable("provider") String provider,
                                                                                       @Valid @RequestBody(required = false)
                                                                                       LightAppBalanceSourceAccountUpsertRequest request) {
        return ApiResponse.success(billSyncService.upsertSourceAccount(currentUserId(), provider, request));
    }

    @PostMapping("/source-accounts/{provider}/bind-sessions")
    @Operation(summary = "创建记账数据源绑定会话")
    public ApiResponse<LightAppBalanceBindSessionCreateResponse> createBindSession(@PathVariable("provider") String provider,
                                                                                   @Valid @RequestBody(required = false)
                                                                                   LightAppBalanceSourceAccountUpsertRequest request) {
        return ApiResponse.success(billSyncService.createBindSession(currentUserId(), provider, request));
    }

    @GetMapping("/source-accounts/{provider}/bind-sessions/{sessionId}")
    @Operation(summary = "查询记账数据源绑定会话状态")
    public ApiResponse<LightAppBalanceBindSessionStatusResponse> getBindSession(@PathVariable("provider") String provider,
                                                                                @PathVariable("sessionId") String sessionId) {
        return ApiResponse.success(billSyncService.getBindSessionStatus(currentUserId(), provider, sessionId));
    }

    @PostMapping("/source-accounts/{provider}/sync-now")
    @Operation(summary = "立即执行一次账单同步")
    public ApiResponse<LightAppBalanceImportJobResponse> syncNow(@PathVariable("provider") String provider) {
        return ApiResponse.success(billSyncService.createSyncJob(currentUserId(), provider));
    }

    @PostMapping("/source-accounts/{provider}/local-sync")
    public ApiResponse<LightAppBalanceImportJobResponse> localSync(@PathVariable("provider") String provider,
                                                                   @Valid @RequestBody
                                                                   LightAppBalanceLocalSyncUploadRequest request) {
        return ApiResponse.success(billSyncService.createLocalSyncJob(currentUserId(), provider, request));
    }

    @GetMapping("/import-jobs/{jobId}")
    @Operation(summary = "查询账单导入作业状态")
    public ApiResponse<LightAppBalanceImportJobResponse> getImportJob(@PathVariable("jobId") Long jobId) {
        return ApiResponse.success(billSyncService.getImportJob(currentUserId(), jobId));
    }

    private Long currentUserId() {
        return LoginUserContext.get().map(user -> user.getUserId()).orElse(0L);
    }
}
