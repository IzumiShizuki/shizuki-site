package io.github.shizuki.site.user.auth;

import io.github.shizuki.site.user.service.auth.AuthFlowService;
import org.springframework.stereotype.Component;

@Component
public class RefreshTokenGrantStrategy implements AuthGrantStrategy {

    private final AuthFlowService authFlowService;

    public RefreshTokenGrantStrategy(AuthFlowService authFlowService) {
        this.authFlowService = authFlowService;
    }

    @Override
    public boolean supports(AuthGrantType type) {
        return type == AuthGrantType.REFRESH_TOKEN;
    }

    @Override
    public AuthGrantResult grant(AuthGrantCommand command) {
        return authFlowService.grantByRefreshToken(command);
    }
}

