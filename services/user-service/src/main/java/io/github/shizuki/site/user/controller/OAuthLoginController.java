package io.github.shizuki.site.user.controller;

import io.github.shizuki.common.audit.annotation.AuditLog;
import io.github.shizuki.common.core.response.ApiResponse;
import io.github.shizuki.common.ratelimit.annotation.RateLimit;
import io.github.shizuki.site.user.dto.OAuthLoginCreateRequest;
import io.github.shizuki.site.user.dto.OAuthLoginCreateResponse;
import io.github.shizuki.site.user.dto.OAuthTokenExchangeRequest;
import io.github.shizuki.site.user.service.UserService;
import jakarta.validation.Valid;
import java.util.Map;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/oauth-logins")
public class OAuthLoginController {

    private final UserService userFacade;

    public OAuthLoginController(UserService userFacade) {
        this.userFacade = userFacade;
    }

    @PostMapping
    @RateLimit(key = "oauth-login-create", limit = 20, windowSeconds = 60)
    public ApiResponse<OAuthLoginCreateResponse> create(@Valid @RequestBody OAuthLoginCreateRequest request) {
        return ApiResponse.success(userFacade.createOAuthLogin(request));
    }

    @PostMapping("/{oauth_login_id}/tokens")
    @AuditLog(action = "oauth.token.exchange", resource = "oauth_logins")
    public ApiResponse<Map<String, String>> exchange(@PathVariable("oauth_login_id") String oauthLoginId,
                                                     @Valid @RequestBody OAuthTokenExchangeRequest request) {
        String token = userFacade.exchangeOAuthToken(oauthLoginId, request.getCode(), request.getState());
        return ApiResponse.success(Map.of("token", token, "authorization", "Bearer " + token));
    }
}
