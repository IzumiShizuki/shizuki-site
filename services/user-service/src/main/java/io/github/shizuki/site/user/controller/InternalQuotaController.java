package io.github.shizuki.site.user.controller;

import io.github.shizuki.common.core.response.ApiResponse;
import io.github.shizuki.site.user.dto.auth.QuotaResolveResponse;
import io.github.shizuki.site.user.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 内部配额解析控制器。
 *
 * <p>提供服务间调用接口，根据 quota_code 与 group_codes 解析最终生效配额。
 */
@RestController
@RequestMapping("/api/v1/internal/quotas")
@Tag(name = "Internal Quota", description = "服务间调用的配额解析接口")
public class InternalQuotaController {

    /**
     * 用户域服务，承载配额规则解析逻辑。
     */
    private final UserService userService;

    /**
     * 构造内部配额解析控制器。
     *
     * @param userService 用户域服务
     */
    public InternalQuotaController(UserService userService) {
        this.userService = userService;
    }

    /**
     * 解析指定 quota_code 在目标分组集合下的生效额度。
     *
     * @param quotaCode 配额编码，例如 {@code ai_round_total}
     * @param groupCodes 分组编码列表，逗号分隔（可空，表示游客/无分组）
     * @param defaultValue 默认配额值，当找不到策略时兜底返回
     * @return 配额解析结果
     */
    @GetMapping("/resolve")
    @Operation(summary = "解析分组配额", description = "根据 quota_code + group_codes 返回最终生效额度")
    public ApiResponse<QuotaResolveResponse> resolve(@RequestParam("quota_code") String quotaCode,
                                                     @RequestParam(value = "group_codes", required = false) String groupCodes,
                                                     @RequestParam(value = "default_value", required = false, defaultValue = "5") Long defaultValue) {
        Set<String> groups = parseGroupCodes(groupCodes);
        Long value = userService.resolveQuota(quotaCode, groups, defaultValue);
        return ApiResponse.success(new QuotaResolveResponse(quotaCode, value));
    }

    /**
     * 解析并清洗逗号分隔分组字符串。
     *
     * @param groupCodes 原始分组字符串
     * @return 去重、去空白后的分组集合
     */
    private Set<String> parseGroupCodes(String groupCodes) {
        if (!StringUtils.hasText(groupCodes)) {
            // 空值统一归一为无分组集合，避免下游处理 null 分支。
            return Set.of();
        }
        // 关键逻辑：去除多余空白和空元素，防止 "USER, ,ADMIN" 这类脏参数影响配额解析。
        return Arrays.stream(groupCodes.split(","))
            .map(String::trim)
            .filter(StringUtils::hasText)
            .collect(Collectors.toSet());
    }
}
