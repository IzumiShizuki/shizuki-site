package io.github.shizuki.site.user.controller;

import io.github.shizuki.common.audit.annotation.AuditLog;
import io.github.shizuki.common.core.response.ApiResponse;
import io.github.shizuki.common.ratelimit.annotation.RateLimit;
import io.github.shizuki.site.user.dto.OAuthLoginCreateRequest;
import io.github.shizuki.site.user.dto.OAuthLoginCreateResponse;
import io.github.shizuki.site.user.dto.OAuthTokenExchangeRequest;
import io.github.shizuki.site.user.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import java.util.Map;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/oauth-logins")
@Tag(name = "OAuth", description = "第三方 OAuth 登录流程接口")
public class OAuthLoginController {

    private final UserService userFacade;

    public OAuthLoginController(UserService userFacade) {
        this.userFacade = userFacade;
    }

    @PostMapping
    @RateLimit(key = "oauth-login-create", limit = 20, windowSeconds = 60)
    @Operation(summary = "创建 OAuth 登录", description = "生成 oauth_login_id、state 和 GitHub 授权地址")
    public ApiResponse<OAuthLoginCreateResponse> create(@Valid @RequestBody OAuthLoginCreateRequest request) {
        return ApiResponse.success(userFacade.createOAuthLogin(request));
    }

    @PostMapping("/{oauth_login_id}/tokens")
    @AuditLog(action = "oauth.token.exchange", resource = "oauth_logins")
    @Operation(summary = "OAuth code 换 token", description = "校验 state 并换取本地登录态 token")
    public ApiResponse<Map<String, String>> exchange(@PathVariable("oauth_login_id") String oauthLoginId,
                                                     @Valid @RequestBody OAuthTokenExchangeRequest request) {
        String token = userFacade.exchangeOAuthToken(oauthLoginId, request.getCode(), request.getState());
        return ApiResponse.success(Map.of("token", token, "authorization", "Bearer " + token));
    }
}
