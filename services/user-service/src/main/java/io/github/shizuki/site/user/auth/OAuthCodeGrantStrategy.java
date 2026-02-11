package io.github.shizuki.site.user.auth;

import io.github.shizuki.site.user.service.auth.AuthFlowService;
import org.springframework.stereotype.Component;

@Component
public class OAuthCodeGrantStrategy implements AuthGrantStrategy {

    private final AuthFlowService authFlowService;

    public OAuthCodeGrantStrategy(AuthFlowService authFlowService) {
        this.authFlowService = authFlowService;
    }

    @Override
    public boolean supports(AuthGrantType type) {
        return type == AuthGrantType.OAUTH_CODE;
    }

    @Override
    public AuthGrantResult grant(AuthGrantCommand command) {
        return authFlowService.grantByOAuthCode(command);
    }
}

