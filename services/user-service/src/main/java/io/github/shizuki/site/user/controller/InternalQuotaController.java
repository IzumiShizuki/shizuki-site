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

@RestController
@RequestMapping("/api/v1/internal/quotas")
@Tag(name = "Internal Quota", description = "服务间调用的配额解析接口")
public class InternalQuotaController {

    private final UserService userFacade;

    public InternalQuotaController(UserService userFacade) {
        this.userFacade = userFacade;
    }

    @GetMapping("/resolve")
    @Operation(summary = "解析分组配额", description = "根据 quota_code + group_codes 返回最终生效额度")
    public ApiResponse<QuotaResolveResponse> resolve(@RequestParam("quota_code") String quotaCode,
                                                     @RequestParam(value = "group_codes", required = false) String groupCodes,
                                                     @RequestParam(value = "default_value", required = false, defaultValue = "5") Long defaultValue) {
        Set<String> groups = parseGroupCodes(groupCodes);
        Long value = userFacade.resolveQuota(quotaCode, groups, defaultValue);
        return ApiResponse.success(new QuotaResolveResponse(quotaCode, value));
    }

    private Set<String> parseGroupCodes(String groupCodes) {
        if (!StringUtils.hasText(groupCodes)) {
            return Set.of();
        }
        return Arrays.stream(groupCodes.split(","))
            .map(String::trim)
            .filter(StringUtils::hasText)
            .collect(Collectors.toSet());
    }
}
