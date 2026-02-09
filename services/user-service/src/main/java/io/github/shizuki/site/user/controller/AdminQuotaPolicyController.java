package io.github.shizuki.site.user.controller;

import io.github.shizuki.common.audit.annotation.AuditLog;
import io.github.shizuki.common.core.response.ApiResponse;
import io.github.shizuki.common.security.annotation.RequireGroup;
import io.github.shizuki.site.user.dto.QuotaPolicyDto;
import io.github.shizuki.site.user.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/admin/group-quota-policies")
@RequireGroup("ADMIN")
@Tag(name = "Admin Quota", description = "管理员分组配额策略管理接口")
public class AdminQuotaPolicyController {

    private final UserService userService;

    public AdminQuotaPolicyController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    @Operation(summary = "查询配额策略列表", description = "按策略 ID 排序返回所有分组配额规则")
    public ApiResponse<List<QuotaPolicyDto>> list() {
        return ApiResponse.success(userService.listQuotaPolicies());
    }

    @PutMapping("/{policy_id}")
    @AuditLog(action = "quota.policy.update", resource = "group_quota_policy")
    @Operation(summary = "更新配额策略", description = "按 policy_id 更新分组配额值")
    public ApiResponse<QuotaPolicyDto> update(@PathVariable("policy_id") String policyId,
                                              @Valid @RequestBody QuotaPolicyDto request) {
        return ApiResponse.success(userService.updateQuotaPolicy(policyId, request));
    }
}
