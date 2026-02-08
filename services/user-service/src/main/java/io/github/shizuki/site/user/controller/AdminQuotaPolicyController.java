package io.github.shizuki.site.user.controller;

import io.github.shizuki.common.audit.annotation.AuditLog;
import io.github.shizuki.common.core.response.ApiResponse;
import io.github.shizuki.common.security.annotation.RequireGroup;
import io.github.shizuki.site.user.dto.QuotaPolicyDto;
import io.github.shizuki.site.user.service.UserService;
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
public class AdminQuotaPolicyController {

    private final UserService userFacade;

    public AdminQuotaPolicyController(UserService userFacade) {
        this.userFacade = userFacade;
    }

    @GetMapping
    public ApiResponse<List<QuotaPolicyDto>> list() {
        return ApiResponse.success(userFacade.listQuotaPolicies());
    }

    @PutMapping("/{policy_id}")
    @AuditLog(action = "quota.policy.update", resource = "group_quota_policy")
    public ApiResponse<QuotaPolicyDto> update(@PathVariable("policy_id") String policyId,
                                              @Valid @RequestBody QuotaPolicyDto request) {
        return ApiResponse.success(userFacade.updateQuotaPolicy(policyId, request));
    }
}
