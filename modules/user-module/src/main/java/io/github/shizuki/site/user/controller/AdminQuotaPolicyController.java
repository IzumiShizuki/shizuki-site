package io.github.shizuki.site.user.controller;

import io.github.shizuki.common.audit.annotation.AuditLog;
import io.github.shizuki.common.core.response.ApiResponse;
import io.github.shizuki.common.security.annotation.RequireGroup;
import io.github.shizuki.site.user.dto.QuotaPolicyBatchUpsertRequest;
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

/**
 * 管理员分组配额策略控制器。
 *
 * <p>负责维护“用户分组 -> 配额策略”的后台配置能力，仅允许 ADMIN 组访问。
 */
@RestController
@RequestMapping("/api/v1/admin/group-quota-policies")
@RequireGroup("ADMIN")
@Tag(name = "Admin Quota", description = "管理员分组配额策略管理接口")
public class AdminQuotaPolicyController {

    /**
     * 用户域服务，承载配额策略查询与更新的业务逻辑。
     */
    private final UserService userService;

    /**
     * 构造管理员配额策略控制器。
     *
     * @param userService 用户域服务
     */
    public AdminQuotaPolicyController(UserService userService) {
        this.userService = userService;
    }

    /**
     * 查询当前系统全部分组配额策略。
     *
     * @return 配额策略列表，按策略 ID 升序返回
     */
    @GetMapping
    @Operation(summary = "查询配额策略列表", description = "按策略 ID 排序返回所有分组配额规则")
    public ApiResponse<List<QuotaPolicyDto>> list() {
        return ApiResponse.success(userService.listQuotaPolicies());
    }

    /**
     * 更新单条分组配额策略。
     *
     * @param policyId 路径参数，策略唯一标识（如 {@code ai_round_total}）
     * @param request 请求体，包含分组策略的新配额配置
     * @return 更新后的配额策略
     */
    @PutMapping("/{policy_id}")
    @AuditLog(action = "quota.policy.update", resource = "group_quota_policy")
    @Operation(summary = "更新配额策略", description = "按 policy_id 更新分组配额值")
    public ApiResponse<QuotaPolicyDto> update(@PathVariable("policy_id") String policyId,
                                              @Valid @RequestBody QuotaPolicyDto request) {
        return ApiResponse.success(userService.updateQuotaPolicy(policyId, request));
    }

    /**
     * 批量创建/更新分组配额策略。
     *
     * <p>用于后台“参数中心”一次提交 AI 次数、音乐次数、上传容量等多类指标。
     */
    @PutMapping("/batch-upsert")
    @AuditLog(action = "quota.policy.batch_upsert", resource = "group_quota_policy")
    @Operation(summary = "批量创建或更新配额策略", description = "按 policy_id 或 group_code+quota_code upsert")
    public ApiResponse<List<QuotaPolicyDto>> batchUpsert(@Valid @RequestBody QuotaPolicyBatchUpsertRequest request) {
        return ApiResponse.success(userService.batchUpsertQuotaPolicies(request.getItems()));
    }
}
